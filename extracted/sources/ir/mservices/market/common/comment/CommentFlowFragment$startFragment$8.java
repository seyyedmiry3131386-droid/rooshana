package ir.mservices.market.common.comment;

import defpackage.dp2;
import defpackage.g51;
import defpackage.kw0;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentFlowFragment$startFragment$8", f = "CommentFlowFragment.kt", l = {195}, m = "invokeSuspend", v = 1)
final class CommentFlowFragment$startFragment$8 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ CommentFlowFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFlowFragment$startFragment$8(CommentFlowFragment commentFlowFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = commentFlowFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CommentFlowFragment$startFragment$8(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((CommentFlowFragment$startFragment$8) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = CommentFlowFragment.P0;
            CommentFlowFragment commentFlowFragment = this.b;
            pv6 pv6Var = commentFlowFragment.G0().A;
            kw0 kw0Var = new kw0(commentFlowFragment, 6);
            this.a = 1;
            if (pv6Var.a.a(kw0Var, this) == coroutineSingletons) {
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
