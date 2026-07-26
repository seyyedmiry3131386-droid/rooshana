package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6ExtDestinationOptionsPacket extends IpV6ExtOptionsPacket {
    private static final long serialVersionUID = -3293888276359687328L;
    private final IpV6ExtDestinationOptionsHeader header;

    public static final class Builder extends IpV6ExtOptionsPacket.Builder {
        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public /* bridge */ /* synthetic */ IpV6ExtOptionsPacket.Builder options(List list) {
            return options((List<IpV6ExtOptionsPacket.IpV6Option>) list);
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder hdrExtLen(byte b) {
            super.hdrExtLen(b);
            return this;
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder nextHeader(IpNumber ipNumber) {
            super.nextHeader(ipNumber);
            return this;
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder
        public Builder options(List<IpV6ExtOptionsPacket.IpV6Option> list) {
            super.options(list);
            return this;
        }

        private Builder(IpV6ExtDestinationOptionsPacket ipV6ExtDestinationOptionsPacket) {
            super(ipV6ExtDestinationOptionsPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtDestinationOptionsPacket build() {
            return new IpV6ExtDestinationOptionsPacket(this);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }
    }

    public static IpV6ExtDestinationOptionsPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader = new IpV6ExtDestinationOptionsHeader(bArr, i, i2);
        int length = i2 - ipV6ExtDestinationOptionsHeader.length();
        return length > 0 ? new IpV6ExtDestinationOptionsPacket(bArr, ipV6ExtDestinationOptionsHeader.length() + i, length, ipV6ExtDestinationOptionsHeader) : new IpV6ExtDestinationOptionsPacket(ipV6ExtDestinationOptionsHeader);
    }

    public static final class IpV6ExtDestinationOptionsHeader extends IpV6ExtOptionsPacket.IpV6ExtOptionsHeader {
        private static final long serialVersionUID = 4686702407537705400L;

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6ExtOptionsHeader
        public String getHeaderName() {
            return "IPv6 Destination Options Header";
        }

        private IpV6ExtDestinationOptionsHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
        }

        private IpV6ExtDestinationOptionsHeader(Builder builder) {
            super(builder);
        }
    }

    private IpV6ExtDestinationOptionsPacket(IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader) {
        this.header = ipV6ExtDestinationOptionsHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtDestinationOptionsHeader getHeader() {
        return this.header;
    }

    private IpV6ExtDestinationOptionsPacket(byte[] bArr, int i, int i2, IpV6ExtDestinationOptionsHeader ipV6ExtDestinationOptionsHeader) {
        super(bArr, i, i2, ipV6ExtDestinationOptionsHeader.getNextHeader());
        this.header = ipV6ExtDestinationOptionsHeader;
    }

    private IpV6ExtDestinationOptionsPacket(Builder builder) {
        super(builder);
        this.header = new IpV6ExtDestinationOptionsHeader(builder);
    }
}
