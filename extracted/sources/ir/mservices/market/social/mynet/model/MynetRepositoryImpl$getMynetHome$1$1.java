package ir.mservices.market.social.mynet.model;

import com.google.gson.reflect.TypeToken;
import defpackage.bh5;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xg5;
import defpackage.z57;
import ir.mservices.market.social.mynet.data.MynetHomeDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.mynet.model.MynetRepositoryImpl$getMynetHome$1$1", f = "MynetRepositoryImpl.kt", l = {21}, m = "invokeSuspend", v = 1)
final class MynetRepositoryImpl$getMynetHome$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ xg5 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MynetRepositoryImpl$getMynetHome$1$1(xg5 xg5Var, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = xg5Var;
        this.e = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        MynetRepositoryImpl$getMynetHome$1$1 mynetRepositoryImpl$getMynetHome$1$1 = new MynetRepositoryImpl$getMynetHome$1$1(this.d, this.e, (g51) obj4);
        mynetRepositoryImpl$getMynetHome$1$1.b = iIntValue;
        mynetRepositoryImpl$getMynetHome$1$1.c = iIntValue2;
        return mynetRepositoryImpl$getMynetHome$1$1.invokeSuspend(tx8.a);
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
        bh5 bh5Var = (bh5) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        bh5Var.getClass();
        z57 z57VarCreateRequestUrl = bh5Var.createRequestUrl("social", "v1/home", null, bh5Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<MynetHomeDto>() { // from class: ir.mservices.market.social.mynet.services.MynetService$getHome$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(bh5Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
