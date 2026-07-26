package kotlinx.coroutines;

import defpackage.at2;
import defpackage.bq1;
import defpackage.bt2;
import defpackage.dd0;
import defpackage.dp2;
import defpackage.dq1;
import defpackage.dw;
import defpackage.e26;
import defpackage.eu3;
import defpackage.fl3;
import defpackage.fu3;
import defpackage.gm3;
import defpackage.gu3;
import defpackage.hm3;
import defpackage.hu3;
import defpackage.hx0;
import defpackage.im0;
import defpackage.io5;
import defpackage.js3;
import defpackage.kq0;
import defpackage.lo5;
import defpackage.lq0;
import defpackage.mq0;
import defpackage.ok4;
import defpackage.om0;
import defpackage.q84;
import defpackage.qp2;
import defpackage.rx0;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.ub1;
import defpackage.v61;
import defpackage.w61;
import defpackage.wt3;
import defpackage.wu8;
import defpackage.x02;
import defpackage.ys3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public class c implements wt3, e26 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public c(boolean z) {
        this._state$volatile = z ? at2.s : at2.r;
    }

    public static mq0 Y(kotlinx.coroutines.internal.a aVar) {
        while (aVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.a.b;
            kotlinx.coroutines.internal.a aVarF = aVar.f();
            if (aVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(aVar);
                while (true) {
                    aVar = (kotlinx.coroutines.internal.a) obj;
                    if (!aVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(aVar);
                }
            } else {
                aVar = aVarF;
            }
        }
        while (true) {
            aVar = aVar.h();
            if (!aVar.i()) {
                if (aVar instanceof mq0) {
                    return (mq0) aVar;
                }
                if (aVar instanceof io5) {
                    return null;
                }
            }
        }
    }

    public static String f0(Object obj) {
        if (!(obj instanceof hu3)) {
            return obj instanceof gm3 ? ((gm3) obj).b() ? "Active" : "New" : obj instanceof rx0 ? "Cancelled" : "Completed";
        }
        hu3 hu3Var = (hu3) obj;
        return hu3Var.e() ? "Cancelling" : hu3.b.get(hu3Var) == 1 ? "Completing" : "Active";
    }

    public final void A(gm3 gm3Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        lq0 lq0Var = (lq0) atomicReferenceFieldUpdater.get(this);
        if (lq0Var != null) {
            lq0Var.a();
            atomicReferenceFieldUpdater.set(this, lo5.a);
        }
        CompletionHandlerException completionHandlerException = null;
        rx0 rx0Var = obj instanceof rx0 ? (rx0) obj : null;
        Throwable th = rx0Var != null ? rx0Var.a : null;
        if (gm3Var instanceof eu3) {
            try {
                ((eu3) gm3Var).l(th);
                return;
            } catch (Throwable th2) {
                O(new CompletionHandlerException("Exception in completion handler " + gm3Var + " for " + this, th2));
                return;
            }
        }
        io5 io5VarD = gm3Var.d();
        if (io5VarD != null) {
            io5VarD.e(new q84(1), 1);
            Object obj2 = kotlinx.coroutines.internal.a.a.get(io5VarD);
            js3.n(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (kotlinx.coroutines.internal.a aVarH = (kotlinx.coroutines.internal.a) obj2; !aVarH.equals(io5VarD); aVarH = aVarH.h()) {
                if (aVarH instanceof eu3) {
                    try {
                        ((eu3) aVarH).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            wu8.f(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + aVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                O(completionHandlerException);
            }
        }
    }

    public final Throwable B(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        c cVar = (c) ((e26) obj);
        Object obj2 = a.get(cVar);
        if (obj2 instanceof hu3) {
            thC = ((hu3) obj2).c();
        } else if (obj2 instanceof rx0) {
            thC = ((rx0) obj2).a;
        } else {
            if (obj2 instanceof gm3) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(f0(obj2)), thC, cVar) : cancellationException;
    }

    public final Object C(hu3 hu3Var, Object obj) {
        Throwable thG;
        rx0 rx0Var = obj instanceof rx0 ? (rx0) obj : null;
        Throwable th = rx0Var != null ? rx0Var.a : null;
        synchronized (hu3Var) {
            hu3Var.e();
            ArrayList<Throwable> arrayListF = hu3Var.f(th);
            thG = G(hu3Var, arrayListF);
            if (thG != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thG && th2 != thG && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        wu8.f(thG, th2);
                    }
                }
            }
        }
        if (thG != null && thG != th) {
            obj = new rx0(thG, false);
        }
        if (thG != null && (w(thG) || N(thG))) {
            js3.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            rx0.b.compareAndSet((rx0) obj, 0, 1);
        }
        a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object hm3Var = obj instanceof gm3 ? new hm3((gm3) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, hu3Var, hm3Var) && atomicReferenceFieldUpdater.get(this) == hu3Var) {
        }
        A(hu3Var, obj);
        return obj;
    }

    @Override // defpackage.wt3
    public final Object D(ContinuationImpl continuationImpl) {
        Object obj;
        tx8 tx8Var;
        do {
            obj = a.get(this);
            boolean z = obj instanceof gm3;
            tx8Var = tx8.a;
            if (!z) {
                a.f(continuationImpl.getContext());
                return tx8Var;
            }
        } while (e0(obj) < 0);
        om0 om0Var = new om0(1, ok4.I(continuationImpl));
        om0Var.v();
        om0Var.y(new im0(2, a.i(this, true, new kq0(om0Var, 1))));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (objU != coroutineSingletons) {
            objU = tx8Var;
        }
        return objU == coroutineSingletons ? objU : tx8Var;
    }

    public final dw E() {
        return new dw(new JobSupport$children$1(null, this));
    }

    public final Object F() throws Throwable {
        Object obj = a.get(this);
        if (obj instanceof gm3) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof rx0) {
            throw ((rx0) obj).a;
        }
        return at2.n0(obj);
    }

    public final Throwable G(hu3 hu3Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (hu3Var.e()) {
                return new JobCancellationException(x(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean H() {
        return true;
    }

    @Override // defpackage.wt3
    public final CancellationException I() {
        CancellationException cancellationException;
        Object obj = a.get(this);
        if (!(obj instanceof hu3)) {
            if (obj instanceof gm3) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof rx0)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((rx0) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(x(), th, this) : cancellationException;
        }
        Throwable thC = ((hu3) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = x();
        }
        return new JobCancellationException(strConcat, thC, this);
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.wt3
    public final lq0 K(c cVar) {
        mq0 mq0Var = new mq0(cVar);
        mq0Var.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof x02) {
                x02 x02Var = (x02) obj;
                if (x02Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mq0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(x02Var);
            } else {
                boolean z = obj instanceof gm3;
                lo5 lo5Var = lo5.a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    rx0 rx0Var = obj2 instanceof rx0 ? (rx0) obj2 : null;
                    mq0Var.l(rx0Var != null ? rx0Var.a : null);
                    return lo5Var;
                }
                io5 io5VarD = ((gm3) obj).d();
                if (io5VarD == null) {
                    d0((eu3) obj);
                } else if (!io5VarD.e(mq0Var, 7)) {
                    boolean zE = io5VarD.e(mq0Var, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof hu3) {
                        thC = ((hu3) obj3).c();
                    } else {
                        rx0 rx0Var2 = obj3 instanceof rx0 ? (rx0) obj3 : null;
                        if (rx0Var2 != null) {
                            thC = rx0Var2.a;
                        }
                    }
                    mq0Var.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return lo5Var;
                }
            }
        }
        return mq0Var;
    }

    public boolean L() {
        return this instanceof hx0;
    }

    public final io5 M(gm3 gm3Var) {
        io5 io5VarD = gm3Var.d();
        if (io5VarD != null) {
            return io5VarD;
        }
        if (gm3Var instanceof x02) {
            return new io5();
        }
        if (gm3Var instanceof eu3) {
            d0((eu3) gm3Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + gm3Var).toString());
    }

    public boolean N(Throwable th) {
        return false;
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    public final void Q(wt3 wt3Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        lo5 lo5Var = lo5.a;
        if (wt3Var == null) {
            atomicReferenceFieldUpdater.set(this, lo5Var);
            return;
        }
        wt3Var.start();
        lq0 lq0VarK = wt3Var.K(this);
        atomicReferenceFieldUpdater.set(this, lq0VarK);
        if (T()) {
            lq0VarK.a();
            atomicReferenceFieldUpdater.set(this, lo5Var);
        }
    }

    public final bq1 S(boolean z, eu3 eu3Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        lo5 lo5Var;
        boolean z2;
        boolean zE;
        eu3Var.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof x02;
            lo5Var = lo5.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof gm3)) {
                    z2 = false;
                    break;
                }
                gm3 gm3Var = (gm3) obj;
                io5 io5VarD = gm3Var.d();
                if (io5VarD == null) {
                    d0((eu3) obj);
                } else {
                    if (eu3Var.k()) {
                        hu3 hu3Var = gm3Var instanceof hu3 ? (hu3) gm3Var : null;
                        Throwable thC = hu3Var != null ? hu3Var.c() : null;
                        if (thC == null) {
                            zE = io5VarD.e(eu3Var, 5);
                        } else if (z) {
                            eu3Var.l(thC);
                            return lo5Var;
                        }
                    } else {
                        zE = io5VarD.e(eu3Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                x02 x02Var = (x02) obj;
                if (x02Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, eu3Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(x02Var);
            }
        }
        if (z2) {
            return eu3Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            rx0 rx0Var = obj2 instanceof rx0 ? (rx0) obj2 : null;
            eu3Var.l(rx0Var != null ? rx0Var.a : null);
        }
        return lo5Var;
    }

    public final boolean T() {
        return !(a.get(this) instanceof gm3);
    }

    public boolean U() {
        return this instanceof dd0;
    }

    public final boolean V(Object obj) {
        Object objG0;
        do {
            objG0 = g0(a.get(this), obj);
            if (objG0 == at2.m) {
                return false;
            }
            if (objG0 == at2.n) {
                return true;
            }
        } while (objG0 == at2.o);
        q(objG0);
        return true;
    }

    public final Object W(Object obj) {
        Object objG0;
        do {
            objG0 = g0(a.get(this), obj);
            if (objG0 == at2.m) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                rx0 rx0Var = obj instanceof rx0 ? (rx0) obj : null;
                throw new IllegalStateException(str, rx0Var != null ? rx0Var.a : null);
            }
        } while (objG0 == at2.o);
        return objG0;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    public final void Z(io5 io5Var, Throwable th) {
        io5Var.e(new q84(4), 4);
        Object obj = kotlinx.coroutines.internal.a.a.get(io5Var);
        js3.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.a aVarH = (kotlinx.coroutines.internal.a) obj; !aVarH.equals(io5Var); aVarH = aVarH.h()) {
            if ((aVarH instanceof eu3) && ((eu3) aVarH).k()) {
                try {
                    ((eu3) aVarH).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        wu8.f(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + aVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            O(completionHandlerException);
        }
        w(th);
    }

    public void a0(Object obj) {
    }

    @Override // defpackage.wt3
    public boolean b() {
        Object obj = a.get(this);
        return (obj instanceof gm3) && ((gm3) obj).b();
    }

    public void b0() {
    }

    public final void c0(x02 x02Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io5 io5Var = new io5();
        Object fl3Var = io5Var;
        if (!x02Var.a) {
            fl3Var = new fl3(io5Var);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x02Var, fl3Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x02Var);
    }

    public final void d0(eu3 eu3Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io5 io5Var = new io5();
        eu3Var.getClass();
        kotlinx.coroutines.internal.a.b.set(io5Var, eu3Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.a.a;
        atomicReferenceFieldUpdater2.set(io5Var, eu3Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(eu3Var) == eu3Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(eu3Var, eu3Var, io5Var)) {
                    if (atomicReferenceFieldUpdater2.get(eu3Var) != eu3Var) {
                        break;
                    }
                }
                io5Var.g(eu3Var);
                break loop0;
            }
            break;
        }
        kotlinx.coroutines.internal.a aVarH = eu3Var.h();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, eu3Var, aVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == eu3Var);
    }

    public final int e0(Object obj) {
        boolean z = obj instanceof x02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((x02) obj).a) {
                return 0;
            }
            x02 x02Var = at2.s;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x02Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            b0();
            return 1;
        }
        if (!(obj instanceof fl3)) {
            return 0;
        }
        io5 io5Var = ((fl3) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, io5Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        b0();
        return 1;
    }

    @Override // defpackage.wt3, defpackage.pw6
    public void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        v(cancellationException);
    }

    public final Object g0(Object obj, Object obj2) {
        if (!(obj instanceof gm3)) {
            return at2.m;
        }
        if (((obj instanceof x02) || (obj instanceof eu3)) && !(obj instanceof mq0) && !(obj2 instanceof rx0)) {
            gm3 gm3Var = (gm3) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object hm3Var = obj2 instanceof gm3 ? new hm3((gm3) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gm3Var, hm3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != gm3Var) {
                    return at2.o;
                }
            }
            a0(obj2);
            A(gm3Var, obj2);
            return obj2;
        }
        gm3 gm3Var2 = (gm3) obj;
        io5 io5VarM = M(gm3Var2);
        if (io5VarM == null) {
            return at2.o;
        }
        hu3 hu3Var = gm3Var2 instanceof hu3 ? (hu3) gm3Var2 : null;
        if (hu3Var == null) {
            hu3Var = new hu3(io5VarM, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (hu3Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = hu3.b;
            if (atomicIntegerFieldUpdater.get(hu3Var) == 1) {
                return at2.m;
            }
            atomicIntegerFieldUpdater.set(hu3Var, 1);
            if (hu3Var != gm3Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, gm3Var2, hu3Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != gm3Var2) {
                        return at2.o;
                    }
                }
            }
            boolean zE = hu3Var.e();
            rx0 rx0Var = obj2 instanceof rx0 ? (rx0) obj2 : null;
            if (rx0Var != null) {
                hu3Var.a(rx0Var.a);
            }
            Throwable thC = zE ? null : hu3Var.c();
            ref$ObjectRef.a = thC;
            if (thC != null) {
                Z(io5VarM, thC);
            }
            mq0 mq0VarY = Y(io5VarM);
            if (mq0VarY != null && h0(hu3Var, mq0VarY, obj2)) {
                return at2.n;
            }
            io5VarM.e(new q84(2), 2);
            mq0 mq0VarY2 = Y(io5VarM);
            return (mq0VarY2 == null || !h0(hu3Var, mq0VarY2, obj2)) ? C(hu3Var, obj2) : at2.n;
        }
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return th0.n;
    }

    public final boolean h0(hu3 hu3Var, mq0 mq0Var, Object obj) {
        while (a.i(mq0Var.e, false, new gu3(this, hu3Var, mq0Var, obj)) == lo5.a) {
            mq0Var = Y(mq0Var);
            if (mq0Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wt3
    public final bq1 k(boolean z, boolean z2, dp2 dp2Var) {
        return S(z2, z ? new ys3(dp2Var) : new dq1(1, dp2Var));
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    public void q(Object obj) {
    }

    public void r(Object obj) {
        q(obj);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }

    public final Object s(ContinuationImpl continuationImpl) throws Throwable {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof gm3)) {
                if (obj instanceof rx0) {
                    throw ((rx0) obj).a;
                }
                return at2.n0(obj);
            }
        } while (e0(obj) < 0);
        fu3 fu3Var = new fu3(ok4.I(continuationImpl), this);
        fu3Var.v();
        int i = 2;
        fu3Var.y(new im0(i, a.i(this, true, new dq1(i, fu3Var))));
        Object objU = fu3Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    @Override // defpackage.wt3
    public final bq1 s0(dp2 dp2Var) {
        return S(true, new dq1(1, dp2Var));
    }

    @Override // defpackage.wt3
    public final boolean start() {
        int iE0;
        do {
            iE0 = e0(a.get(this));
            if (iE0 == 0) {
                return false;
            }
        } while (iE0 != 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c.t(java.lang.Object):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X() + '{' + f0(a.get(this)) + '}');
        sb.append('@');
        sb.append(ub1.v(this));
        return sb.toString();
    }

    public void v(CancellationException cancellationException) {
        t(cancellationException);
    }

    public final boolean w(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        lq0 lq0Var = (lq0) b.get(this);
        return (lq0Var == null || lq0Var == lo5.a) ? z : lq0Var.c(th) || z;
    }

    @Override // defpackage.wt3
    public final boolean w0() {
        Object obj = a.get(this);
        if (obj instanceof rx0) {
            return true;
        }
        return (obj instanceof hu3) && ((hu3) obj).e();
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean z(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && H();
    }

    public void O(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }
}
