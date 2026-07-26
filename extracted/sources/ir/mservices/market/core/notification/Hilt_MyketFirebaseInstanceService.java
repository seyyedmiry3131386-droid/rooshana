package ir.mservices.market.core.notification;

import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.br2;
import defpackage.co6;
import defpackage.go6;
import defpackage.me5;
import defpackage.mp7;
import defpackage.u91;
import defpackage.w91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MyketFirebaseInstanceService extends FirebaseMessagingService implements br2 {
    public volatile mp7 i;
    public final Object j = new Object();
    public boolean k = false;

    @Override // defpackage.br2
    public final Object e() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = new mp7(this);
                    }
                } finally {
                }
            }
        }
        return this.i.e();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.k) {
            this.k = true;
            MyketFirebaseInstanceService myketFirebaseInstanceService = (MyketFirebaseInstanceService) this;
            w91 w91Var = ((u91) ((me5) e())).a;
            myketFirebaseInstanceService.l = (co6) w91Var.x0.get();
            myketFirebaseInstanceService.m = (go6) w91Var.U0.get();
        }
        super.onCreate();
    }
}
