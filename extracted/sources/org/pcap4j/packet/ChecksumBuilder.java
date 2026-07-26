package org.pcap4j.packet;

/* JADX INFO: loaded from: classes4.dex */
public interface ChecksumBuilder<T> {
    T build();

    ChecksumBuilder<T> correctChecksumAtBuild(boolean z);
}
