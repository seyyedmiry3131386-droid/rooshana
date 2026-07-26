package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m24 {
    public final int a;
    public final int b;

    public m24(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            un3.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        un3.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m24)) {
            return false;
        }
        m24 m24Var = (m24) obj;
        return this.a == m24Var.a && this.b == m24Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return dw1.q(sb, this.b, ')');
    }
}
