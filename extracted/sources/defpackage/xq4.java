package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSessionService;
import com.google.common.collect.ImmutableList;
import io.sentry.android.core.t0;
import ir.myket.player.provider.service.PlaybackService;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class xq4 {
    public static final bq7 E = new bq7(1);
    public boolean A;
    public final ImmutableList B;
    public final ImmutableList C;
    public final Bundle D;
    public final Object a = new Object();
    public final Uri b;
    public final vq4 c;
    public final kl4 d;
    public final ol3 e;
    public final PlaybackService f;
    public final is4 g;
    public final hr4 h;
    public final String i;
    public final eq7 j;
    public final jq4 k;
    public final Handler l;
    public final do3 m;
    public final tq4 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final ImmutableList r;
    public he6 s;
    public qg6 t;
    public PendingIntent u;
    public c9 v;
    public nm5 w;
    public qr4 x;
    public boolean y;
    public final long z;

    public xq4(jq4 jq4Var, PlaybackService playbackService, ExoPlayer exoPlayer, PendingIntent pendingIntent, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ol3 ol3Var, Bundle bundle, Bundle bundle2, do3 do3Var) {
        wn5.Q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "]");
        this.k = jq4Var;
        this.f = playbackService;
        this.i = "";
        this.u = pendingIntent;
        this.B = immutableList;
        this.C = immutableList2;
        this.r = immutableList3;
        this.e = ol3Var;
        this.D = bundle2;
        this.m = do3Var;
        this.p = true;
        this.q = true;
        is4 is4Var = new is4(this);
        this.g = is4Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = ((e62) exoPlayer).t;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.s = he6.F;
        this.c = new vq4(this, looper);
        this.d = new kl4(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(xq4.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        hr4 hr4Var = new hr4(this, uriBuild, handler, bundle, immutableList, immutableList2, fq4.e, fq4.f, bundle2);
        this.h = hr4Var;
        this.j = new eq7(Process.myUid(), 1008000300, 5, playbackService.getPackageName(), is4Var, bundle, ((nq4) hr4Var.k.a).c.b);
        qg6 qg6Var = new qg6(exoPlayer);
        this.t = qg6Var;
        j29.a0(handler, new lo4(this, qg6Var, 8));
        this.z = 3000L;
        this.n = new tq4(this, 2);
        j29.a0(handler, new tq4(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(xq4 xq4Var) {
        synchronized (xq4Var.a) {
            try {
                if (xq4Var.y) {
                    return;
                }
                final aq7 aq7VarK0 = xq4Var.t.k0();
                if (!xq4Var.c.hasMessages(1) && y97.k(aq7VarK0, xq4Var.s.c)) {
                    vp7 vp7Var = xq4Var.g.o;
                    ImmutableList immutableListO = vp7Var.O();
                    for (int i = 0; i < immutableListO.size(); i++) {
                        final hq4 hq4Var = (hq4) immutableListO.get(i);
                        vp7Var.U(hq4Var);
                        final boolean zE0 = vp7Var.e0(hq4Var, 16);
                        final boolean zE02 = vp7Var.e0(hq4Var, 17);
                        xq4Var.c(hq4Var, new wq4() { // from class: uq4
                            @Override // defpackage.wq4
                            public final void d(gq4 gq4Var, int i2) {
                                gq4Var.j(i2, aq7VarK0, zE0, zE02, hq4Var.c);
                            }
                        });
                    }
                    try {
                        xq4Var.h.i.j(0, aq7VarK0, true, true, 0);
                    } catch (RemoteException e) {
                        wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                xq4Var.u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(hq4 hq4Var) {
        return hq4Var != null && Objects.equals(hq4Var.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.KeyEvent r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            jq4 r0 = r7.k
            xq4 r0 = r0.a
            hq4 r4 = r0.e()
            r4.getClass()
            int r8 = r8.getKeyCode()
            r0 = 85
            if (r8 == r0) goto L17
            r0 = 79
            if (r8 != r0) goto L1b
        L17:
            if (r9 == 0) goto L1b
            r8 = 87
        L1b:
            r9 = 126(0x7e, float:1.77E-43)
            if (r8 == r9) goto L73
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 == r9) goto L6b
            r9 = 272(0x110, float:3.81E-43)
            if (r8 == r9) goto L63
            r9 = 273(0x111, float:3.83E-43)
            if (r8 == r9) goto L5c
            switch(r8) {
                case 85: goto L46;
                case 86: goto L3f;
                case 87: goto L63;
                case 88: goto L5c;
                case 89: goto L38;
                case 90: goto L30;
                default: goto L2e;
            }
        L2e:
            r8 = 0
            return r8
        L30:
            k11 r8 = new k11
            r9 = 2
            r8.<init>(r7, r4, r9)
        L36:
            r5 = r8
            goto L7a
        L38:
            k11 r8 = new k11
            r9 = 3
            r8.<init>(r7, r4, r9)
            goto L36
        L3f:
            k11 r8 = new k11
            r9 = 4
            r8.<init>(r7, r4, r9)
            goto L36
        L46:
            qg6 r8 = r7.t
            boolean r8 = r8.l()
            if (r8 == 0) goto L55
            k11 r8 = new k11
            r9 = 5
            r8.<init>(r7, r4, r9)
            goto L36
        L55:
            k11 r8 = new k11
            r9 = 6
            r8.<init>(r7, r4, r9)
            goto L36
        L5c:
            k11 r8 = new k11
            r9 = 1
            r8.<init>(r7, r4, r9)
            goto L36
        L63:
            k11 r8 = new k11
            r9 = 9
            r8.<init>(r7, r4, r9)
            goto L36
        L6b:
            k11 r8 = new k11
            r9 = 8
            r8.<init>(r7, r4, r9)
            goto L36
        L73:
            k11 r8 = new k11
            r9 = 7
            r8.<init>(r7, r4, r9)
            goto L36
        L7a:
            z52 r1 = new z52
            r6 = 2
            r2 = r7
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            android.os.Handler r8 = r2.l
            defpackage.j29.a0(r8, r1)
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq4.b(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final void c(hq4 hq4Var, wq4 wq4Var) {
        int iC;
        is4 is4Var = this.g;
        try {
            eo5 eo5VarX = is4Var.o.X(hq4Var);
            if (eo5VarX != null) {
                iC = eo5VarX.c();
            } else if (!h(hq4Var)) {
                return;
            } else {
                iC = 0;
            }
            gq4 gq4Var = hq4Var.d;
            if (gq4Var != null) {
                wq4Var.d(gq4Var, iC);
            }
        } catch (DeadObjectException unused) {
            is4Var.o.v0(hq4Var);
        } catch (RemoteException e) {
            wn5.l0("MediaSessionImpl", "Exception in " + hq4Var, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(wq4 wq4Var) {
        ImmutableList immutableListO = this.g.o.O();
        for (int i = 0; i < immutableListO.size(); i++) {
            c((hq4) immutableListO.get(i), wq4Var);
        }
        try {
            wq4Var.d(this.h.i, 0);
        } catch (RemoteException e) {
            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hq4 e() {
        ImmutableList immutableListO = this.g.o.O();
        for (int i = 0; i < immutableListO.size(); i++) {
            hq4 hq4Var = (hq4) immutableListO.get(i);
            if (i(hq4Var)) {
                return hq4Var;
            }
        }
        return null;
    }

    public final void f(cb6 cb6Var) {
        this.c.a(false, false);
        d(new po4(cb6Var));
        try {
            op1 op1Var = this.h.i;
            wl1 wl1Var = this.s.q;
            op1Var.n();
        } catch (RemoteException e) {
            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(hq4 hq4Var, boolean z) {
        if (p()) {
            boolean z2 = this.t.f0(16) && this.t.E() != null;
            boolean z3 = this.t.f0(31) || this.t.f0(20);
            hq4 hq4VarT = t(hq4Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            vy2.s(!false);
            sparseBooleanArray.append(1, true);
            vy2.s(!false);
            cb6 cb6Var = new cb6(new vd2(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    wn5.k0("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                j29.M(this.t);
                if (z) {
                    q(hq4VarT, cb6Var);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            hj3 hj3Var = new hj3();
            hj3Var.l(unsupportedOperationException);
            hj3Var.e(new g6(14, hj3Var, new ry(this, hq4VarT, z, cb6Var), false), new od1(3, this));
        }
    }

    public final boolean h(hq4 hq4Var) {
        return this.g.o.d0(hq4Var) || this.h.f.d0(hq4Var);
    }

    public final boolean i(hq4 hq4Var) {
        return Objects.equals(hq4Var.a.a.a, this.f.getPackageName()) && hq4Var.b != 0 && new Bundle(hq4Var.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    public final n94 l(hq4 hq4Var, List list) {
        t(hq4Var);
        this.e.getClass();
        return bl4.f(list);
    }

    public final fq4 m(hq4 hq4Var) {
        boolean z = this.A;
        hr4 hr4Var = this.h;
        if (z && k(hq4Var)) {
            hr4Var.getClass();
            xp7 xp7Var = fq4.e;
            xp7 xp7Var2 = hr4Var.v;
            xp7Var2.getClass();
            cb6 cb6Var = hr4Var.w;
            cb6Var.getClass();
            ImmutableList immutableList = hr4Var.t;
            ImmutableList immutableListN = immutableList == null ? null : ImmutableList.n(immutableList);
            ImmutableList immutableList2 = hr4Var.u;
            return new fq4(xp7Var2, cb6Var, immutableListN, immutableList2 != null ? ImmutableList.n(immutableList2) : null);
        }
        this.e.getClass();
        jq4 jq4Var = this.k;
        js3.p(jq4Var, "session");
        xq4 xq4Var = jq4Var.a;
        cb6 cb6Var2 = fq4.f;
        xp7 xp7Var3 = fq4.e;
        cb6Var2.getClass();
        ql4 ql4Var = new ql4(cb6Var2);
        ql4Var.G(7);
        ql4Var.G(6);
        ql4Var.G(9);
        ql4Var.G(8);
        ql4Var.G(12);
        ql4Var.G(11);
        cb6 cb6VarW = ql4Var.w();
        xp7Var3.getClass();
        fq4 fq4Var = new fq4(xp7Var3, cb6VarW, null, null);
        if (i(hq4Var)) {
            this.A = true;
            ImmutableList immutableList3 = xq4Var.C;
            int i = 0;
            if (immutableList3.isEmpty()) {
                hr4Var.t = xq4Var.B;
            } else {
                hr4Var.u = immutableList3;
                Bundle bundle = hr4Var.s;
                boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z3 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                hr4Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                    ((nq4) hr4Var.k.a).a.setExtras(bundle);
                }
            }
            xq4 xq4Var2 = hr4Var.g;
            Bundle bundle2 = hr4Var.s;
            boolean z4 = hr4Var.w.a(17) != cb6VarW.a(17);
            hr4Var.v = xp7Var3;
            hr4Var.w = cb6VarW;
            if (!hr4Var.u.isEmpty()) {
                boolean z5 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z6 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                hr4Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z5 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z6) {
                    ((nq4) hr4Var.k.a).a.setExtras(bundle2);
                }
            }
            if (z4) {
                j29.a0(xq4Var2.l, new ar4(hr4Var, xq4Var2.t, i));
                return fq4Var;
            }
            hr4Var.N(xq4Var2.t);
        }
        return fq4Var;
    }

    public final n94 n(hq4 hq4Var, wp7 wp7Var, Bundle bundle) {
        t(hq4Var);
        this.e.getClass();
        return ja1.y(new bq7(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(defpackage.hq4 r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq4.o(hq4, android.content.Intent):boolean");
    }

    public final boolean p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            rq7 rq7Var = new rq7();
            this.o.post(new lo4(this, rq7Var, 9));
            try {
                return ((Boolean) rq7Var.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        nm5 nm5Var = this.w;
        if (nm5Var != null) {
            MediaSessionService mediaSessionService = (MediaSessionService) nm5Var.b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33) {
                int i2 = MediaSessionService.g;
                if (!mediaSessionService.b(null).k) {
                    return mediaSessionService.g(this.k, true);
                }
            }
        }
        return true;
    }

    public final void q(hq4 hq4Var, cb6 cb6Var) {
        t(hq4Var);
        this.e.getClass();
    }

    public final n94 r(hq4 hq4Var, List list, final int i, final long j) {
        t(hq4Var);
        this.e.getClass();
        return j29.j0(bl4.f(list), new uw() { // from class: eq4
            @Override // defpackage.uw
            /* JADX INFO: renamed from: apply */
            public final n94 mo52apply(Object obj) {
                return ja1.y(new iq4((List) obj, i, j));
            }
        });
    }

    public final void s() {
        wn5.Q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + j29.a + "] [" + lp4.b() + "]");
        synchronized (this.a) {
            try {
                if (this.y) {
                    return;
                }
                this.y = true;
                kl4 kl4Var = this.d;
                ii iiVar = (ii) kl4Var.b;
                if (iiVar != null) {
                    kl4Var.removeCallbacks(iiVar);
                    kl4Var.b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    j29.a0(this.l, new tq4(this, 0));
                } catch (Exception e) {
                    wn5.l0("MediaSessionImpl", "Exception thrown while closing", e);
                }
                hr4 hr4Var = this.h;
                ComponentName componentName = hr4Var.m;
                xq4 xq4Var = hr4Var.g;
                qq4 qq4Var = hr4Var.k;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        ((nq4) qq4Var.a).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", xq4Var.b);
                        intent.setComponent(componentName);
                        ((nq4) qq4Var.a).a.setMediaButtonReceiver(PendingIntent.getBroadcast(xq4Var.f, 0, intent, hr4.x));
                    }
                }
                in inVar = hr4Var.l;
                if (inVar != null) {
                    xq4Var.f.unregisterReceiver(inVar);
                }
                nq4 nq4Var = (nq4) qq4Var.a;
                MediaSession mediaSession = nq4Var.a;
                nq4Var.f.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        t0.n("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                nq4Var.b.n.clear();
                mediaSession.release();
                is4 is4Var = this.g;
                Set set = is4Var.p;
                vp7 vp7Var = is4Var.o;
                for (hq4 hq4Var : vp7Var.O()) {
                    vp7Var.v0(hq4Var);
                    gq4 gq4Var = hq4Var.d;
                    if (gq4Var != null) {
                        gq4Var.b();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    gq4 gq4Var2 = ((hq4) it.next()).d;
                    if (gq4Var2 != null) {
                        gq4Var2.b();
                    }
                }
                set.clear();
                is4Var.n.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hq4 t(hq4 hq4Var) {
        if (!this.A || !k(hq4Var)) {
            return hq4Var;
        }
        hq4 hq4VarE = e();
        hq4VarE.getClass();
        return hq4VarE;
    }

    public final void u() {
        Handler handler = this.l;
        tq4 tq4Var = this.n;
        handler.removeCallbacks(tq4Var);
        if (this.q) {
            long j = this.z;
            if (j > 0) {
                if (this.t.H() || this.t.A0()) {
                    handler.postDelayed(tq4Var, j);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(PendingIntent pendingIntent) {
        this.u = pendingIntent;
        is4 is4Var = this.g;
        ImmutableList immutableListO = is4Var.o.O();
        for (int i = 0; i < immutableListO.size(); i++) {
            hq4 hq4Var = (hq4) immutableListO.get(i);
            if (hq4Var.b >= 3 && is4Var.o.d0(hq4Var)) {
                c(hq4Var, new qo4(pendingIntent));
                if (i(hq4Var)) {
                    try {
                        this.h.i.g(0, pendingIntent);
                    } catch (RemoteException e) {
                        wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
            }
        }
    }

    public final void w() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
