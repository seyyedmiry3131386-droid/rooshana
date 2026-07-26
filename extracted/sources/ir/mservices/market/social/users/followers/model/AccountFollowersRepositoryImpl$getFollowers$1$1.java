package ir.mservices.market.social.users.followers.model;

import com.google.common.reflect.TypeToken;
import defpackage.dy3;
import defpackage.fh2;
import defpackage.g51;
import defpackage.js3;
import defpackage.r79;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.social.users.common.data.UsersDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.followers.model.AccountFollowersRepositoryImpl$getFollowers$1$1", f = "AccountFollowersRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 1)
final class AccountFollowersRepositoryImpl$getFollowers$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ r79 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ BaseAccountUsersViewModel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFollowersRepositoryImpl$getFollowers$1$1(r79 r79Var, String str, BaseAccountUsersViewModel baseAccountUsersViewModel, g51 g51Var) {
        super(4, g51Var);
        this.d = r79Var;
        this.e = str;
        this.f = baseAccountUsersViewModel;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        String str = this.e;
        BaseAccountUsersViewModel baseAccountUsersViewModel = this.f;
        AccountFollowersRepositoryImpl$getFollowers$1$1 accountFollowersRepositoryImpl$getFollowers$1$1 = new AccountFollowersRepositoryImpl$getFollowers$1$1(this.d, str, baseAccountUsersViewModel, (g51) obj4);
        accountFollowersRepositoryImpl$getFollowers$1$1.b = iIntValue;
        accountFollowersRepositoryImpl$getFollowers$1$1.c = iIntValue2;
        return accountFollowersRepositoryImpl$getFollowers$1$1.invokeSuspend(tx8.a);
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
        fh2 fh2Var = (fh2) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        fh2Var.getClass();
        z57 z57VarCreateRequestUrl = fh2Var.createRequestUrl("social", "v1/profiles/{accountKey}/followers", kotlin.collections.b.O(new Pair("accountKey", this.e)), fh2Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
        Type type = new TypeToken<UsersDto>() { // from class: ir.mservices.market.social.users.followers.service.FollowersAccountService$getFollowers$2
        }.e;
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(fh2Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
