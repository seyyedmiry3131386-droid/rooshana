package ir.mservices.market.common.comment;

import defpackage.dp2;
import defpackage.g51;
import defpackage.kw0;
import defpackage.n4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentFlowFragment$startFragment$2", f = "CommentFlowFragment.kt", l = {98}, m = "invokeSuspend", v = 1)
final class CommentFlowFragment$startFragment$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ CommentFlowFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFlowFragment$startFragment$2(CommentFlowFragment commentFlowFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = commentFlowFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CommentFlowFragment$startFragment$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((CommentFlowFragment$startFragment$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i3 = CommentFlowFragment.P0;
        CommentFlowFragment commentFlowFragment = this.b;
        CommentViewModel commentViewModelH0 = commentFlowFragment.H0();
        String str = commentFlowFragment.G0().e;
        ir.mservices.market.common.model.a aVar = commentViewModelH0.c.g;
        vb7 vb7Var = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
        kw0 kw0Var = new kw0(commentFlowFragment, i2);
        this.a = 1;
        Object objA = vb7Var.a(new n4(kw0Var, 22), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
