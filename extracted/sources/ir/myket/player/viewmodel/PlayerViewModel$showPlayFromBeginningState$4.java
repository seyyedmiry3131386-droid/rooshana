package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$showPlayFromBeginningState$4", f = "PlayerViewModel.kt", l = {377, 381, 382}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$showPlayFromBeginningState$4 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ boolean c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        PlayerViewModel$showPlayFromBeginningState$4 playerViewModel$showPlayFromBeginningState$4 = new PlayerViewModel$showPlayFromBeginningState$4(3, (g51) obj3);
        playerViewModel$showPlayFromBeginningState$4.b = (ze2) obj;
        playerViewModel$showPlayFromBeginningState$4.c = zBooleanValue;
        return playerViewModel$showPlayFromBeginningState$4.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r0.emit(r8, r7) != r2) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ze2 r0 = r7.b
            boolean r1 = r7.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r7.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            kotlin.b.b(r8)
            goto L5c
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.b.b(r8)
            goto L4c
        L23:
            kotlin.b.b(r8)
            goto L3b
        L27:
            kotlin.b.b(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7.b = r0
            r7.c = r1
            r7.a = r6
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r2) goto L3b
            goto L5b
        L3b:
            if (r1 == 0) goto L5c
            r7.b = r0
            r7.c = r1
            r7.a = r5
            r5 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r8 = kotlinx.coroutines.a.e(r5, r7)
            if (r8 != r2) goto L4c
            goto L5b
        L4c:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3 = 0
            r7.b = r3
            r7.c = r1
            r7.a = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r2) goto L5c
        L5b:
            return r2
        L5c:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.viewmodel.PlayerViewModel$showPlayFromBeginningState$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
