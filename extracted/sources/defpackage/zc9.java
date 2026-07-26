package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zc9 implements ai5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zc9(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        js3.p(str, "url");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public static final zc9 fromBundle(Bundle bundle) {
        return z67.h(bundle);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.a);
        bundle.putString("title", this.b);
        bundle.putBoolean("shareLink", this.c);
        bundle.putBoolean("showBottomNavigation", this.d);
        bundle.putBoolean("openByWebView", this.e);
        bundle.putBoolean("launchViewIntent", this.f);
        bundle.putBoolean("finishOnBackPress", this.g);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc9)) {
            return false;
        }
        zc9 zc9Var = (zc9) obj;
        return js3.i(this.a, zc9Var.a) && js3.i(this.b, zc9Var.b) && this.c == zc9Var.c && this.d == zc9Var.d && this.e == zc9Var.e && this.f == zc9Var.f && this.g == zc9Var.g;
    }

    public final int hashCode() {
        return ((((((((rm7.k(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("WebViewFragmentArgs(url=", this.a, ", title=", this.b, ", shareLink=");
        t61.A(sbT, this.c, ", showBottomNavigation=", this.d, ", openByWebView=");
        t61.A(sbT, this.e, ", launchViewIntent=", this.f, ", finishOnBackPress=");
        return t61.l(sbT, this.g, ")");
    }
}
