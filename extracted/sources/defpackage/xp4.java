package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.content.ContextCompat;
import androidx.media3.session.MediaSessionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class xp4 implements Handler.Callback {
    public final MediaSessionService a;
    public final dc0 b;
    public final np5 c;
    public final Handler d;
    public final od1 e;
    public final Intent f;
    public final HashMap g;
    public sp4 h;
    public int i;
    public dc0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final long n;
    public final int o;

    public xp4(MediaSessionService mediaSessionService, sp4 sp4Var, dc0 dc0Var) {
        this.a = mediaSessionService;
        this.h = sp4Var;
        this.b = dc0Var;
        this.c = new np5(mediaSessionService);
        Looper mainLooper = Looper.getMainLooper();
        String str = j29.a;
        this.d = new Handler(mainLooper, this);
        this.e = new od1(2, this);
        this.f = new Intent(mediaSessionService, mediaSessionService.getClass());
        this.g = new HashMap();
        this.k = false;
        this.m = true;
        this.n = 600000L;
        this.o = 3;
    }

    public final gn4 a(jq4 jq4Var) {
        vp4 vp4Var = (vp4) this.g.get(jq4Var);
        if (vp4Var == null) {
            return null;
        }
        qn4 qn4Var = vp4Var.a;
        if (!qn4Var.isDone()) {
            return null;
        }
        try {
            return (gn4) ja1.t(qn4Var);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean b(boolean z) {
        boolean z2;
        ArrayList arrayListC = this.a.c();
        for (int i = 0; i < arrayListC.size(); i++) {
            gn4 gn4VarA = a((jq4) arrayListC.get(i));
            if (gn4VarA != null && ((gn4VarA.l() || z) && (gn4VarA.e() == 3 || gn4VarA.e() == 2))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.m;
        long j = this.n;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.l;
        Handler handler = this.d;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.l = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean c(jq4 jq4Var) {
        gn4 gn4VarA = a(jq4Var);
        if (gn4VarA != null && !gn4VarA.S().p()) {
            vp4 vp4Var = (vp4) this.g.get(jq4Var);
            vp4Var.getClass();
            if (gn4VarA.e() != 1) {
                vp4Var.b = false;
                vp4Var.c = true;
                return true;
            }
            int i = this.o;
            if (i == 1) {
                return !vp4Var.b;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                if (!vp4Var.b && vp4Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(jq4 jq4Var, dc0 dc0Var, boolean z) {
        MediaSession.Token token = ((nq4) jq4Var.a.h.k.a).c.b;
        Notification notification = (Notification) dc0Var.c;
        int i = dc0Var.b;
        notification.extras.putParcelable("android.mediaSession", token);
        this.j = dc0Var;
        if (z) {
            MediaSessionService mediaSessionService = this.a;
            ContextCompat.startForegroundService(mediaSessionService, this.f);
            String str = j29.a;
            if (Build.VERSION.SDK_INT >= 29) {
                te.S(mediaSessionService, i, notification);
            } else {
                mediaSessionService.startForeground(i, notification);
            }
            this.k = true;
            return;
        }
        np5 np5Var = this.c;
        NotificationManager notificationManager = np5Var.b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
        } else {
            jp5 jp5Var = new jp5(np5Var.a.getPackageName(), i, notification);
            synchronized (np5.f) {
                try {
                    if (np5.g == null) {
                        np5.g = new mp5(np5Var.a.getApplicationContext());
                    }
                    np5.g.b.obtainMessage(0, jp5Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(null, i);
        }
        MediaSessionService mediaSessionService2 = this.a;
        if (Build.VERSION.SDK_INT >= 24) {
            jr9.B(mediaSessionService2, false);
        } else {
            mediaSessionService2.stopForeground(false);
        }
        this.k = false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        MediaSessionService mediaSessionService = this.a;
        ArrayList arrayListC = mediaSessionService.c();
        for (int i = 0; i < arrayListC.size(); i++) {
            mediaSessionService.g((jq4) arrayListC.get(i), false);
        }
        return true;
    }
}
