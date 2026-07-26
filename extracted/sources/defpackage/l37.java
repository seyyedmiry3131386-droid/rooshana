package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.collection.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class l37 {
    public ArrayList a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public l37() {
        zb5 zb5Var = new zb5(0, new n37[16]);
        this.d = zb5Var;
        sb5 sb5Var = de7.a;
        this.h = new sb5();
        this.e = zb5Var;
        this.f = new zb5(0, new Object[16]);
        this.g = new zb5(0, new bp2[16]);
    }

    public static final boolean g(n37 n37Var, zb5 zb5Var) {
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            m37 m37Var = ((n37) objArr[i2]).a;
            if (m37Var instanceof x36) {
                zb5 zb5Var2 = ((x36) m37Var).b;
                if (zb5Var2.k(n37Var) || g(n37Var, zb5Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(x47 x47Var) {
        x47Var.g = this;
        synchronized (((HashSet) this.c)) {
            ((HashSet) this.c).add(x47Var);
        }
        x47Var.f = Integer.valueOf(((AtomicInteger) this.b).incrementAndGet());
        x47Var.a("add-to-queue");
        i();
        if (x47Var.h) {
            ((PriorityBlockingQueue) this.d).add(x47Var);
        } else {
            ((PriorityBlockingQueue) this.e).add(x47Var);
        }
    }

    public void b() {
        this.b = null;
        this.c = null;
        zb5 zb5Var = (zb5) this.d;
        zb5Var.h();
        ((sb5) this.h).e();
        this.e = zb5Var;
        ((zb5) this.f).h();
        ((zb5) this.g).h();
        this.i = null;
        this.j = null;
        this.a = null;
    }

    public void c() {
        Set set = (Set) this.b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                m37 m37Var = (m37) it.next();
                it.remove();
                m37Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void d() {
        zb5 zb5Var = (zb5) this.d;
        zb5 zb5Var2 = (zb5) this.f;
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        this.k = null;
        if (zb5Var2.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                sb5 sb5Var = (sb5) this.i;
                int i = zb5Var2.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = zb5Var2.a[i];
                    try {
                        if (obj instanceof n37) {
                            m37 m37Var = ((n37) obj).a;
                            set.remove(m37Var);
                            m37Var.c();
                        }
                        if (obj instanceof dz0) {
                            if (sb5Var == null || !sb5Var.a(obj)) {
                                ((dz0) obj).b();
                            } else {
                                ((dz0) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        h01 h01Var = (h01) this.c;
                        if (h01Var != null) {
                            c26.P(th, new d(h01Var, obj, 17));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (zb5Var.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.b;
                if (set2 != null) {
                    Object[] objArr = zb5Var.a;
                    int i2 = zb5Var.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        n37 n37Var = (n37) objArr[i3];
                        m37 m37Var2 = n37Var.a;
                        set2.remove(m37Var2);
                        try {
                            m37Var2.e();
                        } catch (Throwable th2) {
                            h01 h01Var2 = (h01) this.c;
                            if (h01Var2 != null) {
                                c26.P(th2, new d(h01Var2, n37Var, 17));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void e() {
        zb5 zb5Var = (zb5) this.g;
        if (zb5Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = zb5Var.a;
                int i = zb5Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((bp2) objArr[i2]).invoke();
                }
                zb5Var.h();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public void f(n37 n37Var) {
        zb5 zb5Var = (zb5) this.d;
        if (!((sb5) this.h).a(n37Var)) {
            e eVar = (e) this.k;
            if (eVar == null || !eVar.a(n37Var)) {
                ((zb5) this.f).b(n37Var);
                return;
            }
            return;
        }
        ((sb5) this.h).l(n37Var);
        if (!((zb5) this.e).k(n37Var) && !zb5Var.k(n37Var)) {
            g(n37Var, zb5Var);
        }
        Set set = (Set) this.b;
        if (set == null) {
            return;
        }
        set.add(n37Var.a);
    }

    public void h(Set set, h01 h01Var) {
        b();
        this.b = set;
        this.c = h01Var;
    }

    public void i() {
        synchronized (((ArrayList) this.k)) {
            try {
                Iterator it = ((ArrayList) this.k).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        pm5[] pm5VarArr = (pm5[]) this.i;
        k();
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.d;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.e;
        nv nvVar = (nv) this.f;
        ca7 ca7Var = (ca7) this.h;
        mk0 mk0Var = new mk0(priorityBlockingQueue, priorityBlockingQueue2, nvVar, ca7Var);
        this.j = mk0Var;
        mk0Var.start();
        for (int i = 0; i < pm5VarArr.length; i++) {
            pm5 pm5Var = new pm5(priorityBlockingQueue2, (do3) this.g, nvVar, ca7Var);
            pm5VarArr[i] = pm5Var;
            pm5Var.start();
        }
    }

    public void k() {
        mk0 mk0Var = (mk0) this.j;
        if (mk0Var != null) {
            mk0Var.e = true;
            mk0Var.interrupt();
        }
        for (pm5 pm5Var : (pm5[]) this.i) {
            if (pm5Var != null) {
                pm5Var.e = true;
                pm5Var.interrupt();
            }
        }
    }

    public l37(nv nvVar, do3 do3Var) {
        ca7 ca7Var = new ca7(new Handler(Looper.getMainLooper()));
        this.b = new AtomicInteger();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.a = new ArrayList();
        this.k = new ArrayList();
        this.f = nvVar;
        this.g = do3Var;
        this.i = new pm5[4];
        this.h = ca7Var;
    }
}
