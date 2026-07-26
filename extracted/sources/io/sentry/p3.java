package io.sentry;

import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class p3 implements g2 {
    public final Map A;
    public ConcurrentHashMap C;
    public final File a;
    public final Callable b;
    public int c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String m;
    public String n;
    public String o;
    public final ArrayList p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public Date z;
    public List l = new ArrayList();
    public String B = null;
    public String d = Locale.getDefault().toString();

    public p3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.a = file;
        this.z = date;
        this.k = str5;
        this.b = callable;
        this.c = i;
        this.e = str6 == null ? "" : str6;
        this.f = str7 == null ? "" : str7;
        this.i = str8 != null ? str8 : "";
        this.j = bool != null ? bool.booleanValue() : false;
        this.m = str9 != null ? str9 : "0";
        this.g = "";
        this.h = "android";
        this.n = "android";
        this.o = str10 != null ? str10 : "";
        this.p = arrayList;
        this.q = str.isEmpty() ? "unknown" : str;
        this.r = str4;
        this.s = "";
        this.t = str11 != null ? str11 : "";
        this.u = str2;
        this.v = str3;
        this.w = io.sentry.config.a.x();
        this.x = str12 != null ? str12 : "production";
        this.y = str13;
        if (!str13.equals("normal") && !this.y.equals("timeout") && !this.y.equals("backgrounded")) {
            this.y = "normal";
        }
        this.A = map;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("android_api_level");
        cVar.w(u0Var, Integer.valueOf(this.c));
        cVar.q("device_locale");
        cVar.w(u0Var, this.d);
        cVar.q("device_manufacturer");
        cVar.z(this.e);
        cVar.q("device_model");
        cVar.z(this.f);
        cVar.q("device_os_build_number");
        cVar.z(this.g);
        cVar.q("device_os_name");
        cVar.z(this.h);
        cVar.q("device_os_version");
        cVar.z(this.i);
        cVar.q("device_is_emulator");
        cVar.A(this.j);
        cVar.q("architecture");
        cVar.w(u0Var, this.k);
        cVar.q("device_cpu_frequencies");
        cVar.w(u0Var, this.l);
        cVar.q("device_physical_memory_bytes");
        cVar.z(this.m);
        cVar.q("platform");
        cVar.z(this.n);
        cVar.q("build_id");
        cVar.z(this.o);
        cVar.q("transaction_name");
        cVar.z(this.q);
        cVar.q("duration_ns");
        cVar.z(this.r);
        cVar.q("version_name");
        cVar.z(this.t);
        cVar.q("version_code");
        cVar.z(this.s);
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            cVar.q("transactions");
            cVar.w(u0Var, arrayList);
        }
        cVar.q("transaction_id");
        cVar.z(this.u);
        cVar.q("trace_id");
        cVar.z(this.v);
        cVar.q("profile_id");
        cVar.z(this.w);
        cVar.q("environment");
        cVar.z(this.x);
        cVar.q("truncation_reason");
        cVar.z(this.y);
        if (this.B != null) {
            cVar.q("sampled_profile");
            cVar.z(this.B);
        }
        String str = ((io.sentry.vendor.gson.stream.b) cVar.b).d;
        cVar.t("");
        cVar.q("measurements");
        cVar.w(u0Var, this.A);
        cVar.t(str);
        cVar.q("timestamp");
        cVar.w(u0Var, this.z);
        ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.C, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
