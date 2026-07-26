package org.pcap4j.packet;

import org.pcap4j.packet.IcmpIdentifiablePacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4InformationRequestPacket extends IcmpIdentifiablePacket {
    private static final long serialVersionUID = 840757374756962085L;
    private final IcmpV4InformationRequestHeader header;

    public static final class Builder extends IcmpIdentifiablePacket.Builder {
        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4InformationRequestPacket build() {
            return new IcmpV4InformationRequestPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder identifier(short s) {
            super.identifier(s);
            return this;
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.Builder
        public Builder sequenceNumber(short s) {
            super.sequenceNumber(s);
            return this;
        }

        private Builder(IcmpV4InformationRequestPacket icmpV4InformationRequestPacket) {
            super(icmpV4InformationRequestPacket);
        }
    }

    public static IcmpV4InformationRequestPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IcmpV4InformationRequestPacket(bArr, i, i2);
    }

    public static final class IcmpV4InformationRequestHeader extends IcmpIdentifiablePacket.IcmpIdentifiableHeader {
        private static final long serialVersionUID = 5499456155277110739L;

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public String getHeaderName() {
            return "ICMPv4 Information Request Header";
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getIdentifier() {
            return super.getIdentifier();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getIdentifierAsInt() {
            return super.getIdentifierAsInt();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ short getSequenceNumber() {
            return super.getSequenceNumber();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader
        public /* bridge */ /* synthetic */ int getSequenceNumberAsInt() {
            return super.getSequenceNumberAsInt();
        }

        @Override // org.pcap4j.packet.IcmpIdentifiablePacket.IcmpIdentifiableHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public /* bridge */ /* synthetic */ int length() {
            return super.length();
        }

        private IcmpV4InformationRequestHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
        }

        private IcmpV4InformationRequestHeader(Builder builder) {
            super(builder);
        }
    }

    private IcmpV4InformationRequestPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new IcmpV4InformationRequestHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IcmpIdentifiablePacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4InformationRequestHeader getHeader() {
        return this.header;
    }

    private IcmpV4InformationRequestPacket(Builder builder) {
        super(builder);
        this.header = new IcmpV4InformationRequestHeader(builder);
    }
}
