package androidx.media3.session.legacy;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import defpackage.bm4;
import defpackage.ca7;
import defpackage.dm4;
import defpackage.hd;
import defpackage.qm5;
import defpackage.rb4;
import defpackage.tl4;
import defpackage.wl4;
import defpackage.wv;
import defpackage.zl4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final /* synthetic */ int i = 0;
    public rb4 a;
    public final ca7 b = new ca7(29, this);
    public final tl4 c = new tl4(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList d = new ArrayList();
    public final wv e = new wv(0);
    public tl4 f;
    public final hd g;
    public MediaSessionCompat$Token h;

    public MediaBrowserServiceCompat() {
        hd hdVar = new hd(5);
        hdVar.b = this;
        this.g = hdVar;
    }

    public abstract qm5 a(Bundle bundle);

    public abstract void b(dm4 dm4Var);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        rb4 rb4Var = this.a;
        rb4Var.getClass();
        wl4 wl4Var = (wl4) rb4Var.b;
        wl4Var.getClass();
        return wl4Var.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.a = new bm4(this);
        } else if (i2 >= 26) {
            this.a = new zl4(this);
        } else {
            this.a = new rb4(this);
        }
        this.a.G();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.b = null;
    }
}
