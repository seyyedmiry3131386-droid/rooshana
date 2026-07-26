package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class ng6 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv6 b;

    public /* synthetic */ ng6(int i, rv6 rv6Var) {
        this.a = i;
        this.b = rv6Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a.a(new yx5(ze2Var, 16), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                Object objA2 = this.b.a.a(new og6(ze2Var, 12), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 2:
                Object objA3 = this.b.a.a(new vc8(ze2Var, 16), g51Var);
                if (objA3 != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA4 = this.b.a.a(new vc8(ze2Var, 17), g51Var);
                if (objA4 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
