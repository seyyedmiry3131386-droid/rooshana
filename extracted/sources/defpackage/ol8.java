package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ol8 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = rl8.a;
        nq3.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        xa5 xa5VarA = nq3.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int i2 = xa5VarA.b;
        int[] iArrCopyOf = i2 == 0 ? yq3.a : new int[i2];
        int[] iArr = xa5VarA.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = (iArr[i3] % 12) + 12;
            int i6 = i4 + 1;
            if (iArrCopyOf.length < i6) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i6, (iArrCopyOf.length * 3) / 2));
                js3.o(iArrCopyOf, "copyOf(...)");
            }
            iArrCopyOf[i4] = i5;
            i3++;
            i4 = i6;
        }
    }
}
