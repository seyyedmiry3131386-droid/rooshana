package ir.mservices.market.social.list.search.movie.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yi7;
import defpackage.z57;
import defpackage.zi7;
import ir.mservices.market.social.list.search.SearchProfileListViewModel;
import ir.mservices.market.social.list.search.movie.data.ProfileMoviesDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.search.movie.model.SearchMovieProfileListRepositoryImpl$search$1$1", f = "SearchMovieProfileListRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 1)
final class SearchMovieProfileListRepositoryImpl$search$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yi7 e;
    public final /* synthetic */ SearchProfileListViewModel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMovieProfileListRepositoryImpl$search$1$1(String str, yi7 yi7Var, SearchProfileListViewModel searchProfileListViewModel, g51 g51Var) {
        super(4, g51Var);
        this.d = str;
        this.e = yi7Var;
        this.f = searchProfileListViewModel;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        yi7 yi7Var = this.e;
        SearchProfileListViewModel searchProfileListViewModel = this.f;
        SearchMovieProfileListRepositoryImpl$search$1$1 searchMovieProfileListRepositoryImpl$search$1$1 = new SearchMovieProfileListRepositoryImpl$search$1$1(this.d, yi7Var, searchProfileListViewModel, (g51) obj4);
        searchMovieProfileListRepositoryImpl$search$1$1.b = iIntValue;
        searchMovieProfileListRepositoryImpl$search$1$1.c = iIntValue2;
        return searchMovieProfileListRepositoryImpl$search$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 == 0) {
            b.b(obj);
            String str = this.d;
            if (f88.n0(str)) {
                return new l99(ProfileMoviesDto.Companion.getEmpty());
            }
            zi7 zi7Var = this.e.a;
            this.b = i;
            this.c = i2;
            this.a = 1;
            zi7Var.getClass();
            z57 z57VarCreateRequestUrl = zi7Var.createRequestUrl("social", "v1/movies", null, zi7Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("q", str), new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
            Type type = new TypeToken<ProfileMoviesDto>() { // from class: ir.mservices.market.social.list.search.movie.service.SearchMovieProfileService$getMovies$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.v(zi7Var, type, z57VarCreateRequestUrl, this.f, this, 504);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return (n99) obj;
    }
}
