package ir.mservices.market.movie.ui.detail.seasons.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u65;
import defpackage.v65;
import defpackage.z57;
import ir.mservices.market.movie.ui.detail.seasons.data.SeasonsDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.model.MovieSeasonRepositoryImpl$getSeasons$1$1", f = "MovieSeasonRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
final class MovieSeasonRepositoryImpl$getSeasons$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ u65 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonRepositoryImpl$getSeasons$1$1(u65 u65Var, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = u65Var;
        this.c = str;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieSeasonRepositoryImpl$getSeasons$1$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieSeasonRepositoryImpl$getSeasons$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        v65 v65Var = this.b.a;
        this.a = 1;
        v65Var.getClass();
        z57 z57VarCreateRequestUrl = v65Var.createRequestUrl("movie-api", "v1/movies/{movieId}/seasons", kotlin.collections.b.O(new Pair("movieId", this.c)), v65Var.getCommonQueryParam());
        Type type = new TypeToken<SeasonsDto>() { // from class: ir.mservices.market.movie.ui.detail.seasons.services.MovieSeasonService$getSeasons$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(v65Var, type, z57VarCreateRequestUrl, this.d, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
