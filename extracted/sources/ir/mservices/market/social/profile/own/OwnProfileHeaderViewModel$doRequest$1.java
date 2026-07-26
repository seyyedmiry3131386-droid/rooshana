package ir.mservices.market.social.profile.own;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vo4;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$doRequest$1", f = "OwnProfileHeaderViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class OwnProfileHeaderViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ OwnProfileHeaderViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((OwnProfileHeaderViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null) {
                return null;
            }
            MyketRecyclerData myketRecyclerData = recyclerItem.c;
            if (!(myketRecyclerData instanceof FollowRequestData) && !(myketRecyclerData instanceof OwnProfileTipData)) {
                return null;
            }
            DividerData dividerData = new DividerData();
            dividerData.b = true;
            return new RecyclerItem(dividerData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileHeaderViewModel$doRequest$1(OwnProfileHeaderViewModel ownProfileHeaderViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = ownProfileHeaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new OwnProfileHeaderViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OwnProfileHeaderViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final OwnProfileHeaderViewModel ownProfileHeaderViewModel = this.a;
        final vo4 vo4Var = ownProfileHeaderViewModel.v;
        vo4Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.social.profile.own.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new ProfileRepositoryImpl$getPrivateProfileInfo$1$1(vo4Var, ownProfileHeaderViewModel, null));
            }
        }).a, new z45(13, ownProfileHeaderViewModel)), y97.G(ownProfileHeaderViewModel)), null, new AnonymousClass2(2, ownProfileHeaderViewModel, OwnProfileHeaderViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
