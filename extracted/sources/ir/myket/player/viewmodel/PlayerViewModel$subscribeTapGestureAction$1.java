package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.iy6;
import defpackage.oc6;
import defpackage.qb6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub6;
import defpackage.wd6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeTapGestureAction$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeTapGestureAction$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeTapGestureAction$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$subscribeTapGestureAction$1 playerViewModel$subscribeTapGestureAction$1 = new PlayerViewModel$subscribeTapGestureAction$1(g51Var, this.b);
        playerViewModel$subscribeTapGestureAction$1.a = obj;
        return playerViewModel$subscribeTapGestureAction$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribeTapGestureAction$1 playerViewModel$subscribeTapGestureAction$1 = (PlayerViewModel$subscribeTapGestureAction$1) create((qb6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeTapGestureAction$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qb6 qb6Var = (qb6) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.b;
        if (((iy6) eVar.z.a.getValue()).a()) {
            eVar.e(new oc6(false));
        } else if (!qb6Var.a) {
            eVar.e(new ub6(!((wd6) eVar.A.a.getValue()).a));
        }
        return tx8.a;
    }
}
