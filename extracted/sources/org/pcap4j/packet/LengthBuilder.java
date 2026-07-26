package org.pcap4j.packet;

/* JADX INFO: loaded from: classes4.dex */
public interface LengthBuilder<T> {
    T build();

    LengthBuilder<T> correctLengthAtBuild(boolean z);
}
