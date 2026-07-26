package ir.mservices.market.version2.manager.schedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.af7;
import defpackage.at2;
import defpackage.bf7;
import defpackage.w91;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ScheduledDownloadStartReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();
    public af7 c;

    public final void a(Context context, Intent intent) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    this.c = (af7) ((w91) ((bf7) at2.a0(context))).u.get();
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        Objects.toString(intent);
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || !intent.getAction().equalsIgnoreCase("ir.mservices.market.SCHEDULED_DOWNLOAD_START_ACTION")) {
            return;
        }
        intent.getAction();
        this.c.f();
    }
}
