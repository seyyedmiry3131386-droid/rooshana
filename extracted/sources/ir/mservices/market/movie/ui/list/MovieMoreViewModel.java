package ir.mservices.market.movie.ui.list;

import defpackage.jd7;
import defpackage.js3;
import defpackage.k45;
import defpackage.o45;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieMoreViewModel extends c {
    public final k45 t;
    public final o45 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieMoreViewModel(jd7 jd7Var, k45 k45Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.t = k45Var;
        if (!jd7Var.a("packageKey")) {
            throw new IllegalArgumentException("Required argument \"packageKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageKey\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("title");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("analyticsName")) {
            throw new IllegalArgumentException("Required argument \"analyticsName\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("analyticsName");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"analyticsName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("search")) {
            throw new IllegalArgumentException("Required argument \"search\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) jd7Var.b("search");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"search\" of type boolean does not support null values");
        }
        this.u = new o45(str, str2, str3, bool.booleanValue());
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieMoreViewModel$doRequest$1(this, null));
    }
}
