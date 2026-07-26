package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes.dex */
public final class fj2 implements Comparable {
    public static final fj2 b;
    public static final fj2 c;
    public static final fj2 d;
    public static final fj2 e;
    public static final fj2 f;
    public static final fj2 g;
    public final int a;

    static {
        fj2 fj2Var = new fj2(100);
        fj2 fj2Var2 = new fj2(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        fj2 fj2Var3 = new fj2(300);
        fj2 fj2Var4 = new fj2(ErrorDTO.CODE_ACCESS_DENIED);
        b = fj2Var4;
        fj2 fj2Var5 = new fj2(500);
        c = fj2Var5;
        fj2 fj2Var6 = new fj2(600);
        d = fj2Var6;
        fj2 fj2Var7 = new fj2(700);
        fj2 fj2Var8 = new fj2(800);
        fj2 fj2Var9 = new fj2(900);
        e = fj2Var4;
        f = fj2Var5;
        g = fj2Var7;
        br9.C(fj2Var, fj2Var2, fj2Var3, fj2Var4, fj2Var5, fj2Var6, fj2Var7, fj2Var8, fj2Var9);
    }

    public fj2(int i) {
        this.a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        sn3.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fj2 fj2Var) {
        return js3.r(this.a, fj2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fj2) {
            return this.a == ((fj2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return dw1.q(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
