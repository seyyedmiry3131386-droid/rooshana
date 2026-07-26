package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import defpackage.b91;
import defpackage.fw7;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public final fw7 a = new fw7(0);
    public final b91 b = new b91(this);

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }
}
