package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class IpVersion extends NamedNumber<Byte, IpVersion> {
    public static final IpVersion IPV4;
    public static final IpVersion IPV6;
    public static final IpVersion PIP;
    public static final IpVersion ST;
    public static final IpVersion TP_IX;
    public static final IpVersion TUBA;
    private static final Map<Byte, IpVersion> registry;
    private static final long serialVersionUID = 3155818580398801532L;

    static {
        IpVersion ipVersion = new IpVersion((byte) 4, "IPv4");
        IPV4 = ipVersion;
        IpVersion ipVersion2 = new IpVersion((byte) 5, "ST");
        ST = ipVersion2;
        IpVersion ipVersion3 = new IpVersion((byte) 6, "IPv6");
        IPV6 = ipVersion3;
        IpVersion ipVersion4 = new IpVersion((byte) 7, "TP/IX");
        TP_IX = ipVersion4;
        IpVersion ipVersion5 = new IpVersion((byte) 8, "PIP");
        PIP = ipVersion5;
        IpVersion ipVersion6 = new IpVersion((byte) 9, "TUBA");
        TUBA = ipVersion6;
        HashMap map = new HashMap();
        registry = map;
        map.put(ipVersion.value(), ipVersion);
        map.put(ipVersion2.value(), ipVersion2);
        map.put(ipVersion3.value(), ipVersion3);
        map.put(ipVersion4.value(), ipVersion4);
        map.put(ipVersion5.value(), ipVersion5);
        map.put(ipVersion6.value(), ipVersion6);
    }

    public IpVersion(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b + " is invalid value. Version field of IP header must be between 0 and 15");
    }

    public static IpVersion getInstance(Byte b) {
        Map<Byte, IpVersion> map = registry;
        return map.containsKey(b) ? map.get(b) : new IpVersion(b, "unknown");
    }

    public static IpVersion register(IpVersion ipVersion) {
        return registry.put(ipVersion.value(), ipVersion);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpVersion ipVersion) {
        return value().compareTo(ipVersion.value());
    }
}
