package androidx.paging;

import defpackage.bp2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend", v = 1)
final class Pager$flow$2 extends SuspendLambda implements dp2 {
    public final /* synthetic */ bp2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pager$flow$2(bp2 bp2Var, g51 g51Var) {
        super(1, g51Var);
        this.a = bp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new Pager$flow$2(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((Pager$flow$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return this.a.invoke();
    }
}
