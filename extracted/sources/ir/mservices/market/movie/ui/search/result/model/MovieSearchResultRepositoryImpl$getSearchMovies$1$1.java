package ir.mservices.market.movie.ui.search.result.model;

import com.google.gson.reflect.TypeToken;
import defpackage.c75;
import defpackage.ck4;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.movie.data.webapi.SearchMovieListDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.search.result.model.MovieSearchResultRepositoryImpl$getSearchMovies$1$1", f = "MovieSearchResultRepositoryImpl.kt", l = {29}, m = "invokeSuspend", v = 1)
final class MovieSearchResultRepositoryImpl$getSearchMovies$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ck4 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSearchResultRepositoryImpl$getSearchMovies$1$1(ck4 ck4Var, String str, String str2, Integer num, String str3, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = ck4Var;
        this.e = str;
        this.f = str2;
        this.g = num;
        this.h = str3;
        this.i = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.h;
        Object obj5 = this.i;
        MovieSearchResultRepositoryImpl$getSearchMovies$1$1 movieSearchResultRepositoryImpl$getSearchMovies$1$1 = new MovieSearchResultRepositoryImpl$getSearchMovies$1$1(this.d, this.e, this.f, this.g, str, obj5, (g51) obj4);
        movieSearchResultRepositoryImpl$getSearchMovies$1$1.b = iIntValue;
        movieSearchResultRepositoryImpl$getSearchMovies$1$1.c = iIntValue2;
        return movieSearchResultRepositoryImpl$getSearchMovies$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        c75 c75Var = (c75) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        c75Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("q", this.e), new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)), new Pair("querySource", this.f));
        Integer num = this.g;
        if (num != null) {
            linkedHashMapO.put("index", String.valueOf(num.intValue()));
        }
        String str = this.h;
        if (str != null) {
            linkedHashMapO.put("tab", str);
        }
        z57 z57VarCreateRequestUrl = c75Var.createRequestUrl("movie-api", "v1/movies/search", null, c75Var.getCommonQueryParam(linkedHashMapO));
        Type type = new TypeToken<SearchMovieListDto>() { // from class: ir.mservices.market.movie.services.MovieService$getSearchMovies$4
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(c75Var, type, z57VarCreateRequestUrl, this.i, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
