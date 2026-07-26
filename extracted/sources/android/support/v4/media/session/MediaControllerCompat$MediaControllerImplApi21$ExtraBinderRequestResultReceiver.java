package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.c26;
import defpackage.vf3;
import defpackage.wf3;
import defpackage.zf3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        zf3 zf3Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = wf3.n;
            if (binder == null) {
                zf3Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zf3)) {
                    vf3 vf3Var = new vf3();
                    vf3Var.n = binder;
                    zf3Var = vf3Var;
                } else {
                    zf3Var = (zf3) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.a(zf3Var);
            aVar.e.b(c26.E(bundle));
            aVar.a();
        }
    }
}
