package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su0 {
    public final int a;
    public final int b;

    public su0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return this.a == su0Var.a && this.b == su0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return dw1.q(sb, this.b, ')');
    }
}
