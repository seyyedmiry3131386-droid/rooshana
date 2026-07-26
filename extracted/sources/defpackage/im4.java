package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class im4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ nm5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ResultReceiver d;
    public final /* synthetic */ ck4 e;

    public im4(ck4 ck4Var, nm5 nm5Var, String str, ResultReceiver resultReceiver) {
        this.e = ck4Var;
        this.b = nm5Var;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((ul4) ((MediaBrowserServiceCompat) this.e.b).e.get(((Messenger) this.b.b).getBinder())) != null) {
                    int i = 2 & 2;
                    ResultReceiver resultReceiver = this.d;
                    if (i == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        resultReceiver.b(0, bundle);
                    } else {
                        resultReceiver.b(-1, null);
                    }
                } else {
                    t0.m("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.c);
                }
                break;
            default:
                if (((ul4) ((MediaBrowserServiceCompat) this.e.b).e.get(((Messenger) this.b.b).getBinder())) != null) {
                    this.d.b(-1, null);
                } else {
                    t0.m("MBServiceCompat", "search for callback that isn't registered query=" + this.c);
                }
                break;
        }
    }

    public im4(ck4 ck4Var, nm5 nm5Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.e = ck4Var;
        this.b = nm5Var;
        this.c = str;
        this.d = resultReceiver;
    }
}
