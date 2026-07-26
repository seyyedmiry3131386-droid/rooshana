package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class tc2 implements fe {
    public final FirebaseAnalytics a;

    public tc2(FirebaseAnalytics firebaseAnalytics) {
        js3.p(firebaseAnalytics, "firebase");
        this.a = firebaseAnalytics;
    }

    @Override // defpackage.fe
    public final void a(Activity activity2, String str) {
        js3.p(activity2, "activity");
        this.a.setCurrentScreen(activity2, str, null);
    }

    @Override // defpackage.fe
    public final void b(String str, String str2) {
        yo9 yo9Var = this.a.a;
        yo9Var.getClass();
        yo9Var.c(new un9(yo9Var, (String) null, str, (Object) str2, false));
    }

    @Override // defpackage.fe
    public final void c(String str) {
        yo9 yo9Var = this.a.a;
        yo9Var.getClass();
        yo9Var.c(new xn9(yo9Var, str, 0));
    }

    @Override // defpackage.fe
    public final void d(Bundle bundle, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        yo9 yo9Var = this.a.a;
        yo9Var.getClass();
        yo9Var.c(new oo9(yo9Var, null, null, str, bundle, false, true));
    }
}
