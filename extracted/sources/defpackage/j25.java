package defpackage;

import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;

/* JADX INFO: loaded from: classes3.dex */
public final class j25 {
    public final es1 a;
    public final bs1 b;

    public j25(es1 es1Var, es1 es1Var2) {
        this.a = es1Var;
        this.b = es1Var2;
    }

    public final boolean a(ss1 ss1Var) {
        if (ss1Var.a instanceof v36) {
            j(ss1Var, new us3(29));
            j(ss1Var, new i25(0));
            return true;
        }
        boolean zM = ss1Var.m(this.a);
        bs1 bs1Var = this.b;
        return bs1Var != null ? zM && ss1Var.m(bs1Var) : zM;
    }

    public final int b() {
        Integer numValueOf = Integer.valueOf(this.a.g);
        bs1 bs1Var = this.b;
        return s7.u(br9.E(numValueOf, bs1Var != null ? Integer.valueOf(((es1) bs1Var).g) : null));
    }

    public final String c() {
        Object obj = this.a.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        return ((MovieDownloadMetaData) obj).l;
    }

    public final MovieDownloadMetaData d() {
        Object obj = this.a.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        return (MovieDownloadMetaData) obj;
    }

    public final String e() {
        es1 es1Var = this.a;
        Object obj = es1Var.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        String str = ((MovieDownloadMetaData) obj).c;
        Object obj2 = es1Var.e;
        js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        String str2 = ((MovieDownloadMetaData) obj2).d;
        String strConcat = str2 != null ? str2.concat(" - ") : null;
        Object obj3 = es1Var.e;
        js3.n(obj3, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        return rm7.q(str, " - ", strConcat, ((MovieDownloadMetaData) obj3).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j25)) {
            return false;
        }
        j25 j25Var = (j25) obj;
        if (!js3.i(this.a.d, j25Var.a.d)) {
            return false;
        }
        bs1 bs1Var = this.b;
        String str = bs1Var != null ? ((es1) bs1Var).d : null;
        bs1 bs1Var2 = j25Var.b;
        return js3.i(str, bs1Var2 != null ? ((es1) bs1Var2).d : null);
    }

    public final String f() {
        Object obj = this.a.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        String str = ((MovieDownloadMetaData) obj).a;
        return str == null ? "" : str;
    }

    public final int g() {
        if (h() <= 0) {
            return 0;
        }
        long j = this.a.i;
        bs1 bs1Var = this.b;
        return (int) (((j + (bs1Var != null ? ((es1) bs1Var).i : 0L)) * ((long) 100)) / h());
    }

    public final long h() {
        Object obj = this.a.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.core.model.MovieDownloadMetaData");
        long j = ((MovieDownloadMetaData) obj).h;
        bs1 bs1Var = this.b;
        if (bs1Var == null) {
            return j;
        }
        long j2 = ((es1) bs1Var).h;
        Long lValueOf = Long.valueOf(j2);
        if (j2 <= -1) {
            lValueOf = null;
        }
        return j + (lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public final int hashCode() {
        String str;
        int iHashCode = this.a.d.hashCode() * 31;
        bs1 bs1Var = this.b;
        return iHashCode + ((bs1Var == null || (str = ((es1) bs1Var).d) == null) ? 0 : str.hashCode());
    }

    public final int i() {
        Integer numValueOf = Integer.valueOf(this.a.f);
        bs1 bs1Var = this.b;
        return s7.v(br9.E(numValueOf, bs1Var != null ? Integer.valueOf(((es1) bs1Var).f) : null));
    }

    public final void j(ss1 ss1Var, dp2 dp2Var) {
        es1 es1Var = this.a;
        if (((Boolean) dp2Var.invoke(es1Var)).booleanValue()) {
            ss1Var.m(es1Var);
        }
        bs1 bs1Var = this.b;
        if (bs1Var != null) {
            if (!((Boolean) dp2Var.invoke(bs1Var)).booleanValue()) {
                bs1Var = null;
            }
            if (bs1Var != null) {
                ss1Var.m(bs1Var);
            }
        }
    }
}
