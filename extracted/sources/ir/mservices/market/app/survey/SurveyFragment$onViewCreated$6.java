package ir.mservices.market.app.survey;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.rc8;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.survey.SurveyFragment$onViewCreated$6", f = "SurveyFragment.kt", l = {137}, m = "invokeSuspend", v = 1)
final class SurveyFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SurveyFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyFragment$onViewCreated$6(SurveyFragment surveyFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = surveyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SurveyFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SurveyFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
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
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = SurveyFragment.l1;
        SurveyFragment surveyFragment = this.b;
        pv6 pv6Var = surveyFragment.Q1().A;
        rc8 rc8Var = new rc8(surveyFragment, 4);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(rc8Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
