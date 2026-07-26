package defpackage;

import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class gq implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ AppDownloadData c;

    public /* synthetic */ gq(xe2 xe2Var, AppDownloadData appDownloadData, int i) {
        this.a = i;
        this.b = xe2Var;
        this.c = appDownloadData;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a(new fq(ze2Var, this.c, 0), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA2 = this.b.a(new fq(ze2Var, this.c, 1), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
