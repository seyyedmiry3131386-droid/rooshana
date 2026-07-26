package ir.mservices.market.movie.ui.list.model;

import com.google.gson.reflect.TypeToken;
import defpackage.c75;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.k45;
import defpackage.l99;
import defpackage.n99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.movie.data.webapi.MovieListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.list.model.MovieListRepositoryImpl$getMovies$1$1", f = "MovieListRepositoryImpl.kt", l = {37}, m = "invokeSuspend", v = 1)
final class MovieListRepositoryImpl$getMovies$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ k45 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieListRepositoryImpl$getMovies$1$1(String str, k45 k45Var, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.e = str;
        this.f = k45Var;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        k45 k45Var = this.f;
        Object obj5 = this.g;
        MovieListRepositoryImpl$getMovies$1$1 movieListRepositoryImpl$getMovies$1$1 = new MovieListRepositoryImpl$getMovies$1$1(this.e, k45Var, obj5, (g51) obj4);
        movieListRepositoryImpl$getMovies$1$1.b = iIntValue;
        movieListRepositoryImpl$getMovies$1$1.c = iIntValue2;
        movieListRepositoryImpl$getMovies$1$1.d = zBooleanValue;
        return movieListRepositoryImpl$getMovies$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 == 0) {
            b.b(obj);
            String str = this.e;
            if (f88.n0(str)) {
                return new l99(MovieListDto.Companion.getEmpty());
            }
            c75 c75Var = this.f.a;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.a = 1;
            c75Var.getClass();
            z57 z57VarCreateRequestUrl = c75Var.createRequestUrl("movie-api", "v1/list/{listKey}", kotlin.collections.b.O(new Pair("listKey", str)), c75Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
            Type type = new TypeToken<MovieListDto>() { // from class: ir.mservices.market.movie.services.MovieService$getList$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.v(c75Var, type, z57VarCreateRequestUrl, this.g, this, 504);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        return n99Var instanceof l99 ? new l99(k45.a((MovieListDto) ((l99) n99Var).a, z, null)) : n99Var;
    }
}
