package ir.myket.player.provider.service;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sq4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.provider.service.MediaSessionController$startProgressUpdates$1", f = "MediaSessionController.kt", l = {88}, m = "invokeSuspend", v = 1)
final class MediaSessionController$startProgressUpdates$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sq4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSessionController$startProgressUpdates$1(sq4 sq4Var, g51 g51Var) {
        super(2, g51Var);
        this.c = sq4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MediaSessionController$startProgressUpdates$1 mediaSessionController$startProgressUpdates$1 = new MediaSessionController$startProgressUpdates$1(this.c, g51Var);
        mediaSessionController$startProgressUpdates$1.b = obj;
        return mediaSessionController$startProgressUpdates$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MediaSessionController$startProgressUpdates$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var = (e71) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        while (js3.C(e71Var)) {
            sq4 sq4Var = this.c;
            sq4Var.b();
            if (sq4Var.f.getValue() == null) {
                sq4Var.a();
            }
            this.b = e71Var;
            this.a = 1;
            if (kotlinx.coroutines.a.e(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
