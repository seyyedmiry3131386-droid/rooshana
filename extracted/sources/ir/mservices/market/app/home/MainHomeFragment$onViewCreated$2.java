package ir.mservices.market.app.home;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xz7;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.MainHomeFragment$onViewCreated$2", f = "MainHomeFragment.kt", l = {111}, m = "invokeSuspend", v = 1)
final class MainHomeFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MainHomeFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.home.MainHomeFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.home.MainHomeFragment$onViewCreated$2$1", f = "MainHomeFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ MainHomeFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MainHomeFragment mainHomeFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = mainHomeFragment;
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
            b.b(obj);
            MainHomeFragment mainHomeFragment = this.b;
            if (z) {
                int i = MainHomeFragment.H1;
                xz7 xz7Var = mainHomeFragment.G1;
                if (xz7Var != null) {
                    xz7Var.a(3);
                }
            } else {
                int i2 = MainHomeFragment.H1;
                mainHomeFragment.p2();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainHomeFragment$onViewCreated$2(MainHomeFragment mainHomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = mainHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MainHomeFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MainHomeFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MainHomeFragment.H1;
            MainHomeFragment mainHomeFragment = this.b;
            rv6 rv6Var = mainHomeFragment.S1().B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainHomeFragment, null);
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
