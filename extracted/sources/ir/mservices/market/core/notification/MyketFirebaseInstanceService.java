package ir.mservices.market.core.notification;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.co6;
import defpackage.f88;
import defpackage.go6;
import defpackage.js3;
import defpackage.lo4;
import defpackage.lw;
import defpackage.vv2;
import defpackage.wv;
import defpackage.zk8;
import ir.mservices.market.version2.webapi.responsedto.NotificationPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketFirebaseInstanceService extends Hilt_MyketFirebaseInstanceService {
    public co6 l;
    public go6 m;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(RemoteMessage remoteMessage) {
        Handler handler;
        try {
            String str = (String) ((wv) remoteMessage.u()).get("custom");
            if (str == null || f88.n0(str)) {
                throw new BadPushMessageException("payload with 'CUSTOM_TAG' key is corrupt!");
            }
            try {
                NotificationPayload notificationPayload = (NotificationPayload) new vv2().c(str, NotificationPayload.class);
                if (notificationPayload.getPushMessage() == null) {
                    throw new BadPushMessageException("pushMessage is null!");
                }
                String notificationIdentifier = notificationPayload.getNotificationIdentifier();
                if (notificationIdentifier != null && !f88.n0(notificationIdentifier)) {
                    notificationPayload.getPushMessage().E(notificationPayload.getNotificationIdentifier());
                }
                String strM = notificationPayload.getPushMessage().m();
                if (strM == null || f88.n0(strM)) {
                    throw new BadPushMessageException("Notification id is nullOrBlank!");
                }
                lo4 lo4Var = new lo4(this, notificationPayload, 16);
                synchronized (zk8.class) {
                    handler = zk8.a;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        zk8.a = handler;
                    }
                }
                lw.f(null, null, handler.post(lo4Var));
            } catch (Exception e) {
                throw new BadPushMessageException("Cannot parse push message additionalData: ".concat(str), e);
            }
        } catch (BadPushMessageException e2) {
            lw.g(e2, "Exception when handling push message", null);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void f(String str) {
        js3.p(str, "token");
        go6 go6Var = this.m;
        if (go6Var != null) {
            go6Var.a();
        } else {
            js3.V("pushMessageServiceHelper");
            throw null;
        }
    }
}
