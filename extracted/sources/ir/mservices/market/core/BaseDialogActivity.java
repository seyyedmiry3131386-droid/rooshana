package ir.mservices.market.core;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import defpackage.dt2;
import defpackage.ee;
import defpackage.is3;
import defpackage.js3;
import defpackage.lw;
import defpackage.t61;
import defpackage.w91;
import defpackage.z80;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.ui.ScreenWatchAnalyticsEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDialogActivity extends Hilt_BaseDialogActivity implements z80 {
    public static final String M = t61.i(BaseDialogActivity.class.toString(), "_BUNDLE_KEY_SUBSCRIBER_ID");
    public String K;
    public ActivitySenderReceiver L;

    public BaseDialogActivity() {
        long j = is3.p + 1;
        is3.p = j;
        this.K = String.valueOf(j);
    }

    @Override // ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strC;
        String string;
        super.onCreate(bundle);
        ApplicationLauncher.f(this);
        ActivitySenderReceiver activitySenderReceiver = new ActivitySenderReceiver(this);
        activitySenderReceiver.b.addAction("ir.mservices.market.action.FINISH_ALL_ACTIVITIES");
        ContextCompat.registerReceiver(activitySenderReceiver.a, activitySenderReceiver, activitySenderReceiver.b, 2);
        this.L = activitySenderReceiver;
        if (bundle != null && (string = bundle.getString(M)) != null) {
            this.K = string;
        }
        lw.c(this.K, null);
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
        super.onDestroy();
        ActivitySenderReceiver activitySenderReceiver = this.L;
        if (activitySenderReceiver != null) {
            activitySenderReceiver.a.unregisterReceiver(activitySenderReceiver);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && (screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class)) != null) {
            screenWatchAnalyticsEvent.a();
        }
        this.L = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Bundle extras;
        super.onPause();
        String strC = C();
        if (strC == null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class);
        if (screenWatchAnalyticsEvent == null) {
            screenWatchAnalyticsEvent = new ScreenWatchAnalyticsEvent(strC);
        }
        screenWatchAnalyticsEvent.b();
        getIntent().putExtra("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Bundle extras;
        super.onResume();
        String strC = C();
        if (strC == null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent = (ScreenWatchAnalyticsEvent) dt2.p(extras, "SCREEN_WATCH_ANALYTICS_EVENT", ScreenWatchAnalyticsEvent.class);
        if (screenWatchAnalyticsEvent == null) {
            screenWatchAnalyticsEvent = new ScreenWatchAnalyticsEvent(strC);
        }
        screenWatchAnalyticsEvent.c(this);
        getIntent().putExtra("SCREEN_WATCH_ANALYTICS_EVENT", screenWatchAnalyticsEvent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        js3.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        lw.c(this.K, null);
        bundle.putString(M, this.K);
    }
}
