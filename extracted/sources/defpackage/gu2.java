package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.android.core.t0;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes.dex */
public final class gu2 extends hu2 {
    public static final Object d = new Object();
    public static final gu2 e = new gu2();
    public yi9 c;

    public static AlertDialog d(Activity activity2, int i, pi9 pi9Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity2.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity2.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity2, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity2);
        }
        builder.setMessage(mi9.b(activity2, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity2.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(dt6.common_google_play_services_enable_button) : resources.getString(dt6.common_google_play_services_update_button) : resources.getString(dt6.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, pi9Var);
        }
        String strA = mi9.a(activity2, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        t0.n("GoogleApiAvailability", rm7.n(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity2, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity2 instanceof FragmentActivity) {
                wl2 wl2VarL = ((FragmentActivity) activity2).L();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                rq4.o(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.Q0 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.R0 = onCancelListener;
                }
                supportErrorDialogFragment.F0(wl2VarL, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity2.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        rq4.o(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        errorDialogFragment.a = alertDialog;
        if (onCancelListener != null) {
            errorDialogFragment.b = onCancelListener;
        }
        errorDialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new pi9(super.a(i, googleApiActivity, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity2, c64 c64Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity2, i, new pi9(super.a(i, activity2, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME), c64Var, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity2, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        t0.n("GoogleApiAvailability", bl4.q(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new ii9(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                t0.m("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? mi9.e(context, "common_google_play_services_resolution_required_title") : mi9.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(dt6.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? mi9.d(context, "common_google_play_services_resolution_required_text", mi9.c(context)) : mi9.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        rq4.n(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        fp5 fp5Var = new fp5(context, null);
        fp5Var.r = true;
        fp5Var.d(16, true);
        fp5Var.e = fp5.c(strE);
        dp5 dp5Var = new dp5(5, false);
        dp5Var.c = fp5.c(strD);
        fp5Var.g(dp5Var);
        boolean zX = xq2.x(context);
        int i3 = R.drawable.stat_sys_warning;
        if (zX) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            fp5Var.y.icon = i3;
            fp5Var.j = 2;
            if (xq2.y(context)) {
                int i5 = wq6.common_full_open_on_phone;
                fp5Var.b.add(new zo5(i5 != 0 ? IconCompat.b(null, "", i5) : null, resources.getString(dt6.common_open_on_phone), pendingIntent));
            } else {
                fp5Var.g = pendingIntent;
            }
        } else {
            fp5Var.y.icon = R.drawable.stat_sys_warning;
            fp5Var.y.tickerText = fp5.c(resources.getString(dt6.common_google_play_services_notification_ticker));
            fp5Var.y.when = System.currentTimeMillis();
            fp5Var.g = pendingIntent;
            fp5Var.f = fp5.c(strD);
        }
        if (wn5.R()) {
            if (!wn5.R()) {
                throw new IllegalStateException();
            }
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(dt6.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            fp5Var.v = "com.google.android.gms.availability";
        }
        Notification notificationB = fp5Var.b();
        if (i == 1 || i == 2 || i == 3) {
            lu2.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }
}
