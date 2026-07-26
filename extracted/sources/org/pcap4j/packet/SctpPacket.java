package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.SctpChunkType;
import org.pcap4j.packet.namednumber.SctpPort;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class SctpPacket extends AbstractPacket implements TransportPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SctpPacket.class);
    private static final long serialVersionUID = -1082956644945517426L;
    private final SctpHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<SctpPacket> {
        private int checksum;
        private List<SctpChunk> chunks;
        private boolean correctChecksumAtBuild;
        private SctpPort dstPort;
        private Packet.Builder payloadBuilder;
        private SctpPort srcPort;
        private int verificationTag;

        public Builder() {
        }

        public Builder checksum(int i) {
            this.checksum = i;
            return this;
        }

        public Builder chunks(List<SctpChunk> list) {
            this.chunks = list;
            return this;
        }

        public Builder dstPort(SctpPort sctpPort) {
            this.dstPort = sctpPort;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder srcPort(SctpPort sctpPort) {
            this.srcPort = sctpPort;
            return this;
        }

        public Builder verificationTag(int i) {
            this.verificationTag = i;
            return this;
        }

        public Builder(SctpPacket sctpPacket) {
            this.srcPort = sctpPacket.header.srcPort;
            this.dstPort = sctpPacket.header.dstPort;
            this.verificationTag = sctpPacket.header.verificationTag;
            this.checksum = sctpPacket.header.checksum;
            this.chunks = sctpPacket.header.chunks;
            this.payloadBuilder = sctpPacket.payload != null ? sctpPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<SctpPacket> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public SctpPacket build() {
            return new SctpPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public interface SctpChunk extends Serializable {
        byte[] getRawData();

        SctpChunkType getType();

        int length();
    }

    public static final class SctpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int CHECKSUM_OFFSET = 8;
        private static final int CHECKSUM_SIZE = 4;
        private static final int CHUNKS_OFFSET = 12;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int VERIFICAION_TAG_SIZE = 4;
        private static final int VERIFICATION_TAG_OFFSET = 4;
        private static final long serialVersionUID = -8223170335586535940L;
        private final int checksum;
        private final List<SctpChunk> chunks;
        private final SctpPort dstPort;
        private final SctpPort srcPort;
        private final int verificationTag;

        /* JADX INFO: Access modifiers changed from: private */
        public int calcChecksum() {
            int length = length();
            byte[] bArr = new byte[length];
            System.arraycopy(buildRawData(), 0, bArr, 0, length);
            for (int i = 0; i < 4; i++) {
                bArr[i + 8] = 0;
            }
            if (PacketPropertiesLoader.getInstance().sctpCalcChecksumByAdler32()) {
                return ByteArrays.calcAdler32Checksum(bArr);
            }
            int iCalcCrc32cChecksum = ByteArrays.calcCrc32cChecksum(bArr);
            return ((iCalcCrc32cChecksum & (-16777216)) >>> 24) | (iCalcCrc32cChecksum << 24) | ((65280 & iCalcCrc32cChecksum) << 8) | ((16711680 & iCalcCrc32cChecksum) >> 8);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SCTP Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Source port: ");
            sb.append(getSrcPort());
            sb.append(property);
            sb.append("  Destination port: ");
            sb.append(getDstPort());
            sb.append(property);
            sb.append("  Verification tag: 0x");
            sb.append(ByteArrays.toHexString(this.verificationTag, ""));
            sb.append(property);
            sb.append("  Checksum: 0x");
            sb.append(ByteArrays.toHexString(this.checksum, ""));
            sb.append(property);
            sb.append("  Chunks:");
            sb.append(property);
            for (SctpChunk sctpChunk : this.chunks) {
                sb.append("    ");
                sb.append(sctpChunk);
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.chunks.hashCode() + ((((((this.dstPort.hashCode() + ((this.srcPort.hashCode() + 527) * 31)) * 31) + this.verificationTag) * 31) + this.checksum) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<SctpChunk> it = this.chunks.iterator();
            int length = 12;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!SctpHeader.class.isInstance(obj)) {
                return false;
            }
            SctpHeader sctpHeader = (SctpHeader) obj;
            return this.checksum == sctpHeader.checksum && this.verificationTag == sctpHeader.verificationTag && this.srcPort.equals(sctpHeader.srcPort) && this.dstPort.equals(sctpHeader.dstPort) && this.chunks.equals(sctpHeader.chunks);
        }

        public int getChecksum() {
            return this.checksum;
        }

        public List<SctpChunk> getChunks() {
            return new ArrayList(this.chunks);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.verificationTag));
            arrayList.add(ByteArrays.toByteArray(this.checksum));
            Iterator<SctpChunk> it = this.chunks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        public int getVerificationTag() {
            return this.verificationTag;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public SctpPort getDstPort() {
            return this.dstPort;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public SctpPort getSrcPort() {
            return this.srcPort;
        }

        private SctpHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 12) {
                this.srcPort = SctpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
                this.dstPort = SctpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                this.verificationTag = ByteArrays.getInt(bArr, i + 4);
                this.checksum = ByteArrays.getInt(bArr, i + 8);
                this.chunks = new ArrayList();
                int i3 = i2 - 12;
                int i4 = i + 12;
                while (i3 != 0) {
                    try {
                        SctpChunk sctpChunk = (SctpChunk) PacketFactories.getFactory(SctpChunk.class, SctpChunkType.class).newInstance(bArr, i4, i3, SctpChunkType.getInstance(Byte.valueOf(bArr[i4])));
                        this.chunks.add(sctpChunk);
                        int length = sctpChunk.length();
                        i4 += length;
                        i3 -= length;
                    } catch (Exception e) {
                        SctpPacket.logger.error("Exception occurred during analyzing SCTP chunks: ", (Throwable) e);
                        throw new IllegalRawDataException("Exception occurred during analyzing SCTP chunks", e);
                    }
                }
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build a SCTP header(12 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private SctpHeader(Builder builder) {
            this.srcPort = builder.srcPort;
            this.dstPort = builder.dstPort;
            this.verificationTag = builder.verificationTag;
            if (builder.chunks != null) {
                this.chunks = new ArrayList(builder.chunks);
            } else {
                this.chunks = Collections.EMPTY_LIST;
            }
            if (!builder.correctChecksumAtBuild) {
                this.checksum = builder.checksum;
            } else {
                this.checksum = calcChecksum();
            }
        }
    }

    public static SctpPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new SctpPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum() {
        return this.header.calcChecksum() == this.header.checksum;
    }

    private SctpPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new SctpHeader(bArr, i, i2);
        this.payload = null;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public SctpHeader getHeader() {
        return this.header;
    }

    private SctpPacket(Builder builder) {
        if (builder != null && builder.srcPort != null && builder.dstPort != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new SctpHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
        }
    }
}
