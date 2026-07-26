package ir.mservices.market.movie.ui.detail.review.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.y80;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LikeOrDislikeData implements Serializable, y80 {
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public LikeOrDislikeData(String str, int i, boolean z, int i2, int i3) {
        js3.p(str, "movieId");
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeOrDislikeData)) {
            return false;
        }
        LikeOrDislikeData likeOrDislikeData = (LikeOrDislikeData) obj;
        return js3.i(this.a, likeOrDislikeData.a) && this.b == likeOrDislikeData.b && this.c == likeOrDislikeData.c && this.d == likeOrDislikeData.d && this.e == likeOrDislikeData.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "LikeOrDislikeData(movieId=", this.a, ", reviewId=", ", isLiked=");
        sbB.append(this.c);
        sbB.append(", positiveLikes=");
        sbB.append(this.d);
        sbB.append(", negativeLikes=");
        return dw1.k(this.e, ")", sbB);
    }
}
