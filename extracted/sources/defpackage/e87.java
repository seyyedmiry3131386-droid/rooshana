package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e87 {
    public final Object a;

    public /* synthetic */ e87(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e87) {
            return js3.i(this.a, ((e87) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.a + ")";
    }
}
