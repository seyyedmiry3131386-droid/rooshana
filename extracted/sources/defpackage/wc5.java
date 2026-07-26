package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.data.AccountPersonalDto;
import ir.mservices.market.myAccount.data.MyAccountInfoDto;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.lang.reflect.Type;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class wc5 extends o2 {
    public final Object g(MyAccountItemsType myAccountItemsType, Object obj, SuspendLambda suspendLambda) {
        z57 z57VarCreateRequestUrl = createRequestUrl("social", "v1/profiles/own/info/".concat(myAccountItemsType.a), null, getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.myAccount.services.MyAccountService$deleteInfo$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.r(this, type, z57VarCreateRequestUrl, null, obj, suspendLambda);
    }

    public final Object h(Object obj, SuspendLambda suspendLambda) {
        z57 z57VarCreateRequestUrl = createRequestUrl("social", "v1/profiles/own/info", null, getCommonQueryParam());
        Type type = new TypeToken<MyAccountInfoDto>() { // from class: ir.mservices.market.myAccount.services.MyAccountService$getPersonalInfo$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(this, type, z57VarCreateRequestUrl, obj, suspendLambda, 504);
    }

    public final Object i(MyAccountItemsType myAccountItemsType, AccountPersonalDto accountPersonalDto, Object obj, g51 g51Var) {
        z57 z57VarCreateRequestUrl = createRequestUrl("social", "v1/profiles/own/info/".concat(myAccountItemsType.a), null, getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.myAccount.services.MyAccountService$putInfo$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.I(this, type, z57VarCreateRequestUrl, accountPersonalDto, obj, null, g51Var, 496);
    }
}
