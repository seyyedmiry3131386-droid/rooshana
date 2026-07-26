package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import coil3.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ci implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ ai0 b;

    public ci(ai0 ai0Var, a aVar) {
        this.b = ai0Var;
        bw6 bw6Var = aVar.a;
        zn5 zn5Var = ii3.a;
        Object obj = bw6Var.b.n.a.get(ii3.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.a;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        js3.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        ai0 ai0Var = this.b;
        a aVar = (a) ((WeakReference) ai0Var.b).get();
        if (aVar == null) {
            ai0Var.y();
            return;
        }
        dw6 dw6VarC = aVar.c();
        if (dw6VarC != null) {
            synchronized (dw6VarC.c) {
                j = dw6VarC.a.a;
            }
            dw6VarC.d((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        js3.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        ai0 ai0Var = this.b;
        a aVar = (a) ((WeakReference) ai0Var.b).get();
        if (aVar == null) {
            ai0Var.y();
            return;
        }
        dw6 dw6VarC = aVar.c();
        if (dw6VarC != null) {
            synchronized (dw6VarC.c) {
                j = dw6VarC.a.a;
            }
            dw6VarC.d(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        b(activity2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity2) {
    }
}
