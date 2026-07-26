package ir.myket.player.viewmodel;

import android.content.Context;
import defpackage.au7;
import defpackage.bp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.jb6;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.domain.models.ShareModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.PlayerViewModel$subscribeShareInvoker$1", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerViewModel$subscribeShareInvoker$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$subscribeShareInvoker$1(g51 g51Var, e eVar) {
        super(2, g51Var);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlayerViewModel$subscribeShareInvoker$1 playerViewModel$subscribeShareInvoker$1 = new PlayerViewModel$subscribeShareInvoker$1(g51Var, this.b);
        playerViewModel$subscribeShareInvoker$1.a = obj;
        return playerViewModel$subscribeShareInvoker$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerViewModel$subscribeShareInvoker$1 playerViewModel$subscribeShareInvoker$1 = (PlayerViewModel$subscribeShareInvoker$1) create((jb6) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerViewModel$subscribeShareInvoker$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jb6 jb6Var = (jb6) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        ShareModel shareModel = ((PlayerMovieData) this.b.p.getValue()).d.f;
        if (shareModel != null) {
            Context context = jb6Var.a;
            bp2 bp2Var = jb6Var.b;
            js3.p(context, "context");
            if (f88.n0(shareModel.a)) {
                shareModel = null;
            }
            if (shareModel != null) {
                au7.a(context, shareModel.b + "\n" + shareModel.a, bp2Var);
            }
        }
        return tx8.a;
    }
}
