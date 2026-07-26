package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.Dot11FrameType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11Selector extends AbstractPacket {
    private static final long serialVersionUID = -4770251478963995769L;

    private Dot11Selector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return (Packet) PacketFactories.getFactory(Packet.class, Dot11FrameType.class).newInstance(bArr, i, i2, Dot11FrameControl.newInstance(bArr, i, i2).getType());
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
