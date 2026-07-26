package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.AppManager$StartFlowResult;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.manager.schedule.ScheduledDownloadStartReceiver;
import ir.mservices.market.version2.manager.schedule.ScheduledDownloadStopReceiver;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class af7 {
    public Context a;
    public ps1 b;
    public pr7 c;
    public d04 d;
    public a e;
    public AlarmManager f;
    public ir.mservices.market.app.update.common.modal.a g;
    public wt h;

    public final boolean a() {
        Calendar calendar = Calendar.getInstance(this.d.d());
        Calendar calendarC = c();
        Calendar calendarD = d();
        calendar.add(13, 5);
        if (!calendarC.before(calendarD)) {
            if (calendar.after(calendarD)) {
                calendarD.add(5, 1);
            } else {
                calendarC.add(5, -1);
            }
        }
        return calendar.after(calendarC) && calendar.before(calendarD);
    }

    public final int[] b(String str) {
        String strF;
        String str2 = lu7.z;
        if (str.equalsIgnoreCase(str2)) {
            strF = this.c.a.f(str2, "02:00");
        } else {
            String str3 = lu7.A;
            strF = str.equalsIgnoreCase(str3) ? this.c.a.f(str3, "07:00") : "";
        }
        return s7.e0(strF);
    }

    public final Calendar c() {
        int[] iArrB = b(lu7.z);
        Calendar calendar = Calendar.getInstance(this.d.d());
        calendar.set(11, iArrB[0]);
        calendar.set(12, iArrB[1]);
        calendar.set(13, 0);
        return calendar;
    }

    public final Calendar d() {
        int[] iArrB = b(lu7.A);
        Calendar calendar = Calendar.getInstance(this.d.d());
        calendar.set(11, iArrB[0]);
        calendar.set(12, iArrB[1]);
        calendar.set(13, 0);
        return calendar;
    }

    public final void e() {
        Calendar[] calendarArr = {c(), d()};
        Calendar calendar = Calendar.getInstance(this.d.d());
        calendar.add(13, 5);
        boolean z = calendar.compareTo(calendarArr[0]) > 0;
        boolean z2 = calendarArr[0].compareTo(calendarArr[1]) > 0;
        if (z) {
            calendarArr[0].add(5, 1);
        }
        if (z && z2) {
            calendarArr[1].add(5, 2);
        } else if (z || z2) {
            calendarArr[1].add(5, 1);
        }
        Calendar calendar2 = calendarArr[0];
        if (calendar2 == null || calendarArr[1] == null) {
            return;
        }
        Intent intent = new Intent(this.a, (Class<?>) ScheduledDownloadStartReceiver.class);
        intent.setAction("ir.mservices.market.SCHEDULED_DOWNLOAD_START_ACTION");
        Context context = this.a;
        Object obj = lw8.b;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 16895, intent, js8.i(134217728, false));
        try {
            new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.US).format(calendar2.getTime());
        } catch (Exception unused) {
            String.valueOf(calendar2.getTimeInMillis());
        }
        this.f.setExactAndAllowWhileIdle(0, calendar2.getTimeInMillis(), broadcast);
        Calendar calendar3 = calendarArr[1];
        Intent intent2 = new Intent(this.a, (Class<?>) ScheduledDownloadStopReceiver.class);
        intent2.setAction("ir.mservices.market.SCHEDULED_DOWNLOAD_STOP_ACTION");
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.a, 16896, intent2, js8.i(134217728, false));
        try {
            new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.US).format(calendar3.getTime());
        } catch (Exception unused2) {
            String.valueOf(calendar3.getTimeInMillis());
        }
        this.f.setExactAndAllowWhileIdle(0, calendar3.getTimeInMillis(), broadcast2);
    }

    public final void f() {
        Context context = this.a;
        js3.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        js3.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
        Context context2 = this.a;
        js3.p(context2, "context");
        Object systemService2 = context2.getSystemService("connectivity");
        js3.n(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
        boolean zD = this.c.d() & (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected() && activeNetworkInfo2.getType() == 0);
        if (z || zD) {
            boolean zA = a();
            boolean zB = this.c.a.b(lu7.x0, false);
            if (zA && zB) {
                ArrayList arrayListA = ((AppUpdateRepositoryImpl) this.h).a(false);
                if (arrayListA.isEmpty()) {
                    this.g.a(this, "schedule", "schedule_update_list", ff5.b(), new ts5(12, this), null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DownloadDataModel downloadDataModel = new DownloadDataModel(((s30) it.next()).a, "other", "AutoUpdate");
                    Long l = downloadDataModel.i;
                    AppDownloadFlowStatus appDownloadFlowStatusD = this.e.d(downloadDataModel.a, downloadDataModel.b, false, l != null ? new ForceUpdateDto(l.longValue(), "") : null);
                    if (appDownloadFlowStatusD == AppDownloadFlowStatus.b || appDownloadFlowStatusD == AppDownloadFlowStatus.c) {
                        arrayList.add(downloadDataModel);
                    }
                }
                a aVar = this.e;
                aVar.getClass();
                aVar.f();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext() && aVar.h(null, (DownloadDataModel) it2.next()) != AppManager$StartFlowResult.d) {
                }
            }
        }
    }

    public void onEvent(ju juVar) {
        ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode = juVar.b;
        if (applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode == ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.a || applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode == ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.b) {
            e();
        }
    }
}
