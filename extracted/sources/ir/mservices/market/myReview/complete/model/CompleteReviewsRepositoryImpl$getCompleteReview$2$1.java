package ir.mservices.market.myReview.complete.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.qm5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wd5;
import defpackage.z57;
import ir.mservices.market.myReview.complete.data.CompleteReviewResultDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.complete.model.CompleteReviewsRepositoryImpl$getCompleteReview$2$1", f = "CompleteReviewsRepositoryImpl.kt", l = {29}, m = "invokeSuspend", v = 1)
final class CompleteReviewsRepositoryImpl$getCompleteReview$2$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ qm5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteReviewsRepositoryImpl$getCompleteReview$2$1(qm5 qm5Var, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = qm5Var;
        this.c = str;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CompleteReviewsRepositoryImpl$getCompleteReview$2$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((CompleteReviewsRepositoryImpl$getCompleteReview$2$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        wd5 wd5Var = (wd5) this.b.b;
        this.a = 1;
        wd5Var.getClass();
        z57 z57VarCreateRequestUrl = wd5Var.createRequestUrl("v1/accounts", "{accountId}/reviews/complete", kotlin.collections.b.O(new Pair("accountId", this.c)), wd5Var.getCommonQueryParam());
        Type type = new TypeToken<CompleteReviewResultDto>() { // from class: ir.mservices.market.myReview.services.MyReviewService$getCompleteReview$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(wd5Var, type, z57VarCreateRequestUrl, this.d, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
