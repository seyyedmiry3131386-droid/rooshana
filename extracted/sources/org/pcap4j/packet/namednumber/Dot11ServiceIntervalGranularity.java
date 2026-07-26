package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11ServiceIntervalGranularity extends NamedNumber<Byte, Dot11ServiceIntervalGranularity> {
    public static final Dot11ServiceIntervalGranularity SIG_10_MS;
    public static final Dot11ServiceIntervalGranularity SIG_15_MS;
    public static final Dot11ServiceIntervalGranularity SIG_20_MS;
    public static final Dot11ServiceIntervalGranularity SIG_25_MS;
    public static final Dot11ServiceIntervalGranularity SIG_30_MS;
    public static final Dot11ServiceIntervalGranularity SIG_35_MS;
    public static final Dot11ServiceIntervalGranularity SIG_40_MS;
    public static final Dot11ServiceIntervalGranularity SIG_5_MS;
    private static final Map<Byte, Dot11ServiceIntervalGranularity> registry;
    private static final long serialVersionUID = -935382239962360264L;

    static {
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity = new Dot11ServiceIntervalGranularity((byte) 0, "5 ms");
        SIG_5_MS = dot11ServiceIntervalGranularity;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity2 = new Dot11ServiceIntervalGranularity((byte) 1, "10 ms");
        SIG_10_MS = dot11ServiceIntervalGranularity2;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity3 = new Dot11ServiceIntervalGranularity((byte) 2, "15 ms");
        SIG_15_MS = dot11ServiceIntervalGranularity3;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity4 = new Dot11ServiceIntervalGranularity((byte) 3, "20 ms");
        SIG_20_MS = dot11ServiceIntervalGranularity4;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity5 = new Dot11ServiceIntervalGranularity((byte) 4, "25 ms");
        SIG_25_MS = dot11ServiceIntervalGranularity5;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity6 = new Dot11ServiceIntervalGranularity((byte) 5, "30 ms");
        SIG_30_MS = dot11ServiceIntervalGranularity6;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity7 = new Dot11ServiceIntervalGranularity((byte) 6, "35 ms");
        SIG_35_MS = dot11ServiceIntervalGranularity7;
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity8 = new Dot11ServiceIntervalGranularity((byte) 7, "40 ms");
        SIG_40_MS = dot11ServiceIntervalGranularity8;
        HashMap map = new HashMap();
        registry = map;
        map.put(dot11ServiceIntervalGranularity.value(), dot11ServiceIntervalGranularity);
        map.put(dot11ServiceIntervalGranularity2.value(), dot11ServiceIntervalGranularity2);
        map.put(dot11ServiceIntervalGranularity3.value(), dot11ServiceIntervalGranularity3);
        map.put(dot11ServiceIntervalGranularity4.value(), dot11ServiceIntervalGranularity4);
        map.put(dot11ServiceIntervalGranularity5.value(), dot11ServiceIntervalGranularity5);
        map.put(dot11ServiceIntervalGranularity6.value(), dot11ServiceIntervalGranularity6);
        map.put(dot11ServiceIntervalGranularity7.value(), dot11ServiceIntervalGranularity7);
        map.put(dot11ServiceIntervalGranularity8.value(), dot11ServiceIntervalGranularity8);
    }

    public Dot11ServiceIntervalGranularity(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 248) == 0) {
            return;
        }
        throw new IllegalArgumentException("The value must be between 0 and 7 but is actually: " + b);
    }

    public static Dot11ServiceIntervalGranularity getInstance(Byte b) {
        Map<Byte, Dot11ServiceIntervalGranularity> map = registry;
        return map.containsKey(b) ? map.get(b) : new Dot11ServiceIntervalGranularity(b, "unknown");
    }

    public static Dot11ServiceIntervalGranularity register(Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity) {
        return registry.put(dot11ServiceIntervalGranularity.value(), dot11ServiceIntervalGranularity);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity) {
        return value().compareTo(dot11ServiceIntervalGranularity.value());
    }
}
