package ir.mservices.market.social.users.list.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw;
import defpackage.sp2;
import defpackage.t19;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y19;
import defpackage.z57;
import ir.mservices.market.social.users.common.data.UsersDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.list.model.UserRepositoryImpl$getUsers$1$1", f = "UserRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
final class UserRepositoryImpl$getUsers$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ t19 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ir.mservices.market.viewModel.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$getUsers$1$1(t19 t19Var, String str, ir.mservices.market.viewModel.a aVar, g51 g51Var) {
        super(4, g51Var);
        this.d = t19Var;
        this.e = str;
        this.f = aVar;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        String str = this.e;
        ir.mservices.market.viewModel.a aVar = this.f;
        UserRepositoryImpl$getUsers$1$1 userRepositoryImpl$getUsers$1$1 = new UserRepositoryImpl$getUsers$1$1(this.d, str, aVar, (g51) obj4);
        userRepositoryImpl$getUsers$1$1.b = iIntValue;
        userRepositoryImpl$getUsers$1$1.c = iIntValue2;
        return userRepositoryImpl$getUsers$1$1.invokeSuspend(tx8.a);
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
        y19 y19Var = this.d.a;
        this.b = i;
        this.c = i2;
        this.a = 1;
        y19Var.getClass();
        String str = this.e;
        lw.f(null, null, str.length() > 0);
        z57 z57VarCreateRequestUrl = y19Var.createRequestUrl("social", "v1/suggestions/users/{type}", kotlin.collections.b.O(new Pair("type", str)), y19Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<UsersDto>() { // from class: ir.mservices.market.social.users.list.services.UserService$getUsers$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(y19Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
