package androidx.compose.material3;

import defpackage.e71;
import defpackage.g51;
import defpackage.gr3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {727, 737}, m = "invokeSuspend")
final class CardElevation$animateElevation$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.compose.animation.core.a b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b e;
    public final /* synthetic */ gr3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(androidx.compose.animation.core.a aVar, float f, boolean z, b bVar, gr3 gr3Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = f;
        this.d = z;
        this.e = bVar;
        this.f = gr3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CardElevation$animateElevation$2$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardElevation$animateElevation$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8.e(r7, r1) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (defpackage.oz1.a(r8, r4, r1, r7.f, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.b.b(r8)
            goto L99
        L1a:
            kotlin.b.b(r8)
            androidx.compose.animation.core.a r8 = r7.b
            wb5 r1 = r8.e
            s08 r1 = (defpackage.s08) r1
            java.lang.Object r1 = r1.getValue()
            au1 r1 = (defpackage.au1) r1
            float r1 = r1.a
            float r4 = r7.c
            boolean r1 = defpackage.au1.b(r1, r4)
            if (r1 != 0) goto L99
            boolean r1 = r7.d
            if (r1 != 0) goto L45
            au1 r1 = new au1
            r1.<init>(r4)
            r7.a = r3
            java.lang.Object r8 = r8.e(r7, r1)
            if (r8 != r0) goto L99
            goto L98
        L45:
            wb5 r1 = r8.e
            s08 r1 = (defpackage.s08) r1
            java.lang.Object r1 = r1.getValue()
            au1 r1 = (defpackage.au1) r1
            float r1 = r1.a
            androidx.compose.material3.b r3 = r7.e
            float r5 = r3.b
            boolean r5 = defpackage.au1.b(r1, r5)
            if (r5 == 0) goto L63
            rj6 r1 = new rj6
            r5 = 0
            r1.<init>(r5)
            goto L8e
        L63:
            float r5 = r3.d
            boolean r5 = defpackage.au1.b(r1, r5)
            if (r5 == 0) goto L71
            zc3 r1 = new zc3
            r1.<init>()
            goto L8e
        L71:
            float r5 = r3.c
            boolean r5 = defpackage.au1.b(r1, r5)
            if (r5 == 0) goto L7f
            gg2 r1 = new gg2
            r1.<init>()
            goto L8e
        L7f:
            float r3 = r3.e
            boolean r1 = defpackage.au1.b(r1, r3)
            if (r1 == 0) goto L8d
            wu1 r1 = new wu1
            r1.<init>()
            goto L8e
        L8d:
            r1 = 0
        L8e:
            r7.a = r2
            gr3 r2 = r7.f
            java.lang.Object r8 = defpackage.oz1.a(r8, r4, r1, r2, r7)
            if (r8 != r0) goto L99
        L98:
            return r0
        L99:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
