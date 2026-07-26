package ir.mservices.market.vpnService.adGuard.ui;

import android.content.Intent;
import android.net.VpnService;
import defpackage.dp2;
import defpackage.g51;
import defpackage.lk2;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$9", f = "AdGuardFragment.kt", l = {204}, m = "invokeSuspend", v = 1)
final class AdGuardFragment$onViewCreated$3$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AdGuardFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$9$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$9$1", f = "AdGuardFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            tx8 tx8Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            AdGuardFragment adGuardFragment = this.a;
            Intent intentPrepare = VpnService.prepare(adGuardFragment.H());
            tx8 tx8Var2 = tx8.a;
            if (intentPrepare != null) {
                lk2 lk2Var = adGuardFragment.Z0;
                if (lk2Var != null) {
                    lk2Var.a(intentPrepare);
                    tx8Var = tx8Var2;
                } else {
                    tx8Var = null;
                }
                if (tx8Var != null) {
                    return tx8Var2;
                }
            }
            adGuardFragment.l1().r(AdGuardAction.StartVpnAction.INSTANCE);
            return tx8Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardFragment$onViewCreated$3$9(AdGuardFragment adGuardFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = adGuardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AdGuardFragment$onViewCreated$3$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AdGuardFragment$onViewCreated$3$9) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AdGuardFragment.a1;
            AdGuardFragment adGuardFragment = this.b;
            pv6 pv6Var = adGuardFragment.l1().L;
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
