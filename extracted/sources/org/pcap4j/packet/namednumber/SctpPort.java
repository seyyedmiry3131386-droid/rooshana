package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SctpPort extends Port {
    public static final SctpPort BGP;
    public static final SctpPort DISCARD;
    public static final SctpPort FTP;
    public static final SctpPort FTP_DATA;
    public static final SctpPort HTTP;
    public static final SctpPort HTTPS;
    public static final SctpPort SSH;
    private static final Map<Short, SctpPort> registry;
    private static final long serialVersionUID = 8265462534894583620L;

    static {
        SctpPort sctpPort = new SctpPort((short) 9, "Discard");
        DISCARD = sctpPort;
        SctpPort sctpPort2 = new SctpPort((short) 20, "File Transfer [Default Data]");
        FTP_DATA = sctpPort2;
        SctpPort sctpPort3 = new SctpPort((short) 21, "File Transfer [Control]");
        FTP = sctpPort3;
        SctpPort sctpPort4 = new SctpPort((short) 22, "SSH");
        SSH = sctpPort4;
        SctpPort sctpPort5 = new SctpPort((short) 80, "HTTP");
        HTTP = sctpPort5;
        SctpPort sctpPort6 = new SctpPort((short) 179, "Border Gateway Protocol");
        BGP = sctpPort6;
        SctpPort sctpPort7 = new SctpPort((short) 443, "HTTPS");
        HTTPS = sctpPort7;
        HashMap map = new HashMap();
        registry = map;
        map.put(sctpPort.value(), sctpPort);
        map.put(sctpPort2.value(), sctpPort2);
        map.put(sctpPort3.value(), sctpPort3);
        map.put(sctpPort4.value(), sctpPort4);
        map.put(sctpPort5.value(), sctpPort5);
        map.put(sctpPort6.value(), sctpPort6);
        map.put(sctpPort7.value(), sctpPort7);
    }

    public SctpPort(Short sh, String str) {
        super(sh, str);
    }

    public static SctpPort getInstance(Short sh) {
        Map<Short, SctpPort> map = registry;
        return map.containsKey(sh) ? map.get(sh) : new SctpPort(sh, "unknown");
    }

    public static SctpPort register(SctpPort sctpPort) {
        return registry.put(sctpPort.value(), sctpPort);
    }
}
