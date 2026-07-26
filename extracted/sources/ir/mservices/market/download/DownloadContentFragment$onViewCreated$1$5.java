package ir.mservices.market.download;

import com.google.android.material.tabs.TabLayout;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sr1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$5", f = "DownloadContentFragment.kt", l = {157}, m = "invokeSuspend", v = 1)
final class DownloadContentFragment$onViewCreated$1$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadContentFragment b;
    public final /* synthetic */ sr1 c;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$5$1", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ sr1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sr1 sr1Var, g51 g51Var) {
            super(2, g51Var);
            this.b = sr1Var;
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
            sr1 sr1Var = this.b;
            sr1Var.w.setUserInputEnabled(z);
            TabLayout tabLayout = sr1Var.v;
            js3.o(tabLayout, "indicator");
            tabLayout.setVisibility(z ? 0 : 8);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentFragment$onViewCreated$1$5(g51 g51Var, sr1 sr1Var, DownloadContentFragment downloadContentFragment) {
        super(1, g51Var);
        this.b = downloadContentFragment;
        this.c = sr1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadContentFragment$onViewCreated$1$5(g51Var, this.c, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadContentFragment$onViewCreated$1$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadContentFragment.d1;
            xe2 xe2Var = ((MovieRecentDownloadViewModel) this.b.Z0.getValue()).y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(xe2Var, anonymousClass1, this) == coroutineSingletons) {
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
