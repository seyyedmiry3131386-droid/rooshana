package ir.mservices.market.app.detail.reivews.model;

import com.google.gson.reflect.TypeToken;
import defpackage.a97;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.sk6;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.detail.reivews.data.ReviewListDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.model.ReviewRepositoryImpl$getReviews$1$1", f = "ReviewRepositoryImpl.kt", l = {37}, m = "invokeSuspend", v = 1)
final class ReviewRepositoryImpl$getReviews$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ sk6 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Integer g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewRepositoryImpl$getReviews$1$1(sk6 sk6Var, String str, Object obj, Integer num, g51 g51Var) {
        super(4, g51Var);
        this.d = sk6Var;
        this.e = str;
        this.f = obj;
        this.g = num;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        Object obj5 = this.f;
        Integer num = this.g;
        ReviewRepositoryImpl$getReviews$1$1 reviewRepositoryImpl$getReviews$1$1 = new ReviewRepositoryImpl$getReviews$1$1(this.d, this.e, obj5, num, (g51) obj4);
        reviewRepositoryImpl$getReviews$1$1.b = iIntValue;
        reviewRepositoryImpl$getReviews$1$1.c = iIntValue2;
        return reviewRepositoryImpl$getReviews$1$1.invokeSuspend(tx8.a);
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
        a97 a97Var = (a97) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        a97Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("packageName", this.e));
        LinkedHashMap linkedHashMapO2 = kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)));
        Integer num = this.g;
        if (num != null) {
            linkedHashMapO2.put("rateLevel", String.valueOf(num.intValue()));
        }
        z57 z57VarCreateRequestUrl = a97Var.createRequestUrl("v1/applications", "{packageName}/reviews", linkedHashMapO, a97Var.getCommonQueryParam(linkedHashMapO2));
        Type type = new TypeToken<ReviewListDto>() { // from class: ir.mservices.market.app.detail.reivews.service.ReviewService$getReviews$3
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(a97Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
