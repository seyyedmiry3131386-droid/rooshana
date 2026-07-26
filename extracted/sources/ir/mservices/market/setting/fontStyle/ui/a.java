package ir.mservices.market.setting.fontStyle.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.i23;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.v4;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.Font$FontStyle;
import ir.mservices.market.views.MyketRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public i23 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, v4 v4Var) {
        super(view);
        js3.p(v4Var, "onClickListener");
        this.w = v4Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        FontStyleItemData fontStyleItemData = (FontStyleItemData) myketRecyclerData;
        js3.p(fontStyleItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new FontStyleViewHolder$onAttach$1(fontStyleItemData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        FontStyleItemData fontStyleItemData = (FontStyleItemData) myketRecyclerData;
        js3.p(fontStyleItemData, "data");
        MyketRadioButton myketRadioButton = x().z;
        myketRadioButton.a(sj8.b(), sj8.b().c);
        Context context = myketRadioButton.getContext();
        Font$FontStyle font$FontStyle = fontStyleItemData.a;
        myketRadioButton.setText(context.getString(font$FontStyle.d));
        x().y.setTypeface((Typeface) font$FontStyle.c.b);
        x().x.setTypeface((Typeface) font$FontStyle.b.b);
        x().w.setTypeface((Typeface) font$FontStyle.a.b);
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, fontStyleItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof i23) {
            this.x = (i23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final i23 x() {
        i23 i23Var = this.x;
        if (i23Var != null) {
            return i23Var;
        }
        js3.V("binding");
        throw null;
    }
}
