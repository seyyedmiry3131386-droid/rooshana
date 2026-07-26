package defpackage;

import android.app.Service;
import ir.mservices.market.service.MyketPackageInstallerService;
import ir.mservices.market.version2.manager.install.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jz2 extends Service implements br2 {
    public volatile mp7 a;
    public final Object b = new Object();
    public boolean c = false;

    @Override // defpackage.br2
    public final Object e() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new mp7(this);
                    }
                } finally {
                }
            }
        }
        return this.a.e();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            MyketPackageInstallerService myketPackageInstallerService = (MyketPackageInstallerService) this;
            w91 w91Var = ((u91) ((af5) e())).a;
            myketPackageInstallerService.d = (bp3) w91Var.d1.get();
            myketPackageInstallerService.e = (dp3) w91Var.v.get();
            myketPackageInstallerService.f = (fw4) w91Var.M.get();
            myketPackageInstallerService.g = (f) w91Var.c0.get();
        }
        super.onCreate();
    }
}
