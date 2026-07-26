package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d64 implements t54, f64 {
    public final HashSet a = new HashSet();
    public final i64 b;

    public d64(i64 i64Var) {
        this.b = i64Var;
        i64Var.a(this);
    }

    @Override // defpackage.t54
    public final void b(e64 e64Var) {
        this.a.remove(e64Var);
    }

    @Override // defpackage.t54
    public final void c(e64 e64Var) {
        this.a.add(e64Var);
        Lifecycle$State lifecycle$State = this.b.d;
        if (lifecycle$State == Lifecycle$State.a) {
            e64Var.e();
        } else if (lifecycle$State.compareTo(Lifecycle$State.d) >= 0) {
            e64Var.k();
        } else {
            e64Var.b();
        }
    }

    @jt5(Lifecycle$Event.ON_DESTROY)
    public void onDestroy(g64 g64Var) {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((e64) it.next()).e();
        }
        g64Var.D().f(this);
    }

    @jt5(Lifecycle$Event.ON_START)
    public void onStart(g64 g64Var) {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((e64) it.next()).k();
        }
    }

    @jt5(Lifecycle$Event.ON_STOP)
    public void onStop(g64 g64Var) {
        Iterator it = i29.e(this.a).iterator();
        while (it.hasNext()) {
            ((e64) it.next()).b();
        }
    }
}
