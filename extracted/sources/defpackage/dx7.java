package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class dx7 implements ee7 {
    public final Object a;
    public final dj5 b;
    public final List c;
    public final List d;
    public final a e = new a(-322904035, new g8(23, this), true);

    public dx7(Object obj, dj5 dj5Var, List list) {
        this.a = obj;
        this.b = dj5Var;
        this.c = list;
        this.d = br9.B(dj5Var);
    }

    @Override // defpackage.ee7
    public final List a() {
        return this.c;
    }

    @Override // defpackage.ee7
    public final a b() {
        return this.e;
    }

    @Override // defpackage.ee7
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dx7.class == obj.getClass()) {
            dx7 dx7Var = (dx7) obj;
            if (js3.i(this.a, dx7Var.a) && js3.i(this.b, dx7Var.b) && js3.i(this.c, dx7Var.c) && js3.i(this.d, dx7Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ee7
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ee7
    public final Map j() {
        Map map;
        dj5 dj5Var = (dj5) kotlin.collections.a.v0(c());
        return (dj5Var == null || (map = dj5Var.c) == null) ? b.I() : map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePaneScene(key=");
        sb.append(this.a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", previousEntries=");
        sb.append(this.c);
        sb.append(", entries=");
        return dw1.t(sb, this.d, ')');
    }
}
