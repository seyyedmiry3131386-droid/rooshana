package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class v15 implements ai5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public v15(String str, String str2, boolean z, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public static final v15 fromBundle(Bundle bundle) {
        return dy3.u(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v15)) {
            return false;
        }
        v15 v15Var = (v15) obj;
        return js3.i(this.a, v15Var.a) && js3.i(this.b, v15Var.b) && this.c == v15Var.c && js3.i(this.d, v15Var.d) && js3.i(this.e, v15Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieDetailRecyclerListFragmentArgs(movieId=", this.a, ", refId=", this.b, ", play=");
        t61.z(sbT, this.c, ", posterUrl=", this.d, ", playId=");
        return dw1.s(sbT, this.e, ")");
    }
}
