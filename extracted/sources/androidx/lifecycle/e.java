package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.ReportFragment;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(Activity activity2) {
        js3.p(activity2, "activity");
        activity2.registerActivityLifecycleCallbacks(new ReportFragment.a());
    }
}
