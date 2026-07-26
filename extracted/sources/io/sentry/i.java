package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends io.sentry.protocol.e {
    public final io.sentry.protocol.e c;
    public final io.sentry.protocol.e d;
    public final io.sentry.protocol.e e;
    public final ScopeType f;

    public i(io.sentry.protocol.e eVar, io.sentry.protocol.e eVar2, io.sentry.protocol.e eVar3, ScopeType scopeType) {
        this.c = eVar;
        this.d = eVar2;
        this.e = eVar3;
        this.f = scopeType;
    }

    @Override // io.sentry.protocol.e
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Set b() {
        return y().a.entrySet();
    }

    @Override // io.sentry.protocol.e
    public final Object c(Object obj) {
        Object objC = this.e.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.d.c(obj);
        return objC2 != null ? objC2 : this.c.c(obj);
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.e.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.d.d();
        return aVarD2 != null ? aVarD2 : this.c.d();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.g e() {
        io.sentry.protocol.g gVarE = this.e.e();
        if (gVarE != null) {
            return gVarE;
        }
        io.sentry.protocol.g gVarE2 = this.d.e();
        return gVarE2 != null ? gVarE2 : this.c.e();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.i f() {
        io.sentry.protocol.i iVarF = this.e.f();
        if (iVarF != null) {
            return iVarF;
        }
        io.sentry.protocol.i iVarF2 = this.d.f();
        return iVarF2 != null ? iVarF2 : this.c.f();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.p g() {
        io.sentry.protocol.p pVarG = this.e.g();
        if (pVarG != null) {
            return pVarG;
        }
        io.sentry.protocol.p pVarG2 = this.d.g();
        return pVarG2 != null ? pVarG2 : this.c.g();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.x h() {
        io.sentry.protocol.x xVarH = this.e.h();
        if (xVarH != null) {
            return xVarH;
        }
        io.sentry.protocol.x xVarH2 = this.d.h();
        return xVarH2 != null ? xVarH2 : this.c.h();
    }

    @Override // io.sentry.protocol.e
    public final k6 i() {
        k6 k6VarI = this.e.i();
        if (k6VarI != null) {
            return k6VarI;
        }
        k6 k6VarI2 = this.d.i();
        return k6VarI2 != null ? k6VarI2 : this.c.i();
    }

    @Override // io.sentry.protocol.e
    public final Enumeration j() {
        return y().a.keys();
    }

    @Override // io.sentry.protocol.e
    public final Object k(Object obj, String str) {
        return x().k(obj, str);
    }

    @Override // io.sentry.protocol.e
    public final void l(io.sentry.protocol.e eVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void m(io.sentry.protocol.a aVar) {
        x().m(aVar);
    }

    @Override // io.sentry.protocol.e
    public final void n(io.sentry.protocol.d dVar) {
        x().n(dVar);
    }

    @Override // io.sentry.protocol.e
    public final void o(io.sentry.protocol.g gVar) {
        x().o(gVar);
    }

    @Override // io.sentry.protocol.e
    public final void p(io.sentry.protocol.i iVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void q(io.sentry.protocol.l lVar) {
        x().q(lVar);
    }

    @Override // io.sentry.protocol.e
    public final void r(io.sentry.protocol.p pVar) {
        x().r(pVar);
    }

    @Override // io.sentry.protocol.e
    public final void s(io.sentry.protocol.r rVar) {
        x().s(rVar);
    }

    @Override // io.sentry.protocol.e, io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        y().serialize(i3Var, u0Var);
    }

    @Override // io.sentry.protocol.e
    public final void t(io.sentry.protocol.x xVar) {
        x().t(xVar);
    }

    @Override // io.sentry.protocol.e
    public final void u(io.sentry.protocol.e0 e0Var) {
        x().u(e0Var);
    }

    @Override // io.sentry.protocol.e
    public final void v(k6 k6Var) {
        x().v(k6Var);
    }

    public final io.sentry.protocol.e x() {
        int i = h.a[this.f.ordinal()];
        io.sentry.protocol.e eVar = this.e;
        return i != 1 ? i != 2 ? i != 3 ? eVar : this.c : this.d : eVar;
    }

    public final io.sentry.protocol.e y() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.l(this.c);
        eVar.l(this.d);
        eVar.l(this.e);
        return eVar;
    }
}
