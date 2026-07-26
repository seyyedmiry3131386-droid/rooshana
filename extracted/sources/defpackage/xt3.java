package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public class xt3 extends c {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt3(wt3 wt3Var) {
        super(true);
        boolean z = true;
        Q(wt3Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.b;
        lq0 lq0Var = (lq0) atomicReferenceFieldUpdater.get(this);
        mq0 mq0Var = lq0Var instanceof mq0 ? (mq0) lq0Var : null;
        if (mq0Var == null) {
            z = false;
            break;
        }
        c cVarJ = mq0Var.j();
        while (!cVarJ.H()) {
            lq0 lq0Var2 = (lq0) atomicReferenceFieldUpdater.get(cVarJ);
            mq0 mq0Var2 = lq0Var2 instanceof mq0 ? (mq0) lq0Var2 : null;
            if (mq0Var2 == null) {
                z = false;
                break;
            }
            cVarJ = mq0Var2.j();
        }
        this.c = z;
    }

    @Override // kotlinx.coroutines.c
    public final boolean H() {
        return this.c;
    }

    @Override // kotlinx.coroutines.c
    public final boolean L() {
        return true;
    }
}
