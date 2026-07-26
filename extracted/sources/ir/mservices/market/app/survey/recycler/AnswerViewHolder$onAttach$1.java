package ir.mservices.market.app.survey.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.survey.recycler.AnswerViewHolder$onAttach$1", f = "AnswerData.kt", l = {64}, m = "invokeSuspend", v = 1)
final class AnswerViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AnswerData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewHolder$onAttach$1(AnswerData answerData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = answerData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AnswerViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AnswerViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AnswerData answerData = this.b;
            v48 v48Var = answerData.b;
            nl nlVar = new nl(answerData, this.c, 0);
            this.a = 1;
            if (v48Var.a(nlVar, this) == coroutineSingletons) {
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
