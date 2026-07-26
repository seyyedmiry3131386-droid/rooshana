package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.core.notification.PushMessage;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailNotificationDto implements Serializable {

    @vo7("delay")
    private final int delay;

    @vo7("push")
    private final PushMessage pushMessage;

    public AppDetailNotificationDto(PushMessage pushMessage, int i) {
        js3.p(pushMessage, "pushMessage");
        this.pushMessage = pushMessage;
        this.delay = i;
    }

    public static /* synthetic */ AppDetailNotificationDto copy$default(AppDetailNotificationDto appDetailNotificationDto, PushMessage pushMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pushMessage = appDetailNotificationDto.pushMessage;
        }
        if ((i2 & 2) != 0) {
            i = appDetailNotificationDto.delay;
        }
        return appDetailNotificationDto.copy(pushMessage, i);
    }

    public final PushMessage component1() {
        return this.pushMessage;
    }

    public final int component2() {
        return this.delay;
    }

    public final AppDetailNotificationDto copy(PushMessage pushMessage, int i) {
        js3.p(pushMessage, "pushMessage");
        return new AppDetailNotificationDto(pushMessage, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppDetailNotificationDto)) {
            return false;
        }
        AppDetailNotificationDto appDetailNotificationDto = (AppDetailNotificationDto) obj;
        return js3.i(this.pushMessage, appDetailNotificationDto.pushMessage) && this.delay == appDetailNotificationDto.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final PushMessage getPushMessage() {
        return this.pushMessage;
    }

    public int hashCode() {
        return (this.pushMessage.hashCode() * 31) + this.delay;
    }

    public String toString() {
        return "AppDetailNotificationDto(pushMessage=" + this.pushMessage + ", delay=" + this.delay + ")";
    }
}
