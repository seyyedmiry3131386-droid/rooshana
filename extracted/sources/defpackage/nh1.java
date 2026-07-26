package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.core.h;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.graphics.d;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                long j = ((zu0) obj).a;
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= qz0Var.e(j) ? 4 : 2;
                }
                if (qz0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    oh1.b(((ig8) this.b).c, j, qz0Var, (iIntValue << 3) & 112);
                } else {
                    qz0Var.U();
                }
                return tx8.a;
            case 1:
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ((qp2) this.b).invoke(qz0Var2, 0);
                } else {
                    qz0Var2.U();
                }
                return tx8.a;
            case 2:
                io8 io8Var = (io8) obj;
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? qz0Var3.f(io8Var) : qz0Var3.h(io8Var) ? 4 : 2;
                }
                if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    fo8.a(io8Var, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, s7.X(-999924215, new ww4(1, (String) this.b), qz0Var3), qz0Var3, (iIntValue3 & 14) | 805306368);
                } else {
                    qz0Var3.U();
                }
                return tx8.a;
            case 3:
                long j2 = ((zu0) obj).a;
                qz0 qz0Var4 = (qz0) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    u96.d.g((Drawable) this.b, qz0Var4, 48);
                } else {
                    qz0Var4.U();
                }
                return tx8.a;
            default:
                hx4 hx4Var = (hx4) obj;
                qz0 qz0Var5 = (qz0) obj2;
                ((Number) obj3).intValue();
                qz0Var5.a0(-1498516085);
                o38 o38VarE = ja1.E(MotionSchemeKeyTokens.b, qz0Var5);
                o38 o38VarE2 = ja1.E(MotionSchemeKeyTokens.d, qz0Var5);
                jr8 jr8Var = (jr8) this.b;
                mt8 mt8Var = c26.h;
                tt9 tt9Var = jr8Var.a;
                wb5 wb5Var = jr8Var.d;
                boolean zBooleanValue = ((Boolean) tt9Var.j()).booleanValue();
                qz0Var5.a0(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                qz0Var5.q(false);
                Float fValueOf = Float.valueOf(f);
                s08 s08Var = (s08) wb5Var;
                boolean zBooleanValue2 = ((Boolean) s08Var.getValue()).booleanValue();
                qz0Var5.a0(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                qz0Var5.q(false);
                Float fValueOf2 = Float.valueOf(f2);
                jr8Var.f();
                qz0Var5.a0(386845748);
                qz0Var5.q(false);
                fr8 fr8VarC = h.c(jr8Var, fValueOf, fValueOf2, o38VarE, mt8Var, qz0Var5, 196608);
                boolean zBooleanValue3 = ((Boolean) jr8Var.a.j()).booleanValue();
                qz0Var5.a0(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                qz0Var5.q(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) s08Var.getValue()).booleanValue();
                qz0Var5.a0(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                qz0Var5.q(false);
                Float fValueOf4 = Float.valueOf(f4);
                jr8Var.f();
                qz0Var5.a0(-281714272);
                qz0Var5.q(false);
                hx4 hx4VarB = d.b(hx4Var, ((Number) fr8VarC.getValue()).floatValue(), ((Number) fr8VarC.getValue()).floatValue(), ((Number) h.c(jr8Var, fValueOf3, fValueOf4, o38VarE2, mt8Var, qz0Var5, 196608).getValue()).floatValue(), 0.0f, null, 131064);
                qz0Var5.q(false);
                return hx4VarB;
        }
    }
}
