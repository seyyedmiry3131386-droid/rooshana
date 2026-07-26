package ir.mservices.market.gateway.ui;

import defpackage.av;
import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.gateway.ui.GatewayItemAction;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class GatewayListViewModel extends a {
    public final rv6 A;
    public final av v;
    public final GatewayBottomDialogFragment.GatewayData w;
    public final l x;
    public final rv6 y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.gateway.ui.GatewayListViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.gateway.ui.GatewayListViewModel$1", f = "GatewayListViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return GatewayListViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            GatewayListViewModel gatewayListViewModel = GatewayListViewModel.this;
            pv6 pv6Var = gatewayListViewModel.u;
            bj2 bj2Var = new bj2(1, gatewayListViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 5), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayListViewModel(av avVar, jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = avVar;
        GatewayBottomDialogFragment.GatewayData gatewayData = (GatewayBottomDialogFragment.GatewayData) jd7Var.b("gatewayData");
        this.w = gatewayData;
        l lVarB = ja1.b(gatewayData != null ? (GatewayDTO) gatewayData.c.get(0) : null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
        l lVarB2 = ja1.b(3);
        this.z = lVarB2;
        this.A = new rv6(lVarB2);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectAction(GatewayItemAction.SelectAction selectAction) {
        l lVar;
        Object value;
        do {
            lVar = this.x;
            value = lVar.getValue();
        } while (!lVar.n(value, selectAction.getSelectedAction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetMaxSpan(GatewayItemAction.SetMaxSpan setMaxSpan) {
        l lVar;
        Object value;
        do {
            lVar = this.z;
            value = lVar.getValue();
            ((Number) value).intValue();
        } while (!lVar.n(value, Integer.valueOf(setMaxSpan.getMaxSpan())));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new GatewayListViewModel$doRequest$1(this, null));
    }
}
