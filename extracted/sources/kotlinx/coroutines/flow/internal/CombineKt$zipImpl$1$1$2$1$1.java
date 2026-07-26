package kotlinx.coroutines.flow.internal;

import defpackage.g51;
import defpackage.qk6;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xt3;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
final class CombineKt$zipImpl$1$1$2$1$1 extends SuspendLambda implements qp2 {
    public ze2 a;
    public int b;
    public final /* synthetic */ qk6 c;
    public final /* synthetic */ ze2 d;
    public final /* synthetic */ rp2 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xt3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$2$1$1(qk6 qk6Var, ze2 ze2Var, rp2 rp2Var, Object obj, xt3 xt3Var, g51 g51Var) {
        super(2, g51Var);
        this.c = qk6Var;
        this.d = ze2Var;
        this.e = rp2Var;
        this.f = obj;
        this.g = xt3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CombineKt$zipImpl$1$1$2$1$1(this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1$2$1$1) create((tx8) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r1.emit(r7, r6) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.b.b(r7)
            goto L6b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            ze2 r1 = r6.a
            kotlin.b.b(r7)
            goto L60
        L22:
            kotlin.b.b(r7)
            jp0 r7 = (defpackage.jp0) r7
            java.lang.Object r7 = r7.a
            goto L38
        L2a:
            kotlin.b.b(r7)
            r6.b = r5
            qk6 r7 = r6.c
            java.lang.Object r7 = r7.m(r6)
            if (r7 != r0) goto L38
            goto L6a
        L38:
            boolean r1 = r7 instanceof defpackage.ip0
            if (r1 == 0) goto L4a
            java.lang.Throwable r7 = defpackage.jp0.a(r7)
            if (r7 != 0) goto L49
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            xt3 r0 = r6.g
            r7.<init>(r0)
        L49:
            throw r7
        L4a:
            mu3 r1 = defpackage.vy2.f
            if (r7 != r1) goto L4f
            r7 = r2
        L4f:
            ze2 r1 = r6.d
            r6.a = r1
            r6.b = r4
            rp2 r4 = r6.e
            java.lang.Object r5 = r6.f
            java.lang.Object r7 = r4.a(r5, r7, r6)
            if (r7 != r0) goto L60
            goto L6a
        L60:
            r6.a = r2
            r6.b = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L6b
        L6a:
            return r0
        L6b:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
