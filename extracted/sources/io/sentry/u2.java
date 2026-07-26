package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements a1 {
    public static final u2 b = new u2();
    public final io.sentry.util.e a = new io.sentry.util.e(new u1(1));

    @Override // io.sentry.a1
    public final Map A() {
        return new HashMap();
    }

    @Override // io.sentry.a1
    public final List B() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public final List C() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public final void D(w4 w4Var) {
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.e E() {
        return new io.sentry.protocol.e();
    }

    @Override // io.sentry.a1
    public final k F(v3 v3Var) {
        return new k();
    }

    @Override // io.sentry.a1
    public final String G() {
        return null;
    }

    @Override // io.sentry.a1
    public final void H(x3 x3Var) {
    }

    @Override // io.sentry.a1
    public final void I(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.a1
    public final void J(m1 m1Var) {
    }

    @Override // io.sentry.a1
    public final List K() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.g0 L() {
        return null;
    }

    @Override // io.sentry.a1
    public final List M() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public final String N() {
        return null;
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.q a() {
        return null;
    }

    @Override // io.sentry.a1
    public final void clear() {
    }

    @Override // io.sentry.a1
    public final a1 clone() {
        return b;
    }

    @Override // io.sentry.a1
    public final k1 d() {
        return null;
    }

    @Override // io.sentry.a1
    public final Map getAttributes() {
        return new HashMap();
    }

    @Override // io.sentry.a1
    public final Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.a1
    public final SentryLevel getLevel() {
        return null;
    }

    @Override // io.sentry.a1
    public final void h(f fVar, h0 h0Var) {
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.i i() {
        return null;
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.v k() {
        return io.sentry.protocol.v.b;
    }

    @Override // io.sentry.a1
    public final void l(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.a1
    public final b6 m() {
        return (b6) this.a.a();
    }

    @Override // io.sentry.a1
    public final void n(io.sentry.protocol.g0 g0Var) {
    }

    @Override // io.sentry.a1
    public final m1 o() {
        return null;
    }

    @Override // io.sentry.a1
    public final i6 p() {
        return null;
    }

    @Override // io.sentry.a1
    public final io.sentry.internal.debugmeta.c q() {
        return null;
    }

    @Override // io.sentry.a1
    public final void r() {
    }

    @Override // io.sentry.a1
    public final io.sentry.featureflags.b s() {
        return io.sentry.featureflags.c.a;
    }

    @Override // io.sentry.a1
    public final i6 t() {
        return null;
    }

    @Override // io.sentry.a1
    public final Queue u() {
        return new ArrayDeque();
    }

    @Override // io.sentry.a1
    public final k w() {
        return new k();
    }

    @Override // io.sentry.a1
    public final i6 x(w3 w3Var) {
        return null;
    }

    @Override // io.sentry.a1
    public final void y(String str) {
    }

    @Override // io.sentry.a1
    public final f1 z() {
        return y2.a;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m36clone() {
        return b;
    }

    @Override // io.sentry.a1
    public final void v(k kVar) {
    }

    @Override // io.sentry.a1
    public final void g(Throwable th, j6 j6Var, String str) {
    }
}
