package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bn5 extends cn5 {
    public final Object a;

    public bn5(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn5) && js3.i(this.a, ((bn5) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
