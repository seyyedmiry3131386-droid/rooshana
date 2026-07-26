package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class PppSelector extends AbstractPacket {
    private static final long serialVersionUID = -1;

    private PppSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return bArr[i] == -1 ? (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(bArr, i, i2, DataLinkType.PPP_SERIAL) : PppPacket.newPacket(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}
