package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.HandlerThread;
import defpackage.ur4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements Application.ActivityLifecycleCallbacks {
    public final WeakReference a;
    public final /* synthetic */ p1 b;

    public o1(p1 p1Var, WeakReference weakReference) {
        this.b = p1Var;
        this.a = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        Activity activity3;
        if (activity2 == this.a.get()) {
            p1 p1Var = this.b;
            l1 l1Var = p1Var.e;
            if (l1Var != null) {
                l1Var.c();
                HandlerThread handlerThread = l1Var.c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    l1Var.c = null;
                    l1Var.d = null;
                }
                p1Var.e = null;
            }
            if (p1Var.f != null) {
                Context context = p1Var.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity3 = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity3 = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity3 != null) {
                    activity3.getApplication().unregisterActivityLifecycleCallbacks(p1Var.f);
                }
                p1Var.f = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        l1 l1Var;
        if (activity2 != this.a.get() || (l1Var = this.b.e) == null) {
            return;
        }
        l1Var.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        p1 p1Var;
        l1 l1Var;
        WeakReference weakReference = this.a;
        if (activity2 != weakReference.get() || (l1Var = (p1Var = this.b).e) == null) {
            return;
        }
        l1Var.b(activity2, new ur4(p1Var, weakReference, 24));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
    }
}
