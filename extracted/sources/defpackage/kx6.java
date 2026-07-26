package defpackage;

import ir.mservices.market.download.recentDownload.RecentDownloadAction;
import ir.mservices.market.download.recentDownload.RecentDownloadViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class kx6 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecentDownloadViewModel b;

    public /* synthetic */ kx6(RecentDownloadViewModel recentDownloadViewModel, int i) {
        this.a = i;
        this.b = recentDownloadViewModel;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        Object value;
        Object value2;
        switch (this.a) {
            case 0:
                l lVar = this.b.y;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, Boolean.TRUE));
                return tx8.a;
            case 1:
                l lVar2 = this.b.y;
                do {
                    value2 = lVar2.getValue();
                } while (!lVar2.n(value2, Boolean.TRUE));
                return tx8.a;
            default:
                RecentDownloadAction recentDownloadAction = (RecentDownloadAction) ((r50) obj);
                if (!(recentDownloadAction instanceof RecentDownloadAction.UpdateRefreshAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.b.onUpdateRefreshAction((RecentDownloadAction.UpdateRefreshAction) recentDownloadAction);
                return tx8.a;
        }
    }
}
