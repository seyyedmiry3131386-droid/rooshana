package ir.mservices.market.social.list.add;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wk2;
import defpackage.x69;
import ir.mservices.market.social.list.common.ProfileSearchView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$6", f = "BaseAddProfileListFragment.kt", l = {183}, m = "invokeSuspend", v = 1)
final class BaseAddProfileListFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseAddProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$6$1", f = "BaseAddProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ BaseAddProfileListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = baseAddProfileListFragment;
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
            BaseAddProfileListFragment baseAddProfileListFragment = this.a;
            wk2 wk2Var = baseAddProfileListFragment.Z0;
            js3.m(wk2Var);
            FrameLayout frameLayout = wk2Var.w;
            js3.o(frameLayout, "searchFragment");
            frameLayout.setVisibility(0);
            wk2 wk2Var2 = baseAddProfileListFragment.Z0;
            js3.m(wk2Var2);
            ProfileSearchView profileSearchView = wk2Var2.x;
            js3.m(profileSearchView);
            profileSearchView.setVisibility(0);
            x69 x69Var = profileSearchView.s;
            x69Var.x.requestFocus();
            x69Var.x.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
            baseAddProfileListFragment.w1();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddProfileListFragment$onViewCreated$6(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseAddProfileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseAddProfileListFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseAddProfileListFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = BaseAddProfileListFragment.c1;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            pv6 pv6Var = baseAddProfileListFragment.t1().D;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseAddProfileListFragment, null);
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
