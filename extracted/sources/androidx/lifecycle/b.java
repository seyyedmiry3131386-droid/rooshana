package androidx.lifecycle;

import defpackage.a27;
import defpackage.bt2;
import defpackage.g64;
import defpackage.i64;
import defpackage.js3;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.sg4;
import defpackage.tx8;
import defpackage.ub8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.v54;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final v54 a(g64 g64Var) {
        js3.p(g64Var, "<this>");
        i64 i64VarD = g64Var.D();
        js3.p(i64VarD, "<this>");
        ql4 ql4Var = i64VarD.a;
        while (true) {
            v54 v54Var = (v54) ((AtomicReference) ql4Var.b).get();
            if (v54Var != null) {
                return v54Var;
            }
            ub8 ub8VarA = a27.a();
            ug1 ug1Var = up1.a;
            v54 v54Var2 = new v54(i64VarD, bt2.L(ub8VarA, sg4.a.f));
            AtomicReference atomicReference = (AtomicReference) ql4Var.b;
            while (!atomicReference.compareAndSet(null, v54Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            ug1 ug1Var2 = up1.a;
            bt2.G(v54Var2, sg4.a.f, null, new LifecycleCoroutineScopeImpl$register$1(v54Var2, null), 2);
            return v54Var2;
        }
    }

    public static final Object b(g64 g64Var, Lifecycle$State lifecycle$State, qp2 qp2Var, SuspendLambda suspendLambda) {
        Object objC = c(g64Var.D(), lifecycle$State, qp2Var, suspendLambda);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    public static final Object c(i64 i64Var, Lifecycle$State lifecycle$State, qp2 qp2Var, SuspendLambda suspendLambda) {
        Object objV;
        if (lifecycle$State != Lifecycle$State.b) {
            return (i64Var.d != Lifecycle$State.a && (objV = js3.v(new RepeatOnLifecycleKt$repeatOnLifecycle$3(i64Var, lifecycle$State, qp2Var, null), suspendLambda)) == CoroutineSingletons.a) ? objV : tx8.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object d(i64 i64Var, Lifecycle$State lifecycle$State, qp2 qp2Var, SuspendLambda suspendLambda) {
        ug1 ug1Var = up1.a;
        return bt2.Z(sg4.a.f, new PausingDispatcherKt$whenStateAtLeast$2(i64Var, lifecycle$State, qp2Var, null), suspendLambda);
    }
}
