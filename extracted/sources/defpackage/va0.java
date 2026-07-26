package defpackage;

import java.util.List;
import kotlin.collections.a;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class va0 {
    public final to6 a;
    public final ps0 b;
    public final to6 c;
    public final qp2 d;
    public final Kind e;
    public List f;

    public va0(to6 to6Var, ps0 ps0Var, a88 a88Var, qp2 qp2Var, Kind kind, List list) {
        js3.p(to6Var, "scopeQualifier");
        js3.p(list, "secondaryTypes");
        this.a = to6Var;
        this.b = ps0Var;
        this.c = a88Var;
        this.d = qp2Var;
        this.e = kind;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        js3.n(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        va0 va0Var = (va0) obj;
        return this.b.equals(va0Var.b) && js3.i(this.c, va0Var.c) && js3.i(this.a, va0Var.a);
    }

    public final int hashCode() {
        to6 to6Var = this.c;
        return this.a.hashCode() + ((this.b.hashCode() + ((to6Var != null ? to6Var.hashCode() : 0) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        dw1.w(this.b, sb, '\'');
        to6 to6Var = this.c;
        if (to6Var != null) {
            sb.append(",qualifier:");
            sb.append(to6Var);
        }
        a88 a88Var = vp7.j;
        to6 to6Var2 = this.a;
        if (!js3.i(to6Var2, a88Var)) {
            sb.append(",scope:");
            sb.append(to6Var2);
        }
        if (!this.f.isEmpty()) {
            sb.append(",binds:");
            a.s0(this.f, sb, ",", new k7(24), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
