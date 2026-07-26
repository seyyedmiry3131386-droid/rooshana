package ir.mservices.market.login.ui;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.e71;
import defpackage.f88;
import defpackage.fm8;
import defpackage.g51;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub1;
import defpackage.ul1;
import defpackage.v86;
import defpackage.wq2;
import defpackage.x86;
import defpackage.y86;
import defpackage.z57;
import defpackage.z86;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.version2.webapi.responsedto.BindResultDTO;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.PinViewModel$retryVerificationCode$1", f = "PinViewModel.kt", l = {134}, m = "invokeSuspend", v = 1)
final class PinViewModel$retryVerificationCode$1 extends SuspendLambda implements qp2 {
    public l a;
    public int b;
    public final /* synthetic */ PinViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinViewModel$retryVerificationCode$1(PinViewModel pinViewModel, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.c = pinViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PinViewModel$retryVerificationCode$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PinViewModel$retryVerificationCode$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objV;
        PinViewModel pinViewModel = this.c;
        fm8 fm8Var = pinViewModel.c;
        v86 v86Var = pinViewModel.h;
        l lVar = pinViewModel.m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            j99 j99Var = new j99(null);
            lVar.getClass();
            lVar.p(null, j99Var);
            x86 x86Var = pinViewModel.b;
            String strI = t61.i(v86Var.c.c, "-retry");
            BindData bindData = v86Var.b.a;
            js3.n(bindData, "null cannot be cast to non-null type ir.mservices.market.login.data.PinBindData");
            String str = ((PinBindData) bindData).a;
            this.a = lVar;
            this.b = 1;
            y86 y86Var = x86Var.c;
            String strA = x86Var.b.a();
            js3.o(strA, "getAccountId(...)");
            String strY = wq2.y(x86Var.a);
            y86Var.getClass();
            Pattern pattern = ul1.a;
            LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("emailOrPhone", ub1.F(str)), new Pair("accountId", strA));
            LinkedHashMap linkedHashMapO2 = kotlin.collections.b.O(new Pair("isVoiceMsg", String.valueOf(this.d)), new Pair("retryCount", String.valueOf(0)));
            if (strI != null && !f88.n0(strI)) {
                linkedHashMapO2.put("source", strI);
            }
            if (!f88.n0(strY)) {
                linkedHashMapO2.put("androidId", strY);
            }
            z57 z57VarCreateRequestUrl = y86Var.createRequestUrl("v1/accounts", "{accountId}/{emailOrPhone}/verificationcode", linkedHashMapO, y86Var.getCommonQueryParam(linkedHashMapO2));
            Type type = new TypeToken<BindResultDTO>() { // from class: ir.mservices.market.login.service.PinService$getVerificationCode$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            objV = dy3.v(y86Var, type, z57VarCreateRequestUrl, pinViewModel, this, 504);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.a;
            b.b(obj);
            objV = obj;
        }
        n99 n99Var = (n99) objV;
        if (n99Var instanceof l99) {
            BindResultDTO bindResultDTO = (BindResultDTO) ((l99) n99Var).a;
            pinViewModel.x = bindResultDTO.getDelayInSec();
            l lVar2 = pinViewModel.u;
            PinBindData pinBindData = (PinBindData) lVar2.getValue();
            if (pinBindData != null) {
                pinBindData.c = bindResultDTO.getLength();
            } else {
                pinBindData = null;
            }
            lVar2.o(pinBindData);
            fm8Var.c = bindResultDTO.getLength();
            l lVar3 = pinViewModel.s;
            Boolean bool = Boolean.FALSE;
            lVar3.getClass();
            lVar3.p(null, bool);
            l lVar4 = pinViewModel.o;
            Boolean boolValueOf = Boolean.valueOf(bindResultDTO.isVoiceMsgEnable());
            lVar4.getClass();
            lVar4.p(null, boolValueOf);
            fm8Var.b = pinViewModel.x;
            fm8Var.a = System.currentTimeMillis();
            z86 z86Var = new z86(pinViewModel, ((long) pinViewModel.x) * 1000);
            pinViewModel.w = z86Var;
            z86Var.start();
        }
        lVar.o(objV);
        return tx8.a;
    }
}
