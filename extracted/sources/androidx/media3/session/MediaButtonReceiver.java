package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import defpackage.t61;
import defpackage.vj3;
import defpackage.wn5;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static final String[] a = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 79) {
            t0.m("MediaButtonReceiver", "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
            return;
        }
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= 3) {
                throw new IllegalStateException("Could not find any Service that handles any of the actions " + Arrays.toString(strArr));
            }
            String str = strArr[i];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    StringBuilder sbN = t61.n("Expected 1 service that handles ", str, ", found ");
                    sbN.append(listQueryIntentServices.size());
                    throw new IllegalStateException(sbN.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                Intent intent3 = new Intent();
                intent3.setComponent(componentName);
                intent3.fillIn(intent, 0);
                try {
                    ContextCompat.startForegroundService(context, intent3);
                    return;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT < 31 || !vj3.i(e)) {
                        throw e;
                    }
                    wn5.F("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + vj3.f(e).getMessage());
                    return;
                }
            }
            i++;
        }
    }
}
