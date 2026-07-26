package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.graphics.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class pc8 {
    public static final s01 a = new s01(new mw7(3));

    public static final void a(hx4 hx4Var, xr7 xr7Var, long j, long j2, float f, float f2, a aVar, qz0 qz0Var, int i, int i2) {
        long jB = (i2 & 8) != 0 ? mv0.b(j, qz0Var) : j2;
        float f3 = (i2 & 16) != 0 ? 0 : f;
        float f4 = (i2 & 32) != 0 ? 0 : f2;
        s01 s01Var = a;
        float f5 = ((au1) qz0Var.j(s01Var)).a + f3;
        zk8.c(new um[]{u31.a.a(new zu0(jB)), s01Var.a(new au1(f5))}, s7.X(421772006, new nc8(hx4Var, xr7Var, j, f5, null, f4, aVar), qz0Var), qz0Var, 56);
    }

    public static final void b(bp2 bp2Var, hx4 hx4Var, boolean z, xr7 xr7Var, long j, long j2, float f, ne0 ne0Var, ab5 ab5Var, a aVar, qz0 qz0Var, int i, int i2) {
        ab5 ab5Var2;
        long jB = (i2 & 32) != 0 ? mv0.b(j, qz0Var) : j2;
        float f2 = 0;
        float f3 = (i2 & 128) != 0 ? 0 : f;
        ne0 ne0Var2 = (i2 & 256) != 0 ? null : ne0Var;
        if (ab5Var == null) {
            qz0Var.a0(-1701037204);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = o40.r(qz0Var);
            }
            qz0Var.q(false);
            ab5Var2 = (ab5) objM;
        } else {
            qz0Var.a0(2023337163);
            qz0Var.q(false);
            ab5Var2 = ab5Var;
        }
        s01 s01Var = a;
        float f4 = ((au1) qz0Var.j(s01Var)).a + f2;
        zk8.c(new um[]{u31.a.a(new zu0(jB)), s01Var.a(new au1(f4))}, s7.X(849208527, new oc8(hx4Var, xr7Var, j, f4, ne0Var2, ab5Var2, z, bp2Var, f3, aVar), qz0Var), qz0Var, 56);
    }

    public static final hx4 c(hx4 hx4Var, xr7 xr7Var, long j, ne0 ne0Var, float f) {
        xr7 xr7Var2;
        hx4 hx4VarB;
        hx4 me0Var = ex4.b;
        if (f > 0.0f) {
            xr7Var2 = xr7Var;
            hx4VarB = d.b(me0Var, 0.0f, 0.0f, 0.0f, f, xr7Var2, 124895);
        } else {
            xr7Var2 = xr7Var;
            hx4VarB = me0Var;
        }
        hx4 hx4VarD = hx4Var.d(hx4VarB);
        if (ne0Var != null) {
            me0Var = new me0(ne0Var.a, ne0Var.b, xr7Var2);
        }
        return zk8.s(rq4.f(hx4VarD.d(me0Var), j, xr7Var2), xr7Var2);
    }

    public static final long d(long j, float f, qz0 qz0Var) {
        lv0 lv0Var = (lv0) qz0Var.j(mv0.a);
        boolean zBooleanValue = ((Boolean) qz0Var.j(mv0.b)).booleanValue();
        long j2 = lv0Var.p;
        return (zu0.c(j, j2) && zBooleanValue) ? au1.b(f, (float) 0) ? j2 : gu9.l(zu0.b(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, lv0Var.t), j2) : j;
    }
}
