package ir.mservices.market.version2.activity;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import defpackage.b46;
import defpackage.b74;
import defpackage.bd;
import defpackage.c5;
import defpackage.cc7;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.ea7;
import defpackage.f09;
import defpackage.f88;
import defpackage.fa1;
import defpackage.h40;
import defpackage.hh2;
import defpackage.ho6;
import defpackage.i10;
import defpackage.js6;
import defpackage.lw;
import defpackage.lz2;
import defpackage.ns6;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q90;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.t32;
import defpackage.uc9;
import defpackage.ue7;
import defpackage.vc9;
import defpackage.wc9;
import defpackage.wn5;
import defpackage.x57;
import defpackage.xf5;
import defpackage.zk8;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.WebViewActivityImpl.ApplicationPaymentActivity;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebViewActivity extends lz2 {
    public static final /* synthetic */ int L0 = 0;
    public i10 A0;
    public c5 B0;
    public dp3 C0;
    public xf5 D0;
    public String E0;
    public b46 F0;
    public Runnable G0;
    public ArrayList H0;
    public final vc9 I0;
    public final ho6 J0;
    public final q90 K0;
    public HashMap z0;

    public WebViewActivity() {
        super(2);
        this.H0 = new ArrayList();
        this.I0 = new vc9(this, this);
        this.J0 = new ho6(2, this);
        this.K0 = new q90(4);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        super.B(bundle, str);
        if (str.equalsIgnoreCase(l0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_ALERT_EXIT".equalsIgnoreCase(dialogDataModel.b)) {
                r0(dialogDataModel.d);
                if (dialogDataModel.d == DialogResult.a) {
                    t0();
                    this.F0.D.removeJavascriptInterface("KOMEIL");
                    if (getIntent().getBooleanExtra("BUNDLE_KEY_HAS_RETRY", false)) {
                        t32.b().j(n0(getIntent().getExtras()));
                    } else {
                        q0();
                    }
                    finish();
                }
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity
    public final boolean f0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        v0();
        return false;
    }

    public abstract void k0();

    public final String l0() {
        return getClass().getSimpleName() + "_" + this.O;
    }

    public abstract Runnable m0();

    public abstract wc9 n0(Bundle bundle);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String o0() {
        /*
            r3 = this;
            java.lang.String r0 = r3.E0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3b
            android.content.Intent r0 = r3.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = 0
            defpackage.lw.d(r1, r1, r0)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "BUNDLE_KEY_URL"
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.E0 = r0
            if (r0 == 0) goto L37
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "^\\p{Alpha}+://.*$"
            r1.<init>(r2)
            boolean r1 = r1.f(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "http://"
            java.lang.String r0 = r1.concat(r0)
        L35:
            if (r0 != 0) goto L39
        L37:
            java.lang.String r0 = ""
        L39:
            r3.E0 = r0
        L3b:
            java.lang.String r0 = r3.E0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.activity.WebViewActivity.o0():java.lang.String");
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().a(this, new h40(5, this, false));
        d(l0(), this);
        try {
            this.F0 = (b46) fa1.d(this, js6.payment);
            a.n(this, sj8.b().F);
            a.l(this, sj8.b().F, sj8.g);
            cc7.e(this.F0.l);
            HashMap map = new HashMap();
            this.z0 = map;
            map.put("X-Access-Token", this.A0.a());
            this.z0.put("Myket-SessionId", ApplicationLauncher.o.c());
            String strO0 = o0();
            if (strO0 == null || f88.n0(strO0)) {
                lw.g(null, "URL invalid", strO0);
                finish();
            } else {
                try {
                    new URL(strO0);
                } catch (MalformedURLException unused) {
                    lw.g(null, "URL invalid", strO0);
                    finish();
                }
            }
            k0();
            if (this.H0 == null) {
                this.H0 = new ArrayList();
            }
            this.H0.add("PaymentRes/index/");
            this.F0.D.getSettings().setJavaScriptEnabled(true);
            this.F0.D.stopLoading();
            this.F0.D.requestFocus(130);
            this.F0.D.setOnTouchListener(this.K0);
            this.F0.D.setWebChromeClient(this.J0);
            this.F0.D.setWebViewClient(this.I0);
            this.F0.D.addJavascriptInterface(new uc9(this), "KOMEIL");
            this.F0.D.getSettings().setMixedContentMode(2);
            Drawable drawable = this.F0.x.getDrawable();
            int i = sj8.b().M;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(i, mode);
            this.F0.v.getDrawable().mutate().setColorFilter(sj8.b().x, mode);
            this.F0.z.setPrimaryColor(sj8.b().c, sj8.b().d);
            this.F0.z.setOnTryAgainListener(new f09(5, this));
            this.F0.z.setOnSettingListener(new ue7(9, this));
            View view = this.F0.C;
            ea7 ea7Var = new ea7(this);
            ea7Var.b = sj8.b().p;
            ea7Var.h = 0;
            ea7Var.c(getResources().getDimensionPixelSize(pq6.space_16));
            ea7Var.p = sj8.b().N;
            ea7Var.j = true;
            view.setBackground(ea7Var.a());
            FrameLayout frameLayout = this.F0.w;
            ea7 ea7Var2 = new ea7(this);
            ea7Var2.b = sj8.b().l;
            ea7Var2.h = 0;
            ea7Var2.c(getResources().getDimensionPixelSize(pq6.space_16));
            ea7Var2.p = sj8.b().N;
            ea7Var2.j = true;
            frameLayout.setBackground(ea7Var2.a());
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            lw.d(null, null, this.F0.D);
            cookieManager.setAcceptThirdPartyCookies(this.F0.D, true);
            p0();
            w0(strO0);
            j0();
            g0().e(ns6.nav_graph_web_view);
        } catch (Exception e) {
            lw.g(e, "Cannot instantiate webview", "installed: nativeWebview:" + this.C0.H("com.android.webview") + ", googleWebview:" + this.C0.H("com.google.android.webview") + ", canDeviceRunChromium:" + wn5.d(this));
            hh2.H(new hh2(this, getString(rs6.webview_payment_failed_message)));
            t0();
            finish();
            q0();
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x(l0());
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (this instanceof ApplicationPaymentActivity) {
            x57 x57Var = this.K;
            if (x57Var.d) {
                x57Var.a.k();
                x57Var.b.k();
                x57Var.d = false;
            }
        }
        super.onStart();
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Handler handler;
        if (this.G0 != null) {
            synchronized (zk8.class) {
                handler = zk8.a;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    zk8.a = handler;
                }
            }
            handler.removeCallbacks(this.G0);
        }
        t0();
        super.onStop();
    }

    public void p0() {
        if (!s7.G(this)) {
            u0(0);
            return;
        }
        u0(1);
        String strO0 = o0();
        if (!TextUtils.isEmpty(strO0)) {
            this.F0.D.loadUrl(strO0, this.z0);
        } else {
            lw.g(null, "WebView url is null or empty", null);
            finish();
        }
    }

    public void q0() {
    }

    public abstract void r0(DialogResult dialogResult);

    public abstract void s0(String str);

    public final void t0() {
        if (this instanceof ApplicationPaymentActivity) {
            x57 x57Var = this.K;
            if (x57Var.d) {
                return;
            }
            x57Var.a.j();
            x57Var.b.j();
            x57Var.d = true;
        }
    }

    public final void u0(int i) {
        if (i == 0) {
            this.F0.z.u(getString(rs6.internet_connection_exception));
        } else if (i == 1) {
            this.F0.z.t();
        } else {
            if (i != 2) {
                return;
            }
            this.F0.z.v();
        }
    }

    public final void v0() {
        pk5.h(this, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(l0(), "DIALOG_KEY_ALERT_EXIT"), "", getString(rs6.abort_text), getString(rs6.dismiss_purchase), getString(rs6.continue_purchase), true)));
    }

    public final void w0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        SpannableString spannableString = new SpannableString(uri.getScheme() + "://" + uri.getHost());
        lw.d(null, null, uri.getScheme());
        if (uri.getScheme().equalsIgnoreCase("https")) {
            spannableString.setSpan(new ForegroundColorSpan(sj8.b().x), 0, 8, 33);
            this.F0.v.setVisibility(0);
        } else {
            this.F0.v.setVisibility(4);
        }
        this.F0.A.setText(spannableString);
        SslCertificate certificate = this.F0.D.getCertificate();
        if (certificate == null || TextUtils.isEmpty(certificate.toString())) {
            return;
        }
        this.F0.A.setOnClickListener(new b74(this, str, 2));
    }
}
