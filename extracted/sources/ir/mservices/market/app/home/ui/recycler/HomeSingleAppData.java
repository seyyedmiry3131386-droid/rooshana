package ir.mservices.market.app.home.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeSingleAppData extends NestedRecyclerData implements g32, wo2 {
    public static final int j = js6.extension_home_app_view;
    public static final int k = js6.extension_home_app_view_digested;
    public static final int l = js6.extension_home_app_view_ext;
    public static final int m = js6.extension_home_app_view_digested_ext;
    public final bz6 g;
    public final DisplayMode h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSingleAppData(bz6 bz6Var, DisplayMode displayMode, String str, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "appBannerFlow");
        js3.p(str, "id");
        this.g = bz6Var;
        this.h = displayMode;
        this.i = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        boolean zI = js3.i(this.h.getMode(), "DigestedHorizontal1");
        bz6 bz6Var = this.g;
        return zI ? bz6Var.d == null ? k : m : bz6Var.d == null ? j : l;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeSingleAppData) {
            return js3.i(this.i, ((HomeSingleAppData) obj).i);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
