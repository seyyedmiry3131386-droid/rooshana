package ir.mservices.market.movie.ui.detail.review;

import defpackage.g32;
import defpackage.h45;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewTitleData implements MyketRecyclerData, wo2, h45, g32 {
    public static final int a = js6.movie_review_title;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // defpackage.h45
    public final String a() {
        return "review_title";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return MovieReviewTitleData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "review_title";
    }
}
