package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2DisconnectionReasonCode extends NamedNumber<Integer, Ssh2DisconnectionReasonCode> {
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_AUTH_CANCELLED_BY_USER;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_BY_APPLICATION;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_COMPRESSION_ERROR;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_CONNECTION_LOST;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_HOST_KEY_NOT_VERIFIABLE;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_HOST_NOT_ALLOWED_TO_CONNECT;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_ILLEGAL_USER_NAME;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_KEY_EXCHANGE_FAILED;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_MAC_ERROR;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_NO_MORE_AUTH_METHODS_AVAILABLE;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_PROTOCOL_ERROR;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_PROTOCOL_VERSION_NOT_SUPPORTED;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_RESERVED;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_SERVICE_NOT_AVAILABLE;
    public static final Ssh2DisconnectionReasonCode SSH_DISCONNECT_TOO_MANY_CONNECTIONS;
    private static final Map<Integer, Ssh2DisconnectionReasonCode> registry;
    private static final long serialVersionUID = -8900248269268898171L;

    static {
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode = new Ssh2DisconnectionReasonCode(1, "SSH_DISCONNECT_HOST_NOT_ALLOWED_TO_CONNECT");
        SSH_DISCONNECT_HOST_NOT_ALLOWED_TO_CONNECT = ssh2DisconnectionReasonCode;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode2 = new Ssh2DisconnectionReasonCode(2, "SSH_DISCONNECT_PROTOCOL_ERROR");
        SSH_DISCONNECT_PROTOCOL_ERROR = ssh2DisconnectionReasonCode2;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode3 = new Ssh2DisconnectionReasonCode(3, "SSH_DISCONNECT_KEY_EXCHANGE_FAILED");
        SSH_DISCONNECT_KEY_EXCHANGE_FAILED = ssh2DisconnectionReasonCode3;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode4 = new Ssh2DisconnectionReasonCode(4, "SSH_DISCONNECT_RESERVED");
        SSH_DISCONNECT_RESERVED = ssh2DisconnectionReasonCode4;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode5 = new Ssh2DisconnectionReasonCode(5, "SSH_DISCONNECT_MAC_ERROR");
        SSH_DISCONNECT_MAC_ERROR = ssh2DisconnectionReasonCode5;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode6 = new Ssh2DisconnectionReasonCode(6, "SSH_DISCONNECT_COMPRESSION_ERROR");
        SSH_DISCONNECT_COMPRESSION_ERROR = ssh2DisconnectionReasonCode6;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode7 = new Ssh2DisconnectionReasonCode(7, "SSH_DISCONNECT_SERVICE_NOT_AVAILABLE");
        SSH_DISCONNECT_SERVICE_NOT_AVAILABLE = ssh2DisconnectionReasonCode7;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode8 = new Ssh2DisconnectionReasonCode(8, "SSH_DISCONNECT_PROTOCOL_VERSION_NOT_SUPPORTED");
        SSH_DISCONNECT_PROTOCOL_VERSION_NOT_SUPPORTED = ssh2DisconnectionReasonCode8;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode9 = new Ssh2DisconnectionReasonCode(9, "SSH_DISCONNECT_HOST_KEY_NOT_VERIFIABLE");
        SSH_DISCONNECT_HOST_KEY_NOT_VERIFIABLE = ssh2DisconnectionReasonCode9;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode10 = new Ssh2DisconnectionReasonCode(10, "SSH_DISCONNECT_CONNECTION_LOST");
        SSH_DISCONNECT_CONNECTION_LOST = ssh2DisconnectionReasonCode10;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode11 = new Ssh2DisconnectionReasonCode(11, "SSH_DISCONNECT_BY_APPLICATION");
        SSH_DISCONNECT_BY_APPLICATION = ssh2DisconnectionReasonCode11;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode12 = new Ssh2DisconnectionReasonCode(12, "SSH_DISCONNECT_TOO_MANY_CONNECTIONS");
        SSH_DISCONNECT_TOO_MANY_CONNECTIONS = ssh2DisconnectionReasonCode12;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode13 = new Ssh2DisconnectionReasonCode(13, "SSH_DISCONNECT_AUTH_CANCELLED_BY_USER");
        SSH_DISCONNECT_AUTH_CANCELLED_BY_USER = ssh2DisconnectionReasonCode13;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode14 = new Ssh2DisconnectionReasonCode(14, "SSH_DISCONNECT_NO_MORE_AUTH_METHODS_AVAILABLE");
        SSH_DISCONNECT_NO_MORE_AUTH_METHODS_AVAILABLE = ssh2DisconnectionReasonCode14;
        Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode15 = new Ssh2DisconnectionReasonCode(15, "SSH_DISCONNECT_ILLEGAL_USER_NAME");
        SSH_DISCONNECT_ILLEGAL_USER_NAME = ssh2DisconnectionReasonCode15;
        HashMap map = new HashMap();
        registry = map;
        map.put(ssh2DisconnectionReasonCode.value(), ssh2DisconnectionReasonCode);
        map.put(ssh2DisconnectionReasonCode2.value(), ssh2DisconnectionReasonCode2);
        map.put(ssh2DisconnectionReasonCode3.value(), ssh2DisconnectionReasonCode3);
        map.put(ssh2DisconnectionReasonCode4.value(), ssh2DisconnectionReasonCode4);
        map.put(ssh2DisconnectionReasonCode5.value(), ssh2DisconnectionReasonCode5);
        map.put(ssh2DisconnectionReasonCode6.value(), ssh2DisconnectionReasonCode6);
        map.put(ssh2DisconnectionReasonCode7.value(), ssh2DisconnectionReasonCode7);
        map.put(ssh2DisconnectionReasonCode8.value(), ssh2DisconnectionReasonCode8);
        map.put(ssh2DisconnectionReasonCode9.value(), ssh2DisconnectionReasonCode9);
        map.put(ssh2DisconnectionReasonCode10.value(), ssh2DisconnectionReasonCode10);
        map.put(ssh2DisconnectionReasonCode11.value(), ssh2DisconnectionReasonCode11);
        map.put(ssh2DisconnectionReasonCode12.value(), ssh2DisconnectionReasonCode12);
        map.put(ssh2DisconnectionReasonCode13.value(), ssh2DisconnectionReasonCode13);
        map.put(ssh2DisconnectionReasonCode14.value(), ssh2DisconnectionReasonCode14);
        map.put(ssh2DisconnectionReasonCode15.value(), ssh2DisconnectionReasonCode15);
    }

    public Ssh2DisconnectionReasonCode(Integer num, String str) {
        super(num, str);
    }

    public static Ssh2DisconnectionReasonCode getInstance(Integer num) {
        Map<Integer, Ssh2DisconnectionReasonCode> map = registry;
        return map.containsKey(num) ? map.get(num) : new Ssh2DisconnectionReasonCode(num, "unknown");
    }

    public static Ssh2DisconnectionReasonCode register(Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode) {
        return registry.put(ssh2DisconnectionReasonCode.value(), ssh2DisconnectionReasonCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(((long) value().intValue()) & 4294967295L);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Ssh2DisconnectionReasonCode ssh2DisconnectionReasonCode) {
        return value().compareTo(ssh2DisconnectionReasonCode.value());
    }
}
