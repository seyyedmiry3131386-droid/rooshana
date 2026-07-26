package defpackage;

import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class xi2 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FontStyleDialogFragment b;

    public /* synthetic */ xi2(FontStyleDialogFragment fontStyleDialogFragment, int i) {
        this.a = i;
        this.b = fontStyleDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        xe2 xe2Var;
        switch (this.a) {
            case 0:
                Object objE = ((ti2) this.b.l1.getValue()).E((a06) obj, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                bz6 bz6Var = (bz6) obj;
                if (bz6Var == null || (xe2Var = bz6Var.a) == null || (r4 = xe2Var.a(new xi2(this.b, 0), g51Var)) != CoroutineSingletons.a) {
                }
                break;
        }
        return tx8.a;
    }
}
