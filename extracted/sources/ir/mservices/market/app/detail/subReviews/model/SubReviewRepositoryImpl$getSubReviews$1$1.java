package ir.mservices.market.app.detail.subReviews.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.rn6;
import defpackage.sp2;
import defpackage.t98;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.detail.subReviews.data.SubCommentDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.model.SubReviewRepositoryImpl$getSubReviews$1$1", f = "SubReviewRepositoryImpl.kt", l = {35}, m = "invokeSuspend", v = 1)
final class SubReviewRepositoryImpl$getSubReviews$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ rn6 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubReviewRepositoryImpl$getSubReviews$1$1(rn6 rn6Var, String str, String str2, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = rn6Var;
        this.e = str;
        this.f = str2;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.f;
        Object obj5 = this.g;
        SubReviewRepositoryImpl$getSubReviews$1$1 subReviewRepositoryImpl$getSubReviews$1$1 = new SubReviewRepositoryImpl$getSubReviews$1$1(this.d, this.e, str, obj5, (g51) obj4);
        subReviewRepositoryImpl$getSubReviews$1$1.b = iIntValue;
        subReviewRepositoryImpl$getSubReviews$1$1.c = iIntValue2;
        return subReviewRepositoryImpl$getSubReviews$1$1.invokeSuspend(tx8.a);
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
        t98 t98Var = (t98) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        t98Var.getClass();
        z57 z57VarCreateRequestUrl = t98Var.createRequestUrl("v1/applications", "{packageName}/reviews/{reviewId}/comments", kotlin.collections.b.O(new Pair("packageName", this.e), new Pair("reviewId", this.f)), t98Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<SubCommentDto>() { // from class: ir.mservices.market.app.detail.subReviews.service.SubReviewService$getSubComments$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(t98Var, type, z57VarCreateRequestUrl, this.g, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
