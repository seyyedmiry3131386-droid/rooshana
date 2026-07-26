package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a88 implements to6 {
    public final String a;

    public a88(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a88) && js3.i(this.a, ((a88) obj).a);
    }

    @Override // defpackage.to6
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
