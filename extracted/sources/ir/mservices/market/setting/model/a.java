package ir.mservices.market.setting.model;

import defpackage.br9;
import defpackage.bz6;
import defpackage.c16;
import defpackage.d04;
import defpackage.dp2;
import defpackage.js3;
import defpackage.kh2;
import defpackage.lu7;
import defpackage.pr7;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.v48;
import defpackage.w91;
import defpackage.xb5;
import defpackage.xq7;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.setting.recycler.KidsModeData;
import ir.mservices.market.setting.recycler.SettingAppVersion;
import ir.mservices.market.setting.recycler.SettingNestedData;
import ir.mservices.market.setting.recycler.SettingNightModeData;
import ir.mservices.market.setting.recycler.SettingSimpleData;
import ir.mservices.market.setting.recycler.SettingThemeStyleData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c16 {
    public final v48 c;
    public final xb5 d;
    public final dp2 e;
    public final d04 f;
    public final pr7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v48 v48Var, xb5 xb5Var, dp2 dp2Var) {
        super(1);
        js3.p(v48Var, "themeStyle");
        js3.p(xb5Var, "nightModeState");
        this.c = v48Var;
        this.d = xb5Var;
        this.e = dp2Var;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.f = (d04) w91Var.p.get();
        this.g = (pr7) w91Var.s.get();
    }

    @Override // defpackage.c16
    public final Object d() {
        d04 d04Var = this.f;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        int i = d04Var.f() ? rs6.Farsi : rs6.English;
        ArrayList arrayList = new ArrayList();
        bz6 bz6Var = new bz6(br9.C(new RecyclerItem(new SettingSimpleData("LANGUAGE", rs6.choose_language, i)), new RecyclerItem(new SettingNightModeData(rs6.night_mode, this.d))), (GeneralFilter) null, new SettingPagingSource$getData$1$1(2, this, a.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
        dp2 dp2Var = this.e;
        arrayList.add(new SettingNestedData(bz6Var, dp2Var));
        arrayList.add(new SettingNestedData(new bz6(br9.C(new RecyclerItem(new SettingThemeStyleData(this.c)), new RecyclerItem(new SettingSimpleData("FONT_STYLE", rs6.font, kh2.b.d))), (GeneralFilter) null, new SettingPagingSource$getData$1$2(2, this, a.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), dp2Var));
        pr7 pr7Var = this.g;
        if (pr7Var == null) {
            js3.V("settingsManager");
            throw null;
        }
        arrayList.add(new SettingNestedData(new bz6(br9.B(new RecyclerItem(new KidsModeData(pr7Var.a.b(lu7.z0, false)))), (GeneralFilter) null, (qp2) null, 6), dp2Var));
        arrayList.add(new SettingNestedData(new bz6(br9.B(new RecyclerItem(new SettingSimpleData("OPEN_MYKET_SETTINGS", rs6.show_myket_setting, 0))), (GeneralFilter) null, (qp2) null, 6), dp2Var));
        arrayList.add(new SettingNestedData(new bz6(br9.B(new RecyclerItem(new SettingSimpleData("CLEAR_SEARCH_HISTORY", rs6.clear_search_history, 0))), (GeneralFilter) null, (qp2) null, 6), dp2Var));
        arrayList.add(new SettingAppVersion());
        return new xq7(arrayList);
    }
}
