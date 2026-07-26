package ir.mservices.market.activity;

import android.app.Activity;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b77;
import defpackage.cc7;
import defpackage.dt2;
import defpackage.ee;
import defpackage.fa1;
import defpackage.g7;
import defpackage.ge9;
import defpackage.i60;
import defpackage.is3;
import defpackage.j97;
import defpackage.js3;
import defpackage.js6;
import defpackage.kh2;
import defpackage.ln;
import defpackage.lw;
import defpackage.n60;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qn8;
import defpackage.r39;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t32;
import defpackage.t61;
import defpackage.w91;
import defpackage.x57;
import defpackage.ym;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.z80;
import defpackage.zk8;
import defpackage.zm;
import ir.mservices.market.core.ActivitySenderReceiver;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.ui.ScreenWatchAnalyticsEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseContentActivity extends Hilt_BaseContentActivity implements z80, rn8 {
    public static final String R = t61.i(BaseContentActivity.class.toString(), "_BUNDLE_KEY_SUBSCRIBER_ID");
    public x57 K;
    public ActivitySenderReceiver L;
    public MaterialToolbar M;
    public g7 N;
    public String O;
    public final i60 P;
    public n60 Q;

    public BaseContentActivity() {
        long j = is3.p + 1;
        is3.p = j;
        this.O = String.valueOf(j);
        this.P = new i60(this);
    }

    @Override // defpackage.z80
    public String C() {
        return T();
    }

    public MaterialToolbar S() {
        View viewFindViewById = findViewById(rr6.toolbar);
        js3.o(viewFindViewById, "findViewById(...)");
        return (MaterialToolbar) viewFindViewById;
    }

    public abstract String T();

    public String U() {
        return null;
    }

    public MaterialToolbar V() {
        return this.M;
    }

    public final void W() {
        Drawable drawable;
        MaterialToolbar materialToolbarV = V();
        g7 g7Var = null;
        if (materialToolbarV != null) {
            Resources resources = getResources();
            js3.o(resources, "getResources(...)");
            int i = yq6.ic_action_back;
            try {
                drawable = q39.a(resources, i, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            materialToolbarV.setNavigationIcon(drawableMutate);
            g7Var = new g7(this, materialToolbarV, 0);
            materialToolbarV.post(g7Var);
        }
        this.N = g7Var;
    }

    public void X() {
        CharSequence title;
        MaterialToolbar materialToolbarS = S();
        materialToolbarS.setPaddingRelative(materialToolbarS.getResources().getDimensionPixelSize(pq6.actionbar_start_space), 0, materialToolbarS.getResources().getDimensionPixelSize(pq6.actionbar_end_space), 0);
        materialToolbarS.setContentInsetStartWithNavigation(0);
        materialToolbarS.setTitleMarginStart(materialToolbarS.getResources().getDimensionPixelSize(pq6.space_m));
        this.M = materialToolbarS;
        a0(sj8.b().l);
        int i = sj8.b().m;
        MaterialToolbar materialToolbarV = V();
        if (materialToolbarV != null) {
            materialToolbarV.setTitleTextColor(i);
            materialToolbarV.setSubtitleTextColor(i);
        }
        c0("");
        MaterialToolbar materialToolbarV2 = V();
        ln lnVar = (ln) O();
        if (lnVar.j instanceof Activity) {
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            if (zk8Var instanceof ge9) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            lnVar.p = null;
            if (zk8Var != null) {
                zk8Var.S();
            }
            lnVar.o = null;
            if (materialToolbarV2 != null) {
                Object obj = lnVar.j;
                qn8 qn8Var = new qn8(materialToolbarV2, obj instanceof Activity ? ((Activity) obj).getTitle() : lnVar.q, lnVar.m);
                lnVar.o = qn8Var;
                lnVar.m.b = qn8Var.s;
                materialToolbarV2.setBackInvokedCallbackEnabled(true);
            } else {
                lnVar.m.b = null;
            }
            lnVar.a();
        }
        a0(sj8.b().l);
        MaterialToolbar materialToolbarV3 = V();
        if (materialToolbarV3 != null && (title = materialToolbarV3.getTitle()) != null && title.length() > 0) {
            MaterialToolbar materialToolbarV4 = V();
            if (String.valueOf(materialToolbarV4 != null ? materialToolbarV4.getTitle() : null).equalsIgnoreCase(getString(rs6.myket))) {
                c0("");
            }
        }
        zk8 zk8VarP = P();
        if (zk8VarP != null) {
            zk8VarP.f0();
            zk8VarP.d0(true);
            zk8VarP.h0();
            zk8VarP.e0();
        }
        W();
        MaterialToolbar materialToolbarV5 = V();
        if (materialToolbarV5 != null) {
            materialToolbarV5.setLayoutDirection(3);
        }
        a.n(this, sj8.b().F);
        a.k(this, sj8.b().F, sj8.g);
    }

    public boolean Y() {
        return !(this instanceof HameActivity);
    }

    public final void Z(int i, boolean z) {
        if (z) {
            n60 n60Var = (n60) fa1.d((BaseNavigationContentActivity) this, js6.base_content_layout);
            this.Q = n60Var;
            cc7.e(n60Var != null ? n60Var.w : null);
            LayoutInflater layoutInflater = getLayoutInflater();
            n60 n60Var2 = this.Q;
            fa1.c(layoutInflater, i, n60Var2 != null ? n60Var2.v : null, true);
        } else {
            fa1.d((BaseNavigationContentActivity) this, i);
        }
        X();
    }

    public final void a0(int i) {
        MaterialToolbar materialToolbarV = V();
        if (materialToolbarV != null) {
            materialToolbarV.setBackground(new ColorDrawable(i));
        }
    }

    public final void b0(String str) {
        MaterialToolbar materialToolbarV;
        if (str == null || (materialToolbarV = V()) == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            materialToolbarV.setSubtitle("");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(materialToolbarV.getResources().getDimensionPixelSize(pq6.font_size_normal)), 0, spannableString.length(), 33);
        materialToolbarV.setSubtitle(spannableString);
    }

    public final void c0(String str) {
        MaterialToolbar materialToolbarV;
        if (str == null || (materialToolbarV = V()) == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            materialToolbarV.setTitle("");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.c.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(materialToolbarV.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        materialToolbarV.setTitle(spannableString);
    }

    @Override // defpackage.rn8
    public void j(boolean z) {
        if (z) {
            zk8 zk8VarP = P();
            if (zk8VarP != null) {
                zk8VarP.m0();
                return;
            }
            return;
        }
        zk8 zk8VarP2 = P();
        if (zk8VarP2 != null) {
            zk8VarP2.H();
        }
    }

    @Override // defpackage.rn8
    public void l(boolean z) {
    }

    @Override // defpackage.rn8
    public boolean n() {
        return true;
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strC;
        String string;
        super.onCreate(bundle);
        j97.d(getWindow(), false);
        ActivitySenderReceiver activitySenderReceiver = new ActivitySenderReceiver(this);
        IntentFilter intentFilter = activitySenderReceiver.b;
        intentFilter.addAction("ir.mservices.market.action.FINISH_ALL_ACTIVITIES");
        ContextCompat.registerReceiver(activitySenderReceiver.a, activitySenderReceiver, intentFilter, 2);
        this.L = activitySenderReceiver;
        ym ymVar = zm.a;
        int i = r39.a;
        if (bundle != null && (string = bundle.getString(R)) != null) {
            this.O = string;
        }
        lw.c(this.O, null);
        if (Y() && !yq2.n0(this)) {
            setRequestedOrientation(7);
        }
        sb7.p("MyketContentActivity", t61.i(T(), " onCreate()"), U());
        if (bundle != null || (strC = C()) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
        bundle2.putString("screen_name", strC);
        eeVar.getClass();
        eeVar.a(bundle2, "screen_show");
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent;
        ActivitySenderReceiver activitySenderReceiver = this.L;
        if (activitySenderReceiver != null) {
            activitySenderReceiver.a.unregisterReceiver(activitySenderReceiver);
        }
        sb7.p("MyketContentActivity", t61.i(T(), " onDestroy()"), U());
        x57 x57Var = this.K;
        if (x57Var == null) {
            js3.V("requestProxy");
            throw null;
        }
        x57Var.a(this);
        if (this.N != null) {
            MaterialToolbar materialToolbarV = V();
            if (materialToolbarV != null) {
                materialToolbarV.removeCallbacks(this.N);
            }
            this.N = null;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && (screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class)) != null) {
            screenWatchAnalyticsEvent.a();
        }
        this.Q = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent;
        super.onPause();
        Bundle extras = getIntent().getExtras();
        if (extras == null || (screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class)) == null) {
            return;
        }
        screenWatchAnalyticsEvent.b();
        getIntent().putExtra("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class);
            if (screenWatchAnalyticsEvent == null) {
                String strC = C();
                screenWatchAnalyticsEvent = strC != null ? new ScreenWatchAnalyticsEvent(strC) : null;
            }
            if (screenWatchAnalyticsEvent != null) {
                screenWatchAnalyticsEvent.c(this);
            }
            getIntent().putExtra("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        js3.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        lw.c(this.O, null);
        bundle.putString(R, this.O);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        i60 i60Var = this.P;
        i60Var.getClass();
        t32.b().l(i60Var, true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        i60 i60Var = this.P;
        i60Var.getClass();
        t32.b().o(i60Var);
        super.onStop();
    }

    @Override // defpackage.rn8
    public void u(View view) {
    }

    @Override // defpackage.rn8
    public void z(View view) {
    }
}
