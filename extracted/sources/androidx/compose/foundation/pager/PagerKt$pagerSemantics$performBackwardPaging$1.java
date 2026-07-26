package androidx.compose.foundation.pager;

import defpackage.e71;
import defpackage.g51;
import defpackage.nz5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {560}, m = "invokeSuspend", v = 1)
final class PagerKt$pagerSemantics$performBackwardPaging$1 extends SuspendLambda implements qp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PagerKt$pagerSemantics$performBackwardPaging$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PagerKt$pagerSemantics$performBackwardPaging$1 pagerKt$pagerSemantics$performBackwardPaging$1 = (PagerKt$pagerSemantics$performBackwardPaging$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        pagerKt$pagerSemantics$performBackwardPaging$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
        b.b(obj);
        this.a = 1;
        int i2 = nz5.a;
        throw null;
    }
}
