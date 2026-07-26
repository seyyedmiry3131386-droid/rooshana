package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractPppPacket extends AbstractPacket {
    private static final long serialVersionUID = 9184646119975504414L;
    private final byte[] pad;
    private final Packet payload;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private byte[] pad;
        private Packet.Builder payloadBuilder;
        private PppDllProtocol protocol;

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        public Builder pad(byte[] bArr) {
            this.pad = bArr;
            return this;
        }

        public Builder protocol(PppDllProtocol pppDllProtocol) {
            this.protocol = pppDllProtocol;
            return this;
        }

        public Builder(AbstractPppPacket abstractPppPacket) {
            this.protocol = abstractPppPacket.getHeader().protocol;
            this.payloadBuilder = abstractPppPacket.payload != null ? abstractPppPacket.payload.getBuilder() : null;
            this.pad = abstractPppPacket.pad;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }
    }

    public AbstractPppPacket(byte[] bArr, int i, int i2, AbstractPppHeader abstractPppHeader) throws IllegalRawDataException {
        int length = i2 - abstractPppHeader.length();
        if (length <= 0) {
            this.payload = null;
            this.pad = new byte[0];
            return;
        }
        int length2 = i + abstractPppHeader.length();
        Packet packet = (Packet) PacketFactories.getFactory(Packet.class, PppDllProtocol.class).newInstance(bArr, length2, length, abstractPppHeader.getProtocol());
        this.payload = packet;
        int length3 = length - packet.length();
        if (length3 > 0) {
            this.pad = ByteArrays.getSubArray(bArr, packet.length() + length2, length3);
        } else {
            this.pad = new byte[0];
        }
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
        sb.append(getHeader().toString());
        Packet packet = this.payload;
        if (packet != null) {
            sb.append(packet.toString());
        }
        if (this.pad.length != 0) {
            String property = System.getProperty("line.separator");
            sb.append("[PPP Pad (");
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
            return Arrays.equals(this.pad, ((AbstractPppPacket) obj).pad);
        }
        return false;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public abstract AbstractPppHeader getHeader();

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

    public static abstract class AbstractPppHeader extends AbstractPacket.AbstractHeader {
        static final int PPP_HEADER_SIZE = 2;
        private static final int PROTOCOL_OFFSET = 0;
        private static final int PROTOCOL_SIZE = 2;
        private static final long serialVersionUID = -9126636226651383452L;
        private final PppDllProtocol protocol;

        public AbstractPppHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 < 2) {
                this.protocol = null;
                return;
            }
            try {
                this.protocol = PppDllProtocol.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i)));
            } catch (IllegalArgumentException e) {
                throw new IllegalRawDataException(e);
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[PPP Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Protocol: ");
            sb.append(this.protocol);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.protocol.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (getClass().isInstance(obj)) {
                return this.protocol.equals(((AbstractPppHeader) obj).protocol);
            }
            return false;
        }

        public PppDllProtocol getProtocol() {
            return this.protocol;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.protocol.value().shortValue()));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 2;
        }

        public AbstractPppHeader(Builder builder) {
            this.protocol = builder.protocol;
        }
    }

    public AbstractPppPacket(Builder builder) {
        if (builder != null && builder.protocol != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            if (builder.pad != null && builder.pad.length != 0) {
                byte[] bArr = new byte[builder.pad.length];
                this.pad = bArr;
                System.arraycopy(builder.pad, 0, bArr, 0, builder.pad.length);
                return;
            }
            this.pad = new byte[0];
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.protocol: " + builder.protocol);
    }
}
