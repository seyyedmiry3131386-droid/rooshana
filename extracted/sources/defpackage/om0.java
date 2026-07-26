package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.a;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public class om0 extends rp1 implements nm0, f71, gc9 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(om0.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(om0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(om0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final g51 d;
    public final w61 e;

    public om0(int i, g51 g51Var) {
        super(i);
        this.d = g51Var;
        this.e = g51Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = n6.a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object F(po5 po5Var, Object obj, int i, rp2 rp2Var) {
        if (obj instanceof rx0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (rp2Var != null || (po5Var instanceof jm0)) {
            return new px0(obj, po5Var instanceof jm0 ? (jm0) po5Var : null, rp2Var, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        g51 g51Var = this.d;
        Throwable th = null;
        qp1 qp1Var = g51Var instanceof qp1 ? (qp1) g51Var : null;
        if (qp1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qp1.h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(qp1Var);
                mu3 mu3Var = dy3.b;
                if (obj == mu3Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(qp1Var, mu3Var, this)) {
                        if (atomicReferenceFieldUpdater.get(qp1Var) != mu3Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(qp1Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(qp1Var) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            r();
            n(th);
        }
    }

    public final void D(Object obj, int i, rp2 rp2Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof po5) {
                Object objF = F((po5) obj2, obj, i, rp2Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    r();
                }
                s(i);
                return;
            }
            if (obj2 instanceof rm0) {
                rm0 rm0Var = (rm0) obj2;
                if (rm0.c.compareAndSet(rm0Var, 0, 1)) {
                    if (rp2Var != null) {
                        o(rp2Var, rm0Var.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(y61 y61Var) {
        g51 g51Var = this.d;
        qp1 qp1Var = g51Var instanceof qp1 ? (qp1) g51Var : null;
        D(tx8.a, (qp1Var != null ? qp1Var.d : null) == y61Var ? 4 : this.c, null);
    }

    @Override // defpackage.gc9
    public final void a(wl7 wl7Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        y(wl7Var);
    }

    @Override // defpackage.rp1
    public final void d(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof po5) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof rx0) {
                return;
            }
            if (!(obj instanceof px0)) {
                cancellationException2 = cancellationException;
                px0 px0Var = new px0(obj, (jm0) null, (rp2) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, px0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            px0 px0Var2 = (px0) obj;
            if (px0Var2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            px0 px0VarA = px0.a(px0Var2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, px0VarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            jm0 jm0Var = px0Var2.b;
            if (jm0Var != null) {
                m(jm0Var, cancellationException);
            }
            rp2 rp2Var = px0Var2.c;
            if (rp2Var != null) {
                o(rp2Var, cancellationException, px0Var2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.nm0
    public final mu3 f(Object obj, rp2 rp2Var) {
        mu3 mu3Var = wu8.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof po5)) {
                return null;
            }
            Object objF = F((po5) obj2, obj, this.c, rp2Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!z()) {
                r();
            }
            return mu3Var;
        }
    }

    @Override // defpackage.rp1
    public final g51 g() {
        return this.d;
    }

    @Override // defpackage.f71
    public final f71 getCallerFrame() {
        g51 g51Var = this.d;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.e;
    }

    @Override // defpackage.rp1
    public final Throwable h(Object obj) {
        Throwable thH = super.h(obj);
        if (thH != null) {
            return thH;
        }
        return null;
    }

    @Override // defpackage.rp1
    public final Object i(Object obj) {
        return obj instanceof px0 ? ((px0) obj).a : obj;
    }

    @Override // defpackage.nm0
    public final void j(Object obj, rp2 rp2Var) {
        D(obj, this.c, rp2Var);
    }

    @Override // defpackage.rp1
    public final Object l() {
        return g.get(this);
    }

    public final void m(jm0 jm0Var, Throwable th) {
        try {
            jm0Var.d(th);
        } catch (Throwable th2) {
            is3.w(this.e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.nm0
    public final boolean n(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof po5)) {
                return false;
            }
            boolean z = (obj instanceof jm0) || (obj instanceof wl7);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            rm0 rm0Var = new rm0(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rm0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            po5 po5Var = (po5) obj;
            if (po5Var instanceof jm0) {
                m((jm0) obj, th);
            } else if (po5Var instanceof wl7) {
                q((wl7) obj, th);
            }
            if (!z()) {
                r();
            }
            s(this.c);
            return true;
        }
    }

    public final void o(rp2 rp2Var, Throwable th, Object obj) {
        w61 w61Var = this.e;
        try {
            rp2Var.a(th, obj, w61Var);
        } catch (Throwable th2) {
            is3.w(w61Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.nm0
    public final void p(Object obj) {
        s(this.c);
    }

    public final void q(wl7 wl7Var, Throwable th) {
        w61 w61Var = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            wl7Var.h(i, w61Var);
        } catch (Throwable th2) {
            is3.w(w61Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        bq1 bq1Var = (bq1) atomicReferenceFieldUpdater.get(this);
        if (bq1Var == null) {
            return;
        }
        bq1Var.a();
        atomicReferenceFieldUpdater.set(this, lo5.a);
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new rx0(thA, false);
        }
        D(obj, this.c, null);
    }

    public final void s(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                g51 g51Var = this.d;
                if (!z && (g51Var instanceof qp1)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        qp1 qp1Var = (qp1) g51Var;
                        y61 y61Var = qp1Var.d;
                        w61 context = qp1Var.e.getContext();
                        if (dy3.M(y61Var, context)) {
                            dy3.L(y61Var, context, this);
                            return;
                        }
                        g42 g42VarA = tk8.a();
                        if (g42VarA.c >= 4294967296L) {
                            g42VarA.L0(this);
                            return;
                        }
                        g42VarA.R0(true);
                        try {
                            dt2.z(this, g51Var, true);
                            do {
                            } while (g42VarA.Y0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                dt2.z(this, g51Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable t(c cVar) {
        return cVar.I();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(ub1.P(this.d));
        sb.append("){");
        Object obj = g.get(this);
        sb.append(obj instanceof po5 ? "Active" : obj instanceof rm0 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(ub1.v(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        wt3 wt3Var;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (z) {
                    C();
                }
                Object obj = g.get(this);
                if (obj instanceof rx0) {
                    throw ((rx0) obj).a;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (wt3Var = (wt3) this.e.r0(th0.n)) == null || wt3Var.b()) {
                    return i(obj);
                }
                CancellationException cancellationExceptionI = wt3Var.I();
                d(cancellationExceptionI);
                throw cancellationExceptionI;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((bq1) h.get(this)) == null) {
            w();
        }
        if (z) {
            C();
        }
        return CoroutineSingletons.a;
    }

    public final void v() {
        bq1 bq1VarW = w();
        if (bq1VarW == null || (g.get(this) instanceof po5)) {
            return;
        }
        bq1VarW.a();
        h.set(this, lo5.a);
    }

    public final bq1 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        wt3 wt3Var = (wt3) this.e.r0(th0.n);
        if (wt3Var == null) {
            return null;
        }
        bq1 bq1VarI = a.i(wt3Var, true, new kq0(this, 0));
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bq1VarI)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return bq1VarI;
    }

    public final void x(dp2 dp2Var) {
        y(new im0(1, dp2Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(defpackage.po5 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.om0.g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.n6
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La5
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.jm0
            r3 = 0
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof defpackage.wl7
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof defpackage.rx0
            if (r1 == 0) goto L52
            r0 = r2
            rx0 r0 = (defpackage.rx0) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.rx0.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof defpackage.rm0
            if (r1 == 0) goto La5
            java.lang.Throwable r0 = r0.a
            boolean r1 = r8 instanceof defpackage.jm0
            if (r1 == 0) goto L43
            jm0 r8 = (defpackage.jm0) r8
            r7.m(r8, r0)
            return
        L43:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            defpackage.js3.n(r8, r1)
            wl7 r8 = (defpackage.wl7) r8
            r7.q(r8, r0)
            return
        L4e:
            A(r8, r2)
            throw r3
        L52:
            boolean r1 = r2 instanceof defpackage.px0
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L8b
            r1 = r2
            px0 r1 = (defpackage.px0) r1
            jm0 r5 = r1.b
            if (r5 != 0) goto L87
            boolean r5 = r8 instanceof defpackage.wl7
            if (r5 == 0) goto L64
            return
        L64:
            defpackage.js3.n(r8, r4)
            r4 = r8
            jm0 r4 = (defpackage.jm0) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L72
            r7.m(r4, r5)
            return
        L72:
            r5 = 29
            px0 r1 = defpackage.px0.a(r1, r4, r3, r5)
        L78:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7f
            goto La5
        L7f:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L78
            goto L0
        L87:
            A(r8, r2)
            throw r3
        L8b:
            boolean r1 = r8 instanceof defpackage.wl7
            if (r1 == 0) goto L90
            return
        L90:
            defpackage.js3.n(r8, r4)
            r3 = r8
            jm0 r3 = (defpackage.jm0) r3
            px0 r1 = new px0
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9f:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La6
        La5:
            return
        La6:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9f
            goto L0
        Lae:
            A(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.y(po5):void");
    }

    public final boolean z() {
        if (this.c != 2) {
            return false;
        }
        g51 g51Var = this.d;
        js3.n(g51Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return qp1.h.get((qp1) g51Var) != null;
    }
}
