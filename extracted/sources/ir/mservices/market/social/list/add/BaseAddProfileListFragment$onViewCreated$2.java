package ir.mservices.market.social.list.add;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.k12;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t50;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wk2;
import ir.mservices.market.appDetail.SingleActionToolbarView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$2", f = "BaseAddProfileListFragment.kt", l = {119}, m = "invokeSuspend", v = 1)
final class BaseAddProfileListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseAddProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$2$1", f = "BaseAddProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            SingleActionToolbarView singleActionToolbarView = baseAddProfileListFragment.a1;
            if (singleActionToolbarView != null) {
                singleActionToolbarView.setButtonEnabled(!list.isEmpty());
                singleActionToolbarView.setPageTitle(baseAddProfileListFragment.o1(list.size()));
            }
            wk2 wk2Var = baseAddProfileListFragment.Z0;
            js3.m(wk2Var);
            k12 k12Var = wk2Var.v;
            LottieAnimationView lottieAnimationView = k12Var.w;
            BigFillOvalButton bigFillOvalButton = k12Var.v;
            js3.o(lottieAnimationView, "emptyIcon");
            lottieAnimationView.setVisibility(8);
            MyketTextView myketTextView = k12Var.x;
            js3.o(myketTextView, "emptyMessage");
            myketTextView.setVisibility(list.isEmpty() ? 0 : 8);
            js3.o(bigFillOvalButton, "actionButton");
            bigFillOvalButton.setVisibility(list.isEmpty() ? 0 : 8);
            bigFillOvalButton.setOnClickListener(new t50(baseAddProfileListFragment, 3));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddProfileListFragment$onViewCreated$2(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseAddProfileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseAddProfileListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseAddProfileListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = BaseAddProfileListFragment.c1;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            rv6 rv6Var = baseAddProfileListFragment.t1().B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseAddProfileListFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
