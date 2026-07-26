package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.e71;
import defpackage.fu7;
import defpackage.g51;
import defpackage.ha6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.recycler.PlayAppSuggestViewHolder$onAttach$1", f = "PlayAppSuggest.kt", l = {104}, m = "invokeSuspend", v = 1)
final class PlayAppSuggestViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PlayAppSuggestData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayAppSuggestViewHolder$onAttach$1(PlayAppSuggestData playAppSuggestData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = playAppSuggestData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayAppSuggestViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PlayAppSuggestViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            fu7 fu7Var = this.b.e;
            ha6 ha6Var = new ha6(this.c, 0);
            this.a = 1;
            if (fu7Var.a(ha6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
