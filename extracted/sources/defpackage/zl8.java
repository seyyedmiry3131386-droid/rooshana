package defpackage;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class zl8 extends bm8 {
    public final ImmutableList e;
    public final ImmutableList f;
    public final int[] g;
    public final int[] h;

    public zl8(ImmutableList immutableList, ImmutableList immutableList2, int[] iArr) {
        vy2.j(immutableList.size() == iArr.length);
        this.e = immutableList;
        this.f = immutableList2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.bm8
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.bm8
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bm8
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        ImmutableList immutableList = this.e;
        if (!z) {
            return immutableList.size() - 1;
        }
        return this.g[immutableList.size() - 1];
    }

    @Override // defpackage.bm8
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        yl8 yl8Var2 = (yl8) this.f.get(i);
        yl8Var.i(yl8Var2.a, yl8Var2.b, yl8Var2.c, yl8Var2.d, yl8Var2.e, yl8Var2.g, yl8Var2.f);
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.bm8
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.bm8
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        am8 am8Var2 = (am8) this.e.get(i);
        am8Var.b(am8Var2.a, am8Var2.c, am8Var2.d, am8Var2.e, am8Var2.f, am8Var2.g, am8Var2.h, am8Var2.i, am8Var2.j, am8Var2.l, am8Var2.m, am8Var2.n, am8Var2.o, am8Var2.p);
        am8Var.k = am8Var2.k;
        return am8Var;
    }

    @Override // defpackage.bm8
    public final int o() {
        return this.e.size();
    }
}
