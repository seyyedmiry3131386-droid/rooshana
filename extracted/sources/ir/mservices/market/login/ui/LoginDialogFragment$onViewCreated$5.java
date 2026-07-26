package ir.mservices.market.login.ui;

import defpackage.am2;
import defpackage.dp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.h99;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.lw8;
import defpackage.ml2;
import defpackage.n99;
import defpackage.o4;
import defpackage.pk5;
import defpackage.pt2;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v86;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.version2.model.BindHistoryModel;
import ir.mservices.market.version2.webapi.responsedto.AccountInfoDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.LoginDialogFragment$onViewCreated$5", f = "LoginDialogFragment.kt", l = {190}, m = "invokeSuspend", v = 1)
final class LoginDialogFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ LoginDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.login.ui.LoginDialogFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.login.ui.LoginDialogFragment$onViewCreated$5$1", f = "LoginDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ LoginDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginDialogFragment loginDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = loginDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = n99Var instanceof j99;
            LoginDialogFragment loginDialogFragment = this.b;
            if (z) {
                ml2 ml2Var = loginDialogFragment.n1;
                js3.m(ml2Var);
                ml2Var.x.setStateCommit(MyketProgressState.c);
                ml2 ml2Var2 = loginDialogFragment.n1;
                js3.m(ml2Var2);
                ml2Var2.v.setVisibility(4);
            } else if (n99Var instanceof h99) {
                loginDialogFragment.g1();
                ErrorDTO errorDTO = ((h99) n99Var).a;
                String translatedMessage = errorDTO.getTranslatedMessage();
                if (translatedMessage != null && !f88.n0(translatedMessage)) {
                    ml2 ml2Var3 = loginDialogFragment.n1;
                    js3.m(ml2Var3);
                    MyketTextView myketTextView = ml2Var3.v;
                    myketTextView.setVisibility(0);
                    myketTextView.setText(errorDTO.getTranslatedMessage());
                    ml2 ml2Var4 = loginDialogFragment.n1;
                    js3.m(ml2Var4);
                    ml2Var4.w.setErrorEnabled(true);
                }
            } else {
                if (!(n99Var instanceof l99)) {
                    throw new NoWhenBranchMatchedException();
                }
                loginDialogFragment.g1();
                LoginData loginData = loginDialogFragment.e1().b;
                loginDialogFragment.P0();
                ml2 ml2Var5 = loginDialogFragment.n1;
                js3.m(ml2Var5);
                String strJ = lw8.j(f88.J0(ml2Var5.y.getText().toString()).toString());
                ml2 ml2Var6 = loginDialogFragment.n1;
                js3.m(ml2Var6);
                BindAutoCompleteView bindAutoCompleteView = ml2Var6.y;
                bindAutoCompleteView.getClass();
                bindAutoCompleteView.o.z(new BindHistoryModel(strJ), new pt2(11, bindAutoCompleteView), new ql4(9, bindAutoCompleteView), bindAutoCompleteView);
                LoginData loginData2 = new LoginData(new PinBindData((AccountInfoDto) ((l99) n99Var).a, strJ), "", loginData.c, (String) null, (String) null, (String) null, (String) null, 1016);
                loginData2.i = PaymentRequiredBindingDto.BINDING_ANY;
                am2 am2VarJ0 = loginDialogFragment.J0();
                if (am2VarJ0 != null) {
                    am2VarJ0.q();
                }
                pk5.g(loginDialogFragment.J0(), new NavIntentDirections.PinLogin(new v86(loginDialogFragment.e1().a, loginData2, loginData)), -1);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginDialogFragment$onViewCreated$5(LoginDialogFragment loginDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = loginDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new LoginDialogFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((LoginDialogFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            LoginDialogFragment loginDialogFragment = this.b;
            o4 o4Var = new o4(((LoginViewModel) loginDialogFragment.o1.getValue()).y, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(loginDialogFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
