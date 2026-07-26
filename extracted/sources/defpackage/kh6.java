package defpackage;

import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;

/* JADX INFO: loaded from: classes3.dex */
public final class kh6 extends mh6 {
    public final SocialListPolicies a;
    public final ProfileApplicationListDto b;

    public kh6(SocialListPolicies socialListPolicies, ProfileApplicationListDto profileApplicationListDto) {
        js3.p(socialListPolicies, "socialPolicies");
        this.a = socialListPolicies;
        this.b = profileApplicationListDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh6)) {
            return false;
        }
        kh6 kh6Var = (kh6) obj;
        return js3.i(this.a, kh6Var.a) && js3.i(this.b, kh6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditApp(socialPolicies=" + this.a + ", applicationList=" + this.b + ")";
    }
}
