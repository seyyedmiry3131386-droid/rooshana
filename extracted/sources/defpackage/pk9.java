package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk9 implements xk9, rk9 {
    public final String a;
    public final HashMap b = new HashMap();

    public pk9(String str) {
        this.a = str;
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return new qk9(this.b.keySet().iterator());
    }

    public abstract xk9 b(o77 o77Var, List list);

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // defpackage.rk9
    public final xk9 d(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (xk9) map.get(str) : xk9.p0;
    }

    @Override // defpackage.rk9
    public final void e(String str, xk9 xk9Var) {
        HashMap map = this.b;
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
        if (!(obj instanceof pk9)) {
            return false;
        }
        pk9 pk9Var = (pk9) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(pk9Var.a);
        }
        return false;
    }

    @Override // defpackage.rk9
    public final boolean f(String str) {
        return this.b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.xk9
    public final Double i() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        return "toString".equals(str) ? new cl9(this.a) : rm7.D(this, new cl9(str), o77Var, arrayList);
    }

    @Override // defpackage.xk9
    public final String l() {
        return this.a;
    }

    @Override // defpackage.xk9
    public xk9 m() {
        return this;
    }
}
