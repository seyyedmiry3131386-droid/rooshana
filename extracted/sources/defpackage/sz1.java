package defpackage;

import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;

/* JADX INFO: loaded from: classes3.dex */
public final class sz1 {
    public final LikeOrDislikeData a;

    public sz1(LikeOrDislikeData likeOrDislikeData) {
        js3.p(likeOrDislikeData, "data");
        this.a = likeOrDislikeData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz1) && js3.i(this.a, ((sz1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestParams(data=" + this.a + ")";
    }
}
