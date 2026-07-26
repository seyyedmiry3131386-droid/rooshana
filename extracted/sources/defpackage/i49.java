package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i49 implements hl {
    public final String a;

    public i49(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i49) {
            return js3.i(this.a, ((i49) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl4.y(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
