package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import retrofit2.a;

/* JADX INFO: loaded from: classes4.dex */
public final class oe3 extends qe3 {
    public final /* synthetic */ int d;
    public final fl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe3(k57 k57Var, cl0 cl0Var, l51 l51Var, fl0 fl0Var, int i) {
        super(k57Var, cl0Var, l51Var);
        this.d = i;
        this.e = fl0Var;
    }

    @Override // defpackage.qe3
    public final Object a(fs5 fs5Var, Object[] objArr) {
        int i = this.d;
        fl0 fl0Var = this.e;
        switch (i) {
            case 0:
                return fl0Var.n(fs5Var);
            default:
                dl0 dl0Var = (dl0) fl0Var.n(fs5Var);
                g51 g51Var = (g51) objArr[objArr.length - 1];
                try {
                    om0 om0Var = new om0(1, ok4.I(g51Var));
                    om0Var.v();
                    om0Var.x(new sz3(dl0Var, 2));
                    dl0Var.l0(new q2(om0Var));
                    Object objU = om0Var.u();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    return objU;
                } catch (Exception e) {
                    a.c(e, g51Var);
                    return CoroutineSingletons.a;
                }
        }
    }
}
