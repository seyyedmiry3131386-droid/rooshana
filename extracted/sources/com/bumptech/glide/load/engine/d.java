package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import defpackage.bi6;
import defpackage.e22;
import defpackage.f22;
import defpackage.f81;
import defpackage.g22;
import defpackage.g67;
import defpackage.g82;
import defpackage.gv;
import defpackage.h22;
import defpackage.i22;
import defpackage.it2;
import defpackage.m58;
import defpackage.na1;
import defpackage.ok4;
import defpackage.vy2;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g82 {
    public static final gv w = new gv(17);
    public final h22 c;
    public final bi6 d;
    public final f22 f;
    public final it2 g;
    public final it2 h;
    public final it2 i;
    public g22 k;
    public boolean l;
    public boolean m;
    public g67 n;
    public DataSource o;
    public boolean p;
    public GlideException q;
    public boolean r;
    public i22 s;
    public a t;
    public volatile boolean u;
    public boolean v;
    public final f81 a = new f81(1, new ArrayList(2));
    public final m58 b = new m58();
    public final AtomicInteger j = new AtomicInteger();
    public final gv e = w;

    public d(it2 it2Var, it2 it2Var2, it2 it2Var3, it2 it2Var4, b bVar, b bVar2, wv8 wv8Var) {
        this.g = it2Var;
        this.h = it2Var2;
        this.i = it2Var4;
        this.f = bVar;
        this.c = bVar2;
        this.d = wv8Var;
    }

    public final synchronized void a(com.bumptech.glide.request.a aVar, Executor executor) {
        try {
            this.b.a();
            ((ArrayList) this.a.b).add(new e22(aVar, executor));
            if (this.p) {
                e(1);
                executor.execute(new c(this, aVar, 1));
            } else if (this.r) {
                e(1);
                executor.execute(new c(this, aVar, 0));
            } else {
                ok4.n("Cannot add callbacks to a cancelled EngineJob", !this.u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.g82
    public final m58 b() {
        return this.b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.u = true;
        a aVar = this.t;
        aVar.E = true;
        na1 na1Var = aVar.C;
        if (na1Var != null) {
            na1Var.cancel();
        }
        f22 f22Var = this.f;
        g22 g22Var = this.k;
        b bVar = (b) f22Var;
        synchronized (bVar) {
            HashMap map = bVar.a.a;
            if (equals(map.get(g22Var))) {
                map.remove(g22Var);
            }
        }
    }

    public final void d() {
        i22 i22Var;
        synchronized (this) {
            try {
                this.b.a();
                ok4.n("Not yet complete!", f());
                int iDecrementAndGet = this.j.decrementAndGet();
                ok4.n("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    i22Var = this.s;
                    i();
                } else {
                    i22Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i22Var != null) {
            i22Var.e();
        }
    }

    public final synchronized void e(int i) {
        i22 i22Var;
        ok4.n("Not yet complete!", f());
        if (this.j.getAndAdd(i) == 0 && (i22Var = this.s) != null) {
            i22Var.b();
        }
    }

    public final boolean f() {
        return this.r || this.p || this.u;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.u) {
                    i();
                    return;
                }
                if (((ArrayList) this.a.b).isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.r) {
                    throw new IllegalStateException("Already failed once");
                }
                this.r = true;
                g22 g22Var = this.k;
                f81 f81Var = this.a;
                f81Var.getClass();
                ArrayList<e22> arrayList = new ArrayList((ArrayList) f81Var.b);
                e(arrayList.size() + 1);
                ((b) this.f).d(this, g22Var, null);
                for (e22 e22Var : arrayList) {
                    e22Var.b.execute(new c(this, e22Var.a, 0));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.b.a();
                if (this.u) {
                    this.n.a();
                    i();
                    return;
                }
                if (((ArrayList) this.a.b).isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.p) {
                    throw new IllegalStateException("Already have resource");
                }
                gv gvVar = this.e;
                g67 g67Var = this.n;
                boolean z = this.l;
                g22 g22Var = this.k;
                h22 h22Var = this.c;
                gvVar.getClass();
                this.s = new i22(g67Var, z, true, g22Var, h22Var);
                this.p = true;
                f81 f81Var = this.a;
                f81Var.getClass();
                ArrayList<e22> arrayList = new ArrayList((ArrayList) f81Var.b);
                e(arrayList.size() + 1);
                ((b) this.f).d(this, this.k, this.s);
                for (e22 e22Var : arrayList) {
                    e22Var.b.execute(new c(this, e22Var.a, 1));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.k == null) {
            throw new IllegalArgumentException();
        }
        ((ArrayList) this.a.b).clear();
        this.k = null;
        this.s = null;
        this.n = null;
        this.r = false;
        this.u = false;
        this.p = false;
        this.v = false;
        this.t.l();
        this.t = null;
        this.q = null;
        this.o = null;
        this.d.d(this);
    }

    public final synchronized void j(com.bumptech.glide.request.a aVar) {
        try {
            this.b.a();
            ((ArrayList) this.a.b).remove(new e22(aVar, vy2.e));
            if (((ArrayList) this.a.b).isEmpty()) {
                c();
                if (this.p || this.r) {
                    if (this.j.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(a aVar) {
        this.t = aVar;
        DecodeJob$Stage decodeJob$StageH = aVar.h(DecodeJob$Stage.a);
        ((decodeJob$StageH == DecodeJob$Stage.b || decodeJob$StageH == DecodeJob$Stage.c) ? this.g : this.m ? this.i : this.h).execute(aVar);
    }
}
