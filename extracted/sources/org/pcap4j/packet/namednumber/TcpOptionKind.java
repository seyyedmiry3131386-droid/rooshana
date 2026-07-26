package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class TcpOptionKind extends NamedNumber<Byte, TcpOptionKind> {
    public static final TcpOptionKind BUBBA;
    public static final TcpOptionKind CC;
    public static final TcpOptionKind CC_ECHO;
    public static final TcpOptionKind CC_NEW;
    public static final TcpOptionKind CORRUPTION_EXPERIENCED;
    public static final TcpOptionKind ECHO;
    public static final TcpOptionKind ECHO_REPLY;
    public static final TcpOptionKind END_OF_OPTION_LIST;
    public static final TcpOptionKind MAXIMUM_SEGMENT_SIZE;
    public static final TcpOptionKind MD5_SIGNATURE;
    public static final TcpOptionKind MPTCP;
    public static final TcpOptionKind NO_OPERATION;
    public static final TcpOptionKind PARTIAL_ORDER_CONNECTION_PERMITTED;
    public static final TcpOptionKind PARTIAL_ORDER_SERVICE_PROFILE;
    public static final TcpOptionKind QUICK_START_RESPONSE;
    public static final TcpOptionKind RECORD_BOUNDARIES;
    public static final TcpOptionKind SACK;
    public static final TcpOptionKind SACK_PERMITTED;
    public static final TcpOptionKind SCPS_CAPABILITIES;
    public static final TcpOptionKind SELECTIVE_NEGATIVE_ACKNOWLEDGEMENTS;
    public static final TcpOptionKind SKEETER;
    public static final TcpOptionKind SNAP;
    public static final TcpOptionKind TCP_ALTERNATE_CHECKSUM_DATA;
    public static final TcpOptionKind TCP_ALTERNATE_CHECKSUM_REQUEST;
    public static final TcpOptionKind TCP_AO;
    public static final TcpOptionKind TCP_COMPRESSION_FILTER;
    public static final TcpOptionKind TCP_FAST_OPEN_COOKIE;
    public static final TcpOptionKind TIMESTAMPS;
    public static final TcpOptionKind TRAILER_CHECKSUM;
    public static final TcpOptionKind USER_TIMEOUT;
    public static final TcpOptionKind WINDOW_SCALE;
    private static final Map<Byte, TcpOptionKind> registry;
    private static final long serialVersionUID = -7033971699970069137L;

    static {
        TcpOptionKind tcpOptionKind = new TcpOptionKind((byte) 0, "End of Option List");
        END_OF_OPTION_LIST = tcpOptionKind;
        TcpOptionKind tcpOptionKind2 = new TcpOptionKind((byte) 1, "No Operation");
        NO_OPERATION = tcpOptionKind2;
        TcpOptionKind tcpOptionKind3 = new TcpOptionKind((byte) 2, "Maximum Segment Size");
        MAXIMUM_SEGMENT_SIZE = tcpOptionKind3;
        TcpOptionKind tcpOptionKind4 = new TcpOptionKind((byte) 3, "Window Scale");
        WINDOW_SCALE = tcpOptionKind4;
        TcpOptionKind tcpOptionKind5 = new TcpOptionKind((byte) 4, "SACK Permitted");
        SACK_PERMITTED = tcpOptionKind5;
        TcpOptionKind tcpOptionKind6 = new TcpOptionKind((byte) 5, "SACK");
        SACK = tcpOptionKind6;
        TcpOptionKind tcpOptionKind7 = new TcpOptionKind((byte) 6, "Echo");
        ECHO = tcpOptionKind7;
        TcpOptionKind tcpOptionKind8 = new TcpOptionKind((byte) 7, "Echo Reply");
        ECHO_REPLY = tcpOptionKind8;
        TcpOptionKind tcpOptionKind9 = new TcpOptionKind((byte) 8, "Timestamps");
        TIMESTAMPS = tcpOptionKind9;
        TcpOptionKind tcpOptionKind10 = new TcpOptionKind((byte) 9, "Partial Order Connection Permitted");
        PARTIAL_ORDER_CONNECTION_PERMITTED = tcpOptionKind10;
        TcpOptionKind tcpOptionKind11 = new TcpOptionKind((byte) 10, "Partial Order Service Profile");
        PARTIAL_ORDER_SERVICE_PROFILE = tcpOptionKind11;
        TcpOptionKind tcpOptionKind12 = new TcpOptionKind((byte) 11, "CC");
        CC = tcpOptionKind12;
        TcpOptionKind tcpOptionKind13 = new TcpOptionKind((byte) 12, "CC.NEW");
        CC_NEW = tcpOptionKind13;
        TcpOptionKind tcpOptionKind14 = new TcpOptionKind((byte) 13, "CC.ECHO");
        CC_ECHO = tcpOptionKind14;
        TcpOptionKind tcpOptionKind15 = new TcpOptionKind(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "TCP Alternate Checksum Request");
        TCP_ALTERNATE_CHECKSUM_REQUEST = tcpOptionKind15;
        TcpOptionKind tcpOptionKind16 = new TcpOptionKind((byte) 15, "TCP Alternate Checksum Data");
        TCP_ALTERNATE_CHECKSUM_DATA = tcpOptionKind16;
        TcpOptionKind tcpOptionKind17 = new TcpOptionKind((byte) 16, "Skeeter");
        SKEETER = tcpOptionKind17;
        TcpOptionKind tcpOptionKind18 = new TcpOptionKind((byte) 17, "Bubba");
        BUBBA = tcpOptionKind18;
        TcpOptionKind tcpOptionKind19 = new TcpOptionKind((byte) 18, "Trailer Checksum");
        TRAILER_CHECKSUM = tcpOptionKind19;
        TcpOptionKind tcpOptionKind20 = new TcpOptionKind((byte) 19, "MD5 Signature");
        MD5_SIGNATURE = tcpOptionKind20;
        TcpOptionKind tcpOptionKind21 = new TcpOptionKind((byte) 20, "SCPS Capabilities");
        SCPS_CAPABILITIES = tcpOptionKind21;
        TcpOptionKind tcpOptionKind22 = new TcpOptionKind((byte) 21, "Selective Negative Acknowledgements");
        SELECTIVE_NEGATIVE_ACKNOWLEDGEMENTS = tcpOptionKind22;
        TcpOptionKind tcpOptionKind23 = new TcpOptionKind((byte) 22, "Record Boundaries");
        RECORD_BOUNDARIES = tcpOptionKind23;
        TcpOptionKind tcpOptionKind24 = new TcpOptionKind((byte) 23, "Corruption experienced");
        CORRUPTION_EXPERIENCED = tcpOptionKind24;
        TcpOptionKind tcpOptionKind25 = new TcpOptionKind((byte) 24, "SNAP");
        SNAP = tcpOptionKind25;
        TcpOptionKind tcpOptionKind26 = new TcpOptionKind((byte) 26, "TCP Compression Filter");
        TCP_COMPRESSION_FILTER = tcpOptionKind26;
        TcpOptionKind tcpOptionKind27 = new TcpOptionKind((byte) 27, "Quick-Start Response");
        QUICK_START_RESPONSE = tcpOptionKind27;
        TcpOptionKind tcpOptionKind28 = new TcpOptionKind((byte) 28, "User Timeout");
        USER_TIMEOUT = tcpOptionKind28;
        TcpOptionKind tcpOptionKind29 = new TcpOptionKind((byte) 29, "TCP-AO");
        TCP_AO = tcpOptionKind29;
        TcpOptionKind tcpOptionKind30 = new TcpOptionKind((byte) 30, "MPTCP");
        MPTCP = tcpOptionKind30;
        TcpOptionKind tcpOptionKind31 = new TcpOptionKind((byte) 34, "TCP Fast Open Cookie");
        TCP_FAST_OPEN_COOKIE = tcpOptionKind31;
        HashMap map = new HashMap();
        registry = map;
        map.put(tcpOptionKind.value(), tcpOptionKind);
        map.put(tcpOptionKind2.value(), tcpOptionKind2);
        map.put(tcpOptionKind3.value(), tcpOptionKind3);
        map.put(tcpOptionKind4.value(), tcpOptionKind4);
        map.put(tcpOptionKind5.value(), tcpOptionKind5);
        map.put(tcpOptionKind6.value(), tcpOptionKind6);
        map.put(tcpOptionKind7.value(), tcpOptionKind7);
        map.put(tcpOptionKind8.value(), tcpOptionKind8);
        map.put(tcpOptionKind9.value(), tcpOptionKind9);
        map.put(tcpOptionKind10.value(), tcpOptionKind10);
        map.put(tcpOptionKind11.value(), tcpOptionKind11);
        map.put(tcpOptionKind12.value(), tcpOptionKind12);
        map.put(tcpOptionKind13.value(), tcpOptionKind13);
        map.put(tcpOptionKind14.value(), tcpOptionKind14);
        map.put(tcpOptionKind15.value(), tcpOptionKind15);
        map.put(tcpOptionKind16.value(), tcpOptionKind16);
        map.put(tcpOptionKind17.value(), tcpOptionKind17);
        map.put(tcpOptionKind18.value(), tcpOptionKind18);
        map.put(tcpOptionKind19.value(), tcpOptionKind19);
        map.put(tcpOptionKind20.value(), tcpOptionKind20);
        map.put(tcpOptionKind21.value(), tcpOptionKind21);
        map.put(tcpOptionKind22.value(), tcpOptionKind22);
        map.put(tcpOptionKind23.value(), tcpOptionKind23);
        map.put(tcpOptionKind24.value(), tcpOptionKind24);
        map.put(tcpOptionKind25.value(), tcpOptionKind25);
        map.put(tcpOptionKind26.value(), tcpOptionKind26);
        map.put(tcpOptionKind27.value(), tcpOptionKind27);
        map.put(tcpOptionKind28.value(), tcpOptionKind28);
        map.put(tcpOptionKind29.value(), tcpOptionKind29);
        map.put(tcpOptionKind30.value(), tcpOptionKind30);
        map.put(tcpOptionKind31.value(), tcpOptionKind31);
    }

    public TcpOptionKind(Byte b, String str) {
        super(b, str);
    }

    public static TcpOptionKind getInstance(Byte b) {
        Map<Byte, TcpOptionKind> map = registry;
        return map.containsKey(b) ? map.get(b) : new TcpOptionKind(b, "unknown");
    }

    public static TcpOptionKind register(TcpOptionKind tcpOptionKind) {
        return registry.put(tcpOptionKind.value(), tcpOptionKind);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(TcpOptionKind tcpOptionKind) {
        return value().compareTo(tcpOptionKind.value());
    }
}
