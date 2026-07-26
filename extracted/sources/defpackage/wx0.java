package defpackage;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx0 implements b64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wx0(st4 st4Var, hu4 hu4Var) {
        this.a = 4;
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        this.b = st4Var;
        this.c = hu4Var;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        switch (this.a) {
            case 0:
                ComponentActivity.F((ws5) this.b, (ComponentActivity) this.c, g64Var, lifecycle$Event);
                return;
            case 1:
                dm2 dm2Var = (dm2) this.b;
                ei5 ei5Var = (ei5) this.c;
                if (lifecycle$Event == Lifecycle$Event.ON_RESUME && ((List) dm2Var.b().e.a.getValue()).contains(ei5Var)) {
                    if (dm2.n()) {
                        Objects.toString(ei5Var);
                        g64Var.toString();
                    }
                    dm2Var.b().c(ei5Var);
                }
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    if (dm2.n()) {
                        Objects.toString(ei5Var);
                        g64Var.toString();
                    }
                    dm2Var.b().c(ei5Var);
                    return;
                }
                return;
            case 2:
                u54 u54Var = (u54) this.b;
                wt3 wt3Var = (wt3) this.c;
                if (g64Var.D().d == Lifecycle$State.a) {
                    wt3Var.g(null);
                    u54Var.a();
                    return;
                }
                Lifecycle$State lifecycle$State = g64Var.D().d;
                Lifecycle$State lifecycle$State2 = u54Var.b;
                pp1 pp1Var = u54Var.c;
                if (lifecycle$State.compareTo(lifecycle$State2) < 0) {
                    pp1Var.a = true;
                    return;
                } else {
                    if (pp1Var.a) {
                        if (pp1Var.b) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher");
                        }
                        pp1Var.a = false;
                        pp1Var.a();
                        return;
                    }
                    return;
                }
            case 3:
                Lifecycle$Event lifecycle$Event2 = (Lifecycle$Event) this.b;
                wb5 wb5Var = (wb5) this.c;
                if (lifecycle$Event == lifecycle$Event2) {
                    ((bp2) wb5Var.getValue()).invoke();
                    return;
                }
                return;
            default:
                st4 st4Var = (st4) this.b;
                Lifecycle$State lifecycle$State3 = Lifecycle$State.e;
                hu4 hu4Var = (hu4) this.c;
                st4Var.getClass();
                Runnable runnable = st4Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = st4Var.b;
                Lifecycle$Event.Companion.getClass();
                if (lifecycle$Event == Lifecycle$Event.ON_RESUME) {
                    copyOnWriteArrayList.add(hu4Var);
                    runnable.run();
                    return;
                } else if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    st4Var.a(hu4Var);
                    return;
                } else {
                    if (lifecycle$Event == r54.a(lifecycle$State3)) {
                        copyOnWriteArrayList.remove(hu4Var);
                        runnable.run();
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ wx0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
