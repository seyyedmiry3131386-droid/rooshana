package ir.mservices.market.app.detail.ui;

import android.os.Parcelable;
import androidx.paging.e;
import androidx.paging.m;
import com.google.gson.reflect.TypeToken;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.c24;
import defpackage.c5;
import defpackage.cs1;
import defpackage.dl1;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dy3;
import defpackage.e71;
import defpackage.ec9;
import defpackage.el1;
import defpackage.es1;
import defpackage.f88;
import defpackage.fl1;
import defpackage.fv7;
import defpackage.g51;
import defpackage.gk1;
import defpackage.gl1;
import defpackage.gu9;
import defpackage.hp;
import defpackage.j04;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k7;
import defpackage.lw;
import defpackage.ly5;
import defpackage.m88;
import defpackage.n4;
import defpackage.pp;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.pv6;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sa7;
import defpackage.t15;
import defpackage.t32;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tp;
import defpackage.tx8;
import defpackage.up;
import defpackage.ut4;
import defpackage.v24;
import defpackage.v7;
import defpackage.vb7;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.wp;
import defpackage.wt;
import defpackage.wu0;
import defpackage.wv8;
import defpackage.x2;
import defpackage.xe2;
import defpackage.xg5;
import defpackage.xp;
import defpackage.y97;
import defpackage.yl5;
import defpackage.ys5;
import defpackage.z57;
import defpackage.zi;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.detail.data.AILikeReviewDto;
import ir.mservices.market.app.detail.data.AIReviewDto;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.detail.data.AppDetailNotificationDto;
import ir.mservices.market.app.detail.data.AppRateDto;
import ir.mservices.market.app.detail.data.AppRecommendationDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.data.RateDto;
import ir.mservices.market.app.detail.data.RecommendationDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.SummaryDto;
import ir.mservices.market.app.detail.data.SummaryListDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.app.detail.developer.data.AppDeveloperDto;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.reivews.recycler.AIReviewSummaryData;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.app.detail.ui.AppDetailAction;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.detail.ui.recycler.CommentMoreData;
import ir.mservices.market.app.detail.ui.recycler.ReviewEmptyData;
import ir.mservices.market.app.detail.ui.recycler.ReviewsMoreTitleRowData;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.recommended.data.ApplicationListDto;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.model.c;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.detail.recycler.VerticalLineData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;
import ir.mservices.market.version2.webapi.responsedto.BadgeDTO;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailViewModel extends ir.mservices.market.viewModel.a {
    public final ir.mservices.market.version2.manager.install.a A;
    public final l A0;
    public final dp3 B;
    public final rv6 B0;
    public final wt C;
    public final i C0;
    public final ps1 D;
    public final pv6 D0;
    public final ir.mservices.market.version2.manager.a E;
    public final i E0;
    public final ir.mservices.market.app.update.common.manager.a F;
    public final i F0;
    public final c5 G;
    public final pv6 G0;
    public final ql4 H;
    public final l H0;
    public final ut4 I;
    public final l I0;
    public final ec9 J;
    public final hp J0;
    public float K;
    public StartApplicationData K0;
    public int L;
    public boolean L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public ReviewResultDto N0;
    public final l O;
    public final String O0;
    public final l P;
    public final LinkedHashMap P0;
    public final rv6 Q;
    public final String Q0;
    public final l R;
    public String R0;
    public final rv6 S;
    public final vb7 S0;
    public final i T;
    public final vb7 T0;
    public final pv6 U;
    public final l U0;
    public final i V;
    public final l V0;
    public final pv6 W;
    public final l W0;
    public final l X;
    public final kotlinx.coroutines.channels.a X0;
    public final l Y;
    public List Y0;
    public final l Z;
    public final kotlinx.coroutines.channels.a Z0;
    public final c24 a1;
    public final l b1;
    public final v24 v;
    public final xg5 w;
    public final wv8 x;
    public final i x0;
    public final t15 y;
    public final pv6 y0;
    public final yl5 z;
    public final l z0;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$1", f = "AppDetailViewModel.kt", l = {227, 227}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$1$1", f = "AppDetailViewModel.kt", l = {228}, m = "invokeSuspend", v = 1)
        final class C00181 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ AppDetailViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(AppDetailViewModel appDetailViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = appDetailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00181 c00181 = new C00181(this.c, g51Var);
                c00181.b = obj;
                return c00181;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00181) create((cs1) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                cs1 cs1Var = (cs1) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                tx8 tx8Var = tx8.a;
                AppDetailViewModel appDetailViewModel = this.c;
                if (i == 0) {
                    kotlin.b.b(obj);
                    l lVar = appDetailViewModel.X;
                    Boolean boolValueOf = Boolean.valueOf(((es1) cs1Var.a).f == 100);
                    this.b = cs1Var;
                    this.a = 1;
                    lVar.emit(boolValueOf, this);
                    if (tx8Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                if (((es1) cs1Var.a).g == 102 && !appDetailViewModel.M0) {
                    appDetailViewModel.moveRecommendation();
                }
                return tx8Var;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = AppDetailViewModel.this.new AnonymousClass1(g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r0, r7) == r1) goto L15;
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
                e71 r0 = (defpackage.e71) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r7.a
                ir.mservices.market.app.detail.ui.AppDetailViewModel r3 = ir.mservices.market.app.detail.ui.AppDetailViewModel.this
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L23
                if (r2 == r5) goto L1f
                if (r2 != r4) goto L17
                kotlin.b.b(r8)
                goto L4d
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.b.b(r8)
                goto L3b
            L23:
                kotlin.b.b(r8)
                yl5 r8 = r3.z
                hp r2 = r3.J0
                java.lang.String r2 = r2.a
                xe2 r8 = r8.a(r2)
                r7.b = r6
                r7.a = r5
                java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
                if (r8 != r1) goto L3b
                goto L4c
            L3b:
                xe2 r8 = (defpackage.xe2) r8
                ir.mservices.market.app.detail.ui.AppDetailViewModel$1$1 r0 = new ir.mservices.market.app.detail.ui.AppDetailViewModel$1$1
                r0.<init>(r3, r6)
                r7.b = r6
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r0, r7)
                if (r8 != r1) goto L4d
            L4c:
                return r1
            L4d:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$2", f = "AppDetailViewModel.kt", l = {237}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$2$1", f = "AppDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ AppDetailViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppDetailViewModel appDetailViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = appDetailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ReviewResultDto) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ReviewResultDto reviewResultDto = (ReviewResultDto) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                AppDetailViewModel appDetailViewModel = this.b;
                appDetailViewModel.N0 = reviewResultDto;
                l lVar = appDetailViewModel.A0;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, reviewResultDto));
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new AnonymousClass2(g51Var);
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
                AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
                vb7 vb7Var = appDetailViewModel.S0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(appDetailViewModel, null);
                this.a = 1;
                if (d.f(vb7Var, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$3", f = "AppDetailViewModel.kt", l = {243}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new AnonymousClass3(g51Var);
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
                kotlin.b.b(obj);
                AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
                vb7 vb7Var = appDetailViewModel.T0;
                wp wpVar = new wp(appDetailViewModel, 0);
                this.a = 1;
                if (vb7Var.a(wpVar, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$4, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$4", f = "AppDetailViewModel.kt", l = {1404}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass4(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new AnonymousClass4(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
            pv6 pv6Var = appDetailViewModel.u;
            wp wpVar = new wp(appDetailViewModel, 1);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(wpVar, 10), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$5, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$5", f = "AppDetailViewModel.kt", l = {261}, m = "invokeSuspend", v = 1)
    final class AnonymousClass5 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$5$2, reason: invalid class name */
        @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$5$2", f = "AppDetailViewModel.kt", l = {262}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ AppDetailViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AppDetailViewModel appDetailViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = appDetailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass2(this.b, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((String) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    AppDetailViewModel appDetailViewModel = this.b;
                    i iVar = appDetailViewModel.x0;
                    String str = appDetailViewModel.J0.a;
                    this.a = 1;
                    if (iVar.emit(str, this) == coroutineSingletons) {
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

        public AnonymousClass5(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new AnonymousClass5(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
                xp xpVar = new xp(appDetailViewModel.F.k, appDetailViewModel, 0);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(appDetailViewModel, null);
                this.a = 1;
                if (d.f(xpVar, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$addBookmark$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel", f = "AppDetailViewModel.kt", l = {1222, 1225, 1226, 1230}, m = "addBookmark", v = 1)
    public static final class C01561 extends ContinuationImpl {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public C01561(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AppDetailViewModel.this.addBookmark(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$1", f = "AppDetailViewModel.kt", l = {306}, m = "invokeSuspend", v = 1)
    public static final class C01571 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ApplicationFullDto b;
        public final /* synthetic */ AppDetailViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01571(g51 g51Var, ApplicationFullDto applicationFullDto, AppDetailViewModel appDetailViewModel) {
            super(2, g51Var);
            this.b = applicationFullDto;
            this.c = appDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new C01571(g51Var, this.b, this.c);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01571) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Pair pair;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            ApplicationFullDto applicationFullDto = this.b;
            if (i == 0) {
                kotlin.b.b(obj);
                AppDetailNotificationDto notification = applicationFullDto.getNotification();
                long delay = notification != null ? ((long) notification.getDelay()) * 1000 : 0L;
                this.a = 1;
                if (kotlinx.coroutines.a.e(delay, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            l lVar = this.c.R;
            do {
                value = lVar.getValue();
                pair = (Pair) value;
                if (pair.a == null) {
                    AppDetailNotificationDto notification2 = applicationFullDto.getNotification();
                    pair = new Pair(notification2 != null ? notification2.getPushMessage() : null, Boolean.FALSE);
                }
            } while (!lVar.n(value, pair));
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$2, reason: invalid class name and case insensitive filesystem */
    public static final /* synthetic */ class C01582 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((AppDetailViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$23, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$23", f = "AppDetailViewModel.kt", l = {583}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass23 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass23(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new AnonymousClass23(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass23) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
                List list = appDetailViewModel.Y0;
                if (list != null) {
                    kotlinx.coroutines.channels.a aVar = appDetailViewModel.X0;
                    this.a = 1;
                    if (aVar.c(this, list) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$3, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$3", f = "AppDetailViewModel.kt", l = {336}, m = "invokeSuspend", v = 1)
    public static final class C01593 extends SuspendLambda implements qp2 {
        public int a;

        public C01593(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01593(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01593) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (kotlinx.coroutines.a.e(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            AppDetailViewModel.this.e();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$6, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$6", f = "AppDetailViewModel.kt", l = {364}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass6 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ AppDetailViewModel b;
        public final /* synthetic */ ApplicationFullDto c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(g51 g51Var, ApplicationFullDto applicationFullDto, AppDetailViewModel appDetailViewModel) {
            super(2, g51Var);
            this.b = appDetailViewModel;
            this.c = applicationFullDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass6(g51Var, this.c, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.channels.a aVar = this.b.Z0;
                SummaryListDto summaryList = this.c.getSummaryList();
                List<SummaryDto> items = summaryList != null ? summaryList.getItems() : null;
                this.a = 1;
                if (aVar.c(this, items) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$appMapperRecyclerData$7, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((AppDetailViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$cancelQuestion$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel", f = "AppDetailViewModel.kt", l = {1195, 1198}, m = "cancelQuestion", v = 1)
    public static final class C01601 extends ContinuationImpl {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public C01601(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AppDetailViewModel.this.cancelQuestion(this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$createHomeBannersRowData$2, reason: invalid class name and case insensitive filesystem */
    public static final /* synthetic */ class C01612 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((AppDetailViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$deleteBookmark$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel", f = "AppDetailViewModel.kt", l = {1205, 1208, 1209, 1213}, m = "deleteBookmark", v = 1)
    public static final class C01621 extends ContinuationImpl {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public C01621(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AppDetailViewModel.this.deleteBookmark(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$moveRecommendation$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$moveRecommendation$1", f = "AppDetailViewModel.kt", l = {1145}, m = "invokeSuspend", v = 1)
    public static final class C01631 extends SuspendLambda implements qp2 {
        public int a;

        public C01631(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01631(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01631) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (kotlinx.coroutines.a.e(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
            appDetailViewModel.L0 = true;
            appDetailViewModel.M0 = true;
            appDetailViewModel.i();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$onEvent$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$onEvent$1", f = "AppDetailViewModel.kt", l = {1272}, m = "invokeSuspend", v = 1)
    public static final class C01641 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ly5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01641(ly5 ly5Var, g51 g51Var) {
            super(2, g51Var);
            this.c = ly5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01641(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01641) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = appDetailViewModel.x0;
                String str = this.c.a;
                this.a = 1;
                if (iVar.emit(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            appDetailViewModel.i();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$onEvent$2, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$onEvent$2", f = "AppDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C01652 extends SuspendLambda implements qp2 {
        public C01652(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01652(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            C01652 c01652 = (C01652) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            c01652.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            AppDetailViewModel.this.i();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$onReviewAILikeAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$onReviewAILikeAction$1", f = "AppDetailViewModel.kt", l = {1290, 1291}, m = "invokeSuspend", v = 1)
    public static final class C01661 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ AppDetailAction.ReviewAILikeAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01661(AppDetailAction.ReviewAILikeAction reviewAILikeAction, g51 g51Var) {
            super(2, g51Var);
            this.c = reviewAILikeAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01661(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01661) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            AppDetailAction.ReviewAILikeAction reviewAILikeAction = this.c;
            AppDetailViewModel appDetailViewModel = AppDetailViewModel.this;
            if (i == 0) {
                kotlin.b.b(obj);
                l lVar = appDetailViewModel.V0;
                Boolean boolValueOf = Boolean.valueOf(reviewAILikeAction.isPositive());
                this.a = 1;
                lVar.emit(boolValueOf, this);
                if (tx8Var != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            v24 v24Var = appDetailViewModel.v;
            AILikeReviewDto aILikeReviewDto = new AILikeReviewDto(reviewAILikeAction.isPositive());
            String str = appDetailViewModel.J0.a;
            String id = reviewAILikeAction.getId();
            this.a = 2;
            gk1 gk1Var = (gk1) v24Var.a;
            gk1Var.getClass();
            z57 z57VarCreateRequestUrl = gk1Var.createRequestUrl("v1/applications", "{packageName}/reviews/ai/{id}", kotlin.collections.b.O(new Pair("packageName", str), new Pair("id", id)), gk1Var.getCommonQueryParam());
            Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.app.detail.services.DetailService$putAILikeReview$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            return dy3.I(gk1Var, type, z57VarCreateRequestUrl, aILikeReviewDto, appDetailViewModel, null, this, 496) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailViewModel$startAppBarAnimation$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$startAppBarAnimation$1", f = "AppDetailViewModel.kt", l = {599, 600, 601}, m = "invokeSuspend", v = 1)
    public static final class C01671 extends SuspendLambda implements qp2 {
        public int a;

        public C01671(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailViewModel.this.new C01671(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01671) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                ir.mservices.market.app.detail.ui.AppDetailViewModel r0 = ir.mservices.market.app.detail.ui.AppDetailViewModel.this
                kotlinx.coroutines.flow.l r0 = r0.Z
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r7.a
                r3 = 3
                r4 = 2
                r5 = 1
                tx8 r6 = defpackage.tx8.a
                if (r2 == 0) goto L29
                if (r2 == r5) goto L25
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                kotlin.b.b(r8)
                return r6
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                kotlin.b.b(r8)
                goto L41
            L25:
                kotlin.b.b(r8)
                goto L36
            L29:
                kotlin.b.b(r8)
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r7.a = r5
                r0.emit(r8, r7)
                if (r6 != r1) goto L36
                goto L4a
            L36:
                r7.a = r4
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = kotlinx.coroutines.a.e(r4, r7)
                if (r8 != r1) goto L41
                goto L4a
            L41:
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r7.a = r3
                r0.emit(r8, r7)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.C01671.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel(jd7 jd7Var, v24 v24Var, xg5 xg5Var, wv8 wv8Var, t15 t15Var, yl5 yl5Var, ir.mservices.market.version2.manager.install.a aVar, dp3 dp3Var, wt wtVar, ps1 ps1Var, ir.mservices.market.version2.manager.a aVar2, vr2 vr2Var, vr2 vr2Var2, ir.mservices.market.app.update.common.manager.a aVar3, c5 c5Var, ql4 ql4Var, ut4 ut4Var, ec9 ec9Var) {
        String clickCallback;
        String installCallbackUrl;
        AppBarSampleData appBarSampleData;
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar, "installQueue");
        js3.p(dp3Var, "installManager");
        js3.p(wtVar, "appUpdateRepository");
        js3.p(ps1Var, "downloadManager");
        js3.p(aVar2, "appManager");
        js3.p(aVar3, "appUpdateManager");
        js3.p(c5Var, "accountManager");
        js3.p(ec9Var, "vpnUtils");
        this.v = v24Var;
        this.w = xg5Var;
        this.x = wv8Var;
        this.y = t15Var;
        this.z = yl5Var;
        this.A = aVar;
        this.B = dp3Var;
        this.C = wtVar;
        this.D = ps1Var;
        this.E = aVar2;
        this.F = aVar3;
        this.G = c5Var;
        this.H = ql4Var;
        this.I = ut4Var;
        this.J = ec9Var;
        Boolean bool = Boolean.FALSE;
        this.O = ja1.b(bool);
        l lVarB = ja1.b(null);
        this.P = lVarB;
        this.Q = new rv6(lVarB);
        l lVarB2 = ja1.b(new Pair(null, bool));
        this.R = lVarB2;
        this.S = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.T = iVarE;
        this.U = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.V = iVarE2;
        this.W = new pv6(iVarE2);
        this.X = ja1.b(bool);
        this.Y = ja1.b(null);
        this.Z = ja1.b(null);
        i iVarE3 = vy2.e(0, 7, null);
        this.x0 = iVarE3;
        this.y0 = new pv6(iVarE3);
        this.z0 = ja1.b(Float.valueOf(0.0f));
        l lVarB3 = ja1.b(null);
        this.A0 = lVarB3;
        this.B0 = new rv6(lVarB3);
        i iVarE4 = vy2.e(0, 7, null);
        this.C0 = iVarE4;
        this.D0 = new pv6(iVarE4);
        this.E0 = vy2.e(0, 7, null);
        i iVarE5 = vy2.e(0, 7, null);
        this.F0 = iVarE5;
        this.G0 = new pv6(iVarE5);
        this.H0 = ja1.b(null);
        this.I0 = ja1.b(0L);
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("isStartDownload")) {
            throw new IllegalArgumentException("Required argument \"isStartDownload\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) jd7Var.b("isStartDownload");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"isStartDownload\" of type boolean does not support null values");
        }
        if (!jd7Var.a("launcherSource")) {
            throw new IllegalArgumentException("Required argument \"launcherSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) jd7Var.b("launcherSource");
        if (tracker == null) {
            throw new IllegalArgumentException("Argument \"launcherSource\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("hasIcon")) {
            throw new IllegalArgumentException("Required argument \"hasIcon\" is missing and does not have an android:defaultValue");
        }
        Boolean bool3 = (Boolean) jd7Var.b("hasIcon");
        if (bool3 == null) {
            throw new IllegalArgumentException("Argument \"hasIcon\" of type boolean does not support null values");
        }
        if (!jd7Var.a("q")) {
            throw new IllegalArgumentException("Required argument \"q\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("q");
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("refId");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("callbackUrl")) {
            throw new IllegalArgumentException("Required argument \"callbackUrl\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) jd7Var.b("callbackUrl");
        if (!jd7Var.a("installCallbackUrl")) {
            throw new IllegalArgumentException("Required argument \"installCallbackUrl\" is missing and does not have an android:defaultValue");
        }
        String str5 = (String) jd7Var.b("installCallbackUrl");
        if (!jd7Var.a("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(StartApplicationData.class) && !Serializable.class.isAssignableFrom(StartApplicationData.class)) {
            throw new UnsupportedOperationException(StartApplicationData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        StartApplicationData startApplicationData = (StartApplicationData) jd7Var.b("data");
        if (!jd7Var.a("utm")) {
            throw new IllegalArgumentException("Required argument \"utm\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Utm.class) && !Serializable.class.isAssignableFrom(Utm.class)) {
            throw new UnsupportedOperationException(Utm.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Utm utm = (Utm) jd7Var.b("utm");
        if (!jd7Var.a("caller")) {
            throw new IllegalArgumentException("Required argument \"caller\" is missing and does not have an android:defaultValue");
        }
        String str6 = (String) jd7Var.b("caller");
        if (!jd7Var.a("deepLink")) {
            throw new IllegalArgumentException("Required argument \"deepLink\" is missing and does not have an android:defaultValue");
        }
        String str7 = (String) jd7Var.b("deepLink");
        if (!jd7Var.a("clickCallback")) {
            throw new IllegalArgumentException("Required argument \"clickCallback\" is missing and does not have an android:defaultValue");
        }
        String str8 = (String) jd7Var.b("clickCallback");
        this.J0 = new hp(str, bool2.booleanValue(), tracker, bool3.booleanValue(), str2, str3, str4, str5, startApplicationData, utm, str6, str7, str8);
        this.K0 = startApplicationData;
        this.O0 = (startApplicationData == null || (appBarSampleData = startApplicationData.getAppBarSampleData()) == null) ? null : appBarSampleData.getTagLine();
        this.P0 = new LinkedHashMap();
        StartApplicationData startApplicationData2 = this.K0;
        this.Q0 = (startApplicationData2 == null || (installCallbackUrl = startApplicationData2.getInstallCallbackUrl()) == null) ? str5 : installCallbackUrl;
        StartApplicationData startApplicationData3 = this.K0;
        this.R0 = (startApplicationData3 == null || (clickCallback = startApplicationData3.getClickCallback()) == null) ? str8 : clickCallback;
        this.S0 = new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(vr2Var.g.f, null, str));
        ir.mservices.market.common.model.a aVar4 = vr2Var2.g;
        this.T0 = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar4.h, null, str, aVar4));
        this.U0 = ja1.b(null);
        this.V0 = ja1.b(null);
        this.W0 = ja1.b(bool);
        this.X0 = dt2.b(0, 7, null);
        this.Z0 = dt2.b(0, 7, null);
        this.a1 = kotlin.a.a(new x2(6, this));
        this.b1 = ja1.b(bool);
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass4(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass5(null), 3);
    }

    public static int[] Q(List list) {
        if (list == null) {
            return new int[5];
        }
        ArrayList<RateDto> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RateDto) obj).getValue() - 1 >= 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        for (RateDto rateDto : arrayList) {
            arrayList2.add(Integer.valueOf(rateDto.getRateOnlyCount() + rateDto.getCount()));
        }
        return kotlin.collections.a.O0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object addBookmark(ir.mservices.market.version2.webapi.requestdto.BookmarkRequestDTO r17, defpackage.g51<? super defpackage.tx8> r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.addBookmark(ir.mservices.market.version2.webapi.requestdto.BookmarkRequestDTO, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bz6 appBarRecyclerData_delegate$lambda$0(AppDetailViewModel appDetailViewModel) {
        v24 v24Var = appDetailViewModel.v;
        String str = appDetailViewModel.J0.a;
        l lVar = appDetailViewModel.U0;
        kotlinx.coroutines.channels.a aVar = appDetailViewModel.Z0;
        v24Var.getClass();
        js3.p(str, "packageName");
        js3.p(lVar, "diffStatusFlow");
        js3.p(aVar, "summariesReceiveChannel");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new pp(str, lVar, aVar, v24Var, 0)).a, new k7(10)), y97.G(appDetailViewModel)), null, new AppDetailViewModel$appBarRecyclerData$2$2(2, appDetailViewModel, AppDetailViewModel.class, "setSummaryDivider", "setSummaryDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List appBarRecyclerData_delegate$lambda$0$0(List list) {
        js3.p(list, "i");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ir.mservices.market.common.ui.recycler.RecyclerItem> appMapperRecyclerData(ir.mservices.market.app.detail.data.ApplicationFullDto r48) {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.appMapperRecyclerData(ir.mservices.market.app.detail.data.ApplicationFullDto):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cancelQuestion(defpackage.g51<? super defpackage.tx8> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ir.mservices.market.app.detail.ui.AppDetailViewModel.C01601
            if (r0 == 0) goto L13
            r0 = r7
            ir.mservices.market.app.detail.ui.AppDetailViewModel$cancelQuestion$1 r0 = (ir.mservices.market.app.detail.ui.AppDetailViewModel.C01601) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ir.mservices.market.app.detail.ui.AppDetailViewModel$cancelQuestion$1 r0 = new ir.mservices.market.app.detail.ui.AppDetailViewModel$cancelQuestion$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            kotlin.b.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            int r2 = r0.b
            kotlin.b.b(r7)
            goto L62
        L3a:
            kotlin.b.b(r7)
            ir.mservices.market.app.detail.data.ApplicationFullDto r7 = r6.R()
            if (r7 == 0) goto L7c
            java.lang.String r7 = r7.getPackageName()
            if (r7 == 0) goto L7c
            ir.mservices.market.app.survey.data.CancelQuestionRequestDto r2 = new ir.mservices.market.app.survey.data.CancelQuestionRequestDto
            r5 = 0
            r2.<init>(r5)
            r5 = 0
            r0.b = r5
            r0.e = r4
            v24 r4 = r6.v
            java.lang.Object r4 = r4.b
            uc8 r4 = (defpackage.uc8) r4
            java.lang.Object r7 = r4.g(r7, r2, r6, r0)
            if (r7 != r1) goto L61
            goto L77
        L61:
            r2 = r5
        L62:
            r4 = r7
            n99 r4 = (defpackage.n99) r4
            boolean r5 = r4 instanceof defpackage.h99
            if (r5 == 0) goto L7a
            r0.a = r7
            r0.b = r2
            r0.e = r3
            kotlinx.coroutines.flow.i r2 = r6.C0
            java.lang.Object r0 = r2.emit(r4, r0)
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            r0 = r7
        L79:
            r7 = r0
        L7a:
            n99 r7 = (defpackage.n99) r7
        L7c:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.cancelQuestion(g51):java.lang.Object");
    }

    private final List<MyketRecyclerData> createDeveloperData(AppDeveloperDto appDeveloperDto) {
        ArrayList arrayList = new ArrayList();
        String name = appDeveloperDto.getName();
        String str = null;
        if (name == null || f88.n0(name)) {
            name = null;
        }
        if (name != null) {
            BadgeDTO badge = appDeveloperDto.getBadge();
            boolean z = false;
            if (badge != null && badge.hasBadge()) {
                z = true;
            }
            arrayList.add(new AppDeveloperInfoModuleData(new el1(name, z)));
        }
        String email = appDeveloperDto.getEmail();
        if (email == null || f88.n0(email)) {
            email = null;
        }
        if (email != null) {
            arrayList.add(new AppDeveloperInfoModuleData(new dl1(email)));
        }
        String website = appDeveloperDto.getWebsite();
        if (website == null || f88.n0(website)) {
            website = null;
        }
        if (website != null) {
            arrayList.add(new AppDeveloperInfoModuleData(new gl1(website)));
        }
        String phone = appDeveloperDto.getPhone();
        if (phone != null && !f88.n0(phone)) {
            str = phone;
        }
        if (str != null) {
            arrayList.add(new AppDeveloperInfoModuleData(new fl1(str)));
        }
        return arrayList;
    }

    private final MovieHomeBannersRowData createHomeBannersRowData(HomeMovieBannerListDto homeMovieBannerListDto) {
        return new MovieHomeBannersRowData(homeMovieBannerListDto, new bz6(e.b(gu9.x(this.I.i(homeMovieBannerListDto, homeMovieBannerListDto.getBannerListKey(), homeMovieBannerListDto.getRefId(), this), new k7(5)), y97.G(this)), null, null, null, 14), true, null, false, false, null, false, null, homeMovieBannerListDto.getSpan(), homeMovieBannerListDto.getDisplayMode(), new C01612(1, this, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 488);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List createHomeBannersRowData$lambda$0(HomeMovieBannerListDto homeMovieBannerListDto) {
        js3.p(homeMovieBannerListDto, "dto");
        List<HomeMovieBannerDto> banners = homeMovieBannerListDto.getBanners();
        ArrayList arrayList = new ArrayList(wu0.V(banners, 10));
        Iterator<T> it = banners.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new MovieHomeBannersItemData((HomeMovieBannerDto) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteBookmark(ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto r10, defpackage.g51<? super defpackage.tx8> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ir.mservices.market.app.detail.ui.AppDetailViewModel.C01621
            if (r0 == 0) goto L13
            r0 = r11
            ir.mservices.market.app.detail.ui.AppDetailViewModel$deleteBookmark$1 r0 = (ir.mservices.market.app.detail.ui.AppDetailViewModel.C01621) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ir.mservices.market.app.detail.ui.AppDetailViewModel$deleteBookmark$1 r0 = new ir.mservices.market.app.detail.ui.AppDetailViewModel$deleteBookmark$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            kotlinx.coroutines.flow.i r3 = r9.T
            tx8 r4 = defpackage.tx8.a
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L4c
            if (r2 == r8) goto L48
            if (r2 == r7) goto L40
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            kotlin.b.b(r11)
            return r4
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.b.b(r11)
            return r4
        L40:
            int r10 = r0.b
            java.lang.Object r2 = r0.a
            kotlin.b.b(r11)
            goto L76
        L48:
            kotlin.b.b(r11)
            goto L5c
        L4c:
            kotlin.b.b(r11)
            r0.e = r8
            ql4 r11 = r9.H
            java.lang.String r2 = "BOOKMARK_REQUEST_TAG"
            java.lang.Object r11 = r11.z(r2, r10, r0)
            if (r11 != r1) goto L5c
            goto La3
        L5c:
            r10 = r11
            n99 r10 = (defpackage.n99) r10
            boolean r2 = r10 instanceof defpackage.l99
            r8 = 0
            if (r2 == 0) goto L8a
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r0.a = r11
            r0.b = r8
            r0.e = r7
            kotlinx.coroutines.flow.l r2 = r9.O
            r2.emit(r10, r0)
            if (r4 != r1) goto L74
            goto La3
        L74:
            r2 = r11
            r10 = r8
        L76:
            l99 r11 = new l99
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r11.<init>(r5)
            r0.a = r2
            r0.b = r10
            r0.e = r6
            java.lang.Object r10 = r3.emit(r11, r0)
            if (r10 != r1) goto La4
            goto La3
        L8a:
            boolean r2 = r10 instanceof defpackage.h99
            if (r2 == 0) goto La4
            h99 r2 = new h99
            h99 r10 = (defpackage.h99) r10
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r10 = r10.a
            r2.<init>(r10)
            r0.a = r11
            r0.b = r8
            r0.e = r5
            java.lang.Object r10 = r3.emit(r2, r0)
            if (r10 != r1) goto La4
        La3:
            return r1
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.deleteBookmark(ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto, g51):java.lang.Object");
    }

    private final List<MyketRecyclerData> generateComments(String str, AppRateDto appRateDto, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        List<ReviewDto> reviews = appRateDto.getReviews();
        boolean z2 = reviews == null || reviews.isEmpty();
        boolean z3 = (appRateDto.getUserReview() == null && this.N0 == null) ? false : true;
        if (appRateDto.getTotal() >= 0.5d || !z2 || z3) {
            str2 = str;
            arrayList.add(new ReviewsMoreTitleRowData(rs6.other_review_title, appRateDto.getRates(), str2, appRateDto.getTotal()));
        } else {
            str2 = str;
        }
        if (appRateDto.getTotal() >= 0.5d && (!z2 || z3)) {
            arrayList.add(new ReviewHeaderData(Q(appRateDto.getRates()), appRateDto.getTotal(), appRateDto.getRates(), str2, false, false, false));
        }
        if (z3) {
            int i = pq6.margin_default_v2_half;
            List<ReviewDto> reviews2 = appRateDto.getReviews();
            if (reviews2 == null || reviews2.isEmpty()) {
                i = pq6.margin_default_v2_oneHalf;
            }
            int i2 = i;
            int i3 = this.M ? 3 : -1;
            ReviewDto userReview = this.N0;
            if (userReview == null) {
                userReview = appRateDto.getUserReview();
            }
            l lVar = this.A0;
            lVar.o(userReview);
            arrayList.add(new OwnReviewData(str, lVar, false, false, false, i2, this.T0, i3));
        }
        AIReviewDto ai = appRateDto.getAi();
        if (ai != null) {
            arrayList.add(new AIReviewSummaryData(ai, this.V0, this.W0));
        }
        List<ReviewDto> reviews3 = appRateDto.getReviews();
        if (reviews3 != null) {
            if (reviews3.isEmpty()) {
                reviews3 = null;
            }
            if (reviews3 != null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList(wu0.V(reviews3, 10));
                for (ReviewDto reviewDto : reviews3) {
                    arrayList3.add(new ReviewData(reviewDto, str, z, !m88.T(this.G.h.e(), reviewDto.getAccountKey(), true) || reviewDto.canRemove(), false, false, null, this.M ? -1 : 3, this.Y));
                }
                arrayList2.addAll(arrayList3);
                if (this.M && arrayList2.size() % 2 == 1) {
                    arrayList2.add(new ReviewEmptyData());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new CommentMoreData(appRateDto.getRates()));
            }
        }
        return arrayList;
    }

    private final List<MyketRecyclerData> generateRecommendation(List<RecommendationDto> list, String str, DisplayMode displayMode) {
        String extensionUrl;
        AppDetailViewModel appDetailViewModel = this;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (RecommendationDto recommendationDto : list) {
                String type = recommendationDto.getType();
                if (type != null && !f88.n0(type)) {
                    String mode = displayMode != null ? displayMode.getMode() : null;
                    String extensionUrl2 = recommendationDto.getExtensionUrl();
                    String type2 = recommendationDto.getType();
                    if (mode == null) {
                        mode = recommendationDto.getMode();
                    }
                    ExtensionPointDto extensionPointDto = new ExtensionPointDto(extensionUrl2, type2, null, mode);
                    boolean z = displayMode != null;
                    boolean zIsEmpty = recommendationDto.getApplications().isEmpty();
                    i iVar = appDetailViewModel.F0;
                    if (zIsEmpty && (extensionUrl = recommendationDto.getExtensionUrl()) != null && !f88.n0(extensionUrl)) {
                        boolean zEqualsIgnoreCase = ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(recommendationDto.getType());
                        wv8 wv8Var = appDetailViewModel.x;
                        if (zEqualsIgnoreCase) {
                            ((AppUpdateRepositoryImpl) appDetailViewModel.C).a(false);
                            wv8Var.getClass();
                            pv6 pv6VarB = e.b((xe2) new m(gu9.o(false), new ir.mservices.market.common.ext.model.b(wv8Var, appDetailViewModel, z)).a, y97.G(appDetailViewModel));
                            arrayList.add(new ExtHeaderRowData(getExtHeaderUpdateApps(extensionPointDto, recommendationDto.getExtensionUrl(), recommendationDto.getTitle(), recommendationDto.getAdInfoDto(), pv6VarB), t61.i(recommendationDto.getType(), "_header"), false, new AppDetailViewModel$generateRecommendation$1$1$1(1, this, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 60));
                            arrayList.add(new HomeAppsRowData(null, displayMode == null ? recommendationDto : displayMode, getUpdateExtensionApps(extensionPointDto, pv6VarB, displayMode == null ? recommendationDto : displayMode), iVar, recommendationDto.getType(), false, new AppDetailViewModel$generateRecommendation$1$1$2(1, this, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 32));
                        } else {
                            String extensionUrl3 = recommendationDto.getExtensionUrl();
                            wv8Var.getClass();
                            js3.p(extensionUrl3, "url");
                            pv6 pv6VarB2 = e.b((xe2) new m(gu9.o(true), new c(wv8Var, extensionUrl3, appDetailViewModel, z)).a, y97.G(appDetailViewModel));
                            AppDetailViewModel appDetailViewModel2 = appDetailViewModel;
                            arrayList.add(new ExtHeaderRowData(appDetailViewModel.getExtHeaderApps(extensionPointDto, recommendationDto.getExtensionUrl(), pv6VarB2, displayMode == null ? recommendationDto : displayMode), t61.i(recommendationDto.getType(), "_header"), false, new AppDetailViewModel$generateRecommendation$1$2(1, appDetailViewModel, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 60));
                            arrayList.add(new HomeAppsRowData(null, displayMode == null ? recommendationDto : displayMode, appDetailViewModel2.getExtensionApps(extensionPointDto, pv6VarB2, displayMode == null ? recommendationDto : displayMode), iVar, recommendationDto.getType(), false, new AppDetailViewModel$generateRecommendation$1$3(1, this, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 32));
                        }
                    } else if (!recommendationDto.getApplications().isEmpty()) {
                        String type3 = recommendationDto.getType();
                        HomeAppsRowData homeAppsRowData = new HomeAppsRowData(null, displayMode == null ? recommendationDto : displayMode, appDetailViewModel.getRecommendationAppNestedList(recommendationDto, str, recommendationDto.getType(), z), iVar, type3, false, new AppDetailViewModel$generateRecommendation$1$detailAppRowData$1(1, appDetailViewModel, AppDetailViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 32);
                        String title = recommendationDto.getTitle();
                        if (title != null && !f88.n0(title)) {
                            String title2 = recommendationDto.getTitle();
                            AdInfoDto adInfoDto = recommendationDto.getAdInfoDto();
                            String type4 = recommendationDto.getType();
                            ArrayList arrayListQ0 = kotlin.collections.a.Q0(recommendationDto.getApplications());
                            List<String> ignoreConditions = recommendationDto.getIgnoreConditions();
                            arrayList.add(new HomeMoreTitleRowData(title2, str, adInfoDto, false, type4, arrayListQ0, ignoreConditions != null ? kotlin.collections.a.Q0(ignoreConditions) : null, type3, 8));
                        }
                        arrayList.add(homeAppsRowData);
                    }
                }
                appDetailViewModel = this;
            }
        }
        return arrayList;
    }

    private final bz6 getAppBarRecyclerData() {
        return (bz6) this.a1.getValue();
    }

    private static final String getCallbackUrl$lambda$0(AppDetailViewModel appDetailViewModel) {
        ApplicationFullDto applicationFullDtoR = appDetailViewModel.R();
        String callbackUrl = applicationFullDtoR != null ? applicationFullDtoR.getCallbackUrl() : null;
        return callbackUrl == null ? "" : callbackUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDownloadRefId$lambda$0() {
        return "OpenIntent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDownloadRefId$lambda$1() {
        return "ServerUnknown";
    }

    private final bz6 getExtHeaderApps(ExtensionPointDto extensionPointDto, String str, xe2 xe2Var, DisplayMode displayMode) {
        String str2 = extensionPointDto.getType() + "_" + displayMode.getMode() + "_header";
        LinkedHashMap linkedHashMap = this.P0;
        bz6 bz6Var = (bz6) linkedHashMap.get(str2);
        if (bz6Var != null) {
            return bz6Var;
        }
        bz6 bz6Var2 = new bz6(e.b(gu9.x(xe2Var, new up(extensionPointDto, str, 0)), y97.G(this)), null, null, e.b(gu9.x(this.y.h(extensionPointDto, ExtensionPointDto.TYPE_HEADER), new k7(8)), y97.G(this)), 6);
        linkedHashMap.put(rm7.q(extensionPointDto.getType(), "_", displayMode.getMode(), "_header"), bz6Var2);
        return bz6Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderApps$lambda$0(ExtensionPointDto extensionPointDto, String str, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        ArrayList arrayList = new ArrayList();
        String title = homeExtensionAppsDto.getTitle();
        if (title != null && !f88.n0(title) && !homeExtensionAppsDto.getApps().isEmpty()) {
            arrayList.add(new RecyclerItem(new ExtHeaderData(extensionPointDto.getType(), str, homeExtensionAppsDto.getTitle(), homeExtensionAppsDto.getAdInfoDto())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderApps$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getExtHeaderUpdateApps(ExtensionPointDto extensionPointDto, String str, String str2, AdInfoDto adInfoDto, xe2 xe2Var) {
        String type = extensionPointDto.getType();
        if (type == null) {
            type = "Update";
        }
        String str3 = type;
        String strConcat = str3.concat("_header");
        LinkedHashMap linkedHashMap = this.P0;
        bz6 bz6Var = (bz6) linkedHashMap.get(strConcat);
        if (bz6Var != null) {
            return bz6Var;
        }
        bz6 bz6Var2 = new bz6(e.b(gu9.x(xe2Var, new zi(str2, str3, str, adInfoDto, 1)), y97.G(this)), null, null, e.b(gu9.x(this.y.h(extensionPointDto, ExtensionPointDto.TYPE_HEADER), new k7(6)), y97.G(this)), 6);
        linkedHashMap.put(str3.concat("_header"), bz6Var2);
        return bz6Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderUpdateApps$lambda$0(String str, String str2, String str3, AdInfoDto adInfoDto, ApplicationStateListDto applicationStateListDto) {
        List<ApplicationStateDto> items;
        js3.p(applicationStateListDto, "it");
        ArrayList arrayList = new ArrayList();
        if (str != null && !f88.n0(str) && (items = applicationStateListDto.getItems()) != null && !items.isEmpty()) {
            arrayList.add(new RecyclerItem(new ExtHeaderData(str2, str3, str, adInfoDto)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderUpdateApps$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getExtensionApps(ExtensionPointDto extensionPointDto, xe2 xe2Var, DisplayMode displayMode) {
        String str = extensionPointDto.getType() + "_" + displayMode.getMode();
        LinkedHashMap linkedHashMap = this.P0;
        bz6 bz6Var = (bz6) linkedHashMap.get(str);
        if (bz6Var != null) {
            return bz6Var;
        }
        bz6 bz6Var2 = new bz6(e.b(gu9.x(xe2Var, new tp(extensionPointDto, this, 1)), y97.G(this)), null, null, e.b(gu9.x(this.y.g(extensionPointDto), new k7(9)), y97.G(this)), 6);
        linkedHashMap.put(extensionPointDto.getType() + "_" + displayMode.getMode(), bz6Var2);
        return bz6Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$0(ExtensionPointDto extensionPointDto, AppDetailViewModel appDetailViewModel, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            boolean zIsMulti = extensionPointDto.isMulti();
            yl5 yl5Var = appDetailViewModel.z;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, zIsMulti, yl5Var.a(packageName), appDetailViewModel.A.b, extensionPointDto.isDigested(), 64, 0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private static final String getInstallCallbackUrl$lambda$0(AppDetailViewModel appDetailViewModel) {
        ApplicationFullDto applicationFullDtoR = appDetailViewModel.R();
        String installCallbackUrl = applicationFullDtoR != null ? applicationFullDtoR.getInstallCallbackUrl() : null;
        return installCallbackUrl == null ? "" : installCallbackUrl;
    }

    private final bz6 getRecommendationAppNestedList(final RecommendationDto recommendationDto, String str, String str2, final boolean z) {
        return new bz6(e.b(gu9.x(this.w.c(recommendationDto, str, str2, z, this), new dp2() { // from class: vp
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return AppDetailViewModel.getRecommendationAppNestedList$lambda$0(z, recommendationDto, this, (ApplicationListDto) obj);
            }
        }), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRecommendationAppNestedList$lambda$0(boolean z, RecommendationDto recommendationDto, AppDetailViewModel appDetailViewModel, ApplicationListDto applicationListDto) {
        js3.p(applicationListDto, "it");
        List<ApplicationDTO> list = applicationListDto.getList();
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (ApplicationDTO applicationDTO : list) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            boolean zIsDigested = true;
            boolean zIsMulti = !z ? recommendationDto.isMulti() : true;
            yl5 yl5Var = appDetailViewModel.z;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            xe2 xe2VarA = yl5Var.a(packageName);
            pv6 pv6Var = appDetailViewModel.A.b;
            if (!z) {
                zIsDigested = recommendationDto.isDigested();
            }
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, zIsMulti, xe2VarA, pv6Var, zIsDigested, 64, 0)));
        }
        return arrayList;
    }

    private final List<RecyclerItem> getScreeShots(List<ScreenshotDto> list, VideoShotDto videoShotDto, String str) {
        ArrayList arrayList = new ArrayList();
        if (videoShotDto != null) {
            arrayList.add(new RecyclerItem(new AppVideoShotData(str, videoShotDto, this.E0, T(), S(), U(), this.R0)));
        }
        List<ScreenshotDto> list2 = list;
        ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new RecyclerItem(new AppScreenshotData((ScreenshotDto) it.next(), list2, str, T(), S(), U(), this.R0)));
            list2 = list;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private final bz6 getUpdateExtensionApps(ExtensionPointDto extensionPointDto, xe2 xe2Var, DisplayMode displayMode) {
        String strI = t61.i(extensionPointDto.getType(), displayMode.getMode());
        LinkedHashMap linkedHashMap = this.P0;
        bz6 bz6Var = (bz6) linkedHashMap.get(strI);
        if (bz6Var != null) {
            return bz6Var;
        }
        bz6 bz6Var2 = new bz6(e.b(gu9.x(xe2Var, new tp(extensionPointDto, this, 0)), y97.G(this)), null, null, e.b(gu9.x(this.y.g(extensionPointDto), new k7(7)), y97.G(this)), 6);
        linkedHashMap.put(strI, bz6Var2);
        return bz6Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUpdateExtensionApps$lambda$0(ExtensionPointDto extensionPointDto, AppDetailViewModel appDetailViewModel, ApplicationStateListDto applicationStateListDto) {
        RecyclerItem recyclerItem;
        js3.p(applicationStateListDto, "it");
        List<ApplicationStateDto> items = applicationStateListDto.getItems();
        js3.o(items, "getItems(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            DownloadSummeryApplicationDto app = ((ApplicationStateDto) it.next()).getApp();
            if (app != null) {
                String title = app.getTitle();
                js3.o(title, "getTitle(...)");
                boolean zIsMulti = extensionPointDto.isMulti();
                yl5 yl5Var = appDetailViewModel.z;
                String packageName = app.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                recyclerItem = new RecyclerItem(new FilteredAppNestedData(app, title, zIsMulti, yl5Var.a(packageName), appDetailViewModel.A.b, extensionPointDto.isDigested(), 64, 0));
            } else {
                recyclerItem = null;
            }
            if (recyclerItem != null) {
                arrayList.add(recyclerItem);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUpdateExtensionApps$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveRecommendation() {
        bt2.G(y97.G(this), null, null, new C01631(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisableNotification(AppDetailAction.DisableNotification disableNotification) {
        l lVar = this.R;
        Pair pair = (Pair) lVar.getValue();
        Pair pair2 = new Pair(pair.a, Boolean.TRUE);
        lVar.getClass();
        lVar.p(null, pair2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(AppDetailAction.InitAction initAction) {
        l lVar;
        Object value;
        this.K = initAction.getScreenWidth();
        this.L = initAction.getMinHeight();
        this.M = initAction.isTvDevice();
        do {
            lVar = this.b1;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(initAction.isTabletLand())));
        this.N = initAction.isTabletDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReviewAILikeAction(AppDetailAction.ReviewAILikeAction reviewAILikeAction) {
        bt2.G(y97.G(this), null, null, new C01661(reviewAILikeAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowMoreAIAction(AppDetailAction.ShowMoreAIAction showMoreAIAction) {
        l lVar;
        Object value;
        do {
            lVar = this.W0;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<ir.mservices.market.common.ui.recycler.MyketRecyclerData> provideRecommendations(boolean r7, ir.mservices.market.app.detail.data.ApplicationFullDto r8, boolean r9) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r9 ^ 1
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L21
            ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto r4 = r8.getBannerList()
            if (r4 == 0) goto L1c
            java.lang.Boolean r4 = r4.getMovable()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = defpackage.js3.i(r4, r5)
            goto L1d
        L1c:
            r4 = r2
        L1d:
            if (r4 == 0) goto L21
            r4 = r3
            goto L22
        L21:
            r4 = r2
        L22:
            r4 = r4 ^ r1
            if (r4 == 0) goto L32
            ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto r4 = r8.getBannerList()
            if (r4 == 0) goto L32
            ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData r4 = r6.createHomeBannersRowData(r4)
            r0.add(r4)
        L32:
            kotlinx.coroutines.flow.l r4 = r6.b1
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L4f
            ir.mservices.market.app.detail.data.AppRecommendationDto r4 = r8.getRecommendation()
            java.lang.String r5 = r8.getPackageName()
            java.util.List r9 = r6.selectRecommendation(r4, r5, r7, r9)
            r0.addAll(r9)
        L4f:
            if (r7 == 0) goto L66
            ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto r7 = r8.getSecondaryBannerList()
            if (r7 == 0) goto L62
            java.lang.Boolean r7 = r7.getMovable()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.js3.i(r7, r9)
            goto L63
        L62:
            r7 = r2
        L63:
            if (r7 == 0) goto L66
            r2 = r3
        L66:
            r7 = r1 ^ r2
            if (r7 == 0) goto L77
            ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto r7 = r8.getSecondaryBannerList()
            if (r7 == 0) goto L77
            ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData r7 = r6.createHomeBannersRowData(r7)
            r0.add(r7)
        L77:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L7e
            return r0
        L7e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel.provideRecommendations(boolean, ir.mservices.market.app.detail.data.ApplicationFullDto, boolean):java.util.List");
    }

    private final List<MyketRecyclerData> selectRecommendation(AppRecommendationDto appRecommendationDto, String str, boolean z, boolean z2) {
        ArrayList arrayList;
        List<RecommendationDto> list;
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            if (z2) {
                return arrayList2;
            }
            return kotlin.collections.a.Q0(generateRecommendation(appRecommendationDto != null ? appRecommendationDto.getList() : null, str, null));
        }
        if (appRecommendationDto == null || (list = appRecommendationDto.getList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                RecommendationDto recommendationDto = (RecommendationDto) obj;
                List<String> movableIds = appRecommendationDto.getMovableIds();
                if (movableIds != null && kotlin.collections.a.h0(movableIds, recommendationDto.getType()) == z2) {
                    arrayList.add(obj);
                }
            }
        }
        return kotlin.collections.a.Q0(generateRecommendation(arrayList, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setSummaryDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem2 == null || recyclerItem == null) {
            return null;
        }
        return new RecyclerItem(new VerticalLineData());
    }

    private final void startAppBarAnimation() {
        bt2.G(y97.G(this), null, null, new C01671(null), 3);
    }

    public final ApplicationFullDto R() {
        return (ApplicationFullDto) this.Q.a.getValue();
    }

    public final String S() {
        String str = this.J0.g;
        return (str == null || f88.n0(str)) ? getCallbackUrl$lambda$0(this) : str;
    }

    public final String T() {
        hp hpVar = this.J0;
        if (m88.T(hpVar.c.a, LinkDTO.LINK_TYPE_EXTERNAL_LINK, true)) {
            return sa7.h(hpVar.c.b, new v7(5));
        }
        if (!f88.n0(hpVar.f)) {
            return hpVar.f;
        }
        if (R() == null) {
            lw.g(null, "app detail refId must not be null or empty", null);
            return "ClientUnknown";
        }
        ApplicationFullDto applicationFullDtoR = R();
        String refId = applicationFullDtoR != null ? applicationFullDtoR.getRefId() : null;
        lw.f(null, "server refId must not be null or empty", !(refId == null || f88.n0(refId)));
        ApplicationFullDto applicationFullDtoR2 = R();
        return sa7.h(applicationFullDtoR2 != null ? applicationFullDtoR2.getRefId() : null, new v7(6));
    }

    public final String U() {
        String str = this.Q0;
        return (str == null || f88.n0(str)) ? getInstallCallbackUrl$lambda$0(this) : str;
    }

    public final boolean V() {
        return js3.i(this.J0.a, NearbyRepository.SERVICE_ID);
    }

    public final void W(float f) {
        Float fValueOf = Float.valueOf(f);
        l lVar = this.z0;
        lVar.getClass();
        lVar.p(null, fValueOf);
        if (this.B.G(this.J0.a)) {
            return;
        }
        Float fValueOf2 = Float.valueOf(0.0f);
        lVar.getClass();
        lVar.p(null, fValueOf2);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        h().a("SHARE_REQUEST_TAG");
        h().a("BOOKMARK_REQUEST_TAG");
        this.v.i = null;
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new AppDetailViewModel$doRequest$1(this, null));
    }

    public final void onEvent(ly5 ly5Var) {
        js3.p(ly5Var, "event");
        if (m88.T(ly5Var.a.replace(".m.m.free", ""), dp3.y(this.J0.a), true)) {
            bt2.G(y97.G(this), null, null, new C01641(ly5Var, null), 3);
        }
    }

    public final void onEvent(j04 j04Var) {
        bt2.G(y97.G(this), null, null, new C01652(null), 3);
    }

    public final void onEvent(ys5 ys5Var) {
        js3.p(ys5Var, "event");
        l lVar = this.Y;
        lVar.getClass();
        lVar.p(null, ys5Var);
    }
}
