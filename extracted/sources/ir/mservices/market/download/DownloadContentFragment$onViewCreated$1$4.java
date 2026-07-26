package ir.mservices.market.download;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.un8;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.views.SmallFillOvalButton;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$4", f = "DownloadContentFragment.kt", l = {152}, m = "invokeSuspend", v = 1)
final class DownloadContentFragment$onViewCreated$1$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ DownloadContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$4$1", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ DownloadContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadContentFragment downloadContentFragment, g51 g51Var) {
            super(3, g51Var);
            this.b = downloadContentFragment;
        }

        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, (g51) obj3);
            anonymousClass1.a = zBooleanValue;
            return anonymousClass1.invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = DownloadContentFragment.d1;
            return Boolean.valueOf(this.b.l1().I.p() || z);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$4$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentFragment$onViewCreated$1$4$2", f = "DownloadContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ DownloadContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DownloadContentFragment downloadContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = downloadContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            un8 un8Var = this.b.W0;
            js3.m(un8Var);
            SmallFillOvalButton smallFillOvalButton = un8Var.y;
            js3.o(smallFillOvalButton, "pauseAllBtn");
            smallFillOvalButton.setVisibility(z ? 0 : 8);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentFragment$onViewCreated$1$4(DownloadContentFragment downloadContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = downloadContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DownloadContentFragment$onViewCreated$1$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DownloadContentFragment$onViewCreated$1$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = DownloadContentFragment.d1;
            DownloadContentFragment downloadContentFragment = this.b;
            h hVar = new h(downloadContentFragment.l1().M, ((MovieRecentDownloadViewModel) downloadContentFragment.Z0.getValue()).x, new AnonymousClass1(downloadContentFragment, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(downloadContentFragment, null);
            this.a = 1;
            if (d.f(hVar, anonymousClass2, this) == coroutineSingletons) {
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
