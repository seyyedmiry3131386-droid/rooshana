package defpackage;

import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.version2.manager.install.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gp3 {
    public dp3 a;
    public a b;
    public boolean c;

    public final String a(PendingInstall pendingInstall) {
        return "PackageName: " + pendingInstall.getPackageName() + ", pendingVersionCode: " + pendingInstall.getVersionCode() + ", installedVersionCode: " + this.a.p(pendingInstall.getPackageName());
    }
}
