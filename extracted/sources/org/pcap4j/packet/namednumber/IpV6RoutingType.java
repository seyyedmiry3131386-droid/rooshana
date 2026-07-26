package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6RoutingType extends NamedNumber<Byte, IpV6RoutingType> {
    public static final IpV6RoutingType NIMROD;
    public static final IpV6RoutingType RPL_SOURCE_ROUTE_HEADER;
    public static final IpV6RoutingType SOURCE_ROUTE;
    public static final IpV6RoutingType TYPE2_ROUTING_HEADER;
    private static final Map<Byte, IpV6RoutingType> registry;
    private static final long serialVersionUID = 3229438606992762639L;

    static {
        IpV6RoutingType ipV6RoutingType = new IpV6RoutingType((byte) 0, "Source Route");
        SOURCE_ROUTE = ipV6RoutingType;
        IpV6RoutingType ipV6RoutingType2 = new IpV6RoutingType((byte) 1, "Nimrod");
        NIMROD = ipV6RoutingType2;
        IpV6RoutingType ipV6RoutingType3 = new IpV6RoutingType((byte) 2, "Type 2 Routing Header");
        TYPE2_ROUTING_HEADER = ipV6RoutingType3;
        IpV6RoutingType ipV6RoutingType4 = new IpV6RoutingType((byte) 3, "RPL Source Route Header");
        RPL_SOURCE_ROUTE_HEADER = ipV6RoutingType4;
        HashMap map = new HashMap();
        registry = map;
        map.put(ipV6RoutingType.value(), ipV6RoutingType);
        map.put(ipV6RoutingType2.value(), ipV6RoutingType2);
        map.put(ipV6RoutingType3.value(), ipV6RoutingType3);
        map.put(ipV6RoutingType4.value(), ipV6RoutingType4);
    }

    public IpV6RoutingType(Byte b, String str) {
        super(b, str);
    }

    public static IpV6RoutingType getInstance(Byte b) {
        Map<Byte, IpV6RoutingType> map = registry;
        return map.containsKey(b) ? map.get(b) : new IpV6RoutingType(b, "unknown");
    }

    public static IpV6RoutingType register(IpV6RoutingType ipV6RoutingType) {
        return registry.put(ipV6RoutingType.value(), ipV6RoutingType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV6RoutingType ipV6RoutingType) {
        return value().compareTo(ipV6RoutingType.value());
    }
}
