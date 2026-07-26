package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import androidx.core.content.ContextCompat;
import defpackage.jm4;
import defpackage.ll4;
import defpackage.on;
import defpackage.rl4;
import defpackage.t61;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbN = t61.n("Expected 1 service that handles ", str, ", found ");
        sbN.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbN.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            try {
                ContextCompat.startForegroundService(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !jm4.b(e)) {
                    throw e;
                }
                t0.d("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + jm4.a(e).getMessage());
                return;
            }
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        on onVar = new on();
        onVar.a = new ll4(1, onVar);
        onVar.c = applicationContext;
        onVar.d = intent;
        onVar.e = pendingResultGoAsync;
        rl4 rl4Var = new rl4(applicationContext, componentNameA2, onVar);
        onVar.f = rl4Var;
        rl4Var.a.b.connect();
    }
}
