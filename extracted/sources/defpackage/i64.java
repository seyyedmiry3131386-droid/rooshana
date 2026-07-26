package defpackage;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class i64 {
    public final boolean b;
    public Lifecycle$State d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final l j;
    public ql4 a = new ql4(7);
    public x82 c = new x82();

    public i64(g64 g64Var, boolean z) {
        this.b = z;
        Lifecycle$State lifecycle$State = Lifecycle$State.b;
        this.d = lifecycle$State;
        this.i = new ArrayList();
        this.e = new WeakReference(g64Var);
        this.j = ja1.b(lifecycle$State);
    }

    public final void a(f64 f64Var) {
        b64 vf1Var;
        Object obj;
        g64 g64Var;
        js3.p(f64Var, "observer");
        c("addObserver");
        Lifecycle$State lifecycle$State = this.d;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.a;
        if (lifecycle$State != lifecycle$State2) {
            lifecycle$State2 = Lifecycle$State.b;
        }
        h64 h64Var = new h64();
        HashMap map = q64.a;
        boolean z = f64Var instanceof b64;
        boolean z2 = f64Var instanceof DefaultLifecycleObserver;
        int i = 2;
        if (z && z2) {
            vf1Var = new vf1((DefaultLifecycleObserver) f64Var, (b64) f64Var);
        } else if (z2) {
            vf1Var = new vf1((DefaultLifecycleObserver) f64Var, (b64) null);
        } else if (z) {
            vf1Var = (b64) f64Var;
        } else {
            Class<?> cls = f64Var.getClass();
            if (q64.b(cls) == 2) {
                Object obj2 = q64.b.get(cls);
                js3.m(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    q64.a((Constructor) list.get(0), f64Var);
                    throw null;
                }
                int size = list.size();
                zq2[] zq2VarArr = new zq2[size];
                if (size > 0) {
                    q64.a((Constructor) list.get(0), f64Var);
                    throw null;
                }
                vf1Var = new ry6(i, zq2VarArr);
            } else {
                vf1Var = new vf1(f64Var);
            }
        }
        h64Var.b = vf1Var;
        h64Var.a = lifecycle$State2;
        x82 x82Var = this.c;
        xb7 xb7VarA = x82Var.a(f64Var);
        if (xb7VarA != null) {
            obj = xb7VarA.b;
        } else {
            HashMap map2 = x82Var.e;
            xb7 xb7Var = new xb7(f64Var, h64Var);
            x82Var.d++;
            xb7 xb7Var2 = x82Var.b;
            if (xb7Var2 == null) {
                x82Var.a = xb7Var;
                x82Var.b = xb7Var;
            } else {
                xb7Var2.c = xb7Var;
                xb7Var.d = xb7Var2;
                x82Var.b = xb7Var;
            }
            map2.put(f64Var, xb7Var);
            obj = null;
        }
        if (((h64) obj) == null && (g64Var = (g64) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            Lifecycle$State lifecycle$StateB = b(f64Var);
            this.f++;
            while (h64Var.a.compareTo(lifecycle$StateB) < 0 && this.c.e.containsKey(f64Var)) {
                Lifecycle$State lifecycle$State3 = h64Var.a;
                ArrayList arrayList = this.i;
                arrayList.add(lifecycle$State3);
                r54 r54Var = Lifecycle$Event.Companion;
                Lifecycle$State lifecycle$State4 = h64Var.a;
                r54Var.getClass();
                js3.p(lifecycle$State4, "state");
                int iOrdinal = lifecycle$State4.ordinal();
                Lifecycle$Event lifecycle$Event = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : Lifecycle$Event.ON_RESUME : Lifecycle$Event.ON_START : Lifecycle$Event.ON_CREATE;
                if (lifecycle$Event == null) {
                    throw new IllegalStateException("no event up from " + h64Var.a);
                }
                h64Var.a(g64Var, lifecycle$Event);
                arrayList.remove(arrayList.size() - 1);
                lifecycle$StateB = b(f64Var);
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    public final Lifecycle$State b(f64 f64Var) {
        HashMap map = this.c.e;
        xb7 xb7Var = map.containsKey(f64Var) ? ((xb7) map.get(f64Var)).d : null;
        Lifecycle$State lifecycle$State = xb7Var != null ? ((h64) xb7Var.b).a : null;
        ArrayList arrayList = this.i;
        Lifecycle$State lifecycle$State2 = arrayList.isEmpty() ? null : (Lifecycle$State) o40.u(1, arrayList);
        Lifecycle$State lifecycle$State3 = this.d;
        js3.p(lifecycle$State3, "state1");
        if (lifecycle$State == null || lifecycle$State.compareTo(lifecycle$State3) >= 0) {
            lifecycle$State = lifecycle$State3;
        }
        return (lifecycle$State2 == null || lifecycle$State2.compareTo(lifecycle$State) >= 0) ? lifecycle$State : lifecycle$State2;
    }

    public final void c(String str) {
        if (this.b) {
            yu.h().c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(o40.y("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(Lifecycle$Event lifecycle$Event) {
        js3.p(lifecycle$Event, "event");
        c("handleLifecycleEvent");
        e(lifecycle$Event.a());
    }

    public final void e(Lifecycle$State lifecycle$State) {
        if (this.d == lifecycle$State) {
            return;
        }
        g64 g64Var = (g64) this.e.get();
        Lifecycle$State lifecycle$State2 = this.d;
        js3.p(lifecycle$State2, "current");
        js3.p(lifecycle$State, "next");
        if (lifecycle$State2 == Lifecycle$State.b && lifecycle$State == Lifecycle$State.a) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle$State.c + "' to be moved to '" + lifecycle$State + "' in component " + g64Var).toString());
        }
        Lifecycle$State lifecycle$State3 = Lifecycle$State.a;
        if (lifecycle$State2 == lifecycle$State3 && lifecycle$State2 != lifecycle$State) {
            throw new IllegalStateException(("State is '" + lifecycle$State3 + "' and cannot be moved to `" + lifecycle$State + "` in component " + g64Var).toString());
        }
        this.d = lifecycle$State;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == lifecycle$State3) {
            this.c = new x82();
        }
    }

    public final void f(f64 f64Var) {
        js3.p(f64Var, "observer");
        c("removeObserver");
        this.c.c(f64Var);
    }

    public final void g(Lifecycle$State lifecycle$State) {
        js3.p(lifecycle$State, "state");
        c("setCurrentState");
        e(lifecycle$State);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.h = false;
        r8.j.o(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.h():void");
    }
}
