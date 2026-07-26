package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sj6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {1669, 1674, 1675}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements qp2 {
    public sj6 a;
    public int b;
    public final /* synthetic */ wt3 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ab5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(wt3 wt3Var, long j, ab5 ab5Var, g51 g51Var) {
        super(2, g51Var);
        this.c = wt3Var;
        this.d = j;
        this.e = ab5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r2.a(r1, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.b
            ab5 r2 = r7.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.b.b(r8)
            goto L58
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            sj6 r1 = r7.a
            kotlin.b.b(r8)
            goto L4c
        L23:
            kotlin.b.b(r8)
            goto L35
        L27:
            kotlin.b.b(r8)
            r7.b = r5
            wt3 r8 = r7.c
            java.lang.Object r8 = r8.D(r7)
            if (r8 != r0) goto L35
            goto L57
        L35:
            rj6 r8 = new rj6
            long r5 = r7.d
            r8.<init>(r5)
            sj6 r1 = new sj6
            r1.<init>(r8)
            r7.a = r1
            r7.b = r4
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L4c
            goto L57
        L4c:
            r8 = 0
            r7.a = r8
            r7.b = r3
            java.lang.Object r8 = r2.a(r1, r7)
            if (r8 != r0) goto L58
        L57:
            return r0
        L58:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
