package ir.mservices.market.service;

import android.app.IntentService;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class RestartService extends IntentService {
    public RestartService() {
        super("Restart Service");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        launchIntentForPackage.addFlags(67108864);
        launchIntentForPackage.addFlags(268435456);
        startActivity(launchIntentForPackage);
    }
}
