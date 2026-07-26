package defpackage;

import ir.mservices.market.download.app.DownloadRecyclerListFragment;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.app.RecentDownloadAction;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ht1 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadRecyclerListFragment b;

    public /* synthetic */ ht1(DownloadRecyclerListFragment downloadRecyclerListFragment, int i) {
        this.a = i;
        this.b = downloadRecyclerListFragment;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                int i2 = DownloadRecyclerListFragment.j1;
                return downloadRecyclerListFragment.r0();
            default:
                int i3 = DownloadRecyclerListFragment.j1;
                DownloadViewModel downloadViewModelR1 = downloadRecyclerListFragment.R1();
                a aVar = downloadRecyclerListFragment.Z0;
                downloadViewModelR1.r(new RecentDownloadAction.ShowMoreItemMenu(!(aVar != null && aVar.D().isEmpty())));
                return tx8.a;
        }
    }
}
