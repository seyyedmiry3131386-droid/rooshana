package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11AccessNetworkType extends NamedNumber<Byte, Dot11AccessNetworkType> {
    public static final Dot11AccessNetworkType CHARGEABLE_PUBLIC_NETWORK;
    public static final Dot11AccessNetworkType EMERGENCY_SERVICES_ONLY_NETWORK;
    public static final Dot11AccessNetworkType FREE_PUBLIC_NETWORK;
    public static final Dot11AccessNetworkType PERSONAL_DEVICE_NETWORK;
    public static final Dot11AccessNetworkType PRIVATE_NETWORK;
    public static final Dot11AccessNetworkType PRIVATE_NETWORK_WITH_GUEST_ACCESS;
    public static final Dot11AccessNetworkType TEST_OR_EXPERIMENTAL;
    public static final Dot11AccessNetworkType WILDCARD;
    private static final Map<Byte, Dot11AccessNetworkType> registry;
    private static final long serialVersionUID = 446760220104978318L;

    static {
        Dot11AccessNetworkType dot11AccessNetworkType = new Dot11AccessNetworkType((byte) 0, "Private network");
        PRIVATE_NETWORK = dot11AccessNetworkType;
        Dot11AccessNetworkType dot11AccessNetworkType2 = new Dot11AccessNetworkType((byte) 1, "Private network with guest access");
        PRIVATE_NETWORK_WITH_GUEST_ACCESS = dot11AccessNetworkType2;
        Dot11AccessNetworkType dot11AccessNetworkType3 = new Dot11AccessNetworkType((byte) 2, "Chargeable public network");
        CHARGEABLE_PUBLIC_NETWORK = dot11AccessNetworkType3;
        Dot11AccessNetworkType dot11AccessNetworkType4 = new Dot11AccessNetworkType((byte) 3, "Free public network");
        FREE_PUBLIC_NETWORK = dot11AccessNetworkType4;
        Dot11AccessNetworkType dot11AccessNetworkType5 = new Dot11AccessNetworkType((byte) 4, "Personal device network");
        PERSONAL_DEVICE_NETWORK = dot11AccessNetworkType5;
        Dot11AccessNetworkType dot11AccessNetworkType6 = new Dot11AccessNetworkType((byte) 5, "Emergency services only network");
        EMERGENCY_SERVICES_ONLY_NETWORK = dot11AccessNetworkType6;
        Dot11AccessNetworkType dot11AccessNetworkType7 = new Dot11AccessNetworkType(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "Test or experimental");
        TEST_OR_EXPERIMENTAL = dot11AccessNetworkType7;
        Dot11AccessNetworkType dot11AccessNetworkType8 = new Dot11AccessNetworkType((byte) 15, "Wildcard");
        WILDCARD = dot11AccessNetworkType8;
        HashMap map = new HashMap();
        registry = map;
        map.put(dot11AccessNetworkType.value(), dot11AccessNetworkType);
        map.put(dot11AccessNetworkType2.value(), dot11AccessNetworkType2);
        map.put(dot11AccessNetworkType3.value(), dot11AccessNetworkType3);
        map.put(dot11AccessNetworkType4.value(), dot11AccessNetworkType4);
        map.put(dot11AccessNetworkType5.value(), dot11AccessNetworkType5);
        map.put(dot11AccessNetworkType6.value(), dot11AccessNetworkType6);
        map.put(dot11AccessNetworkType7.value(), dot11AccessNetworkType7);
        map.put(dot11AccessNetworkType8.value(), dot11AccessNetworkType8);
    }

    public Dot11AccessNetworkType(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException("(value & 0xF0) must be 0. value: " + b);
    }

    public static Dot11AccessNetworkType getInstance(Byte b) {
        Map<Byte, Dot11AccessNetworkType> map = registry;
        return map.containsKey(b) ? map.get(b) : new Dot11AccessNetworkType(b, "unknown");
    }

    public static Dot11AccessNetworkType register(Dot11AccessNetworkType dot11AccessNetworkType) {
        return registry.put(dot11AccessNetworkType.value(), dot11AccessNetworkType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11AccessNetworkType dot11AccessNetworkType) {
        return value().compareTo(dot11AccessNetworkType.value());
    }
}
