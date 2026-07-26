package androidx.compose.animation;

import defpackage.bp2;
import defpackage.dp2;
import defpackage.dr8;
import defpackage.fs3;
import defpackage.j22;
import defpackage.j31;
import defpackage.j52;
import defpackage.jr8;
import defpackage.k22;
import defpackage.pk;
import defpackage.qd;
import defpackage.uy7;
import defpackage.wo0;
import defpackage.zq8;

/* JADX INFO: loaded from: classes.dex */
public final class k extends fs3 {
    public final dp2 A;
    public jr8 p;
    public zq8 q;
    public zq8 r;
    public zq8 s;
    public k22 t;
    public j52 u;
    public bp2 v;
    public j22 w;
    public long x;
    public qd y;
    public final dp2 z;

    public k(jr8 jr8Var, zq8 zq8Var, zq8 zq8Var2, zq8 zq8Var3, k22 k22Var, j52 j52Var, bp2 bp2Var, j22 j22Var) {
        super(1);
        this.p = jr8Var;
        this.q = zq8Var;
        this.r = zq8Var2;
        this.s = zq8Var3;
        this.t = k22Var;
        this.u = j52Var;
        this.v = bp2Var;
        this.w = j22Var;
        this.x = pk.a;
        j31.b(0, 0, 15);
        this.z = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                dr8 dr8Var = (dr8) obj;
                EnterExitState enterExitState = EnterExitState.a;
                EnterExitState enterExitState2 = EnterExitState.b;
                boolean zA = dr8Var.a(enterExitState, enterExitState2);
                Object obj2 = null;
                k kVar = this.g;
                if (zA) {
                    wo0 wo0Var = kVar.t.a.c;
                    if (wo0Var != null) {
                        obj2 = wo0Var.c;
                    }
                } else if (dr8Var.a(enterExitState2, EnterExitState.c)) {
                    wo0 wo0Var2 = kVar.u.a.c;
                    if (wo0Var2 != null) {
                        obj2 = wo0Var2.c;
                    }
                } else {
                    obj2 = j.e;
                }
                return obj2 == null ? j.e : obj2;
            }
        };
        this.A = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                dr8 dr8Var = (dr8) obj;
                EnterExitState enterExitState = EnterExitState.a;
                EnterExitState enterExitState2 = EnterExitState.b;
                boolean zA = dr8Var.a(enterExitState, enterExitState2);
                k kVar = this.g;
                if (zA) {
                    uy7 uy7Var = kVar.t.a.b;
                    return uy7Var != null ? uy7Var.b : j.d;
                }
                if (!dr8Var.a(enterExitState2, EnterExitState.c)) {
                    return j.d;
                }
                uy7 uy7Var2 = kVar.u.a.b;
                return uy7Var2 != null ? uy7Var2.b : j.d;
            }
        };
    }

    public final qd E0() {
        if (this.p.f().a(EnterExitState.a, EnterExitState.b)) {
            wo0 wo0Var = this.t.a.c;
            if (wo0Var != null) {
                return wo0Var.a;
            }
            wo0 wo0Var2 = this.u.a.c;
            if (wo0Var2 != null) {
                return wo0Var2.a;
            }
            return null;
        }
        wo0 wo0Var3 = this.u.a.c;
        if (wo0Var3 != null) {
            return wo0Var3.a;
        }
        wo0 wo0Var4 = this.t.a.c;
        if (wo0Var4 != null) {
            return wo0Var4.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    @Override // defpackage.fs3, defpackage.f14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dl4 c(defpackage.el4 r23, defpackage.yk4 r24, long r25) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.k.c(el4, yk4, long):dl4");
    }

    @Override // defpackage.gx4
    public final void s0() {
        this.x = pk.a;
    }
}
