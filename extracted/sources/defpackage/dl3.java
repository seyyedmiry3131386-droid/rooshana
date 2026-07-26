package defpackage;

import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment;
import ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class dl3 implements ze2 {
    public final /* synthetic */ InCompleteReviewRecyclerListFragment a;

    public dl3(InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment) {
        this.a = inCompleteReviewRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        InCompleteReviewDto inCompleteReviewDto;
        Pair pair = (Pair) obj;
        String str = (String) pair.a;
        int i = InCompleteReviewRecyclerListFragment.k1;
        InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = this.a;
        a aVar = inCompleteReviewRecyclerListFragment.Z0;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.D().d).iterator();
            while (it.hasNext()) {
                MyketRecyclerData myketRecyclerData = ((RecyclerItem) it.next()).c;
                js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData");
                inCompleteReviewDto = ((InCompleteReviewData) myketRecyclerData).a;
                if (js3.i(inCompleteReviewDto.getPackageName(), str)) {
                    break;
                }
            }
            inCompleteReviewDto = null;
        } else {
            inCompleteReviewDto = null;
        }
        if (inCompleteReviewDto != null) {
            MyReviewsContentViewModel myReviewsContentViewModel = (MyReviewsContentViewModel) ((c24) inCompleteReviewRecyclerListFragment.j1.getValue()).getValue();
            Object obj2 = pair.b;
            js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.common.comment.data.CommentResultState.Success");
            myReviewsContentViewModel.t(new Pair(inCompleteReviewDto, ((CommentResultState.Success) obj2).getData()));
        }
        String str2 = (String) pair.a;
        InCompleteReviewViewModel inCompleteReviewViewModel = (InCompleteReviewViewModel) inCompleteReviewRecyclerListFragment.i1.getValue();
        js3.p(str2, "packageName");
        inCompleteReviewViewModel.g(new yz5(new kt(str2, 5)));
        return tx8.a;
    }
}
