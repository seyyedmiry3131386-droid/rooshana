package ir.mservices.market.app.packages.ui;

import defpackage.hl5;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.oy5;
import defpackage.rv6;
import defpackage.yl5;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageViewModel extends c {
    public final hl5 t;
    public final a u;
    public final yl5 v;
    public final oy5 w;
    public final l x;
    public final rv6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageViewModel(hl5 hl5Var, a aVar, yl5 yl5Var, jd7 jd7Var) {
        super(true);
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.t = hl5Var;
        this.u = aVar;
        this.v = yl5Var;
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("title");
        if (!jd7Var.a("packageKey")) {
            throw new IllegalArgumentException("Required argument \"packageKey\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("packageKey");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"packageKey\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("launchSource");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        this.w = new oy5(str, str2, str3, (String) jd7Var.b("refId"));
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new PackageViewModel$doRequest$1(this, null));
    }
}
