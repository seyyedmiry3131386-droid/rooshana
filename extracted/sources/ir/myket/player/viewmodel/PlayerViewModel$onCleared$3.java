package ir.myket.player.viewmodel;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vk7;
import defpackage.ws0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$onCleared$3", f = "PlayerViewModel.kt", l = {978}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$onCleared$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onCleared$3(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerViewModel$onCleared$3(g51Var, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$onCleared$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        ws0 ws0Var = this.b.i;
        this.a = 1;
        ((vk7) ws0Var.g).a.a.clear();
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
