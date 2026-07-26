package ir.mservices.market.login.ui;

import com.google.gson.reflect.TypeToken;
import defpackage.ae4;
import defpackage.dy3;
import defpackage.e71;
import defpackage.f88;
import defpackage.fm8;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub1;
import defpackage.ul1;
import defpackage.wq2;
import defpackage.z57;
import defpackage.zd4;
import ir.mservices.market.version2.webapi.responsedto.AccountInfoDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.LoginViewModel$login$1", f = "LoginViewModel.kt", l = {48}, m = "invokeSuspend", v = 1)
final class LoginViewModel$login$1 extends SuspendLambda implements qp2 {
    public l a;
    public int b;
    public final /* synthetic */ LoginViewModel c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$login$1(LoginViewModel loginViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.c = loginViewModel;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LoginViewModel$login$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginViewModel$login$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        LoginViewModel loginViewModel = this.c;
        if (i == 0) {
            b.b(obj);
            l lVar2 = loginViewModel.x;
            zd4 zd4Var = loginViewModel.t;
            String str = loginViewModel.w.b.c;
            this.a = lVar2;
            this.b = 1;
            ae4 ae4Var = zd4Var.c;
            String strA = zd4Var.b.a();
            String strY = wq2.y(zd4Var.a);
            ae4Var.getClass();
            Pattern pattern = ul1.a;
            LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("emailOrPhone", ub1.F(this.d)));
            if (strA != null && !f88.n0(strA)) {
                linkedHashMapO.put("accountId", strA);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str != null && !f88.n0(str)) {
                linkedHashMap.put("source", str);
            }
            if (!f88.n0(strY)) {
                linkedHashMap.put("androidId", strY);
            }
            z57 z57VarCreateRequestUrl = ae4Var.createRequestUrl("v1/accounts", "{accountId}/{emailOrPhone}/info", linkedHashMapO, ae4Var.getCommonQueryParam(linkedHashMap));
            Type type = new TypeToken<AccountInfoDto>() { // from class: ir.mservices.market.login.service.LoginService$getAccountInfo$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            Object objV = dy3.v(ae4Var, type, z57VarCreateRequestUrl, loginViewModel, this, 504);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            lVar = lVar2;
            obj = objV;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.a;
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            fm8 fm8Var = loginViewModel.u;
            AccountInfoDto accountInfoDto = (AccountInfoDto) ((l99) n99Var).a;
            fm8Var.d = accountInfoDto;
            fm8Var.c = accountInfoDto != null ? accountInfoDto.getLength() : 0;
        }
        lVar.o(obj);
        return tx8.a;
    }
}
