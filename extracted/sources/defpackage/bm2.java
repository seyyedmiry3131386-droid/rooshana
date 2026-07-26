package defpackage;

import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$Event;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm2 implements b64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bm2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        switch (this.a) {
            case 0:
                dm2 dm2Var = (dm2) this.b;
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    d dVar = (d) g64Var;
                    Object obj = null;
                    for (Object obj2 : (Iterable) dm2Var.b().f.a.getValue()) {
                        if (js3.i(((ei5) obj2).f, dVar.B)) {
                            obj = obj2;
                        }
                    }
                    ei5 ei5Var = (ei5) obj;
                    if (ei5Var != null) {
                        if (dm2.n()) {
                            ei5Var.toString();
                            g64Var.toString();
                        }
                        dm2Var.b().c(ei5Var);
                    }
                }
                break;
            case 1:
                ni5 ni5Var = (ni5) this.b;
                ni5Var.p = lifecycle$Event.a();
                if (ni5Var.c != null) {
                    for (ei5 ei5Var2 : a.Q0(ni5Var.f)) {
                        ei5Var2.getClass();
                        gi5 gi5Var = ei5Var2.h;
                        gi5Var.getClass();
                        gi5Var.a.d = lifecycle$Event.a();
                        gi5Var.d = lifecycle$Event.a();
                        gi5Var.b();
                    }
                }
                break;
            case 2:
                bz0 bz0Var = (bz0) this.b;
                bz0Var.getClass();
                bz0Var.b = lifecycle$Event.a();
                bz0Var.a();
                break;
            default:
                bp4 bp4Var = (bp4) this.b;
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    bp4Var.c = true;
                } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                    bp4Var.c = false;
                }
                break;
        }
    }
}
