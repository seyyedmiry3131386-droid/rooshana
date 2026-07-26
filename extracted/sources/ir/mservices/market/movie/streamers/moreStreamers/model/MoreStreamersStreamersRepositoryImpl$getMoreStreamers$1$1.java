package ir.mservices.market.movie.streamers.moreStreamers.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.fy4;
import defpackage.g51;
import defpackage.js3;
import defpackage.qm5;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.movie.streamers.data.StreamersDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.moreStreamers.model.MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1", f = "MoreStreamersStreamersRepositoryImpl.kt", l = {25}, m = "invokeSuspend", v = 1)
final class MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ qm5 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1(qm5 qm5Var, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = qm5Var;
        this.e = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1 moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1 = new MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1(this.d, this.e, (g51) obj4);
        moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1.b = iIntValue;
        moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1.c = iIntValue2;
        return moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1.invokeSuspend(tx8.a);
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
        fy4 fy4Var = (fy4) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        fy4Var.getClass();
        z57 z57VarCreateRequestUrl = fy4Var.createRequestUrl("movie-api", "v1/streamers", null, fy4Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("offset", String.valueOf(i2)), new Pair("limit", String.valueOf(i)))));
        Type type = new TypeToken<StreamersDto>() { // from class: ir.mservices.market.movie.streamers.moreStreamers.service.MoreStreamersService$getMoreStreamers$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(fy4Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
