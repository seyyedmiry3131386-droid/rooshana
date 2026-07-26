package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ie1 implements vw1 {
    public final UUID a;
    public final vv1 b;
    public final ry c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean g;
    public final qq4 h;
    public final fv i;
    public final ca7 j;
    public final long k;
    public final ArrayList l;
    public final Set m;
    public final Set n;
    public int o;
    public m52 p;
    public ge1 q;
    public ge1 r;
    public Looper s;
    public Handler t;
    public byte[] u;
    public ee6 v;
    public volatile hd w;

    public ie1(UUID uuid, ry ryVar, HashMap map, boolean z, int[] iArr, boolean z2, fv fvVar) {
        uuid.getClass();
        vy2.i("Use C.CLEARKEY_UUID instead", !xj0.b.equals(uuid));
        this.a = uuid;
        this.b = mo2.d;
        this.c = ryVar;
        this.d = map;
        this.e = z;
        this.f = iArr;
        this.g = z2;
        this.i = fvVar;
        this.h = new qq4(20);
        this.j = new ca7(17, this);
        this.l = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.k = 300000L;
    }

    public static boolean d(ge1 ge1Var) {
        ge1Var.o();
        if (ge1Var.o != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = ge1Var.f();
        drmSession$DrmSessionExceptionF.getClass();
        Throwable cause = drmSession$DrmSessionExceptionF.getCause();
        return (cause instanceof ResourceBusyException) || ub1.z(cause);
    }

    public static ArrayList h(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i = 0; i < drmInitData.d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.a[i];
            if ((schemeData.a(uuid) || (xj0.c.equals(uuid) && schemeData.a(xj0.b))) && (schemeData.e != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // defpackage.vw1
    public final void a() {
        m(true);
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ge1) arrayList.get(i2)).c(null);
            }
        }
        zx8 it = ImmutableSet.n(this.m).iterator();
        while (it.hasNext()) {
            ((he1) it.next()).a();
        }
        j();
    }

    public final pw1 b(Looper looper, sw1 sw1Var, b bVar, boolean z) {
        ArrayList arrayListH;
        if (this.w == null) {
            this.w = new hd(this, looper, 3);
        }
        DrmInitData drmInitData = bVar.r;
        int i = 0;
        ge1 ge1Var = null;
        if (drmInitData == null) {
            int iH = tv4.h(bVar.n);
            m52 m52Var = this.p;
            m52Var.getClass();
            if (m52Var.l() != 2 || !ko2.c) {
                int[] iArr = this.f;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iH) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && m52Var.l() != 1) {
                    ge1 ge1Var2 = this.q;
                    if (ge1Var2 == null) {
                        ge1 ge1VarG = g(ImmutableList.q(), true, null, z);
                        this.l.add(ge1VarG);
                        this.q = ge1VarG;
                    } else {
                        ge1Var2.d(null);
                    }
                    return this.q;
                }
            }
            return null;
        }
        if (this.u == null) {
            arrayListH = h(drmInitData, this.a, false);
            if (arrayListH.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.a);
                wn5.H("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                sw1Var.d(defaultDrmSessionManager$MissingSchemeDataException);
                return new q32(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
            }
        } else {
            arrayListH = null;
        }
        if (this.e) {
            Iterator it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ge1 ge1Var3 = (ge1) it.next();
                if (Objects.equals(ge1Var3.a, arrayListH)) {
                    ge1Var = ge1Var3;
                    break;
                }
            }
        } else {
            ge1Var = this.r;
        }
        if (ge1Var != null) {
            ge1Var.d(sw1Var);
            return ge1Var;
        }
        ge1 ge1VarG2 = g(arrayListH, false, sw1Var, z);
        if (!this.e) {
            this.r = ge1VarG2;
        }
        this.l.add(ge1VarG2);
        return ge1VarG2;
    }

    @Override // defpackage.vw1
    public final void c() {
        m52 ox1Var;
        m(true);
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    try {
                        ox1Var = new mo2(uuid);
                    } catch (Exception e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (UnsupportedSchemeException e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                wn5.F("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                ox1Var = new ox1();
            }
            this.p = ox1Var;
            ox1Var.d(new pj9(this));
            return;
        }
        if (this.k == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((ge1) arrayList.get(i2)).d(null);
            i2++;
        }
    }

    public final ge1 e(List list, boolean z, sw1 sw1Var) {
        this.p.getClass();
        boolean z2 = this.g | z;
        m52 m52Var = this.p;
        byte[] bArr = this.u;
        Looper looper = this.s;
        looper.getClass();
        ee6 ee6Var = this.v;
        ee6Var.getClass();
        ge1 ge1Var = new ge1(this.a, m52Var, this.h, this.j, list, z2, z, bArr, this.d, this.c, looper, this.i, ee6Var);
        ge1Var.d(sw1Var);
        if (this.k != -9223372036854775807L) {
            ge1Var.d(null);
        }
        return ge1Var;
    }

    @Override // defpackage.vw1
    public final uw1 f(sw1 sw1Var, b bVar) {
        vy2.s(this.o > 0);
        vy2.t(this.s);
        he1 he1Var = new he1(this, sw1Var);
        Handler handler = this.t;
        handler.getClass();
        handler.post(new g7(he1Var, bVar, 12));
        return he1Var;
    }

    public final ge1 g(List list, boolean z, sw1 sw1Var, boolean z2) {
        ge1 ge1VarE = e(list, z, sw1Var);
        boolean zD = d(ge1VarE);
        long j = this.k;
        Set set = this.n;
        if (zD && !set.isEmpty()) {
            zx8 it = ImmutableSet.n(set).iterator();
            while (it.hasNext()) {
                ((pw1) it.next()).c(null);
            }
            ge1VarE.c(sw1Var);
            if (j != -9223372036854775807L) {
                ge1VarE.c(null);
            }
            ge1VarE = e(list, z, sw1Var);
        }
        if (d(ge1VarE) && z2) {
            Set set2 = this.m;
            if (!set2.isEmpty()) {
                zx8 it2 = ImmutableSet.n(set2).iterator();
                while (it2.hasNext()) {
                    ((he1) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    zx8 it3 = ImmutableSet.n(set).iterator();
                    while (it3.hasNext()) {
                        ((pw1) it3.next()).c(null);
                    }
                }
                ge1VarE.c(sw1Var);
                if (j != -9223372036854775807L) {
                    ge1VarE.c(null);
                }
                return e(list, z, sw1Var);
            }
        }
        return ge1VarE;
    }

    @Override // defpackage.vw1
    public final pw1 i(sw1 sw1Var, b bVar) {
        m(false);
        vy2.s(this.o > 0);
        vy2.t(this.s);
        return b(this.s, sw1Var, bVar, true);
    }

    public final void j() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            m52 m52Var = this.p;
            m52Var.getClass();
            m52Var.a();
            this.p = null;
        }
    }

    @Override // defpackage.vw1
    public final void k(Looper looper, ee6 ee6Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.s;
                if (looper2 == null) {
                    this.s = looper;
                    this.t = new Handler(looper);
                } else {
                    vy2.s(looper2 == looper);
                    this.t.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v = ee6Var;
    }

    @Override // defpackage.vw1
    public final int l(b bVar) {
        m(false);
        m52 m52Var = this.p;
        m52Var.getClass();
        int iL = m52Var.l();
        DrmInitData drmInitData = bVar.r;
        if (drmInitData == null) {
            int iH = tv4.h(bVar.n);
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.u == null) {
            UUID uuid = this.a;
            if (h(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.d == 1 && drmInitData.a[0].a(xj0.b)) {
                    wn5.k0("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iL;
    }

    public final void m(boolean z) {
        if (z && this.s == null) {
            wn5.l0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.s;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            wn5.l0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }
}
