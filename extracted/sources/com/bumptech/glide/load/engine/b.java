package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.av;
import defpackage.f22;
import defpackage.ft2;
import defpackage.g22;
import defpackage.g67;
import defpackage.h22;
import defpackage.i22;
import defpackage.it2;
import defpackage.jt2;
import defpackage.kg4;
import defpackage.ko9;
import defpackage.md4;
import defpackage.ng4;
import defpackage.pg;
import defpackage.r6;
import defpackage.r79;
import defpackage.ry0;
import defpackage.sv5;
import defpackage.sx3;
import defpackage.vp7;
import defpackage.wv8;
import defpackage.x41;
import defpackage.xb1;
import defpackage.xe1;
import defpackage.xk0;
import defpackage.zo1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f22, h22 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final jt2 a;
    public final av b;
    public final ng4 c;
    public final ry0 d;
    public final xe1 e;
    public final pg f;
    public final vp7 g;

    public b(ng4 ng4Var, r79 r79Var, it2 it2Var, it2 it2Var2, it2 it2Var3, it2 it2Var4) throws Throwable {
        this.c = ng4Var;
        x41 x41Var = new x41(r79Var);
        vp7 vp7Var = new vp7(7);
        this.g = vp7Var;
        synchronized (this) {
            try {
                try {
                    synchronized (vp7Var) {
                        try {
                            vp7Var.e = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new av(18);
                    this.a = new jt2(1);
                    this.d = new ry0(it2Var, it2Var2, it2Var3, it2Var4, this, this);
                    this.f = new pg(x41Var);
                    this.e = new xe1(7);
                    ng4Var.d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void f(g67 g67Var) {
        if (!(g67Var instanceof i22)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((i22) g67Var).e();
    }

    public final wv8 a(ft2 ft2Var, Object obj, sx3 sx3Var, int i, int i2, Class cls, Class cls2, Priority priority, zo1 zo1Var, xk0 xk0Var, boolean z, boolean z2, sv5 sv5Var, boolean z3, boolean z4, com.bumptech.glide.request.a aVar, ko9 ko9Var) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = md4.a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        g22 g22Var = new g22(obj, sx3Var, i, i2, xk0Var, cls, cls2, sv5Var);
        synchronized (this) {
            try {
                i22 i22VarC = c(g22Var, z3, jElapsedRealtimeNanos);
                if (i22VarC == null) {
                    return g(ft2Var, obj, sx3Var, i, i2, cls, cls2, priority, zo1Var, xk0Var, z, z2, sv5Var, z3, z4, aVar, ko9Var, g22Var, jElapsedRealtimeNanos);
                }
                aVar.h(i22VarC, DataSource.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final i22 b(g22 g22Var) throws Throwable {
        i22 i22Var;
        Object obj;
        b bVar;
        g22 g22Var2;
        ng4 ng4Var = this.c;
        synchronized (ng4Var) {
            try {
                kg4 kg4Var = (kg4) ((LinkedHashMap) ng4Var.c).remove(g22Var);
                i22Var = null;
                if (kg4Var == null) {
                    obj = null;
                } else {
                    ng4Var.b -= (long) kg4Var.b;
                    obj = kg4Var.a;
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        g67 g67Var = (g67) obj;
        if (g67Var == null) {
            bVar = this;
            g22Var2 = g22Var;
        } else if (g67Var instanceof i22) {
            i22Var = (i22) g67Var;
            bVar = this;
            g22Var2 = g22Var;
        } else {
            bVar = this;
            g22Var2 = g22Var;
            i22Var = new i22(g67Var, true, true, g22Var2, bVar);
        }
        if (i22Var != null) {
            i22Var.b();
            bVar.g.l(g22Var2, i22Var);
        }
        return i22Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i22 c(g22 g22Var, boolean z, long j) throws Throwable {
        i22 i22Var;
        if (z) {
            vp7 vp7Var = this.g;
            synchronized (vp7Var) {
                r6 r6Var = (r6) ((HashMap) vp7Var.c).get(g22Var);
                if (r6Var == null) {
                    i22Var = null;
                } else {
                    i22Var = (i22) r6Var.get();
                    if (i22Var == null) {
                        vp7Var.v(r6Var);
                    }
                }
            }
            if (i22Var != null) {
                i22Var.b();
            }
            if (i22Var != null) {
                if (h) {
                    int i = md4.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(g22Var);
                }
                return i22Var;
            }
            i22 i22VarB = b(g22Var);
            if (i22VarB != null) {
                if (h) {
                    int i2 = md4.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(g22Var);
                }
                return i22VarB;
            }
        }
        return null;
    }

    public final synchronized void d(d dVar, g22 g22Var, i22 i22Var) {
        if (i22Var != null) {
            try {
                if (i22Var.a) {
                    this.g.l(g22Var, i22Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map = this.a.a;
        if (dVar.equals(map.get(g22Var))) {
            map.remove(g22Var);
        }
    }

    public final void e(sx3 sx3Var, i22 i22Var) {
        vp7 vp7Var = this.g;
        synchronized (vp7Var) {
            r6 r6Var = (r6) ((HashMap) vp7Var.c).remove(sx3Var);
            if (r6Var != null) {
                r6Var.c = null;
                r6Var.clear();
            }
        }
        if (i22Var.a) {
        } else {
            this.e.v(i22Var, false);
        }
    }

    public final wv8 g(ft2 ft2Var, Object obj, sx3 sx3Var, int i, int i2, Class cls, Class cls2, Priority priority, zo1 zo1Var, Map map, boolean z, boolean z2, sv5 sv5Var, boolean z3, boolean z4, com.bumptech.glide.request.a aVar, Executor executor, g22 g22Var, long j) {
        d dVar = (d) this.a.a.get(g22Var);
        if (dVar != null) {
            dVar.a(aVar, executor);
            if (h) {
                int i3 = md4.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(g22Var);
            }
            return new wv8(this, aVar, dVar);
        }
        d dVar2 = (d) ((wv8) this.d.g).e();
        synchronized (dVar2) {
            dVar2.k = g22Var;
            dVar2.l = z3;
            dVar2.m = z4;
        }
        pg pgVar = this.f;
        a aVar2 = (a) ((wv8) pgVar.d).e();
        int i4 = pgVar.b;
        pgVar.b = i4 + 1;
        xb1 xb1Var = aVar2.a;
        x41 x41Var = aVar2.d;
        xb1Var.c = ft2Var;
        xb1Var.d = obj;
        xb1Var.n = sx3Var;
        xb1Var.e = i;
        xb1Var.f = i2;
        xb1Var.p = zo1Var;
        xb1Var.g = cls;
        xb1Var.h = x41Var;
        xb1Var.k = cls2;
        xb1Var.o = priority;
        xb1Var.i = sv5Var;
        xb1Var.j = map;
        xb1Var.q = z;
        xb1Var.r = z2;
        aVar2.h = ft2Var;
        aVar2.i = sx3Var;
        aVar2.j = priority;
        aVar2.k = g22Var;
        aVar2.l = i;
        aVar2.m = i2;
        aVar2.n = zo1Var;
        aVar2.o = sv5Var;
        aVar2.p = dVar2;
        aVar2.q = i4;
        aVar2.s = DecodeJob$RunReason.a;
        aVar2.t = obj;
        aVar2.u = ft2Var.h;
        aVar2.v = (Supplier) sv5Var.c(a.G);
        jt2 jt2Var = this.a;
        jt2Var.getClass();
        jt2Var.a.put(g22Var, dVar2);
        dVar2.a(aVar, executor);
        dVar2.k(aVar2);
        if (h) {
            int i5 = md4.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(g22Var);
        }
        return new wv8(this, aVar, dVar2);
    }
}
