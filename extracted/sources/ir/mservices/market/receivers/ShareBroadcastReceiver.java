package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.rs6;

/* JADX INFO: loaded from: classes3.dex */
public class ShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent intentCreateChooser = Intent.createChooser(intent2, context.getString(rs6.share));
            intentCreateChooser.setFlags(268435456);
            context.startActivity(intentCreateChooser);
        }
    }
}
