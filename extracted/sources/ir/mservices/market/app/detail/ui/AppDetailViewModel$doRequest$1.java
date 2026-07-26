package ir.mservices.market.app.detail.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hp;
import defpackage.js3;
import defpackage.n;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v24;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperTitleRowData;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotListData;
import ir.mservices.market.app.detail.ui.recycler.CommentMoreData;
import ir.mservices.market.app.detail.ui.recycler.LocalMessageBoxData;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.model.paging.b;
import ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$doRequest$1", f = "AppDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppDetailViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ AppDetailViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            AppDetailViewModel appDetailViewModel = (AppDetailViewModel) this.receiver;
            appDetailViewModel.getClass();
            if (recyclerItem != null) {
                MyketRecyclerData myketRecyclerData = recyclerItem.c;
                if ((recyclerItem2 != null ? recyclerItem2.c : null) instanceof DeveloperTitleRowData) {
                    DividerData dividerData = new DividerData();
                    dividerData.g = pq6.space_l;
                    dividerData.b = false;
                    return new RecyclerItem(dividerData);
                }
                if (!appDetailViewModel.V() && (myketRecyclerData instanceof AppDeveloperInfoModuleData)) {
                    if ((recyclerItem2 != null ? recyclerItem2.c : null) == null) {
                        DividerData dividerData2 = new DividerData();
                        dividerData2.g = pq6.space_16;
                        dividerData2.b = false;
                        return new RecyclerItem(dividerData2);
                    }
                }
                if ((myketRecyclerData instanceof AppDownloadData) || (myketRecyclerData instanceof MessageBoxData) || (myketRecyclerData instanceof AppHorizontalTagsData) || (myketRecyclerData instanceof MovieHomeBannersRowData) || (myketRecyclerData instanceof LocalMessageBoxData) || (myketRecyclerData instanceof AddaxBoxData) || (myketRecyclerData instanceof AppScreenshotListData) || (myketRecyclerData instanceof CommentMoreData)) {
                    if (!((recyclerItem2 != null ? recyclerItem2.c : null) instanceof HorizontalSummaryData)) {
                        DividerData dividerData3 = new DividerData();
                        dividerData3.g = pq6.space_l;
                        dividerData3.b = false;
                        return new RecyclerItem(dividerData3);
                    }
                } else if (myketRecyclerData instanceof HorizontalSummaryData) {
                    if ((recyclerItem2 != null ? recyclerItem2.c : null) instanceof AppScreenshotListData) {
                        DividerData dividerData4 = new DividerData();
                        dividerData4.g = pq6.space_l;
                        dividerData4.b = false;
                        return new RecyclerItem(dividerData4);
                    }
                } else if (myketRecyclerData instanceof HomeAppsRowData) {
                    if (!((recyclerItem2 != null ? recyclerItem2.c : null) instanceof HomeMoreTitleRowData)) {
                        if (!((recyclerItem2 != null ? recyclerItem2.c : null) instanceof ExtHeaderRowData)) {
                            DividerData dividerData5 = new DividerData();
                            dividerData5.g = pq6.space_l;
                            dividerData5.b = false;
                            return new RecyclerItem(dividerData5);
                        }
                    }
                    DividerData dividerData6 = new DividerData();
                    dividerData6.g = pq6.space_xl;
                    dividerData6.b = false;
                    return new RecyclerItem(dividerData6);
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel$doRequest$1(AppDetailViewModel appDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = appDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        final AppDetailViewModel appDetailViewModel = this.a;
        final v24 v24Var = appDetailViewModel.v;
        final StartApplicationData startApplicationData = appDetailViewModel.K0;
        hp hpVar = appDetailViewModel.J0;
        final String str = hpVar.a;
        final String strT = appDetailViewModel.T();
        final int i = appDetailViewModel.L;
        final float f = appDetailViewModel.K;
        final String str2 = hpVar.e;
        final Utm utm = hpVar.j;
        final String str3 = hpVar.k;
        v24Var.getClass();
        js3.p(str, "packageName");
        js3.p(strT, "refId");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.app.detail.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new b(new AppDetailRepositoryImpl$getApplicationDetail$1$1(startApplicationData, v24Var, str, appDetailViewModel, strT, i, f, str2, utm, str3, null));
            }
        }).a, new n(8, appDetailViewModel)), y97.G(appDetailViewModel)), null, new AnonymousClass2(2, appDetailViewModel, AppDetailViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
