package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.ReportFragment;
import defpackage.g64;
import defpackage.i64;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity2, Lifecycle$Event lifecycle$Event) {
        js3.p(lifecycle$Event, "event");
        if (activity2 instanceof g64) {
            i64 i64VarD = ((g64) activity2).D();
            if (i64VarD instanceof i64) {
                i64VarD.d(lifecycle$Event);
            }
        }
    }

    public static void b(Activity activity2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ReportFragment.a.Companion.getClass();
            e.a(activity2);
        }
        FragmentManager fragmentManager = activity2.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
