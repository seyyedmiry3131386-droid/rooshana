package io.sentry;

import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent$IncrementalSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RRWebEventType.values().length];
        b = iArr;
        try {
            iArr[RRWebEventType.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[RRWebEventType.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[RRWebEventType.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[RRWebIncrementalSnapshotEvent$IncrementalSource.values().length];
        a = iArr2;
        try {
            iArr2[RRWebIncrementalSnapshotEvent$IncrementalSource.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[RRWebIncrementalSnapshotEvent$IncrementalSource.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
