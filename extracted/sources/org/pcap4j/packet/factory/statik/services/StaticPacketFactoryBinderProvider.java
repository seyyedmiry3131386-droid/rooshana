package org.pcap4j.packet.factory.statik.services;

import org.pcap4j.packet.factory.PacketFactoryBinder;
import org.pcap4j.packet.factory.PacketFactoryBinderProvider;

/* JADX INFO: loaded from: classes4.dex */
public class StaticPacketFactoryBinderProvider implements PacketFactoryBinderProvider {
    @Override // org.pcap4j.packet.factory.PacketFactoryBinderProvider
    public PacketFactoryBinder getBinder() {
        return StaticPacketFactoryBinder.getInstance();
    }
}
