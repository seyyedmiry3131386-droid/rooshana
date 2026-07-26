package io.sentry.rrweb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends b {
    public RRWebIncrementalSnapshotEvent$IncrementalSource c;

    public c(RRWebIncrementalSnapshotEvent$IncrementalSource rRWebIncrementalSnapshotEvent$IncrementalSource) {
        super(RRWebEventType.IncrementalSnapshot);
        this.c = rRWebIncrementalSnapshotEvent$IncrementalSource;
    }
}
