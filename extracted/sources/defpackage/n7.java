package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class n7 implements Application.ActivityLifecycleCallbacks {
    public Object a;
    public Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public n7(Activity activity2) {
        this.b = activity2;
        this.c = activity2.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        if (this.b == activity2) {
            this.b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        if (!this.e || this.f || this.d) {
            return;
        }
        Object obj = this.a;
        try {
            Object obj2 = o7.c.get(activity2);
            if (obj2 == obj && activity2.hashCode() == this.c) {
                o7.g.postAtFrontOfQueue(new g6(3, o7.b.get(activity2), obj2, false));
                this.f = true;
                this.a = null;
            }
        } catch (Throwable th) {
            t0.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        if (this.b == activity2) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }
}
