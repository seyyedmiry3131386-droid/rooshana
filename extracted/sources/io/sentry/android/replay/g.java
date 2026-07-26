package io.sentry.android.replay;

import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return bt2.t(Long.valueOf(((i) obj).b), Long.valueOf(((i) obj2).b));
            default:
                return bt2.t(Long.valueOf(((io.sentry.rrweb.b) obj).b), Long.valueOf(((io.sentry.rrweb.b) obj2).b));
        }
    }
}
