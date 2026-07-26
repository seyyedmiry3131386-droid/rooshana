package org.pcap4j.packet;

import defpackage.rm7;

/* JADX INFO: loaded from: classes4.dex */
public enum GtpVersion {
    V0(0),
    V1(1),
    V2(2),
    V3(3),
    V4(4),
    V5(5),
    V6(6),
    V7(7);

    private final int value;

    GtpVersion(int i) {
        this.value = i;
    }

    public static GtpVersion getInstance(int i) {
        for (GtpVersion gtpVersion : values()) {
            if (gtpVersion.value == i) {
                return gtpVersion;
            }
        }
        throw new IllegalArgumentException(rm7.n(i, "Invalid value: "));
    }

    public int getValue() {
        return this.value;
    }
}
