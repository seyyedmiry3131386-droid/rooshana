package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ir.mservices.market.app.update.common.manager.UpdateSyncReceiver;
import ir.mservices.market.core.notification.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class qz8 {
    public final Context a;
    public final AlarmManager b;
    public final a c;
    public final lu7 d;
    public final d04 e;

    public qz8(Context context, AlarmManager alarmManager, a aVar, lu7 lu7Var, d04 d04Var) {
        js3.p(alarmManager, "alarmManager");
        js3.p(aVar, "notificationController");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(d04Var, "languageHelper");
        this.a = context;
        this.b = alarmManager;
        this.c = aVar;
        this.d = lu7Var;
        this.e = d04Var;
    }

    public final PendingIntent a() {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) UpdateSyncReceiver.class);
        intent.setAction("ir.mservices.market.UPDATE_SYNC_ACTION");
        Object obj = lw8.b;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 16965, intent, js8.i(134217728, false));
        js3.o(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void b(int i) {
        this.b.cancel(a());
        Calendar calendar = Calendar.getInstance(this.e.d());
        calendar.add(12, 1);
        calendar.add(10, i);
        long j = 60;
        PendingIntent pendingIntentA = a();
        this.b.setRepeating(1, calendar.getTimeInMillis(), j * ((long) i) * ((long) 1000) * j, pendingIntentA);
        this.d.h(calendar.getTimeInMillis(), lu7.y0);
        try {
            new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.US).format(calendar.getTime());
        } catch (Exception unused) {
            String.valueOf(calendar.getTimeInMillis());
        }
    }
}
