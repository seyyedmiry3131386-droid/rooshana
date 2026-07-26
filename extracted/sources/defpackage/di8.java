package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di8 {
    public static final di8 c = new di8(w07.e(0), w07.e(0));
    public final long a;
    public final long b;

    public di8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di8)) {
            return false;
        }
        di8 di8Var = (di8) obj;
        return jj8.a(this.a, di8Var.a) && jj8.a(this.b, di8Var.b);
    }

    public final int hashCode() {
        return jj8.d(this.b) + (jj8.d(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) jj8.e(this.a)) + ", restLine=" + ((Object) jj8.e(this.b)) + ')';
    }
}
