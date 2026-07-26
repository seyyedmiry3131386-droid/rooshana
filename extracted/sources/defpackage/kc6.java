package defpackage;

import ir.myket.movie.common.domain.models.RestrictionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class kc6 implements qc6 {
    public final RestrictionInfo a;

    public kc6(RestrictionInfo restrictionInfo) {
        js3.p(restrictionInfo, "restrictionInfo");
        this.a = restrictionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc6) && js3.i(this.a, ((kc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowRestrictionInfoDialog(restrictionInfo=" + this.a + ")";
    }
}
