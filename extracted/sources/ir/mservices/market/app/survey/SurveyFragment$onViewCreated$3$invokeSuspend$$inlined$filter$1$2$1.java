package ir.mservices.market.app.survey;

import defpackage.g51;
import defpackage.og6;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.survey.SurveyFragment$onViewCreated$3$invokeSuspend$$inlined$filter$1$2", f = "SurveyFragment.kt", l = {50}, m = "emit", v = 1)
public final class SurveyFragment$onViewCreated$3$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ og6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyFragment$onViewCreated$3$invokeSuspend$$inlined$filter$1$2$1(og6 og6Var, g51 g51Var) {
        super(g51Var);
        this.c = og6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
