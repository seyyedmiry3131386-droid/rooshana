package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import defpackage.a28;
import defpackage.bt2;
import defpackage.is3;
import defpackage.jj1;
import defpackage.jl4;
import defpackage.js3;
import defpackage.n94;
import defpackage.sc9;
import defpackage.tc9;
import defpackage.up1;

/* JADX INFO: loaded from: classes.dex */
public final class MeasurementManagerFutures$Api33Ext5JavaImpl extends jl4 {
    public final is3 a;

    public MeasurementManagerFutures$Api33Ext5JavaImpl(is3 is3Var) {
        this.a = is3Var;
    }

    @Override // defpackage.jl4
    public n94 a() {
        return a.a(bt2.h(js3.a(up1.a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3));
    }

    @Override // defpackage.jl4
    public n94 b(Uri uri) {
        js3.p(uri, "trigger");
        return a.a(bt2.h(js3.a(up1.a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, null), 3));
    }

    public n94 c(jj1 jj1Var) {
        js3.p(jj1Var, "deletionRequest");
        throw null;
    }

    public n94 d(a28 a28Var) {
        js3.p(a28Var, "request");
        throw null;
    }

    public n94 e(Uri uri, InputEvent inputEvent) {
        js3.p(uri, "attributionSource");
        return a.a(bt2.h(js3.a(up1.a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, null), 3));
    }

    public n94 f(sc9 sc9Var) {
        js3.p(sc9Var, "request");
        throw null;
    }

    public n94 g(tc9 tc9Var) {
        js3.p(tc9Var, "request");
        throw null;
    }
}
