package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tz3 implements Comparable {
    public static final tz3 b = new tz3();
    public final int a = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tz3 tz3Var = (tz3) obj;
        js3.p(tz3Var, "other");
        return this.a - tz3Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        tz3 tz3Var = obj instanceof tz3 ? (tz3) obj : null;
        return tz3Var != null && this.a == tz3Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.21";
    }
}
