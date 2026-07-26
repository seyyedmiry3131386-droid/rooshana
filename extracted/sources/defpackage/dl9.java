package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dl9 implements xk9 {
    @Override // defpackage.xk9
    public final Iterator a() {
        return null;
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof dl9;
    }

    @Override // defpackage.xk9
    public final Double i() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // defpackage.xk9
    public final String l() {
        return "undefined";
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return xk9.p0;
    }
}
