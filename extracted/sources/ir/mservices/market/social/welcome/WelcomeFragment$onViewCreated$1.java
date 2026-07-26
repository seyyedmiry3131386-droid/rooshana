package ir.mservices.market.social.welcome;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.pd9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$1", f = "WelcomeFragment.kt", l = {152}, m = "invokeSuspend", v = 1)
final class WelcomeFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ WelcomeFragment b;
    public final /* synthetic */ pd9 c;

    /* JADX INFO: renamed from: ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$1$1", f = "WelcomeFragment.kt", l = {153}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ pd9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pd9 pd9Var, g51 g51Var) {
            super(2, g51Var);
            this.c = pd9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bz6 bz6Var = (bz6) this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.b = null;
                this.a = 1;
                if (this.c.L(bz6Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$1(g51 g51Var, pd9 pd9Var, WelcomeFragment welcomeFragment) {
        super(1, g51Var);
        this.b = welcomeFragment;
        this.c = pd9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new WelcomeFragment$onViewCreated$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((WelcomeFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = WelcomeFragment.a1;
            o4 o4Var = new o4(this.b.m1().e, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
