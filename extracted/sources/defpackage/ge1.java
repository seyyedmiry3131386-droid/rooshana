package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ge1 implements pw1 {
    public final List a;
    public final m52 b;
    public final qq4 c;
    public final ca7 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final p51 h;
    public final fv i;
    public final ee6 j;
    public final ry k;
    public final UUID l;
    public final Looper m;
    public final hd n;
    public int o;
    public int p;
    public HandlerThread q;
    public ee1 r;
    public b81 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public k52 w;
    public l52 x;

    public ge1(UUID uuid, m52 m52Var, qq4 qq4Var, ca7 ca7Var, List list, boolean z, boolean z2, byte[] bArr, HashMap map, ry ryVar, Looper looper, fv fvVar, ee6 ee6Var) {
        this.l = uuid;
        this.c = qq4Var;
        this.d = ca7Var;
        this.b = m52Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = map;
        this.k = ryVar;
        this.h = new p51();
        this.i = fvVar;
        this.j = ee6Var;
        this.o = 2;
        this.m = looper;
        this.n = new hd(this, looper, 2);
    }

    @Override // defpackage.pw1
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // defpackage.pw1
    public final boolean b() {
        o();
        return this.e;
    }

    @Override // defpackage.pw1
    public final void c(sw1 sw1Var) {
        o();
        int i = this.p;
        if (i <= 0) {
            wn5.F("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            hd hdVar = this.n;
            String str = j29.a;
            hdVar.removeCallbacksAndMessages(null);
            ee1 ee1Var = this.r;
            synchronized (ee1Var) {
                ee1Var.removeCallbacksAndMessages(null);
                ee1Var.b = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.h(bArr);
                this.u = null;
            }
        }
        if (sw1Var != null) {
            this.h.c(sw1Var);
            if (this.h.a(sw1Var) == 0) {
                sw1Var.e();
            }
        }
        ca7 ca7Var = this.d;
        int i3 = this.p;
        ie1 ie1Var = (ie1) ca7Var.b;
        if (i3 == 1 && ie1Var.o > 0 && ie1Var.k != -9223372036854775807L) {
            ie1Var.n.add(this);
            Handler handler = ie1Var.t;
            handler.getClass();
            handler.postAtTime(new b7(15, this), this, SystemClock.uptimeMillis() + ie1Var.k);
        } else if (i3 == 0) {
            ie1Var.l.remove(this);
            if (ie1Var.q == this) {
                ie1Var.q = null;
            }
            if (ie1Var.r == this) {
                ie1Var.r = null;
            }
            qq4 qq4Var = ie1Var.h;
            HashSet hashSet = (HashSet) qq4Var.a;
            hashSet.remove(this);
            if (((ge1) qq4Var.b) == this) {
                qq4Var.b = null;
                if (!hashSet.isEmpty()) {
                    ge1 ge1Var = (ge1) hashSet.iterator().next();
                    qq4Var.b = ge1Var;
                    l52 l52VarC = ge1Var.b.c();
                    ge1Var.x = l52VarC;
                    ee1 ee1Var2 = ge1Var.r;
                    String str2 = j29.a;
                    l52VarC.getClass();
                    ee1Var2.getClass();
                    ee1Var2.obtainMessage(1, new fe1(da4.d.getAndIncrement(), true, SystemClock.elapsedRealtime(), l52VarC)).sendToTarget();
                }
            }
            if (ie1Var.k != -9223372036854775807L) {
                Handler handler2 = ie1Var.t;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ie1Var.n.remove(this);
            }
        }
        ie1Var.j();
    }

    @Override // defpackage.pw1
    public final void d(sw1 sw1Var) {
        o();
        if (this.p < 0) {
            wn5.F("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (sw1Var != null) {
            p51 p51Var = this.h;
            synchronized (p51Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(p51Var.d);
                    arrayList.add(sw1Var);
                    p51Var.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) p51Var.b.get(sw1Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(p51Var.c);
                        hashSet.add(sw1Var);
                        p51Var.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    p51Var.b.put(sw1Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            vy2.s(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new ee1(this, this.q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (sw1Var != null && j() && this.h.a(sw1Var) == 1) {
            sw1Var.c(this.o);
        }
        ie1 ie1Var = (ie1) this.d.b;
        if (ie1Var.k != -9223372036854775807L) {
            ie1Var.n.remove(this);
            Handler handler = ie1Var.t;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.pw1
    public final boolean e(String str) {
        o();
        byte[] bArr = this.u;
        vy2.t(bArr);
        return this.b.n(str, bArr);
    }

    @Override // defpackage.pw1
    public final DrmSession$DrmSessionException f() {
        o();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.pw1
    public final b81 g() {
        o();
        return this.s;
    }

    @Override // defpackage.pw1
    public final int getState() {
        o();
        return this.o;
    }

    public final void h(gd1 gd1Var) {
        Set set;
        p51 p51Var = this.h;
        synchronized (p51Var.a) {
            set = p51Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sw1) it.next()).a();
        }
    }

    public final void i(boolean z) {
        long jMin;
        String str;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        String str2 = j29.a;
        boolean z2 = true;
        if (this.v == null) {
            n(bArr, 1, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.g(this.u, this.v);
            } catch (Exception | NoSuchMethodError e) {
                k(e, 1);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (xj0.d.equals(this.l)) {
            o();
            byte[] bArr2 = this.u;
            Pair pair = null;
            Map mapB = bArr2 == null ? null : this.b.b(bArr2);
            if (mapB != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapB.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str3 = (String) mapB.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            wn5.w("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            n(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            k(new KeysExpiredException(), 2);
            return;
        }
        this.o = 4;
        p51 p51Var = this.h;
        synchronized (p51Var.a) {
            set = p51Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sw1) it.next()).b();
        }
    }

    public final boolean j() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            boolean r1 = r6 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r7 = r6
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = defpackage.j29.A(r7)
            int r7 = defpackage.j29.z(r7)
            goto L5c
        L17:
            boolean r1 = r6 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 == 0) goto L1f
        L1d:
            r7 = r3
            goto L5c
        L1f:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L54
            boolean r1 = defpackage.ub1.y(r6)
            if (r1 == 0) goto L2c
            goto L54
        L2c:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L33
            r7 = 6007(0x1777, float:8.418E-42)
            goto L5c
        L33:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L3a
            r7 = 6001(0x1771, float:8.409E-42)
            goto L5c
        L3a:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r1 == 0) goto L41
            r7 = 6003(0x1773, float:8.412E-42)
            goto L5c
        L41:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L48
            r7 = 6008(0x1778, float:8.419E-42)
            goto L5c
        L48:
            if (r7 != r2) goto L4b
            goto L1d
        L4b:
            r1 = 2
            if (r7 != r1) goto L51
            r7 = 6004(0x1774, float:8.413E-42)
            goto L5c
        L51:
            r1 = 3
            if (r7 != r1) goto L56
        L54:
            r7 = r4
            goto L5c
        L56:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L5c:
            r0.<init>(r6, r7)
            r5.t = r0
            java.lang.String r7 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            defpackage.wn5.H(r7, r0, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L8e
            p51 r7 = r5.h
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            java.util.Set r7 = r7.c     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r7.next()
            sw1 r0 = (defpackage.sw1) r0
            r1 = r6
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L78
        L8b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r6
        L8e:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto Laa
            boolean r7 = defpackage.ub1.z(r6)
            if (r7 != 0) goto La2
            boolean r7 = defpackage.ub1.y(r6)
            if (r7 == 0) goto L9f
            goto La2
        L9f:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        La2:
            int r6 = r5.o
            r7 = 4
            if (r6 == r7) goto La9
            r5.o = r2
        La9:
            return
        Laa:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge1.k(java.lang.Throwable, int):void");
    }

    public final void l(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || ub1.y(th)) {
            this.c.z(this);
        } else {
            k(th, z ? 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r4 = this;
            boolean r0 = r4.j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            m52 r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.f()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            m52 r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            ee6 r3 = r4.j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.m(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            m52 r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            b81 r0 = r0.e(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            p51 r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            sw1 r3 = (defpackage.sw1) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = defpackage.ub1.y(r0)
            if (r2 == 0) goto L59
            qq4 r0 = r4.c
            r0.z(r4)
            goto L62
        L59:
            r4.k(r0, r1)
            goto L62
        L5d:
            qq4 r0 = r4.c
            r0.z(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge1.m():boolean");
    }

    public final void n(byte[] bArr, int i, boolean z) {
        try {
            k52 k52VarK = this.b.k(bArr, this.a, i, this.g);
            this.w = k52VarK;
            ee1 ee1Var = this.r;
            String str = j29.a;
            k52VarK.getClass();
            ee1Var.getClass();
            ee1Var.obtainMessage(2, new fe1(da4.d.getAndIncrement(), z, SystemClock.elapsedRealtime(), k52VarK)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            wn5.l0("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
