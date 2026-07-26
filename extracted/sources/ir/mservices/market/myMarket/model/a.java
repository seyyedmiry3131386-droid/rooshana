package ir.mservices.market.myMarket.model;

import defpackage.br9;
import defpackage.bz6;
import defpackage.c16;
import defpackage.c5;
import defpackage.dp2;
import defpackage.ew;
import defpackage.f88;
import defpackage.js3;
import defpackage.kd5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.ul3;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myMarket.recycler.MyMarketAboutData;
import ir.mservices.market.myMarket.recycler.MyMarketAnimationData;
import ir.mservices.market.myMarket.recycler.MyMarketData;
import ir.mservices.market.myMarket.recycler.MyMarketHeaderData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalItemData;
import ir.mservices.market.myMarket.recycler.MyMarketHorizontalNestedData;
import ir.mservices.market.myMarket.recycler.MyMarketNestedData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c16 {
    public final dp2 c;
    public final c5 d;
    public final ul3 e;

    public a(dp2 dp2Var) {
        super(1);
        this.c = dp2Var;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.d = (c5) w91Var.L.get();
        this.e = (ul3) w91Var.v0.get();
    }

    public static final RecyclerItem f(a aVar, RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        aVar.getClass();
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.b = false;
        return new RecyclerItem(dividerData);
    }

    @Override // defpackage.c16
    public final Object d() {
        ArrayList arrayList = new ArrayList();
        String str = (String) g().h.f;
        String str2 = (str == null || f88.n0(str)) ? (String) g().h.e : (String) g().h.f;
        boolean zD = g().d();
        ul3 ul3Var = this.e;
        if (ul3Var == null) {
            js3.V("inboxManager");
            throw null;
        }
        arrayList.add(new MyMarketHeaderData(str2, zD, ul3Var.a()));
        bz6 bz6Var = new bz6(br9.C(new RecyclerItem(new MyMarketHorizontalItemData(rs6.menu_item_mynet, yq6.ic_mynet, MyMarketData.ItemType.h)), new RecyclerItem(new MyMarketHorizontalItemData(rs6.menu_item_reels, yq6.ic_reels, MyMarketData.ItemType.j))), (GeneralFilter) null, (qp2) null, 6);
        dp2 dp2Var = this.c;
        arrayList.add(new MyMarketHorizontalNestedData(bz6Var, dp2Var));
        RecyclerItem recyclerItem = new RecyclerItem(new MyMarketAnimationData(yq6.ic_recent_download, rs6.menu_item_downloads, MyMarketData.ItemType.a, false));
        boolean zD2 = g().d();
        Boolean boolValueOf = Boolean.valueOf(zD2);
        if (!zD2) {
            boolValueOf = null;
        }
        arrayList.add(new MyMarketNestedData(new bz6(ew.J0(new RecyclerItem[]{recyclerItem, boolValueOf != null ? new RecyclerItem(new MyMarketData(yq6.ic_movie_subscription, rs6.menu_item_movie_subscription, MyMarketData.ItemType.d, false)) : null, new RecyclerItem(new MyMarketData(yq6.ic_financial, rs6.menu_item_financial_and_payment, MyMarketData.ItemType.i, false)), new RecyclerItem(new MyMarketData(yq6.ic_support, rs6.menu_item_feedback, MyMarketData.ItemType.g, true))}), (GeneralFilter) null, new AppMyMarketPagingSource$getData$1$3(2, this, a.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), dp2Var));
        arrayList.add(new MyMarketNestedData(new bz6(br9.C(new RecyclerItem(new MyMarketData(yq6.ic_pika, rs6.menu_item_share_apps, MyMarketData.ItemType.b, false)), new RecyclerItem(new MyMarketData(yq6.ic_ad_block, rs6.menu_item_ad_blocking, MyMarketData.ItemType.k, false)), new RecyclerItem(new MyMarketData(yq6.ic_usage_management, rs6.menu_item_usage_management, MyMarketData.ItemType.l, false)), new RecyclerItem(new MyMarketData(yq6.ic_security_shield, rs6.menu_item_security_shield, MyMarketData.ItemType.c, false))), (GeneralFilter) null, new AppMyMarketPagingSource$getData$1$4(2, this, a.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), dp2Var));
        new RecyclerItem(new MyMarketData(yq6.ic_ping_reduction, rs6.menu_item_ping_reduction, MyMarketData.ItemType.m, false));
        if (g().d()) {
            arrayList.add(new MyMarketNestedData(new bz6(br9.C(new RecyclerItem(new MyMarketData(yq6.ic_my_market_bookmark, rs6.menu_item_bookmarks, MyMarketData.ItemType.e, false)), new RecyclerItem(new MyMarketData(yq6.ic_my_reviews, rs6.menu_item_myReviews, MyMarketData.ItemType.f, false))), (GeneralFilter) null, new AppMyMarketPagingSource$getData$1$5(2, this, a.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), dp2Var));
        }
        arrayList.add(new MyMarketAboutData());
        return new kd5(arrayList);
    }

    public final c5 g() {
        c5 c5Var = this.d;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }
}
