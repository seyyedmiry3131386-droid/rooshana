package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.mg6;
import defpackage.o4;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$special$$inlined$flatMapLatest$2", f = "PlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$special$$inlined$flatMapLatest$2(g51 g51Var, e eVar) {
        super(3, g51Var);
        this.d = eVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PlayerViewModel$special$$inlined$flatMapLatest$2 playerViewModel$special$$inlined$flatMapLatest$2 = new PlayerViewModel$special$$inlined$flatMapLatest$2((g51) obj3, this.d);
        playerViewModel$special$$inlined$flatMapLatest$2.b = (ze2) obj;
        playerViewModel$special$$inlined$flatMapLatest$2.c = obj2;
        return playerViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        ze2 ze2Var = this.b;
        e eVar = this.d;
        o4 o4Var = new o4(new o4(eVar.v, 23), 8);
        this.b = null;
        this.c = null;
        this.a = 1;
        kotlinx.coroutines.flow.d.o(ze2Var);
        Object objA = o4Var.a(new mg6(ze2Var, eVar, 0), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
