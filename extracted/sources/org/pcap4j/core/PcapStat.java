package org.pcap4j.core;

import com.sun.jna.Pointer;
import org.pcap4j.core.NativeMappings;

/* JADX INFO: loaded from: classes4.dex */
public final class PcapStat {
    private final long numPacketsCaptured;
    private final long numPacketsDropped;
    private final long numPacketsDroppedByIf;
    private final long numPacketsReceived;

    public PcapStat(NativeMappings.pcap_stat pcap_statVar) {
        if (!(pcap_statVar instanceof NativeMappings.win_pcap_stat)) {
            this.numPacketsReceived = ((long) pcap_statVar.ps_recv) & 4294967295L;
            this.numPacketsDropped = ((long) pcap_statVar.ps_drop) & 4294967295L;
            this.numPacketsDroppedByIf = 4294967295L & ((long) pcap_statVar.ps_ifdrop);
            this.numPacketsCaptured = 0L;
            return;
        }
        NativeMappings.win_pcap_stat win_pcap_statVar = (NativeMappings.win_pcap_stat) pcap_statVar;
        this.numPacketsReceived = ((long) win_pcap_statVar.ps_recv) & 4294967295L;
        this.numPacketsDropped = ((long) win_pcap_statVar.ps_drop) & 4294967295L;
        this.numPacketsDroppedByIf = ((long) win_pcap_statVar.ps_ifdrop) & 4294967295L;
        this.numPacketsCaptured = 4294967295L & ((long) win_pcap_statVar.bs_capt);
    }

    public long getNumPacketsCaptured() {
        return this.numPacketsCaptured;
    }

    public long getNumPacketsDropped() {
        return this.numPacketsDropped;
    }

    public long getNumPacketsDroppedByIf() {
        return this.numPacketsDroppedByIf;
    }

    public long getNumPacketsReceived() {
        return this.numPacketsReceived;
    }

    public PcapStat(Pointer pointer, boolean z) {
        this.numPacketsReceived = ((long) NativeMappings.pcap_stat.getPsRecv(pointer)) & 4294967295L;
        this.numPacketsDropped = ((long) NativeMappings.pcap_stat.getPsDrop(pointer)) & 4294967295L;
        this.numPacketsDroppedByIf = ((long) NativeMappings.pcap_stat.getPsIfdrop(pointer)) & 4294967295L;
        if (z) {
            this.numPacketsCaptured = ((long) NativeMappings.win_pcap_stat.getBsCapt(pointer)) & 4294967295L;
        } else {
            this.numPacketsCaptured = 0L;
        }
    }
}
