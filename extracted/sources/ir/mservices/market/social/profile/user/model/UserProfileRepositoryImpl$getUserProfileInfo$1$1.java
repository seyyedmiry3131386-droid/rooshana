package ir.mservices.market.social.profile.user.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.hl5;
import defpackage.js3;
import defpackage.s19;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.social.profile.data.ProfileResponseDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.model.UserProfileRepositoryImpl$getUserProfileInfo$1$1", f = "UserProfileRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 1)
final class UserProfileRepositoryImpl$getUserProfileInfo$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ hl5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileRepositoryImpl$getUserProfileInfo$1$1(g51 g51Var, hl5 hl5Var, Object obj, String str, String str2) {
        super(1, g51Var);
        this.b = hl5Var;
        this.c = str;
        this.d = str2;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        String str = this.d;
        return new UserProfileRepositoryImpl$getUserProfileInfo$1$1(g51Var, this.b, this.e, this.c, str);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileRepositoryImpl$getUserProfileInfo$1$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        s19 s19Var = (s19) this.b.b;
        this.a = 1;
        s19Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("accountKey", this.c));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.d;
        if (str != null && !f88.n0(str)) {
            linkedHashMap.put("refId", str);
        }
        z57 z57VarCreateRequestUrl = s19Var.createRequestUrl("social", "v1/profiles/{accountKey}", linkedHashMapO, s19Var.getCommonQueryParam(s19Var.getCommonQueryParam(linkedHashMap)));
        Type type = new TypeToken<ProfileResponseDto>() { // from class: ir.mservices.market.social.profile.user.service.UserProfileService$getUserProfileData$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(s19Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
