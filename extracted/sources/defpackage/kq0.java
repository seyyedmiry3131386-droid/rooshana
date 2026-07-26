package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class kq0 extends eu3 {
    public final /* synthetic */ int e;
    public final om0 f;

    public /* synthetic */ kq0(om0 om0Var, int i) {
        this.e = i;
        this.f = om0Var;
    }

    @Override // defpackage.eu3
    public final boolean k() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.eu3
    public final void l(Throwable th) {
        switch (this.e) {
            case 0:
                c cVarJ = j();
                om0 om0Var = this.f;
                Throwable thT = om0Var.t(cVarJ);
                if (om0Var.z()) {
                    qp1 qp1Var = (qp1) om0Var.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qp1.h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(qp1Var);
                        mu3 mu3Var = dy3.b;
                        if (js3.i(obj, mu3Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(qp1Var, mu3Var, thT)) {
                                if (atomicReferenceFieldUpdater.get(qp1Var) != mu3Var) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(qp1Var, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(qp1Var) != obj) {
                                }
                            }
                        }
                    }
                }
                om0Var.n(thT);
                if (!om0Var.z()) {
                    om0Var.r();
                }
                break;
            default:
                this.f.resumeWith(tx8.a);
                break;
        }
    }
}
