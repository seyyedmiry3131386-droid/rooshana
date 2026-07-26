package ir.mservices.market.app.schedule.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ManageUpdateScheduleData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_manage_update_schedule;
    public v48 a;
    public String b;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ManageUpdateScheduleData.class.equals(obj.getClass())) {
            return false;
        }
        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) obj;
        if (((Boolean) this.a.getValue()).booleanValue() != ((Boolean) manageUpdateScheduleData.a.getValue()).booleanValue()) {
            return false;
        }
        return js3.i(this.b, manageUpdateScheduleData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
