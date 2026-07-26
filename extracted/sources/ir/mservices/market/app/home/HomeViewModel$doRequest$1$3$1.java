package ir.mservices.market.app.home;

import defpackage.pq6;
import defpackage.qp2;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeExtReviewModuleData;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.app.home.ui.recycler.HomeVideoListData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class HomeViewModel$doRequest$1$3$1 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
        ((HomeViewModel) this.receiver).getClass();
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        if (!(myketRecyclerData instanceof HomeBannerData) && !(myketRecyclerData instanceof FilteredAppNestedData) && !(myketRecyclerData instanceof HomeAppsRowData) && !(myketRecyclerData instanceof HomeVideoListData) && !(myketRecyclerData instanceof HomeBannerAppsData) && !(myketRecyclerData instanceof MovieHomeMoviesRowData) && !(myketRecyclerData instanceof HomeExtReviewModuleData) && !(myketRecyclerData instanceof HomeSingleAppData) && !(myketRecyclerData instanceof AddaxBoxData) && !(myketRecyclerData instanceof MovieHomeBannersRowData)) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.d = pq6.space_m;
        dividerData.b = false;
        return new RecyclerItem(dividerData);
    }
}
