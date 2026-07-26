package ir.mservices.market.app.recommended.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.ly6;
import defpackage.n99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xg5;
import defpackage.z57;
import ir.mservices.market.app.recommended.data.ApplicationListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.recommended.model.RecommendedRepositoryImpl$getRecommendedApps$1$1", f = "RecommendedRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 1)
final class RecommendedRepositoryImpl$getRecommendedApps$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ xg5 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedRepositoryImpl$getRecommendedApps$1$1(xg5 xg5Var, String str, String str2, Object obj, boolean z, g51 g51Var) {
        super(4, g51Var);
        this.e = xg5Var;
        this.f = str;
        this.g = str2;
        this.h = obj;
        this.i = z;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Object obj5 = this.h;
        boolean z = this.i;
        RecommendedRepositoryImpl$getRecommendedApps$1$1 recommendedRepositoryImpl$getRecommendedApps$1$1 = new RecommendedRepositoryImpl$getRecommendedApps$1$1(this.e, this.f, this.g, obj5, z, (g51) obj4);
        recommendedRepositoryImpl$getRecommendedApps$1$1.b = iIntValue;
        recommendedRepositoryImpl$getRecommendedApps$1$1.c = iIntValue2;
        recommendedRepositoryImpl$getRecommendedApps$1$1.d = zBooleanValue;
        return recommendedRepositoryImpl$getRecommendedApps$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecommendedRepositoryImpl$getRecommendedApps$1$1 recommendedRepositoryImpl$getRecommendedApps$1$1;
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 == 0) {
            b.b(obj);
            ly6 ly6Var = (ly6) this.e.b;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.a = 1;
            ly6Var.getClass();
            z57 z57VarCreateRequestUrl = ly6Var.createRequestUrl("v1/applications", "{packageName}/recommended", kotlin.collections.b.O(new Pair("packageName", this.f)), ly6Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("type", this.g), new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
            Type type = new TypeToken<ApplicationListDto>() { // from class: ir.mservices.market.app.recommended.service.RecommendedService$getRecommendedApps$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            recommendedRepositoryImpl$getRecommendedApps$1$1 = this;
            obj = dy3.v(ly6Var, type, z57VarCreateRequestUrl, this.h, recommendedRepositoryImpl$getRecommendedApps$1$1, 472);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            recommendedRepositoryImpl$getRecommendedApps$1$1 = this;
        }
        n99 n99Var = (n99) obj;
        return n99Var instanceof l99 ? new l99(xg5.a((ApplicationListDto) ((l99) n99Var).a, z, recommendedRepositoryImpl$getRecommendedApps$1$1.i)) : n99Var;
    }
}
