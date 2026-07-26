package defpackage;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class yq8 implements u48 {
    public final fr8 a;
    public dp2 b;
    public Lambda c;
    public final /* synthetic */ zq8 d;

    /* JADX WARN: Multi-variable type inference failed */
    public yq8(zq8 zq8Var, fr8 fr8Var, dp2 dp2Var, dp2 dp2Var2) {
        this.d = zq8Var;
        this.a = fr8Var;
        this.b = dp2Var;
        this.c = (Lambda) dp2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dp2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [dp2, kotlin.jvm.internal.Lambda] */
    public final void a(dr8 dr8Var) {
        Object objInvoke = this.c.invoke(dr8Var.c());
        boolean zH = this.d.c.h();
        fr8 fr8Var = this.a;
        if (zH) {
            fr8Var.h(this.c.invoke(dr8Var.b()), objInvoke, (sc2) this.b.invoke(dr8Var));
        } else {
            fr8Var.i(objInvoke, (sc2) this.b.invoke(dr8Var));
        }
    }

    @Override // defpackage.u48
    public final Object getValue() {
        a(this.d.c.f());
        return ((s08) this.a.j).getValue();
    }
}
