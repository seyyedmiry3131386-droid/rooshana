package androidx.lifecycle;

import defpackage.dc5;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements qp2 {
    public dc5 a;
    public SuspendLambda b;
    public int c;
    public final /* synthetic */ kotlinx.coroutines.sync.a d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(kotlinx.coroutines.sync.a aVar, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
        this.e = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [qp2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        dc5 dc5Var;
        ?? r1;
        dc5 dc5Var2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                dc5Var = this.d;
                this.a = dc5Var;
                SuspendLambda suspendLambda = this.e;
                this.b = suspendLambda;
                this.c = 1;
                r1 = suspendLambda;
                if (dc5Var.b(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc5Var2 = this.a;
                try {
                    kotlin.b.b(obj);
                    dc5Var2.d(null);
                    return tx8.a;
                } catch (Throwable th2) {
                    th = th2;
                    dc5Var2.d(null);
                    throw th;
                }
            }
            qp2 qp2Var = (qp2) this.b;
            dc5 dc5Var3 = this.a;
            kotlin.b.b(obj);
            dc5Var = dc5Var3;
            r1 = qp2Var;
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(r1, null);
            this.a = dc5Var;
            this.b = null;
            this.c = 2;
            if (js3.v(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                dc5Var2 = dc5Var;
                dc5Var2.d(null);
                return tx8.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            dc5Var2 = dc5Var;
            th = th3;
            dc5Var2.d(null);
            throw th;
        }
    }
}
