package ir.mservices.market.social.profile.list.movie.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.s45;
import defpackage.sp2;
import defpackage.t45;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.social.profile.list.movie.data.ProfileMoviesListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.movie.model.MovieProfileListRepositoryImpl$getMovieLists$1$1", f = "MovieProfileListRepositoryImpl.kt", l = {35}, m = "invokeSuspend", v = 1)
final class MovieProfileListRepositoryImpl$getMovieLists$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ s45 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieProfileListRepositoryImpl$getMovieLists$1$1(s45 s45Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = s45Var;
        this.e = str;
        this.f = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.e;
        Object obj5 = this.f;
        MovieProfileListRepositoryImpl$getMovieLists$1$1 movieProfileListRepositoryImpl$getMovieLists$1$1 = new MovieProfileListRepositoryImpl$getMovieLists$1$1(this.d, str, obj5, (g51) obj4);
        movieProfileListRepositoryImpl$getMovieLists$1$1.b = iIntValue;
        movieProfileListRepositoryImpl$getMovieLists$1$1.c = iIntValue2;
        return movieProfileListRepositoryImpl$getMovieLists$1$1.invokeSuspend(tx8.a);
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
        t45 t45Var = this.d.a;
        this.b = i;
        this.c = i2;
        this.a = 1;
        t45Var.getClass();
        z57 z57VarCreateRequestUrl = t45Var.createRequestUrl("social", "v1/profiles/{accountKey}/custom-movie-lists", kotlin.collections.b.O(new Pair("accountKey", this.e)), t45Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<ProfileMoviesListDto>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$getProfileMovieList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(t45Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
