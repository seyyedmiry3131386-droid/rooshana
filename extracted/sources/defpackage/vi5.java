package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class vi5 implements Comparable {
    public final wi5 a;
    public final Bundle b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final int f;

    public vi5(wi5 wi5Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = wi5Var;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vi5 vi5Var) {
        js3.p(vi5Var, "other");
        boolean z = vi5Var.e;
        boolean z2 = vi5Var.c;
        Bundle bundle = vi5Var.b;
        boolean z3 = this.c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.d - vi5Var.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            js3.p(bundle2, "source");
            int size = bundle2.size();
            js3.m(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.e;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.f - vi5Var.f;
        }
        return -1;
    }
}
