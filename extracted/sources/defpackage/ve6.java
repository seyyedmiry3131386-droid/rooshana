package defpackage;

import ir.myket.movie.common.domain.models.MovieType;

/* JADX INFO: loaded from: classes3.dex */
public final class ve6 implements kj5 {
    public final xc6 a;
    public final MovieType b;

    public ve6(xc6 xc6Var, MovieType movieType) {
        js3.p(xc6Var, "playerConfig");
        js3.p(movieType, "movieType");
        this.a = xc6Var;
        this.b = movieType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve6)) {
            return false;
        }
        ve6 ve6Var = (ve6) obj;
        return js3.i(this.a, ve6Var.a) && this.b == ve6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoreOptionsBottomSheetNavKey(playerConfig=" + this.a + ", movieType=" + this.b + ")";
    }
}
