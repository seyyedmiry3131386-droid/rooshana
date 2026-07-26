package ir.myket.player.viewmodel;

import defpackage.cy6;
import defpackage.dt3;
import defpackage.dy6;
import defpackage.et3;
import defpackage.ft3;
import defpackage.fy6;
import defpackage.g51;
import defpackage.gy6;
import defpackage.js3;
import defpackage.rb6;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub6;
import defpackage.ux6;
import defpackage.yx6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$recommendationViewStateState$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$recommendationViewStateState$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ boolean a;
    public /* synthetic */ yx6 b;
    public /* synthetic */ ux6 c;
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$recommendationViewStateState$1(g51 g51Var, e eVar) {
        super(4, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PlayerViewModel$recommendationViewStateState$1 playerViewModel$recommendationViewStateState$1 = new PlayerViewModel$recommendationViewStateState$1((g51) obj4, this.d);
        playerViewModel$recommendationViewStateState$1.a = zBooleanValue;
        playerViewModel$recommendationViewStateState$1.b = (yx6) obj2;
        playerViewModel$recommendationViewStateState$1.c = (ux6) obj3;
        return playerViewModel$recommendationViewStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        yx6 yx6Var = this.b;
        ux6 ux6Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        ft3 ft3Var = yx6Var.a;
        if ((ft3Var instanceof et3) || ux6Var == null) {
            return gy6.a;
        }
        js3.n(ft3Var, "null cannot be cast to non-null type ir.myket.player.domain.models.IsInRecommendationTimeState.InRecommendationTime");
        boolean z2 = ((dt3) ft3Var).a;
        e eVar = this.d;
        if (z2) {
            eVar.e(new ub6(true));
            eVar.e(new rb6(false));
            return new fy6(ux6Var);
        }
        if (!z) {
            return new cy6(ux6Var);
        }
        eVar.e(new ub6(false));
        return new dy6(ux6Var);
    }
}
