package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u12 {
    public final String a;

    public u12(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u12)) {
            return false;
        }
        return this.a.equals(((u12) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dw1.s(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
