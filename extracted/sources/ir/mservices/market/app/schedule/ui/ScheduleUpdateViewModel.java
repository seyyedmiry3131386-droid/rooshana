package ir.mservices.market.app.schedule.ui;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import defpackage.af7;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.e80;
import defpackage.ja1;
import defpackage.js3;
import defpackage.lu7;
import defpackage.mr7;
import defpackage.pr7;
import defpackage.pv6;
import defpackage.s7;
import defpackage.sk6;
import defpackage.t32;
import defpackage.vd7;
import defpackage.vy2;
import defpackage.w8;
import defpackage.wz5;
import defpackage.y97;
import defpackage.zc;
import ir.mservices.market.viewModel.c;
import java.util.Locale;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleUpdateViewModel extends c {
    public final pr7 t;
    public final af7 u;
    public final sk6 v;
    public String[] w;
    public final l x;
    public final i y;
    public final pv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleUpdateViewModel(pr7 pr7Var, af7 af7Var, sk6 sk6Var) {
        super(true);
        js3.p(pr7Var, "settingsManager");
        js3.p(af7Var, "scheduledDownloadManager");
        this.t = pr7Var;
        this.u = af7Var;
        this.v = sk6Var;
        this.w = new String[0];
        this.x = ja1.b(Boolean.valueOf(pr7Var.a.b(lu7.x0, false)));
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ScheduleUpdateViewModel$doRequest$1(this, null));
    }

    public final void r(int i, int i2) {
        pr7 pr7Var = this.u.c;
        mr7 mr7Var = (mr7) pr7Var.b.get();
        StringBuilder sb = new StringBuilder();
        lu7 lu7Var = pr7Var.a;
        String str = lu7.z;
        sb.append(lu7Var.f(str, "02:00"));
        sb.append(" _ ");
        lu7 lu7Var2 = pr7Var.a;
        String str2 = lu7.A;
        sb.append(lu7Var2.f(str2, "07:00"));
        mr7Var.b("SCHEDULED_DOWNLOAD_TIME", sb.toString(), i + " _ " + i2);
        lu7 lu7Var3 = pr7Var.a;
        Locale locale = Locale.US;
        lu7Var3.i(str, String.format(locale, "%02d:%02d", Long.valueOf((long) i), 0L));
        pr7Var.a.i(str2, String.format(locale, "%02d:%02d", Long.valueOf((long) i2), 0L));
    }

    public final void s(boolean z) {
        sk6 sk6Var = this.v;
        if (!dp3.c((Context) sk6Var.d)) {
            t32.b().g(new e80(5002));
            return;
        }
        if (!(Build.VERSION.SDK_INT >= 31 ? zc.a((AlarmManager) sk6Var.c) : true)) {
            bt2.G(y97.G(this), null, null, new ScheduleUpdateViewModel$updateScheduled$1(this, null), 3);
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        l lVar = this.x;
        lVar.getClass();
        lVar.p(null, boolValueOf);
        this.t.a.j(lu7.x0, z);
    }

    public final void t() {
        String[] strArr = this.w;
        pr7 pr7Var = this.t;
        String strF = pr7Var.a.f(lu7.z, "02:00");
        js3.o(strF, "getScheduledDownloadStartTime(...)");
        String str = strArr[s7.e0(strF)[0]];
        String[] strArr2 = this.w;
        String strF2 = pr7Var.a.f(lu7.A, "07:00");
        js3.o(strF2, "getScheduledDownloadStopTime(...)");
        g(new wz5(new vd7(10), new w8(str, strArr2[s7.e0(strF2)[0]], this, 9)));
    }
}
