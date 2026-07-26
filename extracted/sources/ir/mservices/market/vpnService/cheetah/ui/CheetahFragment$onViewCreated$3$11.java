package ir.mservices.market.vpnService.cheetah.ui;

import defpackage.dp2;
import defpackage.dp3;
import defpackage.eq0;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$11", f = "CheetahFragment.kt", l = {220}, m = "invokeSuspend", v = 1)
final class CheetahFragment$onViewCreated$3$11 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ CheetahFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$11$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$11$1", f = "CheetahFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ CheetahFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheetahFragment cheetahFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = cheetahFragment;
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
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("cheetah_run_app");
            clickEventBuilder.a();
            int i = CheetahFragment.b1;
            dp3.M(((eq0) this.a.X0.getValue()).a);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheetahFragment$onViewCreated$3$11(CheetahFragment cheetahFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = cheetahFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CheetahFragment$onViewCreated$3$11(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((CheetahFragment$onViewCreated$3$11) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = CheetahFragment.b1;
            CheetahFragment cheetahFragment = this.b;
            pv6 pv6Var = cheetahFragment.l1().P;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheetahFragment, null);
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
