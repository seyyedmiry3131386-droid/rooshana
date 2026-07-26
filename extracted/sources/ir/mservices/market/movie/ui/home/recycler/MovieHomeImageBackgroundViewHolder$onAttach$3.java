package ir.mservices.market.movie.ui.home.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.home.recycler.MovieHomeImageBackgroundViewHolder$onAttach$3", f = "MovieHomeMovies.kt", l = {345}, m = "invokeSuspend", v = 1)
final class MovieHomeImageBackgroundViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieHomeMoviesRowData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.home.recycler.MovieHomeImageBackgroundViewHolder$onAttach$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.home.recycler.MovieHomeImageBackgroundViewHolder$onAttach$3$1", f = "MovieHomeMovies.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ MovieHomeMoviesRowData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, a aVar, MovieHomeMoviesRowData movieHomeMoviesRowData) {
            super(2, g51Var);
            this.b = aVar;
            this.c = movieHomeMoviesRowData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b, this.c);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((HomeMovieListDto) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HomeMovieListDto homeMovieListDto = (HomeMovieListDto) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            BackgroundImageDto backgroundImage = homeMovieListDto.getBackgroundImage();
            if (backgroundImage != null) {
                float f = this.c.r;
                int i = a.V;
                this.b.N(backgroundImage, f);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeImageBackgroundViewHolder$onAttach$3(g51 g51Var, a aVar, MovieHomeMoviesRowData movieHomeMoviesRowData) {
        super(2, g51Var);
        this.b = movieHomeMoviesRowData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieHomeImageBackgroundViewHolder$onAttach$3(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieHomeImageBackgroundViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieHomeMoviesRowData movieHomeMoviesRowData = this.b;
            v48 v48Var = movieHomeMoviesRowData.p;
            if (v48Var != null) {
                o4 o4Var = new o4(v48Var, 9);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c, movieHomeMoviesRowData);
                this.a = 1;
                if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
