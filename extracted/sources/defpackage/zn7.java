package defpackage;

import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zn7 {
    public final String a;
    public final int b;
    public final MovieCommentFlowViewModel c;
    public final boolean d;
    public final int e;
    public final int f;

    public zn7(String str, int i, MovieCommentFlowViewModel movieCommentFlowViewModel, boolean z, int i2, int i3) {
        js3.p(str, "movieId");
        this.a = str;
        this.b = i;
        this.c = movieCommentFlowViewModel;
        this.d = z;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn7)) {
            return false;
        }
        zn7 zn7Var = (zn7) obj;
        return js3.i(this.a, zn7Var.a) && this.b == zn7Var.b && this.c.equals(zn7Var.c) && this.d == zn7Var.d && this.e == zn7Var.e && this.f == zn7Var.f;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "RequestParams(movieId=", this.a, ", reviewId=", ", tag=");
        sbB.append(this.c);
        sbB.append(", isLiked=");
        sbB.append(this.d);
        sbB.append(", positiveLikes=");
        sbB.append(this.e);
        sbB.append(", negativeLikes=");
        sbB.append(this.f);
        sbB.append(")");
        return sbB.toString();
    }
}
