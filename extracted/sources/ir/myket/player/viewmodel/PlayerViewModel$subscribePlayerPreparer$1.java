package ir.myket.player.viewmodel;

import defpackage.e62;
import defpackage.g51;
import defpackage.nb6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribePlayerPreparer$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribePlayerPreparer$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribePlayerPreparer$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.a = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerViewModel$subscribePlayerPreparer$1(g51Var, this.a);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribePlayerPreparer$1 playerViewModel$subscribePlayerPreparer$1 = (PlayerViewModel$subscribePlayerPreparer$1) create((xb6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribePlayerPreparer$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        nb6 nb6Var = new nb6(false);
        e eVar = this.a;
        eVar.e(nb6Var);
        ((e62) eVar.d).c();
        return tx8.a;
    }
}
