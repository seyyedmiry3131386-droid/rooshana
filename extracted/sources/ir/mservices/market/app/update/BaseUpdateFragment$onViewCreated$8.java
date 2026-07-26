package ir.mservices.market.app.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.TryAgainView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$8", f = "UpdateFragment.kt", l = {357}, m = "invokeSuspend", v = 1)
final class BaseUpdateFragment$onViewCreated$8 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseUpdateFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$8$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$8$1", f = "UpdateFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ BaseUpdateFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseUpdateFragment baseUpdateFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = baseUpdateFragment;
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
            int i = BaseUpdateFragment.p1;
            TryAgainView tryAgainViewC1 = this.a.C1();
            if (tryAgainViewC1 != null) {
                tryAgainViewC1.v();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUpdateFragment$onViewCreated$8(BaseUpdateFragment baseUpdateFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = baseUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseUpdateFragment$onViewCreated$8(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseUpdateFragment$onViewCreated$8) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BaseUpdateFragment baseUpdateFragment = this.b;
            pv6 pv6Var = baseUpdateFragment.T1().Y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseUpdateFragment, null);
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
