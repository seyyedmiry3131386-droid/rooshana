package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1750, 1752, 1759, 1760, 1770}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements qp2 {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ androidx.compose.foundation.gestures.j d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ab5 f;
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(androidx.compose.foundation.gestures.j jVar, long j, ab5 ab5Var, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.d = jVar;
        this.e = j;
        this.f = ab5Var;
        this.g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.d, this.e, this.f, this.g, g51Var);
        abstractClickableNode$handlePressInteraction$2$1.c = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r14.a(r2, r16) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r14.a(r3, r16) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            androidx.compose.foundation.a r4 = r0.g
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            ab5 r14 = r0.f
            r15 = 0
            if (r2 == 0) goto L42
            if (r2 == r13) goto L38
            if (r2 == r12) goto L32
            if (r2 == r11) goto L2a
            if (r2 == r10) goto L25
            if (r2 != r9) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            kotlin.b.b(r17)
            goto Lbf
        L2a:
            java.lang.Object r2 = r0.c
            sj6 r2 = (defpackage.sj6) r2
            kotlin.b.b(r17)
            goto L98
        L32:
            boolean r2 = r0.a
            kotlin.b.b(r17)
            goto L7e
        L38:
            java.lang.Object r2 = r0.c
            wt3 r2 = (defpackage.wt3) r2
            kotlin.b.b(r17)
            r3 = r17
            goto L64
        L42:
            kotlin.b.b(r17)
            java.lang.Object r2 = r0.c
            e71 r2 = (defpackage.e71) r2
            androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 r3 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1
            ab5 r7 = r0.f
            r8 = 0
            long r5 = r0.e
            r3.<init>(r4, r5, r7, r8)
            li1 r2 = defpackage.bt2.G(r2, r15, r15, r3, r11)
            r0.c = r2
            r0.b = r13
            androidx.compose.foundation.gestures.j r3 = r0.d
            java.lang.Object r3 = r3.e(r0)
            if (r3 != r1) goto L64
            goto Lbe
        L64:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r5 = r2.b()
            if (r5 == 0) goto La3
            r0.c = r15
            r0.a = r3
            r0.b = r12
            java.lang.Object r2 = kotlinx.coroutines.a.d(r2, r0)
            if (r2 != r1) goto L7d
            goto Lbe
        L7d:
            r2 = r3
        L7e:
            if (r2 == 0) goto Lbf
            rj6 r2 = new rj6
            long r5 = r0.e
            r2.<init>(r5)
            sj6 r3 = new sj6
            r3.<init>(r2)
            r0.c = r3
            r0.b = r11
            java.lang.Object r2 = r14.a(r2, r0)
            if (r2 != r1) goto L97
            goto Lbe
        L97:
            r2 = r3
        L98:
            r0.c = r15
            r0.b = r10
            java.lang.Object r2 = r14.a(r2, r0)
            if (r2 != r1) goto Lbf
            goto Lbe
        La3:
            rj6 r2 = r4.B
            if (r2 == 0) goto Lbf
            if (r3 == 0) goto Laf
            sj6 r3 = new sj6
            r3.<init>(r2)
            goto Lb4
        Laf:
            qj6 r3 = new qj6
            r3.<init>(r2)
        Lb4:
            r0.c = r15
            r0.b = r9
            java.lang.Object r2 = r14.a(r3, r0)
            if (r2 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            r4.B = r15
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
