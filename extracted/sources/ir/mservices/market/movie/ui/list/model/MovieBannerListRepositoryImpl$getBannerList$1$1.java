package ir.mservices.market.movie.ui.list.model;

import com.google.gson.reflect.TypeToken;
import defpackage.c05;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.z57;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.list.model.MovieBannerListRepositoryImpl$getBannerList$1$1", f = "MovieBannerListRepositoryImpl.kt", l = {33}, m = "invokeSuspend", v = 1)
final class MovieBannerListRepositoryImpl$getBannerList$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ut4 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBannerListRepositoryImpl$getBannerList$1$1(g51 g51Var, ut4 ut4Var, Object obj, String str, String str2) {
        super(4, g51Var);
        this.d = str;
        this.e = ut4Var;
        this.f = str2;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.f;
        MovieBannerListRepositoryImpl$getBannerList$1$1 movieBannerListRepositoryImpl$getBannerList$1$1 = new MovieBannerListRepositoryImpl$getBannerList$1$1((g51) obj4, this.e, this.g, this.d, str);
        movieBannerListRepositoryImpl$getBannerList$1$1.b = iIntValue;
        movieBannerListRepositoryImpl$getBannerList$1$1.c = iIntValue2;
        return movieBannerListRepositoryImpl$getBannerList$1$1.invokeSuspend(tx8.a);
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
        String str = this.d;
        if (str == null || f88.n0(str)) {
            return new l99(HomeMovieBannerListDto.Companion.getEmpty());
        }
        c05 c05Var = (c05) this.e.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        c05Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)));
        String str2 = this.f;
        if (str2 != null) {
            if (f88.n0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMapO.put("refId", str2);
            }
        }
        z57 z57VarCreateRequestUrl = c05Var.createRequestUrl("movie-api", "v1/banner-list/{id}", kotlin.collections.b.O(new Pair("id", str)), c05Var.getCommonQueryParam(linkedHashMapO));
        Type type = new TypeToken<HomeMovieBannerListDto>() { // from class: ir.mservices.market.movie.services.MovieBannersService$getBannerList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(c05Var, type, z57VarCreateRequestUrl, this.g, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
