package defpackage;

import ir.myket.movie.common.domain.models.MovieType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class pz4 extends a27 {
    public static final oz4 Companion = new oz4();
    public static final c24[] l;
    public final String d;
    public final String e;
    public final String f;
    public final pj3 g;
    public final String h;
    public final MovieType i;
    public final String j;
    public final String k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        l = new c24[]{null, null, null, a.b(lazyThreadSafetyMode, new ob4(11)), null, a.b(lazyThreadSafetyMode, new ob4(12)), null, null};
    }

    public /* synthetic */ pz4(int i, String str, String str2, String str3, pj3 pj3Var, String str4, MovieType movieType, String str5, String str6) {
        if (255 != (i & 255)) {
            wq2.S(i, 255, nz4.a.getDescriptor());
            throw null;
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = pj3Var;
        this.h = str4;
        this.i = movieType;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz4)) {
            return false;
        }
        pz4 pz4Var = (pz4) obj;
        return js3.i(this.d, pz4Var.d) && js3.i(this.j, pz4Var.j) && super.equals(obj);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.j;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + super.hashCode();
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("Movie(id=", this.d, ", title=", this.e, ", posterUrl=");
        sbT.append(this.f);
        sbT.append(", seasons=");
        sbT.append(this.g);
        sbT.append(", secondaryTitle=");
        sbT.append(this.h);
        sbT.append(", type=");
        sbT.append(this.i);
        sbT.append(", refId=");
        return dw1.p(this.j, ", action=", this.k, ")", sbT);
    }

    public pz4(String str, String str2, String str3, pj3 pj3Var, String str4, MovieType movieType, String str5, String str6) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "posterUrl");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = pj3Var;
        this.h = str4;
        this.i = movieType;
        this.j = str5;
        this.k = str6;
    }
}
