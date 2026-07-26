package io.sentry.android.replay.capture;

import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Long.valueOf(((io.sentry.rrweb.b) obj).b), Long.valueOf(((io.sentry.rrweb.b) obj2).b));
    }
}
