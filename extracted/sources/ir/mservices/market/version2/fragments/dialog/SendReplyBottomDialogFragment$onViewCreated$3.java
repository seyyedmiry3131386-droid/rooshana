package ir.mservices.market.version2.fragments.dialog;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xk6;
import ir.mservices.market.common.comment.CommentViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment$onViewCreated$3", f = "SendReplyBottomDialogFragment.kt", l = {127}, m = "invokeSuspend", v = 1)
final class SendReplyBottomDialogFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SendReplyBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendReplyBottomDialogFragment$onViewCreated$3(SendReplyBottomDialogFragment sendReplyBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = sendReplyBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SendReplyBottomDialogFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((SendReplyBottomDialogFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            SendReplyBottomDialogFragment sendReplyBottomDialogFragment = this.b;
            pv6 pv6Var = ((CommentViewModel) sendReplyBottomDialogFragment.j1.getValue()).p;
            xk6 xk6Var = new xk6(13, sendReplyBottomDialogFragment);
            this.a = 1;
            if (pv6Var.a.a(xk6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
