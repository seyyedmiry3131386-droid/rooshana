package defpackage;

import android.graphics.Color;
import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAppListMoreData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class tb3 extends qg5 {
    public final og5 w;
    public d04 x;
    public ub3 y;
    public final /* synthetic */ int z;

    public tb3(View view, og5 og5Var, byte b) {
        super(view);
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public /* bridge */ /* synthetic */ void t(MyketRecyclerData myketRecyclerData) {
        switch (this.z) {
            case 1:
                x((HomeMoreTitleRowData) myketRecyclerData);
                break;
            default:
                x((HomeMoreTitleRowData) myketRecyclerData);
                break;
        }
    }

    @Override // defpackage.qg5
    public void w(a79 a79Var) {
        switch (this.z) {
            case 1:
                z(a79Var);
                if (!(a79Var instanceof ub3)) {
                    lw.g(null, "binding is incompatible", null);
                    break;
                }
                break;
            default:
                z(a79Var);
                break;
        }
    }

    public void x(HomeMoreTitleRowData homeMoreTitleRowData) {
        switch (this.z) {
            case 1:
                js3.p(homeMoreTitleRowData, "data");
                y(homeMoreTitleRowData);
                SearchAppListMoreData searchAppListMoreData = homeMoreTitleRowData instanceof SearchAppListMoreData ? (SearchAppListMoreData) homeMoreTitleRowData : null;
                Object obj = lw8.b;
                String str = searchAppListMoreData != null ? searchAppListMoreData.k : null;
                int color = sj8.b().l;
                try {
                    color = Color.parseColor(str);
                    break;
                } catch (Exception unused) {
                }
                this.a.setBackgroundColor(color);
                break;
            default:
                y(homeMoreTitleRowData);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb3.y(ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData):void");
    }

    public final void z(a79 a79Var) {
        if (a79Var instanceof ub3) {
            this.y = (ub3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tb3(int i, og5 og5Var, View view) {
        this(view, og5Var, (byte) 0);
        this.z = i;
        switch (i) {
            case 1:
                this(view, og5Var, (byte) 0);
                break;
            default:
                this.x = (d04) ((w91) qg5.r()).p.get();
                break;
        }
    }
}
