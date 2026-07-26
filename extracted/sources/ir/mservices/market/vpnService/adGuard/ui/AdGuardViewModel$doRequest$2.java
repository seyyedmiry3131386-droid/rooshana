package ir.mservices.market.vpnService.adGuard.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.j99;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.vpnService.adGuard.data.AdGuardData;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2", f = "AdGuardViewModel.kt", l = {116, 116}, m = "invokeSuspend", v = 1)
final class AdGuardViewModel$doRequest$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AdGuardViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2$1", f = "AdGuardViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AdGuardViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdGuardViewModel adGuardViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = adGuardViewModel;
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
            AdGuardViewModel adGuardViewModel = this.b;
            if (((Boolean) adGuardViewModel.M.a.getValue()).booleanValue()) {
                adGuardViewModel.x.d(Boolean.FALSE, "stopVpn");
                adGuardViewModel.r(AdGuardAction.DisconnectActiveServiceAction.INSTANCE);
            }
            if (n99Var instanceof l99) {
                adGuardViewModel.z = ((AdGuardData) ((l99) n99Var).a).getDomains();
            }
            if (!(n99Var instanceof j99)) {
                adGuardViewModel.A.o(n99Var);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardViewModel$doRequest$2(AdGuardViewModel adGuardViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = adGuardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdGuardViewModel$doRequest$2(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdGuardViewModel$doRequest$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r6, r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.a
            ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.b.b(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.b.b(r6)
            goto L2c
        L1e:
            kotlin.b.b(r6)
            ir.mservices.market.vpnService.adGuard.ui.model.a r6 = r2.v
            r5.a = r4
            vb7 r6 = r6.a(r2)
            if (r6 != r0) goto L2c
            goto L3c
        L2c:
            xe2 r6 = (defpackage.xe2) r6
            ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2$1 r1 = new ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2$1
            r4 = 0
            r1.<init>(r2, r4)
            r5.a = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.d.f(r6, r1, r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$doRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
