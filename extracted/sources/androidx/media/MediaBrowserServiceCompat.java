package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.am4;
import defpackage.ck4;
import defpackage.cm4;
import defpackage.hd;
import defpackage.js3;
import defpackage.rb4;
import defpackage.ul4;
import defpackage.wl4;
import defpackage.wv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public rb4 a;
    public final ck4 b = new ck4(1, this);
    public final ul4 c = new ul4(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList d = new ArrayList();
    public final wv e = new wv(0);
    public final hd f;

    public MediaBrowserServiceCompat() {
        hd hdVar = new hd(6);
        hdVar.b = this;
        this.f = hdVar;
    }

    public abstract js3 a();

    public abstract void b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((wl4) this.a.b).onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a = new cm4(this);
        } else if (i >= 26) {
            this.a = new am4(this);
        } else {
            this.a = new rb4(this);
        }
        this.a.G();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f.b = null;
    }
}
