package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.pw6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ pw6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef ref$ObjectRef, pw6 pw6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = ref$ObjectRef;
        this.c = pw6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.b, this.c, g51Var);
        flowKt__DelayKt$sample$2$1$1.a = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = (FlowKt__DelayKt$sample$2$1$1) create(new jp0(((jp0) obj).a), (g51) obj2);
        tx8 tx8Var = tx8.a;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        Object obj2 = ((jp0) this.a).a;
        boolean z = obj2 instanceof ip0;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (!z) {
            ref$ObjectRef.a = obj2;
        }
        if (z) {
            Throwable thA = jp0.a(obj2);
            if (thA != null) {
                throw thA;
            }
            this.c.g(new ChildCancelledException());
            ref$ObjectRef.a = vy2.h;
        }
        return tx8.a;
    }
}
