package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t95 {
    public int a = 0;
    public boolean b = false;
    public int c = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95)) {
            return false;
        }
        t95 t95Var = (t95) obj;
        return this.a == t95Var.a && this.b == t95Var.b && this.c == t95Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + (this.b ? 1231 : 1237)) * 31) + this.c;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("MultiSelectData(selectedItemsCount=");
        sb.append(i);
        sb.append(", isShown=");
        sb.append(z);
        sb.append(", maxItem=");
        return dw1.k(i2, ")", sb);
    }
}
