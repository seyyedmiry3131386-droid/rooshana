package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4TosTos extends NamedNumber<Byte, IpV4TosTos> {
    public static final IpV4TosTos DEFAULT;
    public static final IpV4TosTos MAXIMIZE_RELIABILITY;
    public static final IpV4TosTos MAXIMIZE_SECURITY;
    public static final IpV4TosTos MAXIMIZE_THROUGHPUT;
    public static final IpV4TosTos MINIMIZE_DELAY;
    public static final IpV4TosTos MINIMIZE_MONETARY_COST;
    private static final Map<Byte, IpV4TosTos> registry;
    private static final long serialVersionUID = -7507790549660176346L;

    static {
        IpV4TosTos ipV4TosTos = new IpV4TosTos((byte) 0, "Default");
        DEFAULT = ipV4TosTos;
        IpV4TosTos ipV4TosTos2 = new IpV4TosTos((byte) 1, "Minimize Monetary Cost");
        MINIMIZE_MONETARY_COST = ipV4TosTos2;
        IpV4TosTos ipV4TosTos3 = new IpV4TosTos((byte) 2, "Maximize Reliability");
        MAXIMIZE_RELIABILITY = ipV4TosTos3;
        IpV4TosTos ipV4TosTos4 = new IpV4TosTos((byte) 4, "Maximize Throughput");
        MAXIMIZE_THROUGHPUT = ipV4TosTos4;
        IpV4TosTos ipV4TosTos5 = new IpV4TosTos((byte) 8, "Minimize Delay");
        MINIMIZE_DELAY = ipV4TosTos5;
        IpV4TosTos ipV4TosTos6 = new IpV4TosTos((byte) 15, "Maximize Security");
        MAXIMIZE_SECURITY = ipV4TosTos6;
        HashMap map = new HashMap();
        registry = map;
        map.put(ipV4TosTos.value(), ipV4TosTos);
        map.put(ipV4TosTos2.value(), ipV4TosTos2);
        map.put(ipV4TosTos3.value(), ipV4TosTos3);
        map.put(ipV4TosTos4.value(), ipV4TosTos4);
        map.put(ipV4TosTos5.value(), ipV4TosTos5);
        map.put(ipV4TosTos6.value(), ipV4TosTos6);
    }

    public IpV4TosTos(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b + " is invalid value. TOS field of IPv4 TOS must be between 0 and 15");
    }

    public static IpV4TosTos getInstance(Byte b) {
        Map<Byte, IpV4TosTos> map = registry;
        return map.containsKey(b) ? map.get(b) : new IpV4TosTos(b, "unknown");
    }

    public static IpV4TosTos register(IpV4TosTos ipV4TosTos) {
        return registry.put(ipV4TosTos.value(), ipV4TosTos);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4TosTos ipV4TosTos) {
        return value().compareTo(ipV4TosTos.value());
    }
}
