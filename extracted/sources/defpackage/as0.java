package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class as0 implements TypeEvaluator {
    public static final as0 b = new as0();
    public final ds0 a = new ds0();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        ds0 ds0Var = (ds0) obj;
        ds0 ds0Var2 = (ds0) obj2;
        float fP0 = yq2.p0(ds0Var.a, ds0Var2.a, f);
        float fP02 = yq2.p0(ds0Var.b, ds0Var2.b, f);
        float fP03 = yq2.p0(ds0Var.c, ds0Var2.c, f);
        ds0 ds0Var3 = this.a;
        ds0Var3.a = fP0;
        ds0Var3.b = fP02;
        ds0Var3.c = fP03;
        return ds0Var3;
    }
}
