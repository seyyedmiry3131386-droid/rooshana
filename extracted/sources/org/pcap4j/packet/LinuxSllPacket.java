package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.LinuxSllPacketType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.LinkLayerAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class LinuxSllPacket extends AbstractPacket {
    private static final long serialVersionUID = -7743587634024281470L;
    private final LinuxSllHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] address;
        private short addressLength;
        private ArpHardwareType addressType;
        private LinuxSllPacketType packetType;
        private Packet.Builder payloadBuilder;
        private EtherType protocol;

        public Builder address(byte[] bArr) {
            this.address = bArr;
            return this;
        }

        public Builder addressLength(short s) {
            this.addressLength = s;
            return this;
        }

        public Builder addressType(ArpHardwareType arpHardwareType) {
            this.addressType = arpHardwareType;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder packetType(LinuxSllPacketType linuxSllPacketType) {
            this.packetType = linuxSllPacketType;
            return this;
        }

        public Builder protocol(EtherType etherType) {
            this.protocol = etherType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public LinuxSllPacket build() {
            return new LinuxSllPacket(this);
        }

        private Builder(LinuxSllPacket linuxSllPacket) {
            this.packetType = linuxSllPacket.header.packetType;
            this.addressType = linuxSllPacket.header.addressType;
            this.addressLength = linuxSllPacket.header.addressLength;
            this.address = linuxSllPacket.header.addressField;
            this.protocol = linuxSllPacket.header.protocol;
            this.payloadBuilder = linuxSllPacket.payload != null ? linuxSllPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static LinuxSllPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new LinuxSllPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class LinuxSllHeader extends AbstractPacket.AbstractHeader {
        private static final int ADDR_OFFSET = 6;
        private static final int ADDR_SIZE = 8;
        private static final int HALEN_OFFSET = 4;
        private static final int HALEN_SIZE = 2;
        private static final int LINUX_SLL_HEADER_SIZE = 16;
        private static final int PHATYPE_OFFSET = 2;
        private static final int PHATYPE_SIZE = 2;
        private static final int PPKTTYPE_OFFSET = 0;
        private static final int PPKTTYPE_SIZE = 2;
        private static final int PROTOCOL_OFFSET = 14;
        private static final int PROTOCOL_SIZE = 2;
        private static final long serialVersionUID = -4946840737268934876L;
        private final LinkLayerAddress address;
        private final byte[] addressField;
        private final short addressLength;
        private final ArpHardwareType addressType;
        private final LinuxSllPacketType packetType;
        private final EtherType protocol;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[Linux SLL header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Packet Type: ");
            sb.append(this.packetType);
            sb.append(property);
            sb.append("  Address Type: ");
            sb.append(this.addressType);
            sb.append(property);
            sb.append("  Address Length: ");
            sb.append(getAddressLengthAsInt());
            sb.append(property);
            sb.append("  Address: ");
            sb.append(this.address);
            sb.append(" (");
            sb.append(ByteArrays.toHexString(this.addressField, " "));
            sb.append(")");
            sb.append(property);
            sb.append("  Protocol: ");
            sb.append(this.protocol);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.protocol.hashCode() + ((Arrays.hashCode(this.addressField) + ((((this.addressType.hashCode() + ((this.packetType.hashCode() + 527) * 31)) * 31) + this.addressLength) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!LinuxSllHeader.class.isInstance(obj)) {
                return false;
            }
            LinuxSllHeader linuxSllHeader = (LinuxSllHeader) obj;
            return Arrays.equals(this.addressField, linuxSllHeader.addressField) && this.packetType.equals(linuxSllHeader.packetType) && this.protocol.equals(linuxSllHeader.protocol) && this.addressType.equals(linuxSllHeader.addressType) && this.addressLength == linuxSllHeader.addressLength;
        }

        public LinkLayerAddress getAddress() {
            return this.address;
        }

        public byte[] getAddressField() {
            return ByteArrays.clone(this.addressField);
        }

        public short getAddressLength() {
            return this.addressLength;
        }

        public int getAddressLengthAsInt() {
            return 65535 & this.addressLength;
        }

        public ArpHardwareType getAddressType() {
            return this.addressType;
        }

        public LinuxSllPacketType getPacketType() {
            return this.packetType;
        }

        public EtherType getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.packetType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.addressType.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.addressLength));
            arrayList.add(this.addressField);
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 16;
        }

        private LinuxSllHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            byte[] bArr2 = new byte[8];
            this.addressField = bArr2;
            if (i2 >= 16) {
                this.packetType = LinuxSllPacketType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
                this.addressType = ArpHardwareType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                short s = ByteArrays.getShort(bArr, i + 4);
                this.addressLength = s;
                if (getAddressLengthAsInt() <= 8) {
                    int i3 = i + 6;
                    System.arraycopy(bArr, i3, bArr2, 0, 8);
                    if (s == 0) {
                        this.address = null;
                    } else {
                        this.address = ByteArrays.getLinkLayerAddress(bArr, i3, getAddressLengthAsInt());
                    }
                    this.protocol = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 14)));
                    return;
                }
                StringBuilder sbA = o40.A(100, "addressLength must not be longer than 8 but it is: ");
                sbA.append(getAddressLengthAsInt());
                throw new IllegalRawDataException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Linux SLL header(16 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA2, bArr);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private LinuxSllHeader(Builder builder) {
            byte[] bArr = new byte[8];
            this.addressField = bArr;
            if (builder.address.length <= 8) {
                if ((builder.addressLength & 65535) <= 8) {
                    this.packetType = builder.packetType;
                    this.addressType = builder.addressType;
                    short s = builder.addressLength;
                    this.addressLength = s;
                    System.arraycopy(builder.address, 0, bArr, 0, builder.address.length);
                    this.protocol = builder.protocol;
                    if (s == 0) {
                        this.address = null;
                        return;
                    } else {
                        this.address = ByteArrays.getLinkLayerAddress(bArr, 0, getAddressLengthAsInt());
                        return;
                    }
                }
                StringBuilder sbA = o40.A(100, "addressLength & 0xFFFF must not be longer than 8 but it is: ");
                sbA.append(builder.addressLength & 65535);
                throw new IllegalArgumentException(sbA.toString());
            }
            StringBuilder sbA2 = o40.A(100, "address must not be longer than 8 but it is: ");
            sbA2.append(ByteArrays.toHexString(builder.address, " "));
            throw new IllegalArgumentException(sbA2.toString());
        }
    }

    private LinuxSllPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        LinuxSllHeader linuxSllHeader = new LinuxSllHeader(bArr, i, i2);
        this.header = linuxSllHeader;
        int length = i2 - linuxSllHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, linuxSllHeader.length() + i, length, linuxSllHeader.getProtocol());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public LinuxSllHeader getHeader() {
        return this.header;
    }

    private LinuxSllPacket(Builder builder) {
        if (builder != null && builder.packetType != null && builder.addressType != null && builder.address != null && builder.protocol != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new LinuxSllHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.packetType: " + builder.packetType + " builder.addressType: " + builder.addressType + " builder.address: " + builder.address + " builder.protocol: " + builder.protocol);
    }
}
