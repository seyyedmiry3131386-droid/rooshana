package ir.mservices.market.app.appList;

import android.os.Parcelable;
import defpackage.jd7;
import defpackage.js3;
import defpackage.tq;
import defpackage.yl5;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppListViewModel extends c {
    public final yl5 t;
    public final a u;
    public final tq v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel(yl5 yl5Var, a aVar, jd7 jd7Var) {
        super(true);
        js3.p(yl5Var, "downloadRepository");
        js3.p(aVar, "installQueue");
        js3.p(jd7Var, "savedStateHandle");
        this.t = yl5Var;
        this.u = aVar;
        if (!jd7Var.a("apps")) {
            throw new IllegalArgumentException("Required argument \"apps\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ApplicationList.class) && !Serializable.class.isAssignableFrom(ApplicationList.class)) {
            throw new UnsupportedOperationException(ApplicationList.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ApplicationList applicationList = (ApplicationList) jd7Var.b("apps");
        if (applicationList == null) {
            throw new IllegalArgumentException("Argument \"apps\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("title");
        if (!jd7Var.a("ignoreCondition")) {
            throw new IllegalArgumentException("Required argument \"ignoreCondition\" is missing and does not have an android:defaultValue");
        }
        this.v = new tq(applicationList, str, (String[]) jd7Var.b("ignoreCondition"));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new AppListViewModel$doRequest$1$1(this.v.a.apps, this, null));
    }
}
