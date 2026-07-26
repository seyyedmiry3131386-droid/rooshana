package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zk9 implements xk9 {
    public final String a;
    public final ArrayList b;

    public zk9(String str, ArrayList arrayList) {
        this.a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return null;
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk9)) {
            return false;
        }
        zk9 zk9Var = (zk9) obj;
        String str = zk9Var.a;
        String str2 = this.a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.b.equals(zk9Var.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.xk9
    public final Double i() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.xk9
    public final xk9 j(String str, o77 o77Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.xk9
    public final String l() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        return this;
    }
}
