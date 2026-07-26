package defpackage;

import java.net.DatagramSocket;
import org.pcap4j.packet.IpPacket;

/* JADX INFO: loaded from: classes3.dex */
public final class vb9 {
    public final DatagramSocket a;
    public final IpPacket b;
    public final long c = System.currentTimeMillis();

    public vb9(DatagramSocket datagramSocket, IpPacket ipPacket) {
        this.a = datagramSocket;
        this.b = ipPacket;
    }
}
