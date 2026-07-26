package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.IpV6ExtOptionsPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6ExtHopByHopOptionsPacket extends IpV6ExtOptionsPacket {
    private static final long serialVersionUID = 4289988881526919621L;
    private final IpV6ExtHopByHopOptionsHeader header;

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

        private Builder(IpV6ExtHopByHopOptionsPacket ipV6ExtHopByHopOptionsPacket) {
            super(ipV6ExtHopByHopOptionsPacket);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IpV6ExtHopByHopOptionsPacket build() {
            return new IpV6ExtHopByHopOptionsPacket(this);
        }

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            super.payloadBuilder(builder);
            return this;
        }
    }

    public static IpV6ExtHopByHopOptionsPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader = new IpV6ExtHopByHopOptionsHeader(bArr, i, i2);
        int length = i2 - ipV6ExtHopByHopOptionsHeader.length();
        return length > 0 ? new IpV6ExtHopByHopOptionsPacket(bArr, ipV6ExtHopByHopOptionsHeader.length() + i, length, ipV6ExtHopByHopOptionsHeader) : new IpV6ExtHopByHopOptionsPacket(ipV6ExtHopByHopOptionsHeader);
    }

    public static final class IpV6ExtHopByHopOptionsHeader extends IpV6ExtOptionsPacket.IpV6ExtOptionsHeader {
        private static final long serialVersionUID = -3903426584619413207L;

        @Override // org.pcap4j.packet.IpV6ExtOptionsPacket.IpV6ExtOptionsHeader
        public String getHeaderName() {
            return "IPv6 Hop-by-Hop Options Header";
        }

        private IpV6ExtHopByHopOptionsHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
        }

        private IpV6ExtHopByHopOptionsHeader(Builder builder) {
            super(builder);
        }
    }

    private IpV6ExtHopByHopOptionsPacket(IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader) {
        this.header = ipV6ExtHopByHopOptionsHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.IpV6ExtOptionsPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IpV6ExtHopByHopOptionsHeader getHeader() {
        return this.header;
    }

    private IpV6ExtHopByHopOptionsPacket(byte[] bArr, int i, int i2, IpV6ExtHopByHopOptionsHeader ipV6ExtHopByHopOptionsHeader) {
        super(bArr, i, i2, ipV6ExtHopByHopOptionsHeader.getNextHeader());
        this.header = ipV6ExtHopByHopOptionsHeader;
    }

    private IpV6ExtHopByHopOptionsPacket(Builder builder) {
        super(builder);
        this.header = new IpV6ExtHopByHopOptionsHeader(builder);
    }
}
