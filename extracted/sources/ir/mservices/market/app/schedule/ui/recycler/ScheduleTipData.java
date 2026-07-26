package ir.mservices.market.app.schedule.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleTipData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_schedule_tip;
    public final v48 a;
    public final String b;

    public ScheduleTipData(v48 v48Var) {
        js3.p(v48Var, "isEnable");
        this.a = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

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
        if (obj == null || !ScheduleTipData.class.equals(obj.getClass())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
