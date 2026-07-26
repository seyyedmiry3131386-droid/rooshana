package ir.mservices.market.myAccount;

import androidx.fragment.app.d;
import defpackage.dp2;
import defpackage.g51;
import defpackage.h99;
import defpackage.hh2;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um1;
import ir.mservices.market.version2.fragments.dialog.SingleChoiceDialogFragment;
import ir.mservices.market.views.MyketProgressState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.MyAccountRecyclerListFragment$onViewCreated$2", f = "MyAccountRecyclerListFragment.kt", l = {122}, m = "invokeSuspend", v = 1)
final class MyAccountRecyclerListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MyAccountRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.MyAccountRecyclerListFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.MyAccountRecyclerListFragment$onViewCreated$2$1", f = "MyAccountRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MyAccountRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MyAccountRecyclerListFragment myAccountRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = myAccountRecyclerListFragment;
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
            MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
            if (z) {
                int i = MyAccountRecyclerListFragment.m1;
                if (myAccountRecyclerListFragment.J0.g() instanceof SingleChoiceDialogFragment) {
                    myAccountRecyclerListFragment.J0.q();
                }
            } else if (n99Var instanceof h99) {
                int i2 = MyAccountRecyclerListFragment.m1;
                d dVarG = myAccountRecyclerListFragment.J0.g();
                if (dVarG instanceof SingleChoiceDialogFragment) {
                    MyketProgressState myketProgressState = MyketProgressState.b;
                    um1 um1Var = ((SingleChoiceDialogFragment) dVarG).i1;
                    js3.m(um1Var);
                    um1Var.v.setStateCommit(myketProgressState);
                }
                hh2.H(new hh2(myAccountRecyclerListFragment.F(), ((h99) n99Var).a.getTranslatedMessage()));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountRecyclerListFragment$onViewCreated$2(MyAccountRecyclerListFragment myAccountRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = myAccountRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MyAccountRecyclerListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MyAccountRecyclerListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MyAccountRecyclerListFragment.m1;
            MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
            pv6 pv6Var = myAccountRecyclerListFragment.T1().B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(myAccountRecyclerListFragment, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
