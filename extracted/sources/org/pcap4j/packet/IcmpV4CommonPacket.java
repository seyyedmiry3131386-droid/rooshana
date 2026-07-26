package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.IcmpV4Code;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4CommonPacket extends AbstractPacket {
    private static final long serialVersionUID = 7643067752830062365L;
    private final IcmpV4CommonHeader header;
    private final Packet payload;

    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<IcmpV4CommonPacket> {
        private short checksum;
        private IcmpV4Code code;
        private boolean correctChecksumAtBuild;
        private Packet.Builder payloadBuilder;
        private IcmpV4Type type;

        public Builder checksum(short s) {
            this.checksum = s;
            return this;
        }

        public Builder code(IcmpV4Code icmpV4Code) {
            this.code = icmpV4Code;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder type(IcmpV4Type icmpV4Type) {
            this.type = icmpV4Type;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<IcmpV4CommonPacket> correctChecksumAtBuild(boolean z) {
            this.correctChecksumAtBuild = z;
            return this;
        }

        private Builder(IcmpV4CommonPacket icmpV4CommonPacket) {
            this.type = icmpV4CommonPacket.header.type;
            this.code = icmpV4CommonPacket.header.code;
            this.checksum = icmpV4CommonPacket.header.checksum;
            this.payloadBuilder = icmpV4CommonPacket.payload != null ? icmpV4CommonPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4CommonPacket build() {
            return new IcmpV4CommonPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public static final class IcmpV4CommonHeader extends AbstractPacket.AbstractHeader {
        private static final int CHECKSUM_OFFSET = 2;
        private static final int CHECKSUM_SIZE = 2;
        private static final int CODE_OFFSET = 1;
        private static final int CODE_SIZE = 1;
        private static final int ICMPV4_COMMON_HEADER_SIZE = 4;
        private static final int TYPE_OFFSET = 0;
        private static final int TYPE_SIZE = 1;
        private static final long serialVersionUID = 504881105187659087L;
        private final short checksum;
        private final IcmpV4Code code;
        private final IcmpV4Type type;

        private byte[] buildRawData(boolean z) {
            return ByteArrays.concatenate(getRawFields(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short calcChecksum(byte[] bArr, byte[] bArr2) {
            int length = length() + bArr2.length;
            byte[] bArr3 = length % 2 != 0 ? new byte[length + 1] : new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return ByteArrays.calcChecksum(bArr3);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv4 Common Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Type: ");
            sb.append(this.type);
            sb.append(property);
            sb.append("  Code: ");
            sb.append(this.code);
            sb.append(property);
            sb.append("  Checksum: 0x");
            sb.append(ByteArrays.toHexString(this.checksum, ""));
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((this.code.hashCode() + ((this.type.hashCode() + 527) * 31)) * 31) + this.checksum;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!IcmpV4CommonHeader.class.isInstance(obj)) {
                return false;
            }
            IcmpV4CommonHeader icmpV4CommonHeader = (IcmpV4CommonHeader) obj;
            return this.checksum == icmpV4CommonHeader.checksum && this.type.equals(icmpV4CommonHeader.type) && this.code.equals(icmpV4CommonHeader.code);
        }

        public short getChecksum() {
            return this.checksum;
        }

        public IcmpV4Code getCode() {
            return this.code;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            return getRawFields(false);
        }

        public IcmpV4Type getType() {
            return this.type;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private List<byte[]> getRawFields(boolean z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.type.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(this.code.value().byteValue()));
            arrayList.add(ByteArrays.toByteArray(z ? (short) 0 : this.checksum));
            return arrayList;
        }

        private IcmpV4CommonHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                IcmpV4Type icmpV4Type = IcmpV4Type.getInstance(Byte.valueOf(ByteArrays.getByte(bArr, i)));
                this.type = icmpV4Type;
                this.code = IcmpV4Code.getInstance(icmpV4Type.value(), Byte.valueOf(ByteArrays.getByte(bArr, i + 1)));
                this.checksum = ByteArrays.getShort(bArr, i + 2);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv4 common header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV4CommonHeader(Builder builder, byte[] bArr) {
            this.type = builder.type;
            this.code = builder.code;
            if (!builder.correctChecksumAtBuild) {
                this.checksum = builder.checksum;
            } else if (PacketPropertiesLoader.getInstance().icmpV4CalcChecksum()) {
                this.checksum = calcChecksum(buildRawData(true), bArr);
            } else {
                this.checksum = (short) 0;
            }
        }
    }

    public static IcmpV4CommonPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV4CommonPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum(boolean z) {
        Packet packet = this.payload;
        byte[] rawData = packet != null ? packet.getRawData() : new byte[0];
        IcmpV4CommonHeader icmpV4CommonHeader = this.header;
        if (icmpV4CommonHeader.calcChecksum(icmpV4CommonHeader.getRawData(), rawData) == 0) {
            return true;
        }
        return this.header.checksum == 0 && z;
    }

    private IcmpV4CommonPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        IcmpV4CommonHeader icmpV4CommonHeader = new IcmpV4CommonHeader(bArr, i, i2);
        this.header = icmpV4CommonHeader;
        int length = i2 - icmpV4CommonHeader.length();
        if (length > 0) {
            this.payload = (Packet) PacketFactories.getFactory(Packet.class, IcmpV4Type.class).newInstance(bArr, icmpV4CommonHeader.length() + i, length, icmpV4CommonHeader.getType());
        } else {
            this.payload = null;
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4CommonHeader getHeader() {
        return this.header;
    }

    private IcmpV4CommonPacket(Builder builder) {
        if (builder != null && builder.type != null && builder.code != null) {
            Packet packetBuild = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.payload = packetBuild;
            this.header = new IcmpV4CommonHeader(builder, packetBuild != null ? packetBuild.getRawData() : new byte[0]);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.type: " + builder.type + " builder.code: " + builder.code);
    }
}
