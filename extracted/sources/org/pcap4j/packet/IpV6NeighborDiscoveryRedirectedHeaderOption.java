package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import java.util.Arrays;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpV6NeighborDiscoveryOptionType;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6NeighborDiscoveryRedirectedHeaderOption implements IcmpV6CommonPacket.IpV6NeighborDiscoveryOption {
    private static final int IP_HEADER_OFFSET = 8;
    private static final int LENGTH_OFFSET = 1;
    private static final int LENGTH_SIZE = 1;
    private static final int RESERVED_OFFSET = 2;
    private static final int RESERVED_SIZE = 6;
    private static final int TYPE_OFFSET = 0;
    private static final int TYPE_SIZE = 1;
    private static final long serialVersionUID = 8049779415539820332L;
    private final Packet ipPacket;
    private final byte length;
    private final byte[] reserved;
    private final IpV6NeighborDiscoveryOptionType type;

    public static final class Builder implements LengthBuilder<IpV6NeighborDiscoveryRedirectedHeaderOption> {
        private boolean correctLengthAtBuild;
        private Packet ipPacket;
        private byte length;
        private byte[] reserved;

        public Builder ipPacket(Packet packet) {
            this.ipPacket = packet;
            return this;
        }

        public Builder length(byte b) {
            this.length = b;
            return this;
        }

        public Builder reserved(byte[] bArr) {
            this.reserved = bArr;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public IpV6NeighborDiscoveryRedirectedHeaderOption build() {
            return new IpV6NeighborDiscoveryRedirectedHeaderOption(this);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<IpV6NeighborDiscoveryRedirectedHeaderOption> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        private Builder(IpV6NeighborDiscoveryRedirectedHeaderOption ipV6NeighborDiscoveryRedirectedHeaderOption) {
            this.length = ipV6NeighborDiscoveryRedirectedHeaderOption.length;
            this.reserved = ipV6NeighborDiscoveryRedirectedHeaderOption.reserved;
            this.ipPacket = ipV6NeighborDiscoveryRedirectedHeaderOption.ipPacket;
        }
    }

    public static IpV6NeighborDiscoveryRedirectedHeaderOption newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new IpV6NeighborDiscoveryRedirectedHeaderOption(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!IpV6NeighborDiscoveryRedirectedHeaderOption.class.isInstance(obj)) {
            return false;
        }
        IpV6NeighborDiscoveryRedirectedHeaderOption ipV6NeighborDiscoveryRedirectedHeaderOption = (IpV6NeighborDiscoveryRedirectedHeaderOption) obj;
        return this.length == ipV6NeighborDiscoveryRedirectedHeaderOption.length && this.ipPacket.equals(ipV6NeighborDiscoveryRedirectedHeaderOption.ipPacket) && Arrays.equals(this.reserved, ipV6NeighborDiscoveryRedirectedHeaderOption.reserved);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Packet getIpPacket() {
        return this.ipPacket;
    }

    public byte getLength() {
        return this.length;
    }

    public int getLengthAsInt() {
        return this.length & 255;
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getType().value().byteValue();
        bArr[1] = this.length;
        System.arraycopy(this.reserved, 0, bArr, 2, 6);
        System.arraycopy(this.ipPacket.getRawData(), 0, bArr, 8, this.ipPacket.length());
        return bArr;
    }

    public byte[] getReserved() {
        return ByteArrays.clone(this.reserved);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public IpV6NeighborDiscoveryOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.ipPacket.hashCode() + ((Arrays.hashCode(this.reserved) + ((527 + this.length) * 31)) * 31);
    }

    @Override // org.pcap4j.packet.IcmpV6CommonPacket.IpV6NeighborDiscoveryOption
    public int length() {
        return this.ipPacket.length() + 8;
    }

    public String toString() {
        return "[Type: " + getType() + "] [Length: " + getLengthAsInt() + " (" + (getLengthAsInt() * 8) + " bytes)] [Reserved: " + ByteArrays.toHexString(this.reserved, " ") + "] [IP header + data: {" + this.ipPacket + "}]";
    }

    private IpV6NeighborDiscoveryRedirectedHeaderOption(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.type = IpV6NeighborDiscoveryOptionType.REDIRECTED_HEADER;
        if (i2 < 48) {
            StringBuilder sbA = o40.A(50, "The raw data length must be more than 47. rawData: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        if (bArr[i] != getType().value().byteValue()) {
            StringBuilder sbA2 = o40.A(100, "The type must be: ");
            sbA2.append(getType().valueAsString());
            sbA2.append(" rawData: ");
            sbA2.append(ByteArrays.toHexString(bArr, " "));
            sbA2.append(", offset: ");
            sbA2.append(i);
            sbA2.append(", length: ");
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }
        this.length = bArr[i + 1];
        int lengthAsInt = getLengthAsInt() * 8;
        if (i2 < lengthAsInt) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("The raw data is too short to build this option. ");
            sb.append(lengthAsInt);
            sb.append(" bytes data is needed. data: ");
            t61.t(i, " ", ", offset: ", sb, bArr);
            sb.append(", length: ");
            sb.append(i2);
            throw new IllegalRawDataException(sb.toString());
        }
        if (lengthAsInt < 8) {
            StringBuilder sbA3 = o40.A(100, "The length field value must be equal or more than1but it is: ");
            sbA3.append(getLengthAsInt());
            throw new IllegalRawDataException(sbA3.toString());
        }
        this.reserved = ByteArrays.getSubArray(bArr, i + 2, 6);
        Packet packetBuild = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i + 8, lengthAsInt - 8, EtherType.IPV6);
        if (packetBuild instanceof IllegalPacket) {
            this.ipPacket = packetBuild;
            return;
        }
        if (packetBuild.contains(IllegalPacket.class)) {
            Packet.Builder builder = packetBuild.getBuilder();
            byte[] rawData = ((IllegalPacket) packetBuild.get(IllegalPacket.class)).getRawData();
            builder.getOuterOf(IllegalPacket.Builder.class).payloadBuilder(((Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(rawData, 0, rawData.length)).getBuilder());
            for (Packet.Builder builder2 : builder) {
                if (builder2 instanceof LengthBuilder) {
                    ((LengthBuilder) builder2).correctLengthAtBuild2(false);
                }
                if (builder2 instanceof ChecksumBuilder) {
                    ((ChecksumBuilder) builder2).correctChecksumAtBuild(false);
                }
            }
            packetBuild = builder.build();
        }
        this.ipPacket = packetBuild;
    }

    private IpV6NeighborDiscoveryRedirectedHeaderOption(Builder builder) {
        this.type = IpV6NeighborDiscoveryOptionType.REDIRECTED_HEADER;
        if (builder != null && builder.reserved != null && builder.ipPacket != null) {
            if (builder.reserved.length == 6) {
                this.reserved = ByteArrays.clone(builder.reserved);
                Packet packet = builder.ipPacket;
                this.ipPacket = packet;
                if (!builder.correctLengthAtBuild) {
                    this.length = builder.length;
                    return;
                } else if (length() % 8 == 0) {
                    this.length = (byte) (length() / 8);
                    return;
                } else {
                    throw new IllegalArgumentException("ipPacket's length is invalid. ipPacket: " + ByteArrays.toHexString(packet.getRawData(), " "));
                }
            }
            throw new IllegalArgumentException("Invalid reserved: " + ByteArrays.toHexString(builder.reserved, " "));
        }
        throw new NullPointerException("builder: " + builder + " builder.reserved: " + builder.reserved + " builder.ipPacket: " + builder.ipPacket);
    }
}
