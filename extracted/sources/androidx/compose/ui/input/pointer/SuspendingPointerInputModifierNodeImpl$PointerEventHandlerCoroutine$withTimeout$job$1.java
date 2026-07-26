package androidx.compose.ui.input.pointer;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend", v = 1)
final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j, e eVar, g51 g51Var) {
        super(2, g51Var);
        this.b = j;
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (kotlinx.coroutines.a.e(8, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.a
            r2 = 8
            long r4 = r10.b
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            kotlin.b.b(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.b.b(r11)
            goto L2e
        L20:
            kotlin.b.b(r11)
            long r8 = r4 - r2
            r10.a = r7
            java.lang.Object r11 = kotlinx.coroutines.a.e(r8, r10)
            if (r11 != r0) goto L2e
            goto L36
        L2e:
            r10.a = r6
            java.lang.Object r11 = kotlinx.coroutines.a.e(r2, r10)
            if (r11 != r0) goto L37
        L36:
            return r0
        L37:
            androidx.compose.ui.input.pointer.e r11 = r10.c
            om0 r11 = r11.c
            if (r11 == 0) goto L49
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r4)
            kotlin.Result$Failure r0 = kotlin.b.a(r0)
            r11.resumeWith(r0)
        L49:
            tx8 r11 = defpackage.tx8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
