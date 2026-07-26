package ir.mservices.market.login.ui;

import defpackage.c5;
import defpackage.e71;
import defpackage.f88;
import defpackage.fm8;
import defpackage.g51;
import defpackage.h99;
import defpackage.j99;
import defpackage.l99;
import defpackage.n99;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qp2;
import defpackage.r2;
import defpackage.s2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u4;
import defpackage.wq2;
import defpackage.x86;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.version2.webapi.requestdto.LoginPinRequestDto;
import ir.mservices.market.version2.webapi.responsedto.VerifyResultDTO;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.PinViewModel$verify$1", f = "PinViewModel.kt", l = {98}, m = "invokeSuspend", v = 1)
final class PinViewModel$verify$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PinViewModel b;
    public final /* synthetic */ PinBindData c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinViewModel$verify$1(PinViewModel pinViewModel, PinBindData pinBindData, String str, String str2, g51 g51Var) {
        super(2, g51Var);
        this.b = pinViewModel;
        this.c = pinBindData;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PinViewModel$verify$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PinViewModel$verify$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objU;
        PinViewModel pinViewModel = this.b;
        l lVar = pinViewModel.k;
        l lVar2 = pinViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        String str = this.e;
        if (i == 0) {
            b.b(obj);
            x86 x86Var = pinViewModel.b;
            String str2 = this.c.a;
            String str3 = pinViewModel.h.b.c;
            this.a = 1;
            x86Var.getClass();
            om0 om0Var = new om0(1, ok4.I(this));
            om0Var.v();
            s2 s2Var = new s2(om0Var, 1);
            r2 r2Var = new r2(om0Var, 1);
            LoginPinRequestDto loginPinRequestDto = new LoginPinRequestDto();
            if (f88.n0(str)) {
                loginPinRequestDto.setPin(this.d);
            } else {
                loginPinRequestDto.setRawText(str);
            }
            loginPinRequestDto.setConfirmed(true);
            c5 c5Var = x86Var.b;
            c5Var.getClass();
            ((ir.mservices.market.version2.services.b) c5Var.c.get()).h(c5Var.a, str2, wq2.y(c5Var.g), str3, pinViewModel, loginPinRequestDto, new u4(c5Var, str2, str3, s2Var, 0), r2Var);
            objU = om0Var.u();
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            objU = obj;
        }
        n99 n99Var = (n99) objU;
        if (n99Var instanceof h99) {
            Boolean bool = Boolean.FALSE;
            lVar2.getClass();
            lVar2.p(null, bool);
            if (!f88.n0(str)) {
                l lVar3 = pinViewModel.d;
                lVar3.getClass();
                lVar3.p(null, "");
            }
            h99 h99Var = new h99(((h99) n99Var).a);
            lVar.getClass();
            lVar.p(null, h99Var);
        } else if (!(n99Var instanceof j99)) {
            if (!(n99Var instanceof l99)) {
                throw new NoWhenBranchMatchedException();
            }
            l99 l99Var = new l99(((VerifyResultDTO) ((l99) n99Var).a).getTranslatedMessage());
            lVar.getClass();
            lVar.p(null, l99Var);
            fm8 fm8Var = pinViewModel.c;
            fm8Var.b = 0;
            fm8Var.a = 0L;
            fm8Var.c = 0;
            fm8Var.e = null;
            fm8Var.d = null;
            Boolean bool2 = Boolean.FALSE;
            lVar2.getClass();
            lVar2.p(null, bool2);
        }
        return tx8.a;
    }
}
