package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class UdpPacket extends AbstractPacket implements TransportPacket {
    private static final long serialVersionUID = 4638029542367352625L;
    private final UdpHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements LengthBuilder<UdpPacket>, ChecksumBuilder<UdpPacket> {
        private short checksum;
        private boolean correctChecksumAtBuild;
        private boolean correctLengthAtBuild;
        private InetAddress dstAddr;
        private UdpPort dstPort;
        private short length;
        private Packet.Builder payloadBuilder;
        private InetAddress srcAddr;
        private UdpPort srcPort;

        public Builder() {
        }

        public Builder checksum(short s) {
            this.checksum = s;
            return this;
        }

        public Builder dstAddr(InetAddress inetAddress) {
            this.dstAddr = inetAddress;
            return this;
        }

        public Builder dstPort(UdpPort udpPort) {
            this.dstPort = udpPort;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder length(short s) {
            this.length = s;
            return this;
        }

        public Builder srcAddr(InetAddress inetAddress) {
            this.srcAddr = inetAddress;
            return this;
        }

        public Builder srcPort(UdpPort udpPort) {
            this.srcPort = udpPort;
            return this;
        }

        public Builder(UdpPacket udpPacket) {
            this.srcPort = udpPacket.header.srcPort;
            this.dstPort = udpPacket.header.dstPort;
            this.length = udpPacket.header.length;
            this.checksum = udpPacket.header.checksum;
            this.payloadBuilder = udpPacket.payload != null ? udpPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<UdpPacket> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<UdpPacket> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public UdpPacket build() {
            return new UdpPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static final class UdpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int CHECKSUM_OFFSET = 6;
        private static final int CHECKSUM_SIZE = 2;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int IPV4_PSEUDO_HEADER_SIZE = 12;
        private static final int IPV6_PSEUDO_HEADER_SIZE = 40;
        private static final int LENGTH_OFFSET = 4;
        private static final int LENGTH_SIZE = 2;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int UCP_HEADER_SIZE = 8;
        private static final long serialVersionUID = -1746545325551976324L;
        private final short checksum;
        private final UdpPort dstPort;
        private final short length;
        private final UdpPort srcPort;

        private byte[] buildRawData(boolean z) {
            return ByteArrays.concatenate(getRawFields(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short calcChecksum(InetAddress inetAddress, InetAddress inetAddress2, byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            int i;
            int length = length() + bArr2.length;
            boolean z = inetAddress instanceof Inet4Address;
            int i2 = z ? 12 : 40;
            if (length % 2 != 0) {
                i = length + 1;
                bArr3 = new byte[i2 + i];
            } else {
                bArr3 = new byte[i2 + length];
                i = length;
            }
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            System.arraycopy(inetAddress.getAddress(), 0, bArr3, i, inetAddress.getAddress().length);
            int length2 = i + inetAddress.getAddress().length;
            System.arraycopy(inetAddress2.getAddress(), 0, bArr3, length2, inetAddress2.getAddress().length);
            int length3 = length2 + inetAddress2.getAddress().length;
            int i3 = z ? length3 + 1 : length3 + 3;
            bArr3[i3] = IpNumber.UDP.value().byteValue();
            System.arraycopy(ByteArrays.toByteArray((short) length), 0, bArr3, i3 + 1, 2);
            return ByteArrays.calcChecksum(bArr3);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[UDP Header (");
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
            sb.append("  Length: ");
            sb.append(getLengthAsInt());
            sb.append(" [bytes]");
            sb.append(property);
            sb.append("  Checksum: 0x");
            sb.append(ByteArrays.toHexString(this.checksum, ""));
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((this.dstPort.hashCode() + ((this.srcPort.hashCode() + 527) * 31)) * 31) + this.length) * 31) + this.checksum;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!UdpHeader.class.isInstance(obj)) {
                return false;
            }
            UdpHeader udpHeader = (UdpHeader) obj;
            return this.checksum == udpHeader.checksum && this.length == udpHeader.length && this.srcPort.equals(udpHeader.srcPort) && this.dstPort.equals(udpHeader.dstPort);
        }

        public short getChecksum() {
            return this.checksum;
        }

        public short getLength() {
            return this.length;
        }

        public int getLengthAsInt() {
            return 65535 & this.length;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 8;
        }

        private List<byte[]> getRawFields(boolean z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.length));
            arrayList.add(ByteArrays.toByteArray(z ? (short) 0 : this.checksum));
            return arrayList;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public UdpPort getDstPort() {
            return this.dstPort;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public UdpPort getSrcPort() {
            return this.srcPort;
        }

        private UdpHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 8) {
                this.srcPort = UdpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
                this.dstPort = UdpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                this.length = ByteArrays.getShort(bArr, i + 4);
                this.checksum = ByteArrays.getShort(bArr, i + 6);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build a UDP header(8 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private UdpHeader(Builder builder, byte[] bArr) {
            this.srcPort = builder.srcPort;
            this.dstPort = builder.dstPort;
            if (!builder.correctLengthAtBuild) {
                this.length = builder.length;
            } else {
                this.length = (short) (length() + bArr.length);
            }
            if (builder.correctChecksumAtBuild) {
                if (((builder.srcAddr instanceof Inet4Address) && PacketPropertiesLoader.getInstance().udpV4CalcChecksum()) || ((builder.srcAddr instanceof Inet6Address) && PacketPropertiesLoader.getInstance().udpV6CalcChecksum())) {
                    this.checksum = calcChecksum(builder.srcAddr, builder.dstAddr, buildRawData(true), bArr);
                    return;
                } else {
                    this.checksum = (short) 0;
                    return;
                }
            }
            this.checksum = builder.checksum;
        }
    }

    public static UdpPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new UdpPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(InetAddress inetAddress, InetAddress inetAddress2, boolean z) {
        if (inetAddress == null || inetAddress2 == null) {
            throw new NullPointerException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        if (!inetAddress.getClass().isInstance(inetAddress2)) {
            throw new IllegalArgumentException("srcAddr: " + inetAddress + " dstAddr: " + inetAddress2);
        }
        Packet packet = this.payload;
        byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
        UdpHeader udpHeader = this.header;
        if (udpHeader.calcChecksum(inetAddress, inetAddress2, udpHeader.getRawData(), rawData) == 0) {
            return true;
        }
        return this.header.checksum == 0 && z;
    }

    private UdpPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        UdpHeader udpHeader = new UdpHeader(bArr, i, i2);
        this.header = udpHeader;
        int lengthAsInt = udpHeader.getLengthAsInt() - udpHeader.length();
        if (lengthAsInt < 0) {
            throw new IllegalRawDataException("The value of length field seems to be wrong: " + udpHeader.getLengthAsInt());
        }
        lengthAsInt = lengthAsInt > i2 - udpHeader.length() ? i2 - udpHeader.length() : lengthAsInt;
        if (lengthAsInt == 0) {
            this.payload = null;
        } else {
            PacketFactory factory = PacketFactories.getFactory(Packet.class, UdpPort.class);
            this.payload = (Packet) factory.newInstance(bArr, udpHeader.length() + i, lengthAsInt, factory.getTargetClass(udpHeader.getDstPort()).equals(factory.getTargetClass()) ? udpHeader.getSrcPort() : udpHeader.getDstPort());
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public UdpHeader getHeader() {
        return this.header;
    }

    private UdpPacket(Builder builder) {
        if (builder != null && builder.srcPort != null && builder.dstPort != null) {
            if (builder.correctChecksumAtBuild) {
                if (builder.srcAddr != null && builder.dstAddr != null) {
                    if (!builder.srcAddr.getClass().isInstance(builder.dstAddr)) {
                        throw new IllegalArgumentException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
                    }
                } else {
                    throw new NullPointerException("builder.srcAddr: " + builder.srcAddr + " builder.dstAddr: " + builder.dstAddr);
                }
            }
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new UdpHeader(builder, packetBuild != null ? packetBuild.getRawData() : new byte[0]);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
    }
}
