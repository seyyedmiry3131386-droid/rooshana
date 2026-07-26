package ir.mservices.market.myMarket;

import defpackage.bj2;
import defpackage.bs1;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.es1;
import defpackage.f88;
import defpackage.g51;
import defpackage.g8;
import defpackage.i25;
import defpackage.ja1;
import defpackage.js3;
import defpackage.n25;
import defpackage.nr1;
import defpackage.ps1;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sl3;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tl3;
import defpackage.tx8;
import defpackage.ul3;
import defpackage.vy2;
import defpackage.w4;
import defpackage.wz5;
import defpackage.xt;
import defpackage.y97;
import defpackage.z4;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myMarket.MyMarketAction;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.myMarket.recycler.MyMarketAnimationData;
import ir.mservices.market.myMarket.recycler.MyMarketData;
import ir.mservices.market.myMarket.recycler.MyMarketHeaderData;
import ir.mservices.market.version2.services.b;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MyMarketViewModel extends a implements nr1 {
    public final n25 A;
    public final i B;
    public final pv6 C;
    public final l D;
    public final pv6 E;
    public final b v;
    public final c5 w;
    public final ps1 x;
    public final ul3 y;
    public final sl3 z;

    /* JADX INFO: renamed from: ir.mservices.market.myMarket.MyMarketViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myMarket.MyMarketViewModel$1", f = "MyMarketViewModel.kt", l = {178}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MyMarketViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            MyMarketViewModel myMarketViewModel = MyMarketViewModel.this;
            pv6 pv6Var = myMarketViewModel.u;
            bj2 bj2Var = new bj2(20, myMarketViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 20), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myMarket.MyMarketViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myMarket.MyMarketViewModel$2", f = "MyMarketViewModel.kt", l = {63}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.myMarket.MyMarketViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.myMarket.MyMarketViewModel$2$1", f = "MyMarketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public final /* synthetic */ MyMarketViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MyMarketViewModel myMarketViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = myMarketViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass1(this.a, g51Var);
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                this.a.checkRecentDownloadAnimationIcon();
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MyMarketViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                MyMarketViewModel myMarketViewModel = MyMarketViewModel.this;
                rv6 rv6Var = myMarketViewModel.A.a.n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(myMarketViewModel, null);
                this.a = 1;
                if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMarketViewModel(b bVar, c5 c5Var, ps1 ps1Var, ul3 ul3Var, sl3 sl3Var, n25 n25Var) {
        super(true);
        js3.p(bVar, "accountService");
        js3.p(c5Var, "accountManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(ul3Var, "inboxManager");
        js3.p(n25Var, "movieDownloadRepository");
        this.v = bVar;
        this.w = c5Var;
        this.x = ps1Var;
        this.y = ul3Var;
        this.z = sl3Var;
        this.A = n25Var;
        i iVarE = vy2.e(0, 7, null);
        this.B = iVarE;
        this.C = new pv6(iVarE);
        l lVarB = ja1.b(Boolean.FALSE);
        this.D = lVarB;
        this.E = new pv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        t32.b().l(this, false);
        ps1Var.u(this);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRecentDownloadAnimationIcon() {
        editAnimatedIcon(this.x.p() || ((Boolean) this.A.a.n.a.getValue()).booleanValue());
    }

    private final void editAnimatedIcon(final boolean z) {
        g(new wz5(new xt(1, z), new qp2() { // from class: ud5
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return MyMarketViewModel.editAnimatedIcon$lambda$1(z, ((Integer) obj).intValue(), (RecyclerItem) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean editAnimatedIcon$lambda$0(boolean z, RecyclerItem recyclerItem) {
        MyMarketData.ItemType itemType;
        js3.p(recyclerItem, "it");
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        MyMarketAnimationData myMarketAnimationData = myketRecyclerData instanceof MyMarketAnimationData ? (MyMarketAnimationData) myketRecyclerData : null;
        if (myMarketAnimationData == null || (itemType = myMarketAnimationData.c) == null || !itemType.equals(MyMarketData.ItemType.a)) {
            return false;
        }
        MyMarketAnimationData myMarketAnimationData2 = myketRecyclerData instanceof MyMarketAnimationData ? (MyMarketAnimationData) myketRecyclerData : null;
        return myMarketAnimationData2 == null || myMarketAnimationData2.f != z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerItem editAnimatedIcon$lambda$1(boolean z, int i, RecyclerItem recyclerItem) {
        js3.p(recyclerItem, "recyclerItem");
        MyketRecyclerData myMarketAnimationData = recyclerItem.c;
        MyMarketAnimationData myMarketAnimationData2 = myMarketAnimationData instanceof MyMarketAnimationData ? (MyMarketAnimationData) myMarketAnimationData : null;
        if (myMarketAnimationData2 != null) {
            myMarketAnimationData = new MyMarketAnimationData(myMarketAnimationData2.a, myMarketAnimationData2.b, myMarketAnimationData2.c, z);
        }
        return new RecyclerItem(myMarketAnimationData);
    }

    private final void editHeader() {
        g(new wz5(new i25(9), new g8(15, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean editHeader$lambda$0(RecyclerItem recyclerItem) {
        js3.p(recyclerItem, "it");
        return recyclerItem.c instanceof MyMarketHeaderData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerItem editHeader$lambda$1(MyMarketViewModel myMarketViewModel, int i, RecyclerItem recyclerItem) {
        js3.p(recyclerItem, "recyclerItem");
        MyketRecyclerData myMarketHeaderData = recyclerItem.c;
        if ((myMarketHeaderData instanceof MyMarketHeaderData ? (MyMarketHeaderData) myMarketHeaderData : null) != null) {
            c5 c5Var = myMarketViewModel.w;
            boolean zD = c5Var.d();
            z4 z4Var = c5Var.h;
            z4 z4Var2 = c5Var.h;
            String str = (String) z4Var.f;
            myMarketHeaderData = new MyMarketHeaderData((str == null || f88.n0(str)) ? (String) z4Var2.e : (String) z4Var2.f, zD, myMarketViewModel.y.a());
        }
        return new RecyclerItem(myMarketHeaderData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleFinancialAfterLogin$lambda$0(MyMarketViewModel myMarketViewModel, Void r3) {
        bt2.G(y97.G(myMarketViewModel), null, null, new MyMarketViewModel$handleFinancialAfterLogin$1$1(myMarketViewModel, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleFinancialAfterLogin$lambda$1(MyMarketViewModel myMarketViewModel, ErrorDTO errorDTO) {
        bt2.G(y97.G(myMarketViewModel), null, null, new MyMarketViewModel$handleFinancialAfterLogin$2$1(myMarketViewModel, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAction(MyMarketAction.RefreshAction refreshAction) {
        l lVar;
        Object value;
        do {
            lVar = this.D;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(refreshAction.getRefresh())));
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
        this.x.x(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MyMarketViewModel$doRequest$1(this, null));
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        js3.p(es1Var, "downloadInfo");
        checkRecentDownloadAnimationIcon();
    }

    public final void onEvent(tl3 tl3Var) {
        editHeader();
    }

    public final void onEvent(w4 w4Var) {
        js3.p(w4Var, "event");
        onRefreshAction(new MyMarketAction.RefreshAction(true));
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }
}
