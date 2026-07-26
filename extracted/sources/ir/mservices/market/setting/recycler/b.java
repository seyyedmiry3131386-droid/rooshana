package ir.mservices.market.setting.recycler;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.jr7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.sj8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public jr7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        SettingThemeStyleData settingThemeStyleData = (SettingThemeStyleData) myketRecyclerData;
        js3.p(settingThemeStyleData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new SettingThemeStyleViewHolder$onAttach$1(settingThemeStyleData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SettingThemeStyleData settingThemeStyleData = (SettingThemeStyleData) myketRecyclerData;
        js3.p(settingThemeStyleData, "data");
        View view = x().v;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(sj8.b().c);
        gradientDrawable.setCornerRadius(x().l.getContext().getResources().getDimension(pq6.space_4));
        view.setBackground(gradientDrawable);
        x().x.setTextColor(sj8.b().m);
        x().w.setTextColor(sj8.b().n);
        View view2 = this.a;
        js3.o(view2, "itemView");
        qg5.v(view2, this.w, this, settingThemeStyleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof jr7) {
            this.x = (jr7) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final jr7 x() {
        jr7 jr7Var = this.x;
        if (jr7Var != null) {
            return jr7Var;
        }
        js3.V("binding");
        throw null;
    }
}
