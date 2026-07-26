package ir.mservices.market.login.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.km;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wn2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$2", f = "PinLoginDialogFragment.kt", l = {126}, m = "invokeSuspend", v = 1)
final class PinLoginDialogFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PinLoginDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.login.ui.PinLoginDialogFragment$onViewCreated$2$2", f = "PinLoginDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PinLoginDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = pinLoginDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            wn2 wn2Var = this.b.n1;
            js3.m(wn2Var);
            wn2Var.y.setText(str);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinLoginDialogFragment$onViewCreated$2(PinLoginDialogFragment pinLoginDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pinLoginDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PinLoginDialogFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PinLoginDialogFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PinLoginDialogFragment pinLoginDialogFragment = this.b;
            km kmVar = new km(new o4(pinLoginDialogFragment.f1().e, 9), 1);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(pinLoginDialogFragment, null);
            this.a = 1;
            if (d.f(kmVar, anonymousClass2, this) == coroutineSingletons) {
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
