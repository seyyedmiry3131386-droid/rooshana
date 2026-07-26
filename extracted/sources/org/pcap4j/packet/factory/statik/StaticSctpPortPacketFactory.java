package org.pcap4j.packet.factory.statik;

import org.pcap4j.packet.namednumber.SctpPort;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticSctpPortPacketFactory extends AbstractStaticPacketFactory<SctpPort> {
    private static final StaticSctpPortPacketFactory INSTANCE = new StaticSctpPortPacketFactory();

    private StaticSctpPortPacketFactory() {
    }

    public static StaticSctpPortPacketFactory getInstance() {
        return INSTANCE;
    }
}
