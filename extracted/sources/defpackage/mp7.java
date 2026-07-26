package defpackage;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes3.dex */
public final class mp7 implements br2 {
    public final Service a;
    public u91 b;

    public mp7(Service service) {
        this.a = service;
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            y97.q(application instanceof br2, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.b = new u91(((w91) ((lp7) rq4.x(lp7.class, application))).e);
        }
        return this.b;
    }
}
