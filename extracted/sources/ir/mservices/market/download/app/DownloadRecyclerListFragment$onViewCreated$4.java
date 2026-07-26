package ir.mservices.market.download.app;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$4", f = "DownloadRecyclerListFragment.kt", l = {122}, m = "invokeSuspend", v = 1)
final class DownloadRecyclerListFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadRecyclerListFragment$onViewCreated$4$1", f = "DownloadRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, g51Var);
            anonymousClass1.a = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
            viewEventBuilder.b("downloading_recomm_" + i);
            viewEventBuilder.a();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRecyclerListFragment$onViewCreated$4(DownloadRecyclerListFragment downloadRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = downloadRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadRecyclerListFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadRecyclerListFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadRecyclerListFragment.j1;
            pv6 pv6Var = this.b.R1().P;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
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
