package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class sl4 extends dm4 {
    public final /* synthetic */ tl4 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ MediaBrowserServiceCompat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl4(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, tl4 tl4Var, String str, Bundle bundle) {
        super(obj);
        this.g = mediaBrowserServiceCompat;
        this.d = tl4Var;
        this.e = str;
        this.f = bundle;
    }

    @Override // defpackage.dm4
    public final void a() {
        String str = this.e;
        Bundle bundle = this.f;
        wv wvVar = this.g.e;
        tl4 tl4Var = this.d;
        ql4 ql4Var = tl4Var.e;
        ql4Var.getClass();
        if (wvVar.get(((Messenger) ql4Var.b).getBinder()) != tl4Var) {
            int i = MediaBrowserServiceCompat.i;
            return;
        }
        if ((this.c & 1) != 0) {
            int i2 = MediaBrowserServiceCompat.i;
        }
        try {
            ql4Var.F(bundle, str, null);
        } catch (RemoteException unused) {
            StringBuilder sbN = t61.n("Calling onLoadChildren() failed for id=", str, " package=");
            sbN.append(tl4Var.a);
            t0.m("MBServiceCompat", sbN.toString());
        }
    }
}
