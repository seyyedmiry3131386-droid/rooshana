package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uq3 extends sq3 {
    public static final uq3 d = new uq3(1, 0, 1);

    public final boolean a(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.sq3
    public final boolean equals(Object obj) {
        if (!(obj instanceof uq3)) {
            return false;
        }
        if (isEmpty() && ((uq3) obj).isEmpty()) {
            return true;
        }
        uq3 uq3Var = (uq3) obj;
        return this.a == uq3Var.a && this.b == uq3Var.b;
    }

    @Override // defpackage.sq3
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.sq3
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.sq3
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
