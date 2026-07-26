package defpackage;

import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;

/* JADX INFO: loaded from: classes3.dex */
public final class lh6 extends mh6 {
    public final SocialListPolicies a;
    public final ProfileMovieListDto b;

    public lh6(SocialListPolicies socialListPolicies, ProfileMovieListDto profileMovieListDto) {
        js3.p(socialListPolicies, "socialPolicies");
        this.a = socialListPolicies;
        this.b = profileMovieListDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh6)) {
            return false;
        }
        lh6 lh6Var = (lh6) obj;
        return js3.i(this.a, lh6Var.a) && js3.i(this.b, lh6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditMovie(socialPolicies=" + this.a + ", movieList=" + this.b + ")";
    }
}
