package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class sv5 implements sx3 {
    public final xk0 b = new xk0(0);

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            xk0 xk0Var = this.b;
            if (i >= xk0Var.c) {
                return;
            }
            pv5 pv5Var = (pv5) xk0Var.f(i);
            Object objJ = this.b.j(i);
            ov5 ov5Var = pv5Var.b;
            if (pv5Var.d == null) {
                pv5Var.d = pv5Var.c.getBytes(sx3.a);
            }
            ov5Var.g(pv5Var.d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(pv5 pv5Var) {
        xk0 xk0Var = this.b;
        return xk0Var.containsKey(pv5Var) ? xk0Var.get(pv5Var) : pv5Var.a;
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof sv5) {
            return this.b.equals(((sv5) obj).b);
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
