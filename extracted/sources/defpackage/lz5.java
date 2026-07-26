package defpackage;

import android.os.Bundle;
import androidx.fragment.app.d;
import ir.mservices.market.app.bookmark.BookmarkContentFragment;
import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment;
import ir.mservices.market.download.app.DownloadRecyclerListFragment;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkRecyclerListFragment;
import ir.mservices.market.myReview.MyReviewsContentFragment;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment;
import ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lz5 extends xm2 {
    public final /* synthetic */ int m = 1;
    public final List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz5(d dVar, List list) {
        super(dVar);
        js3.p(list, "orderingArray");
        this.n = list;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        switch (this.m) {
        }
        return this.n.size();
    }

    @Override // defpackage.xm2
    public final d z(int i) {
        switch (this.m) {
            case 0:
                int iOrdinal = ((BookmarkType) this.n.get(i)).ordinal();
                if (iOrdinal == 0) {
                    AppBookmarkRecyclerListFragment appBookmarkRecyclerListFragment = new AppBookmarkRecyclerListFragment();
                    appBookmarkRecyclerListFragment.u0(new Bundle());
                    return appBookmarkRecyclerListFragment;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                MovieBookmarkRecyclerListFragment movieBookmarkRecyclerListFragment = new MovieBookmarkRecyclerListFragment();
                movieBookmarkRecyclerListFragment.u0(new Bundle());
                return movieBookmarkRecyclerListFragment;
            case 1:
                int iOrdinal2 = ((RecentDownloadType) this.n.get(i)).ordinal();
                if (iOrdinal2 == 0) {
                    return new DownloadRecyclerListFragment();
                }
                if (iOrdinal2 == 1) {
                    return new MovieDownloadRecyclerListFragment();
                }
                throw new NoWhenBranchMatchedException();
            default:
                int iOrdinal3 = ((MyReviewType) this.n.get(i)).ordinal();
                if (iOrdinal3 == 0) {
                    InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = new InCompleteReviewRecyclerListFragment();
                    inCompleteReviewRecyclerListFragment.u0(new Bundle());
                    return inCompleteReviewRecyclerListFragment;
                }
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = new CompleteReviewRecyclerListFragment();
                completeReviewRecyclerListFragment.u0(new Bundle());
                return completeReviewRecyclerListFragment;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz5(BookmarkContentFragment bookmarkContentFragment, List list) {
        super(bookmarkContentFragment);
        js3.p(list, "tabs");
        this.n = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz5(MyReviewsContentFragment myReviewsContentFragment, List list) {
        super(myReviewsContentFragment);
        js3.p(list, "tabs");
        this.n = list;
    }
}
