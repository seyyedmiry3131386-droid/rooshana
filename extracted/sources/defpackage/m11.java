package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.session.MediaSessionService;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m11(xp4 xp4Var, jq4 jq4Var, String str, Bundle bundle, gn4 gn4Var) {
        this.a = 2;
        this.b = xp4Var;
        this.c = str;
        this.d = bundle;
        this.e = gn4Var;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        qm5 qm5Var = (qm5) this.c;
        Handler handler = (Handler) this.d;
        o00 o00Var = (o00) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (qm5Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new g7(qm5Var, o00Var, 11));
            }
            synchronized (rd1.n0) {
                try {
                    int i = rd1.p0 - 1;
                    rd1.p0 = i;
                    if (i == 0) {
                        rd1.o0.shutdown();
                        rd1.o0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (qm5Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new g7(qm5Var, o00Var, 11));
            }
            synchronized (rd1.n0) {
                try {
                    int i2 = rd1.p0 - 1;
                    rd1.p0 = i2;
                    if (i2 == 0) {
                        rd1.o0.shutdown();
                        rd1.o0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private final void b() {
        Bitmap bitmap;
        op1 op1Var = (op1) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        if (atomicInteger.incrementAndGet() == arrayList.size()) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            while (i < arrayList2.size()) {
                n94 n94Var = (n94) arrayList2.get(i);
                if (n94Var != null) {
                    try {
                        bitmap = (Bitmap) ja1.t(n94Var);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (wn5.b) {
                            wn5.a("Failed to get bitmap", e);
                        }
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                arrayList3.add(new MediaSessionCompat$QueueItem(null, r44.g((jp4) arrayList.get(i), bitmap), i == -1 ? -1L : i));
                i++;
            }
            hr4.D(((hr4) op1Var.e).k, arrayList3);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        qf3 qf3Var;
        Bundle bundleB;
        switch (this.a) {
            case 0:
                vp7 vp7Var = (vp7) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                o11 o11Var = (o11) this.e;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.d;
                synchronized (vp7Var.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            vp7Var.F(o11Var);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                a();
                return;
            case 2:
                xp4 xp4Var = (xp4) this.b;
                xp4Var.e.execute(new ii(xp4Var, (gn4) this.e, (String) this.c, (Bundle) this.d));
                return;
            case 3:
                xp4 xp4Var2 = (xp4) this.b;
                qn4 qn4Var = (qn4) this.c;
                wp4 wp4Var = (wp4) this.d;
                jq4 jq4Var = (jq4) this.e;
                try {
                    gn4 gn4Var = (gn4) qn4Var.get(0L, TimeUnit.MILLISECONDS);
                    if (xp4Var2.c(jq4Var)) {
                        ((MediaSessionService) wp4Var.b).g((jq4) wp4Var.c, false);
                    }
                    gn4Var.n(wp4Var);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    xp4Var2.a.h(jq4Var);
                    return;
                }
            case 4:
                b();
                return;
            case 5:
                qr4 qr4Var = (qr4) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                hq4 hq4Var = (hq4) this.d;
                b11 b11Var = (b11) this.e;
                atomicReference.set(qr4Var.k.m(hq4Var));
                b11Var.d();
                return;
            case 6:
                is4 is4Var = (is4) this.b;
                hq4 hq4Var2 = (hq4) this.c;
                xq4 xq4Var = (xq4) this.d;
                qf3 qf3Var2 = (qf3) this.e;
                vp7 vp7Var2 = is4Var.o;
                boolean z = false;
                try {
                    is4Var.p.remove(hq4Var2);
                } catch (Throwable th) {
                    th = th;
                    qf3Var = qf3Var2;
                }
                if (!xq4Var.j()) {
                    es4 es4Var = (es4) hq4Var2.d;
                    vy2.t(es4Var);
                    IBinder iBinderAsBinder = es4Var.a.asBinder();
                    fq4 fq4VarM = xq4Var.m(hq4Var2);
                    if (vp7Var2.d0(hq4Var2)) {
                        wn5.k0("MediaSessionStub", "Controller " + hq4Var2 + " has sent connection request multiple times");
                    }
                    vp7Var2.n(iBinderAsBinder, hq4Var2, fq4VarM.a, fq4VarM.b);
                    eo5 eo5VarX = vp7Var2.X(hq4Var2);
                    if (eo5VarX != null) {
                        qg6 qg6Var = xq4Var.t;
                        he6 he6Var = xq4Var.s;
                        cb6 cb6Var = fq4VarM.b;
                        he6 he6VarN0 = is4Var.n0(he6Var);
                        MediaSession.Token token = ((nq4) xq4Var.h.k.a).c.b;
                        PendingIntent pendingIntent = xq4Var.u;
                        ImmutableList immutableList = fq4VarM.c;
                        if (immutableList == null) {
                            immutableList = xq4Var.B;
                        }
                        ImmutableList immutableList2 = fq4VarM.d;
                        if (immutableList2 == null) {
                            immutableList2 = xq4Var.C;
                        }
                        try {
                            a21 a21Var = new a21(1008000300, 5, is4Var, pendingIntent, immutableList, immutableList2, xq4Var.r, fq4VarM.a, cb6Var, qg6Var.o0(), xq4Var.j.a.getExtras(), xq4Var.D, he6VarN0, token);
                            if (xq4Var.j()) {
                                z67.f(qf3Var2);
                                return;
                            }
                            try {
                                int iC = eo5VarX.c();
                                qf3Var = qf3Var2;
                                try {
                                    try {
                                        if (qf3Var instanceof so4) {
                                            bundleB = new Bundle();
                                            bundleB.putBinder(a21.B, new z11(a21Var));
                                        } else {
                                            bundleB = a21Var.b(hq4Var2.c);
                                        }
                                        qf3Var.q(iC, bundleB);
                                        z = true;
                                    } catch (RemoteException unused2) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (RemoteException unused3) {
                                qf3Var = qf3Var2;
                            }
                            if (z && (!xq4Var.A || !xq4.k(hq4Var2))) {
                                xq4Var.e.getClass();
                                break;
                            }
                            if (z) {
                                return;
                            }
                            z67.f(qf3Var);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            qf3Var = qf3Var2;
                        }
                        if (!z) {
                            z67.f(qf3Var);
                        }
                        throw th;
                    }
                    wn5.k0("MediaSessionStub", "Ignoring connection request from unknown controller info");
                }
                z67.f(qf3Var2);
                return;
            case 7:
                xq4 xq4Var2 = (xq4) this.b;
                rq7 rq7Var = (rq7) this.c;
                n31 n31Var = (n31) this.d;
                n94 n94Var = (n94) this.e;
                if (xq4Var2.j()) {
                    rq7Var.k(null);
                    return;
                }
                try {
                    n31Var.accept(n94Var);
                    rq7Var.k(null);
                    return;
                } catch (Throwable th4) {
                    rq7Var.l(th4);
                    return;
                }
            default:
                xq4 xq4Var3 = (xq4) this.b;
                gs4 gs4Var = (gs4) this.c;
                hq4 hq4Var3 = (hq4) this.d;
                List list = (List) this.e;
                if (xq4Var3.j()) {
                    return;
                }
                gs4Var.a(xq4Var3.t, hq4Var3, list);
                return;
        }
    }

    public /* synthetic */ m11(vp7 vp7Var, AtomicBoolean atomicBoolean, o11 o11Var, AtomicBoolean atomicBoolean2) {
        this.a = 0;
        this.b = vp7Var;
        this.c = atomicBoolean;
        this.e = o11Var;
        this.d = atomicBoolean2;
    }

    public /* synthetic */ m11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
