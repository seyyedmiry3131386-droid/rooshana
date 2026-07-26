package ir.mservices.market.social.list.add;

import androidx.fragment.app.FragmentActivity;
import defpackage.dp2;
import defpackage.g51;
import defpackage.hh2;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$3", f = "BaseAddProfileListFragment.kt", l = {135}, m = "invokeSuspend", v = 1)
final class BaseAddProfileListFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseAddProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.add.BaseAddProfileListFragment$onViewCreated$3$1", f = "BaseAddProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            Object obj2 = pair.b;
            Object obj3 = pair.a;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            if (obj2 == null) {
                FragmentActivity fragmentActivityF = baseAddProfileListFragment.F();
                hh2.H(new hh2(fragmentActivityF, fragmentActivityF != null ? fragmentActivityF.getString(((Number) obj3).intValue()) : null));
            } else {
                hh2.H(new hh2(baseAddProfileListFragment.F(), baseAddProfileListFragment.M(((Number) obj3).intValue(), pair.b)));
            }
            int i = BaseAddProfileListFragment.c1;
            baseAddProfileListFragment.t1().r(new SelectedItemsAction.ErrorAction(null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddProfileListFragment$onViewCreated$3(BaseAddProfileListFragment baseAddProfileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseAddProfileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseAddProfileListFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseAddProfileListFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = BaseAddProfileListFragment.c1;
            BaseAddProfileListFragment baseAddProfileListFragment = this.b;
            o4 o4Var = new o4(baseAddProfileListFragment.t1().J, 9);
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
