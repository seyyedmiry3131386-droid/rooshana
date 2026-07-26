package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.node.i;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.session.legacy.a;
import com.google.common.collect.ImmutableSet;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class op1 implements yo1, dq2, gq4 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public op1(xr7 xr7Var, long j, LayoutDirection layoutDirection, i iVar) {
        this.b = xr7Var;
        this.a = j;
        this.c = layoutDirection;
        this.d = iVar;
    }

    @Override // defpackage.gq4
    public void a(int i, wp7 wp7Var) {
        Bundle bundle = Bundle.EMPTY;
        qq4 qq4Var = ((hr4) this.e).k;
        String str = wp7Var.b;
        qq4Var.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((nq4) qq4Var.a).a.sendSessionEvent(str, bundle);
    }

    @Override // defpackage.gq4
    public /* synthetic */ void c(int i, q54 q54Var) {
    }

    @Override // defpackage.gq4
    public /* synthetic */ void d(int i) {
    }

    @Override // defpackage.gq4
    public void e(int i, cb6 cb6Var) {
        hr4 hr4Var = (hr4) this.e;
        qg6 qg6Var = hr4Var.g.t;
        int i2 = qg6Var.f0(20) ? 4 : 0;
        if (hr4Var.r != i2) {
            hr4Var.r = i2;
            ((nq4) hr4Var.k.a).a.setFlags(i2 | 3);
        }
        hr4Var.N(qg6Var);
    }

    @Override // defpackage.gq4
    public /* synthetic */ void f(int i, bq7 bq7Var) {
    }

    @Override // defpackage.gq4
    public void g(int i, PendingIntent pendingIntent) {
        ((nq4) ((hr4) this.e).k.a).a.setSessionActivity(pendingIntent);
    }

    @Override // defpackage.yo1
    public File h(sx3 sx3Var) {
        String strM = ((rn6) this.b).m(sx3Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(sx3Var);
        }
        try {
            pj9 pj9VarY = k().y(strM);
            if (pj9VarY != null) {
                return ((File[]) pj9VarY.a)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            t0.n("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.gq4
    public /* synthetic */ void i(int i, he6 he6Var, cb6 cb6Var, boolean z, boolean z2) {
    }

    @Override // defpackage.gq4
    public void j(int i, aq7 aq7Var, boolean z, boolean z2, int i2) {
        hr4 hr4Var = (hr4) this.e;
        hr4Var.N(hr4Var.g.t);
    }

    public synchronized np1 k() {
        try {
            if (((np1) this.e) == null) {
                this.e = np1.I((File) this.c, this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (np1) this.e;
    }

    public void l(ly lyVar) {
        hr4 hr4Var = (hr4) this.e;
        if (hr4Var.g.t.s0().a == 0) {
            int iU = r44.u(lyVar);
            nq4 nq4Var = (nq4) hr4Var.k.a;
            nq4Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iU);
            nq4Var.a.setPlaybackToLocal(builder.build());
        }
    }

    @Override // defpackage.yo1
    public void m(sx3 sx3Var, wv8 wv8Var) {
        ap1 ap1VarR;
        boolean z;
        String strM = ((rn6) this.b).m(sx3Var);
        do3 do3Var = (do3) this.d;
        synchronized (do3Var) {
            try {
                ap1VarR = (ap1) ((HashMap) do3Var.a).get(strM);
                if (ap1VarR == null) {
                    ap1VarR = ((r79) do3Var.b).r();
                    ((HashMap) do3Var.a).put(strM, ap1VarR);
                }
                ap1VarR.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        ap1VarR.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(sx3Var);
            }
            try {
                np1 np1VarK = k();
                if (np1VarK.y(strM) == null) {
                    ry ryVarK = np1VarK.k(strM);
                    if (ryVarK == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM));
                    }
                    try {
                        if (((r12) wv8Var.b).s(wv8Var.c, ryVarK.i(), (sv5) wv8Var.d)) {
                            np1.b((np1) ryVarK.e, ryVarK, true);
                            ryVarK.b = true;
                        }
                        if (!z) {
                            try {
                                ryVarK.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!ryVarK.b) {
                            try {
                                ryVarK.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    t0.n("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            ((do3) this.d).A(strM);
        }
    }

    public void n() {
        int i;
        er4 er4Var;
        hr4 hr4Var = (hr4) this.e;
        qq4 qq4Var = hr4Var.k;
        qg6 qg6Var = hr4Var.g.t;
        if (qg6Var.s0().a == 0) {
            er4Var = null;
        } else {
            cb6 cb6VarO0 = qg6Var.o0();
            if (cb6VarO0.a.a(26, 34)) {
                i = cb6VarO0.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            int i2 = i;
            Handler handler = new Handler(((e62) qg6Var.a).t);
            if (qg6Var.f0(23)) {
                qg6Var.t0();
            }
            wl1 wl1VarS0 = qg6Var.s0();
            er4Var = new er4(i2, wl1VarS0.c, 0, wl1VarS0.d, handler, qg6Var);
        }
        hr4Var.n = er4Var;
        if (er4Var != null) {
            ((nq4) qq4Var.a).a.setPlaybackToRemote(er4Var.a());
            return;
        }
        int iU = r44.u(qg6Var.f0(21) ? qg6Var.n0() : ly.h);
        nq4 nq4Var = (nq4) qq4Var.a;
        nq4Var.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(iU);
        nq4Var.a.setPlaybackToLocal(builder.build());
    }

    public void o(jp4 jp4Var) {
        hr4 hr4Var = (hr4) this.e;
        qq4 qq4Var = hr4Var.k;
        u();
        if (jp4Var == null) {
            ((nq4) qq4Var.a).a.setRatingType(0);
        } else {
            ((nq4) qq4Var.a).a.setRatingType(r44.v(jp4Var.d.i));
        }
        hr4Var.N(hr4Var.g.t);
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
        if (this != ((hr4) ((op1) this.e).e).q) {
            return;
        }
        wn5.k0("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        hr4 hr4Var = (hr4) ((op1) this.e).e;
        if (this != hr4Var.q) {
            return;
        }
        hr4.E(hr4Var.k, r44.l((qp4) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        xq4 xq4Var = hr4Var.g;
        j29.a0(xq4Var.o, new tq4(xq4Var, 1));
    }

    public void p(int i, qg6 qg6Var) {
        hr4 hr4Var = (hr4) this.e;
        t(qg6Var.r0());
        q(qg6Var.f0(18) ? qg6Var.v0() : qp4.K);
        qg6Var.u0();
        u();
        s(qg6Var.U());
        r(qg6Var.f());
        qg6Var.s0();
        n();
        int i2 = qg6Var.f0(20) ? 4 : 0;
        if (hr4Var.r != i2) {
            hr4Var.r = i2;
            ((nq4) hr4Var.k.a).a.setFlags(i2 | 3);
        }
        o(qg6Var.q0());
    }

    public void q(qp4 qp4Var) {
        hr4 hr4Var = (hr4) this.e;
        qq4 qq4Var = hr4Var.k;
        CharSequence queueTitle = ((a) ((nc2) qq4Var.b).b).a.getQueueTitle();
        CharSequence charSequence = qp4Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        qg6 qg6Var = hr4Var.g.t;
        if (!hr4Var.w.a(17) || !qg6Var.o0().a(17)) {
            charSequence = null;
        }
        ((nq4) qq4Var.a).a.setQueueTitle(charSequence);
    }

    public void r(int i) {
        qq4 qq4Var = ((hr4) this.e).k;
        int iN = r44.n(i);
        nq4 nq4Var = (nq4) qq4Var.a;
        if (nq4Var.j != iN) {
            nq4Var.j = iN;
            synchronized (nq4Var.d) {
                for (int iBeginBroadcast = nq4Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((sf3) nq4Var.f.getBroadcastItem(iBeginBroadcast)).h(iN);
                    } catch (RemoteException | SecurityException e) {
                        t0.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nq4Var.f.finishBroadcast();
            }
        }
    }

    public void s(boolean z) {
        qq4 qq4Var = ((hr4) this.e).k;
        ImmutableSet immutableSet = r44.a;
        nq4 nq4Var = (nq4) qq4Var.a;
        if (nq4Var.k != z) {
            nq4Var.k = z ? 1 : 0;
            synchronized (nq4Var.d) {
                for (int iBeginBroadcast = nq4Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((sf3) nq4Var.f.getBroadcastItem(iBeginBroadcast)).P(z ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        t0.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nq4Var.f.finishBroadcast();
            }
        }
    }

    public void t(bm8 bm8Var) {
        v(bm8Var);
        u();
    }

    public void u() {
        Bitmap bitmap;
        Uri uri;
        hr4 hr4Var = (hr4) this.e;
        xq4 xq4Var = hr4Var.g;
        qg6 qg6Var = xq4Var.t;
        jp4 jp4VarQ0 = qg6Var.q0();
        qp4 qp4VarU0 = qg6Var.u0();
        long duration = -9223372036854775807L;
        if ((!qg6Var.f0(16) || !qg6Var.y0()) && qg6Var.f0(16)) {
            duration = qg6Var.getDuration();
        }
        String str = jp4VarQ0 != null ? jp4VarQ0.a : "";
        Uri uri2 = (jp4VarQ0 == null || (uri = jp4VarQ0.f.a) == null) ? null : uri;
        if (Objects.equals((qp4) this.b, qp4VarU0) && Objects.equals((String) this.c, str) && Objects.equals((Uri) this.d, uri2) && this.a == duration) {
            return;
        }
        this.c = str;
        this.d = uri2;
        this.b = qp4VarU0;
        this.a = duration;
        n94 n94VarR = xq4Var.m.r(qp4VarU0);
        if (n94VarR != null) {
            hr4Var.q = null;
            if (n94VarR.isDone()) {
                try {
                    bitmap = (Bitmap) ja1.t(n94VarR);
                } catch (CancellationException | ExecutionException e) {
                    wn5.k0("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                    bitmap = null;
                }
            } else {
                op1 op1Var = new op1();
                op1Var.e = this;
                op1Var.b = qp4VarU0;
                op1Var.c = str;
                op1Var.d = uri2;
                op1Var.a = duration;
                hr4Var.q = op1Var;
                Handler handler = xq4Var.l;
                Objects.requireNonNull(handler);
                n94VarR.e(new g6(14, n94VarR, op1Var, false), new od1(0, handler));
            }
            bitmap = null;
        } else {
            bitmap = null;
        }
        hr4.E(hr4Var.k, r44.l(qp4VarU0, str, uri2, duration, bitmap));
    }

    public void v(bm8 bm8Var) {
        hr4 hr4Var = (hr4) this.e;
        xq4 xq4Var = hr4Var.g;
        qg6 qg6Var = xq4Var.t;
        if (!hr4Var.w.a(17) || !qg6Var.o0().a(17) || bm8Var.p()) {
            hr4.D(hr4Var.k, null);
            return;
        }
        ImmutableSet immutableSet = r44.a;
        ArrayList arrayList = new ArrayList();
        am8 am8Var = new am8();
        int i = 0;
        for (int i2 = 0; i2 < bm8Var.o(); i2++) {
            arrayList.add(bm8Var.m(i2, am8Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        m11 m11Var = new m11(this, new AtomicInteger(0), arrayList, arrayList2, 4);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((jp4) arrayList.get(i3)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                m11Var.run();
            } else {
                n94 n94VarF = xq4Var.m.f(bArr);
                arrayList2.add(n94VarF);
                Handler handler = xq4Var.l;
                Objects.requireNonNull(handler);
                n94VarF.e(m11Var, new od1(i, handler));
            }
        }
    }

    public rq4 w(xr7 xr7Var, long j, LayoutDirection layoutDirection, i iVar) {
        if (((rq4) this.e) == null || !js3.i(xr7Var, (xr7) this.b) || !ey7.b(j, this.a) || layoutDirection != ((LayoutDirection) this.c) || !iVar.equals((i) this.d)) {
            this.b = xr7Var;
            this.a = j;
            this.c = layoutDirection;
            this.d = iVar;
            this.e = xr7Var.a(j, layoutDirection, iVar);
        }
        rq4 rq4Var = (rq4) this.e;
        js3.m(rq4Var);
        return rq4Var;
    }

    @Override // defpackage.gq4
    public void b() {
    }
}
