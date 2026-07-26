package ir.mservices.market.version2.manager.install;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.os.Build;
import androidx.lifecycle.Lifecycle$Event;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.f60;
import defpackage.fw4;
import defpackage.g60;
import defpackage.ht5;
import defpackage.ip3;
import defpackage.js3;
import defpackage.jt5;
import defpackage.lu7;
import defpackage.lw;
import defpackage.mq5;
import defpackage.mx;
import defpackage.ps1;
import defpackage.sb7;
import defpackage.t32;
import defpackage.w91;
import defpackage.ye5;
import defpackage.ze5;
import defpackage.zo3;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ye5 {
    public final ps1 a;
    public final a b;
    public final dp3 c;
    public final lu7 d;
    public final fw4 e;
    public final f f;
    public LaunchContentActivity g;
    public float h;
    public float i;
    public PackageInstaller j;
    public MyketPackageInstallerImpl21$ActivityState k;
    public PackageInstaller.Session l;
    public IntentSender m;
    public PendingInstall o;
    public ht5 p;
    public mx s;
    public int n = -1;
    public boolean q = false;
    public final d r = new d(this);

    public e(t32 t32Var) {
        t32Var.l(this, false);
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.a = (ps1) w91Var.w.get();
        this.b = (a) w91Var.x.get();
        this.c = (dp3) w91Var.v.get();
        this.d = (lu7) w91Var.h.get();
        this.e = (fw4) w91Var.M.get();
        this.f = (f) w91Var.c0.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(ir.mservices.market.version2.manager.install.e r6, java.io.File r7, android.content.pm.PackageInstaller.Session r8) throws java.io.IOException {
        /*
            java.lang.String r1 = r7.getName()
            r2 = 0
            long r4 = r7.length()
            r0 = r8
            java.io.OutputStream r6 = r0.openWrite(r1, r2, r4)
            java.io.FileInputStream r7 = defpackage.zb2.j(r7)     // Catch: java.lang.Throwable -> L31
            r8 = 16384(0x4000, float:2.2959E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L22
        L17:
            int r1 = r7.read(r8)     // Catch: java.lang.Throwable -> L22
            if (r1 < 0) goto L25
            r2 = 0
            r6.write(r8, r2, r1)     // Catch: java.lang.Throwable -> L22
            goto L17
        L22:
            r0 = move-exception
            r8 = r0
            goto L34
        L25:
            r0.fsync(r6)     // Catch: java.lang.Throwable -> L22
            r7.close()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L30
            r6.close()
        L30:
            return
        L31:
            r0 = move-exception
            r7 = r0
            goto L3e
        L34:
            r7.close()     // Catch: java.lang.Throwable -> L38
            goto L3d
        L38:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L31
        L3d:
            throw r8     // Catch: java.lang.Throwable -> L31
        L3e:
            if (r6 == 0) goto L49
            r6.close()     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r0 = move-exception
            r6 = r0
            r7.addSuppressed(r6)
        L49:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.e.a(ir.mservices.market.version2.manager.install.e, java.io.File, android.content.pm.PackageInstaller$Session):void");
    }

    public static void b(e eVar, int i, String str, int i2) {
        int i3 = eVar.n;
        if (i3 == -1 || i3 != i2) {
            sb7.p("Installer", "PackageInstaller - checkResult, result is for previous active install", null);
            return;
        }
        sb7.p("Installer", "PackageInstaller - checkResult", "status=" + i + "packageName=" + str + "sessionId=" + i2);
        switch (i) {
            case 0:
                if (eVar.g != null && eVar.o != null) {
                    t32.b().o(eVar.r);
                    try {
                        eVar.g.getPackageManager().setInstallerPackageName(dp3.y(eVar.o.getPackageName()), NearbyRepository.SERVICE_ID);
                        break;
                    } catch (Exception unused) {
                    }
                    int i4 = ze5.a[eVar.o.getPostInstall().ordinal()];
                    int i5 = 1;
                    if (i4 != 1) {
                        i5 = 2;
                        if (i4 != 2) {
                            i5 = 3;
                            if (i4 == 3) {
                                i5 = 9;
                            } else if (i4 == 4) {
                                lw.g(null, "MyketPackageInstaller handleOnActivityResult() Default PostInstall is illegal", null);
                            }
                        }
                    }
                    eVar.f(i5, eVar.o);
                    eVar.d(eVar.o.getPackageName());
                    break;
                }
                break;
            case 1:
            case 2:
                eVar.i(4);
                break;
            case 3:
                eVar.h();
                break;
            case 4:
            case 7:
                eVar.i(7);
                break;
            case 5:
                eVar.i(5);
                break;
            case 6:
                eVar.i(6);
                break;
            default:
                eVar.i(4);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.pm.PackageInstaller.SessionParams c(ir.mservices.market.version2.manager.install.e r9, java.lang.String r10) {
        /*
            android.content.pm.PackageInstaller$SessionParams r0 = new android.content.pm.PackageInstaller$SessionParams
            r1 = 1
            r0.<init>(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getSessionParams() for packageName="
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MyketPackageInstaller"
            r4 = 0
            defpackage.sb7.p(r3, r2, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r2 < r5) goto L9a
            fw4 r5 = r9.e
            r5.getClass()
            boolean r5 = defpackage.fw4.e()
            r6 = 2
            if (r5 != 0) goto L41
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r5 = "(USER_ACTION_NOT_REQUIRED) packageName="
            r9.<init>(r5)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            defpackage.sb7.p(r3, r9, r4)
            r0.setRequireUserAction(r6)
            goto L90
        L41:
            fw4 r5 = r9.e
            r5.getClass()
            boolean r5 = defpackage.fw4.e()
            java.lang.String r7 = ", miui="
            java.lang.String r8 = "(USER_ACTION_REQUIRED) packageName="
            if (r5 == 0) goto L76
            fw4 r5 = r9.e
            r5.getClass()
            boolean r5 = defpackage.fw4.d()
            if (r5 != 0) goto L76
            java.lang.StringBuilder r5 = defpackage.t61.n(r8, r10, r7)
            fw4 r9 = r9.e
            r9.getClass()
            java.lang.String r9 = defpackage.fw4.a()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            defpackage.sb7.p(r3, r9, r4)
            r0.setRequireUserAction(r6)
            goto L90
        L76:
            java.lang.StringBuilder r5 = defpackage.t61.n(r8, r10, r7)
            fw4 r9 = r9.e
            r9.getClass()
            java.lang.String r9 = defpackage.fw4.a()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            defpackage.sb7.p(r3, r9, r4)
            r0.setRequireUserAction(r1)
        L90:
            r9 = 34
            if (r2 < r9) goto L97
            r0.setRequestUpdateOwnership(r1)
        L97:
            r0.setInstallScenario(r1)
        L9a:
            r0.setAppPackageName(r10)
            r9 = 0
            r0.setInstallLocation(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.e.c(ir.mservices.market.version2.manager.install.e, java.lang.String):android.content.pm.PackageInstaller$SessionParams");
    }

    @jt5(Lifecycle$Event.ON_DESTROY)
    private void onDestroy() {
        PendingInstall pendingInstall = this.o;
        if (pendingInstall != null) {
            d(pendingInstall.getPackageName());
            this.o = null;
        }
        mx mxVar = this.s;
        if (mxVar != null) {
            mxVar.d.set(true);
            mxVar.b.cancel(true);
            this.s = null;
        }
        t32.b().o(this.r);
        this.g.a.f(this);
        this.n = -1;
        this.l = null;
        this.g = null;
        this.j = null;
    }

    public final void d(String str) {
        this.b.h(dp3.w(str));
        this.b.h(str.replace(".m.m.free", ""));
        this.n = -1;
    }

    public final void e(PendingInstall pendingInstall) {
        boolean zContainsKey;
        d dVar = this.r;
        t32 t32VarB = t32.b();
        synchronized (t32VarB) {
            zContainsKey = t32VarB.b.containsKey(dVar);
        }
        if (zContainsKey) {
            lw.g(null, "MyketPackageInstaller: illegalState, EventBus was registered", null);
        } else {
            t32.b().l(dVar, true);
        }
        lw.d(null, null, pendingInstall);
        this.o = pendingInstall;
        this.b.g(pendingInstall);
        a aVar = this.b;
        String packageName = pendingInstall.getPackageName();
        aVar.getClass();
        js3.p(packageName, "packageName");
        LinkedHashMap linkedHashMap = aVar.f;
        InstallQueue$InstallState installQueue$InstallState = InstallQueue$InstallState.a;
        linkedHashMap.put(packageName, installQueue$InstallState);
        bt2.G(js3.c(), null, null, new InstallQueue$setAppInPreProcess$1(aVar, packageName, null), 3);
        aVar.f(installQueue$InstallState, packageName);
        AppDownloadInfo appDownloadInfoI = this.a.i(pendingInstall.getPackageName(), Integer.valueOf(pendingInstall.getVersionCode()));
        if (appDownloadInfoI == null || !appDownloadInfoI.isDownloadSplit()) {
            if (this.s == null) {
                c cVar = new c(this, pendingInstall);
                cVar.b(pendingInstall);
                this.s = cVar;
            }
        } else if (this.s == null) {
            b bVar = new b(this, pendingInstall);
            bVar.b(pendingInstall);
            this.s = bVar;
        }
        this.j.registerSessionCallback(new ip3(1, this));
    }

    public final void f(int i, PendingInstall pendingInstall) {
        lw.d(null, null, this.o);
        switch (i) {
            case 1:
            case 2:
            case 9:
                ((zo3) this.p).f(i, this.o);
                break;
            case 3:
            case 8:
                ((zo3) this.p).f(i, this.o);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                String packageName = pendingInstall.getPackageName();
                if (!this.c.J(pendingInstall.getVersionCode(), packageName) || !new mq5(this.g, pendingInstall, i).a(11999)) {
                    ((zo3) this.p).f(i, this.o);
                }
                break;
        }
    }

    public final void h() {
        if (this.g == null || this.o == null) {
            return;
        }
        t32.b().o(this.r);
        d(this.o.getPackageName());
        ((zo3) this.p).f(8, this.o);
    }

    public final void i(int i) {
        if (this.g == null || this.o == null) {
            return;
        }
        t32.b().o(this.r);
        f(i, this.o);
        d(this.o.getPackageName());
    }

    public void onEvent(f60 f60Var) {
        PackageInstaller.SessionInfo next;
        int i = f60Var.a;
        if (i != 7878) {
            if (i == 11999) {
                Intent intent = f60Var.c;
                int intExtra = 4;
                if (intent != null && intent.hasExtra("INSTALLATION_RESULT_MESSAGE")) {
                    intExtra = intent.getIntExtra("INSTALLATION_RESULT_MESSAGE", 4);
                }
                ((zo3) this.p).f(intExtra, this.o);
                return;
            }
            return;
        }
        int i2 = f60Var.b;
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 29 && this.o != null) {
                int i3 = this.n;
                Iterator<PackageInstaller.SessionInfo> it = this.j.getMySessions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (next.getSessionId() == i3) {
                            break;
                        }
                    }
                }
                if (next != null && this.i >= next.getProgress()) {
                    h();
                }
            } else if (!dp3.c(this.g)) {
                this.b.b();
                h();
            }
        } else if (i2 == 1) {
            h();
        }
        this.q = false;
    }

    @jt5(Lifecycle$Event.ON_PAUSE)
    public void onPause() {
        this.k = MyketPackageInstallerImpl21$ActivityState.a;
    }

    @jt5(Lifecycle$Event.ON_RESUME)
    public void onResume() {
        IntentSender intentSender;
        this.k = MyketPackageInstallerImpl21$ActivityState.b;
        PackageInstaller.Session session = this.l;
        if (session == null || (intentSender = this.m) == null) {
            return;
        }
        try {
            session.commit(intentSender);
            this.l = null;
            this.m = null;
        } catch (Exception e) {
            lw.g(e, "MyketPackageInstaller.checkPackageInstaller() commit session failed!", null);
            i(4);
        }
    }

    public void onEvent(g60 g60Var) {
        if (this.q) {
            PendingInstall pendingInstall = this.o;
            if (pendingInstall != null) {
                d(pendingInstall.getPackageName());
            }
            t32.b().o(this.r);
            ((zo3) this.p).f(8, this.o);
        }
    }
}
