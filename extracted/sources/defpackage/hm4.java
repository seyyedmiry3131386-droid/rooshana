package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class hm4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ql4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ResultReceiver d;
    public final /* synthetic */ ca7 e;

    public hm4(ca7 ca7Var, ql4 ql4Var, String str, ResultReceiver resultReceiver) {
        this.e = ca7Var;
        this.b = ql4Var;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((Messenger) this.b.b).getBinder();
                ca7 ca7Var = this.e;
                tl4 tl4Var = (tl4) ((MediaBrowserServiceCompat) ca7Var.b).e.get(binder);
                if (tl4Var != null) {
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) ca7Var.b;
                    mediaBrowserServiceCompat.f = tl4Var;
                    int i = 2 & 2;
                    ResultReceiver resultReceiver = this.d;
                    if (i != 0) {
                        resultReceiver.b(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        resultReceiver.b(0, bundle);
                    }
                    mediaBrowserServiceCompat.f = null;
                } else {
                    t0.m("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.c);
                }
                break;
            default:
                IBinder binder2 = ((Messenger) this.b.b).getBinder();
                ca7 ca7Var2 = this.e;
                tl4 tl4Var2 = (tl4) ((MediaBrowserServiceCompat) ca7Var2.b).e.get(binder2);
                if (tl4Var2 != null) {
                    MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (MediaBrowserServiceCompat) ca7Var2.b;
                    mediaBrowserServiceCompat2.f = tl4Var2;
                    this.d.b(-1, null);
                    mediaBrowserServiceCompat2.f = null;
                } else {
                    t0.m("MBServiceCompat", "search for callback that isn't registered query=" + this.c);
                }
                break;
        }
    }

    public hm4(ca7 ca7Var, ql4 ql4Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.e = ca7Var;
        this.b = ql4Var;
        this.c = str;
        this.d = resultReceiver;
    }
}
