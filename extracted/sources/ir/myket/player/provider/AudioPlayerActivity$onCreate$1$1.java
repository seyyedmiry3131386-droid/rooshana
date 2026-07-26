package ir.myket.player.provider;

import defpackage.ce6;
import defpackage.de6;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.provider.AudioPlayerActivity$onCreate$1$1", f = "AudioPlayerActivity.kt", l = {63}, m = "invokeSuspend", v = 1)
final class AudioPlayerActivity$onCreate$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AudioPlayerActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerActivity$onCreate$1$1(AudioPlayerActivity audioPlayerActivity, g51 g51Var) {
        super(2, g51Var);
        this.b = audioPlayerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AudioPlayerActivity$onCreate$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioPlayerActivity$onCreate$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i == 0) {
            b.b(obj);
            de6 de6Var = (de6) this.b.G.getValue();
            this.a = 1;
            Object objEmit = de6Var.a.emit(ce6.a, this);
            if (objEmit != coroutineSingletons) {
                objEmit = tx8Var;
            }
            if (objEmit == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8Var;
    }
}
