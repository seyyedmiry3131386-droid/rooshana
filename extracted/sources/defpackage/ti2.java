package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.setting.fontStyle.ui.FontStyleItemData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ti2 extends a {
    public v4 l;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != FontStyleItemData.c) {
            return null;
        }
        v4 v4Var = this.l;
        if (v4Var != null) {
            return new ir.mservices.market.setting.fontStyle.ui.a(view, v4Var);
        }
        js3.V("onFontStyleClickListener");
        throw null;
    }
}
