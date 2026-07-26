package defpackage;

import android.content.Context;
import ir.mservices.market.app.detail.reivews.AppReviewsViewModel;
import ir.mservices.market.app.detail.reivews.data.ReviewListDto;
import ir.mservices.market.app.detail.reivews.recycler.RateWithoutCommentData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.TagDto;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class as implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppReviewsViewModel b;

    public /* synthetic */ as(AppReviewsViewModel appReviewsViewModel, int i) {
        this.a = i;
        this.b = appReviewsViewModel;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                RecyclerItem recyclerItem = (RecyclerItem) obj;
                js3.p(recyclerItem, "it");
                MyketRecyclerData myketRecyclerData = recyclerItem.c;
                AppRatingModuleData appRatingModuleData = myketRecyclerData instanceof AppRatingModuleData ? (AppRatingModuleData) myketRecyclerData : null;
                return Boolean.valueOf(m88.T(appRatingModuleData != null ? appRatingModuleData.a : null, this.b.B.a, false));
            default:
                ReviewListDto reviewListDto = (ReviewListDto) obj;
                AppReviewsViewModel appReviewsViewModel = this.b;
                l lVar = appReviewsViewModel.A;
                ArrayList arrayList = new ArrayList();
                dp3 dp3Var = appReviewsViewModel.v;
                yr yrVar = appReviewsViewModel.B;
                String str = yrVar.a;
                int[] iArr = yrVar.d;
                boolean zG = dp3Var.G(str);
                reviewListDto.getReviews().isEmpty();
                ReviewDto reviewDto = appReviewsViewModel.C;
                boolean z2 = reviewDto != null ? reviewDto.getRate() > 0.0f : false;
                if (!appReviewsViewModel.E || iArr.length == 0 || yrVar.c < 0.5d) {
                    z = true;
                } else {
                    arrayList.add(new ReviewHeaderData(iArr, yrVar.c, null, yrVar.a, true, zG, z2));
                    if (zG && !z2) {
                        arrayList.add(new AppRatingModuleData(yrVar.a, appReviewsViewModel.z, appReviewsViewModel.F, true, true));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    String string = ((Context) appReviewsViewModel.t.d).getResources().getString(rs6.all);
                    js3.o(string, "getString(...)");
                    z = true;
                    arrayList2.add(new RecyclerItem(new AppTagData(new TagDto(null, string, null), null, true, null, lVar)));
                    for (int i = 5; i > 0; i--) {
                        arrayList2.add(new RecyclerItem(new AppTagData(new TagDto(null, String.valueOf(i), null), Integer.valueOf(yq6.ic_star_fill), true, Integer.valueOf(i), lVar)));
                    }
                    arrayList.add(new AppHorizontalTagsData(new bz6(arrayList2, (GeneralFilter) null, (qp2) null, 6)));
                    lVar.o(appReviewsViewModel.D);
                }
                List<ReviewDto> reviews = reviewListDto.getReviews();
                ArrayList arrayList3 = new ArrayList();
                for (ReviewDto reviewDto2 : reviews) {
                    arrayList3.add(new ReviewData(reviewDto2, yrVar.a, true, (!m88.T(appReviewsViewModel.u.h.e(), reviewDto2.getAccountKey(), z) || reviewDto2.canRemove()) ? z : false, true, true, null, -1, appReviewsViewModel.y));
                }
                arrayList.addAll(arrayList3);
                if (reviewListDto.getEol()) {
                    int[] iArr2 = yrVar.e;
                    Integer num = appReviewsViewModel.D;
                    if (!appReviewsViewModel.E || !reviewListDto.getReviews().isEmpty()) {
                        z = false;
                    }
                    RateWithoutCommentData rateWithoutCommentData = new RateWithoutCommentData(iArr2, num, z);
                    int i2 = rateWithoutCommentData.c;
                    if ((i2 == 0 && z) || i2 != 0) {
                        arrayList.add(rateWithoutCommentData);
                    }
                }
                appReviewsViewModel.E = false;
                ArrayList arrayList4 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList4);
                }
                return arrayList4;
        }
    }
}
