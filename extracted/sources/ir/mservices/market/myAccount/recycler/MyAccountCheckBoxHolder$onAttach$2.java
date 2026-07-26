package ir.mservices.market.myAccount.recycler;

import defpackage.e71;
import defpackage.g5;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketSwitch;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.recycler.MyAccountCheckBoxHolder$onAttach$2", f = "MyAccountCheckBox.kt", l = {134}, m = "invokeSuspend", v = 1)
final class MyAccountCheckBoxHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyAccountCheckBoxData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.recycler.MyAccountCheckBoxHolder$onAttach$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.recycler.MyAccountCheckBoxHolder$onAttach$2$1", f = "MyAccountCheckBox.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, g51 g51Var) {
            super(2, g51Var);
            this.b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            g5 g5Var = this.b.y;
            if (g5Var == null) {
                js3.V("binding");
                throw null;
            }
            LoadingView loadingView = g5Var.w;
            MyketSwitch myketSwitch = g5Var.v;
            js3.o(myketSwitch, "checkBox");
            myketSwitch.setVisibility(z ? 4 : 0);
            js3.o(loadingView, "loading");
            loadingView.setVisibility(z ? 0 : 8);
            loadingView.d(z);
            g5Var.x.setClickable(!z);
            g5Var.y.setClickable(!z);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountCheckBoxHolder$onAttach$2(g51 g51Var, MyAccountCheckBoxData myAccountCheckBoxData, a aVar) {
        super(2, g51Var);
        this.b = myAccountCheckBoxData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyAccountCheckBoxHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyAccountCheckBoxHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            rv6 rv6Var = this.b.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
