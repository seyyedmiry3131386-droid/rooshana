package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4RedirectPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = 5987521162450318499L;
    private final IcmpV4RedirectHeader header;

    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private Inet4Address gatewayInternetAddress;

        public Builder gatewayInternetAddress(Inet4Address inet4Address) {
            this.gatewayInternetAddress = inet4Address;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4RedirectPacket build() {
            return new IcmpV4RedirectPacket(this);
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }

        private Builder(IcmpV4RedirectPacket icmpV4RedirectPacket) {
            super(icmpV4RedirectPacket);
            this.gatewayInternetAddress = icmpV4RedirectPacket.header.gatewayInternetAddress;
        }
    }

    public static IcmpV4RedirectPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        IcmpV4RedirectHeader icmpV4RedirectHeader = new IcmpV4RedirectHeader(bArr, i, i2);
        int length = i2 - icmpV4RedirectHeader.length();
        return length > 0 ? new IcmpV4RedirectPacket(icmpV4RedirectHeader, bArr, icmpV4RedirectHeader.length() + i, length) : new IcmpV4RedirectPacket(icmpV4RedirectHeader);
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }

    public static final class IcmpV4RedirectHeader extends AbstractPacket.AbstractHeader {
        private static final int GATEWAY_INTERNET_ADDRESS_OFFSET = 0;
        private static final int GATEWAY_INTERNET_ADDRESS_SIZE = 4;
        private static final int ICMPV4_REDIRECT_HEADER_SIZE = 4;
        private static final long serialVersionUID = -7093717116891501880L;
        private final Inet4Address gatewayInternetAddress;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[ICMPv4 Redirect Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  Gateway Internet Address: ");
            sb.append(this.gatewayInternetAddress);
            sb.append(property);
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.gatewayInternetAddress.hashCode() + 527;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (IcmpV4RedirectHeader.class.isInstance(obj)) {
                return this.gatewayInternetAddress.equals(((IcmpV4RedirectHeader) obj).gatewayInternetAddress);
            }
            return false;
        }

        public Inet4Address getGatewayInternetAddress() {
            return this.gatewayInternetAddress;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.gatewayInternetAddress));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }

        private IcmpV4RedirectHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 4) {
                this.gatewayInternetAddress = ByteArrays.getInet4Address(bArr, i);
                return;
            }
            StringBuilder sbA = o40.A(80, "The data is too short to build an ICMPv4 Redirect Header(4 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }

        private IcmpV4RedirectHeader(Builder builder) {
            this.gatewayInternetAddress = builder.gatewayInternetAddress;
        }
    }

    private IcmpV4RedirectPacket(IcmpV4RedirectHeader icmpV4RedirectHeader) {
        this.header = icmpV4RedirectHeader;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4RedirectHeader getHeader() {
        return this.header;
    }

    private IcmpV4RedirectPacket(IcmpV4RedirectHeader icmpV4RedirectHeader, byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        this.header = icmpV4RedirectHeader;
    }

    private IcmpV4RedirectPacket(Builder builder) {
        super(builder);
        if (builder.gatewayInternetAddress != null) {
            this.header = new IcmpV4RedirectHeader(builder);
        } else {
            throw new NullPointerException("builder.gatewayInternetAddress: " + builder.gatewayInternetAddress);
        }
    }
}
