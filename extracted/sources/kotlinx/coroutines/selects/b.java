package kotlinx.coroutines.selects;

import defpackage.bq1;
import defpackage.br9;
import defpackage.dp2;
import defpackage.im7;
import defpackage.jm0;
import defpackage.jm7;
import defpackage.js3;
import defpackage.mu3;
import defpackage.nm0;
import defpackage.np2;
import defpackage.o40;
import defpackage.o77;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.w61;
import defpackage.wl7;
import defpackage.wu8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public class b implements jm0, jm7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state$volatile");
    public final w61 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = wu8.j;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = wu8.m;

    public b(w61 w61Var) {
        this.a = w61Var;
    }

    @Override // defpackage.gc9
    public final void a(wl7 wl7Var, int i) {
        this.c = wl7Var;
        this.d = i;
    }

    @Override // defpackage.jm7
    public final boolean b(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    @Override // defpackage.jm7
    public final void c(bq1 bq1Var) {
        this.c = bq1Var;
    }

    @Override // defpackage.jm0
    public final void d(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == wu8.k) {
                return;
            }
            mu3 mu3Var = wu8.l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mu3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((im7) it.next()).a();
            }
            this.e = wu8.m;
            this.b = null;
            return;
        }
    }

    @Override // defpackage.jm7
    public final void e(Object obj) {
        this.e = obj;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        js3.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        im7 im7Var = (im7) obj;
        Object obj2 = this.e;
        ArrayList<im7> arrayList = this.b;
        if (arrayList != null) {
            for (im7 im7Var2 : arrayList) {
                if (im7Var2 != im7Var) {
                    im7Var2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, wu8.k);
            this.e = wu8.m;
            this.b = null;
        }
        Object objA = im7Var.c.a(im7Var.a, im7Var.d, obj2);
        np2 np2Var = im7Var.e;
        return im7Var.d == wu8.n ? ((dp2) np2Var).invoke(continuationImpl) : ((qp2) np2Var).invoke(objA, continuationImpl);
    }

    public Object g(ContinuationImpl continuationImpl) {
        return f.get(this) instanceof im7 ? f(continuationImpl) : h(continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final im7 i(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((im7) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        im7 im7Var = (im7) obj2;
        if (im7Var != null) {
            return im7Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(o77 o77Var, qp2 qp2Var) {
        k(new im7(this, (kotlinx.coroutines.channels.a) o77Var.a, (rp2) o77Var.b, (rp2) o77Var.c, null, (SuspendLambda) qp2Var, (rp2) o77Var.d), false);
    }

    public final void k(im7 im7Var, boolean z) {
        Object obj = im7Var.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (atomicReferenceFieldUpdater.get(this) instanceof im7) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            js3.m(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((im7) it.next()).a == obj) {
                        throw new IllegalStateException(o40.x(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        im7Var.b.a(obj, this, im7Var.d);
        if (this.e != wu8.m) {
            atomicReferenceFieldUpdater.set(this, im7Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            js3.m(arrayList2);
            arrayList2.add(im7Var);
        }
        im7Var.g = this.c;
        im7Var.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int l(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof nm0)) {
                if (js3.i(obj3, wu8.k) || (obj3 instanceof im7)) {
                    return 3;
                }
                if (js3.i(obj3, wu8.l)) {
                    return 2;
                }
                if (js3.i(obj3, wu8.j)) {
                    List listB = br9.B(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listB)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListA0 = kotlin.collections.a.A0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListA0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            im7 im7VarI = i(obj);
            if (im7VarI != null) {
                rp2 rp2Var = im7VarI.f;
                rp2 rp2Var2 = rp2Var != null ? (rp2) rp2Var.a(this, im7VarI.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, im7VarI)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                nm0 nm0Var = (nm0) obj3;
                this.e = obj2;
                mu3 mu3VarF = nm0Var.f(tx8.a, rp2Var2);
                if (mu3VarF == null) {
                    this.e = wu8.m;
                    return 2;
                }
                nm0Var.p(mu3VarF);
                return 0;
            }
            continue;
        }
    }
}
