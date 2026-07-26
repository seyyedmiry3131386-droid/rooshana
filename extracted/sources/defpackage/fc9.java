package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fc9 implements CharSequence, Comparable {
    public final String a;

    public fc9(String str) {
        if (str == null) {
            throw new NullPointerException("String initializer must be non-null");
        }
        this.a = str;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(obj.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fc9) {
            return this.a.equals(((fc9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a;
    }
}
