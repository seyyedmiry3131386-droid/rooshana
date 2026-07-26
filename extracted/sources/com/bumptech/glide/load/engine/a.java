package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.bi6;
import defpackage.ct2;
import defpackage.do3;
import defpackage.ea4;
import defpackage.ft2;
import defpackage.g22;
import defpackage.g67;
import defpackage.g82;
import defpackage.ga1;
import defpackage.gz;
import defpackage.h67;
import defpackage.hd4;
import defpackage.la1;
import defpackage.ln3;
import defpackage.m58;
import defpackage.m67;
import defpackage.ma1;
import defpackage.md4;
import defpackage.na1;
import defpackage.o40;
import defpackage.pt2;
import defpackage.pv5;
import defpackage.sv5;
import defpackage.sx3;
import defpackage.ta1;
import defpackage.w18;
import defpackage.wv8;
import defpackage.x41;
import defpackage.xb1;
import defpackage.xk0;
import defpackage.yt1;
import defpackage.zo1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ma1, Runnable, Comparable, g82 {
    public static final pv5 G = new pv5("glide_thread_priority_override", null, pv5.e);
    public DataSource A;
    public la1 B;
    public volatile na1 C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public final x41 d;
    public final bi6 e;
    public ft2 h;
    public sx3 i;
    public Priority j;
    public g22 k;
    public int l;
    public int m;
    public zo1 n;
    public sv5 o;
    public d p;
    public int q;
    public DecodeJob$Stage r;
    public DecodeJob$RunReason s;
    public Object t;
    public pt2 u;
    public Supplier v;
    public Thread w;
    public sx3 x;
    public sx3 y;
    public Object z;
    public final xb1 a = new xb1();
    public final ArrayList b = new ArrayList();
    public final m58 c = new m58();
    public final wv8 f = new wv8(18, false);
    public final gz g = new gz();

    public a(x41 x41Var, wv8 wv8Var) {
        this.d = x41Var;
        this.e = wv8Var;
    }

    @Override // defpackage.ma1
    public final void a(sx3 sx3Var, Object obj, la1 la1Var, DataSource dataSource, sx3 sx3Var2) {
        this.x = sx3Var;
        this.z = obj;
        this.B = la1Var;
        this.A = dataSource;
        this.y = sx3Var2;
        this.F = sx3Var != this.a.a().get(0);
        if (Thread.currentThread() != this.w) {
            n(DecodeJob$RunReason.c);
        } else {
            f();
        }
    }

    @Override // defpackage.g82
    public final m58 b() {
        return this.c;
    }

    @Override // defpackage.ma1
    public final void c(sx3 sx3Var, Exception exc, la1 la1Var, DataSource dataSource) {
        la1Var.c();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class dataClass = la1Var.getDataClass();
        glideException.b = sx3Var;
        glideException.c = dataSource;
        glideException.d = dataClass;
        this.b.add(glideException);
        if (Thread.currentThread() != this.w) {
            n(DecodeJob$RunReason.b);
        } else {
            p();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        int iOrdinal = this.j.ordinal() - aVar.j.ordinal();
        return iOrdinal == 0 ? this.q - aVar.q : iOrdinal;
    }

    public final g67 d(la1 la1Var, Object obj, DataSource dataSource) {
        if (obj == null) {
            la1Var.c();
            return null;
        }
        try {
            int i = md4.a;
            SystemClock.elapsedRealtimeNanos();
            g67 g67VarE = e(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                g67VarE.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.k);
                Thread.currentThread().getName();
            }
            return g67VarE;
        } finally {
            la1Var.c();
        }
    }

    public final g67 e(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        xb1 xb1Var = this.a;
        ea4 ea4VarC = xb1Var.c(cls);
        sv5 sv5Var = this.o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.d || xb1Var.r;
            pv5 pv5Var = yt1.i;
            Boolean bool = (Boolean) sv5Var.c(pv5Var);
            if (bool == null || (bool.booleanValue() && !z)) {
                sv5Var = new sv5();
                xk0 xk0Var = this.o.b;
                xk0 xk0Var2 = sv5Var.b;
                xk0Var2.g(xk0Var);
                xk0Var2.put(pv5Var, Boolean.valueOf(z));
            }
        }
        sv5 sv5Var2 = sv5Var;
        ta1 ta1VarH = this.h.b().h(obj);
        try {
            return ea4VarC.a(this.l, this.m, ta1VarH, new do3(this, dataSource), sv5Var2);
        } finally {
            ta1VarH.c();
        }
    }

    public final void f() {
        g67 g67VarD;
        boolean zB;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B;
            int i = md4.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        hd4 hd4Var = null;
        if (((Map) this.u.b).containsKey(ct2.class) && (supplier = this.v) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.v.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.v = null;
            }
        }
        try {
            g67VarD = d(this.B, this.z, this.A);
        } catch (GlideException e) {
            sx3 sx3Var = this.y;
            DataSource dataSource = this.A;
            e.b = sx3Var;
            e.c = dataSource;
            e.d = null;
            this.b.add(e);
            g67VarD = null;
        }
        if (g67VarD == null) {
            p();
            return;
        }
        DataSource dataSource2 = this.A;
        boolean z = this.F;
        if (g67VarD instanceof ln3) {
            ((ln3) g67VarD).initialize();
        }
        if (((hd4) this.f.d) != null) {
            hd4Var = (hd4) hd4.e.e();
            hd4Var.d = false;
            hd4Var.c = true;
            hd4Var.b = g67VarD;
            g67VarD = hd4Var;
        }
        i(g67VarD, dataSource2, z);
        this.r = DecodeJob$Stage.e;
        try {
            wv8 wv8Var = this.f;
            if (((hd4) wv8Var.d) != null) {
                x41 x41Var = this.d;
                sv5 sv5Var = this.o;
                wv8Var.getClass();
                try {
                    x41Var.a().m((sx3) wv8Var.b, new wv8((m67) wv8Var.c, (hd4) wv8Var.d, sv5Var, 17));
                    ((hd4) wv8Var.d).e();
                } catch (Throwable th) {
                    ((hd4) wv8Var.d).e();
                    throw th;
                }
            }
            gz gzVar = this.g;
            synchronized (gzVar) {
                gzVar.b = true;
                zB = gzVar.b();
            }
            if (zB) {
                m();
            }
        } finally {
            if (hd4Var != null) {
                hd4Var.e();
            }
        }
    }

    public final na1 g() {
        int iOrdinal = this.r.ordinal();
        xb1 xb1Var = this.a;
        if (iOrdinal == 1) {
            return new h67(xb1Var, this);
        }
        if (iOrdinal == 2) {
            return new ga1(xb1Var.a(), xb1Var, this);
        }
        if (iOrdinal == 3) {
            return new w18(xb1Var, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.r);
    }

    public final DecodeJob$Stage h(DecodeJob$Stage decodeJob$Stage) {
        boolean z;
        boolean z2;
        int iOrdinal = decodeJob$Stage.ordinal();
        if (iOrdinal == 0) {
            switch (this.n.a) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            DecodeJob$Stage decodeJob$Stage2 = DecodeJob$Stage.b;
            return z ? decodeJob$Stage2 : h(decodeJob$Stage2);
        }
        if (iOrdinal == 1) {
            switch (this.n.a) {
                case 0:
                    z2 = false;
                    break;
                case 1:
                default:
                    z2 = true;
                    break;
            }
            DecodeJob$Stage decodeJob$Stage3 = DecodeJob$Stage.c;
            return z2 ? decodeJob$Stage3 : h(decodeJob$Stage3);
        }
        if (iOrdinal == 2) {
            return DecodeJob$Stage.d;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return DecodeJob$Stage.f;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + decodeJob$Stage);
    }

    public final void i(g67 g67Var, DataSource dataSource, boolean z) {
        if (((Map) this.u.b).containsKey(ct2.class)) {
            o();
        }
        r();
        d dVar = this.p;
        synchronized (dVar) {
            dVar.n = g67Var;
            dVar.o = dataSource;
            dVar.v = z;
        }
        dVar.h();
    }

    public final void j() {
        if (((Map) this.u.b).containsKey(ct2.class)) {
            o();
        }
        r();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.b));
        d dVar = this.p;
        synchronized (dVar) {
            dVar.q = glideException;
        }
        dVar.g();
        k();
    }

    public final void k() {
        boolean zB;
        gz gzVar = this.g;
        synchronized (gzVar) {
            gzVar.c = true;
            zB = gzVar.b();
        }
        if (zB) {
            m();
        }
    }

    public final void l() {
        boolean zB;
        gz gzVar = this.g;
        synchronized (gzVar) {
            gzVar.a = true;
            zB = gzVar.b();
        }
        if (zB) {
            m();
        }
    }

    public final void m() {
        gz gzVar = this.g;
        synchronized (gzVar) {
            gzVar.b = false;
            gzVar.a = false;
            gzVar.c = false;
        }
        wv8 wv8Var = this.f;
        wv8Var.b = null;
        wv8Var.c = null;
        wv8Var.d = null;
        xb1 xb1Var = this.a;
        xb1Var.c = null;
        xb1Var.d = null;
        xb1Var.n = null;
        xb1Var.g = null;
        xb1Var.k = null;
        xb1Var.i = null;
        xb1Var.o = null;
        xb1Var.j = null;
        xb1Var.p = null;
        xb1Var.a.clear();
        xb1Var.l = false;
        xb1Var.b.clear();
        xb1Var.m = false;
        this.D = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.E = false;
        this.t = null;
        this.b.clear();
        this.e.d(this);
    }

    public final void n(DecodeJob$RunReason decodeJob$RunReason) {
        this.s = decodeJob$RunReason;
        d dVar = this.p;
        (dVar.m ? dVar.i : dVar.h).execute(this);
    }

    public final void o() {
        if (!((Map) this.u.b).containsKey(ct2.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.v;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.v = null;
        }
    }

    public final void p() {
        this.w = Thread.currentThread();
        int i = md4.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.E && this.C != null && !(zB = this.C.b())) {
            this.r = h(this.r);
            this.C = g();
            if (this.r == DecodeJob$Stage.d) {
                n(DecodeJob$RunReason.b);
                return;
            }
        }
        if ((this.r == DecodeJob$Stage.f || this.E) && !zB) {
            j();
        }
    }

    public final void q() {
        int iOrdinal = this.s.ordinal();
        if (iOrdinal == 0) {
            this.r = h(DecodeJob$Stage.a);
            this.C = g();
            p();
        } else if (iOrdinal == 1) {
            p();
        } else if (iOrdinal == 2) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.s);
        }
    }

    public final void r() {
        this.c.a();
        if (this.D) {
            throw new IllegalStateException("Already notified", this.b.isEmpty() ? null : (Throwable) o40.u(1, this.b));
        }
        this.D = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la1 la1Var = this.B;
        try {
            try {
                if (this.E) {
                    j();
                    if (la1Var != null) {
                        la1Var.c();
                        return;
                    }
                    return;
                }
                q();
                if (la1Var != null) {
                    la1Var.c();
                }
            } catch (Throwable th) {
                if (la1Var != null) {
                    la1Var.c();
                }
                throw th;
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.r);
            }
            if (this.r != DecodeJob$Stage.e) {
                this.b.add(th2);
                j();
            }
            if (!this.E) {
                throw th2;
            }
            throw th2;
        }
    }
}
