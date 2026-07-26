package io.sentry;

import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class n6 implements g2 {
    public final io.sentry.protocol.v a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final io.sentry.protocol.v j;
    public ConcurrentHashMap k;

    public n6(io.sentry.protocol.v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.v vVar2, String str8) {
        this.a = vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.i = str7;
        this.j = vVar2;
        this.h = str8;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("trace_id");
        cVar.w(u0Var, this.a);
        cVar.q("public_key");
        cVar.z(this.b);
        String str = this.c;
        if (str != null) {
            cVar.q("release");
            cVar.z(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.q("environment");
            cVar.z(str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            cVar.q("user_id");
            cVar.z(str3);
        }
        String str4 = this.f;
        if (str4 != null) {
            cVar.q("transaction");
            cVar.z(str4);
        }
        String str5 = this.g;
        if (str5 != null) {
            cVar.q("sample_rate");
            cVar.z(str5);
        }
        String str6 = this.h;
        if (str6 != null) {
            cVar.q("sample_rand");
            cVar.z(str6);
        }
        String str7 = this.i;
        if (str7 != null) {
            cVar.q("sampled");
            cVar.z(str7);
        }
        io.sentry.protocol.v vVar = this.j;
        if (vVar != null) {
            cVar.q("replay_id");
            cVar.w(u0Var, vVar);
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
