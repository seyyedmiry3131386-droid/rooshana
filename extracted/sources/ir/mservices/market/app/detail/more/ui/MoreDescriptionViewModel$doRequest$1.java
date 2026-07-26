package ir.mservices.market.app.detail.more.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.sl3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.us3;
import defpackage.xe2;
import defpackage.xv3;
import defpackage.y97;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.app.detail.more.ui.recycler.DescriptionData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreInformationData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$doRequest$1", f = "MoreDescriptionViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MoreDescriptionViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MoreDescriptionViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((MoreDescriptionViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null || !(recyclerItem.c instanceof DescriptionData) || !(recyclerItem2.c instanceof MoreInformationData)) {
                return null;
            }
            DividerData dividerData = new DividerData();
            dividerData.e = pq6.horizontal_space_outer;
            dividerData.c = pq6.horizontal_space_inner;
            return new RecyclerItem(dividerData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreDescriptionViewModel$doRequest$1(MoreDescriptionViewModel moreDescriptionViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = moreDescriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MoreDescriptionViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreDescriptionViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        MoreDescriptionViewModel moreDescriptionViewModel = this.a;
        sl3 sl3Var = moreDescriptionViewModel.t;
        MoreDescriptionData moreDescriptionData = moreDescriptionViewModel.u.a;
        l lVar = moreDescriptionViewModel.v;
        sl3Var.getClass();
        js3.p(lVar, "diffStatusFlow");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new xv3(moreDescriptionData, lVar, 4)).a, new us3(17)), y97.G(moreDescriptionViewModel)), null, new AnonymousClass2(2, moreDescriptionViewModel, MoreDescriptionViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
