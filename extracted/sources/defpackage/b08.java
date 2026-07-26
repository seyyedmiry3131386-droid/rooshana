package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b08 implements rx1 {
    public final int a;

    public b08(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b08) && ((b08) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.sk
    public final z39 a(mt8 mt8Var) {
        return new tu2(this.a);
    }
}
