package ir.mservices.market.app.update;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.dp2;
import defpackage.f69;
import defpackage.g51;
import defpackage.kp4;
import defpackage.q69;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sq4;
import defpackage.tb1;
import defpackage.tx8;
import java.util.WeakHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.RootUpdateFragment$onViewCreated$1", f = "UpdateFragment.kt", l = {799}, m = "invokeSuspend", v = 1)
final class RootUpdateFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RootUpdateFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.RootUpdateFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.RootUpdateFragment$onViewCreated$1$1", f = "UpdateFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ RootUpdateFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RootUpdateFragment rootUpdateFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = rootUpdateFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((kp4) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = RootUpdateFragment.s1;
            RecyclerView recyclerViewY1 = this.a.y1();
            WeakHashMap weakHashMap = q69.a;
            f69.c(recyclerViewY1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootUpdateFragment$onViewCreated$1(RootUpdateFragment rootUpdateFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = rootUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RootUpdateFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((RootUpdateFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = RootUpdateFragment.s1;
            RootUpdateFragment rootUpdateFragment = this.b;
            rv6 rv6Var = ((sq4) rootUpdateFragment.q1.getValue()).g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(rootUpdateFragment, null);
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
