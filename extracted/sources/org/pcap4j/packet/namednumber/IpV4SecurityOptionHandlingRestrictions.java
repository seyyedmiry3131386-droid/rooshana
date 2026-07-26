package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV4SecurityOptionHandlingRestrictions extends NamedNumber<Short, IpV4SecurityOptionHandlingRestrictions> {
    private static final Map<Short, IpV4SecurityOptionHandlingRestrictions> registry = new HashMap();
    private static final long serialVersionUID = 3041825811304706489L;

    public IpV4SecurityOptionHandlingRestrictions(Short sh, String str) {
        super(sh, str);
    }

    public static IpV4SecurityOptionHandlingRestrictions getInstance(Short sh) {
        Map<Short, IpV4SecurityOptionHandlingRestrictions> map = registry;
        return map.containsKey(sh) ? map.get(sh) : new IpV4SecurityOptionHandlingRestrictions(sh, "unknown");
    }

    public static IpV4SecurityOptionHandlingRestrictions register(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
        return registry.put(ipV4SecurityOptionHandlingRestrictions.value(), ipV4SecurityOptionHandlingRestrictions);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV4SecurityOptionHandlingRestrictions ipV4SecurityOptionHandlingRestrictions) {
        return value().compareTo(ipV4SecurityOptionHandlingRestrictions.value());
    }
}
