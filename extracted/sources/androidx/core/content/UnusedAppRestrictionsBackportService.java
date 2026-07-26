package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.yy8;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public final yy8 a = new yy8(this);

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
