package androidx.compose.ui;

import androidx.compose.ui.platform.o;
import defpackage.dp2;
import defpackage.ex4;
import defpackage.fx4;
import defpackage.hx4;
import defpackage.iz0;
import defpackage.js3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.wu8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static hx4 a(hx4 hx4Var, rp2 rp2Var) {
        return hx4Var.d(new iz0(o.a, rp2Var));
    }

    public static final hx4 b(final qz0 qz0Var, hx4 hx4Var) {
        if (hx4Var.g(new dp2() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(!(((fx4) obj) instanceof iz0));
            }
        })) {
            return hx4Var;
        }
        qz0Var.b0(1219399079);
        hx4 hx4Var2 = (hx4) hx4Var.i(new qp2() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                hx4 hx4Var3 = (hx4) obj;
                hx4 hx4VarB = (fx4) obj2;
                if (hx4VarB instanceof iz0) {
                    rp2 rp2Var = ((iz0) hx4VarB).c;
                    wu8.i(3, rp2Var);
                    ex4 ex4Var = ex4.b;
                    qz0 qz0Var2 = qz0Var;
                    hx4VarB = b.b(qz0Var2, (hx4) rp2Var.a(ex4Var, qz0Var2, 0));
                }
                return hx4Var3.d(hx4VarB);
            }
        }, ex4.b);
        qz0Var.q(false);
        return hx4Var2;
    }

    public static final hx4 c(qz0 qz0Var, hx4 hx4Var) {
        qz0Var.a0(439770924);
        hx4 hx4VarB = b(qz0Var, hx4Var);
        qz0Var.q(false);
        return hx4VarB;
    }

    public static final Object d(AtomicReference atomicReference, dp2 dp2Var, qp2 qp2Var, ContinuationImpl continuationImpl) {
        return js3.v(new SessionMutex$withSessionCancellingPrevious$2(dp2Var, atomicReference, qp2Var, null), continuationImpl);
    }
}
