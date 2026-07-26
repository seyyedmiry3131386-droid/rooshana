package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsOpCode extends NamedNumber<Byte, DnsOpCode> {
    public static final DnsOpCode IQUERY;
    public static final DnsOpCode NOTIFY;
    public static final DnsOpCode QUERY;
    public static final DnsOpCode STATUS;
    public static final DnsOpCode UPDATE;
    private static final Map<Byte, DnsOpCode> registry;
    private static final long serialVersionUID = -7397483318208343692L;

    static {
        DnsOpCode dnsOpCode = new DnsOpCode((byte) 0, "Query");
        QUERY = dnsOpCode;
        DnsOpCode dnsOpCode2 = new DnsOpCode((byte) 1, "IQuery");
        IQUERY = dnsOpCode2;
        DnsOpCode dnsOpCode3 = new DnsOpCode((byte) 2, "Status");
        STATUS = dnsOpCode3;
        DnsOpCode dnsOpCode4 = new DnsOpCode((byte) 4, "Notify");
        NOTIFY = dnsOpCode4;
        DnsOpCode dnsOpCode5 = new DnsOpCode((byte) 5, "Update");
        UPDATE = dnsOpCode5;
        HashMap map = new HashMap();
        registry = map;
        map.put(dnsOpCode.value(), dnsOpCode);
        map.put(dnsOpCode2.value(), dnsOpCode2);
        map.put(dnsOpCode3.value(), dnsOpCode3);
        map.put(dnsOpCode4.value(), dnsOpCode4);
        map.put(dnsOpCode5.value(), dnsOpCode5);
    }

    public DnsOpCode(Byte b, String str) {
        super(b, str);
        if ((b.byteValue() & 240) == 0) {
            return;
        }
        throw new IllegalArgumentException(b + " is invalid value. DNS OpCode must be between 0 and 15");
    }

    public static DnsOpCode getInstance(Byte b) {
        Map<Byte, DnsOpCode> map = registry;
        return map.containsKey(b) ? map.get(b) : new DnsOpCode(b, "unknown");
    }

    public static DnsOpCode register(DnsOpCode dnsOpCode) {
        return registry.put(dnsOpCode.value(), dnsOpCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsOpCode dnsOpCode) {
        return value().compareTo(dnsOpCode.value());
    }
}
