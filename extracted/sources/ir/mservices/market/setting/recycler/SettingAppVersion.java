package ir.mservices.market.setting.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingAppVersion extends SettingData implements g32 {
    public static final int d = js6.setting_app_version;
    public final String b;
    public final String c;

    public SettingAppVersion() {
        super("SETTING_APP_VERSION");
        this.b = "10.2.8";
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !SettingAppVersion.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.c, ((SettingAppVersion) obj).c);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hash(this.c);
    }
}
