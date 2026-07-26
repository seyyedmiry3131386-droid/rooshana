package ir.mservices.market.social.profile.own.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vl6;
import defpackage.vo4;
import defpackage.z57;
import ir.mservices.market.social.profile.data.ProfileResponseDto;
import java.lang.reflect.Type;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.model.ProfileRepositoryImpl$getPrivateProfileInfo$1$1", f = "ProfileRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 1)
final class ProfileRepositoryImpl$getPrivateProfileInfo$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ vo4 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$getPrivateProfileInfo$1$1(vo4 vo4Var, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = vo4Var;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileRepositoryImpl$getPrivateProfileInfo$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileRepositoryImpl$getPrivateProfileInfo$1$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        vl6 vl6Var = (vl6) this.b.b;
        this.a = 1;
        z57 z57VarCreateRequestUrl = vl6Var.createRequestUrl("social", "v1/profiles/own", null, vl6Var.getCommonQueryParam(vl6Var.getCommonQueryParam()));
        Type type = new TypeToken<ProfileResponseDto>() { // from class: ir.mservices.market.social.profile.own.service.ProfileService$getOwnProfileData$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(vl6Var, type, z57VarCreateRequestUrl, this.c, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
