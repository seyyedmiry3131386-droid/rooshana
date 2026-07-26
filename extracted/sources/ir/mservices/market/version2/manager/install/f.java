package ir.mservices.market.version2.manager.install;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Build;
import defpackage.a27;
import defpackage.bs1;
import defpackage.bt2;
import defpackage.c24;
import defpackage.dr1;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eq;
import defpackage.es1;
import defpackage.fw4;
import defpackage.hx0;
import defpackage.js3;
import defpackage.kf1;
import defpackage.nr1;
import defpackage.o06;
import defpackage.ps1;
import defpackage.sb7;
import defpackage.sg4;
import defpackage.ti6;
import defpackage.tv8;
import defpackage.tx8;
import defpackage.ub8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.wu8;
import defpackage.zb2;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements nr1 {
    public final Context a;
    public final ps1 b;
    public final dr1 c;
    public final dr1 d;
    public final a e;
    public final fw4 f;
    public final dr1 g;
    public final ti6 h;
    public final dr1 i;
    public final kotlinx.coroutines.channels.a j;
    public hx0 k;
    public final c24 l;
    public final LinkedHashMap m;

    public f(Context context, ps1 ps1Var, dr1 dr1Var, dr1 dr1Var2, a aVar, fw4 fw4Var, dr1 dr1Var3, ti6 ti6Var, dr1 dr1Var4) {
        Object objA;
        js3.p(ps1Var, "downloadManager");
        js3.p(dr1Var, "appManager");
        js3.p(dr1Var2, "installManager");
        js3.p(aVar, "installQueue");
        js3.p(fw4Var, "miuiUtils");
        js3.p(dr1Var3, "notificationController");
        js3.p(ti6Var, "preapprovalService");
        js3.p(dr1Var4, "appUpdateRepository");
        this.a = context;
        this.b = ps1Var;
        this.c = dr1Var;
        this.d = dr1Var2;
        this.e = aVar;
        this.f = fw4Var;
        this.g = dr1Var3;
        this.h = ti6Var;
        this.i = dr1Var4;
        this.j = dt2.b(Integer.MAX_VALUE, 6, null);
        try {
            List<PackageInstaller.SessionInfo> mySessions = d().getMySessions();
            js3.o(mySessions, "getMySessions(...)");
            for (PackageInstaller.SessionInfo sessionInfo : mySessions) {
                if (!this.m.containsKey(sessionInfo.getAppPackageName())) {
                    d().abandonSession(sessionInfo.getSessionId());
                }
            }
            objA = tx8.a;
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            thA.getMessage();
        }
        this.b.u(this);
        ub8 ub8VarA = a27.a();
        ug1 ug1Var = up1.a;
        bt2.G(js3.a(bt2.L(ub8VarA, sg4.a)), null, null, new PreapprovalManager$1(this, null), 3);
        this.l = kotlin.a.a(new o06(8, this));
        this.m = new LinkedHashMap();
    }

    public static final void a(f fVar, File file, PackageInstaller.Session session) throws IOException {
        FileInputStream fileInputStreamJ;
        byte[] bArr;
        OutputStream outputStreamOpenWrite = session.openWrite(file.getName(), 0L, file.length());
        try {
            fileInputStreamJ = zb2.j(file);
            try {
                bArr = new byte[16384];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i = fileInputStreamJ.read(bArr);
            if (i < 0) {
                session.fsync(outputStreamOpenWrite);
                fileInputStreamJ.close();
                tv8.h(outputStreamOpenWrite, null);
                return;
            }
            outputStreamOpenWrite.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ir.mservices.market.version2.manager.install.f r23, defpackage.ri6 r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.f.b(ir.mservices.market.version2.manager.install.f, ri6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean c(int i) {
        PackageInstaller.SessionInfo sessionInfo;
        return Build.VERSION.SDK_INT >= 34 && (sessionInfo = d().getSessionInfo(i)) != null && sessionInfo.isPreApprovalRequested();
    }

    public final PackageInstaller d() {
        return (PackageInstaller) this.l.getValue();
    }

    public final PackageInstaller.SessionParams e(String str) {
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        sb7.p("PreapprovalManager", "getSessionParams() for packageName=" + str, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            this.f.getClass();
            if (!fw4.e()) {
                sb7.p("PreapprovalManager", "(USER_ACTION_NOT_REQUIRED) packageName=" + str, null);
                sessionParams.setRequireUserAction(2);
            } else if (!fw4.e() || fw4.d()) {
                sb7.p("PreapprovalManager", dw1.o("(USER_ACTION_REQUIRED) packageName=", str, ", miui=", fw4.a()), null);
                sessionParams.setRequireUserAction(1);
            } else {
                sb7.p("PreapprovalManager", dw1.o("(USER_ACTION_REQUIRED) packageName=", str, ", miui=", fw4.a()), null);
                sessionParams.setRequireUserAction(2);
            }
            if (i >= 34) {
                sessionParams.setRequestUpdateOwnership(true);
            }
            sessionParams.setInstallScenario(1);
        }
        sessionParams.setAppPackageName(str);
        sessionParams.setInstallLocation(0);
        return sessionParams;
    }

    public final void f(PendingInstall pendingInstall, AppDownloadInfo appDownloadInfo) {
        ub8 ub8VarA = a27.a();
        ug1 ug1Var = up1.a;
        bt2.G(js3.a(bt2.L(ub8VarA, kf1.c)), null, null, new PreapprovalManager$installApk$1(pendingInstall, appDownloadInfo, this, null), 3);
    }

    public final boolean g(String str) {
        js3.p(str, "packageName");
        return this.m.get(str) != null;
    }

    public final void h(String str) {
        Object objA;
        Object next;
        LinkedHashMap linkedHashMap = this.m;
        try {
            List<PackageInstaller.SessionInfo> mySessions = d().getMySessions();
            js3.o(mySessions, "getMySessions(...)");
            Iterator<T> it = mySessions.iterator();
            while (true) {
                objA = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (js3.i(((PackageInstaller.SessionInfo) next).getAppPackageName(), str)) {
                        break;
                    }
                }
            }
            PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) next;
            if (sessionInfo != null) {
                int sessionId = sessionInfo.getSessionId();
                Pair pair = (Pair) linkedHashMap.get(str);
                if (pair != null && sessionId == ((Number) pair.a).intValue()) {
                    d().abandonSession(sessionId);
                }
                objA = tx8.a;
            }
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            thA.getMessage();
        }
        wu8.h(linkedHashMap).remove(str);
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        Integer numValueOf = es1Var != null ? Integer.valueOf(es1Var.f) : null;
        if ((numValueOf != null && numValueOf.intValue() == 150) || ((numValueOf != null && numValueOf.intValue() == 120) || (numValueOf != null && numValueOf.intValue() == 130))) {
            h(eq.q(es1Var));
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }
}
