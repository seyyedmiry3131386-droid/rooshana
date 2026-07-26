package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapVhtBandwidth extends NamedNumber<Byte, RadiotapVhtBandwidth> {
    public static final RadiotapVhtBandwidth BW_160;
    public static final RadiotapVhtBandwidth BW_20;
    public static final RadiotapVhtBandwidth BW_20L;
    public static final RadiotapVhtBandwidth BW_20LL;
    public static final RadiotapVhtBandwidth BW_20LLL;
    public static final RadiotapVhtBandwidth BW_20LLU;
    public static final RadiotapVhtBandwidth BW_20LU;
    public static final RadiotapVhtBandwidth BW_20LUL;
    public static final RadiotapVhtBandwidth BW_20LUU;
    public static final RadiotapVhtBandwidth BW_20U;
    public static final RadiotapVhtBandwidth BW_20UL;
    public static final RadiotapVhtBandwidth BW_20ULL;
    public static final RadiotapVhtBandwidth BW_20ULU;
    public static final RadiotapVhtBandwidth BW_20UU;
    public static final RadiotapVhtBandwidth BW_20UUL;
    public static final RadiotapVhtBandwidth BW_20UUU;
    public static final RadiotapVhtBandwidth BW_40;
    public static final RadiotapVhtBandwidth BW_40L;
    public static final RadiotapVhtBandwidth BW_40LL;
    public static final RadiotapVhtBandwidth BW_40LU;
    public static final RadiotapVhtBandwidth BW_40U;
    public static final RadiotapVhtBandwidth BW_40UL;
    public static final RadiotapVhtBandwidth BW_40UU;
    public static final RadiotapVhtBandwidth BW_80;
    public static final RadiotapVhtBandwidth BW_80L;
    public static final RadiotapVhtBandwidth BW_80U;
    private static final Map<Byte, RadiotapVhtBandwidth> registry;
    private static final long serialVersionUID = 3400539041474374620L;

    static {
        RadiotapVhtBandwidth radiotapVhtBandwidth = new RadiotapVhtBandwidth((byte) 0, "20");
        BW_20 = radiotapVhtBandwidth;
        RadiotapVhtBandwidth radiotapVhtBandwidth2 = new RadiotapVhtBandwidth((byte) 1, "40");
        BW_40 = radiotapVhtBandwidth2;
        RadiotapVhtBandwidth radiotapVhtBandwidth3 = new RadiotapVhtBandwidth((byte) 2, "20L");
        BW_20L = radiotapVhtBandwidth3;
        RadiotapVhtBandwidth radiotapVhtBandwidth4 = new RadiotapVhtBandwidth((byte) 3, "20U");
        BW_20U = radiotapVhtBandwidth4;
        RadiotapVhtBandwidth radiotapVhtBandwidth5 = new RadiotapVhtBandwidth((byte) 4, "80");
        BW_80 = radiotapVhtBandwidth5;
        RadiotapVhtBandwidth radiotapVhtBandwidth6 = new RadiotapVhtBandwidth((byte) 5, "40L");
        BW_40L = radiotapVhtBandwidth6;
        RadiotapVhtBandwidth radiotapVhtBandwidth7 = new RadiotapVhtBandwidth((byte) 6, "40U");
        BW_40U = radiotapVhtBandwidth7;
        RadiotapVhtBandwidth radiotapVhtBandwidth8 = new RadiotapVhtBandwidth((byte) 7, "20LL");
        BW_20LL = radiotapVhtBandwidth8;
        RadiotapVhtBandwidth radiotapVhtBandwidth9 = new RadiotapVhtBandwidth((byte) 8, "20LU");
        BW_20LU = radiotapVhtBandwidth9;
        RadiotapVhtBandwidth radiotapVhtBandwidth10 = new RadiotapVhtBandwidth((byte) 9, "20UL");
        BW_20UL = radiotapVhtBandwidth10;
        RadiotapVhtBandwidth radiotapVhtBandwidth11 = new RadiotapVhtBandwidth((byte) 10, "20UU");
        BW_20UU = radiotapVhtBandwidth11;
        RadiotapVhtBandwidth radiotapVhtBandwidth12 = new RadiotapVhtBandwidth((byte) 11, "160");
        BW_160 = radiotapVhtBandwidth12;
        RadiotapVhtBandwidth radiotapVhtBandwidth13 = new RadiotapVhtBandwidth((byte) 12, "80L");
        BW_80L = radiotapVhtBandwidth13;
        RadiotapVhtBandwidth radiotapVhtBandwidth14 = new RadiotapVhtBandwidth((byte) 13, "80U");
        BW_80U = radiotapVhtBandwidth14;
        RadiotapVhtBandwidth radiotapVhtBandwidth15 = new RadiotapVhtBandwidth(Byte.valueOf(Dot11LinkAdaptationControl.ASELI), "40LL");
        BW_40LL = radiotapVhtBandwidth15;
        RadiotapVhtBandwidth radiotapVhtBandwidth16 = new RadiotapVhtBandwidth((byte) 15, "40LU");
        BW_40LU = radiotapVhtBandwidth16;
        RadiotapVhtBandwidth radiotapVhtBandwidth17 = new RadiotapVhtBandwidth((byte) 16, "40UL");
        BW_40UL = radiotapVhtBandwidth17;
        RadiotapVhtBandwidth radiotapVhtBandwidth18 = new RadiotapVhtBandwidth((byte) 17, "40UU");
        BW_40UU = radiotapVhtBandwidth18;
        RadiotapVhtBandwidth radiotapVhtBandwidth19 = new RadiotapVhtBandwidth((byte) 18, "20LLL");
        BW_20LLL = radiotapVhtBandwidth19;
        RadiotapVhtBandwidth radiotapVhtBandwidth20 = new RadiotapVhtBandwidth((byte) 19, "20LLU");
        BW_20LLU = radiotapVhtBandwidth20;
        RadiotapVhtBandwidth radiotapVhtBandwidth21 = new RadiotapVhtBandwidth((byte) 20, "20LUL");
        BW_20LUL = radiotapVhtBandwidth21;
        RadiotapVhtBandwidth radiotapVhtBandwidth22 = new RadiotapVhtBandwidth((byte) 21, "20LUU");
        BW_20LUU = radiotapVhtBandwidth22;
        RadiotapVhtBandwidth radiotapVhtBandwidth23 = new RadiotapVhtBandwidth((byte) 22, "20ULL");
        BW_20ULL = radiotapVhtBandwidth23;
        RadiotapVhtBandwidth radiotapVhtBandwidth24 = new RadiotapVhtBandwidth((byte) 23, "20ULU");
        BW_20ULU = radiotapVhtBandwidth24;
        RadiotapVhtBandwidth radiotapVhtBandwidth25 = new RadiotapVhtBandwidth((byte) 24, "20UUL");
        BW_20UUL = radiotapVhtBandwidth25;
        RadiotapVhtBandwidth radiotapVhtBandwidth26 = new RadiotapVhtBandwidth((byte) 25, "20UUU");
        BW_20UUU = radiotapVhtBandwidth26;
        HashMap map = new HashMap();
        registry = map;
        map.put(radiotapVhtBandwidth.value(), radiotapVhtBandwidth);
        map.put(radiotapVhtBandwidth2.value(), radiotapVhtBandwidth2);
        map.put(radiotapVhtBandwidth3.value(), radiotapVhtBandwidth3);
        map.put(radiotapVhtBandwidth4.value(), radiotapVhtBandwidth4);
        map.put(radiotapVhtBandwidth5.value(), radiotapVhtBandwidth5);
        map.put(radiotapVhtBandwidth6.value(), radiotapVhtBandwidth6);
        map.put(radiotapVhtBandwidth7.value(), radiotapVhtBandwidth7);
        map.put(radiotapVhtBandwidth8.value(), radiotapVhtBandwidth8);
        map.put(radiotapVhtBandwidth9.value(), radiotapVhtBandwidth9);
        map.put(radiotapVhtBandwidth10.value(), radiotapVhtBandwidth10);
        map.put(radiotapVhtBandwidth11.value(), radiotapVhtBandwidth11);
        map.put(radiotapVhtBandwidth12.value(), radiotapVhtBandwidth12);
        map.put(radiotapVhtBandwidth13.value(), radiotapVhtBandwidth13);
        map.put(radiotapVhtBandwidth14.value(), radiotapVhtBandwidth14);
        map.put(radiotapVhtBandwidth15.value(), radiotapVhtBandwidth15);
        map.put(radiotapVhtBandwidth16.value(), radiotapVhtBandwidth16);
        map.put(radiotapVhtBandwidth17.value(), radiotapVhtBandwidth17);
        map.put(radiotapVhtBandwidth18.value(), radiotapVhtBandwidth18);
        map.put(radiotapVhtBandwidth19.value(), radiotapVhtBandwidth19);
        map.put(radiotapVhtBandwidth20.value(), radiotapVhtBandwidth20);
        map.put(radiotapVhtBandwidth21.value(), radiotapVhtBandwidth21);
        map.put(radiotapVhtBandwidth22.value(), radiotapVhtBandwidth22);
        map.put(radiotapVhtBandwidth23.value(), radiotapVhtBandwidth23);
        map.put(radiotapVhtBandwidth24.value(), radiotapVhtBandwidth24);
        map.put(radiotapVhtBandwidth25.value(), radiotapVhtBandwidth25);
        map.put(radiotapVhtBandwidth26.value(), radiotapVhtBandwidth26);
    }

    public RadiotapVhtBandwidth(Byte b, String str) {
        super(b, str);
    }

    public static RadiotapVhtBandwidth getInstance(Byte b) {
        Map<Byte, RadiotapVhtBandwidth> map = registry;
        return map.containsKey(b) ? map.get(b) : new RadiotapVhtBandwidth(b, "unknown");
    }

    public static RadiotapVhtBandwidth register(RadiotapVhtBandwidth radiotapVhtBandwidth) {
        return registry.put(radiotapVhtBandwidth.value(), radiotapVhtBandwidth);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(RadiotapVhtBandwidth radiotapVhtBandwidth) {
        return value().compareTo(radiotapVhtBandwidth.value());
    }
}
