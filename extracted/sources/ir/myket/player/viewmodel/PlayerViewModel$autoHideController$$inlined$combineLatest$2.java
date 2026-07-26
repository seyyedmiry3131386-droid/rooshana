package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.iy6;
import defpackage.o80;
import defpackage.qp2;
import defpackage.rr7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$2", f = "PlayerViewModel.kt", l = {150}, m = "invokeSuspend", v = 1)
public final class PlayerViewModel$autoHideController$$inlined$combineLatest$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public boolean d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$autoHideController$$inlined$combineLatest$2(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$autoHideController$$inlined$combineLatest$2 playerViewModel$autoHideController$$inlined$combineLatest$2 = new PlayerViewModel$autoHideController$$inlined$combineLatest$2(g51Var, this.c);
        playerViewModel$autoHideController$$inlined$combineLatest$2.b = obj;
        return playerViewModel$autoHideController$$inlined$combineLatest$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerViewModel$autoHideController$$inlined$combineLatest$2) create((rr7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        rr7 rr7Var = (rr7) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = rr7Var.a;
            Object obj3 = rr7Var.b;
            Object obj4 = rr7Var.c;
            Object obj5 = rr7Var.d;
            Object obj6 = rr7Var.e;
            boolean zBooleanValue = ((Boolean) rr7Var.f).booleanValue();
            iy6 iy6Var = (iy6) obj6;
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            ((Boolean) obj4).getClass();
            ((Number) obj3).longValue();
            boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
            if (zBooleanValue2 && !iy6Var.c()) {
                this.b = null;
                this.d = zBooleanValue;
                this.e = zBooleanValue3;
                this.a = 1;
                if (kotlinx.coroutines.a.e(6000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z = zBooleanValue;
                z2 = zBooleanValue3;
            }
            return tx8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z2 = this.e;
        z = this.d;
        kotlin.b.b(obj);
        if (z2) {
            e eVar = this.c;
            if (((o80) eVar.d).H() && !z) {
                eVar.e(new ub6(false));
            }
        }
        return tx8.a;
    }
}
