package ir.mservices.market.setting.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.xb5;
import kotlin.Pair;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingNightModeData extends SettingSimpleData {
    public static final int h = js6.setting_night_mode_item;
    public final xb5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingNightModeData(int i, xb5 xb5Var) {
        super("NIGHT_MODE", i, ((Number) ((Pair) ((l) xb5Var).getValue()).a).intValue());
        js3.p(xb5Var, "nightModeState");
        this.g = xb5Var;
    }

    @Override // ir.mservices.market.setting.recycler.SettingSimpleData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.setting.recycler.SettingSimpleData
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingNightModeData) {
            return js3.i(this.g, ((SettingNightModeData) obj).g);
        }
        return false;
    }

    @Override // ir.mservices.market.setting.recycler.SettingSimpleData
    public final int hashCode() {
        return this.g.hashCode();
    }
}
