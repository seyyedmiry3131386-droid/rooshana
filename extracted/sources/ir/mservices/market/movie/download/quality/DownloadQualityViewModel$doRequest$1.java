package ir.mservices.market.movie.download.quality;

import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.uri.downloadInfo.data.DownloadInfoResponse;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.quality.DownloadQualityViewModel$doRequest$1", f = "DownloadQualityViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class DownloadQualityViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ DownloadQualityViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadQualityViewModel$doRequest$1(DownloadQualityViewModel downloadQualityViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = downloadQualityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DownloadQualityViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadQualityViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listFillRecyclerItems;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        DownloadQualityViewModel downloadQualityViewModel = this.a;
        DownloadInfoResponse downloadInfoResponse = downloadQualityViewModel.w.g;
        if (downloadInfoResponse == null || (listFillRecyclerItems = downloadQualityViewModel.fillRecyclerItems(downloadInfoResponse)) == null) {
            listFillRecyclerItems = EmptyList.a;
        }
        return new bz6(listFillRecyclerItems, (GeneralFilter) null, (qp2) null, 6);
    }
}
