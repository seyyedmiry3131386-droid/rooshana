package org.pcap4j.util;

import java.util.Iterator;
import org.pcap4j.packet.ChecksumBuilder;
import org.pcap4j.packet.LengthBuilder;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV6Helper {
    private IcmpV6Helper() {
        throw new AssertionError();
    }

    public static Packet makePacketForInvokingPacketField(Packet packet, int i) {
        Packet next;
        if (packet == null || packet.getHeader() == null || packet.getPayload() == null) {
            throw new NullPointerException("packet: " + packet + " packet.getHeader(): " + packet.getHeader() + " packet.getPayload(): " + packet.getPayload());
        }
        if (packet.length() <= i) {
            return packet;
        }
        int length = packet.getHeader().length();
        Iterator<Packet> it = packet.getPayload().iterator();
        int i2 = length;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                length = i2;
                next = null;
                break;
            }
            next = it.next();
            if (next.getHeader() == null) {
                next.length();
                i3++;
                break;
            }
            int length2 = next.getHeader().length() + length;
            i3++;
            if (length2 > i) {
                break;
            }
            i2 = length;
            length = length2;
        }
        Packet.Builder builder = packet.getBuilder();
        Iterator<Packet.Builder> it2 = builder.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Packet.Builder next2 = it2.next();
            if (next2 instanceof LengthBuilder) {
                ((LengthBuilder) next2).correctLengthAtBuild(false);
            }
            if (next2 instanceof ChecksumBuilder) {
                ((ChecksumBuilder) next2).correctChecksumAtBuild(false);
            }
            i3--;
            if (i3 == 0) {
                int i4 = i - length;
                if (i4 > 0) {
                    next2.payloadBuilder(new UnknownPacket.Builder().rawData(ByteArrays.getSubArray(next.getRawData(), 0, i4)));
                } else {
                    next2.payloadBuilder(null);
                }
            }
        }
        return builder.build();
    }

    public static Packet makePacketForRedirectHeaderOption(Packet packet, int i) {
        if (packet.length() > i) {
            return makePacketForInvokingPacketField(packet, i - (i % 8));
        }
        int length = packet.length();
        return makePacketForInvokingPacketField(packet, length - (length % 8));
    }
}
