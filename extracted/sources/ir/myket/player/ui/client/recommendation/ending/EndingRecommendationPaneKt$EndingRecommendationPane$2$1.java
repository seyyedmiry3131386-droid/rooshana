package ir.myket.player.ui.client.recommendation.ending;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.recommendation.ending.EndingRecommendationPaneKt$EndingRecommendationPane$2$1", f = "EndingRecommendationPane.kt", l = {54}, m = "invokeSuspend", v = 1)
final class EndingRecommendationPaneKt$EndingRecommendationPane$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ wb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndingRecommendationPaneKt$EndingRecommendationPane$2$1(wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new EndingRecommendationPaneKt$EndingRecommendationPane$2$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((EndingRecommendationPaneKt$EndingRecommendationPane$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        this.b.setValue(Boolean.TRUE);
        return tx8.a;
    }
}
