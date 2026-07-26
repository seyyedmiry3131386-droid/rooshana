package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements g2 {
    public Long a;
    public Integer b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public a0 i;
    public Map j;
    public ConcurrentHashMap k;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("id");
            cVar.y(this.a);
        }
        if (this.b != null) {
            cVar.q("priority");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("state");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("crashed");
            cVar.x(this.e);
        }
        if (this.f != null) {
            cVar.q("current");
            cVar.x(this.f);
        }
        if (this.g != null) {
            cVar.q("daemon");
            cVar.x(this.g);
        }
        if (this.h != null) {
            cVar.q("main");
            cVar.x(this.h);
        }
        if (this.i != null) {
            cVar.q("stacktrace");
            cVar.w(u0Var, this.i);
        }
        if (this.j != null) {
            cVar.q("held_locks");
            cVar.w(u0Var, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.k, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
