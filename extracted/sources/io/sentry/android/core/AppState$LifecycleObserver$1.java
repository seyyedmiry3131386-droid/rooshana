package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
class AppState$LifecycleObserver$1 extends CopyOnWriteArrayList<a0> {
    public final /* synthetic */ b0 a;

    public AppState$LifecycleObserver$1(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a0 a0Var = (a0) obj;
        boolean zAdd = super.add(a0Var);
        if (Boolean.FALSE.equals(this.a.b.d)) {
            a0Var.b();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.a.b.d)) {
            a0Var.g();
        }
        return zAdd;
    }
}
