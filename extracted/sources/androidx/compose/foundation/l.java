package androidx.compose.foundation;

import defpackage.bc5;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.xg1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final AtomicReference a = new AtomicReference(null);
    public final kotlinx.coroutines.sync.a b = new kotlinx.coroutines.sync.a();

    public static final void a(l lVar, bc5 bc5Var) {
        AtomicReference atomicReference = lVar.a;
        while (true) {
            bc5 bc5Var2 = (bc5) atomicReference.get();
            if (bc5Var2 != null && bc5Var.a.compareTo(bc5Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(bc5Var2, bc5Var)) {
                if (atomicReference.get() != bc5Var2) {
                    break;
                }
            }
            if (bc5Var2 != null) {
                bc5Var2.b.g(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public final Object b(MutatePriority mutatePriority, dp2 dp2Var, SuspendLambda suspendLambda) {
        return js3.v(new MutatorMutex$mutate$2(mutatePriority, this, dp2Var, null), suspendLambda);
    }

    public final Object c(xg1 xg1Var, MutatePriority mutatePriority, qp2 qp2Var, g51 g51Var) {
        return js3.v(new MutatorMutex$mutateWith$2(mutatePriority, this, qp2Var, xg1Var, null), g51Var);
    }
}
