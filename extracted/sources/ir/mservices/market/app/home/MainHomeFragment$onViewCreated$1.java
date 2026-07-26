package ir.mservices.market.app.home;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rb9;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tb9;
import defpackage.tx8;
import defpackage.ub9;
import defpackage.xz7;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.MainHomeFragment$onViewCreated$1", f = "MainHomeFragment.kt", l = {104}, m = "invokeSuspend", v = 1)
final class MainHomeFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MainHomeFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.home.MainHomeFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.home.MainHomeFragment$onViewCreated$1$1", f = "MainHomeFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MainHomeFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MainHomeFragment mainHomeFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = mainHomeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tb9) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tb9 tb9Var = (tb9) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            if (tb9Var instanceof rb9) {
                int i = MainHomeFragment.H1;
                xz7 xz7Var = this.b.G1;
                if (xz7Var != null) {
                    xz7Var.a(3);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainHomeFragment$onViewCreated$1(MainHomeFragment mainHomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = mainHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MainHomeFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MainHomeFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MainHomeFragment mainHomeFragment = this.b;
            if (mainHomeFragment.E1 == null) {
                js3.V("vpnController");
                throw null;
            }
            rv6 rv6Var = ub9.b;
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
