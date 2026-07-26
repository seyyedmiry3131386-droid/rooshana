package ir.mservices.market.movie.download.core;

import defpackage.bs1;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.es1;
import defpackage.f88;
import defpackage.g51;
import defpackage.ql0;
import defpackage.qp2;
import defpackage.sg4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.wq2;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.SpixMovieDownloadRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import ir.myket.callback.domain.models.CallbackUrlType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.download.core.MovieDownloadPostProcess$postProcessDownload$1", f = "MovieDownloadPostProcess.kt", l = {72}, m = "invokeSuspend", v = 1)
final class MovieDownloadPostProcess$postProcessDownload$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDownloadMetaData b;
    public final /* synthetic */ a c;
    public final /* synthetic */ bs1 d;

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.core.MovieDownloadPostProcess$postProcessDownload$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.download.core.MovieDownloadPostProcess$postProcessDownload$1$1", f = "MovieDownloadPostProcess.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ MovieDownloadMetaData a;
        public final /* synthetic */ a b;
        public final /* synthetic */ bs1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieDownloadMetaData movieDownloadMetaData, a aVar, bs1 bs1Var, g51 g51Var) {
            super(2, g51Var);
            this.a = movieDownloadMetaData;
            this.b = aVar;
            this.c = bs1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [c24, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            MovieDownloadMetaData movieDownloadMetaData = this.a;
            String str = movieDownloadMetaData.k;
            if (str == null || f88.n0(str)) {
                str = null;
            }
            a aVar = this.b;
            if (str != null) {
                ((ir.myket.callback.manager.a) aVar.f.getValue()).b(new ql0(str, CallbackUrlType.i, 0));
            }
            long j = movieDownloadMetaData.h;
            es1 es1Var = (es1) this.c;
            if (es1Var.i != j) {
                d dVar = aVar.a;
                c5 c5Var = aVar.b;
                dVar.m("movie-download", new SpixRequestDto(new SpixUserRequestDto(c5Var.a(), c5Var.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C()), new SpixMovieDownloadRequestDto(es1Var.i, es1Var.h, movieDownloadMetaData.h, movieDownloadMetaData.b, movieDownloadMetaData.a)));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadPostProcess$postProcessDownload$1(MovieDownloadMetaData movieDownloadMetaData, a aVar, bs1 bs1Var, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDownloadMetaData;
        this.c = aVar;
        this.d = bs1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDownloadPostProcess$postProcessDownload$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDownloadPostProcess$postProcessDownload$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ug1 ug1Var = up1.a;
            kotlinx.coroutines.android.a aVar = sg4.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, null);
            this.a = 1;
            if (bt2.Z(aVar, anonymousClass1, this) == coroutineSingletons) {
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
