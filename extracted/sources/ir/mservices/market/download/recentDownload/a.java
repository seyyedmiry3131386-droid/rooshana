package ir.mservices.market.download.recentDownload;

import defpackage.bx6;
import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.download.recentDownload.RecentDownloadAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ RecentDownloadBottomDialogFragment a;

    public a(RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment) {
        this.a = recentDownloadBottomDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = this.a;
        ((bx6) recentDownloadBottomDialogFragment.l1.getValue()).A();
        ((RecentDownloadViewModel) recentDownloadBottomDialogFragment.k1.getValue()).r(new RecentDownloadAction.UpdateRefreshAction(null));
        return tx8.a;
    }
}
