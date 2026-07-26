package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class io0 {
    public static final io0 c = new io0(a.T0(new ArrayList()), null);
    public final Set a;
    public final at2 b;

    public io0(Set set, at2 at2Var) {
        js3.p(set, "pins");
        this.a = set;
        this.b = at2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof io0)) {
            return false;
        }
        io0 io0Var = (io0) obj;
        return js3.i(io0Var.a, this.a) && js3.i(io0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        at2 at2Var = this.b;
        return iHashCode + (at2Var != null ? at2Var.hashCode() : 0);
    }
}
