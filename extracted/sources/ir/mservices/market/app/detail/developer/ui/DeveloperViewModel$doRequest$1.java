package ir.mservices.market.app.detail.developer.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.ol1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tl1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.detail.developer.model.a;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.developer.ui.DeveloperViewModel$doRequest$1", f = "DeveloperViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class DeveloperViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ DeveloperViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.developer.ui.DeveloperViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((DeveloperViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeveloperViewModel$doRequest$1(DeveloperViewModel developerViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = developerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DeveloperViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeveloperViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        DeveloperViewModel developerViewModel = this.a;
        ol1 ol1Var = developerViewModel.t;
        String str = developerViewModel.w.a;
        ol1Var.getClass();
        js3.p(str, "developerId");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new a(ol1Var, str, developerViewModel, 1)).a, new tl1(developerViewModel, 0)), y97.G(developerViewModel)), null, new AnonymousClass2(2, developerViewModel, DeveloperViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
