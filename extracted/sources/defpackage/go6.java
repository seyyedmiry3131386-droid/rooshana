package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import ir.mservices.market.activity.LaunchContentActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class go6 implements Application.ActivityLifecycleCallbacks {
    public static int g;
    public static int h;
    public boolean a;
    public c5 b;
    public lu7 c;
    public op5 d;
    public qu2 e;
    public WeakReference f;

    static {
        rk1.a("PushMessageServiceHelper");
        g = 0;
        h = 0;
    }

    public final void a() {
        if (TextUtils.isEmpty(this.b.a())) {
            return;
        }
        this.e.a(new eo6(this), 10000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        if (!(activity2 instanceof LaunchContentActivity) || this.a) {
            return;
        }
        this.f = new WeakReference(activity2);
        if (bundle != null ? bundle.getBoolean("BUNDLE_KEY_IS_SAVED_INSTANCE", false) : false) {
            return;
        }
        a();
        this.a = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public void onEvent(w4 w4Var) {
        a();
    }

    public void onEvent(x4 x4Var) {
        this.c.i(lu7.j0, "");
    }

    public void onEvent(b5 b5Var) {
        this.c.i(lu7.j0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }
}
