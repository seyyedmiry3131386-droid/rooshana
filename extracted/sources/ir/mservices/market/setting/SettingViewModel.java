package ir.mservices.market.setting;

import android.os.Build;
import defpackage.eg5;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pr7;
import defpackage.pv6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vy2;
import defpackage.zt;
import ir.mservices.market.setting.model.b;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.viewModel.c;
import kotlin.Pair;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingViewModel extends c {
    public final pv6 A;
    public final i B;
    public final pv6 C;
    public final l D;
    public final l E;
    public final b t;
    public final pr7 u;
    public final zt v;
    public final eg5 w;
    public final i x;
    public final pv6 y;
    public final i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewModel(b bVar, pr7 pr7Var, zt ztVar, eg5 eg5Var) {
        super(true);
        js3.p(pr7Var, "settingsManager");
        js3.p(ztVar, "appUpdateSync");
        js3.p(eg5Var, "myketUpdateManager");
        this.t = bVar;
        this.u = pr7Var;
        this.v = ztVar;
        this.w = eg5Var;
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.z = iVarE2;
        this.A = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.B = iVarE3;
        this.C = new pv6(iVarE3);
        String strB = pr7Var.b();
        js3.o(strB, "getNightMode(...)");
        this.D = ja1.b(r(strB));
        this.E = ja1.b(pr7Var.c());
    }

    public static Pair r(Object obj) {
        if (obj.equals(1) || obj.equals("on")) {
            return new Pair(Integer.valueOf(rs6.night_mode_on), Boolean.TRUE);
        }
        if (obj.equals(2) || obj.equals("off")) {
            return new Pair(Integer.valueOf(rs6.night_mode_off), Boolean.FALSE);
        }
        if (obj.equals(0) || obj.equals("auto")) {
            return new Pair(Integer.valueOf(Build.VERSION.SDK_INT > 28 ? rs6.night_mode_system : rs6.night_mode_auto), Boolean.valueOf(sj8.g == ThemeMode.b));
        }
        return new Pair(0, Boolean.FALSE);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SettingViewModel$doRequest$1(this, null));
    }
}
