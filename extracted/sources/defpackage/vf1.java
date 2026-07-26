package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle$Event;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 implements b64 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vf1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                switch (uf1.a[lifecycle$Event.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(g64Var);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(g64Var);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(g64Var);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(g64Var);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(g64Var);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(g64Var);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                b64 b64Var = (b64) obj2;
                if (b64Var != null) {
                    b64Var.g(g64Var, lifecycle$Event);
                    return;
                }
                return;
            case 1:
                yn2 yn2Var = (yn2) obj;
                xm2 xm2Var = (xm2) obj2;
                if (xm2Var.e.S()) {
                    return;
                }
                g64Var.D().f(this);
                FrameLayout frameLayout = (FrameLayout) yn2Var.a;
                WeakHashMap weakHashMap = q69.a;
                if (frameLayout.isAttachedToWindow()) {
                    xm2Var.C(yn2Var);
                    return;
                }
                return;
            case 2:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((q6) obj2);
                    g64Var.D().f(this);
                    return;
                }
                return;
            case 3:
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    ((i64) obj).f(this);
                    ((bn6) obj2).v();
                    return;
                }
                return;
            default:
                HashMap map = ((rs0) obj2).a;
                rs0.a((List) map.get(lifecycle$Event), g64Var, lifecycle$Event, obj);
                rs0.a((List) map.get(Lifecycle$Event.ON_ANY), g64Var, lifecycle$Event, obj);
                return;
        }
    }

    public vf1(DefaultLifecycleObserver defaultLifecycleObserver, b64 b64Var) {
        this.a = 0;
        js3.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.b = defaultLifecycleObserver;
        this.c = b64Var;
    }

    public vf1(f64 f64Var) {
        this.a = 4;
        this.b = f64Var;
        ts0 ts0Var = ts0.c;
        Class<?> cls = f64Var.getClass();
        rs0 rs0Var = (rs0) ts0Var.a.get(cls);
        this.c = rs0Var == null ? ts0Var.a(cls, null) : rs0Var;
    }

    public vf1(xm2 xm2Var, yn2 yn2Var) {
        this.a = 1;
        this.c = xm2Var;
        this.b = yn2Var;
    }
}
