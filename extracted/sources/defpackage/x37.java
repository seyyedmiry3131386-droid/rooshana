package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x37 {
    public static final x37 c = new x37(0, false);
    public final int a;
    public final boolean b;

    public x37(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x37.class == obj.getClass()) {
            x37 x37Var = (x37) obj;
            if (this.a == x37Var.a && this.b == x37Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
