package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mk9 implements xk9 {
    public final xk9 a;
    public final String b;

    public mk9(String str) {
        this.a = xk9.p0;
        this.b = str;
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return null;
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mk9)) {
            return false;
        }
        mk9 mk9Var = (mk9) obj;
        return this.b.equals(mk9Var.b) && this.a.equals(mk9Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.xk9
    public final Double i() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.xk9
    public final String l() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return new mk9(this.b, this.a.m());
    }

    public mk9(String str, xk9 xk9Var) {
        this.a = xk9Var;
        this.b = str;
    }
}
