package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import coil3.util.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class j64 implements h57, DefaultLifecycleObserver {
    public final i64 a;
    public final wt3 b;

    public j64(i64 i64Var, wt3 wt3Var) {
        this.a = i64Var;
        this.b = wt3Var;
    }

    @Override // defpackage.h57
    public final void a() {
        this.a.f(this);
    }

    @Override // defpackage.h57
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.h57
    public final Object c(g51 g51Var) throws Throwable {
        Object objA = a.a(this.a, (ContinuationImpl) g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(g64 g64Var) {
        tf1.a(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(g64 g64Var) {
        this.b.g(null);
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
    public final /* synthetic */ void onStart(g64 g64Var) {
        tf1.e(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(g64 g64Var) {
        tf1.f(this, g64Var);
    }

    @Override // defpackage.h57
    public final void start() {
        this.a.a(this);
    }
}
