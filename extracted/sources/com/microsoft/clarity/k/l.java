package com.microsoft.clarity.k;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.i.C0093o;
import com.microsoft.clarity.models.DynamicConfig;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import defpackage.r59;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC0098d, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final ArrayList b;
    public final LinkedHashMap c;
    public WeakReference d;
    public WeakReference e;
    public boolean f;
    public boolean g;

    public l(Application application, ClarityConfig clarityConfig) {
        js3.p(application, "application");
        js3.p(clarityConfig, "config");
        this.a = application;
        this.b = new ArrayList();
        this.c = new LinkedHashMap();
        if (this.f) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        this.f = true;
    }

    public static final void a(l lVar, Activity activity2) {
        js3.p(lVar, "this$0");
        js3.p(activity2, "$lastResumedActivity");
        lVar.onActivityResumed(activity2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        js3.p(activity2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        js3.p(activity2, "activity");
        com.microsoft.clarity.q.g.a((bp2) new C0100f(this, activity2), (dp2) new C0101g(this), (C0093o) null, 26);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        js3.p(activity2, "activity");
        com.microsoft.clarity.q.g.a((bp2) new h(this, activity2), (dp2) new i(this), (C0093o) null, 26);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        js3.p(activity2, "activity");
        com.microsoft.clarity.q.g.a((bp2) new j(this, activity2), (dp2) new k(this), (C0093o) null, 26);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
        js3.p(activity2, "activity");
        js3.p(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        js3.p(activity2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        js3.p(activity2, "activity");
    }

    public final void a() {
        this.g = false;
        this.f = false;
        this.a.unregisterActivityLifecycleCallbacks(this);
    }

    public final void a(DynamicConfig dynamicConfig) {
        Activity activity2;
        js3.p(dynamicConfig, "dynamicConfig");
        if (!this.f) {
            this.a.registerActivityLifecycleCallbacks(this);
            this.f = true;
        }
        this.g = true;
        WeakReference weakReference = this.d;
        if (weakReference == null || (activity2 = (Activity) weakReference.get()) == null || this.c.get(Integer.valueOf(activity2.hashCode())) != EnumC0099e.ON_RESUME) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new r59(this, activity2, 24));
    }
}
