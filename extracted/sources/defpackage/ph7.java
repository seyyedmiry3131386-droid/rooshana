package defpackage;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.HomeNestedAppsRowData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAppListData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class ph7 extends ua3 {
    public final /* synthetic */ int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph7(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, hs hsVar, gs gsVar, gs gsVar2, int i) {
        super(view, graphicUtils$Dimension, z, hsVar, gsVar, gsVar2);
        this.O = i;
    }

    @Override // defpackage.ua3, ir.mservices.market.version2.ui.recycler.a
    public int B() {
        switch (this.O) {
            case 0:
                return 1;
            default:
                return super.B();
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: G */
    public final /* bridge */ /* synthetic */ void t(NestedRecyclerData nestedRecyclerData) {
        switch (this.O) {
            case 0:
                M((HomeNestedAppsRowData) nestedRecyclerData);
                break;
            default:
                M((HomeNestedAppsRowData) nestedRecyclerData);
                break;
        }
    }

    public final void M(HomeNestedAppsRowData homeNestedAppsRowData) {
        int i = this.O;
        View view = this.a;
        js3.p(homeNestedAppsRowData, "data");
        switch (i) {
            case 0:
                super.t(homeNestedAppsRowData);
                SearchAppListData searchAppListData = (SearchAppListData) homeNestedAppsRowData;
                String title = homeNestedAppsRowData.g.getTitle();
                if (title == null || f88.n0(title)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
                }
                Object obj = lw8.b;
                String bgColor = searchAppListData.q.getBgColor();
                int color = sj8.b().l;
                try {
                    color = Color.parseColor(bgColor);
                    break;
                } catch (Exception unused) {
                }
                view.setBackgroundColor(color);
                break;
            default:
                super.t(homeNestedAppsRowData);
                SearchAppListData searchAppListData2 = (SearchAppListData) homeNestedAppsRowData;
                String title2 = homeNestedAppsRowData.g.getTitle();
                if (title2 == null || f88.n0(title2)) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
                }
                Object obj2 = lw8.b;
                String bgColor2 = searchAppListData2.q.getBgColor();
                int color2 = sj8.b().l;
                try {
                    color2 = Color.parseColor(bgColor2);
                    break;
                } catch (Exception unused2) {
                }
                view.setBackgroundColor(color2);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final /* bridge */ /* synthetic */ void t(MyketRecyclerData myketRecyclerData) {
        switch (this.O) {
            case 0:
                M((HomeNestedAppsRowData) myketRecyclerData);
                break;
            default:
                M((HomeNestedAppsRowData) myketRecyclerData);
                break;
        }
    }
}
