package ir.mservices.market.movie.ui.detail;

import defpackage.at2;
import defpackage.bj2;
import defpackage.bl4;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c5;
import defpackage.ce6;
import defpackage.ck4;
import defpackage.de6;
import defpackage.e71;
import defpackage.f88;
import defpackage.g25;
import defpackage.g27;
import defpackage.g51;
import defpackage.g8;
import defpackage.gf2;
import defpackage.gr5;
import defpackage.i30;
import defpackage.is3;
import defpackage.j04;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.mz3;
import defpackage.n25;
import defpackage.n99;
import defpackage.ni0;
import defpackage.o4;
import defpackage.oi0;
import defpackage.p05;
import defpackage.pa2;
import defpackage.pi0;
import defpackage.pq6;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.pz3;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.sq4;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.tz5;
import defpackage.us3;
import defpackage.v15;
import defpackage.v55;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.w55;
import defpackage.wu0;
import defpackage.wz5;
import defpackage.xp;
import defpackage.xz5;
import defpackage.y05;
import defpackage.y97;
import defpackage.yz5;
import defpackage.zz5;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.movie.data.webapi.BookmarkInfo;
import ir.mservices.market.movie.data.webapi.CastDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.DetailStreamerDto;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.data.webapi.HomeMovieDto;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import ir.mservices.market.movie.data.webapi.ScreenshotDto;
import ir.mservices.market.movie.data.webapi.SeasonDto;
import ir.mservices.market.movie.data.webapi.SubscriptionInfo;
import ir.mservices.market.movie.data.webapi.SummariesDto;
import ir.mservices.market.movie.data.webapi.TagDto;
import ir.mservices.market.movie.download.core.source.NeneMovieDownloadSource$isMovieDownloadInProgress$$inlined$transform$1;
import ir.mservices.market.movie.ui.detail.MovieDetailAction;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastData;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastTitleData;
import ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeMoreData;
import ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData;
import ir.mservices.market.movie.ui.detail.recycler.MovieHorizontalTagData;
import ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotsData;
import ir.mservices.market.movie.ui.detail.recycler.MovieSeasonTitleData;
import ir.mservices.market.movie.ui.detail.recycler.MovieTabData;
import ir.mservices.market.movie.ui.detail.recycler.MovieTrailerData;
import ir.mservices.market.movie.ui.detail.review.MovieEmptyReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewMoreData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewTitleData;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import ir.mservices.market.version2.activity.IbexData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDetailViewModel extends ir.mservices.market.viewModel.a implements pz3 {
    public pi0 A;
    public final l A0;
    public c5 B;
    public final i B0;
    public final Object C;
    public final rv6 C0;
    public final Object D;
    public boolean D0;
    public int E;
    public boolean E0;
    public Integer F;
    public String G;
    public String H;
    public boolean I;
    public final l J;
    public final rv6 K;
    public final l L;
    public final i M;
    public final pv6 N;
    public boolean O;
    public final l P;
    public final rv6 Q;
    public final v15 R;
    public final l S;
    public final l T;
    public final l U;
    public final l V;
    public final rv6 W;
    public final i X;
    public final pv6 Y;
    public final i Z;
    public final pa2 v;
    public final ck4 w;
    public final n25 x;
    public final pv6 x0;
    public final y05 y;
    public final l y0;
    public final ir.mservices.market.movie.ui.detail.review.model.a z;
    public final rv6 z0;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$1", f = "MovieDetailViewModel.kt", l = {694}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDetailViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            MovieDetailViewModel movieDetailViewModel = MovieDetailViewModel.this;
            pv6 pv6Var = movieDetailViewModel.u;
            bj2 bj2Var = new bj2(9, movieDetailViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 11), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$2", f = "MovieDetailViewModel.kt", l = {182}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$2$1", f = "MovieDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ MovieDetailViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MovieDetailViewModel movieDetailViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = movieDetailViewModel;
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
                kotlin.b.b(obj);
                g25 g25Var = new g25(likeOrDislikeData, 0);
                MovieDetailViewModel movieDetailViewModel = this.b;
                movieDetailViewModel.g(new wz5(g25Var, new g8(13, movieDetailViewModel)));
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDetailViewModel.this.new AnonymousClass2(g51Var);
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
                kotlin.b.b(obj);
                MovieDetailViewModel movieDetailViewModel = MovieDetailViewModel.this;
                o4 o4Var = new o4(movieDetailViewModel.C0, 9);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieDetailViewModel, null);
                this.a = 1;
                if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$3", f = "MovieDetailViewModel.kt", l = {214}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDetailViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((ce6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MovieReviewInfoDto reviewInfo;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            MovieDetailViewModel movieDetailViewModel = MovieDetailViewModel.this;
            if (i == 0) {
                kotlin.b.b(obj);
                l lVar = movieDetailViewModel.U;
                MovieFullDto movieFullDtoF = movieDetailViewModel.F();
                MovieReviewDto userReview = (movieFullDtoF == null || (reviewInfo = movieFullDtoF.getReviewInfo()) == null) ? null : reviewInfo.getUserReview();
                this.a = 1;
                lVar.emit(userReview, this);
                if (tx8Var == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            l lVar2 = movieDetailViewModel.S;
            Boolean bool = Boolean.TRUE;
            lVar2.getClass();
            lVar2.p(null, bool);
            return tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$4, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$4", f = "MovieDetailViewModel.kt", l = {220}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$4$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$4$1", f = "MovieDetailViewModel.kt", l = {231, 237}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ MovieDetailViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MovieDetailViewModel movieDetailViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = movieDetailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
                anonymousClass1.b = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((n99) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
            
                if (r8.emit(r3, r7) == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
            
                return r1;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.b
                    n99 r0 = (defpackage.n99) r0
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                    int r2 = r7.a
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L1e
                    if (r2 == r4) goto L19
                    if (r2 != r3) goto L11
                    goto L19
                L11:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L19:
                    kotlin.b.b(r8)
                    goto L99
                L1e:
                    kotlin.b.b(r8)
                    boolean r8 = r0 instanceof defpackage.l99
                    r2 = 0
                    ir.mservices.market.movie.ui.detail.MovieDetailViewModel r5 = r7.c
                    if (r8 == 0) goto L7e
                    kotlinx.coroutines.flow.l r8 = r5.T
                L2a:
                    java.lang.Object r3 = r8.getValue()
                    r6 = r3
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    r6.getClass()
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    boolean r3 = r8.n(r3, r6)
                    if (r3 == 0) goto L2a
                    l99 r0 = (defpackage.l99) r0
                    java.lang.Object r8 = r0.a
                    ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData r8 = (ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData) r8
                    java.lang.String r0 = r8.a
                    v15 r3 = r5.R
                    java.lang.String r3 = r3.a
                    boolean r0 = defpackage.js3.i(r0, r3)
                    if (r0 == 0) goto L6a
                    kotlinx.coroutines.flow.l r0 = r5.V
                L50:
                    java.lang.Object r3 = r0.getValue()
                    r6 = r3
                    x55 r6 = (defpackage.x55) r6
                    x55 r6 = r8.d
                    boolean r3 = r0.n(r3, r6)
                    if (r3 == 0) goto L50
                    boolean r0 = r8.b
                    java.lang.String r3 = r5.G
                    java.lang.String r8 = r8.c
                    java.lang.String r6 = r5.H
                    ir.mservices.market.movie.ui.detail.MovieDetailViewModel.B(r5, r0, r3, r8, r6)
                L6a:
                    kotlinx.coroutines.flow.i r8 = r5.X
                    int r0 = defpackage.rs6.review_submit_success
                    java.lang.Integer r3 = new java.lang.Integer
                    r3.<init>(r0)
                    r7.b = r2
                    r7.a = r4
                    java.lang.Object r8 = r8.emit(r3, r7)
                    if (r8 != r1) goto L99
                    goto L98
                L7e:
                    boolean r8 = r0 instanceof defpackage.h99
                    if (r8 == 0) goto L99
                    h99 r0 = (defpackage.h99) r0
                    ir.mservices.market.version2.webapi.responsedto.ErrorDTO r8 = r0.a
                    java.lang.String r8 = r8.getTranslatedMessage()
                    if (r8 == 0) goto L99
                    kotlinx.coroutines.flow.i r0 = r5.Z
                    r7.b = r2
                    r7.a = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L99
                L98:
                    return r1
                L99:
                    tx8 r8 = defpackage.tx8.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.MovieDetailViewModel.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass4(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDetailViewModel.this.new AnonymousClass4(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                MovieDetailViewModel movieDetailViewModel = MovieDetailViewModel.this;
                pv6 pv6Var = movieDetailViewModel.z.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieDetailViewModel, null);
                this.a = 1;
                if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$addBookmark$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel", f = "MovieDetailViewModel.kt", l = {490, 494, 498}, m = "addBookmark", v = 1)
    public static final class C01931 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C01931(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MovieDetailViewModel.this.addBookmark(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$deleteBookmark$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel", f = "MovieDetailViewModel.kt", l = {473, 477, 481}, m = "deleteBookmark", v = 1)
    public static final class C01941 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C01941(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MovieDetailViewModel.this.deleteBookmark(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailViewModel$onShowTrailerReplayIcon$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$onShowTrailerReplayIcon$1", f = "MovieDetailViewModel.kt", l = {250}, m = "invokeSuspend", v = 1)
    public static final class C01951 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ MovieDetailAction.ShowTrailerReplayIcon c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01951(MovieDetailAction.ShowTrailerReplayIcon showTrailerReplayIcon, g51 g51Var) {
            super(2, g51Var);
            this.c = showTrailerReplayIcon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDetailViewModel.this.new C01951(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01951) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = MovieDetailViewModel.this.B0;
                Boolean boolValueOf = Boolean.valueOf(this.c.getShow());
                this.a = 1;
                if (iVar.emit(boolValueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailViewModel(jd7 jd7Var, pa2 pa2Var, gr5 gr5Var, ck4 ck4Var, n25 n25Var, y05 y05Var, ir.mservices.market.movie.ui.detail.review.model.a aVar) {
        MovieReviewInfoDto reviewInfo;
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(n25Var, "movieDownloadRepository");
        js3.p(y05Var, "movieDataMapper");
        js3.p(aVar, "movieReviewManager");
        this.v = pa2Var;
        this.w = ck4Var;
        this.x = n25Var;
        this.y = y05Var;
        this.z = aVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
        this.C = kotlin.a.b(lazyThreadSafetyMode, new i30(this, 9));
        this.D = kotlin.a.b(lazyThreadSafetyMode, new i30(this, 10));
        this.G = "";
        this.H = "";
        l lVarB = ja1.b(null);
        this.J = lVarB;
        this.K = new rv6(lVarB);
        this.L = ja1.b(null);
        i iVarE = vy2.e(0, 7, null);
        this.M = iVarE;
        this.N = new pv6(iVarE);
        Boolean bool = Boolean.FALSE;
        l lVarB2 = ja1.b(bool);
        this.P = lVarB2;
        this.Q = new rv6(lVarB2);
        if (!jd7Var.a("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("movieId");
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("refId");
        if (!jd7Var.a(CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY)) {
            throw new IllegalArgumentException("Required argument \"play\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) jd7Var.b(CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY);
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"play\" of type boolean does not support null values");
        }
        if (!jd7Var.a("posterUrl")) {
            throw new IllegalArgumentException("Required argument \"posterUrl\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("posterUrl");
        if (!jd7Var.a("playId")) {
            throw new IllegalArgumentException("Required argument \"playId\" is missing and does not have an android:defaultValue");
        }
        this.R = new v15(str, str2, bool2.booleanValue(), str3, (String) jd7Var.b("playId"));
        this.S = ja1.b(bool);
        this.T = ja1.b(bool);
        MovieFullDto movieFullDtoF = F();
        this.U = ja1.b((movieFullDtoF == null || (reviewInfo = movieFullDtoF.getReviewInfo()) == null) ? null : reviewInfo.getUserReview());
        l lVarB3 = ja1.b(v55.b);
        this.V = lVarB3;
        this.W = new rv6(lVarB3);
        i iVarE2 = vy2.e(0, 7, null);
        this.X = iVarE2;
        this.Y = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.Z = iVarE3;
        this.x0 = new pv6(iVarE3);
        l lVarB4 = ja1.b(null);
        this.y0 = lVarB4;
        this.z0 = new rv6(lVarB4);
        this.A0 = ja1.b(null);
        this.B0 = vy2.e(1, 6, null);
        this.C0 = ((p05) gr5Var.g).c;
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        d.v(new gf2(new xp(getPlayerEventHandler().b, g27.a(ce6.class), 9), new AnonymousClass3(null), 4), y97.G(this));
        bt2.G(y97.G(this), null, null, new AnonymousClass4(null), 3);
    }

    public static /* synthetic */ RecyclerItem C(MovieDetailViewModel movieDetailViewModel, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        return movieDetailViewModel.createDivider(num, num2, num3, num4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r2.emit(r13, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r2.emit(r1, r7) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object addBookmark(java.lang.String r13, defpackage.g51<? super defpackage.tx8> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ir.mservices.market.movie.ui.detail.MovieDetailViewModel.C01931
            if (r0 == 0) goto L14
            r0 = r14
            ir.mservices.market.movie.ui.detail.MovieDetailViewModel$addBookmark$1 r0 = (ir.mservices.market.movie.ui.detail.MovieDetailViewModel.C01931) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            ir.mservices.market.movie.ui.detail.MovieDetailViewModel$addBookmark$1 r0 = new ir.mservices.market.movie.ui.detail.MovieDetailViewModel$addBookmark$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.d
            r9 = 3
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L3d
            if (r1 == r11) goto L39
            if (r1 == r10) goto L34
            if (r1 != r9) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            kotlin.b.b(r14)
            goto Lc1
        L39:
            kotlin.b.b(r14)
            goto L8c
        L3d:
            kotlin.b.b(r14)
            r7.d = r11
            ck4 r14 = r12.w
            java.lang.Object r14 = r14.b
            r1 = r14
            e05 r1 = (defpackage.e05) r1
            r1.getClass()
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r2 = "movieId"
            r14.<init>(r2, r13)
            kotlin.Pair[] r13 = new kotlin.Pair[r11]
            r2 = 0
            r13[r2] = r14
            java.util.LinkedHashMap r13 = kotlin.collections.b.O(r13)
            java.lang.String r14 = "v1/bookmarks"
            java.util.Map r13 = r1.getCommonQueryParam(r13)
            java.lang.String r2 = "movie-api"
            r3 = 0
            z57 r3 = r1.createRequestUrl(r2, r14, r3, r13)
            ir.mservices.market.movie.ui.bookmark.services.MovieBookmarkService$addBookmark$2 r13 = new ir.mservices.market.movie.ui.bookmark.services.MovieBookmarkService$addBookmark$2
            r13.<init>()
            java.lang.reflect.Type r2 = r13.getType()
            java.lang.String r13 = "getType(...)"
            defpackage.js3.o(r2, r13)
            defpackage.js3.m(r3)
            ol3 r4 = new ol3
            r13 = 6
            r4.<init>(r13)
            r6 = 0
            r8 = 496(0x1f0, float:6.95E-43)
            java.lang.String r5 = "BOOKMARK_REQUEST_TAG"
            java.lang.Object r14 = defpackage.dy3.I(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L8c
            goto Lc0
        L8c:
            r13 = r14
            n99 r13 = (defpackage.n99) r13
            boolean r1 = r13 instanceof defpackage.l99
            kotlinx.coroutines.flow.i r2 = r12.M
            if (r1 == 0) goto La9
            r12.O = r11
            l99 r13 = new l99
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.<init>(r1)
            r7.a = r14
            r7.d = r10
            java.lang.Object r13 = r2.emit(r13, r7)
            if (r13 != r0) goto Lc1
            goto Lc0
        La9:
            boolean r1 = r13 instanceof defpackage.h99
            if (r1 == 0) goto Lc1
            h99 r1 = new h99
            h99 r13 = (defpackage.h99) r13
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r13 = r13.a
            r1.<init>(r13)
            r7.a = r14
            r7.d = r9
            java.lang.Object r13 = r2.emit(r1, r7)
            if (r13 != r0) goto Lc1
        Lc0:
            return r0
        Lc1:
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.MovieDetailViewModel.addBookmark(java.lang.String, g51):java.lang.Object");
    }

    private final RecyclerItem createDivider(Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        DividerData dividerData = new DividerData();
        if (num != null) {
            dividerData.f = num.intValue();
        }
        if (num2 != null) {
            dividerData.g = num2.intValue();
        }
        if (num3 != null) {
            dividerData.e = num3.intValue();
        }
        if (num4 != null) {
            dividerData.c = num4.intValue();
        }
        dividerData.b = z;
        long j = is3.p + 1;
        is3.p = j;
        dividerData.a = String.valueOf(j);
        return new RecyclerItem(dividerData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r5.emit(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r5.emit(r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteBookmark(java.lang.String r7, defpackage.g51<? super defpackage.tx8> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ir.mservices.market.movie.ui.detail.MovieDetailViewModel.C01941
            if (r0 == 0) goto L13
            r0 = r8
            ir.mservices.market.movie.ui.detail.MovieDetailViewModel$deleteBookmark$1 r0 = (ir.mservices.market.movie.ui.detail.MovieDetailViewModel.C01941) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ir.mservices.market.movie.ui.detail.MovieDetailViewModel$deleteBookmark$1 r0 = new ir.mservices.market.movie.ui.detail.MovieDetailViewModel$deleteBookmark$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.b.b(r8)
            goto L84
        L36:
            kotlin.b.b(r8)
            goto L4e
        L3a:
            kotlin.b.b(r8)
            r0.d = r5
            ck4 r8 = r6.w
            java.lang.Object r8 = r8.b
            e05 r8 = (defpackage.e05) r8
            java.lang.String r2 = "BOOKMARK_REQUEST_TAG"
            java.lang.Object r8 = r8.g(r2, r7, r0)
            if (r8 != r1) goto L4e
            goto L83
        L4e:
            r7 = r8
            n99 r7 = (defpackage.n99) r7
            boolean r2 = r7 instanceof defpackage.l99
            kotlinx.coroutines.flow.i r5 = r6.M
            if (r2 == 0) goto L6c
            r7 = 0
            r6.O = r7
            l99 r7 = new l99
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r7.<init>(r2)
            r0.a = r8
            r0.d = r4
            java.lang.Object r7 = r5.emit(r7, r0)
            if (r7 != r1) goto L84
            goto L83
        L6c:
            boolean r2 = r7 instanceof defpackage.h99
            if (r2 == 0) goto L84
            h99 r2 = new h99
            h99 r7 = (defpackage.h99) r7
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r7 = r7.a
            r2.<init>(r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r7 = r5.emit(r2, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.detail.MovieDetailViewModel.deleteBookmark(java.lang.String, g51):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    private final sq4 getMediaSessionController() {
        return (sq4) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    private final de6 getPlayerEventHandler() {
        return (de6) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMovieEpisodeData(RecyclerItem recyclerItem) {
        return recyclerItem.c instanceof MovieEpisodeData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMovieSeasonTitleData(RecyclerItem recyclerItem) {
        return recyclerItem.c instanceof MovieSeasonTitleData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [g51, java.lang.Object, java.lang.String, java.lang.Throwable, kotlinx.coroutines.CoroutineStart, w61] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List<RecyclerItem> movieFullMapperToRecyclerData(MovieFullDto movieFullDto) {
        ?? r14;
        l lVar;
        boolean z;
        boolean z2;
        boolean z3;
        Object value;
        l lVar2;
        Object value2;
        HomeMovieDto homeMovieDto;
        MovieDetailViewModel movieDetailViewModel = this;
        List<SeasonDto> seasons = movieFullDto.getSeasons();
        boolean z4 = true;
        movieDetailViewModel.D0 = !(seasons == null || seasons.isEmpty());
        Boolean audioMode = movieFullDto.getAudioMode();
        movieDetailViewModel.E0 = audioMode != null ? audioMode.booleanValue() : false;
        ArrayList arrayList = new ArrayList();
        String title = movieFullDto.getTitle();
        List<SummariesDto> summaries = movieFullDto.getSummaries();
        String posterUrl = movieFullDto.getPosterUrl();
        String buttonText = movieFullDto.getButtonText();
        String playId = movieFullDto.getPlayId();
        String buttonAction = movieFullDto.getButtonAction();
        boolean showTrafficHint = movieFullDto.getShowTrafficHint();
        String id = movieFullDto.getId();
        String sampleWatchMessage = movieFullDto.getSampleWatchMessage();
        SubscriptionInfo subscriptionInfo = movieFullDto.getSubscriptionInfo();
        Boolean boolValueOf = Boolean.valueOf(movieFullDto.getShowDownloadButton());
        DetailStreamerDto streamer = movieFullDto.getStreamer();
        String id2 = movieFullDto.getId();
        n25 n25Var = movieDetailViewModel.x;
        n25Var.getClass();
        js3.p(id2, "movieId");
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        aVar.getClass();
        rv6 rv6VarA = d.A(new vb7(new NeneMovieDownloadSource$isMovieDownloadInProgress$$inlined$transform$1(aVar.g, null, id2)), y97.G(movieDetailViewModel), ru7.b, Boolean.FALSE);
        rv6 rv6Var = movieDetailViewModel.getMediaSessionController().e;
        rv6 rv6Var2 = movieDetailViewModel.z0;
        arrayList.add(new MovieHeaderData(title, summaries, posterUrl, buttonText, playId, buttonAction, showTrafficHint, id, sampleWatchMessage, subscriptionInfo, boolValueOf, streamer, rv6Var2, movieDetailViewModel.A0, rv6VarA, rv6Var));
        boolean z5 = movieDetailViewModel.E0;
        rv6 rv6Var3 = movieDetailViewModel.W;
        l lVar3 = movieDetailViewModel.U;
        l lVar4 = movieDetailViewModel.T;
        arrayList.add(new MovieUserSubmitReviewData(rv6Var3, lVar3, lVar4, true, z5, null, 32));
        List<HomeMovieDto> elements = movieFullDto.getElements();
        l lVar5 = movieDetailViewModel.S;
        if (elements == null || (homeMovieDto = (HomeMovieDto) kotlin.collections.a.q0(0, elements)) == null) {
            r14 = 0;
            lVar = lVar5;
        } else {
            r14 = 0;
            ListBuilder listBuilderC = movieDetailViewModel.y.c(homeMovieDto, y97.G(movieDetailViewModel), lVar5, true, Integer.valueOf(pq6.movie_tab_width), movieDetailViewModel, false, new MovieDetailViewModel$movieFullMapperToRecyclerData$1$1(1, movieDetailViewModel, MovieDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0));
            lVar = lVar5;
            movieDetailViewModel = movieDetailViewModel;
            arrayList.addAll(listBuilderC);
        }
        if (movieFullDto.getMessageBox() != null) {
            arrayList.add(new MessageBoxData(movieFullDto.getMessageBox(), sj8.b().j));
        }
        arrayList.add(new MovieTabData(movieDetailViewModel.D0, movieDetailViewModel.E0, movieDetailViewModel.Q));
        ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
        viewEventBuilder.b("movie_vpn");
        viewEventBuilder.a();
        String description = movieFullDto.getDescription();
        if (description != null && !f88.n0(description)) {
            arrayList.add(new MovieDescriptionData(movieFullDto.getDescription()));
        }
        List<TagDto> tags = movieFullDto.getTags();
        if (tags != null && !tags.isEmpty()) {
            List<TagDto> tags2 = movieFullDto.getTags();
            ArrayList arrayList2 = new ArrayList(wu0.V(tags2, 10));
            Iterator it = tags2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new AppTagData((TagDto) it.next()));
            }
            arrayList.add(new MovieHorizontalTagData(arrayList2));
        }
        AddaxBoxDto primaryAddax = movieFullDto.getPrimaryAddax();
        if (primaryAddax != null) {
            arrayList.add(new AddaxBoxData(primaryAddax, true));
        }
        List<SeasonDto> seasons2 = movieFullDto.getSeasons();
        char c = 3;
        if (seasons2 != null && !seasons2.isEmpty()) {
            Iterator<SeasonDto> it2 = movieFullDto.getSeasons().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (js3.i(it2.next().getId(), movieFullDto.getSelectedSeasonId())) {
                    break;
                }
                i++;
            }
            if (i < 0) {
                i = 0;
            }
            movieDetailViewModel.E = i;
            arrayList.add(new MovieSeasonTitleData(movieFullDto.getSeasons(), movieDetailViewModel.E0, movieDetailViewModel.E));
            List<EpisodeDto> episodes = movieFullDto.getSeasons().get(movieDetailViewModel.E).getEpisodes();
            Iterator it3 = episodes.subList(0, Math.min(episodes.size(), 3)).iterator();
            while (it3.hasNext()) {
                arrayList.add(new MovieEpisodeData((EpisodeDto) it3.next(), rv6Var2, movieDetailViewModel.getMediaSessionController().e, movieDetailViewModel.E0));
            }
            if (episodes.size() > 3 || movieFullDto.getSeasons().size() > 1) {
                arrayList.add(new MovieEpisodeMoreData());
            }
        }
        if (movieFullDto.getTrailer() != null) {
            arrayList.add(new MovieTrailerData(movieFullDto.getTrailer(), new IbexData(movieFullDto.getType(), movieFullDto.getTitle(), movieFullDto.getPosterLandscapeBlurUrl(), movieFullDto.getPosterUrl()), movieDetailViewModel.B0));
        }
        List<ScreenshotDto> screenshots = movieFullDto.getScreenshots();
        if (screenshots != null && !screenshots.isEmpty()) {
            arrayList.add(new MovieScreenshotsData(movieFullDto.getScreenshots()));
        }
        List<HomeMovieDto> elements2 = movieFullDto.getElements();
        if (elements2 != null) {
            Iterator it4 = elements2.iterator();
            while (it4.hasNext()) {
                l lVar6 = lVar;
                MovieDetailViewModel movieDetailViewModel2 = movieDetailViewModel;
                ListBuilder listBuilderC2 = movieDetailViewModel.y.c((HomeMovieDto) it4.next(), y97.G(movieDetailViewModel), lVar6, false, Integer.valueOf(pq6.movie_tab_width), movieDetailViewModel2, false, new MovieDetailViewModel$movieFullMapperToRecyclerData$6$1(1, movieDetailViewModel, MovieDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0));
                movieDetailViewModel = movieDetailViewModel2;
                arrayList.addAll(listBuilderC2);
                lVar = lVar6;
                c = 3;
            }
        }
        if (movieFullDto.getReviewInfo() != null) {
            MovieReviewInfoDto reviewInfo = movieFullDto.getReviewInfo();
            js3.n(reviewInfo, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.MovieReviewInfoDto");
            MovieReviewInfoData movieReviewInfoData = new MovieReviewInfoData(reviewInfo);
            arrayList.add(new MovieReviewTitleData());
            arrayList.add(movieReviewInfoData);
            ArrayList<MovieReviewDto> reviews = reviewInfo.getReviews();
            int size = reviews != null ? reviews.size() : 0;
            boolean z6 = movieDetailViewModel.I;
            if (reviewInfo.getUserReview() != null) {
                do {
                    value = lVar3.getValue();
                } while (!lVar3.n(value, reviewInfo.getUserReview()));
                do {
                    lVar2 = movieDetailViewModel.V;
                    value2 = lVar2.getValue();
                } while (!lVar2.n(value2, w55.a));
            }
            arrayList.add(new MovieUserSubmitReviewData(rv6Var3, lVar3, lVar4, false, movieDetailViewModel.E0, null, 32));
            ArrayList<MovieReviewDto> reviews2 = reviewInfo.getReviews();
            if (reviews2 != null) {
                int i2 = 0;
                for (Object obj : reviews2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        br9.P();
                        throw r14;
                    }
                    MovieReviewDto movieReviewDto = (MovieReviewDto) obj;
                    pi0 pi0VarE = movieDetailViewModel.E();
                    String id3 = movieFullDto.getId();
                    int id4 = movieReviewDto.getId();
                    int positiveLikes = movieReviewDto.getPositiveLikes();
                    int negativeLikes = movieReviewDto.getNegativeLikes();
                    Boolean boolB = pi0VarE.b(id4, id3);
                    if (boolB != null) {
                        z3 = z4;
                        pi0VarE.a.put(new ni0(id3, String.valueOf(id4), r14), new oi0(boolB, positiveLikes, negativeLikes));
                    } else {
                        z3 = z4;
                    }
                    Boolean boolB2 = movieDetailViewModel.E().b(movieReviewDto.getId(), movieFullDto.getId());
                    oi0 oi0VarA = movieDetailViewModel.E().a(movieReviewDto.getId(), movieFullDto.getId());
                    Integer num = movieDetailViewModel.F;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        arrayList.add(new MovieReviewData(movieReviewDto, movieFullDto.getId(), oi0VarA, boolB2, (((z6 ? 1 : 0) % iIntValue) + i2) / iIntValue != ((size + (-1)) + (z6 ? 1 : 0)) / iIntValue ? z3 : false));
                    }
                    i2 = i3;
                    z4 = z3;
                }
            }
            z = z4;
            ArrayList<MovieReviewDto> reviews3 = reviewInfo.getReviews();
            if (reviews3 != null && !reviews3.isEmpty()) {
                arrayList.add(new MovieReviewMoreData());
            } else if (reviewInfo.getUserReview() == null) {
                MovieReviewInfoDto reviewInfo2 = movieFullDto.getReviewInfo();
                ?? reviews4 = reviewInfo2 != null ? reviewInfo2.getReviews() : r14;
                if (reviews4 == 0 || reviews4.isEmpty()) {
                    arrayList.add(new MovieEmptyReviewData(movieDetailViewModel.E0));
                }
            }
        } else {
            z = true;
        }
        List<CastDto> casts = movieFullDto.getCasts();
        if (casts != null && !casts.isEmpty()) {
            arrayList.add(new MovieCastTitleData());
            Iterator it5 = movieFullDto.getCasts().iterator();
            while (it5.hasNext()) {
                arrayList.add(new MovieCastData((CastDto) it5.next()));
            }
        }
        ?? r0 = movieDetailViewModel.J;
        r0.getClass();
        r0.p(r14, movieFullDto);
        BookmarkInfo bookmarkInfo = movieFullDto.getBookmarkInfo();
        movieDetailViewModel.O = (bookmarkInfo == null || bookmarkInfo.isBookmarked() != (z2 = z)) ? false : z2;
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            bl4.G((MyketRecyclerData) it6.next(), arrayList3);
        }
        ?? r1 = movieDetailViewModel.L;
        r1.getClass();
        r1.p(r14, arrayList3);
        bt2.G(y97.G(movieDetailViewModel), r14, r14, new MovieDetailViewModel$movieFullMapperToRecyclerData$11$1(movieDetailViewModel, r14), 3);
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(MovieDetailAction.InitAction initAction) {
        this.F = initAction.getMaxSpan();
        this.G = initAction.getReviewSubtitle();
        this.H = initAction.getReviewDate();
        this.I = initAction.isTvDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowTrailerReplayIcon(MovieDetailAction.ShowTrailerReplayIcon showTrailerReplayIcon) {
        bt2.G(y97.G(this), null, null, new C01951(showTrailerReplayIcon, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateReviewUiState(MovieDetailAction.UpdateReviewUiState updateReviewUiState) {
        l lVar;
        Object value;
        do {
            lVar = this.V;
            value = lVar.getValue();
        } while (!lVar.n(value, updateReviewUiState.getMovieReviewUiState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReview(boolean z, String str, String str2, String str3) {
        l lVar;
        Object value;
        MovieFullDto movieFullDtoF;
        MovieReviewInfoDto reviewInfo;
        MovieReviewInfoDto reviewInfo2;
        ArrayList<MovieReviewDto> reviews;
        MovieReviewInfoDto reviewInfo3;
        c5 c5Var = this.B;
        MovieReviewDto userReview = null;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        String str4 = (String) c5Var.h.b;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        String strC = c5Var.c();
        js3.o(strC, "getNickname(...)");
        c5 c5Var2 = this.B;
        if (c5Var2 == null) {
            js3.V("accountManager");
            throw null;
        }
        MovieReviewDto movieReviewDto = new MovieReviewDto(0, str4, strC, z, str3, c5Var2.h.e(), null, null, str2, 192, null);
        MovieFullDto movieFullDtoF2 = F();
        if (movieFullDtoF2 != null) {
            MovieReviewInfoDto reviewInfo4 = movieFullDtoF2.getReviewInfo();
            if (reviewInfo4 != null) {
                reviewInfo4.setUserReview(movieReviewDto);
            }
        } else {
            movieFullDtoF2 = null;
        }
        this.J.o(movieFullDtoF2);
        do {
            lVar = this.U;
            value = lVar.getValue();
            movieFullDtoF = F();
        } while (!lVar.n(value, (movieFullDtoF == null || (reviewInfo3 = movieFullDtoF.getReviewInfo()) == null) ? null : reviewInfo3.getUserReview()));
        MovieFullDto movieFullDtoF3 = F();
        if (movieFullDtoF3 == null || (reviewInfo2 = movieFullDtoF3.getReviewInfo()) == null || (reviews = reviewInfo2.getReviews()) == null || !(!reviews.isEmpty())) {
            MovieFullDto movieFullDtoF4 = F();
            if (movieFullDtoF4 != null && (reviewInfo = movieFullDtoF4.getReviewInfo()) != null) {
                userReview = reviewInfo.getUserReview();
            }
            if (userReview == null) {
                return;
            }
        }
        g(new yz5(new us3(28)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateReview$lambda$2(RecyclerItem recyclerItem) {
        js3.p(recyclerItem, "recyclerItem");
        return recyclerItem.c instanceof MovieEmptyReviewData;
    }

    public final void D(int i) {
        List<SeasonDto> seasons;
        List<SeasonDto> seasons2;
        SeasonDto seasonDto;
        MovieFullDto movieFullDtoF = F();
        if (movieFullDtoF == null || (seasons = movieFullDtoF.getSeasons()) == null) {
            seasons = EmptyList.a;
        }
        MovieFullDto movieFullDtoF2 = F();
        List<EpisodeDto> episodes = (movieFullDtoF2 == null || (seasons2 = movieFullDtoF2.getSeasons()) == null || (seasonDto = (SeasonDto) kotlin.collections.a.q0(i, seasons2)) == null) ? null : seasonDto.getEpisodes();
        List<EpisodeDto> listSubList = episodes != null ? episodes.subList(0, Math.min(episodes.size(), 3)) : null;
        if (listSubList != null) {
            ArrayList arrayList = new ArrayList(wu0.V(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(new RecyclerItem(new MovieEpisodeData((EpisodeDto) it.next(), this.z0, getMediaSessionController().e, this.E0)));
            }
            g(new zz5(new MovieDetailViewModel$editSelectedSeason$2$1(1, this, MovieDetailViewModel.class, "isMovieSeasonTitleData", "isMovieSeasonTitleData(Lir/mservices/market/common/ui/recycler/RecyclerItem;)Z", 0), br9.B(new RecyclerItem(new MovieSeasonTitleData(seasons, this.E0, i)))), new yz5(new MovieDetailViewModel$editSelectedSeason$2$2(1, this, MovieDetailViewModel.class, "isMovieEpisodeData", "isMovieEpisodeData(Lir/mservices/market/common/ui/recycler/RecyclerItem;)Z", 0)), new tz5(arrayList, new MovieDetailViewModel$editSelectedSeason$2$3(1, this, MovieDetailViewModel.class, "isMovieSeasonTitleData", "isMovieSeasonTitleData(Lir/mservices/market/common/ui/recycler/RecyclerItem;)Z", 0)));
        }
        this.E = i;
    }

    public final pi0 E() {
        pi0 pi0Var = this.A;
        if (pi0Var != null) {
            return pi0Var;
        }
        js3.V("buzzManager");
        throw null;
    }

    public final MovieFullDto F() {
        return (MovieFullDto) this.K.a.getValue();
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
        h().a("BOOKMARK_REQUEST_TAG");
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieDetailViewModel$doRequest$1(this, null));
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    public final void onEvent(j04 j04Var) {
        g(new xz5(null));
    }
}
