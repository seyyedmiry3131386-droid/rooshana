package ir.mservices.market.feedback;

import defpackage.ca2;
import defpackage.f88;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$viewIsDirty$1", f = "FeedbackViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class FeedbackViewModel$viewIsDirty$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ ca2 a;
    public /* synthetic */ boolean b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        FeedbackViewModel$viewIsDirty$1 feedbackViewModel$viewIsDirty$1 = new FeedbackViewModel$viewIsDirty$1(3, (g51) obj3);
        feedbackViewModel$viewIsDirty$1.a = (ca2) obj;
        feedbackViewModel$viewIsDirty$1.b = zBooleanValue;
        return feedbackViewModel$viewIsDirty$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ca2 ca2Var = this.a;
        boolean z = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        CharSequence charSequence = (CharSequence) ca2Var.a;
        return Boolean.valueOf((!(charSequence == null || f88.n0(charSequence))) | z);
    }
}
