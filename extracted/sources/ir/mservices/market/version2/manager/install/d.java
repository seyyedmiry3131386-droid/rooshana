package ir.mservices.market.version2.manager.install;

import android.content.Intent;
import defpackage.bt2;
import defpackage.dt2;
import defpackage.js3;
import defpackage.lu7;
import defpackage.lw;
import defpackage.t32;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.service.MyketPackageInstallerService;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public void onEvent(MyketPackageInstallerService.Message message) {
        t32.b().m(message);
        int i = message.b;
        e eVar = this.a;
        if (i != -1 || message.a.getExtras() == null) {
            e.b(eVar, message.b, message.c, message.d);
            return;
        }
        Intent intent = (Intent) dt2.p(message.a.getExtras(), "android.intent.extra.INTENT", Intent.class);
        if (intent == null) {
            lw.g(null, "ConfirmationIntent is Null!", null);
            e.b(eVar, 1, message.c, message.d);
            return;
        }
        LaunchContentActivity launchContentActivity = eVar.g;
        if (launchContentActivity == null) {
            lw.g(null, "MyketPackageInstaller failed in startConfirmIntent() activity is null!", null);
            eVar.i(4);
        } else {
            eVar.i = eVar.h;
            if (intent.resolveActivity(launchContentActivity.getPackageManager()) != null) {
                eVar.q = true;
                eVar.g.startActivityForResult(intent, 7878);
            } else {
                eVar.d.j(lu7.v0, false);
                lw.g(null, "MyketPackageInstaller failed in PENDING_USER_ACTION state ", "action: " + intent.getAction() + ", data: " + intent.getDataString());
                eVar.i(7);
            }
        }
        a aVar = eVar.b;
        String packageName = eVar.o.getPackageName();
        aVar.getClass();
        js3.p(packageName, "packageName");
        LinkedHashMap linkedHashMap = aVar.f;
        InstallQueue$InstallState installQueue$InstallState = InstallQueue$InstallState.c;
        linkedHashMap.put(packageName, installQueue$InstallState);
        bt2.G(js3.c(), null, null, new InstallQueue$setAppInProgress$1(aVar, packageName, null), 3);
        aVar.f(installQueue$InstallState, packageName);
    }
}
