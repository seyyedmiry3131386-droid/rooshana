package ir.mservices.market.feedback;

import android.content.Context;
import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.qq4;
import defpackage.rs6;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$doRequest$1", f = "FeedbackViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class FeedbackViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ FeedbackViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$doRequest$1(FeedbackViewModel feedbackViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = feedbackViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FeedbackViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        FeedbackViewModel feedbackViewModel = this.a;
        qq4 qq4Var = feedbackViewModel.v;
        final l lVar = feedbackViewModel.M;
        final l lVar2 = feedbackViewModel.O;
        final l lVar3 = feedbackViewModel.N;
        final i iVar = feedbackViewModel.L;
        final l lVar4 = feedbackViewModel.Q;
        final l lVar5 = feedbackViewModel.K;
        final String string = ((Context) qq4Var.b).getString(rs6.feedback_spinner_value_payment);
        js3.o(string, "getString(...)");
        final l lVar6 = feedbackViewModel.F;
        final boolean z = feedbackViewModel.C;
        js3.p(lVar2, "topicFlow");
        js3.p(lVar, "bodyContentFlow");
        js3.p(lVar3, "phoneNumberFlow");
        js3.p(iVar, "removedScreenshotFlow");
        js3.p(lVar4, "feedbackUploadScreenshotFlow");
        js3.p(lVar5, "selectedTopic");
        js3.p(lVar6, "transactionData");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: w92
            @Override // defpackage.bp2
            public final Object invoke() {
                return new u92(lVar3, lVar2, lVar, iVar, lVar4, lVar5, string, lVar6, z);
            }
        }).a, new sl0(11)), y97.G(feedbackViewModel)), null, null, null, 14);
    }
}
