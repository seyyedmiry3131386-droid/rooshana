package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class x70 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final pg c = new pg(new CopyOnWriteArrayList(), 0, (ks4) null);
    public final sw1 d = new sw1(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public bm8 f;
    public ee6 g;

    public boolean a(jp4 jp4Var) {
        return false;
    }

    public abstract zp4 b(ks4 ks4Var, qc1 qc1Var, long j);

    public final void c(ls4 ls4Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ls4Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(ls4 ls4Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ls4Var);
        if (zIsEmpty) {
            f();
        }
    }

    public bm8 g() {
        return null;
    }

    public abstract jp4 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(ls4 ls4Var, fq8 fq8Var, ee6 ee6Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        vy2.j(looper == null || looper == looperMyLooper);
        this.g = ee6Var;
        bm8 bm8Var = this.f;
        this.a.add(ls4Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(ls4Var);
            l(fq8Var);
        } else if (bm8Var != null) {
            e(ls4Var);
            ls4Var.a(this, bm8Var);
        }
    }

    public abstract void l(fq8 fq8Var);

    public final void m(bm8 bm8Var) {
        this.f = bm8Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ls4) it.next()).a(this, bm8Var);
        }
    }

    public abstract void n(zp4 zp4Var);

    public final void o(ls4 ls4Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(ls4Var);
        if (!arrayList.isEmpty()) {
            c(ls4Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(tw1 tw1Var) {
        CopyOnWriteArrayList<rw1> copyOnWriteArrayList = this.d.c;
        for (rw1 rw1Var : copyOnWriteArrayList) {
            if (rw1Var.b == tw1Var) {
                copyOnWriteArrayList.remove(rw1Var);
            }
        }
    }

    public final void r(ps4 ps4Var) {
        CopyOnWriteArrayList<os4> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        for (os4 os4Var : copyOnWriteArrayList) {
            if (os4Var.b == ps4Var) {
                copyOnWriteArrayList.remove(os4Var);
            }
        }
    }

    public void s(jp4 jp4Var) {
    }

    public void d() {
    }

    public void f() {
    }
}
