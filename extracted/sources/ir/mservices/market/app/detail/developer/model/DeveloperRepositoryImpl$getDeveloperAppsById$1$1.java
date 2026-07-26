package ir.mservices.market.app.detail.developer.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.detail.developer.data.DeveloperApplicationListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.developer.model.DeveloperRepositoryImpl$getDeveloperAppsById$1$1", f = "DeveloperRepositoryImpl.kt", l = {47}, m = "invokeSuspend", v = 1)
final class DeveloperRepositoryImpl$getDeveloperAppsById$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ol1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeveloperRepositoryImpl$getDeveloperAppsById$1$1(ol1 ol1Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.d = ol1Var;
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
        DeveloperRepositoryImpl$getDeveloperAppsById$1$1 developerRepositoryImpl$getDeveloperAppsById$1$1 = new DeveloperRepositoryImpl$getDeveloperAppsById$1$1(this.d, str, obj5, (g51) obj4);
        developerRepositoryImpl$getDeveloperAppsById$1$1.b = iIntValue;
        developerRepositoryImpl$getDeveloperAppsById$1$1.c = iIntValue2;
        return developerRepositoryImpl$getDeveloperAppsById$1$1.invokeSuspend(tx8.a);
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
        pl1 pl1Var = this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        pl1Var.getClass();
        z57 z57VarCreateRequestUrl = pl1Var.createRequestUrl("v1/developers", "{id}/applicationsById", kotlin.collections.b.O(new Pair("id", this.e)), pl1Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<DeveloperApplicationListDto>() { // from class: ir.mservices.market.app.detail.developer.service.DeveloperService$getDeveloperAppsById$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(pl1Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
