package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface c1 {
    io.sentry.protocol.v A(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var, p3 p3Var);

    c1 B(String str);

    io.sentry.protocol.v C(w4 w4Var, h0 h0Var);

    void a(boolean z);

    a1 b();

    void c(long j);

    t0 clone();

    k1 d();

    io.sentry.transport.p e();

    boolean f();

    void g(Throwable th, j6 j6Var, String str);

    void h(f fVar, h0 h0Var);

    io.sentry.protocol.v i(io.sentry.internal.debugmeta.c cVar, h0 h0Var);

    boolean isEnabled();

    boolean j();

    void k(f fVar);

    io.sentry.protocol.v l(n3 n3Var);

    b6 m();

    m1 n(q6 q6Var, r6 r6Var);

    m1 o();

    void p();

    void q();

    io.sentry.protocol.v r(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var);

    void s(z3 z3Var);

    io.sentry.logger.a t();

    io.sentry.protocol.v u(c6 c6Var, h0 h0Var);

    s0 v();

    void w(String str);

    void x(z3 z3Var);

    io.sentry.protocol.v y(Throwable th);

    io.sentry.protocol.v z(Throwable th, h0 h0Var);
}
