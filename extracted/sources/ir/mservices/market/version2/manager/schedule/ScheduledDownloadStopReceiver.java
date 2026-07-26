package ir.mservices.market.version2.manager.schedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.af7;
import defpackage.at2;
import defpackage.cf7;
import defpackage.lu7;
import defpackage.s30;
import defpackage.w91;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ScheduledDownloadStopReceiver extends BroadcastReceiver {
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
                    this.c = (af7) ((w91) ((cf7) at2.a0(context))).u.get();
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
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || !intent.getAction().equalsIgnoreCase("ir.mservices.market.SCHEDULED_DOWNLOAD_STOP_ACTION")) {
            return;
        }
        intent.getAction();
        af7 af7Var = this.c;
        Iterator it = ((AppUpdateRepositoryImpl) af7Var.h).a(false).iterator();
        while (it.hasNext()) {
            af7Var.b.s(((s30) it.next()).a.n);
        }
        if (af7Var.c.a.b(lu7.x0, false)) {
            af7Var.e();
        }
    }
}
