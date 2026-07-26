package ir.myket.player.viewmodel;

import defpackage.fs2;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$transform$1", f = "PlayerViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$special$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rv6 c;
    public final /* synthetic */ fs2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$transform$1(rv6 rv6Var, g51 g51Var, fs2 fs2Var) {
        super(2, g51Var);
        this.c = rv6Var;
        this.d = fs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$special$$inlined$transform$1 playerViewModel$special$$inlined$transform$1 = new PlayerViewModel$special$$inlined$transform$1(this.c, g51Var, this.d);
        playerViewModel$special$$inlined$transform$1.b = obj;
        return playerViewModel$special$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$special$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            nl nlVar = new nl((ze2) this.b, this.d, 26);
            this.b = null;
            this.a = 1;
            if (this.c.a.a(nlVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
