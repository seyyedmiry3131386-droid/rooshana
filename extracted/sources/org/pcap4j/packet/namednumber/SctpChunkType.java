package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class SctpChunkType extends NamedNumber<Byte, SctpChunkType> {
    public static final SctpChunkType ABORT;
    public static final SctpChunkType COOKIE_ACK;
    public static final SctpChunkType COOKIE_ECHO;
    public static final SctpChunkType CWR;
    public static final SctpChunkType DATA;
    public static final SctpChunkType ECNE;
    public static final SctpChunkType ERROR;
    public static final SctpChunkType HEARTBEAT;
    public static final SctpChunkType HEARTBEAT_ACK;
    public static final SctpChunkType INIT;
    public static final SctpChunkType INIT_ACK;
    public static final SctpChunkType SACK;
    public static final SctpChunkType SHUTDOWN;
    public static final SctpChunkType SHUTDOWN_ACK;
    public static final SctpChunkType SHUTDOWN_COMPLETE;
    private static final Map<Byte, SctpChunkType> registry;
    private static final long serialVersionUID = -5598298520049931819L;

    public enum ActionForUnkownType {
        DISCARD,
        DISCARD_AND_REPORT,
        SKIP,
        SKIP_AND_REPORT
    }

    static {
        SctpChunkType sctpChunkType = new SctpChunkType((byte) 0, "Payload Data");
        DATA = sctpChunkType;
        SctpChunkType sctpChunkType2 = new SctpChunkType((byte) 1, "Initiation");
        INIT = sctpChunkType2;
        SctpChunkType sctpChunkType3 = new SctpChunkType((byte) 2, "Initiation Acknowledgement");
        INIT_ACK = sctpChunkType3;
        SctpChunkType sctpChunkType4 = new SctpChunkType((byte) 3, "Selective Acknowledgement");
        SACK = sctpChunkType4;
        SctpChunkType sctpChunkType5 = new SctpChunkType((byte) 4, "Heartbeat Request");
        HEARTBEAT = sctpChunkType5;
        SctpChunkType sctpChunkType6 = new SctpChunkType((byte) 5, "Heartbeat Acknowledgement");
        HEARTBEAT_ACK = sctpChunkType6;
        SctpChunkType sctpChunkType7 = new SctpChunkType((byte) 6, "Abort");
        ABORT = sctpChunkType7;
        SctpChunkType sctpChunkType8 = new SctpChunkType((byte) 7, "Shutdown");
        SHUTDOWN = sctpChunkType8;
        SctpChunkType sctpChunkType9 = new SctpChunkType((byte) 8, "Shutdown Acknowledgement");
        SHUTDOWN_ACK = sctpChunkType9;
        SctpChunkType sctpChunkType10 = new SctpChunkType((byte) 9, "Operation Error");
        ERROR = sctpChunkType10;
        SctpChunkType sctpChunkType11 = new SctpChunkType((byte) 10, "State Cookie");
        COOKIE_ECHO = sctpChunkType11;
        SctpChunkType sctpChunkType12 = new SctpChunkType((byte) 11, "Cookie Acknowledgement");
        COOKIE_ACK = sctpChunkType12;
        SctpChunkType sctpChunkType13 = new SctpChunkType((byte) 12, "Explicit Congestion Notification Echo");
        ECNE = sctpChunkType13;
        SctpChunkType sctpChunkType14 = new SctpChunkType((byte) 13, "Congestion Window Reduced");
        CWR = sctpChunkType14;
        SctpChunkType sctpChunkType15 = new SctpChunkType(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "Shutdown Complete");
        SHUTDOWN_COMPLETE = sctpChunkType15;
        HashMap map = new HashMap();
        registry = map;
        map.put(sctpChunkType.value(), sctpChunkType);
        map.put(sctpChunkType2.value(), sctpChunkType2);
        map.put(sctpChunkType3.value(), sctpChunkType3);
        map.put(sctpChunkType4.value(), sctpChunkType4);
        map.put(sctpChunkType5.value(), sctpChunkType5);
        map.put(sctpChunkType6.value(), sctpChunkType6);
        map.put(sctpChunkType7.value(), sctpChunkType7);
        map.put(sctpChunkType8.value(), sctpChunkType8);
        map.put(sctpChunkType9.value(), sctpChunkType9);
        map.put(sctpChunkType10.value(), sctpChunkType10);
        map.put(sctpChunkType11.value(), sctpChunkType11);
        map.put(sctpChunkType12.value(), sctpChunkType12);
        map.put(sctpChunkType13.value(), sctpChunkType13);
        map.put(sctpChunkType14.value(), sctpChunkType14);
        map.put(sctpChunkType15.value(), sctpChunkType15);
    }

    public SctpChunkType(Byte b, String str) {
        super(b, str);
    }

    public static SctpChunkType getInstance(Byte b) {
        Map<Byte, SctpChunkType> map = registry;
        return map.containsKey(b) ? map.get(b) : new SctpChunkType(b, "unknown");
    }

    public static SctpChunkType register(SctpChunkType sctpChunkType) {
        return registry.put(sctpChunkType.value(), sctpChunkType);
    }

    public ActionForUnkownType getActionForUnkownType() {
        return ActionForUnkownType.values()[(value().byteValue() >> 6) & 3];
    }

    public int valueAsInt() {
        return value().byteValue() & 255;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(valueAsInt());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(SctpChunkType sctpChunkType) {
        return value().compareTo(sctpChunkType.value());
    }
}
