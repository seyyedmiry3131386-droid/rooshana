package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends y {
    public static m3 c;

    public final boolean G(int i) {
        if (i <= 0 || o().charAt(i - 1) == '\n') {
            return false;
        }
        return i == o().length() || o().charAt(i) == '\n';
    }

    @Override // defpackage.y
    public final int[] g(int i) {
        int length = o().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && o().charAt(i) == '\n' && (o().charAt(i) == '\n' || (i != 0 && o().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !G(i2)) {
            i2++;
        }
        return k(i, i2);
    }

    @Override // defpackage.y
    public final int[] w(int i) {
        int length = o().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && o().charAt(i - 1) == '\n' && !G(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (o().charAt(i2) == '\n' || (i2 != 0 && o().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return k(i2, i);
    }
}
