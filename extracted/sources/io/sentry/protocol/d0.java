package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.h6;
import io.sentry.i3;
import io.sentry.j6;
import io.sentry.k4;
import io.sentry.k6;
import io.sentry.p6;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends k4 implements g2 {
    public String p;
    public Double q;
    public Double r;
    public final ArrayList s;
    public final HashMap t;
    public f0 u;
    public ConcurrentHashMap v;

    public d0(ArrayList arrayList, HashMap map, f0 f0Var) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.s = arrayList2;
        HashMap map2 = new HashMap();
        this.t = map2;
        this.p = "";
        this.q = dValueOf;
        this.r = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.t.putAll(((y) it.next()).l);
        }
        this.u = f0Var;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.p != null) {
            cVar.q("transaction");
            cVar.z(this.p);
        }
        cVar.q("start_timestamp");
        cVar.w(u0Var, io.sentry.config.a.r(this.q));
        if (this.r != null) {
            cVar.q("timestamp");
            cVar.w(u0Var, io.sentry.config.a.r(this.r));
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            cVar.q("spans");
            cVar.w(u0Var, arrayList);
        }
        cVar.q("type");
        cVar.z("transaction");
        HashMap map = this.t;
        if (!map.isEmpty()) {
            cVar.q("measurements");
            cVar.w(u0Var, map);
        }
        cVar.q("transaction_info");
        cVar.w(u0Var, this.u);
        io.sentry.config.a.X(this, cVar, u0Var);
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.v, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }

    public d0(h6 h6Var) {
        super(h6Var.a);
        this.s = new ArrayList();
        this.t = new HashMap();
        j6 j6Var = h6Var.b;
        this.q = Double.valueOf(j6Var.a.d() / 1.0E9d);
        this.r = Double.valueOf(j6Var.a.c(j6Var.b) / 1.0E9d);
        this.p = h6Var.e;
        for (j6 j6Var2 : h6Var.c) {
            Boolean bool = Boolean.TRUE;
            p6 p6Var = j6Var2.c.d;
            if (bool.equals(p6Var == null ? null : p6Var.a)) {
                this.s.add(new y(j6Var2));
            }
        }
        e eVar = this.b;
        eVar.l(h6Var.p);
        k6 k6Var = j6Var.c;
        ConcurrentHashMap concurrentHashMap = j6Var.k;
        k6 k6Var2 = new k6(k6Var.a, k6Var.b, k6Var.c, k6Var.e, k6Var.f, k6Var.d, k6Var.g, k6Var.i);
        Iterator it = k6Var.h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    if (value == null) {
                        k6Var2.j.remove(str);
                    } else {
                        k6Var2.j.put(str, value);
                    }
                }
            }
        }
        k6Var.n.i();
        eVar.v(k6Var2);
        this.u = new f0(h6Var.n.apiName());
    }
}
