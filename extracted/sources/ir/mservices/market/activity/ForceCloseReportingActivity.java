package ir.mservices.market.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.fragment.app.d;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.d04;
import defpackage.dd;
import defpackage.dt2;
import defpackage.fj5;
import defpackage.fz2;
import defpackage.gu9;
import defpackage.hh2;
import defpackage.ij5;
import defpackage.js6;
import defpackage.kh2;
import defpackage.mm2;
import defpackage.ns6;
import defpackage.pr7;
import defpackage.q3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.w91;
import defpackage.yi5;
import defpackage.yq6;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class ForceCloseReportingActivity extends fz2 implements am2, mm2 {
    public static volatile boolean I = false;
    public static volatile int J;
    public a F;
    public d04 G;
    public pr7 H;

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        DialogDataModel dialogDataModel;
        if (str.equalsIgnoreCase(getClass().getSimpleName()) && (dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class)) != null) {
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_FORCE_CLOSE".equalsIgnoreCase(str2)) {
                finish();
                return;
            }
            if ("DIALOG_KEY_NOT_ENOUGH_SPACE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    Intent intentV = gu9.v(this, new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"), new Intent("android.settings.SETTINGS"));
                    if (intentV != null) {
                        startActivity(intentV);
                    } else {
                        hh2.H(new hh2(this, getString(rs6.app_settings_failed_message)));
                    }
                }
                finish();
            }
        }
    }

    @Override // defpackage.am2
    public final void E() {
    }

    public final dd P() {
        DialogDataModel dialogDataModel = new DialogDataModel(getClass().getSimpleName(), "DIALOG_KEY_FORCE_CLOSE");
        String string = getString(rs6.force_close_title);
        int i = yq6.app_icon_gradient;
        String string2 = getString(rs6.force_close_description);
        String string3 = getString(rs6.button_ok);
        int i2 = sj8.b().c;
        int i3 = sj8.b().d;
        ThemeData themeDataB = sj8.b();
        DialogHeaderComponent.ComponentGravity componentGravity = DialogHeaderComponent.ComponentGravity.a;
        return new dd(dialogDataModel, string, i, null, string2, null, string3, i2, i3, themeDataB, 0);
    }

    public final dd Q() {
        DialogDataModel dialogDataModel = new DialogDataModel(getClass().getSimpleName(), "DIALOG_KEY_NOT_ENOUGH_SPACE");
        String string = getString(rs6.not_enough_space_title);
        int i = yq6.ic_not_enough_storage;
        String string2 = getString(rs6.not_enough_space_description);
        String string3 = getString(rs6.settings);
        String string4 = getString(rs6.not_now);
        int i2 = sj8.b().c;
        int i3 = sj8.b().d;
        ThemeData themeDataB = sj8.b();
        DialogHeaderComponent.ComponentGravity componentGravity = DialogHeaderComponent.ComponentGravity.a;
        return new dd(dialogDataModel, string, i, null, string2, string3, string4, i2, i3, themeDataB, 0);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (Build.VERSION.SDK_INT <= 25) {
            super.attachBaseContext(context);
            return;
        }
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.G = (d04) w91Var.p.get();
        this.H = (pr7) w91Var.s.get();
        super.attachBaseContext(q3.u(context, this.G.d()));
        sj8.g(getResources(), this.H.b(), this.H.c());
        kh2.a(this.H.a());
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        L().h0(str, this, mm2Var);
    }

    @Override // defpackage.am2
    public final d g() {
        return null;
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        L().g0(bundle, str);
    }

    @Override // defpackage.fz2, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        long availableBytes;
        I = true;
        super.onCreate(bundle);
        d(getClass().getSimpleName(), this);
        setContentView(js6.nav_content);
        this.F = new a(null);
        d dVarF = L().F(rr6.content);
        if (!(dVarF instanceof NavHostFragment)) {
            throw new IllegalStateException("content must be navHostFragment");
        }
        NavHostFragment navHostFragment = (NavHostFragment) dVarF;
        ij5 ij5VarZ0 = navHostFragment.z0();
        this.F.h(navHostFragment);
        int intExtra = getIntent().getIntExtra("EXTRA_CRASHED_BEFORE", 100);
        if (intExtra != J || J == 100) {
            J = intExtra;
        } else {
            J++;
        }
        if (J > 2) {
            finish();
            return;
        }
        try {
            fj5 fj5VarB = ij5VarZ0.b().b(ns6.nav_graph_force_close);
            try {
                availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes();
            } catch (Exception unused) {
                availableBytes = -1;
            }
            if (availableBytes > 5242880) {
                ij5VarZ0.b.q(fj5VarB, P().a());
            } else if (J == 1) {
                ij5VarZ0.b.q(fj5VarB, Q().a());
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // defpackage.fz2, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x(getClass().getSimpleName());
        J = 0;
        I = false;
    }

    @Override // defpackage.am2
    public final void p() {
    }

    @Override // defpackage.am2
    public final void q() {
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
    }

    @Override // defpackage.am2
    public final d s() {
        return null;
    }

    @Override // defpackage.am2
    public final void x(String str) {
        L().e(str);
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        this.F.g(yi5Var);
    }

    @Override // defpackage.am2
    public final void clearAll() {
    }
}
