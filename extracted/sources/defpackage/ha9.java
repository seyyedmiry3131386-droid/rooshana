package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha9 extends ja9 {
    public final int e;
    public final int f;

    public ha9(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ja9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha9)) {
            return false;
        }
        ha9 ha9Var = (ha9) obj;
        return this.e == ha9Var.e && this.f == ha9Var.f && this.a == ha9Var.a && this.b == ha9Var.b && this.c == ha9Var.c && this.d == ha9Var.d;
    }

    @Override // defpackage.ja9
    public final int hashCode() {
        return super.hashCode() + this.e + this.f;
    }

    public final String toString() {
        return g88.P("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
    }
}
