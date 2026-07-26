package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.setting.recycler.KidsModeData;
import ir.mservices.market.setting.recycler.SettingNightModeData;
import ir.mservices.market.setting.recycler.SettingSimpleData;
import ir.mservices.market.setting.recycler.SettingThemeStyleData;
import ir.mservices.market.setting.recycler.a;
import ir.mservices.market.setting.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final class yq7 extends k06 {
    public og5 o;
    public pg5 p;
    public og5 q;
    public cr7 r;
    public og5 s;
    public og5 t;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == SettingSimpleData.f) {
            og5 og5Var = this.o;
            if (og5Var == null) {
                js3.V("onClickListener");
                throw null;
            }
            pg5 pg5Var = this.p;
            if (pg5Var != null) {
                return new ir7(view, og5Var, pg5Var);
            }
            js3.V("onLongClickListener");
            throw null;
        }
        if (i == SettingNightModeData.h) {
            og5 og5Var2 = this.q;
            if (og5Var2 == null) {
                js3.V("onNightModeClickListener");
                throw null;
            }
            cr7 cr7Var = this.r;
            if (cr7Var != null) {
                return new a(view, og5Var2, cr7Var);
            }
            js3.V("onCheckedChangeListener");
            throw null;
        }
        if (i == SettingThemeStyleData.d) {
            og5 og5Var3 = this.s;
            if (og5Var3 != null) {
                return new b(view, og5Var3);
            }
            js3.V("onThemeClickListener");
            throw null;
        }
        if (i != KidsModeData.c) {
            if (i == DividerData.k) {
                return new oq1(view);
            }
            return null;
        }
        og5 og5Var4 = this.t;
        if (og5Var4 != null) {
            return new lz3(view, og5Var4);
        }
        js3.V("onKidsModeClickListener");
        throw null;
    }
}
