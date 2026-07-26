package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.version2.manager.install.a;

/* JADX INFO: loaded from: classes3.dex */
public final class if1 implements f64 {
    public dp3 a;
    public a b;
    public bp3 c;
    public LaunchContentActivity d;
    public PendingInstall e;
    public ht5 f;

    @jt5(Lifecycle$Event.ON_DESTROY)
    private void onDestroy() {
        this.d.a.f(this);
        this.d = null;
        this.f = null;
        if (this.e != null) {
            this.e = null;
        }
    }

    public final void a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 9:
                ((zo3) this.f).f(i, this.e);
                break;
            case 3:
            case 8:
                ((zo3) this.f).f(8, this.e);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                if (this.a.J(this.e.getVersionCode(), this.e.getPackageName())) {
                    if (new mq5(this.d, this.e, i).a(22999)) {
                    }
                }
                ((zo3) this.f).f(i, this.e);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(defpackage.f60 r20) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if1.onEvent(f60):void");
    }
}
