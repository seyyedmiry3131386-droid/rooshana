package io.sentry;

import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w4 extends k4 implements g2 {
    public Date p;
    public io.sentry.protocol.o q;
    public String r;
    public c2 s;
    public c2 t;
    public SentryLevel u;
    public String v;
    public List w;
    public ConcurrentHashMap x;
    public AbstractMap y;

    public w4(Throwable th) {
        this();
        this.j = th;
    }

    public final ArrayList d() {
        c2 c2Var = this.t;
        if (c2Var == null) {
            return null;
        }
        return c2Var.a;
    }

    public final ArrayList e() {
        c2 c2Var = this.s;
        if (c2Var != null) {
            return c2Var.a;
        }
        return null;
    }

    public final io.sentry.protocol.u f() {
        Boolean bool;
        c2 c2Var = this.t;
        if (c2Var == null) {
            return null;
        }
        for (io.sentry.protocol.u uVar : c2Var.a) {
            io.sentry.protocol.n nVar = uVar.f;
            if (nVar != null && (bool = nVar.d) != null && !bool.booleanValue()) {
                return uVar;
            }
        }
        return null;
    }

    public final boolean g() {
        c2 c2Var = this.t;
        return (c2Var == null || c2Var.a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("timestamp");
        cVar.w(u0Var, this.p);
        if (this.q != null) {
            cVar.q("message");
            cVar.w(u0Var, this.q);
        }
        if (this.r != null) {
            cVar.q("logger");
            cVar.z(this.r);
        }
        c2 c2Var = this.s;
        if (c2Var != null && !c2Var.a.isEmpty()) {
            cVar.q("threads");
            cVar.d();
            cVar.q("values");
            cVar.w(u0Var, this.s.a);
            cVar.n();
        }
        c2 c2Var2 = this.t;
        if (c2Var2 != null && !c2Var2.a.isEmpty()) {
            cVar.q("exception");
            cVar.d();
            cVar.q("values");
            cVar.w(u0Var, this.t.a);
            cVar.n();
        }
        if (this.u != null) {
            cVar.q("level");
            cVar.w(u0Var, this.u);
        }
        if (this.v != null) {
            cVar.q("transaction");
            cVar.z(this.v);
        }
        if (this.w != null) {
            cVar.q("fingerprint");
            cVar.w(u0Var, this.w);
        }
        if (this.y != null) {
            cVar.q("modules");
            cVar.w(u0Var, this.y);
        }
        io.sentry.config.a.X(this, cVar, u0Var);
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.x, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }

    public w4() {
        io.sentry.protocol.v vVar = new io.sentry.protocol.v();
        Date dateZ = io.sentry.config.a.z();
        super(vVar);
        this.p = dateZ;
    }
}
