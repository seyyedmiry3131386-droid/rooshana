package kotlinx.coroutines.sync;

import defpackage.dc5;
import defpackage.mu3;
import defpackage.tv8;
import defpackage.ub1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements dc5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public a() {
        super(1);
        this.owner$volatile = tv8.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.b;
        kotlinx.coroutines.sync.a.h.set(r2, null);
        r3 = r0.a;
        r3.D(r1, r3.c, new defpackage.va(2, new defpackage.z45(r2, r0)));
     */
    @Override // defpackage.dc5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.g51 r7) {
        /*
            r6 = this;
            boolean r0 = r6.g()
            tx8 r1 = defpackage.tx8.a
            if (r0 == 0) goto L9
            goto L50
        L9:
            g51 r7 = defpackage.ok4.I(r7)
            om0 r7 = defpackage.s7.z(r7)
            ec5 r0 = new ec5     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.b.g     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.a     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            kotlinx.coroutines.sync.a r2 = r0.b     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.sync.a.h     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L51
            om0 r3 = r0.a     // Catch: java.lang.Throwable -> L51
            z45 r4 = new z45     // Catch: java.lang.Throwable -> L51
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r3.c     // Catch: java.lang.Throwable -> L51
            va r2 = new va     // Catch: java.lang.Throwable -> L51
            r5 = 2
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L51
            r3.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r7 = r7.u()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r7 != r0) goto L4c
            goto L4d
        L4c:
            r7 = r1
        L4d:
            if (r7 != r0) goto L50
            return r7
        L50:
            return r1
        L51:
            r0 = move-exception
            r7.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.a.b(g51):java.lang.Object");
    }

    @Override // defpackage.dc5
    public final void d(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            mu3 mu3Var = tv8.d;
            if (obj2 != mu3Var) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mu3Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    e();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean f() {
        return Math.max(b.g.get(this), 0) == 0;
    }

    public final boolean g() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + ub1.v(this) + "[isLocked=" + f() + ",owner=" + h.get(this) + ']';
    }
}
