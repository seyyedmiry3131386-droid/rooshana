package ir.mservices.market.version2.manager.install;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.gson.reflect.TypeToken;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.dr1;
import defpackage.fp3;
import defpackage.fp5;
import defpackage.it5;
import defpackage.js3;
import defpackage.js8;
import defpackage.lu7;
import defpackage.lw;
import defpackage.lw8;
import defpackage.o40;
import defpackage.pv6;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t32;
import defpackage.vv2;
import defpackage.vy2;
import defpackage.yq6;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final i a;
    public final pv6 b;
    public lu7 c;
    public dr1 d;
    public final vv2 e;
    public final LinkedHashMap f;
    public final LinkedBlockingQueue g;
    public final ArrayList h;

    public a() {
        i iVarE = vy2.e(0, 7, null);
        this.a = iVarE;
        this.b = new pv6(iVarE);
        this.e = new vv2();
        this.f = new LinkedHashMap();
        this.g = new LinkedBlockingQueue();
        this.h = new ArrayList();
    }

    public final void a(PendingInstall pendingInstall) {
        sb7.p("AddDownload", "Check for adding app to queue", d(pendingInstall));
        LinkedBlockingQueue linkedBlockingQueue = this.g;
        if (linkedBlockingQueue.contains(pendingInstall)) {
            return;
        }
        sb7.p("AddDownload", "Check for adding app to queue - App added to queue", d(pendingInstall));
        linkedBlockingQueue.put(pendingInstall);
        sb7.p("AddDownload", "check for save app to cache", d(pendingInstall));
        List listC = c();
        if (listC.contains(pendingInstall)) {
            return;
        }
        listC.add(pendingInstall);
        lu7 lu7Var = this.c;
        if (lu7Var == null) {
            js3.V("sharedPreferencesProxy");
            throw null;
        }
        lu7Var.i(lu7.u0, this.e.g(listC, new InstallQueue$saveAppsToCache$1().getType()));
        sb7.p("AddDownload", "check for save app to cache - app added to cache", d(pendingInstall));
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.f;
        for (String str : linkedHashMap.keySet()) {
            bt2.G(js3.c(), null, null, new InstallQueue$removeAllInProgressApps$1$1(this, str, null), 3);
            t32.b().g(new fp3(str));
        }
        linkedHashMap.clear();
        sb7.p("AddDownload", "Clear queue", null);
        this.g.clear();
    }

    public final List c() {
        try {
            lu7 lu7Var = this.c;
            if (lu7Var == null) {
                js3.V("sharedPreferencesProxy");
                throw null;
            }
            String strF = lu7Var.f(lu7.u0, "");
            vv2 vv2Var = this.e;
            Type type = new TypeToken<List<? extends PendingInstall>>() { // from class: ir.mservices.market.version2.manager.install.InstallQueue$getAppsFromCache$1
            }.getType();
            vv2Var.getClass();
            List list = (List) vv2Var.b(strF, TypeToken.get(type));
            return list == null ? new ArrayList() : list;
        } catch (Exception e) {
            lw.g(e, "Could not load PendingInstall list from SharedPreferences", null);
            lu7 lu7Var2 = this.c;
            if (lu7Var2 == null) {
                js3.V("sharedPreferencesProxy");
                throw null;
            }
            lu7Var2.i(lu7.u0, "");
            sb7.p("MyketInstallQueue", "Clear PendingInstall list!", null);
            return new ArrayList();
        }
    }

    public final String d(PendingInstall pendingInstall) {
        dr1 dr1Var = this.d;
        if (dr1Var == null) {
            js3.V("installManager");
            throw null;
        }
        Integer numP = ((dp3) dr1Var.get()).p(pendingInstall.getPackageName());
        StringBuilder sbB = o40.B(pendingInstall.getVersionCode(), "PackageName: ", pendingInstall.getPackageName(), ", pendingVersionCode: ", ", installedVersionCode: ");
        sbB.append(numP);
        return sbB.toString();
    }

    public final int e() {
        return this.g.size();
    }

    public final void f(InstallQueue$InstallState installQueue$InstallState, String str) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ir.mservices.market.core.notification.a aVar = (ir.mservices.market.core.notification.a) ((it5) it.next());
            NotificationManager notificationManager = aVar.a;
            Context context = aVar.i;
            HashMap map = aVar.d;
            if (installQueue$InstallState == InstallQueue$InstallState.c) {
                map.remove(str);
                AppDownloadInfo appDownloadInfoI = aVar.o.i(str, null);
                if (appDownloadInfoI != null) {
                    Intent intent = new Intent(context, (Class<?>) LaunchContentActivity.class);
                    intent.setAction("ir.mservices.market.ACTION_INSTALLING_LIST");
                    intent.putExtra("packageName", str);
                    intent.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", 110);
                    intent.addFlags(67108864);
                    Object obj = lw8.b;
                    PendingIntent activity2 = PendingIntent.getActivity(context, 110, intent, js8.i(134217728, false));
                    fp5 fp5Var = new fp5(context, "download");
                    fp5Var.f(100, true);
                    fp5Var.d(2, true);
                    fp5Var.d(16, true);
                    ir.mservices.market.core.notification.a.o(fp5Var, context.getResources().getString(rs6.notification_install_progress, appDownloadInfoI.getTitle()), "");
                    int i = yq6.notif_app_icon;
                    Notification notification = fp5Var.y;
                    notification.icon = i;
                    notification.when = System.currentTimeMillis();
                    fp5Var.g = activity2;
                    fp5Var.t = sj8.b().M;
                    Notification notificationB = fp5Var.b();
                    notificationB.flags |= 16;
                    notificationManager.notify(12, notificationB);
                }
                if (map.size() > 0) {
                    aVar.f();
                } else {
                    notificationManager.cancel(2);
                }
            }
        }
    }

    public final void g(PendingInstall pendingInstall) {
        Object next;
        js3.p(pendingInstall, "pi");
        sb7.p("AddDownload", "check for remove app to cache", d(pendingInstall));
        List listC = c();
        Iterator it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (js3.i(((PendingInstall) next).getPackageName(), pendingInstall.getPackageName())) {
                    break;
                }
            }
        }
        PendingInstall pendingInstall2 = (PendingInstall) next;
        if (pendingInstall2 != null) {
            sb7.p("AddDownload", "check for remove app to cache - check for retry count", d(pendingInstall) + ", retryCount(before): " + pendingInstall2.getInstallRetryCount());
            pendingInstall2.setInstallRetryCount(pendingInstall2.getInstallRetryCount() + 1);
            if (pendingInstall2.getInstallRetryCount() > 1) {
                sb7.p("AddDownload", "check for remove app to cache - remove app", d(pendingInstall) + ", retryCount(after): " + pendingInstall2.getInstallRetryCount());
                listC.remove(pendingInstall);
            }
            lu7 lu7Var = this.c;
            if (lu7Var == null) {
                js3.V("sharedPreferencesProxy");
                throw null;
            }
            lu7Var.i(lu7.u0, this.e.g(listC, new InstallQueue$saveAppsToCache$1().getType()));
        }
    }

    public final void h(String str) {
        js3.p(str, "packageName");
        this.f.remove(str);
        bt2.G(js3.c(), null, null, new InstallQueue$removeAppInProgress$1(this, str, null), 3);
        t32.b().g(new fp3(str));
    }

    public final void i(String str) {
        js3.p(str, "packageName");
        this.f.put(str, InstallQueue$InstallState.b);
        bt2.G(js3.c(), null, null, new InstallQueue$setAppInQueue$1(this, str, null), 3);
        t32.b().g(new fp3(str));
    }

    public final PendingInstall j() {
        PendingInstall pendingInstall = (PendingInstall) this.g.take();
        js3.m(pendingInstall);
        sb7.p("AddDownload", "Take from queue", d(pendingInstall));
        return pendingInstall;
    }
}
