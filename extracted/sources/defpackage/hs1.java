package defpackage;

import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class hs1 {
    public final ps1 a;
    public final a b;

    public hs1(ps1 ps1Var, a aVar) {
        js3.p(ps1Var, "downloadManager");
        js3.p(aVar, "appManager");
        this.a = ps1Var;
        this.b = aVar;
    }

    public final void a() {
        AppDownloadFlowStatus appDownloadFlowStatus;
        a aVar;
        ps1 ps1Var = this.a;
        HashMap mapH = ps1Var.h();
        xl5 xl5Var = ps1Var.b;
        Iterator it = mapH.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            appDownloadFlowStatus = AppDownloadFlowStatus.g;
            aVar = this.b;
            if (!zHasNext) {
                break;
            }
            AppDownloadInfo appDownloadInfo = (AppDownloadInfo) it.next();
            js3.m(appDownloadInfo);
            if (aVar.c(appDownloadInfo) == appDownloadFlowStatus && appDownloadInfo.getStatus() != 150) {
                lw.d(null, null, appDownloadInfo);
                appDownloadInfo.cancelDownload(xl5Var);
            }
        }
        for (AppDownloadInfo appDownloadInfo2 : ps1Var.h().values()) {
            js3.m(appDownloadInfo2);
            AppDownloadFlowStatus appDownloadFlowStatusC = aVar.c(appDownloadInfo2);
            long databaseTimestamp = appDownloadInfo2.getDatabaseTimestamp();
            TimeUnit timeUnit = TimeUnit.DAYS;
            js3.p(timeUnit, "unit");
            boolean z = System.currentTimeMillis() - databaseTimestamp >= timeUnit.toMillis((long) 1);
            long databaseTimestamp2 = appDownloadInfo2.getDatabaseTimestamp();
            js3.p(timeUnit, "unit");
            long jCurrentTimeMillis = System.currentTimeMillis() - databaseTimestamp2;
            long millis = timeUnit.toMillis(30);
            AppDownloadFlowStatus appDownloadFlowStatus2 = AppDownloadFlowStatus.d;
            if (jCurrentTimeMillis >= millis && appDownloadFlowStatusC != appDownloadFlowStatus2) {
                lw.d(null, null, appDownloadInfo2);
                appDownloadInfo2.removeDownload(xl5Var);
            } else if (z) {
                if (appDownloadFlowStatusC == appDownloadFlowStatus) {
                    lw.d(null, null, appDownloadInfo2);
                    appDownloadInfo2.removeDownload(xl5Var);
                } else if (appDownloadFlowStatusC != appDownloadFlowStatus2 && appDownloadInfo2.getPercent() <= 0) {
                    lw.d(null, null, appDownloadInfo2);
                    appDownloadInfo2.removeDownload(xl5Var);
                } else if (appDownloadInfo2.getStatus() == 150) {
                    lw.d(null, null, appDownloadInfo2);
                    appDownloadInfo2.removeDownload(xl5Var);
                }
            }
        }
    }
}
