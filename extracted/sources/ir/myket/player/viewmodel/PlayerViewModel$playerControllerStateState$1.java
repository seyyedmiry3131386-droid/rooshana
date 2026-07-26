package ir.myket.player.viewmodel;

import defpackage.fp2;
import defpackage.iy6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wd6;
import ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$1$3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$playerControllerStateState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$playerControllerStateState$1 extends SuspendLambda implements fp2 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;
    public /* synthetic */ boolean f;
    public /* synthetic */ iy6 g;
    public /* synthetic */ androidx.media3.ui.compose.state.a h;
    public /* synthetic */ boolean i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;

    public PlayerViewModel$playerControllerStateState$1(FlowExtenstionsKt$combine$$inlined$combine$1$3 flowExtenstionsKt$combine$$inlined$combine$1$3) {
        super(12, flowExtenstionsKt$combine$$inlined$combine$1$3);
    }

    @Override // defpackage.fp2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, FlowExtenstionsKt$combine$$inlined$combine$1$3 flowExtenstionsKt$combine$$inlined$combine$1$3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue6 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue7 = ((Boolean) obj9).booleanValue();
        boolean zBooleanValue8 = ((Boolean) obj10).booleanValue();
        boolean zBooleanValue9 = ((Boolean) obj11).booleanValue();
        PlayerViewModel$playerControllerStateState$1 playerViewModel$playerControllerStateState$1 = new PlayerViewModel$playerControllerStateState$1(flowExtenstionsKt$combine$$inlined$combine$1$3);
        playerViewModel$playerControllerStateState$1.a = zBooleanValue;
        playerViewModel$playerControllerStateState$1.b = zBooleanValue2;
        playerViewModel$playerControllerStateState$1.c = zBooleanValue3;
        playerViewModel$playerControllerStateState$1.d = zBooleanValue4;
        playerViewModel$playerControllerStateState$1.e = zBooleanValue5;
        playerViewModel$playerControllerStateState$1.f = zBooleanValue6;
        playerViewModel$playerControllerStateState$1.g = (iy6) obj7;
        playerViewModel$playerControllerStateState$1.h = (androidx.media3.ui.compose.state.a) obj8;
        playerViewModel$playerControllerStateState$1.i = zBooleanValue7;
        playerViewModel$playerControllerStateState$1.j = zBooleanValue8;
        playerViewModel$playerControllerStateState$1.k = zBooleanValue9;
        return playerViewModel$playerControllerStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        iy6 iy6Var = this.g;
        androidx.media3.ui.compose.state.a aVar = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        boolean z9 = this.k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return new wd6(z, z2, z3, z4, z5 && z2 && iy6Var.b(), z6, iy6Var.c(), aVar, z7, z8, z9);
    }
}
