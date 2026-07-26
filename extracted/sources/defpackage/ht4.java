package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ht4 {
    public final String a;
    public final Map b;

    public ht4(Map map, String str) {
        this.a = str;
        this.b = hs9.V(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht4)) {
            return false;
        }
        ht4 ht4Var = (ht4) obj;
        return js3.i(this.a, ht4Var.a) && js3.i(this.b, ht4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ')';
    }
}
