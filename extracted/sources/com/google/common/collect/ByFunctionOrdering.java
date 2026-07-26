package com.google.common.collect;

import defpackage.yp2;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class ByFunctionOrdering<F, T> extends p1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final yp2 a;
    public final p1 b;

    public ByFunctionOrdering(yp2 yp2Var, p1 p1Var) {
        this.a = yp2Var;
        p1Var.getClass();
        this.b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yp2 yp2Var = this.a;
        return this.b.compare(yp2Var.apply(obj), yp2Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.a.equals(byFunctionOrdering.a) && this.b.equals(byFunctionOrdering.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
