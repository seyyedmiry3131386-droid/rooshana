package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p78 implements CharSequence {
    public char[] a;
    public String b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.b == null) {
            this.b = new String(this.a);
        }
        return this.b;
    }
}
