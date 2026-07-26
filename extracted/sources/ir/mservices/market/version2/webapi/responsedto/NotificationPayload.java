package ir.mservices.market.version2.webapi.responsedto;

import defpackage.vo7;
import ir.mservices.market.core.notification.PushMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationPayload {

    @vo7("i")
    private final String notificationIdentifier;

    @vo7("a")
    private final PushMessage pushMessage;

    public NotificationPayload(PushMessage pushMessage, String str) {
        this.pushMessage = pushMessage;
        this.notificationIdentifier = str;
    }

    public final String getNotificationIdentifier() {
        return this.notificationIdentifier;
    }

    public final PushMessage getPushMessage() {
        return this.pushMessage;
    }
}
