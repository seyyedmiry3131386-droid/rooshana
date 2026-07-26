package ir.mservices.market.setting.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingThemeStyleData extends SettingData implements g32 {
    public static final int d = js6.setting_theme_style;
    public final v48 b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingThemeStyleData(v48 v48Var) {
        super("SETTING_THEME_STYLE");
        js3.p(v48Var, "themeStyle");
        this.b = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !SettingThemeStyleData.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.c, ((SettingThemeStyleData) obj).c);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
