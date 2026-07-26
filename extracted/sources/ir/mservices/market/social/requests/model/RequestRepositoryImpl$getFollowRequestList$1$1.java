package ir.mservices.market.social.requests.model;

import com.google.gson.reflect.TypeToken;
import defpackage.ck4;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y57;
import defpackage.z57;
import ir.mservices.market.social.requests.RequestViewModel;
import ir.mservices.market.social.requests.data.RequestListResponseDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.requests.model.RequestRepositoryImpl$getFollowRequestList$1$1", f = "RequestRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 1)
final class RequestRepositoryImpl$getFollowRequestList$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ck4 d;
    public final /* synthetic */ RequestViewModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestRepositoryImpl$getFollowRequestList$1$1(ck4 ck4Var, RequestViewModel requestViewModel, g51 g51Var) {
        super(4, g51Var);
        this.d = ck4Var;
        this.e = requestViewModel;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        RequestRepositoryImpl$getFollowRequestList$1$1 requestRepositoryImpl$getFollowRequestList$1$1 = new RequestRepositoryImpl$getFollowRequestList$1$1(this.d, this.e, (g51) obj4);
        requestRepositoryImpl$getFollowRequestList$1$1.b = iIntValue;
        requestRepositoryImpl$getFollowRequestList$1$1.c = iIntValue2;
        return requestRepositoryImpl$getFollowRequestList$1$1.invokeSuspend(tx8.a);
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
        y57 y57Var = (y57) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        y57Var.getClass();
        z57 z57VarCreateRequestUrl = y57Var.createRequestUrl("social", "v1/profiles/own/requests", null, y57Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<RequestListResponseDto>() { // from class: ir.mservices.market.social.requests.service.RequestService$getRequests$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(y57Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
