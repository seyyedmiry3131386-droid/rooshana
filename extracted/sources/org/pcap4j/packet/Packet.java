package org.pcap4j.packet;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public interface Packet extends Iterable<Packet>, Serializable {

    public interface Builder extends Iterable<Builder> {
        Packet build();

        <T extends Builder> T get(Class<T> cls);

        Builder getOuterOf(Class<? extends Builder> cls);

        Builder getPayloadBuilder();

        Builder payloadBuilder(Builder builder);
    }

    public interface Header extends Serializable {
        byte[] getRawData();

        int length();
    }

    <T extends Packet> boolean contains(Class<T> cls);

    <T extends Packet> T get(Class<T> cls);

    Builder getBuilder();

    Header getHeader();

    Packet getOuterOf(Class<? extends Packet> cls);

    Packet getPayload();

    byte[] getRawData();

    int length();
}
