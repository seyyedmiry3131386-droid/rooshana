package kotlinx.coroutines.internal;

import defpackage.js3;
import defpackage.q84;
import defpackage.t37;
import defpackage.ub1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(a aVar, int i) {
        while (true) {
            a aVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (aVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    aVarF = (a) obj;
                    if (!aVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(aVarF);
                }
            }
            if (aVarF instanceof q84) {
                return (((q84) aVarF).d & i) == 0 && aVarF.e(aVar, i);
            }
            atomicReferenceFieldUpdater.set(aVar, aVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(aVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(aVarF, this, aVar)) {
                if (atomicReferenceFieldUpdater2.get(aVarF) != this) {
                    break;
                }
            }
            aVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.t37) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.a f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.a.b
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.a r1 = (kotlinx.coroutines.internal.a) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.a.a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.t37
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            t37 r6 = (defpackage.t37) r6
            kotlinx.coroutines.internal.a r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.a) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.js3.n(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.a r4 = (kotlinx.coroutines.internal.a) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.a.f():kotlinx.coroutines.internal.a");
    }

    public final void g(a aVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            a aVar2 = (a) atomicReferenceFieldUpdater.get(aVar);
            if (a.get(this) != aVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, this)) {
                if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                    break;
                }
            }
            if (i()) {
                aVar.f();
                return;
            }
            return;
        }
    }

    public final a h() {
        a aVar;
        Object obj = a.get(this);
        t37 t37Var = obj instanceof t37 ? (t37) obj : null;
        if (t37Var != null && (aVar = t37Var.a) != null) {
            return aVar;
        }
        js3.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (a) obj;
    }

    public boolean i() {
        return a.get(this) instanceof t37;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this, ub1.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + ub1.v(this);
    }
}
