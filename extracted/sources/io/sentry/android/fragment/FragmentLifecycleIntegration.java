package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import defpackage.hh2;
import defpackage.js3;
import defpackage.ll2;
import defpackage.wl2;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.e5;
import io.sentry.q1;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, q1, Closeable {
    public final Application a;
    public final Set b;
    public final boolean c;
    public c4 d;
    public b6 e;

    static {
        e5.d().b("maven:io.sentry:sentry-android-fragment", "8.43.1");
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends FragmentLifecycleState> set, boolean z) {
        js3.p(application, "application");
        js3.p(set, "filterFragmentLifecycleBreadcrumbs");
        this.a = application;
        this.b = set;
        this.c = z;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        this.d = c4.a;
        this.e = b6Var;
        this.a.registerActivityLifecycleCallbacks(this);
        b6Var.getLogger().i(SentryLevel.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        io.sentry.config.a.a("FragmentLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        b6 b6Var = this.e;
        if (b6Var != null) {
            if (b6Var != null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
            } else {
                js3.V("options");
                throw null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        wl2 wl2VarL;
        js3.p(activity2, "activity");
        FragmentActivity fragmentActivity = activity2 instanceof FragmentActivity ? (FragmentActivity) activity2 : null;
        if (fragmentActivity == null || (wl2VarL = fragmentActivity.L()) == null) {
            return;
        }
        c4 c4Var = this.d;
        if (c4Var == null) {
            js3.V("scopes");
            throw null;
        }
        c cVar = new c(c4Var, this.b, this.c);
        hh2 hh2Var = wl2VarL.p;
        hh2Var.getClass();
        ((CopyOnWriteArrayList) hh2Var.c).add(new ll2(cVar, true));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        js3.p(activity2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        js3.p(activity2, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        js3.p(activity2, "activity");
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends FragmentLifecycleState>) FragmentLifecycleState.states, false);
        js3.p(application, "application");
        FragmentLifecycleState.Companion.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z, boolean z2) {
        js3.p(application, "application");
        FragmentLifecycleState.Companion.getClass();
        Set set = z ? FragmentLifecycleState.states : null;
        this(application, (Set<? extends FragmentLifecycleState>) (set == null ? EmptySet.a : set), z2);
    }
}
