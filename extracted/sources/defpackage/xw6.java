package defpackage;

import ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class xw6 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecentDownloadBottomDialogFragment b;

    public /* synthetic */ xw6(RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment, int i) {
        this.a = i;
        this.b = recentDownloadBottomDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        xe2 xe2Var;
        switch (this.a) {
            case 0:
                Object objE = ((bx6) this.b.l1.getValue()).E((a06) obj, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
            case 1:
                bz6 bz6Var = (bz6) obj;
                if (bz6Var == null || (xe2Var = bz6Var.a) == null || (r4 = xe2Var.a(new xw6(this.b, 0), g51Var)) != CoroutineSingletons.a) {
                }
                break;
            default:
                this.b.z0();
                break;
        }
        return tx8.a;
    }
}
