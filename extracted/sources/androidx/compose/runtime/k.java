package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import defpackage.ba5;
import defpackage.bh0;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c01;
import defpackage.c08;
import defpackage.d01;
import defpackage.d08;
import defpackage.de7;
import defpackage.dm5;
import defpackage.g08;
import defpackage.hh2;
import defpackage.io7;
import defpackage.j01;
import defpackage.ja1;
import defpackage.js3;
import defpackage.jz4;
import defpackage.kz4;
import defpackage.lv7;
import defpackage.lz4;
import defpackage.ml9;
import defpackage.my6;
import defpackage.nm0;
import defpackage.o27;
import defpackage.o66;
import defpackage.ok4;
import defpackage.om0;
import defpackage.oy6;
import defpackage.pa2;
import defpackage.pm0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rb4;
import defpackage.rb5;
import defpackage.rl3;
import defpackage.sb5;
import defpackage.sk6;
import defpackage.sn5;
import defpackage.sz0;
import defpackage.th0;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.v25;
import defpackage.vb5;
import defpackage.w61;
import defpackage.wt3;
import defpackage.xt3;
import defpackage.xv3;
import defpackage.z45;
import defpackage.zb5;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d01 {
    public static final kotlinx.coroutines.flow.l A = ja1.b(o66.d);
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);
    public final bh0 a;
    public final pa2 b;
    public final Object c;
    public wt3 d;
    public Throwable e;
    public final ArrayList f;
    public Object g;
    public sb5 h;
    public final zb5 i;
    public final ArrayList j;
    public final ArrayList k;
    public final rb5 l;
    public final hh2 m;
    public final rb5 n;
    public final rb5 o;
    public ArrayList p;
    public LinkedHashSet q;
    public om0 r;
    public boolean s;
    public ut4 t;
    public boolean u;
    public final kotlinx.coroutines.flow.l v;
    public final sk6 w;
    public final xt3 x;
    public final w61 y;
    public final rl3 z;

    public k(w61 w61Var) {
        bh0 bh0Var = new bh0(new oy6(this, 0));
        this.a = bh0Var;
        this.b = new pa2(new oy6(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new sb5();
        this.i = new zb5(0, new j01[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new rb5();
        this.m = new hh2(22, (byte) 0);
        this.n = new rb5();
        this.o = new rb5();
        this.v = ja1.b(Recomposer$State.c);
        this.w = new sk6(12, (byte) 0);
        xt3 xt3Var = new xt3((wt3) w61Var.r0(th0.n));
        xt3Var.s0(new z45(26, this));
        this.x = xt3Var;
        this.y = w61Var.l0(bh0Var).l0(xt3Var);
        this.z = new rl3();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, qp2] */
    public static final boolean A(k kVar) {
        boolean z;
        synchronized (kVar.c) {
            z = kVar.s;
        }
        if (!z) {
            return true;
        }
        io7 io7VarH = o27.h((RestrictedSuspendLambda) kVar.x.E().b);
        while (io7VarH.hasNext()) {
            if (((wt3) io7VarH.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public static final List B(k kVar) {
        List listN;
        synchronized (kVar.c) {
            listN = kVar.N();
        }
        return listN;
    }

    public static final void C(k kVar, wt3 wt3Var) {
        synchronized (kVar.c) {
            Throwable th = kVar.e;
            if (th != null) {
                throw th;
            }
            if (((Recomposer$State) kVar.v.getValue()).compareTo(Recomposer$State.b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (kVar.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            kVar.d = wt3Var;
            kVar.G();
        }
    }

    public static void D(vb5 vb5Var) {
        try {
            if (vb5Var.w() instanceof d08) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            vb5Var.c();
        }
    }

    public static final void F(k kVar, lz4 lz4Var, lz4 lz4Var2) {
        List list = lz4Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lz4 lz4Var3 = (lz4) list.get(i);
                hh2 hh2Var = kVar.m;
                jz4 jz4Var = lz4Var3.a;
                ba5.a((rb5) hh2Var.b, jz4Var, new dm5(lz4Var3, lz4Var));
                ba5.a((rb5) hh2Var.c, lz4Var, jz4Var);
                F(kVar, lz4Var, lz4Var3);
            }
        }
    }

    public static final void R(ArrayList arrayList, k kVar, j01 j01Var) {
        arrayList.clear();
        synchronized (kVar.c) {
            Iterator it = kVar.k.iterator();
            while (it.hasNext()) {
                lz4 lz4Var = (lz4) it.next();
                if (lz4Var.c.equals(j01Var)) {
                    arrayList.add(lz4Var);
                    it.remove();
                }
            }
        }
    }

    public static final Object z(k kVar, SuspendLambda suspendLambda) {
        om0 om0Var;
        if (kVar.L()) {
            return tx8.a;
        }
        om0 om0Var2 = new om0(1, ok4.I(suspendLambda));
        om0Var2.v();
        synchronized (kVar.c) {
            if (kVar.L()) {
                om0Var = om0Var2;
            } else {
                kVar.r = om0Var2;
                om0Var = null;
            }
        }
        if (om0Var != null) {
            om0Var.resumeWith(tx8.a);
        }
        Object objU = om0Var2.u();
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }

    public final void E() {
        synchronized (this.c) {
            if (((Recomposer$State) this.v.getValue()).compareTo(Recomposer$State.e) >= 0) {
                kotlinx.coroutines.flow.l lVar = this.v;
                Recomposer$State recomposer$State = Recomposer$State.b;
                lVar.getClass();
                lVar.p(null, recomposer$State);
            }
        }
        this.x.g(null);
    }

    public final nm0 G() {
        Recomposer$State recomposer$State;
        kotlinx.coroutines.flow.l lVar = this.v;
        int iCompareTo = ((Recomposer$State) lVar.getValue()).compareTo(Recomposer$State.b);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        zb5 zb5Var = this.i;
        if (iCompareTo > 0) {
            if (this.t != null) {
                recomposer$State = Recomposer$State.c;
            } else if (this.d == null) {
                this.h = new sb5();
                zb5Var.h();
                recomposer$State = (I() || K()) ? Recomposer$State.d : Recomposer$State.c;
            } else {
                recomposer$State = (zb5Var.c != 0 || this.h.c() || !arrayList2.isEmpty() || !arrayList.isEmpty() || I() || K() || this.l.j()) ? Recomposer$State.f : Recomposer$State.e;
            }
            lVar.getClass();
            lVar.p(null, recomposer$State);
            if (recomposer$State != Recomposer$State.f) {
                return null;
            }
            om0 om0Var = this.r;
            this.r = null;
            return om0Var;
        }
        List listN = N();
        int size = listN.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = EmptyList.a;
        this.h = new sb5();
        zb5Var.h();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        om0 om0Var2 = this.r;
        if (om0Var2 != null) {
            om0Var2.n(null);
        }
        this.r = null;
        this.t = null;
        return null;
    }

    public final boolean H() {
        boolean zI;
        synchronized (this.c) {
            zI = I();
        }
        return zI;
    }

    public final boolean I() {
        return !this.u && (((AtomicInt) this.a.b.d).get() & 134217727) > 0;
    }

    public final boolean J() {
        return this.i.c != 0 || I() || K() || this.l.j();
    }

    public final boolean K() {
        return !this.u && (((AtomicInt) ((rb4) this.b.b).d).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            sb5 r1 = r2.h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            zb5 r1 = r2.i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.I()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r1 = r2.K()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r1 = 0
            goto L24
        L21:
            r1 = move-exception
            goto L26
        L23:
            r1 = 1
        L24:
            monitor-exit(r0)
            return r1
        L26:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.k.L():boolean");
    }

    public final Object M(SuspendLambda suspendLambda) {
        Object objP = kotlinx.coroutines.flow.d.p(this.v, new Recomposer$join$2(2, null), suspendLambda);
        return objP == CoroutineSingletons.a ? objP : tx8.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List N() {
        ?? r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void O() {
        nm0 nm0VarG;
        synchronized (this.c) {
            nm0VarG = G();
            if (((Recomposer$State) this.v.getValue()).compareTo(Recomposer$State.b) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (nm0VarG != null) {
            ((om0) nm0VarG).resumeWith(tx8.a);
        }
    }

    public final void P() {
        synchronized (this.c) {
            this.u = true;
        }
    }

    public final void Q(j01 j01Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((lz4) arrayList.get(i)).c.equals(j01Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    R(arrayList2, this, j01Var);
                    while (!arrayList2.isEmpty()) {
                        S(arrayList2, null);
                        R(arrayList2, this, j01Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (r4 >= r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).b == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r8 >= r4) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0174, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017c, code lost:
    
        if (r11.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        r11 = (defpackage.lz4) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r11 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018e, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        kotlin.collections.a.b0(r3, r16.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0197, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a5, code lost:
    
        if (r8 >= r4) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (((kotlin.Pair) r11).b == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List S(java.util.List r17, defpackage.sb5 r18) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.k.S(java.util.List, sb5):java.util.List");
    }

    public final j01 T(j01 j01Var, sb5 sb5Var) {
        vb5 vb5VarD;
        if (j01Var.v.F || j01Var.w == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.q;
        if (linkedHashSet == null || !linkedHashSet.contains(j01Var)) {
            z45 z45Var = new z45(25, j01Var);
            v25 v25Var = new v25(j01Var, sb5Var, 16);
            c08 c08VarJ = g08.j();
            vb5 vb5Var = c08VarJ instanceof vb5 ? (vb5) c08VarJ : null;
            if (vb5Var == null || (vb5VarD = vb5Var.D(z45Var, v25Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                c08 c08VarJ2 = vb5VarD.j();
                if (sb5Var != null) {
                    try {
                        if (sb5Var.c()) {
                            xv3 xv3Var = new xv3(sb5Var, j01Var, 16);
                            qz0 qz0Var = j01Var.v;
                            if (qz0Var.F) {
                                sz0.a("Preparing a composition while composing is not supported");
                            }
                            qz0Var.F = true;
                            try {
                                xv3Var.invoke();
                                qz0Var.F = false;
                            } catch (Throwable th) {
                                qz0Var.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        c08.q(c08VarJ2);
                        throw th2;
                    }
                }
                boolean z = j01Var.z();
                c08.q(c08VarJ2);
                if (z) {
                    return j01Var;
                }
            } finally {
                D(vb5VarD);
            }
        }
        return null;
    }

    public final void U(Throwable th, j01 j01Var) throws Throwable {
        if (!((Boolean) B.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                t0.e("ComposeInternal", "Error was captured in composition.", th);
                ut4 ut4Var = this.t;
                if (ut4Var != null) {
                    throw ((Throwable) ut4Var.b);
                }
                this.t = new ut4(7, th);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                t0.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.h();
                this.h = new sb5();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.t = new ut4(7, th);
                if (j01Var != null) {
                    W(j01Var);
                }
                G();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean V() {
        boolean zJ;
        EmptyList emptyList = EmptyList.a;
        synchronized (this.c) {
            if (this.h.b()) {
                return J();
            }
            List listN = N();
            androidx.compose.runtime.collection.a aVar = new androidx.compose.runtime.collection.a(this.h);
            this.h = new sb5();
            try {
                int size = listN.size();
                for (int i = 0; i < size; i++) {
                    ((j01) listN.get(i)).A(aVar);
                    if (((Recomposer$State) this.v.getValue()).compareTo(Recomposer$State.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (G() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zJ = J();
                }
                return zJ;
            } catch (Throwable th) {
                synchronized (this.c) {
                    sb5 sb5Var = this.h;
                    sb5Var.getClass();
                    Iterator<E> it = aVar.iterator();
                    while (it.hasNext()) {
                        sb5Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void W(j01 j01Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(j01Var)) {
            arrayList.add(j01Var);
        }
        if (this.f.remove(j01Var)) {
            this.g = null;
        }
    }

    public final void X() {
        nm0 nm0VarG;
        synchronized (this.c) {
            if (this.u) {
                this.u = false;
                nm0VarG = G();
            } else {
                nm0VarG = null;
            }
        }
        if (nm0VarG != null) {
            ((om0) nm0VarG).resumeWith(tx8.a);
        }
    }

    public final Object Y(SuspendLambda suspendLambda) throws Throwable {
        Object objZ = bt2.Z(this.a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), ml9.s(suspendLambda.getContext()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        tx8 tx8Var = tx8.a;
        if (objZ != coroutineSingletons) {
            objZ = tx8Var;
        }
        return objZ == coroutineSingletons ? objZ : tx8Var;
    }

    @Override // defpackage.d01
    public final void a(j01 j01Var, qp2 qp2Var) throws Throwable {
        Recomposer$State recomposer$State;
        boolean zContains;
        vb5 vb5VarD;
        boolean z = j01Var.v.F;
        synchronized (this.c) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.v.getValue();
            recomposer$State = Recomposer$State.b;
            zContains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ N().contains(j01Var) : true;
        }
        try {
            z45 z45Var = new z45(25, j01Var);
            v25 v25Var = new v25(j01Var, (Object) null, 16);
            c08 c08VarJ = g08.j();
            vb5 vb5Var = c08VarJ instanceof vb5 ? (vb5) c08VarJ : null;
            if (vb5Var == null || (vb5VarD = vb5Var.D(z45Var, v25Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                c08 c08VarJ2 = vb5VarD.j();
                try {
                    j01Var.m(qp2Var);
                    synchronized (this.c) {
                        if (((Recomposer$State) this.v.getValue()).compareTo(recomposer$State) > 0 && !N().contains(j01Var)) {
                            this.f.add(j01Var);
                            this.g = null;
                        }
                    }
                    if (!z) {
                        g08.j().m();
                    }
                    try {
                        Q(j01Var);
                        try {
                            j01Var.g();
                            j01Var.i();
                            if (z) {
                                return;
                            }
                            g08.j().m();
                        } catch (Throwable th) {
                            U(th, null);
                        }
                    } catch (Throwable th2) {
                        U(th2, j01Var);
                    }
                } finally {
                    c08.q(c08VarJ2);
                }
            } finally {
                D(vb5VarD);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            U(th3, j01Var);
        }
    }

    @Override // defpackage.d01
    public final androidx.collection.e b(j01 j01Var, lv7 lv7Var, qp2 qp2Var) {
        sk6 sk6Var = this.w;
        try {
            lv7 lv7Var2 = j01Var.p;
            j01Var.p = lv7Var;
            try {
                a(j01Var, qp2Var);
                sb5 sb5Var = (sb5) sk6Var.s();
                if (sb5Var == null) {
                    sb5Var = de7.a;
                    js3.n(sb5Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return sb5Var;
            } finally {
                j01Var.p = lv7Var2;
            }
        } finally {
            sk6Var.I(null);
        }
    }

    @Override // defpackage.d01
    public final void c(lz4 lz4Var) {
        nm0 nm0VarG;
        synchronized (this.c) {
            try {
                ba5.a(this.l, lz4Var.a, lz4Var);
                if (lz4Var.h != null) {
                    F(this, lz4Var, lz4Var);
                }
                nm0VarG = G();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nm0VarG != null) {
            ((om0) nm0VarG).resumeWith(tx8.a);
        }
    }

    @Override // defpackage.d01
    public final boolean e() {
        return ((Boolean) B.get()).booleanValue();
    }

    @Override // defpackage.d01
    public final boolean f() {
        return false;
    }

    @Override // defpackage.d01
    public final boolean g() {
        return false;
    }

    @Override // defpackage.d01
    public final long h() {
        return 1000;
    }

    @Override // defpackage.d01
    public final c01 i() {
        return null;
    }

    @Override // defpackage.d01
    public final w61 k() {
        return this.y;
    }

    @Override // defpackage.d01
    public final boolean l() {
        return false;
    }

    @Override // defpackage.d01
    public final void m(lz4 lz4Var) {
        nm0 nm0VarG;
        synchronized (this.c) {
            this.k.add(lz4Var);
            nm0VarG = G();
        }
        if (nm0VarG != null) {
            ((om0) nm0VarG).resumeWith(tx8.a);
        }
    }

    @Override // defpackage.d01
    public final void n(j01 j01Var) {
        nm0 nm0VarG;
        synchronized (this.c) {
            if (this.i.i(j01Var)) {
                nm0VarG = null;
            } else {
                this.i.b(j01Var);
                nm0VarG = G();
            }
        }
        if (nm0VarG != null) {
            ((om0) nm0VarG).resumeWith(tx8.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // defpackage.d01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.lz4 r18, defpackage.kz4 r19, defpackage.ou r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.c
            monitor-enter(r3)
            rb5 r4 = r1.n     // Catch: java.lang.Throwable -> L80
            r4.m(r0, r2)     // Catch: java.lang.Throwable -> L80
            rb5 r4 = r1.o     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L1e
            mb5 r0 = defpackage.zq5.b     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            defpackage.js3.n(r0, r4)     // Catch: java.lang.Throwable -> L80
            goto L31
        L1e:
            boolean r4 = r0 instanceof defpackage.mb5     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L25
            androidx.collection.c r0 = (androidx.collection.c) r0     // Catch: java.lang.Throwable -> L80
            goto L31
        L25:
            java.lang.Object[] r4 = defpackage.zq5.a     // Catch: java.lang.Throwable -> L80
            mb5 r4 = new mb5     // Catch: java.lang.Throwable -> L80
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L80
            r4.g(r0)     // Catch: java.lang.Throwable -> L80
            r0 = r4
        L31:
            boolean r4 = r0.e()     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L8d
            r4 = r20
            rb5 r0 = r2.b(r4, r0)     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r2 = r0.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r4 = r0.c     // Catch: java.lang.Throwable -> L80
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L80
            int r5 = r0.length     // Catch: java.lang.Throwable -> L80
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = 0
            r7 = r6
        L4a:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L80
            long r10 = ~r8     // Catch: java.lang.Throwable -> L80
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L88
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L80
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L64:
            if (r12 >= r10) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L82
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L80
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L80
            kz4 r13 = (defpackage.kz4) r13     // Catch: java.lang.Throwable -> L80
            lz4 r14 = (defpackage.lz4) r14     // Catch: java.lang.Throwable -> L80
            rb5 r15 = r1.n     // Catch: java.lang.Throwable -> L80
            r15.m(r14, r13)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r0 = move-exception
            goto L8f
        L82:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L64
        L86:
            if (r10 != r11) goto L8d
        L88:
            if (r7 == r5) goto L8d
            int r7 = r7 + 1
            goto L4a
        L8d:
            monitor-exit(r3)
            return
        L8f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.k.o(lz4, kz4, ou):void");
    }

    @Override // defpackage.d01
    public final kz4 p(lz4 lz4Var) {
        kz4 kz4Var;
        synchronized (this.c) {
            kz4Var = (kz4) this.n.k(lz4Var);
        }
        return kz4Var;
    }

    @Override // defpackage.d01
    public final androidx.collection.e q(j01 j01Var, lv7 lv7Var, androidx.collection.e eVar) {
        sk6 sk6Var = this.w;
        try {
            V();
            j01Var.A(new androidx.compose.runtime.collection.a(eVar));
            lv7 lv7Var2 = j01Var.p;
            j01Var.p = lv7Var;
            try {
                j01 j01VarT = T(j01Var, null);
                if (j01VarT != null) {
                    Q(j01Var);
                    j01VarT.g();
                    j01VarT.i();
                }
                sb5 sb5Var = (sb5) sk6Var.s();
                if (sb5Var == null) {
                    sb5Var = de7.a;
                    js3.n(sb5Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return sb5Var;
            } finally {
                j01Var.p = lv7Var2;
            }
        } finally {
            sk6Var.I(null);
        }
    }

    @Override // defpackage.d01
    public final void r(Set set) {
    }

    @Override // defpackage.d01
    public final void t(my6 my6Var) {
        sk6 sk6Var = this.w;
        sb5 sb5Var = (sb5) sk6Var.s();
        if (sb5Var == null) {
            sb5 sb5Var2 = de7.a;
            sb5Var = new sb5();
            sk6Var.I(sb5Var);
        }
        sb5Var.d(my6Var);
    }

    @Override // defpackage.d01
    public final void u(j01 j01Var) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(j01Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d01
    public final pm0 v(bp2 bp2Var) {
        pa2 pa2Var = this.b;
        rb4 rb4Var = (rb4) pa2Var.b;
        sn5 sn5Var = new sn5();
        sn5Var.a = bp2Var;
        return rb4Var.i(sn5Var, (xv3) pa2Var.d);
    }

    @Override // defpackage.d01
    public final void y(j01 j01Var) {
        synchronized (this.c) {
            if (this.f.remove(j01Var)) {
                this.g = null;
            }
            this.i.k(j01Var);
            this.j.remove(j01Var);
        }
    }
}
