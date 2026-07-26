package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n09 implements hl {
    public final String a;

    public n09(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n09) {
            return js3.i(this.a, ((n09) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl4.y(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
