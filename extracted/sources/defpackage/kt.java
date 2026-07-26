package defpackage;

import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import ir.mservices.market.app.detail.subReviews.recycler.SubReviewData;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kt implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ kt(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Exception {
        boolean zI;
        ReviewDto reviewDto;
        InCompleteReviewDto inCompleteReviewDto;
        String str;
        int i = this.a;
        String id = null;
        packageName = null;
        String packageName = null;
        id = null;
        tx8 tx8Var = tx8.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                RecyclerItem recyclerItem = (RecyclerItem) obj;
                js3.p(recyclerItem, "it");
                MyketRecyclerData myketRecyclerData = recyclerItem.c;
                SubReviewData subReviewData = myketRecyclerData instanceof SubReviewData ? (SubReviewData) myketRecyclerData : null;
                if (subReviewData != null && (reviewDto = subReviewData.a) != null) {
                    id = reviewDto.getId();
                }
                zI = js3.i(id, str2);
                break;
            case 1:
                nn7 nn7Var = (nn7) obj;
                ox3[] ox3VarArr = f.a;
                g gVar = d.j;
                ox3[] ox3VarArr2 = f.a;
                ox3 ox3Var = ox3VarArr2[3];
                nn7Var.a(gVar, new y94());
                g gVar2 = d.d;
                ox3 ox3Var2 = ox3VarArr2[2];
                nn7Var.a(gVar2, str2);
                return tx8Var;
            case 2:
                mb7 mb7Var = (mb7) obj;
                js3.p(mb7Var, "_connection");
                rb7 rb7VarM1 = mb7Var.m1("UPDATE callback_url SET retry_count = retry_count + 1 WHERE url = ?");
                try {
                    rb7VarM1.W(1, str2);
                    rb7VarM1.f1();
                    return tx8Var;
                } finally {
                }
            case 3:
                mb7 mb7Var2 = (mb7) obj;
                js3.p(mb7Var2, "_connection");
                rb7 rb7VarM12 = mb7Var2.m1("DELETE FROM callback_url WHERE url = ?");
                try {
                    rb7VarM12.W(1, str2);
                    rb7VarM12.f1();
                    return tx8Var;
                } finally {
                }
            case 4:
                Pair pair = (Pair) obj;
                js3.p(pair, "it");
                zI = js3.i(pair.a, str2);
                break;
            case 5:
                RecyclerItem recyclerItem2 = (RecyclerItem) obj;
                js3.p(recyclerItem2, "it");
                MyketRecyclerData myketRecyclerData2 = recyclerItem2.c;
                InCompleteReviewData inCompleteReviewData = myketRecyclerData2 instanceof InCompleteReviewData ? (InCompleteReviewData) myketRecyclerData2 : null;
                if (inCompleteReviewData != null && (inCompleteReviewDto = inCompleteReviewData.a) != null) {
                    packageName = inCompleteReviewDto.getPackageName();
                }
                zI = js3.i(packageName, str2);
                break;
            case 6:
                nn7 nn7Var2 = (nn7) obj;
                ox3[] ox3VarArr3 = f.a;
                g gVar3 = d.d;
                ox3[] ox3VarArr4 = f.a;
                ox3 ox3Var3 = ox3VarArr4[2];
                nn7Var2.a(gVar3, str2);
                g gVar4 = d.t;
                ox3 ox3Var4 = ox3VarArr4[11];
                nn7Var2.a(gVar4, Float.valueOf(0.0f));
                return tx8Var;
            case 7:
                mb7 mb7Var3 = (mb7) obj;
                js3.p(mb7Var3, "_connection");
                rb7 rb7VarM13 = mb7Var3.m1("SELECT * FROM movie_watch_progress WHERE play_id = ?");
                try {
                    rb7VarM13.W(1, str2);
                    return rb7VarM13.f1() ? new l85(rb7VarM13.getLong(sb7.j(rb7VarM13, "watched_time")), rb7VarM13.getLong(sb7.j(rb7VarM13, "movie_total_time")), rb7VarM13.getLong(sb7.j(rb7VarM13, "timestamp")), rb7VarM13.B0(sb7.j(rb7VarM13, "play_id")), rb7VarM13.B0(sb7.j(rb7VarM13, "movie_id"))) : null;
                } finally {
                }
            case 8:
                zI = js3.i((String) obj, str2);
                break;
            case 9:
                MyketRecyclerData myketRecyclerData3 = ((RecyclerItem) obj).c;
                SearchHistoryData searchHistoryData = myketRecyclerData3 instanceof SearchHistoryData ? (SearchHistoryData) myketRecyclerData3 : null;
                zI = m88.T(searchHistoryData != null ? searchHistoryData.b : null, str2, true);
                break;
            case 10:
                RecyclerItem recyclerItem3 = (RecyclerItem) obj;
                js3.p(recyclerItem3, "it");
                MyketRecyclerData myketRecyclerData4 = recyclerItem3.c;
                HarmFulAppViewData harmFulAppViewData = myketRecyclerData4 instanceof HarmFulAppViewData ? (HarmFulAppViewData) myketRecyclerData4 : null;
                return Boolean.valueOf((harmFulAppViewData == null || (str = harmFulAppViewData.a) == null || !str.equalsIgnoreCase(str2)) ? false : true);
            case 11:
                String str3 = (String) obj;
                js3.p(str3, "it");
                return f88.n0(str3) ? str3.length() < str2.length() ? str2 : str3 : t61.i(str2, str3);
            case 12:
                ox3[] ox3VarArr5 = f.a;
                ((nn7) obj).a(d.L, str2);
                return tx8Var;
            default:
                zI = UpdateViewModel.addRecommendationData$lambda$1$1$0(str2, (RecyclerItem) obj);
                break;
        }
        return Boolean.valueOf(zI);
    }
}
