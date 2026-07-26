package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                io.sentry.k1 k1Var = (io.sentry.k1) obj;
                io.sentry.k1 k1Var2 = (io.sentry.k1) obj2;
                if (k1Var == k1Var2) {
                    return 0;
                }
                int iCompareTo = k1Var.B().compareTo(k1Var2.B());
                return iCompareTo != 0 ? iCompareTo : k1Var.x().b.toString().compareTo(k1Var2.x().b.toString());
            case 1:
                return Float.compare((((io.sentry.android.core.anr.a) obj).b + 1.0f) * r4.f * r4.a, (((io.sentry.android.core.anr.a) obj2).b + 1.0f) * r5.f * r5.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
