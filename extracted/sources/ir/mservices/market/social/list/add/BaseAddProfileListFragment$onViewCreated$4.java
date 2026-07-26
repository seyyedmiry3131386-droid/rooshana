package ir.mservices.market.social.list.add;

import defpackage.dp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.h99;
import defpackage.hh2;
import defpackage.is3;
import defpackage.j99;
import defpackage.l99;
import defpackage.n99;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.appDetail.SingleActionToolbarView;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.MyketProgressState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$4", f = "BaseAddProfileListFragment.kt", l = {145}, m = "invokeSuspend", v = 1)
final class BaseAddProfileListFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseAddProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$4$1", f = "BaseAddProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BaseAddProfileListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = baseAddProfileListFragment;
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
            boolean z = n99Var instanceof h99;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            if (z) {
                ErrorDTO errorDTO = ((h99) n99Var).a;
                String translatedMessage = errorDTO.getTranslatedMessage();
                if (translatedMessage != null && !f88.n0(translatedMessage)) {
                    hh2.H(new hh2(baseAddProfileListFragment.H(), errorDTO.getTranslatedMessage()));
                }
                SingleActionToolbarView singleActionToolbarView = baseAddProfileListFragment.a1;
                if (singleActionToolbarView != null) {
                    singleActionToolbarView.setButtonState(MyketProgressState.b);
                }
            } else if (n99Var instanceof j99) {
                SingleActionToolbarView singleActionToolbarView2 = baseAddProfileListFragment.a1;
                if (singleActionToolbarView2 != null) {
                    singleActionToolbarView2.setButtonState(MyketProgressState.c);
                }
            } else {
                if (!(n99Var instanceof l99)) {
                    throw new NoWhenBranchMatchedException();
                }
                SingleActionToolbarView singleActionToolbarView3 = baseAddProfileListFragment.a1;
                if (singleActionToolbarView3 != null) {
                    singleActionToolbarView3.setButtonState(MyketProgressState.b);
                }
                DialogDataModel dialogDataModelM1 = baseAddProfileListFragment.m1();
                dialogDataModelM1.d = DialogResult.a;
                baseAddProfileListFragment.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModelM1)), dialogDataModelM1.a);
                baseAddProfileListFragment.J0.q();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddProfileListFragment$onViewCreated$4(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseAddProfileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseAddProfileListFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseAddProfileListFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = BaseAddProfileListFragment.c1;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            o4 o4Var = new o4(baseAddProfileListFragment.t1().L, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseAddProfileListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
