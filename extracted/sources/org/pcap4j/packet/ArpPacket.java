package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.ArpOperation;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class ArpPacket extends AbstractPacket {
    private static final long serialVersionUID = -7754807127571498700L;
    private final ArpHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private MacAddress dstHardwareAddr;
        private InetAddress dstProtocolAddr;
        private byte hardwareAddrLength;
        private ArpHardwareType hardwareType;
        private ArpOperation operation;
        private byte protocolAddrLength;
        private EtherType protocolType;
        private MacAddress srcHardwareAddr;
        private InetAddress srcProtocolAddr;

        public Builder dstHardwareAddr(MacAddress macAddress) {
            this.dstHardwareAddr = macAddress;
            return this;
        }

        public Builder dstProtocolAddr(InetAddress inetAddress) {
            this.dstProtocolAddr = inetAddress;
            return this;
        }

        public Builder hardwareAddrLength(byte b) {
            this.hardwareAddrLength = b;
            return this;
        }

        public Builder hardwareType(ArpHardwareType arpHardwareType) {
            this.hardwareType = arpHardwareType;
            return this;
        }

        public Builder operation(ArpOperation arpOperation) {
            this.operation = arpOperation;
            return this;
        }

        public Builder protocolAddrLength(byte b) {
            this.protocolAddrLength = b;
            return this;
        }

        public Builder protocolType(EtherType etherType) {
            this.protocolType = etherType;
            return this;
        }

        public Builder srcHardwareAddr(MacAddress macAddress) {
            this.srcHardwareAddr = macAddress;
            return this;
        }

        public Builder srcProtocolAddr(InetAddress inetAddress) {
            this.srcProtocolAddr = inetAddress;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public ArpPacket build() {
            return new ArpPacket(this);
        }

        private Builder(ArpPacket arpPacket) {
            this.hardwareType = arpPacket.header.hardwareType;
            this.protocolType = arpPacket.header.protocolType;
            this.hardwareAddrLength = arpPacket.header.hardwareAddrLength;
            this.protocolAddrLength = arpPacket.header.protocolAddrLength;
            this.operation = arpPacket.header.operation;
            this.srcHardwareAddr = arpPacket.header.srcHardwareAddr;
            this.srcProtocolAddr = arpPacket.header.srcProtocolAddr;
            this.dstHardwareAddr = arpPacket.header.dstHardwareAddr;
            this.dstProtocolAddr = arpPacket.header.dstProtocolAddr;
        }
    }

    public static ArpPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new ArpPacket(bArr, i, i2);
    }

    public static final class ArpHeader extends AbstractPacket.AbstractHeader {
        private static final int ARP_HEADER_SIZE = 28;
        private static final int DST_HARDWARE_ADDR_OFFSET = 18;
        private static final int DST_HARDWARE_ADDR_SIZE = 6;
        private static final int DST_PROTOCOL_ADDR_OFFSET = 24;
        private static final int DST_PROTOCOL_ADDR_SIZE = 4;
        private static final int HARDWARE_TYPE_OFFSET = 0;
        private static final int HARDWARE_TYPE_SIZE = 2;
        private static final int HW_ADDR_LENGTH_OFFSET = 4;
        private static final int HW_ADDR_LENGTH_SIZE = 1;
        private static final int OPERATION_OFFSET = 6;
        private static final int OPERATION_SIZE = 2;
        private static final int PROTOCOL_TYPE_OFFSET = 2;
        private static final int PROTOCOL_TYPE_SIZE = 2;
        private static final int PROTO_ADDR_LENGTH_OFFSET = 5;
        private static final int PROTO_ADDR_LENGTH_SIZE = 1;
        private static final int SRC_HARDWARE_ADDR_OFFSET = 8;
        private static final int SRC_HARDWARE_ADDR_SIZE = 6;
        private static final int SRC_PROTOCOL_ADDR_OFFSET = 14;
        private static final int SRC_PROTOCOL_ADDR_SIZE = 4;
        private static final long serialVersionUID = -6744946002881067732L;
        private final MacAddress dstHardwareAddr;
        private final InetAddress dstProtocolAddr;
        private final byte hardwareAddrLength;
        private final ArpHardwareType hardwareType;
        private final ArpOperation operation;
        private final byte protocolAddrLength;
        private final EtherType protocolType;
        private final MacAddress srcHardwareAddr;
        private final InetAddress srcProtocolAddr;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ARP Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Hardware type: ");
            sb.append(this.hardwareType);
            sb.append(property);
            sb.append("  Protocol type: ");
            sb.append(this.protocolType);
            sb.append(property);
            sb.append("  Hardware address length: ");
            sb.append(getHardwareAddrLengthAsInt());
            sb.append(" [bytes]");
            sb.append(property);
            sb.append("  Protocol address length: ");
            sb.append(getProtocolAddrLengthAsInt());
            t61.y(sb, " [bytes]", property, "  Operation: ");
            sb.append(this.operation);
            sb.append(property);
            sb.append("  Source hardware address: ");
            sb.append(this.srcHardwareAddr);
            sb.append(property);
            sb.append("  Source protocol address: ");
            sb.append(this.srcProtocolAddr);
            sb.append(property);
            sb.append("  Destination hardware address: ");
            sb.append(this.dstHardwareAddr);
            sb.append(property);
            sb.append("  Destination protocol address: ");
            sb.append(this.dstProtocolAddr);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.dstProtocolAddr.hashCode() + ((this.dstHardwareAddr.hashCode() + ((this.srcProtocolAddr.hashCode() + ((this.srcHardwareAddr.hashCode() + ((this.operation.hashCode() + ((((((this.protocolType.hashCode() + ((this.hardwareType.hashCode() + 527) * 31)) * 31) + this.hardwareAddrLength) * 31) + this.protocolAddrLength) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!ArpHeader.class.isInstance(obj)) {
                return false;
            }
            ArpHeader arpHeader = (ArpHeader) obj;
            return this.operation.equals(arpHeader.getOperation()) && this.srcHardwareAddr.equals(arpHeader.srcHardwareAddr) && this.srcProtocolAddr.equals(arpHeader.srcProtocolAddr) && this.dstHardwareAddr.equals(arpHeader.dstHardwareAddr) && this.dstProtocolAddr.equals(arpHeader.dstProtocolAddr) && this.hardwareType.equals(arpHeader.hardwareType) && this.protocolType.equals(arpHeader.protocolType) && this.hardwareAddrLength == arpHeader.hardwareAddrLength && this.protocolAddrLength == arpHeader.protocolAddrLength;
        }

        public MacAddress getDstHardwareAddr() {
            return this.dstHardwareAddr;
        }

        public InetAddress getDstProtocolAddr() {
            return this.dstProtocolAddr;
        }

        public byte getHardwareAddrLength() {
            return this.hardwareAddrLength;
        }

        public int getHardwareAddrLengthAsInt() {
            return this.hardwareAddrLength & 255;
        }

        public ArpHardwareType getHardwareType() {
            return this.hardwareType;
        }

        public ArpOperation getOperation() {
            return this.operation;
        }

        public byte getProtocolAddrLength() {
            return this.protocolAddrLength;
        }

        public int getProtocolAddrLengthAsInt() {
            return this.protocolAddrLength & 255;
        }

        public EtherType getProtocolType() {
            return this.protocolType;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.hardwareType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.protocolType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.hardwareAddrLength));
            arrayList.add(ByteArrays.toByteArray(this.protocolAddrLength));
            arrayList.add(ByteArrays.toByteArray(this.operation.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.srcHardwareAddr));
            arrayList.add(ByteArrays.toByteArray(this.srcProtocolAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstHardwareAddr));
            arrayList.add(ByteArrays.toByteArray(this.dstProtocolAddr));
            return arrayList;
        }

        public MacAddress getSrcHardwareAddr() {
            return this.srcHardwareAddr;
        }

        public InetAddress getSrcProtocolAddr() {
            return this.srcProtocolAddr;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 28;
        }

        private ArpHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 28) {
                this.hardwareType = ArpHardwareType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
                this.protocolType = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                this.hardwareAddrLength = ByteArrays.getByte(bArr, i + 4);
                this.protocolAddrLength = ByteArrays.getByte(bArr, i + 5);
                this.operation = ArpOperation.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 6)));
                this.srcHardwareAddr = ByteArrays.getMacAddress(bArr, i + 8);
                this.srcProtocolAddr = ByteArrays.getInet4Address(bArr, i + 14);
                this.dstHardwareAddr = ByteArrays.getMacAddress(bArr, i + 18);
                this.dstProtocolAddr = ByteArrays.getInet4Address(bArr, i + 24);
                return;
            }
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an ARP header(28 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private ArpHeader(Builder builder) {
            this.hardwareType = builder.hardwareType;
            this.protocolType = builder.protocolType;
            this.hardwareAddrLength = builder.hardwareAddrLength;
            this.protocolAddrLength = builder.protocolAddrLength;
            this.operation = builder.operation;
            this.srcHardwareAddr = builder.srcHardwareAddr;
            this.srcProtocolAddr = builder.srcProtocolAddr;
            this.dstHardwareAddr = builder.dstHardwareAddr;
            this.dstProtocolAddr = builder.dstProtocolAddr;
        }
    }

    private ArpPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new ArpHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public ArpHeader getHeader() {
        return this.header;
    }

    private ArpPacket(Builder builder) {
        if (builder != null && builder.hardwareType != null && builder.protocolType != null && builder.operation != null && builder.srcHardwareAddr != null && builder.srcProtocolAddr != null && builder.dstHardwareAddr != null && builder.dstProtocolAddr != null) {
            this.header = new ArpHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.hardwareType: " + builder.hardwareType + " builder.protocolType: " + builder.protocolType + " builder.operation: " + builder.operation + " builder.srcHardwareAddr: " + builder.srcHardwareAddr + " builder.srcProtocolAddr: " + builder.srcProtocolAddr + " builder.dstHardwareAddr: " + builder.dstHardwareAddr + " builder.dstProtocolAddr: " + builder.dstProtocolAddr);
    }
}
