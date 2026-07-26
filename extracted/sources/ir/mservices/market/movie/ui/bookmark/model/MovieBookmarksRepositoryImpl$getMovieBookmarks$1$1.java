package ir.mservices.market.movie.ui.bookmark.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.e05;
import defpackage.g51;
import defpackage.js3;
import defpackage.ql4;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.movie.ui.bookmark.data.MovieBookmarkListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.bookmark.model.MovieBookmarksRepositoryImpl$getMovieBookmarks$1$1", f = "MovieBookmarksRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
final class MovieBookmarksRepositoryImpl$getMovieBookmarks$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ql4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBookmarksRepositoryImpl$getMovieBookmarks$1$1(g51 g51Var, ql4 ql4Var, Object obj, String str) {
        super(4, g51Var);
        this.d = ql4Var;
        this.e = obj;
        this.f = str;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        MovieBookmarksRepositoryImpl$getMovieBookmarks$1$1 movieBookmarksRepositoryImpl$getMovieBookmarks$1$1 = new MovieBookmarksRepositoryImpl$getMovieBookmarks$1$1((g51) obj4, this.d, this.e, this.f);
        movieBookmarksRepositoryImpl$getMovieBookmarks$1$1.b = iIntValue;
        movieBookmarksRepositoryImpl$getMovieBookmarks$1$1.c = iIntValue2;
        return movieBookmarksRepositoryImpl$getMovieBookmarks$1$1.invokeSuspend(tx8.a);
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
        e05 e05Var = (e05) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        e05Var.getClass();
        z57 z57VarCreateRequestUrl = e05Var.createRequestUrl("movie-api", "v1/accounts/{accountId}/bookmarks", kotlin.collections.b.O(new Pair("accountId", this.f)), e05Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<MovieBookmarkListDto>() { // from class: ir.mservices.market.movie.ui.bookmark.services.MovieBookmarkService$getBookmarks$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(e05Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
