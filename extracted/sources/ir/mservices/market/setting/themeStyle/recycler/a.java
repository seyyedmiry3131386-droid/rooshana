package ir.mservices.market.setting.themeStyle.recycler;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.dk;
import defpackage.ea7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.qm5;
import defpackage.rj8;
import defpackage.sj;
import defpackage.sj8;
import defpackage.tj;
import defpackage.ts5;
import defpackage.xj;
import defpackage.y93;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.theme.ThemeStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int y = 0;
    public final og5 w;
    public y93 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, ts5 ts5Var) {
        super(view);
        js3.p(ts5Var, "onClickListener");
        this.w = ts5Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ThemeStyleItemData themeStyleItemData = (ThemeStyleItemData) myketRecyclerData;
        js3.p(themeStyleItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ThemeStyleViewHolder$onAttach$1(themeStyleItemData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ThemeStyleItemData themeStyleItemData = (ThemeStyleItemData) myketRecyclerData;
        js3.p(themeStyleItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, themeStyleItemData);
        Object value = themeStyleItemData.b.getValue();
        ThemeStyle themeStyle = themeStyleItemData.a;
        boolean z = value == themeStyle;
        View view2 = y().w;
        Object obj = sj8.a;
        js3.p(themeStyle, "style");
        ThemeMode themeMode = sj8.g;
        int[] iArr = rj8.a;
        int i = (iArr[themeMode.ordinal()] == 2 ? sj8.c(themeStyle) : sj8.d(themeStyle)).h;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(pq6.theme_style_selected_item_stroke_width);
        int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(pq6.theme_style_item_layout_height) / 2;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().N;
        ea7Var.c(dimensionPixelSize2);
        ea7Var.h = dimensionPixelSize;
        ea7Var.i = i;
        ea7Var.p = sj8.b().N;
        view2.setBackground(ea7Var.a());
        view2.setVisibility(z ? 0 : 4);
        AppCompatImageView appCompatImageView = y().v;
        js3.p(themeStyle, "style");
        ThemeData themeDataC = iArr[sj8.g.ordinal()] == 2 ? sj8.c(themeStyle) : sj8.d(themeStyle);
        qm5 qm5Var = new qm5(4);
        ((xj) qm5Var.b).a = new sj(new tj(new dk(Integer.valueOf(themeDataC.e), Integer.valueOf(themeDataC.h)), new dk(Float.valueOf(view.getResources().getDimension(pq6.space_12)), Float.valueOf(view.getResources().getDimension(pq6.theme_style_item_layout_height) / 2))));
        appCompatImageView.setBackground(qm5Var.a(z));
        js3.p(themeStyle, "style");
        x(iArr[sj8.g.ordinal()] == 2 ? sj8.c(themeStyle) : sj8.d(themeStyle), themeStyle.d, z);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof y93) {
            this.x = (y93) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(ThemeData themeData, int i, boolean z) {
        AppCompatImageView appCompatImageView = y().v;
        if (z) {
            appCompatImageView.setImageResource(yq6.ic_theme_style_tick);
        } else {
            appCompatImageView.setImageResource(i);
        }
        appCompatImageView.setColorFilter(new PorterDuffColorFilter(z ? sj8.b().P : themeData.h, PorterDuff.Mode.MULTIPLY));
    }

    public final y93 y() {
        y93 y93Var = this.x;
        if (y93Var != null) {
            return y93Var;
        }
        js3.V("binding");
        throw null;
    }
}
