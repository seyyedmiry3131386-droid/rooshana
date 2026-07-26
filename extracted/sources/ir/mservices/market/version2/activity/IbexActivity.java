package ir.mservices.market.version2.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.d;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.d04;
import defpackage.dt2;
import defpackage.e45;
import defpackage.fj5;
import defpackage.h40;
import defpackage.hh2;
import defpackage.hl5;
import defpackage.ij5;
import defpackage.jj5;
import defpackage.js3;
import defpackage.js6;
import defpackage.m22;
import defpackage.mf9;
import defpackage.nf9;
import defpackage.ns6;
import defpackage.of9;
import defpackage.pf9;
import defpackage.q0;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sa7;
import defpackage.sj8;
import defpackage.ws5;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class IbexActivity extends BaseNavigationContentActivity implements e45 {
    public static final /* synthetic */ int E0 = 0;
    public String A0;
    public long B0 = -1;
    public String C0 = "APP";
    public IbexData D0;
    public String x0;
    public String y0;
    public String z0;

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        String string = getString(rs6.page_name_video_player);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String U() {
        return "IbexActivity";
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return false;
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        js3.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        d04 d04Var = this.G;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        Locale localeD = d04Var.d();
        Locale.setDefault(localeD);
        Configuration configuration2 = new Configuration(getBaseContext().getResources().getConfiguration());
        configuration2.setLocale(localeD);
        getBaseContext().getResources().updateConfiguration(configuration2, getBaseContext().getResources().getDisplayMetrics());
        d dVarF = L().F(rr6.content);
        if (dVarF != null) {
            dVarF.onConfigurationChanged(configuration);
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        ij5 ij5Var;
        jj5 jj5VarB;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onCreate(bundle);
        m22 m22Var = new m22(7, this);
        ws5 ws5VarC = c();
        if (ws5VarC != null) {
            ws5VarC.a(this, new h40(4, m22Var, false));
        }
        ApplicationLauncher.f(this);
        setResult(-1);
        Z(js6.nav_content, true);
        a.n(this, sj8.b().J.a);
        a.k(this, sj8.b().J.a, sj8.g);
        MaterialToolbar materialToolbar = this.M;
        if (materialToolbar != null) {
            materialToolbar.setVisibility(8);
        }
        j0();
        Intent intent = getIntent();
        js3.o(intent, "getIntent(...)");
        q0 q0Var = new q0(this, intent);
        fj5 fj5VarB = null;
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            String strC = q0Var.c();
            if (strC != null && strC.equalsIgnoreCase(q0Var.b(rs6.external_intent_filters_host_video)) && (((str4 = this.y0) == null || str4.length() == 0) && (((str5 = this.y0) == null || str5.length() == 0) && intent.getData() != null))) {
                Uri data = intent.getData();
                this.y0 = data != null ? data.getQueryParameter(q0Var.b(rs6.external_intent_video_query_id)) : null;
                Uri data2 = intent.getData();
                this.z0 = data2 != null ? data2.getQueryParameter(q0Var.b(rs6.external_intent_video_query_aparatId)) : null;
                Uri data3 = intent.getData();
                this.A0 = data3 != null ? data3.getQueryParameter(q0Var.b(rs6.external_intent_video_query_url)) : null;
                Uri data4 = intent.getData();
                this.x0 = data4 != null ? data4.getQueryParameter(q0Var.b(rs6.external_intent_video_query_callbackUrl)) : null;
            }
            String str6 = this.y0;
            if ((str6 == null || str6.length() == 0) && (((str2 = this.A0) == null || str2.length() == 0) && ((str3 = this.z0) == null || str3.length() == 0))) {
                hh2 hh2Var = new hh2(this, getString(rs6.video_not_found));
                hh2Var.G();
                hh2.H(hh2Var);
                finish();
                return;
            }
        } else {
            this.B0 = getIntent().getLongExtra("BUNDLE_KEY_VIDEO_DURATION", -1L);
            this.z0 = getIntent().getStringExtra("BUNDLE_KEY_APARAT_VIDEO_ID");
            this.A0 = getIntent().getStringExtra("BUNDLE_KEY_VIDEO_URL");
            this.x0 = getIntent().getStringExtra("BUNDLE_KEY_START_CALLBACK_URL");
            Bundle extras = getIntent().getExtras();
            this.D0 = extras != null ? (IbexData) dt2.s(extras, "BUNDLE_KEY_IBEX_DATA", IbexData.class) : null;
            String str7 = this.z0;
            if ((str7 == null || str7.length() == 0) && ((str = this.A0) == null || str.length() == 0)) {
                hh2 hh2Var2 = new hh2(this, getString(rs6.video_not_found));
                hh2Var2.G();
                hh2.H(hh2Var2);
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("type");
            if (stringExtra != null) {
                this.C0 = stringExtra;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("startCallback", this.x0);
        bundle2.putString("packageName", this.y0);
        bundle2.putString("videoUrl", this.A0);
        bundle2.putString("aparatVideoId", this.z0);
        bundle2.putString("videoType", this.C0);
        bundle2.putLong("videoDuration", this.B0);
        bundle2.putInt("orientation", 1);
        ij5 ij5Var2 = this.X;
        if (ij5Var2 != null && (jj5VarB = ij5Var2.b()) != null) {
            fj5VarB = jj5VarB.b(ns6.nav_graph_ibex);
        }
        String str8 = this.C0;
        if (js3.i(str8, "APP")) {
            if (fj5VarB != null) {
                fj5VarB.g.t(rr6.ibex);
            }
        } else if (js3.i(str8, "MOVIE")) {
            if (fj5VarB != null) {
                fj5VarB.g.t(rr6.movieIbex);
            }
            bundle2.putSerializable("ibexData", this.D0);
        }
        if (fj5VarB == null || (ij5Var = this.X) == null) {
            return;
        }
        ij5Var.b.q(fj5VarB, bundle2);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Window window = getWindow();
        hl5 hl5Var = new hl5(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        sa7 pf9Var = i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var);
        pf9Var.g(519);
        pf9Var.n();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Window window = getWindow();
        hl5 hl5Var = new hl5(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        sa7 pf9Var = i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var);
        pf9Var.g(519);
        pf9Var.n();
    }
}
