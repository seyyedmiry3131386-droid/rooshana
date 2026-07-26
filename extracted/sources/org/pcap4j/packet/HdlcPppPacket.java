package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPppPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public class HdlcPppPacket extends AbstractPppPacket {
    private static final long serialVersionUID = -5976235177385846196L;
    private final HdlcPppHeader header;

    public static class Builder extends AbstractPppPacket.Builder {
        private byte address;
        private byte control;

        public Builder address(byte b) {
            this.address = b;
            return this;
        }

        public Builder control(byte b) {
            this.control = b;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public /* bridge */ /* synthetic */ Packet.Builder getPayloadBuilder() {
            return super.getPayloadBuilder();
        }

        public Builder() {
            this.address = (byte) -1;
            this.control = (byte) 3;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public HdlcPppPacket build() {
            return new HdlcPppPacket(this);
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder
        public Builder pad(byte[] bArr) {
            super.pad(bArr);
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder
        public Builder protocol(PppDllProtocol pppDllProtocol) {
            super.protocol(pppDllProtocol);
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }

        private Builder(HdlcPppPacket hdlcPppPacket) {
            super(hdlcPppPacket);
            this.address = (byte) -1;
            this.control = (byte) 3;
            this.address = hdlcPppPacket.header.address;
            this.control = hdlcPppPacket.header.control;
        }
    }

    public static HdlcPppPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new HdlcPppPacket(bArr, i, i2, new HdlcPppHeader(bArr, i, i2));
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.pcap4j.packet.AbstractPppPacket
    public /* bridge */ /* synthetic */ byte[] getPad() {
        return super.getPad();
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static class HdlcPppHeader extends AbstractPppPacket.AbstractPppHeader {
        private static final int ADDRESS_OFFSET = 0;
        private static final int ADDRESS_SIZE = 1;
        private static final int CONTROL_OFFSET = 1;
        private static final int CONTROL_SIZE = 1;
        private static final int HDLC_PPP_HEADER_SIZE = 4;
        private static final int PPP_HEADER_OFFSET = 2;
        private static final long serialVersionUID = -6084002362363168427L;
        private final byte address;
        private final byte control;

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[HDLC-encapsulated PPP Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Address: 0x");
            sb.append(String.format("%02x", Byte.valueOf(this.address)));
            sb.append(property);
            sb.append("  Control: 0x");
            sb.append(String.format("%02x", Byte.valueOf(this.control)));
            sb.append(property);
            sb.append("  Protocol: ");
            sb.append(getProtocol());
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return (((super.calcHashCode() * 31) + this.address) * 31) + this.control;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            HdlcPppHeader hdlcPppHeader = (HdlcPppHeader) obj;
            return this.address == hdlcPppHeader.address && this.control == hdlcPppHeader.control;
        }

        public byte getAddress() {
            return this.address;
        }

        public byte getControl() {
            return this.control;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader
        public /* bridge */ /* synthetic */ PppDllProtocol getProtocol() {
            return super.getProtocol();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.address));
            arrayList.add(ByteArrays.toByteArray(this.control));
            arrayList.add(ByteArrays.toByteArray(getProtocol().value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private HdlcPppHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i + 2, i2 - 2);
            if (i2 >= 4) {
                this.address = ByteArrays.getByte(bArr, i);
                this.control = ByteArrays.getByte(bArr, i + 1);
            } else {
                StringBuilder sbA = o40.A(100, "The data is too short to build an HDLC PPP header(4 bytes). data: ");
                t61.t(i, " ", ", offset: ", sbA, bArr);
                sbA.append(", length: ");
                sbA.append(i2);
                throw new IllegalRawDataException(sbA.toString());
            }
        }

        private HdlcPppHeader(Builder builder) {
            super(builder);
            this.address = builder.address;
            this.control = builder.control;
        }
    }

    private HdlcPppPacket(byte[] bArr, int i, int i2, HdlcPppHeader hdlcPppHeader) throws IllegalRawDataException {
        super(bArr, i, i2, hdlcPppHeader);
        this.header = hdlcPppHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public HdlcPppHeader getHeader() {
        return this.header;
    }

    private HdlcPppPacket(Builder builder) {
        super(builder);
        this.header = new HdlcPppHeader(builder);
    }
}
