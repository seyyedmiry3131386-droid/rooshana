package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.f5;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements g2 {
    public List a;
    public List b;
    public Map c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public Integer h;
    public String i;
    public String j;
    public Boolean k;
    public String l;
    public Boolean m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public ConcurrentHashMap t;
    public String u;
    public f5 v;

    public final boolean equals(Object obj) {
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return Objects.equals(this.a, zVar.a) && Objects.equals(this.b, zVar.b) && Objects.equals(this.c, zVar.c) && Objects.equals(this.d, zVar.d) && Objects.equals(this.e, zVar.e) && Objects.equals(this.f, zVar.f) && Objects.equals(this.g, zVar.g) && Objects.equals(this.h, zVar.h) && Objects.equals(this.i, zVar.i) && Objects.equals(this.j, zVar.j) && Objects.equals(this.k, zVar.k) && Objects.equals(this.l, zVar.l) && Objects.equals(this.m, zVar.m) && Objects.equals(this.n, zVar.n) && Objects.equals(this.o, zVar.o) && Objects.equals(this.p, zVar.p) && Objects.equals(this.q, zVar.q) && Objects.equals(this.r, zVar.r) && Objects.equals(this.s, zVar.s) && Objects.equals(this.t, zVar.t) && Objects.equals(this.u, zVar.u) && Objects.equals(this.v, zVar.v);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, null, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.d != null) {
            cVar.q("filename");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("function");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("module");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("lineno");
            cVar.y(this.g);
        }
        if (this.h != null) {
            cVar.q("colno");
            cVar.y(this.h);
        }
        if (this.i != null) {
            cVar.q("abs_path");
            cVar.z(this.i);
        }
        if (this.j != null) {
            cVar.q("context_line");
            cVar.z(this.j);
        }
        if (this.k != null) {
            cVar.q("in_app");
            cVar.x(this.k);
        }
        if (this.l != null) {
            cVar.q("package");
            cVar.z(this.l);
        }
        if (this.m != null) {
            cVar.q("native");
            cVar.x(this.m);
        }
        if (this.n != null) {
            cVar.q("platform");
            cVar.z(this.n);
        }
        if (this.o != null) {
            cVar.q("image_addr");
            cVar.z(this.o);
        }
        if (this.p != null) {
            cVar.q("symbol_addr");
            cVar.z(this.p);
        }
        if (this.q != null) {
            cVar.q("instruction_addr");
            cVar.z(this.q);
        }
        if (this.r != null) {
            cVar.q("addr_mode");
            cVar.z(this.r);
        }
        if (this.u != null) {
            cVar.q("raw_function");
            cVar.z(this.u);
        }
        if (this.s != null) {
            cVar.q("symbol");
            cVar.z(this.s);
        }
        if (this.v != null) {
            cVar.q("lock");
            cVar.w(u0Var, this.v);
        }
        List list = this.a;
        if (list != null && !list.isEmpty()) {
            cVar.q("pre_context");
            cVar.w(u0Var, this.a);
        }
        List list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            cVar.q("post_context");
            cVar.w(u0Var, this.b);
        }
        Map map = this.c;
        if (map != null && !map.isEmpty()) {
            cVar.q("vars");
            cVar.w(u0Var, this.c);
        }
        ConcurrentHashMap concurrentHashMap = this.t;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.t, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
