package ir.mservices.market.app.search.result.ui.model;

import com.google.gson.reflect.TypeToken;
import defpackage.ca7;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.kj7;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.search.result.data.SearchApplicationListDTO;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.model.AppSearchResultRepositoryImpl$getAppSearchResult$1$1", f = "AppSearchResultRepositoryImpl.kt", l = {29}, m = "invokeSuspend", v = 1)
final class AppSearchResultRepositoryImpl$getAppSearchResult$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ca7 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSearchResultRepositoryImpl$getAppSearchResult$1$1(ca7 ca7Var, String str, int i, String str2, String str3, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = ca7Var;
        this.e = str;
        this.f = i;
        this.g = str2;
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
        AppSearchResultRepositoryImpl$getAppSearchResult$1$1 appSearchResultRepositoryImpl$getAppSearchResult$1$1 = new AppSearchResultRepositoryImpl$getAppSearchResult$1$1(this.d, this.e, this.f, this.g, str, obj5, (g51) obj4);
        appSearchResultRepositoryImpl$getAppSearchResult$1$1.b = iIntValue;
        appSearchResultRepositoryImpl$getAppSearchResult$1$1.c = iIntValue2;
        return appSearchResultRepositoryImpl$getAppSearchResult$1$1.invokeSuspend(tx8.a);
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
        kj7 kj7Var = (kj7) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        kj7Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)));
        String str = this.e;
        if (!f88.n0(str)) {
            linkedHashMapO.put("query", str);
        }
        int i4 = this.f;
        if (i4 > -1) {
            linkedHashMapO.put("index", String.valueOf(i4));
        }
        String str2 = this.h;
        if (!f88.n0(str2)) {
            linkedHashMapO.put("tab", str2);
        }
        String str3 = this.g;
        if (f88.n0(str3)) {
            str3 = "Manual";
        }
        linkedHashMapO.put("querySource", str3);
        z57 z57VarCreateRequestUrl = kj7Var.createRequestUrl("v2/applications", "search", null, kj7Var.getCommonQueryParam(linkedHashMapO));
        Type type = new TypeToken<SearchApplicationListDTO>() { // from class: ir.mservices.market.app.search.result.services.SearchResultService$searchV2$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(kj7Var, type, z57VarCreateRequestUrl, this.i, this, 472);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
