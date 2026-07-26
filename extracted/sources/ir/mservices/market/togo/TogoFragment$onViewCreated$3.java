package ir.mservices.market.togo;

import defpackage.an2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$3", f = "TogoFragment.kt", l = {366}, m = "invokeSuspend", v = 1)
final class TogoFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ TogoFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$3$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ TogoFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogoFragment togoFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = togoFragment;
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
            kotlin.b.b(obj);
            boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
            TogoFragment togoFragment = this.b;
            an2 an2Var = togoFragment.f1;
            js3.m(an2Var);
            an2Var.y.getSettings().setJavaScriptEnabled(zBooleanValue);
            an2 an2Var2 = togoFragment.f1;
            js3.m(an2Var2);
            an2Var2.y.loadUrl((String) pair.a, (Map) togoFragment.n1().L.a.getValue());
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$onViewCreated$3(TogoFragment togoFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TogoFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TogoFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = TogoFragment.o1;
            TogoFragment togoFragment = this.b;
            pv6 pv6Var = togoFragment.n1().R;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(togoFragment, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
