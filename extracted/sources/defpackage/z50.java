package defpackage;

import ir.mservices.market.app.update.recycler.AppUpdateData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class z50 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ AppUpdateData c;

    public /* synthetic */ z50(xe2 xe2Var, AppUpdateData appUpdateData, int i) {
        this.a = i;
        this.b = xe2Var;
        this.c = appUpdateData;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a(new y50(ze2Var, this.c, 0), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                Object objA2 = this.b.a(new y50(ze2Var, this.c, 1), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA3 = this.b.a(new y50(ze2Var, this.c, 2), g51Var);
                if (objA3 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
