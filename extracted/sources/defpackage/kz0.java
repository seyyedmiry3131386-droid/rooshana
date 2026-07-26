package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 {
    public final qz0 a;
    public uo0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final ar3 d = new ar3();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public kz0(qz0 qz0Var, uo0 uo0Var) {
        this.a = qz0Var;
        this.b = uo0Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            mv5 mv5Var = this.b.g;
            mv5Var.D0(jv5.d);
            mv5Var.i[mv5Var.j - mv5Var.g[mv5Var.h - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        uo0 uo0Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        uo0Var.getClass();
        if (size != 0) {
            mv5 mv5Var2 = uo0Var.g;
            mv5Var2.D0(lu5.d);
            xq2.G(mv5Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                mv5 mv5Var = this.b.g;
                mv5Var.D0(bv5.d);
                int i3 = mv5Var.j - mv5Var.g[mv5Var.h - 1].b;
                int[] iArr = mv5Var.i;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                mv5 mv5Var2 = this.b.g;
                mv5Var2.D0(wu5.d);
                int i6 = mv5Var2.j - mv5Var2.g[mv5Var2.h - 1].b;
                int[] iArr2 = mv5Var2.i;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        qz0 qz0Var = this.a;
        int i = z ? qz0Var.G.i : qz0Var.G.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            sz0.a("Tried to seek backward");
        }
        if (i2 > 0) {
            mv5 mv5Var = this.b.g;
            mv5Var.D0(eu5.d);
            mv5Var.i[mv5Var.j - mv5Var.g[mv5Var.h - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e() {
        bz7 bz7Var = this.a.G;
        if (bz7Var.c > 0) {
            int i = bz7Var.i;
            ar3 ar3Var = this.d;
            if (ar3Var.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.g.D0(ru5.d);
                    this.c = true;
                }
                if (i > 0) {
                    ge geVarA = bz7Var.a(i);
                    ar3Var.c(i);
                    d(false);
                    mv5 mv5Var = this.b.g;
                    mv5Var.D0(qu5.d);
                    xq2.G(mv5Var, 0, geVarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                sz0.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
