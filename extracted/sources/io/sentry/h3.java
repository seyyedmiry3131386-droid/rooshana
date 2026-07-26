package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public interface h3 extends Closeable {
    Integer C();

    void H(u0 u0Var, AbstractMap abstractMap, String str);

    Float J0();

    Long L();

    Object M0(u0 u0Var, s1 s1Var);

    Object O0();

    void P0();

    TimeZone Q(u0 u0Var);

    String S();

    void T(boolean z);

    HashMap V(u0 u0Var, s1 s1Var);

    void W0();

    ArrayList Z0(u0 u0Var, s1 s1Var);

    void c1();

    Double h0();

    boolean hasNext();

    String m0();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    JsonToken peek();

    String t();

    void t0();

    Date v0(u0 u0Var);

    void z();

    Boolean z0();
}
