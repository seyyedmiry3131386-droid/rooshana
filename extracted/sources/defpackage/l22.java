package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l22 {
    public final ps0 a;
    public final dp2 b;
    public final Map c;
    public final a d;

    public l22(ps0 ps0Var, dp2 dp2Var, Map map, a aVar) {
        this.a = ps0Var;
        this.b = dp2Var;
        this.c = map;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l22)) {
            return false;
        }
        l22 l22Var = (l22) obj;
        return this.a.equals(l22Var.a) && js3.i(this.b, l22Var.b) && js3.i(this.c, l22Var.c) && this.d.equals(l22Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }
}
