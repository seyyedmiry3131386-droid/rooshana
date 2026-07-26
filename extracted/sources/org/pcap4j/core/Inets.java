package org.pcap4j.core;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.pcap4j.Pcap4jPropertiesLoader;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Inets {
    public static final short AF_UNSPEC = 0;
    public static final short AF_INET = Pcap4jPropertiesLoader.getInstance().getAfInet().shortValue();
    public static final short AF_INET6 = Pcap4jPropertiesLoader.getInstance().getAfInet6().shortValue();
    public static final short AF_PACKET = Pcap4jPropertiesLoader.getInstance().getAfPacket().shortValue();
    public static final short AF_LINK = Pcap4jPropertiesLoader.getInstance().getAfLink().shortValue();

    private Inets() {
        throw new AssertionError();
    }

    public static Inet4Address itoInetAddress(int i) {
        return ByteArrays.getInet4Address(ByteArrays.toByteArray(i, NativeMappings.NATIVE_BYTE_ORDER), 0);
    }

    public static Inet4Address ntoInetAddress(NativeMappings.in_addr in_addrVar) {
        if (in_addrVar == null) {
            return null;
        }
        return itoInetAddress(in_addrVar.s_addr);
    }

    public static Inet6Address ntoInetAddress(NativeMappings.in6_addr in6_addrVar) {
        if (in6_addrVar == null) {
            return null;
        }
        try {
            return (Inet6Address) InetAddress.getByAddress(in6_addrVar.s6_addr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }
}
