package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class nx4 {
    public final String a = ct2.k();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(zp3 zp3Var) {
        String value;
        va0 va0Var = zp3Var.a;
        ps0 ps0Var = va0Var.b;
        to6 to6Var = va0Var.c;
        to6 to6Var2 = va0Var.a;
        StringBuilder sb = new StringBuilder();
        dw1.w(ps0Var, sb, ':');
        if (to6Var == null || (value = to6Var.getValue()) == null) {
            value = "";
        }
        this.c.put(dw1.r(sb, value, ':', to6Var2, "mapping"), zp3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        return js3.i(this.a, ((nx4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
