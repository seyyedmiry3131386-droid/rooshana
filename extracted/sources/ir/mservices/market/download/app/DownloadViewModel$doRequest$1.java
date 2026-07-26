package ir.mservices.market.download.app;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.download.app.data.DownloadAppStateData;
import ir.mservices.market.download.app.model.a;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.app.DownloadViewModel$doRequest$1", f = "DownloadViewModel.kt", l = {103}, m = "invokeSuspend", v = 1)
final class DownloadViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ DownloadViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$doRequest$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$doRequest$1$1", f = "DownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ DownloadViewModel a;
        public final /* synthetic */ l99 b;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$doRequest$1$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00201 extends FunctionReferenceImpl implements qp2 {
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((DownloadViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DownloadViewModel downloadViewModel, l99 l99Var, g51 g51Var) {
            super(2, g51Var);
            this.a = downloadViewModel;
            this.b = l99Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            DownloadAppStateData downloadAppStateData = (DownloadAppStateData) this.b.a;
            DownloadViewModel downloadViewModel = this.a;
            return new bz6(downloadViewModel.fillData(downloadAppStateData), (GeneralFilter) null, new C00201(2, downloadViewModel, DownloadViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadViewModel$doRequest$1(DownloadViewModel downloadViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = downloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DownloadViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        DownloadViewModel downloadViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = downloadViewModel.H;
            this.a = 1;
            obj = aVar.a(aVar.a.h(), downloadViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            downloadViewModel.p(new AnonymousClass1(downloadViewModel, (l99) n99Var, null));
            downloadViewModel.initDownloadInfoObserver();
        } else if (n99Var instanceof h99) {
            downloadViewModel.f(((h99) n99Var).a.getTranslatedMessage());
        }
        return tx8.a;
    }
}
