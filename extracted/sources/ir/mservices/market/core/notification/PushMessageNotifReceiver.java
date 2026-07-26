package ir.mservices.market.core.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.at2;
import defpackage.co6;
import defpackage.do6;
import defpackage.dt2;
import defpackage.is3;
import defpackage.lw;
import defpackage.ql0;
import defpackage.w91;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.myket.callback.domain.models.CallbackUrlType;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class PushMessageNotifReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();
    public co6 c;

    public final void a(Context context, Intent intent) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    this.c = (co6) ((w91) ((do6) at2.a0(context))).x0.get();
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [c24, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        if (intent.getExtras() != null) {
            PushMessage pushMessage = (PushMessage) dt2.p(intent.getExtras(), "ir.mservices.market.INTENT_EXTRA_PUSH_MESSAGE", PushMessage.class);
            lw.d(null, null, pushMessage);
            if ("ir.mservices.market.INTENT_ACTION_PUSH_MESSAGE_NOTIF_DISMISS".equals(intent.getAction())) {
                co6 co6Var = this.c;
                co6Var.getClass();
                Objects.toString(pushMessage);
                is3.A(CommonDataKt.RESTRICTION_BUTTON_ACTION_DISMISS, pushMessage.m());
                if (TextUtils.isEmpty(pushMessage.f())) {
                    return;
                }
                ((ir.myket.callback.manager.a) co6Var.q.getValue()).b(new ql0(pushMessage.f(), CallbackUrlType.g));
            }
        }
    }
}
