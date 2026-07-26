package ir.mservices.market.app.recommended.ui;

import android.os.Parcelable;
import defpackage.jd7;
import defpackage.js3;
import defpackage.jy6;
import defpackage.xg5;
import defpackage.yl5;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendedViewModel extends c {
    public final xg5 t;
    public final a u;
    public final yl5 v;
    public final jy6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedViewModel(xg5 xg5Var, a aVar, yl5 yl5Var, jd7 jd7Var) {
        super(true);
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "downloadRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.t = xg5Var;
        this.u = aVar;
        this.v = yl5Var;
        if (!jd7Var.a("accountId")) {
            throw new IllegalArgumentException("Required argument \"accountId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"accountId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("packageName");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("title");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("recommendedType")) {
            throw new IllegalArgumentException("Required argument \"recommendedType\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) jd7Var.b("recommendedType");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"recommendedType\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) jd7Var.b("launchSource");
        if (tracker == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value");
        }
        this.w = new jy6(str, str2, str3, str4, tracker);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new RecommendedViewModel$doRequest$1(this, null));
    }
}
