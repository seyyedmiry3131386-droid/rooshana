package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class xm8 implements ai5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public xm8(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        js3.p(str, "url");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public static final xm8 fromBundle(Bundle bundle) {
        return c67.e(bundle);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.a);
        bundle.putString("title", this.b);
        bundle.putBoolean("showBottomNavigation", this.c);
        bundle.putBoolean("showToolbarDivider", this.d);
        bundle.putBoolean("showToolbar", this.e);
        bundle.putBoolean("cacheControl", this.f);
        bundle.putBoolean("finishOnBackPress", this.g);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm8)) {
            return false;
        }
        xm8 xm8Var = (xm8) obj;
        return js3.i(this.a, xm8Var.a) && js3.i(this.b, xm8Var.b) && this.c == xm8Var.c && this.d == xm8Var.d && this.e == xm8Var.e && this.f == xm8Var.f && this.g == xm8Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("TogoFragmentArgs(url=", this.a, ", title=", this.b, ", showBottomNavigation=");
        t61.A(sbT, this.c, ", showToolbarDivider=", this.d, ", showToolbar=");
        t61.A(sbT, this.e, ", cacheControl=", this.f, ", finishOnBackPress=");
        return t61.l(sbT, this.g, ")");
    }
}
