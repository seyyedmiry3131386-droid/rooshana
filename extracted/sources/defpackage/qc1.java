package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qc1 {
    public final boolean a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public ud[] f;

    public qc1(int i) {
        vy2.j(i > 0);
        this.a = true;
        this.b = i;
        this.e = 0;
        this.f = new ud[100];
    }

    public final synchronized void a(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, j29.f(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}
