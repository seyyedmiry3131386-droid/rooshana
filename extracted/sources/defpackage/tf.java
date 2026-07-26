package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tf) {
            return this.a == ((tf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.a + ')';
    }
}
