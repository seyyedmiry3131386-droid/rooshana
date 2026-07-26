package defpackage;

import android.content.Context;
import ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class zs1 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadQualityDialogFragment b;

    public /* synthetic */ zs1(DownloadQualityDialogFragment downloadQualityDialogFragment, int i) {
        this.a = i;
        this.b = downloadQualityDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        xe2 xe2Var;
        Object objA;
        int i = this.a;
        int i2 = 0;
        tx8 tx8Var = tx8.a;
        DownloadQualityDialogFragment downloadQualityDialogFragment = this.b;
        switch (i) {
            case 0:
                Object objE = ((ws1) downloadQualityDialogFragment.o1.getValue()).E((a06) obj, g51Var);
                return objE == CoroutineSingletons.a ? objE : tx8Var;
            case 1:
                bz6 bz6Var = (bz6) obj;
                return (bz6Var == null || (xe2Var = bz6Var.a) == null || (objA = xe2Var.a(new zs1(downloadQualityDialogFragment, i2), g51Var)) != CoroutineSingletons.a) ? tx8Var : objA;
            case 2:
                String str = (String) obj;
                Context contextH = downloadQualityDialogFragment.H();
                if (contextH != null) {
                    k68 k68Var = downloadQualityDialogFragment.i1;
                    if (k68Var == null) {
                        js3.V("storageUtils");
                        throw null;
                    }
                    downloadQualityDialogFragment.y0(tv8.s((r69) contextH, k68Var, str));
                }
                return tx8Var;
            default:
                downloadQualityDialogFragment.R0(DialogResult.a, is3.g(new Pair("MOVIE_RESTRICTION_INFO", (RestrictionInfo) obj)));
                return tx8Var;
        }
    }
}
