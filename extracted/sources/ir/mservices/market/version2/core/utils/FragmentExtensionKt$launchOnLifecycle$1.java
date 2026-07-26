package ir.mservices.market.version2.core.utils;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.FragmentExtensionKt$launchOnLifecycle$1", f = "FragmentExtension.kt", l = {28, 29}, m = "invokeSuspend", v = 1)
final class FragmentExtensionKt$launchOnLifecycle$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentExtensionKt$launchOnLifecycle$1(long j, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = j;
        this.c = (SuspendLambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FragmentExtensionKt$launchOnLifecycle$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FragmentExtensionKt$launchOnLifecycle$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5.c.invoke(r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r6v2, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r6)
            goto L35
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.b.b(r6)
            goto L2a
        L1c:
            kotlin.b.b(r6)
            r5.a = r3
            long r3 = r5.b
            java.lang.Object r6 = kotlinx.coroutines.a.e(r3, r5)
            if (r6 != r0) goto L2a
            goto L34
        L2a:
            r5.a = r2
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r5.c
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L35
        L34:
            return r0
        L35:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.core.utils.FragmentExtensionKt$launchOnLifecycle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
