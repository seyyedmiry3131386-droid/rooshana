package ir.mservices.market.app.schedule.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleTypeData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_schedule_type;
    public final v48 a;
    public final boolean b;
    public final int c;
    public String d;

    public ScheduleTypeData(v48 v48Var, boolean z, int i) {
        js3.p(v48Var, "isEnable");
        this.a = v48Var;
        this.b = z;
        this.c = i;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ScheduleTypeData.class.equals(obj.getClass())) {
            return false;
        }
        ScheduleTypeData scheduleTypeData = (ScheduleTypeData) obj;
        return this.b == scheduleTypeData.b && this.c == scheduleTypeData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
