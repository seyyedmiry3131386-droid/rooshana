package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wf5 {
    public final sh2 a;
    public final gj8 b;
    public final gj8 c;
    public final gj8 d;
    public final gj8 e;
    public final gj8 f;
    public final gj8 g;
    public final gj8 h;
    public final gj8 i;
    public final gj8 j;
    public final gj8 k;
    public final gj8 l;
    public final gj8 m;

    public wf5(sh2 sh2Var) {
        fj2 fj2Var = fj2.f;
        gj8 gj8Var = new gj8(0L, w07.e(19), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        gj8 gj8Var2 = new gj8(0L, w07.e(17), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        gj8 gj8Var3 = new gj8(0L, w07.e(15), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        gj8 gj8Var4 = new gj8(0L, w07.e(19), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var5 = new gj8(0L, w07.e(17), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var6 = new gj8(0L, w07.e(15), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var7 = new gj8(0L, w07.e(13), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var8 = new gj8(0L, w07.e(11), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var9 = new gj8(0L, w07.e(9), null, sh2Var, 0L, 0, 0L, 16711645);
        gj8 gj8Var10 = new gj8(0L, w07.e(13), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        gj8 gj8Var11 = new gj8(0L, w07.e(11), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        gj8 gj8Var12 = new gj8(0L, w07.e(9), fj2Var, sh2Var, 0L, 0, 0L, 16711641);
        this.a = sh2Var;
        this.b = gj8Var;
        this.c = gj8Var2;
        this.d = gj8Var3;
        this.e = gj8Var4;
        this.f = gj8Var5;
        this.g = gj8Var6;
        this.h = gj8Var7;
        this.i = gj8Var8;
        this.j = gj8Var9;
        this.k = gj8Var10;
        this.l = gj8Var11;
        this.m = gj8Var12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf5)) {
            return false;
        }
        wf5 wf5Var = (wf5) obj;
        return js3.i(this.a, wf5Var.a) && js3.i(this.b, wf5Var.b) && js3.i(this.c, wf5Var.c) && js3.i(this.d, wf5Var.d) && js3.i(this.e, wf5Var.e) && js3.i(this.f, wf5Var.f) && js3.i(this.g, wf5Var.g) && js3.i(this.h, wf5Var.h) && js3.i(this.i, wf5Var.i) && js3.i(this.j, wf5Var.j) && js3.i(this.k, wf5Var.k) && js3.i(this.l, wf5Var.l) && js3.i(this.m, wf5Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(rm7.h(this.a.c.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "MyketTypography(fontFamily=" + this.a + ", headlineLarge=" + this.b + ", headlineMedium=" + this.c + ", headlineSmall=" + this.d + ", titleLarge=" + this.e + ", titleMedium=" + this.f + ", titleSmall=" + this.g + ", bodyLarge=" + this.h + ", bodyMedium=" + this.i + ", bodySmall=" + this.j + ", labelLarge=" + this.k + ", labelMedium=" + this.l + ", labelSmall=" + this.m + ")";
    }
}
