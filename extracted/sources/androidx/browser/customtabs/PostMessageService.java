package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.mg3;
import defpackage.ni6;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    public final ni6 a;

    public PostMessageService() {
        ni6 ni6Var = new ni6();
        ni6Var.attachInterface(ni6Var, mg3.h);
        this.a = ni6Var;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
