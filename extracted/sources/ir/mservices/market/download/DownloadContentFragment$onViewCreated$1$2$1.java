package ir.mservices.market.download;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sr1;
import defpackage.t95;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$2$1", f = "DownloadContentFragment.kt", l = {130}, m = "invokeSuspend", v = 1)
final class DownloadContentFragment$onViewCreated$1$2$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseMultiSelectViewModel b;
    public final /* synthetic */ sr1 c;
    public final /* synthetic */ DownloadContentFragment d;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$2$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$2$1$1", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ sr1 b;
        public final /* synthetic */ DownloadContentFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, sr1 sr1Var, DownloadContentFragment downloadContentFragment) {
            super(2, g51Var);
            this.b = sr1Var;
            this.c = downloadContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b, this.c);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((t95) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.a
                t95 r0 = (defpackage.t95) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                kotlin.b.b(r4)
                boolean r4 = r0.b
                sr1 r0 = r3.b
                r1 = 0
                if (r4 == 0) goto L2b
                com.google.android.material.tabs.TabLayout r4 = r0.v
                java.lang.String r2 = "indicator"
                defpackage.js3.o(r4, r2)
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L1e
                goto L2b
            L1e:
                ir.mservices.market.download.DownloadContentFragment r4 = r3.c
                android.content.res.Resources r4 = r4.K()
                int r2 = defpackage.pq6.tab_height
                int r4 = r4.getDimensionPixelSize(r2)
                goto L2c
            L2b:
                r4 = r1
            L2c:
                androidx.viewpager2.widget.ViewPager2 r0 = r0.w
                r0.setPadding(r1, r4, r1, r1)
                tx8 r4 = defpackage.tx8.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentFragment$onViewCreated$1$2$1(BaseMultiSelectViewModel baseMultiSelectViewModel, sr1 sr1Var, DownloadContentFragment downloadContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseMultiSelectViewModel;
        this.c = sr1Var;
        this.d = downloadContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadContentFragment$onViewCreated$1$2$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadContentFragment$onViewCreated$1$2$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            rv6 rv6Var = this.b.w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c, this.d);
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
