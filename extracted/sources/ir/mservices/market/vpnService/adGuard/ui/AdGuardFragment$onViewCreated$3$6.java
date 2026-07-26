package ir.mservices.market.vpnService.adGuard.ui;

import defpackage.dd;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.g51;
import defpackage.js3;
import defpackage.pk5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$6", f = "AdGuardFragment.kt", l = {186}, m = "invokeSuspend", v = 1)
final class AdGuardFragment$onViewCreated$3$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AdGuardFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$6$1", f = "AdGuardFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ AdGuardFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdGuardFragment adGuardFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = adGuardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tx8) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = AdGuardFragment.a1;
            AdGuardFragment adGuardFragment = this.a;
            String string = adGuardFragment.K().getString(rs6.ad_guard_alert_dialog);
            js3.o(string, "getString(...)");
            pk5.g(adGuardFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(dw1.n("AdGuardFragment_", adGuardFragment.H0), "DIALOG_KEY_AD_GUARD", null, 12), null, -1, null, string, adGuardFragment.L(rs6.proceed), adGuardFragment.L(rs6.button_cancel), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardFragment$onViewCreated$3$6(AdGuardFragment adGuardFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = adGuardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AdGuardFragment$onViewCreated$3$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AdGuardFragment$onViewCreated$3$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AdGuardFragment.a1;
            AdGuardFragment adGuardFragment = this.b;
            pv6 pv6Var = adGuardFragment.l1().F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(adGuardFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
