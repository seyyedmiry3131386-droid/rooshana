package defpackage;

import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yu6 {
    public static final Random$Default a = new Random$Default(0);
    public static final x1 b;

    static {
        Integer num = st3.a;
        b = (num == null || num.intValue() >= 34) ? new ea6() : new q82();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }
}
