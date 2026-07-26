package ir.mservices.market.common.comment;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.z98;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.SubmitCommentFragment$onViewCreated$9", f = "SubmitCommentFragment.kt", l = {190}, m = "invokeSuspend", v = 1)
final class SubmitCommentFragment$onViewCreated$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SubmitCommentFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCommentFragment$onViewCreated$9(SubmitCommentFragment submitCommentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = submitCommentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SubmitCommentFragment$onViewCreated$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SubmitCommentFragment$onViewCreated$9) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        int i2 = SubmitCommentFragment.e1;
        SubmitCommentFragment submitCommentFragment = this.b;
        CommentViewModel commentViewModel = (CommentViewModel) submitCommentFragment.X0.getValue();
        String str = submitCommentFragment.k1().a;
        ir.mservices.market.common.model.a aVar = commentViewModel.c.g;
        vb7 vb7Var = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
        z98 z98Var = new z98(submitCommentFragment);
        this.a = 1;
        Object objA = vb7Var.a(new pt1(z98Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
