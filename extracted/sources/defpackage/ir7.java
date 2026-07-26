package defpackage;

import android.text.TextUtils;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.setting.recycler.SettingSimpleData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ir7 extends qg5 {
    public final og5 w;
    public final pg5 x;
    public final lw8 y;
    public gr7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir7(View view, og5 og5Var, pg5 pg5Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        js3.p(pg5Var, "onLongClickListener");
        this.w = og5Var;
        this.x = pg5Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SettingSimpleData settingSimpleData = (SettingSimpleData) myketRecyclerData;
        int i = 0;
        js3.p(settingSimpleData, "data");
        int i2 = settingSimpleData.c;
        int i3 = settingSimpleData.b;
        boolean z = settingSimpleData.d;
        MyketTextView myketTextView = x().x;
        ThemeData themeDataB = sj8.b();
        myketTextView.setTextColor(!z ? themeDataB.u : themeDataB.m);
        MyketTextView myketTextView2 = x().w;
        ThemeData themeDataB2 = sj8.b();
        myketTextView2.setTextColor(!z ? themeDataB2.u : themeDataB2.n);
        View view = this.a;
        view.setFocusable(z);
        qg5.v(view, this.w, this, settingSimpleData);
        pg5 pg5Var = this.x;
        if (pg5Var != null) {
            view.setOnLongClickListener(new x95(pg5Var, this, settingSimpleData, 2));
        }
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_2xl);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_2xl);
        x().v.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        if (i3 != 0) {
            MyketTextView myketTextView3 = x().x;
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            myketTextView3.setText(lw8.e(lw8Var, view.getResources().getString(i3)));
        } else {
            i = 8;
        }
        x().x.setVisibility(i);
        Pair pair = i2 != 0 ? new Pair(0, view.getResources().getString(i2)) : !TextUtils.isEmpty(null) ? new Pair(0, null) : new Pair(8, "");
        int iIntValue = ((Number) pair.a).intValue();
        CharSequence charSequence = (CharSequence) pair.b;
        x().w.setVisibility(iIntValue);
        x().w.setText(charSequence);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof gr7) {
            this.z = (gr7) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final gr7 x() {
        gr7 gr7Var = this.z;
        if (gr7Var != null) {
            return gr7Var;
        }
        js3.V("binding");
        throw null;
    }
}
