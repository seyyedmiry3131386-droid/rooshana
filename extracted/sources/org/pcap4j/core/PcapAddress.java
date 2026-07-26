package org.pcap4j.core;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes4.dex */
public interface PcapAddress {
    InetAddress getAddress();

    InetAddress getBroadcastAddress();

    InetAddress getDestinationAddress();

    InetAddress getNetmask();
}
