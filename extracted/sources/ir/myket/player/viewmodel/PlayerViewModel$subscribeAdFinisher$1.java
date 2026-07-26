package ir.myket.player.viewmodel;

import defpackage.b47;
import defpackage.g51;
import defpackage.gb6;
import defpackage.o80;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb6;
import defpackage.zl6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeAdFinisher$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeAdFinisher$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeAdFinisher$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.a = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerViewModel$subscribeAdFinisher$1(g51Var, this.a);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribeAdFinisher$1 playerViewModel$subscribeAdFinisher$1 = (PlayerViewModel$subscribeAdFinisher$1) create((vb6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeAdFinisher$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e eVar = this.a;
        long j = ((zl6) eVar.u.a.getValue()).a;
        eVar.o.add(new Integer(b47.v(j)));
        gb6 gb6Var = eVar.d;
        long j2 = j - 3000;
        if (j2 < 0) {
            j2 = 0;
        }
        ((o80) gb6Var).q0(5, j2);
        ((o80) gb6Var).K();
        return tx8.a;
    }
}
