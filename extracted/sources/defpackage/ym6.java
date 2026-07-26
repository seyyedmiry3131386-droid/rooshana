package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ym6 {
    public final String a;

    public ym6(String str) {
        this.a = str;
    }

    public final Object a(xg5 xg5Var) {
        Object obj = ((HashMap) xg5Var.b).get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.a);
    }

    public final void b(xg5 xg5Var, Object obj) {
        HashMap map = (HashMap) xg5Var.b;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ym6.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ym6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dw1.s(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
