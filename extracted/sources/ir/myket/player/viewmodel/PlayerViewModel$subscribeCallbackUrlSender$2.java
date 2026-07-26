package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.ql0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.callback.domain.models.CallbackUrlType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeCallbackUrlSender$2", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeCallbackUrlSender$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeCallbackUrlSender$2(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$subscribeCallbackUrlSender$2 playerViewModel$subscribeCallbackUrlSender$2 = new PlayerViewModel$subscribeCallbackUrlSender$2(g51Var, this.b);
        playerViewModel$subscribeCallbackUrlSender$2.a = obj;
        return playerViewModel$subscribeCallbackUrlSender$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribeCallbackUrlSender$2 playerViewModel$subscribeCallbackUrlSender$2 = (PlayerViewModel$subscribeCallbackUrlSender$2) create((String) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeCallbackUrlSender$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.b.l.b(new ql0(str, CallbackUrlType.a, 0));
        return tx8.a;
    }
}
