package org.pcap4j.packet.namednumber;

import defpackage.dw1;
import defpackage.o40;
import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class EtherType extends NamedNumber<Short, EtherType> {
    public static final EtherType APPLETALK;
    public static final EtherType ARP;
    public static final EtherType DOT1Q_VLAN_TAGGED_FRAMES;
    public static final int IEEE802_3_MAX_LENGTH = 1500;
    public static final EtherType IPV4;
    public static final EtherType IPV6;
    public static final EtherType MPLS;
    public static final EtherType PPP;
    public static final EtherType PPPOE_DISCOVERY_STAGE;
    public static final EtherType PPPOE_SESSION_STAGE;
    public static final EtherType RARP;
    private static final Map<Short, EtherType> registry;
    private static final long serialVersionUID = 7866667243677334444L;

    static {
        EtherType etherType = new EtherType((short) 2048, "IPv4");
        IPV4 = etherType;
        EtherType etherType2 = new EtherType((short) 2054, "ARP");
        ARP = etherType2;
        EtherType etherType3 = new EtherType((short) -32512, "IEEE 802.1Q VLAN-tagged frames");
        DOT1Q_VLAN_TAGGED_FRAMES = etherType3;
        EtherType etherType4 = new EtherType((short) -32715, "RARP");
        RARP = etherType4;
        EtherType etherType5 = new EtherType((short) -32613, "Appletalk");
        APPLETALK = etherType5;
        EtherType etherType6 = new EtherType((short) -31011, "IPv6");
        IPV6 = etherType6;
        EtherType etherType7 = new EtherType((short) -30709, "PPP");
        PPP = etherType7;
        EtherType etherType8 = new EtherType((short) -30649, "MPLS");
        MPLS = etherType8;
        EtherType etherType9 = new EtherType((short) -30621, "PPPoE Discovery Stage");
        PPPOE_DISCOVERY_STAGE = etherType9;
        EtherType etherType10 = new EtherType((short) -30620, "PPPoE Session Stage");
        PPPOE_SESSION_STAGE = etherType10;
        HashMap map = new HashMap();
        registry = map;
        map.put(etherType.value(), etherType);
        map.put(etherType2.value(), etherType2);
        map.put(etherType3.value(), etherType3);
        map.put(etherType4.value(), etherType4);
        map.put(etherType5.value(), etherType5);
        map.put(etherType6.value(), etherType6);
        map.put(etherType7.value(), etherType7);
        map.put(etherType8.value(), etherType8);
        map.put(etherType9.value(), etherType9);
        map.put(etherType10.value(), etherType10);
    }

    public EtherType(Short sh, String str) {
        super(sh, str);
    }

    public static EtherType getInstance(Short sh) {
        Map<Short, EtherType> map = registry;
        return map.containsKey(sh) ? map.get(sh) : (sh.shortValue() & 65535) <= 1500 ? new EtherType(sh, "Length") : new EtherType(sh, "unknown");
    }

    public static EtherType register(EtherType etherType) {
        return registry.put(etherType.value(), etherType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String toString() {
        if ((value().shortValue() & 65535) > 1500) {
            return super.toString();
        }
        return dw1.k(65535 & value().shortValue(), " bytes)", o40.A(70, "Length ("));
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(EtherType etherType) {
        return value().compareTo(etherType.value());
    }
}
