package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IpV6OptionType extends NamedNumber<Byte, IpV6OptionType> {
    public static final IpV6OptionType CALIPSO;
    public static final IpV6OptionType ENDPOINT_IDENTIFICATION;
    public static final IpV6OptionType HOME_ADDRESS;
    public static final IpV6OptionType ILNP_NONCE;
    public static final IpV6OptionType IP_DFF;
    public static final IpV6OptionType JUMBO_PAYLOAD;
    public static final IpV6OptionType LINE_IDENTIFICATION;
    public static final IpV6OptionType MPL;
    public static final IpV6OptionType PAD1;
    public static final IpV6OptionType PADN;
    public static final IpV6OptionType QUICK_START;
    public static final IpV6OptionType ROUTER_ALERT;
    public static final IpV6OptionType RPL;
    public static final IpV6OptionType SMF_DPD;
    public static final IpV6OptionType TUNNEL_ENCAPSULATION_LIMIT;
    private static final Map<Byte, IpV6OptionType> registry;
    private static final long serialVersionUID = 2460312908857953021L;
    private final IpV6OptionTypeAction action;

    public enum IpV6OptionTypeAction {
        SKIP((byte) 0),
        DISCARD((byte) 1),
        DISCARD_AND_SEND_ICMP((byte) 2),
        DISCARD_AND_SEND_ICMP_IF_NOT_MULTICAST((byte) 3);

        private final byte value;

        IpV6OptionTypeAction(byte b) {
            this.value = b;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        IpV6OptionType ipV6OptionType = new IpV6OptionType((byte) 0, "Pad1");
        PAD1 = ipV6OptionType;
        IpV6OptionType ipV6OptionType2 = new IpV6OptionType((byte) 1, "PadN");
        PADN = ipV6OptionType2;
        IpV6OptionType ipV6OptionType3 = new IpV6OptionType((byte) -62, "Jumbo Payload");
        JUMBO_PAYLOAD = ipV6OptionType3;
        IpV6OptionType ipV6OptionType4 = new IpV6OptionType((byte) 99, "RPL");
        RPL = ipV6OptionType4;
        IpV6OptionType ipV6OptionType5 = new IpV6OptionType((byte) 4, "Tunnel Encapsulation Limit");
        TUNNEL_ENCAPSULATION_LIMIT = ipV6OptionType5;
        IpV6OptionType ipV6OptionType6 = new IpV6OptionType((byte) 5, "Router Alert");
        ROUTER_ALERT = ipV6OptionType6;
        IpV6OptionType ipV6OptionType7 = new IpV6OptionType((byte) 38, "Quick-Start");
        QUICK_START = ipV6OptionType7;
        IpV6OptionType ipV6OptionType8 = new IpV6OptionType((byte) 7, "CALIPSO");
        CALIPSO = ipV6OptionType8;
        IpV6OptionType ipV6OptionType9 = new IpV6OptionType((byte) 8, "SMF_DPD");
        SMF_DPD = ipV6OptionType9;
        IpV6OptionType ipV6OptionType10 = new IpV6OptionType((byte) -55, "Home Address");
        HOME_ADDRESS = ipV6OptionType10;
        IpV6OptionType ipV6OptionType11 = new IpV6OptionType((byte) -118, "Endpoint Identification");
        ENDPOINT_IDENTIFICATION = ipV6OptionType11;
        IpV6OptionType ipV6OptionType12 = new IpV6OptionType((byte) -117, "ILNP Nonce");
        ILNP_NONCE = ipV6OptionType12;
        IpV6OptionType ipV6OptionType13 = new IpV6OptionType((byte) -116, "Line-Identification");
        LINE_IDENTIFICATION = ipV6OptionType13;
        IpV6OptionType ipV6OptionType14 = new IpV6OptionType((byte) 109, "MPL");
        MPL = ipV6OptionType14;
        IpV6OptionType ipV6OptionType15 = new IpV6OptionType((byte) -18, "IP_DFF");
        IP_DFF = ipV6OptionType15;
        HashMap map = new HashMap();
        registry = map;
        map.put(ipV6OptionType.value(), ipV6OptionType);
        map.put(ipV6OptionType2.value(), ipV6OptionType2);
        map.put(ipV6OptionType3.value(), ipV6OptionType3);
        map.put(ipV6OptionType4.value(), ipV6OptionType4);
        map.put(ipV6OptionType5.value(), ipV6OptionType5);
        map.put(ipV6OptionType6.value(), ipV6OptionType6);
        map.put(ipV6OptionType7.value(), ipV6OptionType7);
        map.put(ipV6OptionType8.value(), ipV6OptionType8);
        map.put(ipV6OptionType9.value(), ipV6OptionType9);
        map.put(ipV6OptionType10.value(), ipV6OptionType10);
        map.put(ipV6OptionType11.value(), ipV6OptionType11);
        map.put(ipV6OptionType12.value(), ipV6OptionType12);
        map.put(ipV6OptionType13.value(), ipV6OptionType13);
        map.put(ipV6OptionType14.value(), ipV6OptionType14);
        map.put(ipV6OptionType15.value(), ipV6OptionType15);
    }

    public IpV6OptionType(Byte b, String str) {
        super(b, str);
        int iByteValue = b.byteValue() & 192;
        if (iByteValue == 0) {
            this.action = IpV6OptionTypeAction.SKIP;
            return;
        }
        if (iByteValue == 64) {
            this.action = IpV6OptionTypeAction.DISCARD;
        } else if (iByteValue == 128) {
            this.action = IpV6OptionTypeAction.DISCARD_AND_SEND_ICMP;
        } else {
            if (iByteValue != 192) {
                throw new AssertionError("Never get here");
            }
            this.action = IpV6OptionTypeAction.DISCARD_AND_SEND_ICMP_IF_NOT_MULTICAST;
        }
    }

    public static IpV6OptionType getInstance(Byte b) {
        Map<Byte, IpV6OptionType> map = registry;
        return map.containsKey(b) ? map.get(b) : new IpV6OptionType(b, "unknown");
    }

    public static IpV6OptionType register(IpV6OptionType ipV6OptionType) {
        return registry.put(ipV6OptionType.value(), ipV6OptionType);
    }

    public IpV6OptionTypeAction getAction() {
        return this.action;
    }

    public boolean optionDataMayChange() {
        return (value().byteValue() & 32) != 0;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().byteValue(), "");
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IpV6OptionType ipV6OptionType) {
        return value().compareTo(ipV6OptionType.value());
    }
}
