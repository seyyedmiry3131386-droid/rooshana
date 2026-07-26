package androidx.navigation3.ui;

import androidx.compose.animation.core.e;
import defpackage.e71;
import defpackage.ee7;
import defpackage.g51;
import defpackage.jr8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1", f = "NavDisplay.kt", l = {484, 504}, m = "invokeSuspend", v = 1)
final class NavDisplayKt__NavDisplayKt$NavDisplay$8$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public final /* synthetic */ ee7 d;
    public final /* synthetic */ jr8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDisplayKt__NavDisplayKt$NavDisplay$8$1(e eVar, ee7 ee7Var, jr8 jr8Var, g51 g51Var) {
        super(2, g51Var);
        this.c = eVar;
        this.d = ee7Var;
        this.e = jr8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        NavDisplayKt__NavDisplayKt$NavDisplay$8$1 navDisplayKt__NavDisplayKt$NavDisplay$8$1 = new NavDisplayKt__NavDisplayKt$NavDisplay$8$1(this.c, this.d, this.e, g51Var);
        navDisplayKt__NavDisplayKt$NavDisplay$8$1.b = obj;
        return navDisplayKt__NavDisplayKt$NavDisplay$8$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavDisplayKt__NavDisplayKt$NavDisplay$8$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (androidx.compose.animation.core.e.H(r1, r5, r12) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (androidx.compose.animation.core.f.d(r6, r7, r8, r9, r12, 4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L15:
            kotlin.b.b(r13)
            goto Lba
        L1a:
            kotlin.b.b(r13)
            java.lang.Object r13 = r12.b
            e71 r13 = (defpackage.e71) r13
            androidx.compose.animation.core.e r1 = r12.c
            wb5 r4 = r1.d
            s08 r4 = (defpackage.s08) r4
            java.lang.Object r4 = r4.getValue()
            ee7 r5 = r12.d
            boolean r4 = defpackage.js3.i(r4, r5)
            if (r4 != 0) goto L3d
            r12.a = r3
            java.lang.Object r13 = androidx.compose.animation.core.e.H(r1, r5, r12)
            if (r13 != r0) goto Lba
            goto Lb9
        L3d:
            jr8 r3 = r12.e
            ck1 r4 = r3.l
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r6 = r4.longValue()
            r4 = 1000000(0xf4240, float:1.401298E-39)
            long r8 = (long) r4
            long r6 = r6 / r8
            wb5 r3 = r3.d
            s08 r3 = (defpackage.s08) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = defpackage.js3.i(r3, r5)
            if (r3 == 0) goto L78
            java.lang.Float r3 = new java.lang.Float
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4)
            float r8 = r1.J()
            float r4 = r4 - r8
            float r6 = (float) r6
            float r4 = r4 * r6
            int r4 = (int) r4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r6)
            goto L8f
        L78:
            java.lang.Float r3 = new java.lang.Float
            r4 = 0
            r3.<init>(r4)
            float r4 = r1.J()
            float r6 = (float) r6
            float r4 = r4 * r6
            int r4 = (int) r4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r6)
        L8f:
            java.lang.Object r3 = r4.a
            java.lang.Number r3 = (java.lang.Number) r3
            float r7 = r3.floatValue()
            java.lang.Object r3 = r4.b
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r6 = r1.J()
            r4 = 0
            r8 = 6
            r9 = 0
            lt8 r8 = defpackage.y97.e0(r3, r4, r9, r8)
            androidx.navigation3.ui.b r9 = new androidx.navigation3.ui.b
            r9.<init>()
            r12.a = r2
            r11 = 4
            r10 = r12
            java.lang.Object r13 = androidx.compose.animation.core.f.d(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
