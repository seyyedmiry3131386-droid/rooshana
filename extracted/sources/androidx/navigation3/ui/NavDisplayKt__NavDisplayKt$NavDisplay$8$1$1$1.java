package androidx.navigation3.ui;

import androidx.compose.animation.core.e;
import defpackage.e71;
import defpackage.ee7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1", f = "NavDisplay.kt", l = {512, 516}, m = "invokeSuspend", v = 1)
final class NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ e d;
    public final /* synthetic */ ee7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1(float f, float f2, e eVar, ee7 ee7Var, g51 g51Var) {
        super(2, g51Var);
        this.b = f;
        this.c = f2;
        this.d = eVar;
        this.e = ee7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r2.O(r7, r7.e) == r0) goto L20;
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
            androidx.compose.animation.core.e r2 = r7.d
            float r3 = r7.c
            float r4 = r7.b
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            kotlin.b.b(r8)
            goto L4a
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.b.b(r8)
            goto L3b
        L22:
            kotlin.b.b(r8)
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 != 0) goto L2a
            goto L3b
        L2a:
            r7.a = r6
            wb5 r8 = r2.c
            s08 r8 = (defpackage.s08) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Object r8 = r2.L(r4, r8, r7)
            if (r8 != r0) goto L3b
            goto L49
        L3b:
            int r8 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r8 != 0) goto L4a
            r7.a = r5
            ee7 r8 = r7.e
            java.lang.Object r8 = r2.O(r7, r8)
            if (r8 != r0) goto L4a
        L49:
            return r0
        L4a:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
