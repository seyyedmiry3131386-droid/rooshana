package ir.mservices.market.setting.themeStyle.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ThemeStyleItemData implements MyketRecyclerData {
    public static final int d = js6.holder_theme_style;
    public final ThemeStyle a;
    public final v48 b;
    public final int c;

    public ThemeStyleItemData(ThemeStyle themeStyle, v48 v48Var, int i) {
        js3.p(themeStyle, "themeStyle");
        js3.p(v48Var, "selectedTheme");
        this.a = themeStyle;
        this.b = v48Var;
        this.c = i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return this.c;
    }
}
