package ir.mservices.market.social.search.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw;
import defpackage.oj7;
import defpackage.sp2;
import defpackage.t15;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.social.mynet.data.MynetHomeDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.search.model.UserSearchResultRepositoryImpl$getSearchUsers$1$1", f = "UserSearchResultRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 1)
final class UserSearchResultRepositoryImpl$getSearchUsers$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ t15 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchResultRepositoryImpl$getSearchUsers$1$1(t15 t15Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = t15Var;
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
        UserSearchResultRepositoryImpl$getSearchUsers$1$1 userSearchResultRepositoryImpl$getSearchUsers$1$1 = new UserSearchResultRepositoryImpl$getSearchUsers$1$1(this.d, str, obj5, (g51) obj4);
        userSearchResultRepositoryImpl$getSearchUsers$1$1.b = iIntValue;
        userSearchResultRepositoryImpl$getSearchUsers$1$1.c = iIntValue2;
        return userSearchResultRepositoryImpl$getSearchUsers$1$1.invokeSuspend(tx8.a);
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
        oj7 oj7Var = (oj7) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        oj7Var.getClass();
        String str = this.e;
        lw.f(null, null, str.length() > 0);
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)));
        if (!f88.n0(str)) {
            linkedHashMapO.put("q", str);
        }
        z57 z57VarCreateRequestUrl = oj7Var.createRequestUrl("social", "v1/search", null, oj7Var.getCommonQueryParam(linkedHashMapO));
        Type type = new TypeToken<MynetHomeDto>() { // from class: ir.mservices.market.social.search.services.SearchService$getSearch$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(oj7Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
