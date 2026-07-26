package defpackage;

import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class qt1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadViewModel b;

    public /* synthetic */ qt1(DownloadViewModel downloadViewModel, int i) {
        this.a = i;
        this.b = downloadViewModel;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                DownloadViewModel downloadViewModel = this.b;
                AppDownloadInfo appDownloadInfoI = downloadViewModel.I.i(((AppDownloadData) obj2).m, null);
                Integer numValueOf = appDownloadInfoI != null ? Integer.valueOf(appDownloadInfoI.getPercent()) : 0;
                AppDownloadInfo appDownloadInfoI2 = downloadViewModel.I.i(((AppDownloadData) obj).m, null);
                return bt2.t(numValueOf, appDownloadInfoI2 != null ? Integer.valueOf(appDownloadInfoI2.getPercent()) : 0);
            default:
                DownloadViewModel downloadViewModel2 = this.b;
                AppDownloadInfo appDownloadInfoI3 = downloadViewModel2.I.i(((AppDownloadData) obj).m, null);
                Integer numValueOf2 = appDownloadInfoI3 != null ? Integer.valueOf(appDownloadInfoI3.getStatus()) : null;
                AppDownloadInfo appDownloadInfoI4 = downloadViewModel2.I.i(((AppDownloadData) obj2).m, null);
                return bt2.t(numValueOf2, appDownloadInfoI4 != null ? Integer.valueOf(appDownloadInfoI4.getStatus()) : null);
        }
    }
}
