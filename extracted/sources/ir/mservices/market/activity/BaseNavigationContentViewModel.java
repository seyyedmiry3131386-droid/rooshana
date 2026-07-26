package ir.mservices.market.activity;

import defpackage.bt2;
import defpackage.e71;
import defpackage.e80;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.activity.BaseNavigationContentAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseNavigationContentViewModel extends a {
    public final l v;
    public final rv6 w;

    /* JADX INFO: renamed from: ir.mservices.market.activity.BaseNavigationContentViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.activity.BaseNavigationContentViewModel$1", f = "BaseNavigationContentViewModel.kt", l = {56}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseNavigationContentViewModel.this.new AnonymousClass1(g51Var);
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
            BaseNavigationContentViewModel baseNavigationContentViewModel = BaseNavigationContentViewModel.this;
            pv6 pv6Var = baseNavigationContentViewModel.u;
            r4 r4Var = new r4(11, baseNavigationContentViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 14), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    public BaseNavigationContentViewModel() {
        super(false);
        l lVarB = ja1.b(null);
        this.v = lVarB;
        this.w = new rv6(lVarB);
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearInstallPermissionEventAction(BaseNavigationContentAction.ClearInstallPermissionEventAction clearInstallPermissionEventAction) {
        this.v.o(null);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    public final void onEvent(e80 e80Var) {
        l lVar;
        Object value;
        js3.p(e80Var, "event");
        do {
            lVar = this.v;
            value = lVar.getValue();
        } while (!lVar.n(value, e80Var));
    }
}
