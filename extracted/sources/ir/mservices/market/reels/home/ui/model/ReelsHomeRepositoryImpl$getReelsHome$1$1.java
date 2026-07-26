package ir.mservices.market.reels.home.ui.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.p17;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xg5;
import defpackage.z57;
import ir.mservices.market.reels.home.data.ReelsHomeDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.home.ui.model.ReelsHomeRepositoryImpl$getReelsHome$1$1", f = "ReelsHomeRepositoryImpl.kt", l = {26}, m = "invokeSuspend", v = 1)
final class ReelsHomeRepositoryImpl$getReelsHome$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ xg5 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsHomeRepositoryImpl$getReelsHome$1$1(xg5 xg5Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = xg5Var;
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
        ReelsHomeRepositoryImpl$getReelsHome$1$1 reelsHomeRepositoryImpl$getReelsHome$1$1 = new ReelsHomeRepositoryImpl$getReelsHome$1$1(this.d, str, obj5, (g51) obj4);
        reelsHomeRepositoryImpl$getReelsHome$1$1.b = iIntValue;
        reelsHomeRepositoryImpl$getReelsHome$1$1.c = iIntValue2;
        return reelsHomeRepositoryImpl$getReelsHome$1$1.invokeSuspend(tx8.a);
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
        p17 p17Var = (p17) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        p17Var.getClass();
        z57 z57VarCreateRequestUrl = p17Var.createRequestUrl("reel-api", "v1/reel/home", null, p17Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("page", String.valueOf((i2 / i) + 1)), new Pair("refId", this.e))));
        Type type = new TypeToken<ReelsHomeDto>() { // from class: ir.mservices.market.reels.home.services.ReelsHomeService$getReelsHome$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(p17Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
