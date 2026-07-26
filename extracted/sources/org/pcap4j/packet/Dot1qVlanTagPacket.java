package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot1qVlanTagPacket extends AbstractPacket {
    private static final long serialVersionUID = 1522789079803339400L;
    private final Dot1qVlanTagHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private boolean cfi;
        private Packet.Builder payloadBuilder;
        private byte priority;
        private EtherType type;
        private short vid;

        public Builder cfi(boolean z) {
            this.cfi = z;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder priority(byte b) {
            this.priority = b;
            return this;
        }

        public Builder type(EtherType etherType) {
            this.type = etherType;
            return this;
        }

        public Builder vid(short s) {
            this.vid = s;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Dot1qVlanTagPacket build() {
            return new Dot1qVlanTagPacket(this);
        }

        private Builder(Dot1qVlanTagPacket dot1qVlanTagPacket) {
            this.priority = dot1qVlanTagPacket.header.priority;
            this.cfi = dot1qVlanTagPacket.header.cfi;
            this.vid = dot1qVlanTagPacket.header.vid;
            this.type = dot1qVlanTagPacket.header.type;
            this.payloadBuilder = dot1qVlanTagPacket.payload != null ? dot1qVlanTagPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static Dot1qVlanTagPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot1qVlanTagPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public static final class Dot1qVlanTagHeader extends AbstractPacket.AbstractHeader {
        private static final int DOT1Q_TAG_HEADER_SIZE = 4;
        private static final int PRIORITY_AND_CFI_AND_VID_OFFSET = 0;
        private static final int PRIORITY_AND_CFI_AND_VID_SIZE = 2;
        private static final int TYPE_OFFSET = 2;
        private static final int TYPE_SIZE = 2;
        private static final long serialVersionUID = 7130569411806479522L;
        private final boolean cfi;
        private final byte priority;
        private final EtherType type;
        private final short vid;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[IEEE802.1Q Tag header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Priority: ");
            sb.append((int) this.priority);
            sb.append(property);
            sb.append("  CFI: ");
            sb.append(this.cfi ? 1 : 0);
            sb.append(property);
            sb.append("  VID: ");
            sb.append(getVidAsInt());
            sb.append(property);
            sb.append("  Type: ");
            sb.append(this.type);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.type.hashCode() + ((((((527 + this.priority) * 31) + (this.cfi ? 1231 : 1237)) * 31) + this.vid) * 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!Dot1qVlanTagHeader.class.isInstance(obj)) {
                return false;
            }
            Dot1qVlanTagHeader dot1qVlanTagHeader = (Dot1qVlanTagHeader) obj;
            return this.vid == dot1qVlanTagHeader.vid && this.type.equals(dot1qVlanTagHeader.type) && this.priority == dot1qVlanTagHeader.priority && this.cfi == dot1qVlanTagHeader.cfi;
        }

        public boolean getCfi() {
            return this.cfi;
        }

        public byte getPriority() {
            return this.priority;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray((short) ((this.priority << 13) | ((this.cfi ? 1 : 0) << 12) | this.vid)));
            arrayList.add(ByteArrays.toByteArray(this.type.value().shortValue()));
            return arrayList;
        }

        public EtherType getType() {
            return this.type;
        }

        public short getVid() {
            return this.vid;
        }

        public int getVidAsInt() {
            return this.vid & 4095;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private Dot1qVlanTagHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                short s = ByteArrays.getShort(bArr, i);
                this.priority = (byte) ((57344 & s) >> 13);
                this.cfi = ((s & 4096) >> 12) == 1;
                this.vid = (short) (s & 4095);
                this.type = EtherType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + 2)));
                return;
            }
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an IEEE802.1Q Tag header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private Dot1qVlanTagHeader(Builder builder) {
            if ((builder.priority & 248) == 0) {
                if ((builder.vid & 61440) == 0) {
                    this.priority = builder.priority;
                    this.cfi = builder.cfi;
                    this.vid = builder.vid;
                    this.type = builder.type;
                    return;
                }
                throw new IllegalArgumentException("invalid vid: " + ((int) builder.vid));
            }
            throw new IllegalArgumentException("invalid priority: " + ((int) builder.priority));
        }
    }

    private Dot1qVlanTagPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        Dot1qVlanTagHeader dot1qVlanTagHeader = new Dot1qVlanTagHeader(bArr, i, i2);
        this.header = dot1qVlanTagHeader;
        int length = i2 - dot1qVlanTagHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, dot1qVlanTagHeader.length() + i, length, dot1qVlanTagHeader.getType());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Dot1qVlanTagHeader getHeader() {
        return this.header;
    }

    private Dot1qVlanTagPacket(Builder builder) {
        if (builder != null && builder.type != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new Dot1qVlanTagHeader(builder);
        } else {
            throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type);
        }
    }
}
