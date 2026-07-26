package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lv implements CharSequence {
    public final char[] a;
    public int b;

    public lv(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m88.R(this.a, i, Math.min(i2, this.b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        return m88.R(this.a, 0, Math.min(i, i));
    }
}
