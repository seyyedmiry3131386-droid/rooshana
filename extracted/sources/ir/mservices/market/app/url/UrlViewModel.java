package ir.mservices.market.app.url;

import defpackage.jd7;
import defpackage.js3;
import defpackage.nm5;
import defpackage.t09;
import defpackage.vr2;
import defpackage.wv8;
import defpackage.yl5;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlViewModel extends c {
    public final yl5 t;
    public final a u;
    public final vr2 v;
    public final vr2 w;
    public final wv8 x;
    public final nm5 y;
    public final t09 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlViewModel(jd7 jd7Var, yl5 yl5Var, a aVar, vr2 vr2Var, vr2 vr2Var2, wv8 wv8Var, nm5 nm5Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar, "installQueue");
        this.t = yl5Var;
        this.u = aVar;
        this.v = vr2Var;
        this.w = vr2Var2;
        this.x = wv8Var;
        this.y = nm5Var;
        if (!jd7Var.a("url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("url");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("launchSource");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("title");
        if (!jd7Var.a("type")) {
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) jd7Var.b("type");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value");
        }
        this.z = new t09(str, str2, str3, str4);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new UrlViewModel$doRequest$1(this, null));
    }
}
