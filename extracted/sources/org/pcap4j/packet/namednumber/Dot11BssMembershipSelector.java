package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11BssMembershipSelector extends NamedNumber<Byte, Dot11BssMembershipSelector> {
    public static final Dot11BssMembershipSelector HT_PHY;
    private static final Map<Byte, Dot11BssMembershipSelector> registry;
    private static final long serialVersionUID = -8967573178793261461L;

    static {
        Dot11BssMembershipSelector dot11BssMembershipSelector = new Dot11BssMembershipSelector((byte) 127, "HT PHY");
        HT_PHY = dot11BssMembershipSelector;
        HashMap map = new HashMap();
        registry = map;
        map.put(dot11BssMembershipSelector.value(), dot11BssMembershipSelector);
    }

    public Dot11BssMembershipSelector(Byte b, String str) {
        super(b, str);
        if (b.byteValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException("The value must be between 0 to 127 but actually is: " + b);
    }

    public static Dot11BssMembershipSelector getInstance(Byte b) {
        Map<Byte, Dot11BssMembershipSelector> map = registry;
        return map.containsKey(b) ? map.get(b) : new Dot11BssMembershipSelector(b, "unknown");
    }

    public static boolean isRegistered(Byte b) {
        return registry.containsKey(b);
    }

    public static Dot11BssMembershipSelector register(Dot11BssMembershipSelector dot11BssMembershipSelector) {
        return registry.put(dot11BssMembershipSelector.value(), dot11BssMembershipSelector);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11BssMembershipSelector dot11BssMembershipSelector) {
        return value().compareTo(dot11BssMembershipSelector.value());
    }
}
