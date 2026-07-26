package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class ok3 implements Runnable {
    public boolean a;
    public String b;
    public int c;

    @Override // java.lang.Runnable
    public final void run() {
        sb7.p("MyketInAppPurchaseActivity", "Show Xiaomi notification in payment. v2=" + this.a + ", package=" + this.b + ", versionCode=" + this.c, null);
        NotificationManager notificationManager = (NotificationManager) ApplicationLauncher.o.getApplicationContext().getSystemService("notification");
        fp5 fp5Var = new fp5(ApplicationLauncher.o.getApplicationContext(), "myket_channel_id");
        SpannableString spannableString = new SpannableString(ApplicationLauncher.o.getApplicationContext().getString(rs6.inapp_notif_problem_title));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        spannableString.setSpan(new AlignmentSpan.Standard(alignment), 0, spannableString.length(), 17);
        SpannableString spannableString2 = new SpannableString(ApplicationLauncher.o.getApplicationContext().getString(rs6.inapp_notif_problem_content));
        spannableString2.setSpan(new AlignmentSpan.Standard(alignment), 0, spannableString2.length(), 17);
        Intent intent = new Intent(ApplicationLauncher.o.getApplicationContext(), (Class<?>) LaunchContentActivity.class);
        intent.setAction("ir.mservices.market_ACTION_DISPLAY_OVER_APPS");
        intent.putExtra("BUNDLE_KEY_URL", "https://myket.ir/support/pages/resolve-payment-permission-issue-in-some-devices/");
        Context applicationContext = ApplicationLauncher.o.getApplicationContext();
        Object obj = lw8.b;
        PendingIntent activity2 = PendingIntent.getActivity(applicationContext, 0, intent, js8.i(402653184, false));
        int i = yq6.notif_app_icon;
        Notification notification = fp5Var.y;
        notification.icon = i;
        notification.when = System.currentTimeMillis();
        fp5Var.g = activity2;
        fp5Var.e = fp5.c(spannableString);
        fp5Var.f = fp5.c(spannableString2);
        fp5Var.d(16, true);
        fp5Var.t = sj8.b().M;
        notificationManager.notify(1, fp5Var.b());
        if (this.a) {
            lw.g(null, "Show Xiaomi in-app payment notification!", null);
        } else {
            zk8.X(new Exception("Notification for display over apps permission on some devices"), true);
        }
    }
}
