package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.core.notification.PushMessage;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UpdateDTO implements Serializable {
    private ExtensionPointDto appListExt;
    private int cacheTimeMin;
    private ExtensionPointDto emptyAppListExt;
    private int flexHour;
    private int nextSyncHour;
    private boolean showTrafficHint;
    private PushMessage updateNotification;
    private List<AppUpdateDTO> updates;

    public ExtensionPointDto getAppListExt() {
        return this.appListExt;
    }

    public List<AppUpdateDTO> getAppUpdates() {
        return this.updates;
    }

    public int getCacheTimeMin() {
        return this.cacheTimeMin;
    }

    public ExtensionPointDto getEmptyAppListExt() {
        return this.emptyAppListExt;
    }

    public int getFlexHour() {
        int i = this.flexHour;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int getNextSyncHour() {
        return this.nextSyncHour;
    }

    public PushMessage getUpdateNotification() {
        return this.updateNotification;
    }

    public boolean isShowTrafficHint() {
        return this.showTrafficHint;
    }

    public void setAppUpdates(List<AppUpdateDTO> list) {
        this.updates = list;
    }
}
