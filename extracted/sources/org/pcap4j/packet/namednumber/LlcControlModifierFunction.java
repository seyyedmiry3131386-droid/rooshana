package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcControlModifierFunction extends NamedNumber<Byte, LlcControlModifierFunction> {
    public static final LlcControlModifierFunction AC0;
    public static final LlcControlModifierFunction AC1;
    public static final LlcControlModifierFunction DISC;
    public static final LlcControlModifierFunction DM;
    public static final LlcControlModifierFunction FRMR;
    public static final LlcControlModifierFunction SABME;
    public static final LlcControlModifierFunction TEST;
    public static final LlcControlModifierFunction UA;
    public static final LlcControlModifierFunction UI;
    public static final LlcControlModifierFunction XID;
    private static final Map<Byte, LlcControlModifierFunction> registry;
    private static final long serialVersionUID = 468392162004904375L;

    static {
        LlcControlModifierFunction llcControlModifierFunction = new LlcControlModifierFunction((byte) 0, "UI");
        UI = llcControlModifierFunction;
        LlcControlModifierFunction llcControlModifierFunction2 = new LlcControlModifierFunction((byte) 3, "DM");
        DM = llcControlModifierFunction2;
        LlcControlModifierFunction llcControlModifierFunction3 = new LlcControlModifierFunction((byte) 16, "DISC");
        DISC = llcControlModifierFunction3;
        LlcControlModifierFunction llcControlModifierFunction4 = new LlcControlModifierFunction((byte) 24, "UA");
        UA = llcControlModifierFunction4;
        LlcControlModifierFunction llcControlModifierFunction5 = new LlcControlModifierFunction((byte) 25, "AC0");
        AC0 = llcControlModifierFunction5;
        LlcControlModifierFunction llcControlModifierFunction6 = new LlcControlModifierFunction((byte) 27, "SABME");
        SABME = llcControlModifierFunction6;
        LlcControlModifierFunction llcControlModifierFunction7 = new LlcControlModifierFunction((byte) 33, "FRMR");
        FRMR = llcControlModifierFunction7;
        LlcControlModifierFunction llcControlModifierFunction8 = new LlcControlModifierFunction((byte) 43, "XID");
        XID = llcControlModifierFunction8;
        LlcControlModifierFunction llcControlModifierFunction9 = new LlcControlModifierFunction((byte) 56, "TEST");
        TEST = llcControlModifierFunction9;
        LlcControlModifierFunction llcControlModifierFunction10 = new LlcControlModifierFunction((byte) 57, "AC1");
        AC1 = llcControlModifierFunction10;
        HashMap map = new HashMap();
        registry = map;
        map.put(llcControlModifierFunction.value(), llcControlModifierFunction);
        map.put(llcControlModifierFunction2.value(), llcControlModifierFunction2);
        map.put(llcControlModifierFunction3.value(), llcControlModifierFunction3);
        map.put(llcControlModifierFunction4.value(), llcControlModifierFunction4);
        map.put(llcControlModifierFunction5.value(), llcControlModifierFunction5);
        map.put(llcControlModifierFunction6.value(), llcControlModifierFunction6);
        map.put(llcControlModifierFunction7.value(), llcControlModifierFunction7);
        map.put(llcControlModifierFunction8.value(), llcControlModifierFunction8);
        map.put(llcControlModifierFunction9.value(), llcControlModifierFunction9);
        map.put(llcControlModifierFunction10.value(), llcControlModifierFunction10);
    }

    public LlcControlModifierFunction(Byte b, String str) {
        super(b, str);
        if (b.byteValue() < 0 || b.byteValue() > 59 || (b.byteValue() & 4) != 0) {
            throw new IllegalArgumentException("value must be (value >= 0 || value <= 55 || (value & 0x04) == 0). value: " + b);
        }
    }

    public static LlcControlModifierFunction getInstance(Byte b) {
        Map<Byte, LlcControlModifierFunction> map = registry;
        return map.containsKey(b) ? map.get(b) : new LlcControlModifierFunction(b, "unknown");
    }

    public static LlcControlModifierFunction register(LlcControlModifierFunction llcControlModifierFunction) {
        return registry.put(llcControlModifierFunction.value(), llcControlModifierFunction);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LlcControlModifierFunction llcControlModifierFunction) {
        return value().compareTo(llcControlModifierFunction.value());
    }
}
