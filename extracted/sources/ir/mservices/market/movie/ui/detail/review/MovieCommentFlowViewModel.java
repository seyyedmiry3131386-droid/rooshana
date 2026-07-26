package ir.mservices.market.movie.ui.detail.review;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pi0;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sz1;
import defpackage.t47;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.movie.ui.detail.review.ReviewAction;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import ir.mservices.market.movie.ui.detail.review.data.MovieLoginData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCommentFlowViewModel extends ir.mservices.market.viewModel.a {
    public final t47 A;
    public final l B;
    public final rv6 C;
    public final i D;
    public final pv6 E;
    public final i F;
    public final pv6 G;
    public final i H;
    public final pv6 I;
    public final i J;
    public final pv6 K;
    public final i L;
    public final pv6 M;
    public final i N;
    public final pv6 O;
    public final c5 v;
    public final ir.mservices.market.movie.ui.detail.review.model.a w;
    public final pi0 x;
    public final ir.mservices.market.movie.ui.detail.review.useCases.a y;
    public final ir.mservices.market.movie.ui.detail.review.useCases.a z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel$1", f = "MovieCommentFlowViewModel.kt", l = {236}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieCommentFlowViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
            MovieCommentFlowViewModel movieCommentFlowViewModel = MovieCommentFlowViewModel.this;
            pv6 pv6Var = movieCommentFlowViewModel.u;
            bj2 bj2Var = new bj2(8, movieCommentFlowViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 9), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel$reportReviewAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel", f = "MovieCommentFlowViewModel.kt", l = {182, 191, 193}, m = "reportReviewAction", v = 1)
    public static final class C01961 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C01961(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MovieCommentFlowViewModel.this.reportReviewAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel$sendLikeOrDislikeAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel", f = "MovieCommentFlowViewModel.kt", l = {106, 125, 127, 131}, m = "sendLikeOrDislikeAction", v = 1)
    public static final class C01971 extends ContinuationImpl {
        public LikeOrDislikeData a;
        public Object b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public C01971(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return MovieCommentFlowViewModel.this.sendLikeOrDislikeAction(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieCommentFlowViewModel(c5 c5Var, ir.mservices.market.movie.ui.detail.review.model.a aVar, pi0 pi0Var, ir.mservices.market.movie.ui.detail.review.useCases.a aVar2, ir.mservices.market.movie.ui.detail.review.useCases.a aVar3, t47 t47Var) {
        super(false);
        js3.p(c5Var, "accountManager");
        js3.p(aVar, "movieReviewManager");
        js3.p(pi0Var, "buzzManager");
        this.v = c5Var;
        this.w = aVar;
        this.x = pi0Var;
        this.y = aVar2;
        this.z = aVar3;
        this.A = t47Var;
        l lVarB = ja1.b(null);
        this.B = lVarB;
        this.C = new rv6(lVarB);
        i iVarE = vy2.e(0, 7, null);
        this.D = iVarE;
        this.E = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.F = iVarE2;
        this.G = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.H = iVarE3;
        this.I = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.J = iVarE4;
        this.K = new pv6(iVarE4);
        i iVarE5 = vy2.e(0, 7, null);
        this.L = iVarE5;
        this.M = new pv6(iVarE5);
        i iVarE6 = vy2.e(0, 7, null);
        this.N = iVarE6;
        this.O = new pv6(iVarE6);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelReportReviewAction(ReviewAction.CancelReportReviewAction cancelReportReviewAction) {
        h().a("REQUEST_TAG_REPORT_COMMENT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitLikeDislikeEventAction(ReviewAction.EmitLikeOrDislikeEventAction emitLikeOrDislikeEventAction, g51<? super tx8> g51Var) {
        Object value = this.C.a.getValue();
        ReviewAction.SendLikeOrDislikeAction sendLikeOrDislikeAction = value instanceof ReviewAction.SendLikeOrDislikeAction ? (ReviewAction.SendLikeOrDislikeAction) value : null;
        if (sendLikeOrDislikeAction != null) {
            Object objO0 = this.z.o0(new sz1(sendLikeOrDislikeAction.getValue()), g51Var);
            if (objO0 == CoroutineSingletons.a) {
                return objO0;
            }
        }
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openReportReviewAction(ReviewAction.OpenReportReviewAction openReportReviewAction, g51<? super tx8> g51Var) throws Throwable {
        this.B.o(openReportReviewAction);
        if (this.v.d()) {
            Object objEmit = this.F.emit(openReportReviewAction.getValue(), g51Var);
            if (objEmit == CoroutineSingletons.a) {
                return objEmit;
            }
        } else {
            Object objShowLoginDialog = showLoginDialog(openReportReviewAction, g51Var);
            if (objShowLoginDialog == CoroutineSingletons.a) {
                return objShowLoginDialog;
            }
        }
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object openSubmitReviewAction(ReviewAction.SubmitMovieReviewAction submitMovieReviewAction, g51<? super tx8> g51Var) throws Throwable {
        this.B.o(submitMovieReviewAction);
        c5 c5Var = this.v;
        if (!c5Var.d()) {
            Object objShowLoginDialog = showLoginDialog(submitMovieReviewAction, g51Var);
            if (objShowLoginDialog == CoroutineSingletons.a) {
                return objShowLoginDialog;
            }
        } else if (c5Var.f()) {
            Object objA = this.w.a(submitMovieReviewAction.getValue(), g51Var);
            if (objA == CoroutineSingletons.a) {
                return objA;
            }
        } else {
            Object objEmit = this.D.emit(submitMovieReviewAction.getValue(), g51Var);
            if (objEmit == CoroutineSingletons.a) {
                return objEmit;
            }
        }
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object reportReviewAction(ir.mservices.market.movie.ui.detail.review.ReviewAction.ReportReviewAction r14, defpackage.g51<? super defpackage.tx8> r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel.reportReviewAction(ir.mservices.market.movie.ui.detail.review.ReviewAction$ReportReviewAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runPreviousAction(ReviewAction.RunPreviousAction runPreviousAction) {
        ReviewAction reviewAction = (ReviewAction) this.C.a.getValue();
        if (reviewAction != null) {
            r(reviewAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendLikeOrDislikeAction(ir.mservices.market.movie.ui.detail.review.ReviewAction.SendLikeOrDislikeAction r23, defpackage.g51<? super defpackage.tx8> r24) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel.sendLikeOrDislikeAction(ir.mservices.market.movie.ui.detail.review.ReviewAction$SendLikeOrDislikeAction, g51):java.lang.Object");
    }

    private final Object showLoginDialog(ReviewAction reviewAction, g51<? super tx8> g51Var) throws Throwable {
        boolean z = reviewAction instanceof ReviewAction.SubmitMovieReviewAction;
        i iVar = this.H;
        if (z) {
            Object objEmit = iVar.emit(new MovieLoginData(((ReviewAction.SubmitMovieReviewAction) reviewAction).getLoginDialogKey(), rs6.bind_message_movie_comment_phone, rs6.login_label_movie_review), g51Var);
            if (objEmit == CoroutineSingletons.a) {
                return objEmit;
            }
        } else if (reviewAction instanceof ReviewAction.SendLikeOrDislikeAction) {
            Object objEmit2 = iVar.emit(new MovieLoginData(((ReviewAction.SendLikeOrDislikeAction) reviewAction).getLoginDialogKey(), rs6.bind_message_like, rs6.login_label_movie_review_like), g51Var);
            if (objEmit2 == CoroutineSingletons.a) {
                return objEmit2;
            }
        } else if (reviewAction instanceof ReviewAction.OpenReportReviewAction) {
            Object objEmit3 = iVar.emit(new MovieLoginData(((ReviewAction.OpenReportReviewAction) reviewAction).getLoginDialogKey(), rs6.bind_message_report, rs6.login_label_movie_review_report), g51Var);
            if (objEmit3 == CoroutineSingletons.a) {
                return objEmit3;
            }
        }
        return tx8.a;
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        cancelReportReviewAction(ReviewAction.CancelReportReviewAction.INSTANCE);
    }
}
