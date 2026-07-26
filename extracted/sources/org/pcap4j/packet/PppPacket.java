package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import org.pcap4j.packet.AbstractPppPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.PppDllProtocol;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public class PppPacket extends AbstractPppPacket {
    private static final long serialVersionUID = 6735517864342242611L;
    private final PppHeader header;

    public static class Builder extends AbstractPppPacket.Builder {
        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public /* bridge */ /* synthetic */ Packet.Builder getPayloadBuilder() {
            return super.getPayloadBuilder();
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public PppPacket build() {
            return new PppPacket(this);
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

        private Builder(PppPacket pppPacket) {
            super(pppPacket);
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }
    }

    public static PppPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new PppPacket(bArr, i, i2, new PppHeader(bArr, i, i2));
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

    public static class PppHeader extends AbstractPppPacket.AbstractPppHeader {
        private static final long serialVersionUID = -8271596051012324861L;

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader
        public /* bridge */ /* synthetic */ PppDllProtocol getProtocol() {
            return super.getProtocol();
        }

        @Override // org.pcap4j.packet.AbstractPppPacket.AbstractPppHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public /* bridge */ /* synthetic */ int length() {
            return super.length();
        }

        private PppHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
            if (i2 >= 2) {
                return;
            }
            StringBuilder sbA = o40.A(100, "The data is too short to build an PPP header(2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private PppHeader(Builder builder) {
            super(builder);
        }
    }

    private PppPacket(byte[] bArr, int i, int i2, PppHeader pppHeader) throws IllegalRawDataException {
        super(bArr, i, i2, pppHeader);
        this.header = pppHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPppPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public PppHeader getHeader() {
        return this.header;
    }

    private PppPacket(Builder builder) {
        super(builder);
        this.header = new PppHeader(builder);
    }
}
