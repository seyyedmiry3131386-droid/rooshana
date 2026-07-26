package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.g64;
import defpackage.tf1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements DefaultLifecycleObserver {
    public final List a = new AppState$LifecycleObserver$1(this);
    public final /* synthetic */ c0 b;

    public b0(c0 c0Var) {
        this.b = c0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(g64 g64Var) {
        tf1.a(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(g64 g64Var) {
        tf1.b(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(g64 g64Var) {
        tf1.c(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(g64 g64Var) {
        tf1.d(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(g64 g64Var) {
        this.b.d = Boolean.FALSE;
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(g64 g64Var) {
        this.b.d = Boolean.TRUE;
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).g();
        }
    }
}
