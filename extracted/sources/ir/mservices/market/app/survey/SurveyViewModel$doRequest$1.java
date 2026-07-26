package ir.mservices.market.app.survey;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.f8;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.lc8;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.survey.data.QuestionDto;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.survey.SurveyViewModel$doRequest$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SurveyViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ SurveyViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyViewModel$doRequest$1(SurveyViewModel surveyViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = surveyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SurveyViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SurveyViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        SurveyViewModel surveyViewModel = this.a;
        rn6 rn6Var = surveyViewModel.v;
        List<QuestionDto> questions = surveyViewModel.w.a.getQuestions();
        l lVar = surveyViewModel.D;
        l lVar2 = surveyViewModel.x;
        rn6Var.getClass();
        js3.p(lVar, "questionNumberFlow");
        js3.p(lVar2, "selectedAnswerFlow");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new f8(questions, lVar, lVar2, 22)).a, new lc8(1)), y97.G(surveyViewModel)), null, null, null, 14);
    }
}
