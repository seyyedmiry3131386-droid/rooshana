package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import defpackage.c35;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public class ReportFragment extends Fragment {
    public static final /* synthetic */ int b = 0;
    public c35 a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final e Companion = new e();

        public static final void registerIn(Activity activity2) {
            Companion.getClass();
            e.a(activity2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity2, Bundle bundle) {
            js3.p(activity2, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity2) {
            js3.p(activity2, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity2) {
            js3.p(activity2, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity2, Bundle bundle) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity2) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity2) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity2) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity2) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity2) {
            js3.p(activity2, "activity");
            int i = ReportFragment.b;
            d.a(activity2, Lifecycle$Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity2) {
            js3.p(activity2, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            js3.p(activity2, "activity");
            js3.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity2) {
            js3.p(activity2, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity2) {
            js3.p(activity2, "activity");
        }
    }

    public final void a(Lifecycle$Event lifecycle$Event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity2 = getActivity();
            js3.o(activity2, "getActivity(...)");
            d.a(activity2, lifecycle$Event);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(Lifecycle$Event.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(Lifecycle$Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        c35 c35Var = this.a;
        if (c35Var != null) {
            ((ProcessLifecycleOwner) c35Var.b).a();
        }
        a(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        c35 c35Var = this.a;
        if (c35Var != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c35Var.b;
            int i = processLifecycleOwner.a + 1;
            processLifecycleOwner.a = i;
            if (i == 1 && processLifecycleOwner.d) {
                processLifecycleOwner.f.d(Lifecycle$Event.ON_START);
                processLifecycleOwner.d = false;
            }
        }
        a(Lifecycle$Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(Lifecycle$Event.ON_STOP);
    }
}
