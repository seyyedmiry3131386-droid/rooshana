package androidx.media3.session.legacy;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import defpackage.c26;
import defpackage.hn4;
import defpackage.in4;
import defpackage.no4;
import defpackage.yf3;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: androidx.media3.session.legacy.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                public final WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
                    a aVar = (a) this.a.get();
                    if (aVar == null || bundle == null) {
                        return;
                    }
                    synchronized (aVar.b) {
                        aVar.e.b(d.L(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
                        aVar.e.c(c26.E(bundle));
                        aVar.a();
                    }
                }
            });
        }
    }

    public final void a() {
        yf3 yf3VarA = this.e.a();
        if (yf3VarA == null) {
            return;
        }
        ArrayList<no4> arrayList = this.c;
        for (no4 no4Var : arrayList) {
            in4 in4Var = new in4(no4Var);
            this.d.put(no4Var, in4Var);
            no4Var.c = in4Var;
            try {
                yf3VarA.X(in4Var);
                no4Var.i(13, null, null);
            } catch (RemoteException | SecurityException e) {
                t0.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(no4 no4Var) {
        MediaController mediaController = this.a;
        hn4 hn4Var = no4Var.a;
        hn4Var.getClass();
        mediaController.unregisterCallback(hn4Var);
        synchronized (this.b) {
            yf3 yf3VarA = this.e.a();
            if (yf3VarA != null) {
                try {
                    in4 in4Var = (in4) this.d.remove(no4Var);
                    if (in4Var != null) {
                        no4Var.c = null;
                        yf3VarA.O(in4Var);
                    }
                } catch (RemoteException | SecurityException e) {
                    t0.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(no4Var);
            }
        }
    }
}
