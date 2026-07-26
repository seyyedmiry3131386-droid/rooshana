package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.receivers.StopAllDownloadReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 {
    public final Context a;
    public fp5 b;

    public qs1(Context context) {
        this.a = context;
    }

    public final fp5 a() {
        fp5 fp5Var = this.b;
        if (fp5Var != null) {
            return fp5Var;
        }
        Context context = this.a;
        fp5 fp5Var2 = new fp5(context, "download");
        fp5Var2.t = sj8.b().c;
        fp5Var2.d(2, true);
        fp5Var2.y.icon = R.drawable.stat_sys_download;
        Intent intent = new Intent(context, (Class<?>) LaunchContentActivity.class);
        intent.setAction("ir.mservices.market.ACTION_DOWNLOADING_LIST");
        intent.setFlags(67108864);
        Object obj = lw8.b;
        PendingIntent activity2 = PendingIntent.getActivity(context, 201, intent, js8.i(402653184, false));
        js3.o(activity2, "getActivity(...)");
        fp5Var2.g = activity2;
        String string = context.getResources().getString(rs6.stop_download_notif);
        Intent intent2 = new Intent(context, (Class<?>) StopAllDownloadReceiver.class);
        intent2.setAction("ir.mservices.market_STOP_ALL");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 202, intent2, js8.i(134217728, false));
        js3.o(broadcast, "getBroadcast(...)");
        fp5Var2.a(new zo5(null, string, broadcast));
        this.b = fp5Var2;
        return fp5Var2;
    }
}
