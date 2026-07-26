package defpackage;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.b;
import ir.mservices.market.app.common.recycler.c;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotListData;
import ir.mservices.market.app.detail.ui.recycler.e;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class ac3 extends l06 {
    public final GraphicUtils$Dimension m;
    public final boolean n;
    public og5 o;
    public og5 p;
    public og5 q;
    public s82 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac3(GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(1);
        js3.p(graphicUtils$Dimension, "dimension");
        this.m = graphicUtils$Dimension;
        this.n = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        int i2;
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(pq6.multi_app_card_count, typedValue, true);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        boolean z = this.n;
        GraphicUtils$Dimension graphicUtils$Dimension = this.m;
        if (z) {
            i2 = ((int) ((((((typedValue.getFloat() - 1) * 2) * dimensionPixelSize) + graphicUtils$Dimension.a) - view.getResources().getDimensionPixelSize(pq6.side_navigation_margin)) / typedValue.getFloat())) - view.getResources().getDimensionPixelSize(pq6.item_space);
        } else {
            i2 = graphicUtils$Dimension.a;
        }
        if (i == AppNestedData.l) {
            view.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            return new c(i2, view);
        }
        if (i == AppNestedData.m) {
            view.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            return new b(i2, view);
        }
        if (i == AppScreenshotListData.d) {
            return new e(view, graphicUtils$Dimension, null, null);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void l(qg5 qg5Var, int i) {
        int iE = e(i);
        if (iE == AppNestedData.l) {
            c cVar = (c) qg5Var;
            b95 b95Var = cVar.z;
            if (b95Var == null) {
                js3.V("binding");
                throw null;
            }
            View view = b95Var.B;
            js3.o(view, "space");
            view.setVisibility(8);
            s82 s82Var = this.r;
            if (s82Var == null) {
                js3.V("onFastDownloadClickListener");
                throw null;
            }
            cVar.y = s82Var;
            og5 og5Var = this.o;
            if (og5Var == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            cVar.w = og5Var;
        } else if (iE == AppNestedData.m) {
            b bVar = (b) qg5Var;
            d95 d95Var = bVar.y;
            if (d95Var == null) {
                js3.V("binding");
                throw null;
            }
            View view2 = d95Var.A;
            js3.o(view2, "space");
            view2.setVisibility(8);
            og5 og5Var2 = this.o;
            if (og5Var2 == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            bVar.w = og5Var2;
        } else if (iE == AppScreenshotListData.d) {
            e eVar = (e) qg5Var;
            og5 og5Var3 = this.p;
            if (og5Var3 == null) {
                js3.V("onScreenshotClickListener");
                throw null;
            }
            eVar.w = og5Var3;
            og5 og5Var4 = this.q;
            if (og5Var4 == null) {
                js3.V("onVideoShotClickListener");
                throw null;
            }
            eVar.x = og5Var4;
        }
        super.l(qg5Var, i);
    }
}
