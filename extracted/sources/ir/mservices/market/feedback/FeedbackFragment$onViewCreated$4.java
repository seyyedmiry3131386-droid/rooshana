package ir.mservices.market.feedback;

import defpackage.dp2;
import defpackage.g51;
import defpackage.n99;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.uploadImage.UploadImageViewModel;
import ir.mservices.market.feedback.FeedbackAction;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackFragment$onViewCreated$4", f = "FeedbackFragment.kt", l = {ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR}, m = "invokeSuspend", v = 1)
final class FeedbackFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ FeedbackFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.feedback.FeedbackFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.feedback.FeedbackFragment$onViewCreated$4$1", f = "FeedbackFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ FeedbackFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedbackFragment feedbackFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = feedbackFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = FeedbackFragment.r1;
            this.b.R1().r(new FeedbackAction.SelectImageAction(n99Var));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$onViewCreated$4(FeedbackFragment feedbackFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = feedbackFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FeedbackFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((FeedbackFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = FeedbackFragment.r1;
            FeedbackFragment feedbackFragment = this.b;
            rv6 rv6Var = ((UploadImageViewModel) feedbackFragment.j1.getValue()).y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(feedbackFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
