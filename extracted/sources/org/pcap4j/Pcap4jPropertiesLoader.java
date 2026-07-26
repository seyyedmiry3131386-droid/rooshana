package org.pcap4j;

import defpackage.m96;
import defpackage.t61;
import org.pcap4j.util.PropertiesLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class Pcap4jPropertiesLoader {
    private static final int AF_INET6_DEFAULT = 23;
    private static final int AF_INET6_FREEBSD = 28;
    public static final String AF_INET6_KEY;
    private static final int AF_INET6_LINUX = 10;
    private static final int AF_INET6_MAC = 30;
    private static final int AF_INET_DEFAULT = 2;
    public static final String AF_INET_KEY;
    private static final int AF_LINK_DEFAULT = 18;
    public static final String AF_LINK_KEY;
    private static final int AF_PACKET_DEFAULT = 17;
    public static final String AF_PACKET_KEY;
    private static final int DLT_RAW_DEFAULT = 12;
    public static final String DLT_RAW_KEY;
    private static final int DLT_RAW_OPENBSD = 14;
    private static final Pcap4jPropertiesLoader INSTANCE;
    private static final String KEY_PREFIX;
    public static final String PCAP4J_PROPERTIES_PATH_KEY;
    private PropertiesLoader loader = new PropertiesLoader(System.getProperty(PCAP4J_PROPERTIES_PATH_KEY, KEY_PREFIX.replace('.', '/') + "/pcap4j.properties"), true, true);

    static {
        String name = Pcap4jPropertiesLoader.class.getPackage().getName();
        KEY_PREFIX = name;
        PCAP4J_PROPERTIES_PATH_KEY = t61.i(name, ".properties");
        AF_INET_KEY = t61.i(name, ".af.inet");
        AF_INET6_KEY = t61.i(name, ".af.inet6");
        AF_PACKET_KEY = t61.i(name, ".af.packet");
        AF_LINK_KEY = t61.i(name, ".af.link");
        DLT_RAW_KEY = t61.i(name, ".dlt.raw");
        INSTANCE = new Pcap4jPropertiesLoader();
    }

    private Pcap4jPropertiesLoader() {
    }

    private int getDefaultAfInet6() {
        int i = m96.e;
        if (i == 0) {
            return 30;
        }
        if (i != 1) {
            if (i == 4) {
                return 28;
            }
            if (i != 8) {
                return i != 10 ? 23 : 28;
            }
        }
        return 10;
    }

    private int getDefaultDltRaw() {
        return m96.e != 5 ? 12 : 14;
    }

    public static Pcap4jPropertiesLoader getInstance() {
        return INSTANCE;
    }

    public Integer getAfInet() {
        return this.loader.getInteger(AF_INET_KEY, 2);
    }

    public Integer getAfInet6() {
        return this.loader.getInteger(AF_INET6_KEY, Integer.valueOf(getDefaultAfInet6()));
    }

    public Integer getAfLink() {
        return this.loader.getInteger(AF_LINK_KEY, 18);
    }

    public Integer getAfPacket() {
        return this.loader.getInteger(AF_PACKET_KEY, 17);
    }

    public Integer getDltRaw() {
        return this.loader.getInteger(DLT_RAW_KEY, Integer.valueOf(getDefaultDltRaw()));
    }
}
