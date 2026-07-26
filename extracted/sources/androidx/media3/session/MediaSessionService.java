package androidx.media3.session;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import com.google.common.collect.ImmutableList;
import defpackage.dc0;
import defpackage.dg1;
import defpackage.e62;
import defpackage.fn4;
import defpackage.gd1;
import defpackage.gn4;
import defpackage.hq4;
import defpackage.j29;
import defpackage.jq4;
import defpackage.jr4;
import defpackage.jr9;
import defpackage.lo4;
import defpackage.m11;
import defpackage.nq4;
import defpackage.o80;
import defpackage.or4;
import defpackage.pr4;
import defpackage.qf3;
import defpackage.qr4;
import defpackage.tp4;
import defpackage.u03;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.wv;
import defpackage.xp4;
import defpackage.xq4;
import defpackage.y52;
import defpackage.z67;
import defpackage.zc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaSessionService extends Service {
    public static final /* synthetic */ int g = 0;
    public pr4 c;
    public xp4 d;
    public dc0 e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final wv f = new wv(0);

    public final void a(jq4 jq4Var) {
        jq4 jq4Var2;
        boolean z = true;
        vy2.i("session is already released", !jq4Var.a.j());
        synchronized (this.a) {
            jq4Var2 = (jq4) this.f.get(jq4Var.a.i);
            if (jq4Var2 != null && jq4Var2 != jq4Var) {
                z = false;
            }
            vy2.i("Session ID should be unique", z);
            this.f.put(jq4Var.a.i, jq4Var);
        }
        if (jq4Var2 == null) {
            j29.a0(this.b, new or4(this, jq4Var, 0));
        }
    }

    public final xp4 b(dg1 dg1Var) {
        if (this.d == null) {
            if (dg1Var == null) {
                vy2.u(getBaseContext(), "Accessing service context before onCreate()");
                dg1Var = new dg1(getApplicationContext(), new gd1(7), "default_channel_id", dg1.h);
            }
            if (this.e == null) {
                this.e = new dc0(this);
            }
            this.d = new xp4(this, dg1Var, this.e);
        }
        return this.d;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.f.values());
        }
        return arrayList;
    }

    public final boolean d(jq4 jq4Var) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.f.containsKey(jq4Var.a.i);
        }
        return zContainsKey;
    }

    public abstract jq4 e(hq4 hq4Var);

    public void f(jq4 jq4Var, boolean z) {
        xp4 xp4VarB = b(null);
        if (xp4VarB.a.d(jq4Var) && xp4VarB.c(jq4Var)) {
            int i = xp4VarB.i + 1;
            xp4VarB.i = i;
            gn4 gn4VarA = xp4VarB.a(jq4Var);
            gn4VarA.getClass();
            gn4VarA.k0();
            fn4 fn4Var = gn4VarA.c;
            j29.a0(new Handler(((e62) jq4Var.a()).t), new tp4(xp4VarB, jq4Var, fn4Var.E() ? fn4Var.h0() : ImmutableList.q(), new y52(xp4VarB, i, jq4Var), z, 0));
            return;
        }
        MediaSessionService mediaSessionService = xp4VarB.a;
        if (Build.VERSION.SDK_INT >= 24) {
            jr9.B(mediaSessionService, true);
        } else {
            mediaSessionService.stopForeground(true);
        }
        xp4VarB.k = false;
        dc0 dc0Var = xp4VarB.j;
        if (dc0Var != null) {
            xp4VarB.c.b.cancel(null, dc0Var.b);
            xp4VarB.i++;
            xp4VarB.j = null;
        }
    }

    public final boolean g(jq4 jq4Var, boolean z) {
        try {
            f(jq4Var, b(null).b(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !zc.l(e)) {
                throw e;
            }
            wn5.H("MSessionService", "Failed to start foreground", e);
            this.b.post(new u03(8, this));
            return false;
        }
    }

    public final void h(jq4 jq4Var) {
        synchronized (this.a) {
            vy2.i("session not found", this.f.containsKey(jq4Var.a.i));
            this.f.remove(jq4Var.a.i);
        }
        j29.a0(this.b, new or4(this, jq4Var, 1));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        jq4 jq4VarE;
        qr4 qr4Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            pr4 pr4Var = this.c;
            vy2.t(pr4Var);
            return pr4Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (jq4VarE = e(new hq4(new jr4("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        a(jq4VarE);
        xq4 xq4Var = jq4VarE.a;
        synchronized (xq4Var.a) {
            try {
                if (xq4Var.x == null) {
                    MediaSessionCompat$Token mediaSessionCompat$Token = ((nq4) xq4Var.h.k.a).c;
                    qr4 qr4Var2 = new qr4(xq4Var);
                    qr4Var2.c(mediaSessionCompat$Token);
                    xq4Var.x = qr4Var2;
                }
                qr4Var = xq4Var.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qr4Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.c = new pr4(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        pr4 pr4Var = this.c;
        if (pr4Var != null) {
            pr4Var.n.clear();
            pr4Var.o.removeCallbacksAndMessages(null);
            Set set = pr4Var.p;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                z67.f((qf3) it.next());
            }
            set.clear();
            this.c = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        jq4 jq4VarE;
        jq4 jq4Var;
        if (intent != null) {
            if (this.e == null) {
                this.e = new dc0(this);
            }
            dc0 dc0Var = this.e;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (jq4.b) {
                    try {
                        Iterator it = jq4.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                jq4Var = null;
                                break;
                            }
                            jq4Var = (jq4) it.next();
                            if (Objects.equals(jq4Var.a.b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                jq4VarE = jq4Var;
            } else {
                jq4VarE = null;
            }
            dc0Var.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (jq4VarE == null) {
                    jq4VarE = e(new hq4(new jr4("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    if (jq4VarE != null) {
                        a(jq4VarE);
                    }
                }
                xq4 xq4Var = jq4VarE.a;
                xq4Var.l.post(new lo4(xq4Var, intent, 11));
                return 1;
            }
            if (jq4VarE != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    xp4 xp4VarB = b(null);
                    gn4 gn4VarA = xp4VarB.a(jq4VarE);
                    if (gn4VarA != null) {
                        j29.a0(new Handler(((e62) jq4VarE.a()).t), new m11(xp4VarB, jq4VarE, str, bundle, gn4VarA));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (b(null).k) {
            ArrayList arrayListC = c();
            for (int i = 0; i < arrayListC.size(); i++) {
                if (((o80) ((jq4) arrayListC.get(i)).a()).H()) {
                    return;
                }
            }
        }
        xp4 xp4VarB = b(null);
        MediaSessionService mediaSessionService = xp4VarB.a;
        xp4VarB.m = false;
        Handler handler = xp4VarB.d;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            ArrayList arrayListC2 = mediaSessionService.c();
            for (int i2 = 0; i2 < arrayListC2.size(); i2++) {
                mediaSessionService.g((jq4) arrayListC2.get(i2), false);
            }
        }
        ArrayList arrayListC3 = c();
        for (int i3 = 0; i3 < arrayListC3.size(); i3++) {
            ((e62) ((jq4) arrayListC3.get(i3)).a()).C(false);
        }
        stopSelf();
    }
}
