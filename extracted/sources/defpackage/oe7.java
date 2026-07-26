package defpackage;

import ir.mservices.market.app.schedule.ui.recycler.ManageUpdateScheduleData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTipData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeData;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class oe7 extends c16 {
    public final v48 c;
    public final String[] d;
    public final int e;
    public final pr7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe7(v48 v48Var, String[] strArr, int i) {
        super(1);
        js3.p(v48Var, "isScheduleEnableFlow");
        js3.p(strArr, "scheduleTimeArray");
        this.c = v48Var;
        this.d = strArr;
        this.e = i;
        this.f = (pr7) ((w91) ApplicationLauncher.o.b()).s.get();
    }

    @Override // defpackage.c16
    public final Object d() {
        pr7 pr7Var = this.f;
        if (pr7Var == null) {
            js3.V("settingsManager");
            throw null;
        }
        String strF = pr7Var.a.f(lu7.z, "02:00");
        js3.o(strF, "getScheduledDownloadStartTime(...)");
        int i = s7.e0(strF)[0];
        String[] strArr = this.d;
        String str = strArr[i];
        pr7 pr7Var2 = this.f;
        if (pr7Var2 == null) {
            js3.V("settingsManager");
            throw null;
        }
        String strF2 = pr7Var2.a.f(lu7.A, "07:00");
        js3.o(strF2, "getScheduledDownloadStopTime(...)");
        String str2 = strArr[s7.e0(strF2)[0]];
        ArrayList arrayList = new ArrayList();
        v48 v48Var = this.c;
        js3.p(v48Var, "isActive");
        ManageUpdateScheduleData manageUpdateScheduleData = new ManageUpdateScheduleData();
        manageUpdateScheduleData.a = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        manageUpdateScheduleData.b = String.valueOf(j);
        arrayList.add(manageUpdateScheduleData);
        arrayList.add(new ScheduleTimeData(str, str2, v48Var));
        pr7 pr7Var3 = this.f;
        if (pr7Var3 == null) {
            js3.V("settingsManager");
            throw null;
        }
        arrayList.add(new ScheduleTypeData(v48Var, pr7Var3.d(), this.e));
        arrayList.add(new ScheduleTipData(v48Var));
        return new ne7(arrayList);
    }
}
