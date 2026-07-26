package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kk9 implements xk9 {
    public final boolean a;

    public kk9(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return null;
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kk9) && this.a == ((kk9) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.xk9
    public final Double i() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new cl9(Boolean.toString(z));
        }
        throw new IllegalArgumentException(rm7.q(Boolean.toString(z), ".", str, " is not a function."));
    }

    @Override // defpackage.xk9
    public final String l() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return new kk9(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
