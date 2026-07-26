package ir.mservices.market.setting.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingNestedData extends NestedRecyclerData implements g32 {
    public static final int h = js6.setting_nested;
    public final bz6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingNestedData(bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(dp2Var, "removeIfEmptyCallback");
        this.g = bz6Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof SettingNestedData;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "SettingNestedData";
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
