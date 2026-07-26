package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class it4 {
    public final wh3 a;
    public final Map b;

    public it4(wh3 wh3Var, Map map) {
        this.a = wh3Var;
        this.b = hs9.V(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it4)) {
            return false;
        }
        it4 it4Var = (it4) obj;
        return js3.i(this.a, it4Var.a) && js3.i(this.b, it4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ')';
    }
}
