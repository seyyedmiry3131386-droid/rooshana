package io.sentry;

import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 implements c1 {
    public static final c4 a = new c4();

    @Override // io.sentry.c1
    public final io.sentry.protocol.v A(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var, p3 p3Var) {
        return h4.b().A(d0Var, n6Var, h0Var, p3Var);
    }

    @Override // io.sentry.c1
    public final c1 B(String str) {
        return h4.b().B("getCurrentScopes");
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v C(w4 w4Var, h0 h0Var) {
        return h4.b().C(w4Var, h0Var);
    }

    @Override // io.sentry.c1
    public final void a(boolean z) {
        h4.a();
    }

    @Override // io.sentry.c1
    public final a1 b() {
        return h4.b().b();
    }

    @Override // io.sentry.c1
    public final void c(long j) {
        h4.b().c(j);
    }

    @Override // io.sentry.c1
    public final k1 d() {
        return h4.b().d();
    }

    @Override // io.sentry.c1
    public final io.sentry.transport.p e() {
        return h4.b().e();
    }

    @Override // io.sentry.c1
    public final boolean f() {
        return h4.b().f();
    }

    @Override // io.sentry.c1
    public final void g(Throwable th, j6 j6Var, String str) {
        h4.b().g(th, j6Var, str);
    }

    @Override // io.sentry.c1
    public final void h(f fVar, h0 h0Var) {
        h4.b().h(fVar, h0Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v i(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        return h4.b().i(cVar, h0Var);
    }

    @Override // io.sentry.c1
    public final boolean isEnabled() {
        return h4.f();
    }

    @Override // io.sentry.c1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.c1
    public final void k(f fVar) {
        h(fVar, new h0());
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v l(n3 n3Var) {
        return h4.b().l(n3Var);
    }

    @Override // io.sentry.c1
    public final b6 m() {
        return h4.b().m();
    }

    @Override // io.sentry.c1
    public final m1 n(q6 q6Var, r6 r6Var) {
        return h4.b().n(q6Var, r6Var);
    }

    @Override // io.sentry.c1
    public final m1 o() {
        return h4.b().o();
    }

    @Override // io.sentry.c1
    public final void p() {
        h4.b().p();
    }

    @Override // io.sentry.c1
    public final void q() {
        h4.b().q();
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v r(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var) {
        return A(d0Var, n6Var, h0Var, null);
    }

    @Override // io.sentry.c1
    public final void s(z3 z3Var) {
        h4.b().s(z3Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.logger.a t() {
        return h4.b().t();
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v u(c6 c6Var, h0 h0Var) {
        return h4.b().u(c6Var, h0Var);
    }

    @Override // io.sentry.c1
    public final s0 v() {
        return h4.b().v();
    }

    @Override // io.sentry.c1
    public final /* synthetic */ void w(String str) {
        rm7.a(this, str);
    }

    @Override // io.sentry.c1
    public final void x(z3 z3Var) {
        s(z3Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v y(Throwable th) {
        return z(th, new h0());
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v z(Throwable th, h0 h0Var) {
        return h4.b().z(th, h0Var);
    }

    @Override // io.sentry.c1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m29clone() {
        return h4.b().m28clone();
    }
}
