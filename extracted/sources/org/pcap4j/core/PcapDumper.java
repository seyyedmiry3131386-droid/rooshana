package org.pcap4j.core;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import java.io.Closeable;
import java.sql.Timestamp;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapDumper implements Closeable {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapDumper.class);
    private final Pointer dumper;
    private final ReentrantReadWriteLock dumperLock = new ReentrantReadWriteLock(true);
    private volatile boolean open = true;
    private final PcapHandle.TimestampPrecision timestampPrecision;

    /* JADX INFO: renamed from: org.pcap4j.core.PcapDumper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision;

        static {
            int[] iArr = new int[PcapHandle.TimestampPrecision.values().length];
            $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision = iArr;
            try {
                iArr[PcapHandle.TimestampPrecision.MICRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[PcapHandle.TimestampPrecision.NANO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PcapDumper(Pointer pointer, PcapHandle.TimestampPrecision timestampPrecision) {
        this.timestampPrecision = timestampPrecision;
        this.dumper = pointer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.open) {
            logger.warn("Already closed.");
            return;
        }
        this.dumperLock.writeLock().lock();
        try {
            if (!this.open) {
                logger.warn("Already closed.");
                return;
            }
            this.open = false;
            this.dumperLock.writeLock().unlock();
            NativeMappings.pcap_dump_close(this.dumper);
            logger.info("Closed.");
        } finally {
            this.dumperLock.writeLock().unlock();
        }
    }

    public void dump(Packet packet) throws NotOpenException {
        dump(packet, new Timestamp(System.currentTimeMillis()));
    }

    public void dumpRaw(byte[] bArr) throws NotOpenException {
        dumpRaw(bArr, new Timestamp(System.currentTimeMillis()));
    }

    public void flush() throws PcapNativeException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int iPcap_dump_flush = NativeMappings.pcap_dump_flush(this.dumper);
            if (iPcap_dump_flush < 0) {
                throw new PcapNativeException("Failed to flush.", Integer.valueOf(iPcap_dump_flush));
            }
        } finally {
            this.dumperLock.readLock().unlock();
        }
    }

    public long ftell() throws PcapNativeException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeLong nativeLongPcap_dump_ftell = NativeMappings.pcap_dump_ftell(this.dumper);
            this.dumperLock.readLock().unlock();
            long j = nativeLongPcap_dump_ftell.c;
            if (j >= 0) {
                return j;
            }
            throw new PcapNativeException("Failed to get the file position.");
        } catch (Throwable th) {
            this.dumperLock.readLock().unlock();
            throw th;
        }
    }

    public Pointer getDumper() {
        return this.dumper;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void dump(Packet packet, Timestamp timestamp) throws NotOpenException {
        if (packet == null || timestamp == null) {
            throw new NullPointerException("packet: " + packet + " ts: " + timestamp);
        }
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Dumping a packet: " + packet);
        }
        dumpRaw(packet.getRawData(), timestamp);
    }

    public void dumpRaw(byte[] bArr, Timestamp timestamp) throws NotOpenException {
        if (bArr == null || timestamp == null) {
            throw new NullPointerException("packet: " + bArr + " timestamp: " + timestamp);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.pcap_pkthdr pcap_pkthdrVar = new NativeMappings.pcap_pkthdr();
        int length = bArr.length;
        pcap_pkthdrVar.caplen = length;
        pcap_pkthdrVar.len = length;
        NativeMappings.timeval timevalVar = new NativeMappings.timeval();
        pcap_pkthdrVar.ts = timevalVar;
        timevalVar.tv_sec = new NativeLong(timestamp.getTime() / 1000);
        int i = AnonymousClass1.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[this.timestampPrecision.ordinal()];
        if (i == 1) {
            pcap_pkthdrVar.ts.tv_usec = new NativeLong(((long) timestamp.getNanos()) / 1000);
        } else {
            if (i != 2) {
                throw new AssertionError("Never get here.");
            }
            pcap_pkthdrVar.ts.tv_usec = new NativeLong(timestamp.getNanos());
        }
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.pcap_dump(this.dumper, pcap_pkthdrVar, bArr);
            this.dumperLock.readLock().unlock();
            Logger logger2 = logger;
            if (logger2.isDebugEnabled()) {
                logger2.debug("Dumped a packet: " + ByteArrays.toHexString(bArr, " "));
            }
        } catch (Throwable th) {
            this.dumperLock.readLock().unlock();
            throw th;
        }
    }
}
