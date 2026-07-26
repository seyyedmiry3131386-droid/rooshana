package ir.mservices.market.download;

import android.widget.ImageView;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.un8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$3", f = "DownloadContentFragment.kt", l = {142}, m = "invokeSuspend", v = 1)
final class DownloadContentFragment$onViewCreated$1$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$3$1", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ DownloadContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadContentFragment downloadContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = downloadContentFragment;
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
            un8 un8Var = this.b.W0;
            js3.m(un8Var);
            ImageView imageView = un8Var.x;
            js3.o(imageView, "more");
            imageView.setVisibility(z ? 0 : 8);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentFragment$onViewCreated$1$3(DownloadContentFragment downloadContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = downloadContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadContentFragment$onViewCreated$1$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadContentFragment$onViewCreated$1$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadContentFragment.d1;
            DownloadContentFragment downloadContentFragment = this.b;
            rv6 rv6Var = downloadContentFragment.l1().R;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadContentFragment, null);
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
