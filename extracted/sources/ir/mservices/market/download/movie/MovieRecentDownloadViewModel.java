package ir.mservices.market.download.movie;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.n25;
import defpackage.nc2;
import defpackage.p25;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.xp;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.download.movie.MovieRecentDownloadAction;
import ir.mservices.market.download.movie.data.MovieDownloadInfoData;
import ir.mservices.market.download.movie.recycler.MovieDownloadData;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.movie.download.core.model.MovieDownloadRepositoryImpl$getMovieDownloadState$$inlined$transform$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieRecentDownloadViewModel extends ir.mservices.market.viewModel.a {
    public final l A;
    public final rv6 B;
    public final n25 v;
    public final nc2 w;
    public final rv6 x;
    public final xe2 y;
    public final i z;

    /* JADX INFO: renamed from: ir.mservices.market.download.movie.MovieRecentDownloadViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.movie.MovieRecentDownloadViewModel$1", f = "MovieRecentDownloadViewModel.kt", l = {124}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieRecentDownloadViewModel.this.new AnonymousClass1(g51Var);
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
            MovieRecentDownloadViewModel movieRecentDownloadViewModel = MovieRecentDownloadViewModel.this;
            pv6 pv6Var = movieRecentDownloadViewModel.u;
            bj2 bj2Var = new bj2(15, movieRecentDownloadViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 14), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.movie.MovieRecentDownloadViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.movie.MovieRecentDownloadViewModel$2", f = "MovieRecentDownloadViewModel.kt", l = {56}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.download.movie.MovieRecentDownloadViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.download.movie.MovieRecentDownloadViewModel$2$1", f = "MovieRecentDownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public final /* synthetic */ MovieRecentDownloadViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MovieRecentDownloadViewModel movieRecentDownloadViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = movieRecentDownloadViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass1(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                l lVar = this.a.A;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, Boolean.TRUE));
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieRecentDownloadViewModel.this.new AnonymousClass2(g51Var);
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
                MovieRecentDownloadViewModel movieRecentDownloadViewModel = MovieRecentDownloadViewModel.this;
                rv6 rv6Var = new rv6(movieRecentDownloadViewModel.v.a.j);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieRecentDownloadViewModel, null);
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

    /* JADX INFO: renamed from: ir.mservices.market.download.movie.MovieRecentDownloadViewModel$onUpdateNotEnoughStorageAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.movie.MovieRecentDownloadViewModel$onUpdateNotEnoughStorageAction$1", f = "MovieRecentDownloadViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
    public static final class C01851 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01851(MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction updateNotEnoughStorageFlowAction, g51 g51Var) {
            super(2, g51Var);
            this.c = updateNotEnoughStorageFlowAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieRecentDownloadViewModel.this.new C01851(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01851) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = MovieRecentDownloadViewModel.this.z;
                MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction updateNotEnoughStorageFlowAction = this.c;
                Pair pair = new Pair(updateNotEnoughStorageFlowAction.getMovieId(), new Integer(updateNotEnoughStorageFlowAction.getQuality()));
                this.a = 1;
                if (iVar.emit(pair, this) == coroutineSingletons) {
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
    public MovieRecentDownloadViewModel(n25 n25Var, nc2 nc2Var) {
        super(true);
        js3.p(n25Var, "movieDownloadRepository");
        this.v = n25Var;
        this.w = nc2Var;
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        this.x = aVar.n;
        this.y = d.k(new xp(aVar.k, aVar, 11));
        this.z = vy2.e(0, 7, null);
        l lVarB = ja1.b(null);
        this.A = lVarB;
        this.B = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(List<MovieDownloadInfoData> list) {
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (MovieDownloadInfoData movieDownloadInfoData : list) {
            MovieDownloadMetaData movieDownloadMetaDataD = movieDownloadInfoData.getMovieDownloadInfo().d();
            String posterUrl = movieDownloadInfoData.getMovieInfoDto().getPosterUrl();
            String type = movieDownloadInfoData.getMovieInfoDto().getType();
            boolean zIsInMyket = movieDownloadInfoData.getMovieInfoDto().isInMyket();
            String strF = movieDownloadInfoData.getMovieDownloadInfo().f();
            String strValueOf = String.valueOf(movieDownloadInfoData.getMovieDownloadInfo().d().f);
            n25 n25Var = this.v;
            n25Var.getClass();
            js3.p(strValueOf, "quality");
            arrayList.add(new MovieDownloadData(movieDownloadMetaDataD, posterUrl, type, zIsInMyket, d.A(new vb7(new MovieDownloadRepositoryImpl$getMovieDownloadState$$inlined$transform$1(n25Var.a.l, null, strF, strValueOf)), y97.G(this), ru7.a, new p25(null)), this.z));
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new RecyclerItem((MovieDownloadData) it.next()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPauseAllDownloadAction(MovieRecentDownloadAction.PauseAllDownloadAction pauseAllDownloadAction) {
        this.v.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshDoneAction(MovieRecentDownloadAction.RefreshDoneAction refreshDoneAction) {
        l lVar;
        Object value;
        do {
            lVar = this.A;
            value = lVar.getValue();
        } while (!lVar.n(value, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateNotEnoughStorageAction(MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction updateNotEnoughStorageFlowAction) {
        bt2.G(y97.G(this), null, null, new C01851(updateNotEnoughStorageFlowAction, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieRecentDownloadViewModel$doRequest$1(this, null));
    }
}
