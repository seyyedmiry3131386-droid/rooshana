package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.b;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class mp extends a {
    public final GraphicUtils$Dimension l;
    public final int m;
    public final boolean n;
    public np o;
    public np p;
    public np q;
    public np r;
    public np s;

    public mp(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(1);
        this.l = graphicUtils$Dimension;
        this.m = i;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        int i2 = AppNestedData.m;
        int i3 = this.m;
        if (i == i2) {
            b bVar = new b(i3, view);
            np npVar = this.p;
            if (npVar != null) {
                bVar.w = npVar;
                return bVar;
            }
            js3.V("multiAppClickListener");
            throw null;
        }
        if (i == HomeMoreTitleRowData.j) {
            np npVar2 = this.o;
            if (npVar2 != null) {
                return new tb3(0, npVar2, view);
            }
            js3.V("onHomeMoreClickListener");
            throw null;
        }
        if (i == ExtHeaderRowData.l) {
            Integer numValueOf = Integer.valueOf(i3);
            np npVar3 = this.s;
            if (npVar3 != null) {
                return new x62(view, this.l, this.n, numValueOf, npVar3);
            }
            js3.V("onShimmerHeaderClickListener");
            throw null;
        }
        if (i != HomeAppsRowData.m && i != HomeAppsRowData.n && i != HomeAppsRowData.q && i != HomeAppsRowData.r && i != HomeAppsRowData.s && i != HomeAppsRowData.t && i != HomeAppsRowData.o && i != HomeAppsRowData.p && i != HomeAppsRowData.u && i != HomeAppsRowData.v && i != HomeAppsRowData.w && i != HomeAppsRowData.x && i != HomeAppsRowData.y && i != HomeAppsRowData.z && i != HomeAppsRowData.A && i != HomeAppsRowData.B) {
            return null;
        }
        np npVar4 = this.q;
        if (npVar4 == null) {
            js3.V("onCardAppClickListener");
            throw null;
        }
        np npVar5 = this.r;
        if (npVar5 != null) {
            return new sa3(view, this.l, this.n, npVar4, npVar5, 5);
        }
        js3.V("onNewCardAppClickListener");
        throw null;
    }
}
