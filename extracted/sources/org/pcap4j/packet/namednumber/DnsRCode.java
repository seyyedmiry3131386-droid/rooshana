package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsRCode extends NamedNumber<Byte, DnsRCode> {
    public static final DnsRCode FORM_ERR;
    public static final DnsRCode NOT_AUTH;
    public static final DnsRCode NOT_IMP;
    public static final DnsRCode NOT_ZONE;
    public static final DnsRCode NO_ERROR;
    public static final DnsRCode NX_DOMAIN;
    public static final DnsRCode NX_RR_SET;
    public static final DnsRCode REFUSED;
    public static final DnsRCode SERV_FAIL;
    public static final DnsRCode YX_DOMAIN;
    public static final DnsRCode YX_RR_SET;
    private static final Map<Byte, DnsRCode> registry;
    private static final long serialVersionUID = -1275148349508319228L;

    static {
        DnsRCode dnsRCode = new DnsRCode((byte) 0, "No Error");
        NO_ERROR = dnsRCode;
        DnsRCode dnsRCode2 = new DnsRCode((byte) 1, "Format Error");
        FORM_ERR = dnsRCode2;
        DnsRCode dnsRCode3 = new DnsRCode((byte) 2, "Server Failure");
        SERV_FAIL = dnsRCode3;
        DnsRCode dnsRCode4 = new DnsRCode((byte) 3, "Non-Existent Domain");
        NX_DOMAIN = dnsRCode4;
        DnsRCode dnsRCode5 = new DnsRCode((byte) 4, "Not Implemented");
        NOT_IMP = dnsRCode5;
        DnsRCode dnsRCode6 = new DnsRCode((byte) 5, "Query Refused");
        REFUSED = dnsRCode6;
        DnsRCode dnsRCode7 = new DnsRCode((byte) 6, "Name Exists when it should not");
        YX_DOMAIN = dnsRCode7;
        DnsRCode dnsRCode8 = new DnsRCode((byte) 7, "RR Set Exists when it should not");
        YX_RR_SET = dnsRCode8;
        DnsRCode dnsRCode9 = new DnsRCode((byte) 8, "RR Set that should exist does not");
        NX_RR_SET = dnsRCode9;
        DnsRCode dnsRCode10 = new DnsRCode((byte) 9, "Not Authorized");
        NOT_AUTH = dnsRCode10;
        DnsRCode dnsRCode11 = new DnsRCode((byte) 10, "Name not contained in zone");
        NOT_ZONE = dnsRCode11;
        HashMap map = new HashMap();
        registry = map;
        map.put(dnsRCode.value(), dnsRCode);
        map.put(dnsRCode2.value(), dnsRCode2);
        map.put(dnsRCode3.value(), dnsRCode3);
        map.put(dnsRCode4.value(), dnsRCode4);
        map.put(dnsRCode5.value(), dnsRCode5);
        map.put(dnsRCode6.value(), dnsRCode6);
        map.put(dnsRCode7.value(), dnsRCode7);
        map.put(dnsRCode8.value(), dnsRCode8);
        map.put(dnsRCode9.value(), dnsRCode9);
        map.put(dnsRCode10.value(), dnsRCode10);
        map.put(dnsRCode11.value(), dnsRCode11);
    }

    public DnsRCode(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b + " is invalid value. DNS RCODE must be between 0 and 15");
    }

    public static DnsRCode getInstance(Byte b) {
        Map<Byte, DnsRCode> map = registry;
        return map.containsKey(b) ? map.get(b) : new DnsRCode(b, "unknown");
    }

    public static DnsRCode register(DnsRCode dnsRCode) {
        return registry.put(dnsRCode.value(), dnsRCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsRCode dnsRCode) {
        return value().compareTo(dnsRCode.value());
    }
}
