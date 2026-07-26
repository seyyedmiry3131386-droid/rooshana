package ir.mservices.market.app.detail.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$6", f = "AppDetailFragment.kt", l = {472}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppDetailFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$6$1", f = "AppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ AppDetailFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppDetailFragment appDetailFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appDetailFragment;
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
            int i = AppDetailFragment.M1;
            this.b.l2(z);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$onViewCreated$6(AppDetailFragment appDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppDetailFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = AppDetailFragment.M1;
            AppDetailFragment appDetailFragment = this.b;
            l lVar = appDetailFragment.R1().O;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appDetailFragment, null);
            this.a = 1;
            if (d.f(lVar, anonymousClass1, this) == coroutineSingletons) {
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
