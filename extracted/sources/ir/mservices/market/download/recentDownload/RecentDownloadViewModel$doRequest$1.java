package ir.mservices.market.download.recentDownload;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.sk6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadViewModel$doRequest$1", f = "RecentDownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentDownloadViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ RecentDownloadViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadViewModel$doRequest$1(RecentDownloadViewModel recentDownloadViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = recentDownloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RecentDownloadViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecentDownloadViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        RecentDownloadViewModel recentDownloadViewModel = this.a;
        final sk6 sk6Var = recentDownloadViewModel.w;
        sk6Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.download.recentDownload.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new RecentDownloadRepositoryImpl$getRecentDownloads$1$1(sk6Var, null));
            }
        }).a, new z45(23, recentDownloadViewModel)), y97.G(recentDownloadViewModel)), null, null, null, 14);
    }
}
