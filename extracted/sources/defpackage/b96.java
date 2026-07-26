package defpackage;

import androidx.compose.ui.layout.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b96 {
    public int a;
    public int b;
    public long c;
    public long d = k.b;
    public long e = 0;

    public b96() {
        long j = 0;
        this.c = (j & 4294967295L) | (j << 32);
    }

    public int T() {
        return (int) (this.c & 4294967295L);
    }

    public int U() {
        return (int) (this.c >> 32);
    }

    public final void V() {
        this.a = ok4.t((int) (this.c >> 32), h31.j(this.d), h31.h(this.d));
        int iT = ok4.t((int) (this.c & 4294967295L), h31.i(this.d), h31.g(this.d));
        this.b = iT;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iT - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void W(long j, float f, dp2 dp2Var);

    public final void Y(long j) {
        if (zq3.b(this.c, j)) {
            return;
        }
        this.c = j;
        V();
    }

    public final void c0(long j) {
        if (h31.b(this.d, j)) {
            return;
        }
        this.d = j;
        V();
    }

    public /* synthetic */ Object v() {
        return null;
    }
}
