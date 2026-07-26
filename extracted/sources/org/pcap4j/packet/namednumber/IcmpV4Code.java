package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class IcmpV4Code extends NamedNumber<Byte, IcmpV4Code> {
    public static final IcmpV4Code ALTERNATE_ADDRESS_FOR_HOST;
    public static final IcmpV4Code AUTHENTICATION_FAILED;
    public static final IcmpV4Code BAD_LENGTH;
    public static final IcmpV4Code BAD_SPI;
    public static final IcmpV4Code COMMUNICATION_PROHIBITED;
    public static final IcmpV4Code DECOMPRESSION_FAILED;
    public static final IcmpV4Code DECRYPTION_FAILED;
    public static final IcmpV4Code DOES_NOT_ROUTE_COMMON_TRAFFIC;
    public static final IcmpV4Code DST_HOST_PROHIBITED;
    public static final IcmpV4Code DST_HOST_UNKNOWN;
    public static final IcmpV4Code DST_HOST_UNREACHABLE_FOR_TOS;
    public static final IcmpV4Code DST_NETWORK_PROHIBITED;
    public static final IcmpV4Code DST_NETWORK_UNKNOWN;
    public static final IcmpV4Code DST_NETWORK_UNREACHABLE_FOR_TOS;
    public static final IcmpV4Code FRAGMENTATION_BLOCKED;
    public static final IcmpV4Code FRAGMENT_REASSEMBLY_TIME_EXCEEDED;
    public static final IcmpV4Code HOST_PRECEDENCE_VIOLATION;
    public static final IcmpV4Code HOST_UNREACHABLE;
    public static final IcmpV4Code MISSING_REQUIRED_OPTION;
    public static final IcmpV4Code NEED_AUTHENTICATION;
    public static final IcmpV4Code NEED_AUTHORIZATION;
    public static final IcmpV4Code NETWORK_UNREACHABLE;
    public static final IcmpV4Code NORMAL_ROUTER_ADVERTISEMENT;
    public static final IcmpV4Code NO_CODE;
    public static final IcmpV4Code POINTER_INDICATES_ERROR;
    public static final IcmpV4Code PORT_UNREACHABLE;
    public static final IcmpV4Code PRECEDENCE_CUTOFF_IN_EFFECT;
    public static final IcmpV4Code PROTOCOL_UNREACHABLE;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_HOST;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_NETWORK;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_TOS_AND_HOST;
    public static final IcmpV4Code REDIRECT_DATAGRAMS_FOR_TOS_AND_NETWORK;
    public static final IcmpV4Code SRC_HOST_ISOLATED;
    public static final IcmpV4Code SRC_ROUTE_FAILED;
    public static final IcmpV4Code TIME_TO_LIVE_EXCEEDED;
    private static final Map<Byte, Map<Byte, IcmpV4Code>> registry;
    private static final long serialVersionUID = 7592798859079852877L;

    static {
        IcmpV4Code icmpV4Code = new IcmpV4Code((byte) 0, "No Code");
        NO_CODE = icmpV4Code;
        IcmpV4Code icmpV4Code2 = new IcmpV4Code((byte) 0, "Network Unreachable");
        NETWORK_UNREACHABLE = icmpV4Code2;
        IcmpV4Code icmpV4Code3 = new IcmpV4Code((byte) 1, "Host Unreachable");
        HOST_UNREACHABLE = icmpV4Code3;
        IcmpV4Code icmpV4Code4 = new IcmpV4Code((byte) 2, "Protocol Unreachable");
        PROTOCOL_UNREACHABLE = icmpV4Code4;
        IcmpV4Code icmpV4Code5 = new IcmpV4Code((byte) 3, "Port Unreachable");
        PORT_UNREACHABLE = icmpV4Code5;
        IcmpV4Code icmpV4Code6 = new IcmpV4Code((byte) 4, "Fragmentation needed but no fragment bit set");
        FRAGMENTATION_BLOCKED = icmpV4Code6;
        IcmpV4Code icmpV4Code7 = new IcmpV4Code((byte) 5, "Source routing failed");
        SRC_ROUTE_FAILED = icmpV4Code7;
        IcmpV4Code icmpV4Code8 = new IcmpV4Code((byte) 6, "Destination network unknown");
        DST_NETWORK_UNKNOWN = icmpV4Code8;
        IcmpV4Code icmpV4Code9 = new IcmpV4Code((byte) 7, "Destination host unknown");
        DST_HOST_UNKNOWN = icmpV4Code9;
        IcmpV4Code icmpV4Code10 = new IcmpV4Code((byte) 8, "Source host isolated");
        SRC_HOST_ISOLATED = icmpV4Code10;
        IcmpV4Code icmpV4Code11 = new IcmpV4Code((byte) 9, "Destination network administratively prohibited");
        DST_NETWORK_PROHIBITED = icmpV4Code11;
        IcmpV4Code icmpV4Code12 = new IcmpV4Code((byte) 10, "Destination host administratively prohibited");
        DST_HOST_PROHIBITED = icmpV4Code12;
        IcmpV4Code icmpV4Code13 = new IcmpV4Code((byte) 11, "Network unreachable for TOS");
        DST_NETWORK_UNREACHABLE_FOR_TOS = icmpV4Code13;
        IcmpV4Code icmpV4Code14 = new IcmpV4Code((byte) 12, "Host unreachable for TOS");
        DST_HOST_UNREACHABLE_FOR_TOS = icmpV4Code14;
        IcmpV4Code icmpV4Code15 = new IcmpV4Code((byte) 13, "Communication administratively prohibited by filtering");
        COMMUNICATION_PROHIBITED = icmpV4Code15;
        IcmpV4Code icmpV4Code16 = new IcmpV4Code(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "Host precedence violation");
        HOST_PRECEDENCE_VIOLATION = icmpV4Code16;
        IcmpV4Code icmpV4Code17 = new IcmpV4Code((byte) 15, "Precedence cutoff in effect");
        PRECEDENCE_CUTOFF_IN_EFFECT = icmpV4Code17;
        IcmpV4Code icmpV4Code18 = new IcmpV4Code((byte) 0, "Redirect datagrams for the Network");
        REDIRECT_DATAGRAMS_FOR_NETWORK = icmpV4Code18;
        IcmpV4Code icmpV4Code19 = new IcmpV4Code((byte) 1, "Redirect datagrams for the Host");
        REDIRECT_DATAGRAMS_FOR_HOST = icmpV4Code19;
        IcmpV4Code icmpV4Code20 = new IcmpV4Code((byte) 2, "Redirect datagrams for the Type of Service and Network");
        REDIRECT_DATAGRAMS_FOR_TOS_AND_NETWORK = icmpV4Code20;
        IcmpV4Code icmpV4Code21 = new IcmpV4Code((byte) 3, "Redirect datagrams for the Type of Service and Host");
        REDIRECT_DATAGRAMS_FOR_TOS_AND_HOST = icmpV4Code21;
        IcmpV4Code icmpV4Code22 = new IcmpV4Code((byte) 0, "Alternate Address for Host");
        ALTERNATE_ADDRESS_FOR_HOST = icmpV4Code22;
        IcmpV4Code icmpV4Code23 = new IcmpV4Code((byte) 0, "Normal router advertisement");
        NORMAL_ROUTER_ADVERTISEMENT = icmpV4Code23;
        IcmpV4Code icmpV4Code24 = new IcmpV4Code((byte) 16, "Does not route common traffic");
        DOES_NOT_ROUTE_COMMON_TRAFFIC = icmpV4Code24;
        IcmpV4Code icmpV4Code25 = new IcmpV4Code((byte) 0, "Time to Live exceeded during transit");
        TIME_TO_LIVE_EXCEEDED = icmpV4Code25;
        IcmpV4Code icmpV4Code26 = new IcmpV4Code((byte) 1, "Fragment Reassembly Time Exceeded");
        FRAGMENT_REASSEMBLY_TIME_EXCEEDED = icmpV4Code26;
        IcmpV4Code icmpV4Code27 = new IcmpV4Code((byte) 0, "Pointer indicates the error");
        POINTER_INDICATES_ERROR = icmpV4Code27;
        IcmpV4Code icmpV4Code28 = new IcmpV4Code((byte) 1, "Missing a Required Option");
        MISSING_REQUIRED_OPTION = icmpV4Code28;
        IcmpV4Code icmpV4Code29 = new IcmpV4Code((byte) 2, "Bad Length");
        BAD_LENGTH = icmpV4Code29;
        IcmpV4Code icmpV4Code30 = new IcmpV4Code((byte) 0, "Bad SPI");
        BAD_SPI = icmpV4Code30;
        IcmpV4Code icmpV4Code31 = new IcmpV4Code((byte) 1, "Authentication Failed");
        AUTHENTICATION_FAILED = icmpV4Code31;
        IcmpV4Code icmpV4Code32 = new IcmpV4Code((byte) 2, "Decompression Failed");
        DECOMPRESSION_FAILED = icmpV4Code32;
        IcmpV4Code icmpV4Code33 = new IcmpV4Code((byte) 3, "Decryption Failed");
        DECRYPTION_FAILED = icmpV4Code33;
        IcmpV4Code icmpV4Code34 = new IcmpV4Code((byte) 4, "Need Authentication");
        NEED_AUTHENTICATION = icmpV4Code34;
        IcmpV4Code icmpV4Code35 = new IcmpV4Code((byte) 5, "Need Authorization");
        NEED_AUTHORIZATION = icmpV4Code35;
        HashMap map = new HashMap();
        registry = map;
        HashMap map2 = new HashMap();
        map2.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.ECHO_REPLY.value(), map2);
        HashMap map3 = new HashMap();
        map3.put(icmpV4Code2.value(), icmpV4Code2);
        map3.put(icmpV4Code3.value(), icmpV4Code3);
        map3.put(icmpV4Code4.value(), icmpV4Code4);
        map3.put(icmpV4Code5.value(), icmpV4Code5);
        map3.put(icmpV4Code6.value(), icmpV4Code6);
        map3.put(icmpV4Code7.value(), icmpV4Code7);
        map3.put(icmpV4Code8.value(), icmpV4Code8);
        map3.put(icmpV4Code9.value(), icmpV4Code9);
        map3.put(icmpV4Code10.value(), icmpV4Code10);
        map3.put(icmpV4Code11.value(), icmpV4Code11);
        map3.put(icmpV4Code12.value(), icmpV4Code12);
        map3.put(icmpV4Code13.value(), icmpV4Code13);
        map3.put(icmpV4Code14.value(), icmpV4Code14);
        map3.put(icmpV4Code15.value(), icmpV4Code15);
        map3.put(icmpV4Code16.value(), icmpV4Code16);
        map3.put(icmpV4Code17.value(), icmpV4Code17);
        map.put(IcmpV4Type.DESTINATION_UNREACHABLE.value(), map3);
        HashMap map4 = new HashMap();
        map4.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.SOURCE_QUENCH.value(), map4);
        HashMap map5 = new HashMap();
        map5.put(icmpV4Code18.value(), icmpV4Code18);
        map5.put(icmpV4Code19.value(), icmpV4Code19);
        map5.put(icmpV4Code20.value(), icmpV4Code20);
        map5.put(icmpV4Code21.value(), icmpV4Code21);
        map.put(IcmpV4Type.REDIRECT.value(), map5);
        HashMap map6 = new HashMap();
        map6.put(icmpV4Code22.value(), icmpV4Code22);
        map.put(IcmpV4Type.ALTERNATE_HOST_ADDRESS.value(), map6);
        HashMap map7 = new HashMap();
        map7.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.ECHO.value(), map7);
        HashMap map8 = new HashMap();
        map8.put(icmpV4Code23.value(), icmpV4Code23);
        map8.put(icmpV4Code24.value(), icmpV4Code24);
        map.put(IcmpV4Type.ROUTER_ADVERTISEMENT.value(), map8);
        HashMap map9 = new HashMap();
        map9.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.ROUTER_SOLICITATION.value(), map9);
        HashMap map10 = new HashMap();
        map10.put(icmpV4Code25.value(), icmpV4Code25);
        map10.put(icmpV4Code26.value(), icmpV4Code26);
        map.put(IcmpV4Type.TIME_EXCEEDED.value(), map10);
        HashMap map11 = new HashMap();
        map11.put(icmpV4Code27.value(), icmpV4Code27);
        map11.put(icmpV4Code28.value(), icmpV4Code28);
        map11.put(icmpV4Code29.value(), icmpV4Code29);
        map.put(IcmpV4Type.PARAMETER_PROBLEM.value(), map11);
        HashMap map12 = new HashMap();
        map12.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.TIMESTAMP.value(), map12);
        HashMap map13 = new HashMap();
        map13.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.TIMESTAMP_REPLY.value(), map13);
        HashMap map14 = new HashMap();
        map14.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.INFORMATION_REQUEST.value(), map14);
        HashMap map15 = new HashMap();
        map15.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.INFORMATION_REPLY.value(), map15);
        HashMap map16 = new HashMap();
        map16.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.ADDRESS_MASK_REQUEST.value(), map16);
        HashMap map17 = new HashMap();
        map17.put(icmpV4Code.value(), icmpV4Code);
        map.put(IcmpV4Type.ADDRESS_MASK_REPLY.value(), map17);
        HashMap map18 = new HashMap();
        map18.put(icmpV4Code30.value(), icmpV4Code30);
        map18.put(icmpV4Code31.value(), icmpV4Code31);
        map18.put(icmpV4Code32.value(), icmpV4Code32);
        map18.put(icmpV4Code33.value(), icmpV4Code33);
        map18.put(icmpV4Code34.value(), icmpV4Code34);
        map18.put(icmpV4Code35.value(), icmpV4Code35);
        map.put(IcmpV4Type.PHOTURIS.value(), map18);
    }

    public IcmpV4Code(Byte b, String str) {
        super(b, str);
    }

    public static IcmpV4Code getInstance(Byte b, Byte b2) {
        Map<Byte, Map<Byte, IcmpV4Code>> map = registry;
        return (map.containsKey(b) && map.get(b).containsKey(b2)) ? map.get(b).get(b2) : new IcmpV4Code(b2, "unknown");
    }

    public static IcmpV4Code register(IcmpV4Type icmpV4Type, IcmpV4Code icmpV4Code) {
        Map<Byte, Map<Byte, IcmpV4Code>> map = registry;
        if (map.containsKey(icmpV4Type.value())) {
            return map.get(icmpV4Type.value()).put(icmpV4Code.value(), icmpV4Code);
        }
        HashMap map2 = new HashMap();
        map2.put(icmpV4Code.value(), icmpV4Code);
        map.put(icmpV4Type.value(), map2);
        return null;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(IcmpV4Code icmpV4Code) {
        return value().compareTo(icmpV4Code.value());
    }
}
