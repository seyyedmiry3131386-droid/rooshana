package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4SecurityOptionCompartments extends NamedNumber<Short, IpV4SecurityOptionCompartments> {
    public static final IpV4SecurityOptionCompartments NOT_COMPARTMENTED;
    private static final Map<Short, IpV4SecurityOptionCompartments> registry;
    private static final long serialVersionUID = -420949071267484565L;

    static {
        IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments = new IpV4SecurityOptionCompartments((short) 0, "not compartmented");
        NOT_COMPARTMENTED = ipV4SecurityOptionCompartments;
        HashMap map = new HashMap();
        registry = map;
        map.put(ipV4SecurityOptionCompartments.value(), ipV4SecurityOptionCompartments);
    }

    public IpV4SecurityOptionCompartments(Short sh, String str) {
        super(sh, str);
    }

    public static IpV4SecurityOptionCompartments getInstance(Short sh) {
        Map<Short, IpV4SecurityOptionCompartments> map = registry;
        return map.containsKey(sh) ? map.get(sh) : new IpV4SecurityOptionCompartments(sh, "unknown");
    }

    public static IpV4SecurityOptionCompartments register(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
        return registry.put(ipV4SecurityOptionCompartments.value(), ipV4SecurityOptionCompartments);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionCompartments ipV4SecurityOptionCompartments) {
        return value().compareTo(ipV4SecurityOptionCompartments.value());
    }
}
