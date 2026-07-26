package defpackage;

import ir.mservices.market.version2.core.utils.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class sz5 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ dp2 c;

    public /* synthetic */ sz5(xe2 xe2Var, dp2 dp2Var, int i) {
        this.a = i;
        this.b = xe2Var;
        this.c = dp2Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a(new c(ze2Var, this.c, 0), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA2 = this.b.a(new c(ze2Var, this.c, 1), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
