package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class og1 {
    public final String a;
    public int b;
    public long c;
    public final ks4 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ pg1 g;

    public og1(pg1 pg1Var, String str, int i, ks4 ks4Var) {
        this.g = pg1Var;
        this.a = str;
        this.b = i;
        this.c = ks4Var == null ? -1L : ks4Var.d;
        if (ks4Var == null || !ks4Var.b()) {
            return;
        }
        this.d = ks4Var;
    }

    public final boolean a(be beVar) {
        ks4 ks4Var = beVar.d;
        bm8 bm8Var = beVar.b;
        if (ks4Var == null) {
            return this.b != beVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (ks4Var.d > j) {
            return true;
        }
        ks4 ks4Var2 = this.d;
        if (ks4Var2 == null) {
            return false;
        }
        int i = ks4Var2.b;
        int iB = bm8Var.b(ks4Var.a);
        int iB2 = bm8Var.b(ks4Var2.a);
        if (ks4Var.d < ks4Var2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!ks4Var.b()) {
            int i2 = ks4Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = ks4Var.b;
        int i4 = ks4Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > ks4Var2.c;
        }
        return true;
    }

    public final boolean b(bm8 bm8Var, bm8 bm8Var2) {
        ks4 ks4Var;
        int i = this.b;
        if (i < bm8Var.o()) {
            pg1 pg1Var = this.g;
            am8 am8Var = pg1Var.a;
            bm8Var.n(i, am8Var);
            for (int i2 = am8Var.n; i2 <= am8Var.o; i2++) {
                int iB = bm8Var2.b(bm8Var.l(i2));
                if (iB != -1) {
                    i = bm8Var2.f(iB, pg1Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= bm8Var2.o()) {
            i = -1;
        }
        this.b = i;
        return i != -1 && ((ks4Var = this.d) == null || bm8Var2.b(ks4Var.a) != -1);
    }
}
