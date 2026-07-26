package ir.myket.player.ui.client.state;

import defpackage.js3;
import defpackage.ub5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final ub5 a;

    public a(ub5 ub5Var) {
        js3.p(ub5Var, "actionFlow");
        this.a = ub5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.dp2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ir.myket.player.ui.client.state.PlayerActionFlow$collectAction$1
            if (r0 == 0) goto L13
            r0 = r7
            ir.myket.player.ui.client.state.PlayerActionFlow$collectAction$1 r0 = (ir.myket.player.ui.client.state.PlayerActionFlow$collectAction$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.myket.player.ui.client.state.PlayerActionFlow$collectAction$1 r0 = new ir.myket.player.ui.client.state.PlayerActionFlow$collectAction$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.b.b(r7)
            goto L44
        L2f:
            kotlin.b.b(r7)
            nl r7 = new nl
            r2 = 25
            ub5 r4 = r5.a
            r7.<init>(r6, r4, r2)
            r0.c = r3
            java.lang.Object r6 = r4.a(r7, r0)
            if (r6 != r1) goto L44
            return
        L44:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.ui.client.state.a.a(dp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
