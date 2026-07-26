package ir.myket.player.ui.client.controllers.common;

import defpackage.e71;
import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.controllers.common.PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1", f = "PlayerTapGesturesSurface.kt", l = {219, 220, 223, 229}, m = "invokeSuspend", v = 1)
final class PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1 extends SuspendLambda implements qp2 {
    public float a;
    public int b;
    public final /* synthetic */ androidx.compose.animation.core.a c;
    public final /* synthetic */ androidx.compose.animation.core.a d;
    public final /* synthetic */ wb5 e;
    public final /* synthetic */ nr5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1(androidx.compose.animation.core.a aVar, androidx.compose.animation.core.a aVar2, wb5 wb5Var, nr5 nr5Var, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = aVar2;
        this.e = wb5Var;
        this.f = nr5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1(this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if (androidx.compose.animation.core.a.b(r16.d, r1, r2, null, null, r16, 12) != r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.ui.client.controllers.common.PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$6$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
