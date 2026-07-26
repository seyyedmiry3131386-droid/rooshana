package io.sentry.android.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import defpackage.f09;
import defpackage.js3;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.c1;
import io.sentry.c4;
import io.sentry.f;
import io.sentry.h0;
import io.sentry.k1;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FragmentManager$FragmentLifecycleCallbacks {
    public final c1 a;
    public final Set b;
    public final boolean c;
    public final WeakHashMap d;

    public c(c4 c4Var, Set set, boolean z) {
        js3.p(c4Var, "scopes");
        js3.p(set, "filterFragmentLifecycleBreadcrumbs");
        this.a = c4Var;
        this.b = set;
        this.c = z;
        this.d = new WeakHashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void a(g gVar, d dVar, FragmentActivity fragmentActivity) {
        js3.p(dVar, "fragment");
        js3.p(fragmentActivity, "context");
        l(dVar, FragmentLifecycleState.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void b(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.CREATED);
        if (dVar.Q()) {
            c1 c1Var = this.a;
            if (c1Var.m().isEnableScreenTracking()) {
                c1Var.x(new f09(this, dVar, 18));
            }
            if (c1Var.m().isTracingEnabled() && this.c) {
                WeakHashMap weakHashMap = this.d;
                if (weakHashMap.containsKey(dVar)) {
                    return;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c1Var.x(new b(ref$ObjectRef, 0));
                String canonicalName = dVar.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = dVar.getClass().getSimpleName();
                }
                k1 k1Var = (k1) ref$ObjectRef.a;
                k1 k1VarA = k1Var != null ? k1Var.A("ui.load", canonicalName) : null;
                if (k1VarA != null) {
                    weakHashMap.put(dVar, k1VarA);
                    k1VarA.x().i = "auto.ui.fragment";
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void c(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.DESTROYED);
        m(dVar);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void d(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void e(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void f(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void g(g gVar, d dVar, Bundle bundle) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void h(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.STARTED);
        m(dVar);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void i(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void j(g gVar, d dVar, View view) {
        js3.p(dVar, "fragment");
        js3.p(view, "view");
        l(dVar, FragmentLifecycleState.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void k(g gVar, d dVar) {
        js3.p(dVar, "fragment");
        l(dVar, FragmentLifecycleState.VIEW_DESTROYED);
    }

    public final void l(d dVar, FragmentLifecycleState fragmentLifecycleState) {
        if (this.b.contains(fragmentLifecycleState)) {
            f fVar = new f();
            fVar.e = "navigation";
            fVar.c(fragmentLifecycleState.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = dVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = dVar.getClass().getSimpleName();
            }
            fVar.c(canonicalName, "screen");
            fVar.g = "ui.fragment.lifecycle";
            fVar.i = SentryLevel.INFO;
            h0 h0Var = new h0();
            h0Var.d(dVar, "android:fragment");
            this.a.h(fVar, h0Var);
        }
    }

    public final void m(d dVar) {
        k1 k1Var;
        if (this.a.m().isTracingEnabled() && this.c) {
            WeakHashMap weakHashMap = this.d;
            if (weakHashMap.containsKey(dVar) && (k1Var = (k1) weakHashMap.get(dVar)) != null) {
                SpanStatus spanStatusD = k1Var.d();
                if (spanStatusD == null) {
                    spanStatusD = SpanStatus.OK;
                }
                k1Var.k(spanStatusD);
            }
        }
    }
}
