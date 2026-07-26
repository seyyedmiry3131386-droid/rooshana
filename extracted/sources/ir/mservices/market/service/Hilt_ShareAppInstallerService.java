package ir.mservices.market.service;

import android.app.Service;
import defpackage.br2;
import defpackage.mp7;
import defpackage.pt7;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ShareAppInstallerService extends Service implements br2 {
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
            ((u91) ((pt7) e())).a.m0();
        }
        super.onCreate();
    }
}
