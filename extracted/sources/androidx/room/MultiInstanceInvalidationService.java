package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.js3;
import defpackage.m95;
import defpackage.n95;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final n95 c = new n95(this);
    public final m95 d = new m95(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        js3.p(intent, "intent");
        return this.d;
    }
}
