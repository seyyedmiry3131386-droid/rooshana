package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eu3 extends a implements bq1, gm3 {
    public c d;

    @Override // defpackage.bq1
    public final void a() {
        c cVarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
            Object obj = atomicReferenceFieldUpdater.get(cVarJ);
            if (obj instanceof eu3) {
                if (obj != this) {
                    return;
                }
                x02 x02Var = at2.s;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVarJ, obj, x02Var)) {
                    if (atomicReferenceFieldUpdater.get(cVarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof gm3) || ((gm3) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof t37) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                js3.n(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                a aVar = (a) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a.c;
                t37 t37Var = (t37) atomicReferenceFieldUpdater3.get(aVar);
                if (t37Var == null) {
                    t37Var = new t37(aVar);
                    atomicReferenceFieldUpdater3.set(aVar, t37Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, t37Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                aVar.f();
                return;
            }
        }
    }

    @Override // defpackage.gm3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gm3
    public final io5 d() {
        return null;
    }

    public wt3 getParent() {
        return j();
    }

    public final c j() {
        c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        js3.V("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        return getClass().getSimpleName() + '@' + ub1.v(this) + "[job@" + ub1.v(j()) + ']';
    }
}
