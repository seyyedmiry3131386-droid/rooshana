package ir.myket.player.viewmodel;

import defpackage.e62;
import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.js3;
import defpackage.o80;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$startProgressUpdates$1", f = "PlayerViewModel.kt", l = {1003}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$startProgressUpdates$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$startProgressUpdates$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$startProgressUpdates$1 playerViewModel$startProgressUpdates$1 = new PlayerViewModel$startProgressUpdates$1(g51Var, this.c);
        playerViewModel$startProgressUpdates$1.b = obj;
        return playerViewModel$startProgressUpdates$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$startProgressUpdates$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar = this.c;
        l lVar = eVar.r;
        gb6 gb6Var = eVar.d;
        e71 e71Var = (e71) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        while (js3.C(e71Var)) {
            if (((o80) gb6Var).H() || ((Number) lVar.getValue()).longValue() != ((e62) gb6Var).d0()) {
                Long l = new Long(((e62) gb6Var).d0());
                lVar.getClass();
                lVar.p(null, l);
            }
            l lVar2 = eVar.s;
            Long l2 = new Long(((e62) gb6Var).C0());
            lVar2.getClass();
            lVar2.p(null, l2);
            this.b = e71Var;
            this.a = 1;
            if (kotlinx.coroutines.a.e(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
