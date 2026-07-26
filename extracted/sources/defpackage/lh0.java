package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes3.dex */
public final class lh0 implements gc9 {
    public Object a = mh0.p;
    public om0 b;
    public final /* synthetic */ a c;

    public lh0(a aVar) {
        this.c = aVar;
    }

    @Override // defpackage.gc9
    public final void a(wl7 wl7Var, int i) {
        om0 om0Var = this.b;
        if (om0Var != null) {
            om0Var.a(wl7Var, i);
        }
    }

    public final Object d(g51 g51Var) {
        kp0 kp0VarT;
        Object obj = this.a;
        boolean z = true;
        if (obj == mh0.p || obj == mh0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.g;
            a aVar = this.c;
            kp0 kp0Var = (kp0) atomicReferenceFieldUpdater.get(aVar);
            while (true) {
                if (aVar.A()) {
                    this.a = mh0.l;
                    Throwable thU = aVar.u();
                    if (thU != null) {
                        int i = d48.a;
                        throw thU;
                    }
                    z = false;
                } else {
                    long andIncrement = a.c.getAndIncrement(aVar);
                    long j = mh0.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (kp0Var.c != j2) {
                        kp0VarT = aVar.t(j2, kp0Var);
                        if (kp0VarT == null) {
                            continue;
                        }
                    } else {
                        kp0VarT = kp0Var;
                    }
                    Object objM = aVar.M(kp0VarT, i2, andIncrement, null);
                    mu3 mu3Var = mh0.m;
                    if (objM == mu3Var) {
                        throw new IllegalStateException("unreachable");
                    }
                    mu3 mu3Var2 = mh0.o;
                    if (objM == mu3Var2) {
                        if (andIncrement < aVar.x()) {
                            kp0VarT.a();
                        }
                        kp0Var = kp0VarT;
                    } else {
                        if (objM == mh0.n) {
                            a aVar2 = this.c;
                            om0 om0VarZ = s7.z(ok4.I(g51Var));
                            try {
                                this.b = om0VarZ;
                                Object objM2 = aVar2.M(kp0VarT, i2, andIncrement, this);
                                if (objM2 == mu3Var) {
                                    a(kp0VarT, i2);
                                } else {
                                    if (objM2 == mu3Var2) {
                                        if (andIncrement < aVar2.x()) {
                                            kp0VarT.a();
                                        }
                                        kp0 kp0Var2 = (kp0) a.g.get(aVar2);
                                        while (true) {
                                            if (aVar2.A()) {
                                                om0 om0Var = this.b;
                                                js3.m(om0Var);
                                                this.b = null;
                                                this.a = mh0.l;
                                                Throwable thU2 = aVar.u();
                                                if (thU2 == null) {
                                                    om0Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    om0Var.resumeWith(b.a(thU2));
                                                }
                                            } else {
                                                long andIncrement2 = a.c.getAndIncrement(aVar2);
                                                long j3 = mh0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (kp0Var2.c != j4) {
                                                    kp0 kp0VarT2 = aVar2.t(j4, kp0Var2);
                                                    if (kp0VarT2 != null) {
                                                        kp0Var2 = kp0VarT2;
                                                    }
                                                }
                                                Object objM3 = aVar2.M(kp0Var2, i3, andIncrement2, this);
                                                if (objM3 == mh0.m) {
                                                    a(kp0Var2, i3);
                                                    break;
                                                }
                                                if (objM3 == mh0.o) {
                                                    if (andIncrement2 < aVar2.x()) {
                                                        kp0Var2.a();
                                                    }
                                                } else {
                                                    if (objM3 == mh0.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kp0Var2.a();
                                                    this.a = objM3;
                                                    this.b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kp0VarT.a();
                                        this.a = objM2;
                                        this.b = null;
                                    }
                                    om0VarZ.j(Boolean.TRUE, null);
                                }
                                Object objU = om0VarZ.u();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                                return objU;
                            } catch (Throwable th) {
                                om0VarZ.C();
                                throw th;
                            }
                        }
                        kp0VarT.a();
                        this.a = objM;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object f() {
        Object obj = this.a;
        mu3 mu3Var = mh0.p;
        if (obj == mu3Var) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = mu3Var;
        if (obj != mh0.l) {
            return obj;
        }
        Throwable thV = this.c.v();
        int i = d48.a;
        throw thV;
    }
}
