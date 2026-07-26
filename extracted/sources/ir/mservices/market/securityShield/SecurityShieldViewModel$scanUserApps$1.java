package ir.mservices.market.securityShield;

import com.google.gson.reflect.TypeToken;
import defpackage.bn6;
import defpackage.dy3;
import defpackage.e71;
import defpackage.g51;
import defpackage.hl7;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.version2.webapi.requestdto.ShieldAppsRequestDTO;
import ir.mservices.market.version2.webapi.responsedto.HarmfulAppData;
import ir.mservices.market.version2.webapi.responsedto.HarmfulAppsDto;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$scanUserApps$1", f = "SecurityShieldViewModel.kt", l = {444}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$scanUserApps$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ SecurityShieldViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$scanUserApps$1(g51 g51Var, SecurityShieldViewModel securityShieldViewModel, List list) {
        super(2, g51Var);
        this.b = list;
        this.c = securityShieldViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$scanUserApps$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$scanUserApps$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SecurityShieldViewModel securityShieldViewModel = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            ShieldAppsRequestDTO shieldAppsRequestDTO = new ShieldAppsRequestDTO(this.b);
            bn6 bn6Var = securityShieldViewModel.t;
            this.a = 1;
            hl7 hl7Var = (hl7) bn6Var.c;
            z57 z57VarCreateRequestUrl = hl7Var.createRequestUrl("v2/harmfuls/scan", null, null, hl7Var.getCommonQueryParam());
            Type type = new TypeToken<HarmfulAppsDto>() { // from class: ir.mservices.market.securityShield.services.SecurityShieldService$scanUserApps$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.G(hl7Var, type, z57VarCreateRequestUrl, shieldAppsRequestDTO, null, null, null, this, 496);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            securityShieldViewModel.J = new HarmfulAppData((HarmfulAppsDto) ((l99) n99Var).a);
        }
        securityShieldViewModel.H = ProcessState.c;
        securityShieldViewModel.w();
        return tx8.a;
    }
}
