package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;

/* JADX INFO: loaded from: classes.dex */
public final class lk6 extends y02 {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends y02 {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity2) {
            js3.p(activity2, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity2) {
            js3.p(activity2, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i = processLifecycleOwner.a + 1;
            processLifecycleOwner.a = i;
            if (i == 1 && processLifecycleOwner.d) {
                processLifecycleOwner.f.d(Lifecycle$Event.ON_START);
                processLifecycleOwner.d = false;
            }
        }
    }

    public lk6(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // defpackage.y02, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity2, Bundle bundle) {
        js3.p(activity2, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = ReportFragment.b;
            Fragment fragmentFindFragmentByTag = activity2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            js3.n(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((ReportFragment) fragmentFindFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // defpackage.y02, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity2) {
        js3.p(activity2, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.b - 1;
        processLifecycleOwner.b = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.e;
            js3.m(handler);
            handler.postDelayed(processLifecycleOwner.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity2, Bundle bundle) {
        js3.p(activity2, "activity");
        te.I(activity2, new a(this.this$0));
    }

    @Override // defpackage.y02, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity2) {
        js3.p(activity2, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.a - 1;
        processLifecycleOwner.a = i;
        if (i == 0 && processLifecycleOwner.c) {
            processLifecycleOwner.f.d(Lifecycle$Event.ON_STOP);
            processLifecycleOwner.d = true;
        }
    }
}
