package ir.mservices.market.movie.ui.detail.review.all;

import android.os.Parcelable;
import defpackage.a65;
import defpackage.bj2;
import defpackage.bt2;
import defpackage.c5;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g25;
import defpackage.g51;
import defpackage.g8;
import defpackage.gr5;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n99;
import defpackage.o4;
import defpackage.p05;
import defpackage.pi0;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v55;
import defpackage.vo4;
import defpackage.vy2;
import defpackage.w55;
import defpackage.wz5;
import defpackage.y97;
import ir.mservices.market.appDetail.MovieToolbarData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewAction;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewsViewModel extends ir.mservices.market.viewModel.a {
    public int A;
    public String B;
    public boolean C;
    public final l D;
    public final rv6 E;
    public boolean F;
    public boolean G;
    public int H;
    public final l I;
    public final l J;
    public final rv6 K;
    public final i L;
    public final pv6 M;
    public final i N;
    public final pv6 O;
    public final l P;
    public final rv6 Q;
    public final l R;
    public final rv6 S;
    public final vo4 v;
    public final pi0 w;
    public final c5 x;
    public final ir.mservices.market.movie.ui.detail.review.model.a y;
    public final a65 z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$1", f = "MovieReviewsViewModel.kt", l = {283}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieReviewsViewModel.this.new AnonymousClass1(g51Var);
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
            MovieReviewsViewModel movieReviewsViewModel = MovieReviewsViewModel.this;
            pv6 pv6Var = movieReviewsViewModel.u;
            bj2 bj2Var = new bj2(16, movieReviewsViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 15), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$2", f = "MovieReviewsViewModel.kt", l = {89}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$2$1", f = "MovieReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ MovieReviewsViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MovieReviewsViewModel movieReviewsViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = movieReviewsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((LikeOrDislikeData) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                LikeOrDislikeData likeOrDislikeData = (LikeOrDislikeData) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                g25 g25Var = new g25(likeOrDislikeData, 1);
                MovieReviewsViewModel movieReviewsViewModel = this.b;
                movieReviewsViewModel.g(new wz5(g25Var, new g8(14, movieReviewsViewModel)));
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieReviewsViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                MovieReviewsViewModel movieReviewsViewModel = MovieReviewsViewModel.this;
                o4 o4Var = new o4(movieReviewsViewModel.Q, 9);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieReviewsViewModel, null);
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

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$3", f = "MovieReviewsViewModel.kt", l = {114}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$3$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$3$1", f = "MovieReviewsViewModel.kt", l = {132, 170}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public Serializable a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ MovieReviewsViewModel d;

            /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$3$1$4, reason: invalid class name */
            final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements dp2 {
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    RecyclerItem recyclerItem = (RecyclerItem) obj;
                    js3.p(recyclerItem, "p0");
                    return Boolean.valueOf(((MovieReviewsViewModel) this.receiver).isMovieReviewData(recyclerItem));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MovieReviewsViewModel movieReviewsViewModel, g51 g51Var) {
                super(2, g51Var);
                this.d = movieReviewsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, g51Var);
                anonymousClass1.c = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((n99) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
            
                if (r2.emit(r1, r22) == r4) goto L48;
             */
            /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 351
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieReviewsViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                MovieReviewsViewModel movieReviewsViewModel = MovieReviewsViewModel.this;
                pv6 pv6Var = movieReviewsViewModel.y.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieReviewsViewModel, null);
                this.a = 1;
                if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewsViewModel(jd7 jd7Var, vo4 vo4Var, gr5 gr5Var, pi0 pi0Var, c5 c5Var, ir.mservices.market.movie.ui.detail.review.model.a aVar) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(pi0Var, "buzzManager");
        js3.p(c5Var, "accountManager");
        js3.p(aVar, "movieReviewManager");
        this.v = vo4Var;
        this.w = pi0Var;
        this.x = c5Var;
        this.y = aVar;
        if (!jd7Var.a("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("movieId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("reviewInfo")) {
            throw new IllegalArgumentException("Required argument \"reviewInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieReviewInfoDto.class) && !Serializable.class.isAssignableFrom(MovieReviewInfoDto.class)) {
            throw new UnsupportedOperationException(MovieReviewInfoDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieReviewInfoDto movieReviewInfoDto = (MovieReviewInfoDto) jd7Var.b("reviewInfo");
        if (!jd7Var.a("toolbarData")) {
            throw new IllegalArgumentException("Required argument \"toolbarData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieToolbarData.class) && !Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
            throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieToolbarData movieToolbarData = (MovieToolbarData) jd7Var.b("toolbarData");
        if (movieToolbarData == null) {
            throw new IllegalArgumentException("Argument \"toolbarData\" is marked as non-null but was passed a null value");
        }
        this.z = new a65(str, movieReviewInfoDto, movieToolbarData);
        this.B = "";
        l lVarB = ja1.b(Boolean.valueOf((movieReviewInfoDto != null ? movieReviewInfoDto.getUserReview() : null) != null));
        this.D = lVarB;
        this.E = new rv6(lVarB);
        this.G = true;
        Boolean bool = Boolean.FALSE;
        this.I = ja1.b(bool);
        l lVarB2 = ja1.b(movieReviewInfoDto != null ? movieReviewInfoDto.getUserReview() : null);
        this.J = lVarB2;
        this.K = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.L = iVarE;
        this.M = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.N = iVarE2;
        this.O = new pv6(iVarE2);
        this.P = ja1.b(bool);
        this.Q = ((p05) gr5Var.g).c;
        l lVarB3 = ja1.b(lVarB2.getValue() == null ? v55.b : w55.a);
        this.R = lVarB3;
        this.S = new rv6(lVarB3);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMovieReviewData(RecyclerItem recyclerItem) {
        return recyclerItem.c instanceof MovieReviewData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e A[LOOP:2: B:52:0x0148->B:54:0x014e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ir.mservices.market.common.ui.recycler.RecyclerItem> movieReviewsDtoMapper(ir.mservices.market.movie.data.webapi.MovieReviewListDto r24) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel.movieReviewsDtoMapper(ir.mservices.market.movie.data.webapi.MovieReviewListDto):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(MovieReviewAction.InitAction initAction) {
        this.A = initAction.getMaxSpan();
        this.B = initAction.getMinutesAgoString();
        this.C = initAction.isTvDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateReviewUiState(MovieReviewAction.UpdateReviewUiState updateReviewUiState) {
        l lVar;
        Object value;
        do {
            lVar = this.R;
            value = lVar.getValue();
        } while (!lVar.n(value, updateReviewUiState.getMovieReviewUiState()));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieReviewsViewModel$doRequest$1(this, null));
    }
}
