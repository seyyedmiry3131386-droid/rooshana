package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
public final class p06 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ p06(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a(new yx5(ze2Var, 7), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                Object objA2 = this.b.a(new yx5(ze2Var, 8), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA3 = this.b.a(new vc8(ze2Var, 4), g51Var);
                if (objA3 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
