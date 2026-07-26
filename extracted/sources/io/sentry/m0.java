package io.sentry;

import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements t0 {
    public final b4 a;

    public m0(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v A(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var, p3 p3Var) {
        return this.a.A(d0Var, n6Var, h0Var, p3Var);
    }

    @Override // io.sentry.c1
    public final c1 B(String str) {
        return this.a.B("getCurrentScopes");
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v C(w4 w4Var, h0 h0Var) {
        return this.a.C(w4Var, h0Var);
    }

    @Override // io.sentry.c1
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // io.sentry.c1
    public final a1 b() {
        return this.a.a;
    }

    @Override // io.sentry.c1
    public final void c(long j) {
        this.a.c(j);
    }

    @Override // io.sentry.c1
    /* JADX INFO: renamed from: clone */
    public final t0 m29clone() {
        return this.a.m29clone();
    }

    @Override // io.sentry.c1
    public final k1 d() {
        return this.a.d();
    }

    @Override // io.sentry.c1
    public final io.sentry.transport.p e() {
        return this.a.e();
    }

    @Override // io.sentry.c1
    public final boolean f() {
        return this.a.f();
    }

    @Override // io.sentry.c1
    public final void g(Throwable th, j6 j6Var, String str) {
        this.a.g(th, j6Var, str);
    }

    @Override // io.sentry.c1
    public final void h(f fVar, h0 h0Var) {
        this.a.h(fVar, h0Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v i(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        return this.a.i(cVar, h0Var);
    }

    @Override // io.sentry.c1
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // io.sentry.c1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.c1
    public final void k(f fVar) {
        this.a.k(fVar);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v l(n3 n3Var) {
        return this.a.l(n3Var);
    }

    @Override // io.sentry.c1
    public final b6 m() {
        return this.a.m();
    }

    @Override // io.sentry.c1
    public final m1 n(q6 q6Var, r6 r6Var) {
        return this.a.n(q6Var, r6Var);
    }

    @Override // io.sentry.c1
    public final m1 o() {
        return this.a.o();
    }

    @Override // io.sentry.c1
    public final void p() {
        this.a.p();
    }

    @Override // io.sentry.c1
    public final void q() {
        this.a.q();
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v r(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var) {
        return this.a.A(d0Var, n6Var, h0Var, null);
    }

    @Override // io.sentry.c1
    public final void s(z3 z3Var) {
        this.a.s(z3Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.logger.a t() {
        return this.a.f;
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v u(c6 c6Var, h0 h0Var) {
        return this.a.u(c6Var, h0Var);
    }

    @Override // io.sentry.c1
    public final s0 v() {
        return this.a.g;
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
        return this.a.z(th, h0Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m34clone() {
        return this.a.m29clone();
    }
}
