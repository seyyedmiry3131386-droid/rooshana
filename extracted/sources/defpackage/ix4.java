package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.platform.p;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ix4 {
    public static final /* synthetic */ int a = 0;

    static {
        br9.C(21, 282, 22, 283, 23, 66, 160);
    }

    public static final hx4 a(hx4 hx4Var, gj8 gj8Var, String str, qz0 qz0Var, int i) {
        ri8 ri8Var;
        ri8 ri8Var2;
        js3.p(hx4Var, "<this>");
        js3.p(gj8Var, "textStyle");
        js3.p(str, "placeholder");
        i iVar = l.h;
        qj1 qj1Var = (qj1) qz0Var.j(iVar);
        oh2 oh2Var = (oh2) qz0Var.j(l.k);
        qj1 qj1Var2 = (qj1) qz0Var.j(iVar);
        LayoutDirection layoutDirection = (LayoutDirection) qz0Var.j(l.n);
        boolean zF = qz0Var.f(oh2Var) | qz0Var.f(qj1Var2) | qz0Var.d(layoutDirection.ordinal()) | qz0Var.d(8);
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (zF || objM == obj) {
            objM = new vi8(oh2Var, qj1Var2, layoutDirection);
            qz0Var.l0(objM);
        }
        vi8 vi8Var = (vi8) objM;
        boolean zF2 = ((((i & 896) ^ 384) > 256 && qz0Var.f(str)) || (i & 384) == 256) | qz0Var.f(gj8Var);
        Object objM2 = qz0Var.M();
        if (zF2 || objM2 == obj) {
            long jB = j31.b(0, 0, 15);
            LayoutDirection layoutDirection2 = vi8Var.c;
            qj1 qj1Var3 = vi8Var.b;
            oh2 oh2Var2 = vi8Var.a;
            ll llVar = new ll(str);
            EmptyList emptyList = EmptyList.a;
            sk6 sk6Var = vi8Var.d;
            qi8 qi8Var = new qi8(llVar, gj8Var, emptyList, Integer.MAX_VALUE, true, 1, qj1Var3, layoutDirection2, oh2Var2, jB);
            ri8 ri8Var3 = null;
            if (sk6Var != null) {
                tk0 tk0Var = new tk0(qi8Var);
                lg4 lg4Var = (lg4) sk6Var.b;
                if (lg4Var != null) {
                    ri8Var2 = (ri8) lg4Var.get(tk0Var);
                } else if (js3.i((tk0) sk6Var.c, tk0Var)) {
                    ri8Var2 = (ri8) sk6Var.d;
                }
                if (ri8Var2 != null && !ri8Var2.b.a.b()) {
                    ri8Var3 = ri8Var2;
                }
            }
            if (ri8Var3 != null) {
                ri8Var = new ri8(qi8Var, ri8Var3.b, j31.d(jB, (((long) ((int) Math.ceil(r1.e))) & 4294967295L) | (((long) ((int) Math.ceil(r1.d))) << 32)));
            } else {
                rb4 rb4Var = new rb4(llVar, sy7.l(gj8Var, layoutDirection2), emptyList, qj1Var3, oh2Var2);
                int iJ = h31.j(jB);
                int iH = h31.d(jB) ? h31.h(jB) : Integer.MAX_VALUE;
                if (iJ != iH) {
                    iH = ok4.t((int) Math.ceil(rb4Var.d()), iJ, iH);
                }
                ri8Var = new ri8(qi8Var, new q95(rb4Var, vy2.y(0, iH, 0, h31.g(jB)), Integer.MAX_VALUE, 1), j31.d(jB, (((long) ((int) Math.ceil(r16.e))) & 4294967295L) | (((long) ((int) Math.ceil(r16.d))) << 32)));
                if (sk6Var != null) {
                    lg4 lg4Var2 = (lg4) sk6Var.b;
                    if (lg4Var2 != null) {
                        lg4Var2.put(new tk0(qi8Var), ri8Var);
                    } else {
                        sk6Var.c = new tk0(qi8Var);
                        sk6Var.d = ri8Var;
                    }
                }
            }
            objM2 = new au1(qj1Var.J((int) (ri8Var.c >> 32)));
            qz0Var.l0(objM2);
        }
        return b.b(hx4Var, ((au1) objM2).a, 0.0f, 2);
    }

    public static final hx4 b(hx4 hx4Var, boolean z, hx4 hx4Var2) {
        js3.p(hx4Var, "<this>");
        js3.p(hx4Var2, "ifTrueModifier");
        if (!z) {
            hx4Var2 = ex4.b;
        }
        return hx4Var.d(hx4Var2);
    }

    public static final hx4 c(qz0 qz0Var, hx4 hx4Var) {
        js3.p(hx4Var, "<this>");
        return b(hx4Var, ((Boolean) qz0Var.j(p.a)).booleanValue(), rq4.f(ex4.b, zu0.c, tt3.d));
    }

    public static final hx4 d(hx4 hx4Var, bp2 bp2Var, lt8 lt8Var, dp2 dp2Var, qz0 qz0Var, int i, int i2) {
        js3.p(hx4Var, "<this>");
        js3.p(bp2Var, "isVisible");
        if ((i2 & 2) != 0) {
            lt8Var = y97.e0(700, 0, null, 6);
        }
        u48 u48VarB = androidx.compose.animation.core.b.b(((Boolean) bp2Var.invoke()).booleanValue() ? 1.0f : 0.0f, lt8Var, "alpha", (i2 & 4) != 0 ? null : dp2Var, qz0Var, ((i >> 3) & 112) | 3072, 4);
        boolean zF = qz0Var.f(u48VarB);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new m22(20, u48VarB);
            qz0Var.l0(objM);
        }
        return d.a(hx4Var, (dp2) objM);
    }
}
