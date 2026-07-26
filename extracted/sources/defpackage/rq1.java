package defpackage;

import ir.myket.vpn.vpn.a;
import java.net.Inet4Address;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.pcap4j.packet.IpPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;

/* JADX INFO: loaded from: classes3.dex */
public final class rq1 {
    public final a a;
    public final c24 b = kotlin.a.a(new qq1(0));
    public List c = EmptyList.a;

    public rq1(a aVar) {
        this.a = aVar;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 12;
        while (i < bArr.length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i3 == 0) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(".");
            }
            int i4 = 0;
            while (i4 < i3) {
                if (i2 >= bArr.length) {
                    String string = sb.toString();
                    js3.o(string, "toString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    js3.o(lowerCase, "toLowerCase(...)");
                    return lowerCase;
                }
                sb.append((char) bArr[i2]);
                i4++;
                i2++;
            }
            i = i2;
        }
        String string2 = sb.toString();
        js3.o(string2, "toString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        js3.o(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    public static void c(ByteBuffer byteBuffer, String str) {
        for (String str2 : f88.y0(str, new String[]{"."}, 6)) {
            byteBuffer.put((byte) str2.length());
            byte[] bytes = str2.getBytes(zp0.d);
            js3.o(bytes, "getBytes(...)");
            byteBuffer.put(bytes);
        }
        byteBuffer.put((byte) 0);
    }

    public final void b(IpPacket ipPacket, byte[] bArr) {
        Packet payload = ipPacket.getPayload();
        UdpPacket udpPacket = payload instanceof UdpPacket ? (UdpPacket) payload : null;
        if (udpPacket == null) {
            return;
        }
        UdpPacket.Builder builder = new UdpPacket.Builder(udpPacket);
        builder.srcPort(udpPacket.getHeader().getDstPort());
        builder.dstPort(udpPacket.getHeader().getSrcPort());
        builder.srcAddr(ipPacket.getHeader().getDstAddr());
        builder.dstAddr(ipPacket.getHeader().getSrcAddr());
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild2(true);
        builder.payloadBuilder((Packet.Builder) new UnknownPacket.Builder().rawData(bArr));
        if (ipPacket instanceof IpV4Packet) {
            IpV4Packet ipV4Packet = (IpV4Packet) ipPacket;
            IpV4Packet.Builder builder2 = new IpV4Packet.Builder(ipV4Packet);
            Inet4Address dstAddr = ipV4Packet.getHeader().getDstAddr();
            js3.n(dstAddr, "null cannot be cast to non-null type java.net.Inet4Address");
            builder2.srcAddr(dstAddr);
            Inet4Address srcAddr = ipV4Packet.getHeader().getSrcAddr();
            js3.n(srcAddr, "null cannot be cast to non-null type java.net.Inet4Address");
            builder2.dstAddr(srcAddr);
            builder2.correctChecksumAtBuild(true);
            builder2.correctLengthAtBuild2(true);
            builder2.payloadBuilder((Packet.Builder) builder);
            IpV4Packet ipV4PacketBuild = builder2.build();
            if (ipV4PacketBuild != null) {
                this.a.f.add(ipV4PacketBuild.getRawData());
            }
        }
    }
}
