package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ij9 implements ql {
    public static final ij9 c;
    public final boolean a;
    public final String b;

    static {
        bn6 bn6Var = new bn6(22);
        bn6Var.b = Boolean.FALSE;
        c = new ij9(bn6Var);
    }

    public ij9(bn6 bn6Var) {
        this.a = ((Boolean) bn6Var.b).booleanValue();
        this.b = (String) bn6Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ij9)) {
            return false;
        }
        ij9 ij9Var = (ij9) obj;
        return vy2.w(null, null) && this.a == ij9Var.a && vy2.w(this.b, ij9Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
