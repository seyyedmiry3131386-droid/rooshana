package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.hc6;
import defpackage.js3;
import defpackage.ml9;
import defpackage.rp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uo6;
import defpackage.xc6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeQualityTrackSelector$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeQualityTrackSelector$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ hc6 a;
    public /* synthetic */ xc6 b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeQualityTrackSelector$1(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.c = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$subscribeQualityTrackSelector$1 playerViewModel$subscribeQualityTrackSelector$1 = new PlayerViewModel$subscribeQualityTrackSelector$1((g51) obj3, this.c);
        playerViewModel$subscribeQualityTrackSelector$1.a = (hc6) obj;
        playerViewModel$subscribeQualityTrackSelector$1.b = (xc6) obj2;
        return playerViewModel$subscribeQualityTrackSelector$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hc6 hc6Var = this.a;
        xc6 xc6Var = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.c;
        uo6 uo6VarW = ml9.w(eVar.d, xc6Var, hc6Var.a);
        xc6 xc6Var2 = (xc6) eVar.B.a.getValue();
        xc6Var2.getClass();
        js3.p(uo6VarW, "<set-?>");
        ((s08) xc6Var2.e).setValue(uo6VarW);
        return uo6VarW;
    }
}
