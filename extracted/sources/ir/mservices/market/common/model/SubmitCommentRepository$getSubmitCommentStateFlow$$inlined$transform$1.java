package ir.mservices.market.common.model;

import defpackage.e9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1", f = "SubmitCommentRepository.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(xe2 xe2Var, g51 g51Var, String str, a aVar) {
        super(2, g51Var);
        this.c = xe2Var;
        this.d = str;
        this.e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1 submitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1 = new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(this.c, g51Var, this.d, this.e);
        submitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1.b = obj;
        return submitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            e9 e9Var = new e9((ze2) this.b, this.d, this.e, 9);
            this.b = null;
            this.a = 1;
            if (this.c.a(e9Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
