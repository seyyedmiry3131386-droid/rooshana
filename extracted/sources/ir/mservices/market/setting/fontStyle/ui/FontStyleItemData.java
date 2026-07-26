package ir.mservices.market.setting.fontStyle.ui;

import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.Font$FontStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyleItemData implements MyketRecyclerData {
    public static final int c = js6.holder_font_item;
    public final Font$FontStyle a;
    public final v48 b;

    public FontStyleItemData(Font$FontStyle font$FontStyle, v48 v48Var) {
        js3.p(font$FontStyle, "fontStyle");
        js3.p(v48Var, "selectedFont");
        this.a = font$FontStyle;
        this.b = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }
}
