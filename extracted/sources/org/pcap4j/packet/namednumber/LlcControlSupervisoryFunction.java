package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LlcControlSupervisoryFunction extends NamedNumber<Byte, LlcControlSupervisoryFunction> {
    public static final LlcControlSupervisoryFunction REJ;
    public static final LlcControlSupervisoryFunction RNR;
    public static final LlcControlSupervisoryFunction RR;
    private static final Map<Byte, LlcControlSupervisoryFunction> registry;
    private static final long serialVersionUID = 6818202103839595038L;

    static {
        LlcControlSupervisoryFunction llcControlSupervisoryFunction = new LlcControlSupervisoryFunction((byte) 0, "Receive ready");
        RR = llcControlSupervisoryFunction;
        LlcControlSupervisoryFunction llcControlSupervisoryFunction2 = new LlcControlSupervisoryFunction((byte) 1, "Receive not ready");
        RNR = llcControlSupervisoryFunction2;
        LlcControlSupervisoryFunction llcControlSupervisoryFunction3 = new LlcControlSupervisoryFunction((byte) 2, "Reject");
        REJ = llcControlSupervisoryFunction3;
        HashMap map = new HashMap();
        registry = map;
        map.put(llcControlSupervisoryFunction.value(), llcControlSupervisoryFunction);
        map.put(llcControlSupervisoryFunction2.value(), llcControlSupervisoryFunction2);
        map.put(llcControlSupervisoryFunction3.value(), llcControlSupervisoryFunction3);
    }

    public LlcControlSupervisoryFunction(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 252) == 0) {
            return;
        }
        throw new IllegalArgumentException(b + " is invalid value. It must be between 0 and 3");
    }

    public static LlcControlSupervisoryFunction getInstance(Byte b) {
        Map<Byte, LlcControlSupervisoryFunction> map = registry;
        return map.containsKey(b) ? map.get(b) : new LlcControlSupervisoryFunction(b, "unknown");
    }

    public static LlcControlSupervisoryFunction register(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
        return registry.put(llcControlSupervisoryFunction.value(), llcControlSupervisoryFunction);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
        return value().compareTo(llcControlSupervisoryFunction.value());
    }
}
