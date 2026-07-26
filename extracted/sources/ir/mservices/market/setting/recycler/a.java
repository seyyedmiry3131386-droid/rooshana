package ir.mservices.market.setting.recycler;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import defpackage.a79;
import defpackage.ar7;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cr7;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.setting.SettingRecyclerListFragment;
import ir.mservices.market.setting.SettingViewModel;
import ir.mservices.market.setting.recycler.SettingNightModeData;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final cr7 x;
    public final lw8 y;
    public ar7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, cr7 cr7Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        js3.p(cr7Var, "onCheckedChangeListener");
        this.w = og5Var;
        this.x = cr7Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        SettingNightModeData settingNightModeData = (SettingNightModeData) myketRecyclerData;
        js3.p(settingNightModeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new SettingNightModeViewHolder$onAttach$1(settingNightModeData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        final SettingNightModeData settingNightModeData = (SettingNightModeData) myketRecyclerData;
        int i = 0;
        js3.p(settingNightModeData, "data");
        int i2 = settingNightModeData.c;
        int i3 = settingNightModeData.b;
        x().v.setChecked(((Boolean) ((Pair) ((l) settingNightModeData.g).getValue()).b).booleanValue());
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, settingNightModeData);
        MyketSwitch myketSwitch = x().v;
        js3.o(myketSwitch, "checkBox");
        final cr7 cr7Var = this.x;
        if (cr7Var != null) {
            myketSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, settingNightModeData) { // from class: ng5
                public final /* synthetic */ Object b;

                {
                    this.b = settingNightModeData;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    js3.p(compoundButton, "button");
                    SettingRecyclerListFragment settingRecyclerListFragment = this.a.b;
                    SettingNightModeData settingNightModeData2 = (SettingNightModeData) this.b;
                    int i4 = SettingRecyclerListFragment.k1;
                    js3.p(settingNightModeData2, "recyclerData");
                    if (settingNightModeData2.a.equals("NIGHT_MODE")) {
                        ThemeMode themeMode = sj8.g;
                        ThemeMode themeMode2 = ThemeMode.b;
                        boolean z2 = themeMode == themeMode2;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b(z2 ? "settings_night_mode_off" : "settings_night_mode_on");
                        clickEventBuilder.a();
                        int[] iArr = new int[2];
                        compoundButton.getLocationOnScreen(iArr);
                        SettingViewModel settingViewModelR1 = settingRecyclerListFragment.R1();
                        String str = z2 ? "off" : "on";
                        pr7 pr7Var = settingViewModelR1.u;
                        ((mr7) pr7Var.b.get()).b("NIGHT_MODE", pr7Var.b(), str);
                        pr7Var.a.i(lu7.e0, str);
                        String strB = pr7Var.b();
                        js3.o(strB, "getNightMode(...)");
                        sj8.i(strB);
                        t32.b().g(new k04(iArr[0], iArr[1]));
                        SettingViewModel settingViewModelR12 = settingRecyclerListFragment.R1();
                        Integer numValueOf = Integer.valueOf(sj8.g != themeMode2 ? 2 : 1);
                        l lVar = settingViewModelR12.D;
                        Pair pairR = SettingViewModel.r(numValueOf);
                        lVar.getClass();
                        lVar.p(null, pairR);
                    }
                }
            });
        }
        MyketTextView myketTextView = x().z;
        if (i3 != 0) {
            MyketTextView myketTextView2 = x().z;
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            myketTextView2.setText(lw8.e(lw8Var, view.getResources().getString(i3)));
            myketTextView2.setTextColor(sj8.b().m);
        } else {
            i = 8;
        }
        myketTextView.setVisibility(i);
        Pair pair = i2 != 0 ? new Pair(0, view.getResources().getString(i2)) : !TextUtils.isEmpty(null) ? new Pair(0, null) : new Pair(8, "");
        int iIntValue = ((Number) pair.a).intValue();
        CharSequence charSequence = (CharSequence) pair.b;
        MyketTextView myketTextView3 = x().y;
        myketTextView3.setVisibility(iIntValue);
        myketTextView3.setText(charSequence);
        myketTextView3.setTextColor(sj8.b().n);
        x().w.setBackgroundColor(sj8.b().v);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ar7) {
            this.z = (ar7) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ar7 x() {
        ar7 ar7Var = this.z;
        if (ar7Var != null) {
            return ar7Var;
        }
        js3.V("binding");
        throw null;
    }
}
