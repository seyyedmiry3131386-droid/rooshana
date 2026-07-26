package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public interface a1 {
    Map A();

    List B();

    List C();

    void D(w4 w4Var);

    io.sentry.protocol.e E();

    k F(v3 v3Var);

    String G();

    void H(x3 x3Var);

    void I(io.sentry.protocol.v vVar);

    void J(m1 m1Var);

    List K();

    io.sentry.protocol.g0 L();

    List M();

    String N();

    io.sentry.protocol.q a();

    void clear();

    a1 clone();

    k1 d();

    void g(Throwable th, j6 j6Var, String str);

    Map getAttributes();

    Map getExtras();

    SentryLevel getLevel();

    void h(f fVar, h0 h0Var);

    io.sentry.protocol.i i();

    io.sentry.protocol.v k();

    void l(io.sentry.protocol.v vVar);

    b6 m();

    void n(io.sentry.protocol.g0 g0Var);

    m1 o();

    i6 p();

    io.sentry.internal.debugmeta.c q();

    void r();

    io.sentry.featureflags.b s();

    i6 t();

    Queue u();

    void v(k kVar);

    k w();

    i6 x(w3 w3Var);

    void y(String str);

    f1 z();
}
