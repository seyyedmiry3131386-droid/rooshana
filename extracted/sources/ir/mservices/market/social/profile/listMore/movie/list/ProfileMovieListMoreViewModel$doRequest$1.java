package ir.mservices.market.social.profile.listMore.movie.list;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gr5;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rl6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vw2;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$doRequest$1", f = "ProfileMovieListMoreViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ProfileMovieListMoreViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ProfileMovieListMoreViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMovieListMoreViewModel$doRequest$1(ProfileMovieListMoreViewModel profileMovieListMoreViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = profileMovieListMoreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileMovieListMoreViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileMovieListMoreViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<MovieDto> movies;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ProfileMovieListMoreViewModel profileMovieListMoreViewModel = this.a;
        gr5 gr5Var = profileMovieListMoreViewModel.v;
        ProfileMovieListDto profileMovieListDto = profileMovieListMoreViewModel.y.b.c;
        if (profileMovieListDto == null || (movies = profileMovieListDto.getMovies()) == null) {
            movies = EmptyList.a;
        }
        js3.p(movies, "movieList");
        gr5Var.getClass();
        ((rl6) gr5Var.g).getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new vw2(movies, 2)).a, new z45(22, profileMovieListMoreViewModel)), y97.G(profileMovieListMoreViewModel)), null, null, null, 14);
    }
}
