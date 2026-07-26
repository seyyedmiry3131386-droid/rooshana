package ir.myket.player.ui.client.controllers.common;

import androidx.compose.ui.input.pointer.e;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.controllers.common.PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1", f = "PlayerProgressBar.kt", l = {160, 166}, m = "invokeSuspend", v = 1)
final class PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dp2 d;
    public final /* synthetic */ Ref$LongRef e;
    public final /* synthetic */ wb5 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1(dp2 dp2Var, Ref$LongRef ref$LongRef, wb5 wb5Var, long j, g51 g51Var) {
        super(2, g51Var);
        this.d = dp2Var;
        this.e = ref$LongRef;
        this.f = wb5Var;
        this.g = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1 playerProgressBarKt$PlayerProgressBar$2$1$2$1$1 = new PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1(this.d, this.e, this.f, this.g, g51Var);
        playerProgressBarKt$PlayerProgressBar$2$1$2$1$1.c = obj;
        return playerProgressBarKt$PlayerProgressBar$2$1$2$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r11 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            androidx.compose.ui.input.pointer.e r0 = (androidx.compose.ui.input.pointer.e) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r10.b
            r3 = 2
            r4 = 0
            dp2 r5 = r10.d
            r6 = 1
            wb5 r7 = r10.f
            if (r2 == 0) goto L25
            if (r2 == r6) goto L21
            if (r2 != r3) goto L19
            kotlin.b.b(r11)
            goto L76
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            kotlin.b.b(r11)
            goto L34
        L25:
            kotlin.b.b(r11)
            r10.c = r0
            r10.b = r6
            r11 = 3
            java.lang.Object r11 = androidx.compose.foundation.gestures.p.c(r0, r10, r11)
            if (r11 != r1) goto L34
            goto L75
        L34:
            ah6 r11 = (defpackage.ah6) r11
            r11.a()
            tb6 r2 = new tb6
            r2.<init>(r6)
            r5.invoke(r2)
            long r8 = r11.c
            r2 = 32
            long r8 = r8 >> r2
            int r6 = (int) r8
            float r6 = java.lang.Float.intBitsToFloat(r6)
            androidx.compose.ui.input.pointer.f r8 = r0.f
            long r8 = r8.x
            long r8 = r8 >> r2
            int r2 = (int) r8
            float r2 = (float) r2
            float r6 = r6 / r2
            r2 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            float r2 = defpackage.ok4.s(r6, r2, r8)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r2)
            r7.setValue(r6)
            long r8 = r11.a
            v25 r11 = new v25
            r2 = 11
            r11.<init>(r0, r7, r2)
            r10.c = r4
            r10.b = r3
            java.lang.Object r11 = androidx.compose.foundation.gestures.d.f(r0, r8, r11, r10)
            if (r11 != r1) goto L76
        L75:
            return r1
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La7
            java.lang.Object r11 = r7.getValue()
            java.lang.Float r11 = (java.lang.Float) r11
            if (r11 == 0) goto L90
            float r11 = r11.floatValue()
            long r0 = r10.g
            float r0 = (float) r0
            float r11 = r11 * r0
            long r0 = (long) r11
            goto L92
        L90:
            r0 = 0
        L92:
            kotlin.jvm.internal.Ref$LongRef r11 = r10.e
            r11.a = r0
            cc6 r11 = new cc6
            r11.<init>(r0)
            r5.invoke(r11)
            tb6 r11 = new tb6
            r0 = 0
            r11.<init>(r0)
            r5.invoke(r11)
        La7:
            r7.setValue(r4)
            tx8 r11 = defpackage.tx8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.ui.client.controllers.common.PlayerProgressBarKt$PlayerProgressBar$2$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
