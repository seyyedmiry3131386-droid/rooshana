package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsClass extends NamedNumber<Short, DnsClass> {
    public static final DnsClass ANY;
    public static final DnsClass CH;
    public static final DnsClass HS;
    public static final DnsClass IN;
    public static final DnsClass NONE;
    private static final Map<Short, DnsClass> registry;
    private static final long serialVersionUID = -8563135157139346618L;

    static {
        DnsClass dnsClass = new DnsClass((short) 1, "Internet (IN)");
        IN = dnsClass;
        DnsClass dnsClass2 = new DnsClass((short) 3, "Chaos (CH)");
        CH = dnsClass2;
        DnsClass dnsClass3 = new DnsClass((short) 4, "Hesiod (HS)");
        HS = dnsClass3;
        DnsClass dnsClass4 = new DnsClass((short) 254, "NONE");
        NONE = dnsClass4;
        DnsClass dnsClass5 = new DnsClass((short) 255, "ANY");
        ANY = dnsClass5;
        HashMap map = new HashMap();
        registry = map;
        map.put(dnsClass.value(), dnsClass);
        map.put(dnsClass2.value(), dnsClass2);
        map.put(dnsClass3.value(), dnsClass3);
        map.put(dnsClass4.value(), dnsClass4);
        map.put(dnsClass5.value(), dnsClass5);
    }

    public DnsClass(Short sh, String str) {
        super(sh, str);
    }

    public static DnsClass getInstance(Short sh) {
        Map<Short, DnsClass> map = registry;
        return map.containsKey(sh) ? map.get(sh) : new DnsClass(sh, "unknown");
    }

    public static DnsClass register(DnsClass dnsClass) {
        return registry.put(dnsClass.value(), dnsClass);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().shortValue() & 65535);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsClass dnsClass) {
        return value().compareTo(dnsClass.value());
    }
}
