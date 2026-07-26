package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.Packet;

/* JADX INFO: loaded from: classes4.dex */
interface PacketInstantiater {
    Class<? extends Packet> getTargetClass();

    Packet newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException;
}
