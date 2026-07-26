package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class tk9 implements xk9, rk9 {
    public final HashMap a = new HashMap();

    @Override // defpackage.xk9
    public final Iterator a() {
        return new qk9(this.a.keySet().iterator());
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // defpackage.rk9
    public final xk9 d(String str) {
        HashMap map = this.a;
        return map.containsKey(str) ? (xk9) map.get(str) : xk9.p0;
    }

    @Override // defpackage.rk9
    public final void e(String str, xk9 xk9Var) {
        HashMap map = this.a;
        if (xk9Var == null) {
            map.remove(str);
        } else {
            map.put(str, xk9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tk9) {
            return this.a.equals(((tk9) obj).a);
        }
        return false;
    }

    @Override // defpackage.rk9
    public final boolean f(String str) {
        return this.a.containsKey(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xk9
    public final Double i() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.xk9
    public xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        return "toString".equals(str) ? new cl9(toString()) : rm7.D(this, new cl9(str), o77Var, arrayList);
    }

    @Override // defpackage.xk9
    public final String l() {
        return "[object Object]";
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        tk9 tk9Var = new tk9();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof rk9;
            HashMap map = tk9Var.a;
            if (z) {
                map.put((String) entry.getKey(), (xk9) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((xk9) entry.getValue()).m());
            }
        }
        return tk9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
