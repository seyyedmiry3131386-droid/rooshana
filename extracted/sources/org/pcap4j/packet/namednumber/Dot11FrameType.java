package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11FrameType extends NamedNumber<Byte, Dot11FrameType> {
    public static final Dot11FrameType ACK;
    public static final Dot11FrameType ACTION;
    public static final Dot11FrameType ACTION_NO_ACK;
    public static final Dot11FrameType ASSOCIATION_REQUEST;
    public static final Dot11FrameType ASSOCIATION_RESPONSE;
    public static final Dot11FrameType ATIM;
    public static final Dot11FrameType AUTHENTICATION;
    public static final Dot11FrameType BEACON;
    public static final Dot11FrameType BLOCK_ACK;
    public static final Dot11FrameType BLOCK_ACK_REQUEST;
    public static final Dot11FrameType CF_ACK;
    public static final Dot11FrameType CF_ACK_CF_POLL;
    public static final Dot11FrameType CF_END;
    public static final Dot11FrameType CF_END_CF_ACK;
    public static final Dot11FrameType CF_POLL;
    public static final Dot11FrameType CONTROL_WRAPPER;
    public static final Dot11FrameType CTS;
    public static final Dot11FrameType DATA;
    public static final Dot11FrameType DATA_CF_ACK;
    public static final Dot11FrameType DATA_CF_ACK_CF_POLL;
    public static final Dot11FrameType DATA_CF_POLL;
    public static final Dot11FrameType DEAUTHENTICATION;
    public static final Dot11FrameType DISASSOCIATION;
    public static final Dot11FrameType NULL;
    public static final Dot11FrameType PROBE_REQUEST;
    public static final Dot11FrameType PROBE_RESPONSE;
    public static final Dot11FrameType PS_POLL;
    public static final Dot11FrameType QOS_CF_ACK_CF_POLL;
    public static final Dot11FrameType QOS_CF_POLL;
    public static final Dot11FrameType QOS_DATA;
    public static final Dot11FrameType QOS_DATA_CF_ACK;
    public static final Dot11FrameType QOS_DATA_CF_ACK_CF_POLL;
    public static final Dot11FrameType QOS_DATA_CF_POLL;
    public static final Dot11FrameType QOS_NULL;
    public static final Dot11FrameType REASSOCIATION_REQUEST;
    public static final Dot11FrameType REASSOCIATION_RESPONSE;
    public static final Dot11FrameType RTS;
    public static final Dot11FrameType TIMING_ADVERTISEMENT;
    private static final Map<Byte, Dot11FrameType> registry;
    private static final long serialVersionUID = 863329177944877431L;
    private final Type type;

    public enum Type {
        MANAGEMENT(0),
        CONTROL(1),
        DATA(2),
        RESERVED(3);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        Dot11FrameType dot11FrameType = new Dot11FrameType((byte) 0, "Association request");
        ASSOCIATION_REQUEST = dot11FrameType;
        Dot11FrameType dot11FrameType2 = new Dot11FrameType((byte) 1, "Association response");
        ASSOCIATION_RESPONSE = dot11FrameType2;
        Dot11FrameType dot11FrameType3 = new Dot11FrameType((byte) 2, "Reassociation request");
        REASSOCIATION_REQUEST = dot11FrameType3;
        Dot11FrameType dot11FrameType4 = new Dot11FrameType((byte) 3, "Reassociation response");
        REASSOCIATION_RESPONSE = dot11FrameType4;
        Dot11FrameType dot11FrameType5 = new Dot11FrameType((byte) 4, "Probe request");
        PROBE_REQUEST = dot11FrameType5;
        Dot11FrameType dot11FrameType6 = new Dot11FrameType((byte) 5, "Probe response");
        PROBE_RESPONSE = dot11FrameType6;
        Dot11FrameType dot11FrameType7 = new Dot11FrameType((byte) 6, "Timing Advertisement");
        TIMING_ADVERTISEMENT = dot11FrameType7;
        Dot11FrameType dot11FrameType8 = new Dot11FrameType((byte) 8, "Beacon");
        BEACON = dot11FrameType8;
        Dot11FrameType dot11FrameType9 = new Dot11FrameType((byte) 9, "ATIM");
        ATIM = dot11FrameType9;
        Dot11FrameType dot11FrameType10 = new Dot11FrameType((byte) 10, "Disassociation");
        DISASSOCIATION = dot11FrameType10;
        Dot11FrameType dot11FrameType11 = new Dot11FrameType((byte) 11, "Authentication");
        AUTHENTICATION = dot11FrameType11;
        Dot11FrameType dot11FrameType12 = new Dot11FrameType((byte) 12, "Deauthentication");
        DEAUTHENTICATION = dot11FrameType12;
        Dot11FrameType dot11FrameType13 = new Dot11FrameType((byte) 13, "Action");
        ACTION = dot11FrameType13;
        Dot11FrameType dot11FrameType14 = new Dot11FrameType(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "Action No Ack");
        ACTION_NO_ACK = dot11FrameType14;
        Dot11FrameType dot11FrameType15 = new Dot11FrameType((byte) 23, "Control Wrapper");
        CONTROL_WRAPPER = dot11FrameType15;
        Dot11FrameType dot11FrameType16 = new Dot11FrameType((byte) 24, "Block Ack Request");
        BLOCK_ACK_REQUEST = dot11FrameType16;
        Dot11FrameType dot11FrameType17 = new Dot11FrameType((byte) 25, "Block Ack");
        BLOCK_ACK = dot11FrameType17;
        Dot11FrameType dot11FrameType18 = new Dot11FrameType((byte) 26, "PS-Poll");
        PS_POLL = dot11FrameType18;
        Dot11FrameType dot11FrameType19 = new Dot11FrameType((byte) 27, "RTS");
        RTS = dot11FrameType19;
        Dot11FrameType dot11FrameType20 = new Dot11FrameType((byte) 28, "CTS");
        CTS = dot11FrameType20;
        Dot11FrameType dot11FrameType21 = new Dot11FrameType((byte) 29, "ACK");
        ACK = dot11FrameType21;
        Dot11FrameType dot11FrameType22 = new Dot11FrameType((byte) 30, "CF-End");
        CF_END = dot11FrameType22;
        Dot11FrameType dot11FrameType23 = new Dot11FrameType((byte) 31, "CF-End + CF-Ack");
        CF_END_CF_ACK = dot11FrameType23;
        Dot11FrameType dot11FrameType24 = new Dot11FrameType((byte) 32, "Data");
        DATA = dot11FrameType24;
        Dot11FrameType dot11FrameType25 = new Dot11FrameType((byte) 33, "Data + CF-Ack");
        DATA_CF_ACK = dot11FrameType25;
        Dot11FrameType dot11FrameType26 = new Dot11FrameType((byte) 34, "Data + CF-Poll");
        DATA_CF_POLL = dot11FrameType26;
        Dot11FrameType dot11FrameType27 = new Dot11FrameType((byte) 35, "Data + CF-Ack + CF-Poll");
        DATA_CF_ACK_CF_POLL = dot11FrameType27;
        Dot11FrameType dot11FrameType28 = new Dot11FrameType((byte) 36, "Null");
        NULL = dot11FrameType28;
        Dot11FrameType dot11FrameType29 = new Dot11FrameType((byte) 37, "CF-Ack");
        CF_ACK = dot11FrameType29;
        Dot11FrameType dot11FrameType30 = new Dot11FrameType((byte) 38, "CF-Poll");
        CF_POLL = dot11FrameType30;
        Dot11FrameType dot11FrameType31 = new Dot11FrameType((byte) 39, "CF-Ack + CF-Poll");
        CF_ACK_CF_POLL = dot11FrameType31;
        Dot11FrameType dot11FrameType32 = new Dot11FrameType((byte) 40, "QoS Data");
        QOS_DATA = dot11FrameType32;
        Dot11FrameType dot11FrameType33 = new Dot11FrameType((byte) 41, "QoS Data + CF-Ack");
        QOS_DATA_CF_ACK = dot11FrameType33;
        Dot11FrameType dot11FrameType34 = new Dot11FrameType((byte) 42, "QoS Data + CF-Poll");
        QOS_DATA_CF_POLL = dot11FrameType34;
        Dot11FrameType dot11FrameType35 = new Dot11FrameType((byte) 43, "QoS Data + CF-Ack + CF-Poll");
        QOS_DATA_CF_ACK_CF_POLL = dot11FrameType35;
        Dot11FrameType dot11FrameType36 = new Dot11FrameType((byte) 44, "QoS Null");
        QOS_NULL = dot11FrameType36;
        Dot11FrameType dot11FrameType37 = new Dot11FrameType((byte) 46, "QoS CF-Poll");
        QOS_CF_POLL = dot11FrameType37;
        Dot11FrameType dot11FrameType38 = new Dot11FrameType((byte) 47, "QoS CF-Ack + CF-Poll");
        QOS_CF_ACK_CF_POLL = dot11FrameType38;
        HashMap map = new HashMap();
        registry = map;
        map.put(dot11FrameType.value(), dot11FrameType);
        map.put(dot11FrameType2.value(), dot11FrameType2);
        map.put(dot11FrameType3.value(), dot11FrameType3);
        map.put(dot11FrameType4.value(), dot11FrameType4);
        map.put(dot11FrameType5.value(), dot11FrameType5);
        map.put(dot11FrameType6.value(), dot11FrameType6);
        map.put(dot11FrameType7.value(), dot11FrameType7);
        map.put(dot11FrameType8.value(), dot11FrameType8);
        map.put(dot11FrameType9.value(), dot11FrameType9);
        map.put(dot11FrameType10.value(), dot11FrameType10);
        map.put(dot11FrameType11.value(), dot11FrameType11);
        map.put(dot11FrameType12.value(), dot11FrameType12);
        map.put(dot11FrameType13.value(), dot11FrameType13);
        map.put(dot11FrameType14.value(), dot11FrameType14);
        map.put(dot11FrameType15.value(), dot11FrameType15);
        map.put(dot11FrameType16.value(), dot11FrameType16);
        map.put(dot11FrameType17.value(), dot11FrameType17);
        map.put(dot11FrameType18.value(), dot11FrameType18);
        map.put(dot11FrameType19.value(), dot11FrameType19);
        map.put(dot11FrameType20.value(), dot11FrameType20);
        map.put(dot11FrameType21.value(), dot11FrameType21);
        map.put(dot11FrameType22.value(), dot11FrameType22);
        map.put(dot11FrameType23.value(), dot11FrameType23);
        map.put(dot11FrameType24.value(), dot11FrameType24);
        map.put(dot11FrameType25.value(), dot11FrameType25);
        map.put(dot11FrameType26.value(), dot11FrameType26);
        map.put(dot11FrameType27.value(), dot11FrameType27);
        map.put(dot11FrameType28.value(), dot11FrameType28);
        map.put(dot11FrameType29.value(), dot11FrameType29);
        map.put(dot11FrameType30.value(), dot11FrameType30);
        map.put(dot11FrameType31.value(), dot11FrameType31);
        map.put(dot11FrameType32.value(), dot11FrameType32);
        map.put(dot11FrameType33.value(), dot11FrameType33);
        map.put(dot11FrameType34.value(), dot11FrameType34);
        map.put(dot11FrameType35.value(), dot11FrameType35);
        map.put(dot11FrameType36.value(), dot11FrameType36);
        map.put(dot11FrameType37.value(), dot11FrameType37);
        map.put(dot11FrameType38.value(), dot11FrameType38);
    }

    public Dot11FrameType(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 192) != 0) {
            throw new IllegalArgumentException(b + " is invalid value. (value & 0xC0) must be 0.");
        }
        int iByteValue = b.byteValue() >> 4;
        if (iByteValue == 0) {
            this.type = Type.MANAGEMENT;
            return;
        }
        if (iByteValue == 1) {
            this.type = Type.CONTROL;
        } else if (iByteValue == 2) {
            this.type = Type.DATA;
        } else {
            if (iByteValue != 3) {
                throw new AssertionError("Never get here.");
            }
            this.type = Type.RESERVED;
        }
    }

    public static Dot11FrameType getInstance(Byte b) {
        Map<Byte, Dot11FrameType> map = registry;
        return map.containsKey(b) ? map.get(b) : new Dot11FrameType(b, "unknown");
    }

    public static Dot11FrameType register(Dot11FrameType dot11FrameType) {
        return registry.put(dot11FrameType.value(), dot11FrameType);
    }

    public Type getType() {
        return this.type;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11FrameType dot11FrameType) {
        return value().compareTo(dot11FrameType.value());
    }
}
