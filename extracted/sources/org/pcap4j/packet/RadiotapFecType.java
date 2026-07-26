package org.pcap4j.packet;

/* JADX INFO: loaded from: classes4.dex */
public enum RadiotapFecType {
    BCC(0),
    LDPC(1);

    private final int value;

    RadiotapFecType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
