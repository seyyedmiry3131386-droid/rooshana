package defpackage;

import androidx.compose.runtime.g;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class zq8 {
    public final mt8 a;
    public final wb5 b = g.h(null);
    public final /* synthetic */ jr8 c;

    public zq8(jr8 jr8Var, mt8 mt8Var, String str) {
        this.c = jr8Var;
        this.a = mt8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yq8 a(dp2 dp2Var, dp2 dp2Var2) {
        wb5 wb5Var = this.b;
        yq8 yq8Var = (yq8) ((s08) wb5Var).getValue();
        jr8 jr8Var = this.c;
        if (yq8Var == null) {
            Object objInvoke = dp2Var2.invoke(jr8Var.a.j());
            Object objInvoke2 = dp2Var2.invoke(jr8Var.a.j());
            mt8 mt8Var = this.a;
            dl dlVar = (dl) mt8Var.b().invoke(objInvoke2);
            dlVar.d();
            fr8 fr8Var = new fr8(jr8Var, objInvoke, dlVar, mt8Var);
            yq8Var = new yq8(this, fr8Var, dp2Var, dp2Var2);
            ((s08) wb5Var).setValue(yq8Var);
            jr8Var.i.add(fr8Var);
        }
        yq8Var.c = (Lambda) dp2Var2;
        yq8Var.b = dp2Var;
        yq8Var.a(jr8Var.f());
        return yq8Var;
    }
}
