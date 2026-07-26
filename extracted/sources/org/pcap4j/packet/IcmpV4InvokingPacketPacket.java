package org.pcap4j.packet;

import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.NotApplicable;

/* JADX INFO: loaded from: classes4.dex */
abstract class IcmpV4InvokingPacketPacket extends AbstractPacket {
    private static final long serialVersionUID = -739710899445035385L;
    private final Packet payload;

    public static abstract class Builder extends AbstractPacket.AbstractBuilder {
        private Packet payload;

        public Builder() {
        }

        public Builder payload(Packet packet) {
            this.payload = packet;
            return this;
        }

        public Builder(IcmpV4InvokingPacketPacket icmpV4InvokingPacketPacket) {
            this.payload = icmpV4InvokingPacketPacket.payload;
        }
    }

    public IcmpV4InvokingPacketPacket() {
        this.payload = null;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public IcmpV4InvokingPacketPacket(byte[] bArr, int i, int i2) {
        Packet packet = (Packet) PacketFactories.getFactory(Packet.class, EtherType.class).newInstance(bArr, i, i2, EtherType.IPV4);
        if (packet instanceof IllegalPacket) {
            this.payload = packet;
            return;
        }
        if (packet.contains(IllegalPacket.class)) {
            Packet.Builder builder = packet.getBuilder();
            byte[] rawData = ((IllegalPacket) packet.get(IllegalPacket.class)).getRawData();
            builder.getOuterOf(IllegalPacket.Builder.class).payloadBuilder(((Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(rawData, 0, rawData.length, NotApplicable.UNKNOWN)).getBuilder());
            for (Packet.Builder builder2 : builder) {
                if (builder2 instanceof LengthBuilder) {
                    ((LengthBuilder) builder2).correctLengthAtBuild2(false);
                }
                if (builder2 instanceof ChecksumBuilder) {
                    ((ChecksumBuilder) builder2).correctChecksumAtBuild(false);
                }
            }
            this.payload = builder.build();
            return;
        }
        this.payload = packet;
    }

    public IcmpV4InvokingPacketPacket(Builder builder) {
        if (builder != null) {
            this.payload = builder.payload;
        } else {
            throw new NullPointerException("builder: " + builder);
        }
    }
}
