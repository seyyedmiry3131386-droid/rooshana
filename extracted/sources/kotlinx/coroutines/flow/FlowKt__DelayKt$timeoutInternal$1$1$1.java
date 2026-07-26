package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.jp0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ze2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(ze2 ze2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = ze2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.c, g51Var);
        flowKt__DelayKt$timeoutInternal$1$1$1.b = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new jp0(((jp0) obj).a), (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            java.lang.Object r0 = r3.b
            kotlin.b.b(r4)
            goto L32
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.b.b(r4)
            java.lang.Object r4 = r3.b
            jp0 r4 = (defpackage.jp0) r4
            java.lang.Object r4 = r4.a
            boolean r1 = r4 instanceof defpackage.ip0
            if (r1 != 0) goto L33
            r3.b = r4
            r3.a = r2
            ze2 r1 = r3.c
            java.lang.Object r1 = r1.emit(r4, r3)
            if (r1 != r0) goto L31
            return r0
        L31:
            r0 = r4
        L32:
            r4 = r0
        L33:
            boolean r0 = r4 instanceof defpackage.hp0
            if (r0 == 0) goto L42
            java.lang.Throwable r4 = defpackage.jp0.a(r4)
            if (r4 != 0) goto L41
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L41:
            throw r4
        L42:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
