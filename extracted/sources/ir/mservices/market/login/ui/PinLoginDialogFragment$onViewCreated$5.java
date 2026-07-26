package ir.mservices.market.login.ui;

import defpackage.dp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.h99;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wn2;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$5", f = "PinLoginDialogFragment.kt", l = {164}, m = "invokeSuspend", v = 1)
final class PinLoginDialogFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PinLoginDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$5$1", f = "PinLoginDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PinLoginDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = pinLoginDialogFragment;
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
            boolean z = n99Var instanceof l99;
            PinLoginDialogFragment pinLoginDialogFragment = this.b;
            if (z) {
                pinLoginDialogFragment.h1(false, true);
                pinLoginDialogFragment.T0();
            } else if (n99Var instanceof h99) {
                pinLoginDialogFragment.h1(true, true);
                ErrorDTO errorDTO = ((h99) n99Var).a;
                String translatedMessage = errorDTO.getTranslatedMessage();
                if (translatedMessage != null && !f88.n0(translatedMessage)) {
                    wn2 wn2Var = pinLoginDialogFragment.n1;
                    js3.m(wn2Var);
                    MyketTextView myketTextView = wn2Var.v;
                    myketTextView.setVisibility(0);
                    myketTextView.setText(errorDTO.getTranslatedMessage());
                    wn2 wn2Var2 = pinLoginDialogFragment.n1;
                    js3.m(wn2Var2);
                    wn2Var2.w.setErrorEnabled(true);
                }
            } else {
                if (!(n99Var instanceof j99)) {
                    throw new NoWhenBranchMatchedException();
                }
                pinLoginDialogFragment.h1(false, false);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinLoginDialogFragment$onViewCreated$5(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pinLoginDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PinLoginDialogFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PinLoginDialogFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PinLoginDialogFragment pinLoginDialogFragment = this.b;
            rv6 rv6Var = pinLoginDialogFragment.f1().n;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pinLoginDialogFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
