package ir.mservices.market.app.home.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeExtReviewModuleData extends NestedRecyclerData implements wo2, g32 {
    public static final int k = js6.extension_review_apps_view;
    public final String g;
    public final ExtensionPointDto h;
    public final boolean i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeExtReviewModuleData(String str, bz6 bz6Var, ExtensionPointDto extensionPointDto, boolean z, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(str, "id");
        js3.p(bz6Var, "extFlow");
        this.g = str;
        this.h = extensionPointDto;
        this.i = z;
        this.j = str.concat("body");
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return k;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return this.h.getHorizontalType();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeExtReviewModuleData)) {
            return false;
        }
        HomeExtReviewModuleData homeExtReviewModuleData = (HomeExtReviewModuleData) obj;
        return js3.i(this.g, homeExtReviewModuleData.g) && js3.i(this.h, homeExtReviewModuleData.h) && js3.i(this.j, homeExtReviewModuleData.j);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.g;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.h.hashCode() + (this.g.hashCode() * 31)) * 31);
    }
}
