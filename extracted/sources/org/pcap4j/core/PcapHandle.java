package org.pcap4j.core;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import defpackage.dw1;
import defpackage.m96;
import defpackage.o40;
import java.io.Closeable;
import java.io.EOFException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapHandle implements Closeable {
    public static final Inet4Address PCAP_NETMASK_UNKNOWN;
    private volatile DataLinkType dlt;
    private volatile String filteringExpression;
    private final Pointer handle;
    private final ReentrantReadWriteLock handleLock;
    private volatile boolean open;
    private final ThreadLocal<Integer> originalLengths;
    private final TimestampPrecision timestampPrecision;
    private final ThreadLocal<Timestamp> timestamps;
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapHandle.class);
    private static final Object compileLock = new Object();

    /* JADX INFO: renamed from: org.pcap4j.core.PcapHandle$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision;

        static {
            int[] iArr = new int[TimestampPrecision.values().length];
            $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision = iArr;
            try {
                iArr[TimestampPrecision.MICRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[TimestampPrecision.NANO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum BlockingMode {
        BLOCKING(0),
        NONBLOCKING(1);

        private final int value;

        BlockingMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static final class Builder {
        private int bufferSize;
        private final String deviceName;
        private boolean immediateMode;
        private boolean rfmon;
        private int snaplen;
        private int timeoutMillis;
        private boolean isSnaplenSet = false;
        private PcapNetworkInterface.PromiscuousMode promiscuousMode = null;
        private boolean isRfmonSet = false;
        private boolean isTimeoutMillisSet = false;
        private boolean isBufferSizeSet = false;
        private TimestampPrecision timestampPrecision = null;
        private PcapDirection direction = null;
        private boolean isImmediateModeSet = false;

        public Builder(String str) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException(dw1.n("deviceName: ", str));
            }
            this.deviceName = str;
        }

        public Builder bufferSize(int i) {
            this.bufferSize = i;
            this.isBufferSizeSet = true;
            return this;
        }

        public PcapHandle build() throws PcapNativeException {
            return new PcapHandle(this, (AnonymousClass1) null);
        }

        public Builder direction(PcapDirection pcapDirection) {
            this.direction = pcapDirection;
            return this;
        }

        public Builder immediateMode(boolean z) {
            this.immediateMode = z;
            this.isImmediateModeSet = true;
            return this;
        }

        public Builder promiscuousMode(PcapNetworkInterface.PromiscuousMode promiscuousMode) {
            this.promiscuousMode = promiscuousMode;
            return this;
        }

        public Builder rfmon(boolean z) {
            this.rfmon = z;
            this.isRfmonSet = true;
            return this;
        }

        public Builder snaplen(int i) {
            this.snaplen = i;
            this.isSnaplenSet = true;
            return this;
        }

        public Builder timeoutMillis(int i) {
            this.timeoutMillis = i;
            this.isTimeoutMillisSet = true;
            return this;
        }

        public Builder timestampPrecision(TimestampPrecision timestampPrecision) {
            this.timestampPrecision = timestampPrecision;
            return this;
        }
    }

    public final class GotPacketFuncExecutor implements NativeMappings.pcap_handler {
        private final DataLinkType dlt;
        private final Executor executor;
        private final PacketListener listener;

        public GotPacketFuncExecutor(PacketListener packetListener, DataLinkType dataLinkType, Executor executor) {
            this.dlt = dataLinkType;
            this.listener = packetListener;
            this.executor = executor;
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_handler
        public void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            final Timestamp timestampBuildTimestamp = PcapHandle.this.buildTimestamp(pointer2);
            final int len = NativeMappings.pcap_pkthdr.getLen(pointer2);
            int caplen = NativeMappings.pcap_pkthdr.getCaplen(pointer2);
            pointer3.getClass();
            final byte[] bArr = new byte[caplen];
            pointer3.m(caplen, 0L, bArr);
            try {
                this.executor.execute(new Runnable() { // from class: org.pcap4j.core.PcapHandle.GotPacketFuncExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PcapHandle.this.timestamps.set(timestampBuildTimestamp);
                        PcapHandle.this.originalLengths.set(Integer.valueOf(len));
                        PacketListener packetListener = GotPacketFuncExecutor.this.listener;
                        PacketFactory factory = PacketFactories.getFactory(Packet.class, DataLinkType.class);
                        byte[] bArr2 = bArr;
                        packetListener.gotPacket((Packet) factory.newInstance(bArr2, 0, bArr2.length, GotPacketFuncExecutor.this.dlt));
                    }
                });
            } catch (Throwable th) {
                PcapHandle.logger.error("The executor has thrown an exception.", th);
            }
        }
    }

    public final class GotRawPacketFuncExecutor implements NativeMappings.pcap_handler {
        private final Executor executor;
        private final RawPacketListener listener;

        public GotRawPacketFuncExecutor(RawPacketListener rawPacketListener, Executor executor) {
            this.listener = rawPacketListener;
            this.executor = executor;
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_handler
        public void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            final Timestamp timestampBuildTimestamp = PcapHandle.this.buildTimestamp(pointer2);
            final int len = NativeMappings.pcap_pkthdr.getLen(pointer2);
            int caplen = NativeMappings.pcap_pkthdr.getCaplen(pointer2);
            pointer3.getClass();
            final byte[] bArr = new byte[caplen];
            pointer3.m(caplen, 0L, bArr);
            try {
                this.executor.execute(new Runnable() { // from class: org.pcap4j.core.PcapHandle.GotRawPacketFuncExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PcapHandle.this.timestamps.set(timestampBuildTimestamp);
                        PcapHandle.this.originalLengths.set(Integer.valueOf(len));
                        GotRawPacketFuncExecutor.this.listener.gotPacket(bArr);
                    }
                });
            } catch (Throwable th) {
                PcapHandle.logger.error("The executor has thrown an exception.", th);
            }
        }
    }

    public enum PcapDirection {
        INOUT(0),
        IN(1),
        OUT(2);

        private final int value;

        PcapDirection(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static final class SimpleExecutor implements Executor {
        private static final SimpleExecutor INSTANCE = new SimpleExecutor();

        private SimpleExecutor() {
        }

        public static SimpleExecutor getInstance() {
            return INSTANCE;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public enum SwappedType {
        NOT_SWAPPED(0),
        SWAPPED(1),
        MAYBE_SWAPPED(2);

        private final int value;

        SwappedType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum TimestampPrecision {
        MICRO(0),
        NANO(1);

        private final int value;

        TimestampPrecision(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        try {
            PCAP_NETMASK_UNKNOWN = (Inet4Address) InetAddress.getByName("255.255.255.255");
        } catch (UnknownHostException unused) {
            throw new AssertionError("never get here");
        }
    }

    public /* synthetic */ PcapHandle(Builder builder, AnonymousClass1 anonymousClass1) throws PcapNativeException {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Timestamp buildTimestamp(Pointer pointer) {
        Timestamp timestamp = new Timestamp(NativeMappings.pcap_pkthdr.getTvSec(pointer).c * 1000);
        int i = AnonymousClass1.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[this.timestampPrecision.ordinal()];
        if (i == 1) {
            timestamp.setNanos(((int) NativeMappings.pcap_pkthdr.getTvUsec(pointer).c) * 1000);
            return timestamp;
        }
        if (i != 2) {
            throw new AssertionError("Never get here.");
        }
        timestamp.setNanos((int) NativeMappings.pcap_pkthdr.getTvUsec(pointer).c);
        return timestamp;
    }

    private int doDispatch(int i, NativeMappings.pcap_handler pcap_handlerVar) throws PcapNativeException, InterruptedException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Logger logger2 = logger;
            logger2.info("Starting dispatch.");
            int iPcap_dispatch = NativeMappings.pcap_dispatch(this.handle, i, pcap_handlerVar, null);
            if (iPcap_dispatch >= 0) {
                this.handleLock.readLock().unlock();
                logger2.info("Finish dispatch.");
                return iPcap_dispatch;
            }
            if (iPcap_dispatch == -2) {
                logger2.info("Broken.");
                throw new InterruptedException();
            }
            if (iPcap_dispatch != -1) {
                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(iPcap_dispatch));
            }
            throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(iPcap_dispatch));
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    private void doLoop(int i, NativeMappings.pcap_handler pcap_handlerVar) throws PcapNativeException, InterruptedException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Logger logger2 = logger;
            logger2.info("Starting loop.");
            int iPcap_loop = NativeMappings.pcap_loop(this.handle, i, pcap_handlerVar, (Pointer) null);
            if (iPcap_loop == -2) {
                logger2.info("Broken.");
                throw new InterruptedException();
            }
            if (iPcap_loop == -1) {
                throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(iPcap_loop));
            }
            if (iPcap_loop == 0) {
                logger2.info("Finished loop.");
            } else {
                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(iPcap_loop));
            }
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    private DataLinkType getDltByNative() {
        return DataLinkType.getInstance(Integer.valueOf(NativeMappings.pcap_datalink(this.handle)));
    }

    public void breakLoop() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            logger.info("Break loop.");
            NativeMappings.pcap_breakloop(this.handle);
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.open) {
            logger.warn("Already closed.");
            return;
        }
        this.handleLock.writeLock().lock();
        try {
            if (!this.open) {
                logger.warn("Already closed.");
                return;
            }
            this.open = false;
            this.handleLock.writeLock().unlock();
            NativeMappings.pcap_close(this.handle);
            logger.info("Closed.");
        } finally {
            this.handleLock.writeLock().unlock();
        }
    }

    public BpfProgram compileFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) throws PcapNativeException, NotOpenException {
        int iPcap_compile;
        if (str == null || bpfCompileMode == null || inet4Address == null) {
            throw new NullPointerException("bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            synchronized (compileLock) {
                iPcap_compile = NativeMappings.pcap_compile(this.handle, bpf_programVar, str, bpfCompileMode.getValue(), ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0));
            }
            if (iPcap_compile < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(iPcap_compile));
            }
            this.handleLock.readLock().unlock();
            return new BpfProgram(bpf_programVar, str);
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public int dispatch(int i, PacketListener packetListener) throws PcapNativeException, InterruptedException, NotOpenException {
        return dispatch(i, packetListener, SimpleExecutor.getInstance());
    }

    public PcapDumper dumpOpen(String str) throws PcapNativeException, NotOpenException {
        if (str == null) {
            throw new NullPointerException("filePath must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Pointer pointerPcap_dump_open = NativeMappings.pcap_dump_open(this.handle, str);
            if (pointerPcap_dump_open == null) {
                throw new PcapNativeException(getError());
            }
            this.handleLock.readLock().unlock();
            return new PcapDumper(pointerPcap_dump_open, this.timestampPrecision);
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public BlockingMode getBlockingMode() throws PcapNativeException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int iPcap_getnonblock = NativeMappings.pcap_getnonblock(this.handle, pcapErrbuf);
            if (iPcap_getnonblock == 0) {
                return BlockingMode.BLOCKING;
            }
            if (iPcap_getnonblock > 0) {
                return BlockingMode.NONBLOCKING;
            }
            throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(iPcap_getnonblock));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public DataLinkType getDlt() {
        return this.dlt;
    }

    public String getError() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Pointer pointerPcap_geterr = NativeMappings.pcap_geterr(this.handle);
            pointerPcap_geterr.getClass();
            return pointerPcap_geterr.i(Native.g());
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public String getFilteringExpression() {
        return this.filteringExpression;
    }

    public int getMajorVersion() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_major_version(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public int getMinorVersion() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_minor_version(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Packet getNextPacket() throws NotOpenException {
        byte[] nextRawPacket = getNextRawPacket();
        if (nextRawPacket == null) {
            return null;
        }
        return (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(nextRawPacket, 0, nextRawPacket.length, this.dlt);
    }

    public Packet getNextPacketEx() throws PcapNativeException, TimeoutException, NotOpenException, EOFException {
        byte[] nextRawPacketEx = getNextRawPacketEx();
        return (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(nextRawPacketEx, 0, nextRawPacketEx.length, this.dlt);
    }

    public byte[] getNextRawPacket() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.pcap_pkthdr pcap_pkthdrVar = new NativeMappings.pcap_pkthdr();
        pcap_pkthdrVar.setAutoSynch(false);
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Pointer pointerPcap_next = NativeMappings.pcap_next(this.handle, pcap_pkthdrVar);
            if (pointerPcap_next == null) {
                return null;
            }
            Pointer pointer = pcap_pkthdrVar.getPointer();
            this.timestamps.set(buildTimestamp(pointer));
            this.originalLengths.set(Integer.valueOf(NativeMappings.pcap_pkthdr.getLen(pointer)));
            int caplen = NativeMappings.pcap_pkthdr.getCaplen(pointer);
            byte[] bArr = new byte[caplen];
            pointerPcap_next.m(caplen, 0L, bArr);
            return bArr;
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public byte[] getNextRawPacketEx() throws PcapNativeException, TimeoutException, NotOpenException, EOFException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            PointerByReference pointerByReference = new PointerByReference();
            PointerByReference pointerByReference2 = new PointerByReference();
            int iPcap_next_ex = NativeMappings.pcap_next_ex(this.handle, pointerByReference, pointerByReference2);
            if (iPcap_next_ex == -2) {
                throw new EOFException();
            }
            if (iPcap_next_ex == -1) {
                throw new PcapNativeException("Error occurred in pcap_next_ex(): " + getError(), Integer.valueOf(iPcap_next_ex));
            }
            if (iPcap_next_ex == 0) {
                throw new TimeoutException();
            }
            if (iPcap_next_ex != 1) {
                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(iPcap_next_ex));
            }
            Pointer pointerG = pointerByReference.a.g(0L);
            Pointer pointerG2 = pointerByReference2.a.g(0L);
            if (pointerG == null || pointerG2 == null) {
                throw new PcapNativeException("Failed to get packet. *header: " + pointerG + " *data: " + pointerG2);
            }
            this.timestamps.set(buildTimestamp(pointerG));
            this.originalLengths.set(Integer.valueOf(NativeMappings.pcap_pkthdr.getLen(pointerG)));
            int caplen = NativeMappings.pcap_pkthdr.getCaplen(pointerG);
            byte[] bArr = new byte[caplen];
            pointerG2.m(caplen, 0L, bArr);
            return bArr;
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Integer getOriginalLength() {
        return this.originalLengths.get();
    }

    public int getSnapshot() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_snapshot(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public PcapStat getStats() throws PcapNativeException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            if (m96.h()) {
                IntByReference intByReference = new IntByReference();
                Pointer pointerWin_pcap_stats_ex = NativeMappings.PcapLibrary.INSTANCE.win_pcap_stats_ex(this.handle, intByReference);
                if (!getError().equals("Cannot retrieve the extended statistics from a file or a TurboCap port")) {
                    if (intByReference.a.e(0L) != 24) {
                        throw new PcapNativeException(getError());
                    }
                    if (pointerWin_pcap_stats_ex != null) {
                        return new PcapStat(pointerWin_pcap_stats_ex, true);
                    }
                    throw new PcapNativeException(getError());
                }
            }
            NativeMappings.pcap_stat pcap_statVar = new NativeMappings.pcap_stat();
            pcap_statVar.setAutoSynch(false);
            int iPcap_stats = NativeMappings.pcap_stats(this.handle, pcap_statVar);
            if (iPcap_stats >= 0) {
                return new PcapStat(pcap_statVar.getPointer(), false);
            }
            throw new PcapNativeException(getError(), Integer.valueOf(iPcap_stats));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Timestamp getTimestamp() {
        return this.timestamps.get();
    }

    public TimestampPrecision getTimestampPrecision() {
        return this.timestampPrecision;
    }

    public boolean isOpen() {
        return this.open;
    }

    public SwappedType isSwapped() throws NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int iPcap_is_swapped = NativeMappings.pcap_is_swapped(this.handle);
            if (iPcap_is_swapped == 0) {
                return SwappedType.NOT_SWAPPED;
            }
            if (iPcap_is_swapped == 1) {
                return SwappedType.SWAPPED;
            }
            if (iPcap_is_swapped == 2) {
                return SwappedType.MAYBE_SWAPPED;
            }
            logger.warn("pcap_snapshot returned an unexpected code: " + iPcap_is_swapped);
            return SwappedType.MAYBE_SWAPPED;
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public List<DataLinkType> listDatalinks() throws PcapNativeException, NotOpenException {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            PointerByReference pointerByReference = new PointerByReference();
            int iPcap_list_datalinks = NativeMappings.pcap_list_datalinks(this.handle, pointerByReference);
            if (iPcap_list_datalinks < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(iPcap_list_datalinks));
            }
            Pointer pointerG = pointerByReference.a.g(0L);
            ArrayList arrayList = new ArrayList(iPcap_list_datalinks);
            pointerG.getClass();
            int[] iArr = new int[iPcap_list_datalinks];
            pointerG.r(0L, iArr, iPcap_list_datalinks);
            for (int i = 0; i < iPcap_list_datalinks; i++) {
                arrayList.add(DataLinkType.getInstance(Integer.valueOf(iArr[i])));
            }
            NativeMappings.pcap_free_datalinks(pointerG);
            this.handleLock.readLock().unlock();
            return arrayList;
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public void loop(int i, PacketListener packetListener) throws PcapNativeException, InterruptedException, NotOpenException {
        loop(i, packetListener, SimpleExecutor.getInstance());
    }

    public void sendPacket(Packet packet) throws PcapNativeException, NotOpenException {
        if (packet == null) {
            throw new NullPointerException("packet may not be null");
        }
        sendPacket(packet.getRawData());
    }

    public void setBlockingMode(BlockingMode blockingMode) throws PcapNativeException, NotOpenException {
        if (blockingMode == null) {
            throw new NullPointerException(" mode: " + blockingMode);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
            int iPcap_setnonblock = NativeMappings.pcap_setnonblock(this.handle, blockingMode.getValue(), pcapErrbuf);
            if (iPcap_setnonblock < 0) {
                throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(iPcap_setnonblock));
            }
            this.handleLock.readLock().unlock();
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public void setDirection(PcapDirection pcapDirection) throws PcapNativeException, NotOpenException {
        if (pcapDirection == null) {
            throw new NullPointerException("direction must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int iPcap_setdirection = NativeMappings.pcap_setdirection(this.handle, pcapDirection.getValue());
            if (iPcap_setdirection >= 0) {
                this.handleLock.readLock().unlock();
            } else {
                throw new PcapNativeException("Failed to set direction: " + getError(), Integer.valueOf(iPcap_setdirection));
            }
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public void setDlt(DataLinkType dataLinkType) throws PcapNativeException, NotOpenException {
        if (dataLinkType == null) {
            throw new NullPointerException("dlt must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int iPcap_set_datalink = NativeMappings.pcap_set_datalink(this.handle, dataLinkType.value().intValue());
            if (iPcap_set_datalink < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_datalink));
            }
            this.handleLock.readLock().unlock();
            this.dlt = dataLinkType;
        } catch (Throwable th) {
            this.handleLock.readLock().unlock();
            throw th;
        }
    }

    public void setFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) throws PcapNativeException, NotOpenException {
        int iPcap_compile;
        if (str == null || bpfCompileMode == null || inet4Address == null) {
            throw new NullPointerException("bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            try {
                int i = ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0);
                synchronized (compileLock) {
                    iPcap_compile = NativeMappings.pcap_compile(this.handle, bpf_programVar, str, bpfCompileMode.getValue(), i);
                }
                if (iPcap_compile < 0) {
                    throw new PcapNativeException("Error occurred in pcap_compile: " + getError(), Integer.valueOf(iPcap_compile));
                }
                int iPcap_setfilter = NativeMappings.pcap_setfilter(this.handle, bpf_programVar);
                if (iPcap_setfilter >= 0) {
                    this.filteringExpression = str;
                } else {
                    throw new PcapNativeException("Error occurred in pcap_setfilter: " + getError(), Integer.valueOf(iPcap_setfilter));
                }
            } finally {
                NativeMappings.pcap_freecode(bpf_programVar);
            }
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public String toString() {
        StringBuilder sbA = o40.A(60, "Link type: [");
        sbA.append(this.dlt);
        sbA.append("] handle: [");
        sbA.append(this.handle);
        sbA.append("] Open: [");
        sbA.append(this.open);
        sbA.append("] Filtering Expression: [");
        return dw1.s(sbA, this.filteringExpression, "]");
    }

    public PcapHandle(Pointer pointer, TimestampPrecision timestampPrecision) {
        this.timestamps = new ThreadLocal<>();
        this.originalLengths = new ThreadLocal<>();
        this.handleLock = new ReentrantReadWriteLock(true);
        this.open = true;
        this.filteringExpression = "";
        this.handle = pointer;
        this.dlt = getDltByNative();
        this.timestampPrecision = timestampPrecision;
    }

    public int dispatch(int i, PacketListener packetListener, Executor executor) throws PcapNativeException, InterruptedException, NotOpenException {
        if (packetListener != null && executor != null) {
            return doDispatch(i, new GotPacketFuncExecutor(packetListener, this.dlt, executor));
        }
        throw new NullPointerException("listener: " + packetListener + " executor: " + executor);
    }

    public void loop(int i, PacketListener packetListener, Executor executor) throws PcapNativeException, InterruptedException, NotOpenException {
        if (packetListener != null && executor != null) {
            doLoop(i, new GotPacketFuncExecutor(packetListener, this.dlt, executor));
            return;
        }
        throw new NullPointerException("listener: " + packetListener + " executor: " + executor);
    }

    public void sendPacket(byte[] bArr) throws PcapNativeException, NotOpenException {
        sendPacket(bArr, bArr.length);
    }

    public void sendPacket(byte[] bArr, int i) throws PcapNativeException, NotOpenException {
        if (bArr != null) {
            if (this.open) {
                if (this.handleLock.readLock().tryLock()) {
                    try {
                        if (this.open) {
                            int iPcap_sendpacket = NativeMappings.pcap_sendpacket(this.handle, bArr, i);
                            if (iPcap_sendpacket < 0) {
                                throw new PcapNativeException("Error occurred in pcap_sendpacket(): " + getError(), Integer.valueOf(iPcap_sendpacket));
                            }
                            this.handleLock.readLock().unlock();
                            return;
                        }
                        throw new NotOpenException();
                    } catch (Throwable th) {
                        this.handleLock.readLock().unlock();
                        throw th;
                    }
                }
                throw new NotOpenException();
            }
            throw new NotOpenException();
        }
        throw new NullPointerException("bytes may not be null");
    }

    public int dispatch(int i, RawPacketListener rawPacketListener) throws PcapNativeException, InterruptedException, NotOpenException {
        return dispatch(i, rawPacketListener, SimpleExecutor.getInstance());
    }

    public void loop(int i, RawPacketListener rawPacketListener) throws PcapNativeException, InterruptedException, NotOpenException {
        loop(i, rawPacketListener, SimpleExecutor.getInstance());
    }

    public int dispatch(int i, RawPacketListener rawPacketListener, Executor executor) throws PcapNativeException, InterruptedException, NotOpenException {
        if (rawPacketListener != null && executor != null) {
            return doDispatch(i, new GotRawPacketFuncExecutor(rawPacketListener, executor));
        }
        throw new NullPointerException("listener: " + rawPacketListener + " executor: " + executor);
    }

    public void loop(int i, RawPacketListener rawPacketListener, Executor executor) throws PcapNativeException, InterruptedException, NotOpenException {
        if (rawPacketListener != null && executor != null) {
            doLoop(i, new GotRawPacketFuncExecutor(rawPacketListener, executor));
            return;
        }
        throw new NullPointerException("listener: " + rawPacketListener + " executor: " + executor);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private PcapHandle(Builder builder) throws PcapNativeException {
        int iPcap_setdirection;
        int iPcap_set_buffer_size;
        int iPcap_set_timeout;
        int iPcap_set_promisc;
        int iPcap_set_snaplen;
        this.timestamps = new ThreadLocal<>();
        this.originalLengths = new ThreadLocal<>();
        this.handleLock = new ReentrantReadWriteLock(true);
        this.open = true;
        this.filteringExpression = "";
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pointerPcap_create = NativeMappings.pcap_create(builder.deviceName, pcapErrbuf);
        this.handle = pointerPcap_create;
        if (pointerPcap_create != null && pcapErrbuf.length() == 0) {
            try {
                if (builder.isSnaplenSet && (iPcap_set_snaplen = NativeMappings.pcap_set_snaplen(pointerPcap_create, builder.snaplen)) != 0) {
                    throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_snaplen));
                }
                if (builder.promiscuousMode != null && (iPcap_set_promisc = NativeMappings.pcap_set_promisc(pointerPcap_create, builder.promiscuousMode.getValue())) != 0) {
                    throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_promisc));
                }
                if (builder.isRfmonSet) {
                    try {
                        int iPcap_set_rfmon = NativeMappings.PcapLibrary.INSTANCE.pcap_set_rfmon(pointerPcap_create, builder.rfmon ? 1 : 0);
                        if (iPcap_set_rfmon != 0) {
                            throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_rfmon));
                        }
                    } catch (UnsatisfiedLinkError e) {
                        logger.error("Failed to instantiate PcapHandle object.", (Throwable) e);
                        throw new PcapNativeException("Monitor mode is not supported on this platform.");
                    }
                }
                if (builder.isTimeoutMillisSet && (iPcap_set_timeout = NativeMappings.pcap_set_timeout(pointerPcap_create, builder.timeoutMillis)) != 0) {
                    throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_timeout));
                }
                if (builder.isBufferSizeSet && (iPcap_set_buffer_size = NativeMappings.pcap_set_buffer_size(pointerPcap_create, builder.bufferSize)) != 0) {
                    throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_buffer_size));
                }
                if (builder.timestampPrecision != null) {
                    try {
                        if (NativeMappings.PcapLibrary.INSTANCE.pcap_set_tstamp_precision(pointerPcap_create, builder.timestampPrecision.getValue()) == 0) {
                            this.timestampPrecision = builder.timestampPrecision;
                        } else {
                            StringBuilder sb = new StringBuilder(100);
                            sb.append("The specified timestamp precision ");
                            sb.append(builder.timestampPrecision);
                            sb.append(" is not supported on this platform. ");
                            TimestampPrecision timestampPrecision = TimestampPrecision.MICRO;
                            sb.append(timestampPrecision);
                            sb.append(" is set instead.");
                            logger.error(sb.toString());
                            this.timestampPrecision = timestampPrecision;
                        }
                    } catch (UnsatisfiedLinkError unused) {
                        throw new PcapNativeException("pcap_set_tstamp_precision is not supported by the pcap library installed in this environment.");
                    }
                } else {
                    this.timestampPrecision = TimestampPrecision.MICRO;
                }
                if (builder.isImmediateModeSet) {
                    try {
                        int iPcap_set_immediate_mode = NativeMappings.PcapLibrary.INSTANCE.pcap_set_immediate_mode(pointerPcap_create, builder.immediateMode ? 1 : 0);
                        if (iPcap_set_immediate_mode != 0) {
                            throw new PcapNativeException(getError(), Integer.valueOf(iPcap_set_immediate_mode));
                        }
                    } catch (UnsatisfiedLinkError e2) {
                        logger.error("Failed to instantiate PcapHandle object.", (Throwable) e2);
                        throw new PcapNativeException("Immediate mode is not supported on this platform.");
                    }
                }
                int iPcap_activate = NativeMappings.pcap_activate(pointerPcap_create);
                if (iPcap_activate >= 0) {
                    if (builder.direction != null && (iPcap_setdirection = NativeMappings.pcap_setdirection(pointerPcap_create, builder.direction.getValue())) < 0) {
                        throw new PcapNativeException("Failed to set direction: " + getError(), Integer.valueOf(iPcap_setdirection));
                    }
                    this.dlt = getDltByNative();
                    return;
                }
                throw new PcapNativeException(getError(), Integer.valueOf(iPcap_activate));
            } catch (NotOpenException unused2) {
                throw new AssertionError("Never get here.");
            }
        }
        throw new PcapNativeException(pcapErrbuf.toString());
    }

    public void loop(int i, PcapDumper pcapDumper) throws PcapNativeException, InterruptedException, NotOpenException {
        if (pcapDumper != null) {
            if (this.open) {
                if (this.handleLock.readLock().tryLock()) {
                    try {
                        if (this.open) {
                            Logger logger2 = logger;
                            logger2.info("Starting dump loop.");
                            int iPcap_loop = NativeMappings.pcap_loop(this.handle, i, NativeMappings.PCAP_DUMP, pcapDumper.getDumper());
                            if (iPcap_loop == -2) {
                                logger2.info("Broken.");
                                throw new InterruptedException();
                            }
                            if (iPcap_loop == -1) {
                                throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(iPcap_loop));
                            }
                            if (iPcap_loop != 0) {
                                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(iPcap_loop));
                            }
                            logger2.info("Finished dump loop.");
                            return;
                        }
                        throw new NotOpenException();
                    } finally {
                        this.handleLock.readLock().unlock();
                    }
                }
                throw new NotOpenException();
            }
            throw new NotOpenException();
        }
        throw new NullPointerException("dumper must not be null.");
    }

    public void setFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode) throws PcapNativeException, NotOpenException {
        setFilter(str, bpfCompileMode, PCAP_NETMASK_UNKNOWN);
    }

    public void setFilter(BpfProgram bpfProgram) throws PcapNativeException, NotOpenException {
        if (bpfProgram != null) {
            if (this.open) {
                if (this.handleLock.readLock().tryLock()) {
                    try {
                        if (this.open) {
                            int iPcap_setfilter = NativeMappings.pcap_setfilter(this.handle, bpfProgram.getProgram());
                            if (iPcap_setfilter < 0) {
                                throw new PcapNativeException("Failed to set filter: " + getError(), Integer.valueOf(iPcap_setfilter));
                            }
                            this.handleLock.readLock().unlock();
                            this.filteringExpression = bpfProgram.getExpression();
                            return;
                        }
                        throw new NotOpenException();
                    } catch (Throwable th) {
                        this.handleLock.readLock().unlock();
                        throw th;
                    }
                }
                throw new NotOpenException();
            }
            throw new NotOpenException();
        }
        throw new NullPointerException("prog is null.");
    }
}
