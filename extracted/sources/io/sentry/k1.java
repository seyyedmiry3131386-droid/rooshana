package io.sentry;

import defpackage.um;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface k1 {
    k1 A(String str, String str2);

    n4 B();

    k1 C(String str, String str2, n4 n4Var, Instrumenter instrumenter, um umVar);

    void a(SpanStatus spanStatus);

    n6 b();

    String c();

    SpanStatus d();

    e6 e();

    boolean f();

    void h(Number number, String str);

    void i(Throwable th);

    boolean j();

    void k(SpanStatus spanStatus);

    d l(List list);

    k1 m(String str, String str2, n4 n4Var, Instrumenter instrumenter);

    void n();

    k1 o(String str, String str2, um umVar);

    void p(Object obj, String str);

    void q();

    void s(String str);

    k1 u(String str);

    void w(String str, Long l, j2 j2Var);

    k6 x();

    n4 y();

    void z(SpanStatus spanStatus, n4 n4Var);
}
