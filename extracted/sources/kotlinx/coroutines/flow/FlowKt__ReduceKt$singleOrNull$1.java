package kotlinx.coroutines.flow;

import defpackage.lf2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "singleOrNull")
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public Ref$ObjectRef a;
    public lf2 b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.c = r7
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            mu3 r2 = defpackage.vy2.f
            int r0 = r0 - r1
            r6.d = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto L1e
            lf2 r0 = r6.b
            kotlin.jvm.internal.Ref$ObjectRef r3 = r6.a
            kotlin.b.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L1c
            goto L4c
        L1c:
            r7 = move-exception
            goto L41
        L1e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L26:
            kotlin.b.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.a = r2
            lf2 r0 = new lf2
            r4 = 3
            r0.<init>(r7, r4)
            r6.a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            r6.b = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            r6.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3d
            throw r1
        L3d:
            r3 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
        L41:
            java.lang.Object r4 = r7.a
            if (r4 != r0) goto L53
            w61 r7 = r6.getContext()
            kotlinx.coroutines.a.f(r7)
        L4c:
            java.lang.Object r7 = r3.a
            if (r7 != r2) goto L51
            goto L52
        L51:
            r1 = r7
        L52:
            return r1
        L53:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
