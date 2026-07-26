package ir.mservices.market.download;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import defpackage.ai0;
import defpackage.dp2;
import defpackage.g51;
import defpackage.j2;
import defpackage.lz5;
import defpackage.o4;
import defpackage.qp2;
import defpackage.qr1;
import defpackage.sr1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zl;
import ir.mservices.market.download.common.RecentDownloadType;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$6", f = "DownloadContentFragment.kt", l = {164}, m = "invokeSuspend", v = 1)
final class DownloadContentFragment$onViewCreated$1$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadContentFragment b;
    public final /* synthetic */ sr1 c;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$6$1", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ DownloadContentFragment b;
        public final /* synthetic */ sr1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, sr1 sr1Var, DownloadContentFragment downloadContentFragment) {
            super(2, g51Var);
            this.b = downloadContentFragment;
            this.c = sr1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            DownloadContentFragment downloadContentFragment = this.b;
            downloadContentFragment.a1 = new lz5(downloadContentFragment, list);
            sr1 sr1Var = this.c;
            ViewPager2 viewPager2 = sr1Var.w;
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.setAdapter(downloadContentFragment.a1);
            int iOrdinal = ((RecentDownloadType) list.get(((Number) ((DownloadContentViewModel) downloadContentFragment.X0.getValue()).w.a.getValue()).intValue())).ordinal();
            qr1 qr1Var = new qr1(downloadContentFragment, list, 0);
            TabLayout tabLayout = sr1Var.v;
            ViewPager2 viewPager22 = sr1Var.w;
            new ai0(tabLayout, viewPager22, new j2(downloadContentFragment, list, 16)).m();
            tabLayout.a(qr1Var);
            com.google.android.material.tabs.b bVarJ = tabLayout.j(iOrdinal);
            if (bVarJ != null) {
                qr1Var.b(bVarJ);
            }
            zl zlVar = new zl(iOrdinal, 4, sr1Var);
            viewPager22.post(zlVar);
            downloadContentFragment.b1 = zlVar;
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentFragment$onViewCreated$1$6(g51 g51Var, sr1 sr1Var, DownloadContentFragment downloadContentFragment) {
        super(1, g51Var);
        this.b = downloadContentFragment;
        this.c = sr1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadContentFragment$onViewCreated$1$6(g51Var, this.c, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadContentFragment$onViewCreated$1$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadContentFragment.d1;
            DownloadContentFragment downloadContentFragment = this.b;
            o4 o4Var = ((DownloadContentViewModel) downloadContentFragment.X0.getValue()).x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c, downloadContentFragment);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
