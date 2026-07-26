package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.ps1;
import defpackage.zr1;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.download.common.data.AppDownloadInfo;

/* JADX INFO: loaded from: classes3.dex */
public class PausedFilter extends GeneralFilter {
    public transient ps1 b;

    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        if (myketRecyclerData instanceof zr1) {
            AppDownloadInfo appDownloadInfoI = this.b.i(((AppDownloadData) ((zr1) myketRecyclerData)).m, null);
            if (appDownloadInfoI != null && appDownloadInfoI.getStatus() != 120 && appDownloadInfoI.getStatus() != 130 && appDownloadInfoI.getStatus() != 190) {
                return true;
            }
        }
        Filter filter = this.a;
        return filter != null && filter.u(myketRecyclerData);
    }
}
