package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rj6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1624, 1625}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$handlePressInteractionStart$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ab5 b;
    public final /* synthetic */ rj6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$1$1(ab5 ab5Var, rj6 rj6Var, boolean z, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ab5Var;
        this.c = rj6Var;
        this.d = z;
        this.e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$handlePressInteractionStart$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionStart$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.b.a(r4, r7) == r0) goto L15;
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
            int r1 = r7.a
            r2 = 2
            r3 = 1
            rj6 r4 = r7.c
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r8)
            goto L37
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.b.b(r8)
            goto L2c
        L1e:
            kotlin.b.b(r8)
            long r5 = defpackage.it0.a
            r7.a = r3
            java.lang.Object r8 = kotlinx.coroutines.a.e(r5, r7)
            if (r8 != r0) goto L2c
            goto L36
        L2c:
            r7.a = r2
            ab5 r8 = r7.b
            java.lang.Object r8 = r8.a(r4, r7)
            if (r8 != r0) goto L37
        L36:
            return r0
        L37:
            boolean r8 = r7.d
            androidx.compose.foundation.a r0 = r7.e
            if (r8 == 0) goto L40
            r0.F = r4
            goto L42
        L40:
            r0.B = r4
        L42:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
