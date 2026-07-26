package defpackage;

import ir.mservices.market.social.profile.list.data.SocialListPolicies;

/* JADX INFO: loaded from: classes3.dex */
public final class jh6 extends mh6 {
    public final SocialListPolicies a;

    public jh6(SocialListPolicies socialListPolicies) {
        js3.p(socialListPolicies, "socialPolicies");
        this.a = socialListPolicies;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh6) && js3.i(this.a, ((jh6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddMovie(socialPolicies=" + this.a + ")";
    }
}
