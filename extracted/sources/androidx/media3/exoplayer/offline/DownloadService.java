package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.dw1;
import defpackage.zk8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownloadService extends Service {
    public static final HashMap a = new HashMap();

    public abstract zk8 a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        dw1.x(a.get(getClass()));
        a();
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        }
        throw null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
