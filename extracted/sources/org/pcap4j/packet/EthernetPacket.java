package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class EthernetPacket extends AbstractPacket {
    private static final int MIN_ETHERNET_PAYLOAD_LENGTH = 46;
    private static final long serialVersionUID = 3461432646404254300L;
    private final EthernetHeader header;
    private final byte[] pad;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private MacAddress dstAddr;
        private byte[] pad;
        private boolean paddingAtBuild;
        private Packet.Builder payloadBuilder;
        private MacAddress srcAddr;
        private EtherType type;

        public Builder dstAddr(MacAddress macAddress) {
            this.dstAddr = macAddress;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }

        public Builder paddingAtBuild(boolean z) {
            this.paddingAtBuild = z;
            return this;
        }

        public Builder srcAddr(MacAddress macAddress) {
            this.srcAddr = macAddress;
            return this;
        }

        public Builder type(EtherType etherType) {
            this.type = etherType;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public EthernetPacket build() {
            return new EthernetPacket(this);
        }

        private Builder(EthernetPacket ethernetPacket) {
            this.dstAddr = ethernetPacket.header.dstAddr;
            this.srcAddr = ethernetPacket.header.srcAddr;
            this.type = ethernetPacket.header.type;
            this.payloadBuilder = ethernetPacket.payload != null ? ethernetPacket.payload.getBuilder() : null;
            this.pad = ethernetPacket.pad;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static EthernetPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new EthernetPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public byte[] buildRawData() {
        byte[] bArrBuildRawData = super.buildRawData();
        byte[] bArr = this.pad;
        if (bArr.length != 0) {
            System.arraycopy(bArr, 0, bArrBuildRawData, bArrBuildRawData.length - bArr.length, bArr.length);
        }
        return bArrBuildRawData;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public String buildString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.header.toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb.append(packet.toString());
        }
        if (this.pad.length != 0) {
            String property = System.getProperty("line.separator");
            sb.append("[Ethernet Pad (");
            sb.append(this.pad.length);
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Hex stream: ");
            sb.append(ByteArrays.toHexString(this.pad, " "));
            sb.append(property);
        }
        return sb.toString();
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcHashCode() {
        return Arrays.hashCode(this.pad) + (super.calcHashCode() * 31);
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public int calcLength() {
        return super.calcLength() + this.pad.length;
    }

    @Override // org.pcap4j.packet.AbstractPacket
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Arrays.equals(this.pad, ((EthernetPacket) obj).pad);
        }
        return false;
    }

    public byte[] getPad() {
        byte[] bArr = this.pad;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class EthernetHeader extends AbstractPacket.AbstractHeader {
        private static final int DST_ADDR_OFFSET = 0;
        private static final int DST_ADDR_SIZE = 6;
        private static final int ETHERNET_HEADER_SIZE = 14;
        private static final int SRC_ADDR_OFFSET = 6;
        private static final int SRC_ADDR_SIZE = 6;
        private static final int TYPE_OFFSET = 12;
        private static final int TYPE_SIZE = 2;
        private static final long serialVersionUID = -8271269099161190389L;
        private final MacAddress dstAddr;
        private final MacAddress srcAddr;
        private final EtherType type;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[Ethernet Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Destination address: ");
            sb.append(this.dstAddr);
            sb.append(property);
            sb.append("  Source address: ");
            sb.append(this.srcAddr);
            sb.append(property);
            sb.append("  Type: ");
            sb.append(this.type);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.type.hashCode() + ((this.srcAddr.hashCode() + ((this.dstAddr.hashCode() + 527) * 31)) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!EthernetHeader.class.isInstance(obj)) {
                return false;
            }
            EthernetHeader ethernetHeader = (EthernetHeader) obj;
            return this.dstAddr.equals(ethernetHeader.dstAddr) && this.srcAddr.equals(ethernetHeader.srcAddr) && this.type.equals(ethernetHeader.type);
        }

        public MacAddress getDstAddr() {
            return this.dstAddr;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.dstAddr));
            arrayList.add(ByteArrays.toByteArray(this.srcAddr));
            arrayList.add(ByteArrays.toByteArray(this.type.value().shortValue()));
            return arrayList;
        }

        public MacAddress getSrcAddr() {
            return this.srcAddr;
        }

        public EtherType getType() {
            return this.type;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 14;
        }

        private EthernetHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 14) {
                this.dstAddr = ByteArrays.getMacAddress(bArr, i);
                this.srcAddr = ByteArrays.getMacAddress(bArr, i + 6);
                this.type = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 12)));
            } else {
                StringBuilder sbA = o40.A(100, "The data is too short to build an Ethernet header(14 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
        }

        private EthernetHeader(Builder builder) {
            this.dstAddr = builder.dstAddr;
            this.srcAddr = builder.srcAddr;
            this.type = builder.type;
        }
    }

    private EthernetPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        EthernetHeader ethernetHeader = new EthernetHeader(bArr, i, i2);
        this.header = ethernetHeader;
        if ((ethernetHeader.getType().value().shortValue() & 65535) > 1500) {
            int length = i2 - ethernetHeader.length();
            if (length <= 0) {
                this.payload = null;
                this.pad = new byte[0];
                return;
            }
            int length2 = ethernetHeader.length() + i;
            Packet packet = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, length2, length, ethernetHeader.getType());
            this.payload = packet;
            int length3 = length - packet.length();
            if (length3 > 0) {
                this.pad = ByteArrays.getSubArray(bArr, packet.length() + length2, length3);
                return;
            } else {
                this.pad = new byte[0];
                return;
            }
        }
        short sShortValue = ethernetHeader.getType().value().shortValue();
        int length4 = (i2 - ethernetHeader.length()) - sShortValue;
        int length5 = ethernetHeader.length() + i;
        if (length4 < 0) {
            throw new IllegalRawDataException("The value of the ether type (length) field seems to be wrong: " + ethernetHeader.getType().value());
        }
        if (sShortValue > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, length5, sShortValue, ethernetHeader.getType());
        } else {
            this.payload = null;
        }
        if (length4 > 0) {
            this.pad = ByteArrays.getSubArray(bArr, length5 + sShortValue, length4);
        } else {
            this.pad = new byte[0];
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public EthernetHeader getHeader() {
        return this.header;
    }

    private EthernetPacket(Builder builder) {
        if (builder != null && builder.dstAddr != null && builder.srcAddr != null && builder.type != null) {
            if (builder.paddingAtBuild || builder.pad != null) {
                Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
                this.payload = packetBuild;
                this.header = new EthernetHeader(builder);
                int length = packetBuild != null ? packetBuild.length() : 0;
                if (!builder.paddingAtBuild) {
                    byte[] bArr = new byte[builder.pad.length];
                    this.pad = bArr;
                    System.arraycopy(builder.pad, 0, bArr, 0, builder.pad.length);
                    return;
                } else if (length < MIN_ETHERNET_PAYLOAD_LENGTH) {
                    this.pad = new byte[MIN_ETHERNET_PAYLOAD_LENGTH - length];
                    return;
                } else {
                    this.pad = new byte[0];
                    return;
                }
            }
            throw new NullPointerException("builder.pad must not be null if builder.paddingAtBuild is false");
        }
        throw new NullPointerException("builder: " + builder + " builder.dstAddr: " + builder.dstAddr + " builder.srcAddr: " + builder.srcAddr + " builder.type: " + builder.type);
    }
}
