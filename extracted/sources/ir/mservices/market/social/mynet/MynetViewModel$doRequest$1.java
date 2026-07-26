package ir.mservices.market.social.mynet;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.xg5;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.mynet.MynetViewModel$doRequest$1", f = "MynetViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MynetViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MynetViewModel a;

    /* JADX INFO: renamed from: ir.mservices.market.social.mynet.MynetViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((MynetViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null) {
                return null;
            }
            MyketRecyclerData myketRecyclerData = recyclerItem.c;
            if (myketRecyclerData instanceof UserCardRowData) {
                if (recyclerItem2.c instanceof UserCardRowData) {
                    return null;
                }
                DividerData dividerData = new DividerData();
                dividerData.b = false;
                int i = pq6.space_l;
                dividerData.g = i;
                dividerData.f = i;
                return new RecyclerItem(dividerData);
            }
            if (myketRecyclerData instanceof HomeBannerData) {
                DividerData dividerData2 = new DividerData();
                dividerData2.b = false;
                int i2 = pq6.space_l;
                dividerData2.f = i2;
                dividerData2.g = i2;
                return new RecyclerItem(dividerData2);
            }
            if (!(myketRecyclerData instanceof MovieHomeBannerData)) {
                return null;
            }
            DividerData dividerData3 = new DividerData();
            dividerData3.b = false;
            int i3 = pq6.space_l;
            dividerData3.f = i3;
            dividerData3.g = i3;
            return new RecyclerItem(dividerData3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MynetViewModel$doRequest$1(MynetViewModel mynetViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = mynetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MynetViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MynetViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final MynetViewModel mynetViewModel = this.a;
        final xg5 xg5Var = mynetViewModel.v;
        xg5Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.social.mynet.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new MynetRepositoryImpl$getMynetHome$1$1(xg5Var, mynetViewModel, null), null);
            }
        }).a, new z45(5, mynetViewModel)), y97.G(mynetViewModel)), null, new AnonymousClass2(2, mynetViewModel, MynetViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), null, 10);
    }
}
