package ir.mservices.market.myReview.complete;

import defpackage.br9;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vz5;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.complete.data.CompleteReviewDto;
import ir.mservices.market.myReview.complete.recycler.CompleteReview;
import ir.mservices.market.version2.core.utils.a;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$onViewCreated$1", f = "CompleteReviewRecyclerListFragment.kt", l = {95}, m = "invokeSuspend", v = 1)
final class CompleteReviewRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ CompleteReviewRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$onViewCreated$1$1", f = "CompleteReviewRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ CompleteReviewRecyclerListFragment b;

        /* JADX INFO: renamed from: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$onViewCreated$1$1$1", f = "CompleteReviewRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00231 extends SuspendLambda implements dp2 {
            public final /* synthetic */ CompleteReviewRecyclerListFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment, g51 g51Var) {
                super(1, g51Var);
                this.a = completeReviewRecyclerListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(g51 g51Var) {
                return new C00231(this.a, g51Var);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                C00231 c00231 = (C00231) create((g51) obj);
                tx8 tx8Var = tx8.a;
                c00231.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                this.a.N1(0);
                return tx8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = completeReviewRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = CompleteReviewRecyclerListFragment.l1;
            CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = this.b;
            CompleteReviewViewModel completeReviewViewModel = (CompleteReviewViewModel) completeReviewRecyclerListFragment.i1.getValue();
            InCompleteReviewDto inCompleteReviewDto = (InCompleteReviewDto) pair.a;
            ReviewDto reviewDto = (ReviewDto) pair.b;
            js3.p(inCompleteReviewDto, "data");
            js3.p(reviewDto, "reviewDTO");
            CompleteReviewDto completeReviewDto = new CompleteReviewDto(inCompleteReviewDto.getPackageName(), inCompleteReviewDto.getTitle(), inCompleteReviewDto.getCategoryName(), inCompleteReviewDto.getTotalRating(), inCompleteReviewDto.getDownloadSummaryDTO(), inCompleteReviewDto.getIconPath(), "", reviewDto.getRate(), reviewDto.getComment(), true);
            if (completeReviewDto.getPackageName() != null) {
                completeReviewViewModel.g(new vz5(br9.B(new RecyclerItem(new CompleteReview(completeReviewDto, new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(completeReviewViewModel.u.g.f, null, completeReviewDto.getPackageName())))))));
            }
            a.c(completeReviewRecyclerListFragment, 300L, new C00231(completeReviewRecyclerListFragment, null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteReviewRecyclerListFragment$onViewCreated$1(CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = completeReviewRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CompleteReviewRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CompleteReviewRecyclerListFragment$onViewCreated$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = this.b;
            o4 o4Var = new o4(((MyReviewsContentViewModel) completeReviewRecyclerListFragment.j1.getValue()).y, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(completeReviewRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
