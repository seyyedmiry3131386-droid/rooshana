package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a11 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a11.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(a11.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public a11(wl7 wl7Var) {
        this._prev$volatile = wl7Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final a11 b() {
        Object obj = a.get(this);
        if (obj == at2.l) {
            return null;
        }
        return (a11) obj;
    }

    public abstract boolean c();

    public final void e() {
        a11 a11VarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            a11 a11Var = (a11) atomicReferenceFieldUpdater.get(this);
            while (a11Var != null && a11Var.c()) {
                a11Var = (a11) atomicReferenceFieldUpdater.get(a11Var);
            }
            a11 a11VarB2 = b();
            js3.m(a11VarB2);
            while (a11VarB2.c() && (a11VarB = a11VarB2.b()) != null) {
                a11VarB2 = a11VarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(a11VarB2);
                a11 a11Var2 = ((a11) obj) == null ? null : a11Var;
                while (!atomicReferenceFieldUpdater.compareAndSet(a11VarB2, obj, a11Var2)) {
                    if (atomicReferenceFieldUpdater.get(a11VarB2) != obj) {
                        break;
                    }
                }
            }
            if (a11Var != null) {
                a.set(a11Var, a11VarB2);
            }
            if (!a11VarB2.c() || a11VarB2.b() == null) {
                if (a11Var == null || !a11Var.c()) {
                    return;
                }
            }
        }
    }
}
