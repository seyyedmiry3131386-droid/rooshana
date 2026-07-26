package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rm8 {
    public final int a;
    public final int b;

    public rm8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm8)) {
            return false;
        }
        rm8 rm8Var = (rm8) obj;
        return this.a == rm8Var.a && this.b == rm8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ToastColors(container=" + this.a + ", content=" + this.b + ")";
    }
}
