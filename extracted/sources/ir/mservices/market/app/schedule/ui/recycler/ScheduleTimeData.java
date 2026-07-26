package ir.mservices.market.app.schedule.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleTimeData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_schedule_time;
    public final String a;
    public final String b;
    public final v48 c;
    public String d;

    public ScheduleTimeData(String str, String str2, v48 v48Var) {
        js3.p(str, "startTime");
        js3.p(str2, "endTime");
        js3.p(v48Var, "isEnable");
        this.a = str;
        this.b = str2;
        this.c = v48Var;
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
        if (obj == null || !ScheduleTimeData.class.equals(obj.getClass())) {
            return false;
        }
        ScheduleTimeData scheduleTimeData = (ScheduleTimeData) obj;
        return js3.i(this.a, scheduleTimeData.a) && js3.i(this.b, scheduleTimeData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
