package ir.mservices.market.app.detail.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$cancelSurveyFlow$1", f = "AppDetailViewModel.kt", l = {1183}, m = "invokeSuspend", v = 1)
final class AppDetailViewModel$cancelSurveyFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppDetailViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel$cancelSurveyFlow$1(AppDetailViewModel appDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = appDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailViewModel$cancelSurveyFlow$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailViewModel$cancelSurveyFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (this.b.cancelQuestion(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
