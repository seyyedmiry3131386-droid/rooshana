package ir.mservices.market.app.survey;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.survey.SurveyViewModel$lastQuestionFlow$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SurveyViewModel$lastQuestionFlow$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public final /* synthetic */ SurveyViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyViewModel$lastQuestionFlow$1(SurveyViewModel surveyViewModel, g51 g51Var) {
        super(3, g51Var);
        this.c = surveyViewModel;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        SurveyViewModel$lastQuestionFlow$1 surveyViewModel$lastQuestionFlow$1 = new SurveyViewModel$lastQuestionFlow$1(this.c, (g51) obj3);
        surveyViewModel$lastQuestionFlow$1.a = iIntValue;
        surveyViewModel$lastQuestionFlow$1.b = iIntValue2;
        return surveyViewModel$lastQuestionFlow$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return Boolean.valueOf(i == this.c.w.a.getQuestions().size() - 1 && i2 == -1);
    }
}
