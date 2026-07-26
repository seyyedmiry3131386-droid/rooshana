package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fm4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fm4(Object obj, Object obj2, int i, String str, int i2, Bundle bundle, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = obj2;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ul4 ul4Var;
        tl4 tl4Var;
        switch (this.a) {
            case 0:
                nm5 nm5Var = (nm5) this.b;
                Messenger messenger = (Messenger) nm5Var.b;
                IBinder binder = messenger.getBinder();
                ck4 ck4Var = (ck4) this.f;
                ((MediaBrowserServiceCompat) ck4Var.b).e.remove(binder);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) ck4Var.b;
                int i = this.c;
                int i2 = this.e;
                String str = this.d;
                ul4 ul4Var2 = new ul4(mediaBrowserServiceCompat, str, i, i2, nm5Var);
                if (mediaBrowserServiceCompat.a() == null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.arg1 = 2;
                        messageObtain.setData(null);
                        messenger.send(messageObtain);
                    } catch (RemoteException unused) {
                        t0.m("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                        return;
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat.e.put(binder, ul4Var2);
                        binder.linkToDeath(ul4Var2, 0);
                    } catch (RemoteException unused2) {
                        t0.m("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
                        mediaBrowserServiceCompat.e.remove(binder);
                        return;
                    }
                }
                break;
            case 1:
                nm5 nm5Var2 = (nm5) this.b;
                IBinder binder2 = ((Messenger) nm5Var2.b).getBinder();
                ck4 ck4Var2 = (ck4) this.f;
                ((MediaBrowserServiceCompat) ck4Var2.b).e.remove(binder2);
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (MediaBrowserServiceCompat) ck4Var2.b;
                Iterator it = mediaBrowserServiceCompat2.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ul4 ul4Var3 = (ul4) it.next();
                        if (ul4Var3.c == this.c) {
                            ul4Var = (TextUtils.isEmpty(this.d) || this.e <= 0) ? new ul4(mediaBrowserServiceCompat2, ul4Var3.a, ul4Var3.b, ul4Var3.c, nm5Var2) : null;
                            it.remove();
                        }
                    }
                }
                if (ul4Var == null) {
                    ul4Var = new ul4(mediaBrowserServiceCompat2, this.d, this.e, this.c, nm5Var2);
                }
                mediaBrowserServiceCompat2.e.put(binder2, ul4Var);
                try {
                    binder2.linkToDeath(ul4Var, 0);
                } catch (RemoteException unused3) {
                    t0.m("MBServiceCompat", "IBinder is already dead.");
                    return;
                }
                break;
            default:
                ql4 ql4Var = (ql4) this.b;
                IBinder binder3 = ((Messenger) ql4Var.b).getBinder();
                ca7 ca7Var = (ca7) this.f;
                ((androidx.media3.session.legacy.MediaBrowserServiceCompat) ca7Var.b).e.remove(binder3);
                androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat3 = (androidx.media3.session.legacy.MediaBrowserServiceCompat) ca7Var.b;
                Iterator it2 = mediaBrowserServiceCompat3.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        tl4 tl4Var2 = (tl4) it2.next();
                        if (tl4Var2.c == this.c) {
                            tl4Var = (TextUtils.isEmpty(this.d) || this.e <= 0) ? new tl4(mediaBrowserServiceCompat3, tl4Var2.a, tl4Var2.b, tl4Var2.c, ql4Var) : null;
                            it2.remove();
                        }
                    }
                }
                if (tl4Var == null) {
                    tl4Var = new tl4(mediaBrowserServiceCompat3, this.d, this.e, this.c, ql4Var);
                }
                mediaBrowserServiceCompat3.e.put(binder3, tl4Var);
                try {
                    binder3.linkToDeath(tl4Var, 0);
                } catch (RemoteException unused4) {
                    t0.m("MBServiceCompat", "IBinder is already dead.");
                }
                break;
        }
    }

    public fm4(ck4 ck4Var, nm5 nm5Var, String str, int i, int i2, Bundle bundle) {
        this.a = 0;
        this.f = ck4Var;
        this.b = nm5Var;
        this.d = str;
        this.c = i;
        this.e = i2;
    }
}
