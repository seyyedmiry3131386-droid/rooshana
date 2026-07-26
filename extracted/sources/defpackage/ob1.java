package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ob1 extends pb1 {
    public final Object a;

    public ob1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob1) && js3.i(this.a, ((ob1) obj).a);
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
