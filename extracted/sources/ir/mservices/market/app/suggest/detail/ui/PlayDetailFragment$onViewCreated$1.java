package ir.mservices.market.app.suggest.detail.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.ja6;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment$onViewCreated$1", f = "PlayDetailFragment.kt", l = {136}, m = "invokeSuspend", v = 1)
final class PlayDetailFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PlayDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailFragment$onViewCreated$1(PlayDetailFragment playDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = playDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PlayDetailFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((PlayDetailFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = PlayDetailFragment.l1;
            PlayDetailFragment playDetailFragment = this.b;
            pv6 pv6Var = playDetailFragment.Q1().B;
            ja6 ja6Var = new ja6(playDetailFragment);
            this.a = 1;
            if (pv6Var.a.a(ja6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
