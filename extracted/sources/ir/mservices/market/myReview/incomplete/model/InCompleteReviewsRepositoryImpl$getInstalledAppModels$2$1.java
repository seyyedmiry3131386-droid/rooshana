package ir.mservices.market.myReview.incomplete.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wd5;
import defpackage.z57;
import ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewResultDTO;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$2$1", f = "InCompleteReviewsRepositoryImpl.kt", l = {59}, m = "invokeSuspend", v = 1)
final class InCompleteReviewsRepositoryImpl$getInstalledAppModels$2$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ UpdateRequestDto c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewsRepositoryImpl$getInstalledAppModels$2$1(b bVar, UpdateRequestDto updateRequestDto, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = bVar;
        this.c = updateRequestDto;
        this.d = str;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new InCompleteReviewsRepositoryImpl$getInstalledAppModels$2$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((InCompleteReviewsRepositoryImpl$getInstalledAppModels$2$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        wd5 wd5Var = this.b.b;
        this.a = 1;
        wd5Var.getClass();
        z57 z57VarCreateRequestUrl = wd5Var.createRequestUrl("v1/accounts", "{accountId}/reviews/incomplete", kotlin.collections.b.O(new Pair("accountId", this.d)), wd5Var.getCommonQueryParam());
        Type type = new TypeToken<InCompleteReviewResultDTO>() { // from class: ir.mservices.market.myReview.services.MyReviewService$postInCompleteReview$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objG = dy3.G(wd5Var, type, z57VarCreateRequestUrl, this.c, this.e, null, null, this, 496);
        return objG == coroutineSingletons ? coroutineSingletons : objG;
    }
}
