package defpackage;

import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(zp0.a);
        js3.o(bytes, "getBytes(...)");
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(gh0 gh0Var, ByteString byteString, long j, long j2, int i) {
        vl7 vl7Var;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        js3.p(byteString, "bytes");
        long j5 = i;
        wq2.m(byteString.e(), 0, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(bl4.r(j3, "fromIndex < 0: ").toString());
        }
        if (j3 > j4) {
            StringBuilder sbS = rm7.s(j3, "fromIndex > toIndex: ", " > ");
            sbS.append(j4);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        long j7 = gh0Var.b;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (vl7Var = gh0Var.a) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = ((long) (vl7Var.c - vl7Var.b)) + j6;
                if (j8 > j3) {
                    break;
                }
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                j6 = j8;
            }
            byte[] bArrI = byteString.i();
            byte b2 = bArrI[0];
            long jMin = Math.min(j4, (gh0Var.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr2 = vl7Var.a;
                int iMin = (int) Math.min(vl7Var.c, (((long) vl7Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) vl7Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr2[i2] == b2 && b(vl7Var, i2 + 1, bArrI, 1, i)) {
                        return ((long) (i2 - vl7Var.b)) + j6;
                    }
                }
                j6 += (long) (vl7Var.c - vl7Var.b);
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                j3 = j6;
            }
            return -1L;
        }
        while (j7 > j3) {
            vl7Var = vl7Var.g;
            js3.m(vl7Var);
            j7 -= (long) (vl7Var.c - vl7Var.b);
        }
        byte[] bArrI2 = byteString.i();
        byte b3 = bArrI2[0];
        byte[] bArr3 = bArrI2;
        long jMin2 = Math.min(j4, (gh0Var.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr4 = vl7Var.a;
            int iMin2 = (int) Math.min(vl7Var.c, (((long) vl7Var.b) + jMin2) - j7);
            int i3 = (int) ((((long) vl7Var.b) + j3) - j7);
            while (i3 < iMin2) {
                if (bArr4[i3] == b3) {
                    bArr = bArr3;
                    if (b(vl7Var, i3 + 1, bArr, 1, i)) {
                        return ((long) (i3 - vl7Var.b)) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += (long) (vl7Var.c - vl7Var.b);
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(vl7 vl7Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = vl7Var.c;
        byte[] bArr2 = vl7Var.a;
        while (i2 < i3) {
            if (i == i4) {
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                byte[] bArr3 = vl7Var.a;
                bArr2 = bArr3;
                i = vl7Var.b;
                i4 = vl7Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(gh0 gh0Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (gh0Var.y(j2) == 13) {
                String strS0 = gh0Var.s0(j2, zp0.a);
                gh0Var.skip(2L);
                return strS0;
            }
        }
        String strS02 = gh0Var.s0(j, zp0.a);
        gh0Var.skip(1L);
        return strS02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(defpackage.gh0 r16, defpackage.tv5 r17, boolean r18) {
        /*
            r0 = r17
            java.lang.String r1 = "options"
            defpackage.js3.p(r0, r1)
            r1 = r16
            vl7 r1 = r1.a
            r2 = -1
            if (r1 != 0) goto L12
            if (r18 == 0) goto L11
            goto L5e
        L11:
            return r2
        L12:
            byte[] r3 = r1.a
            int r4 = r1.b
            int r5 = r1.c
            int[] r0 = r0.b
            r6 = 0
            r8 = r1
            r9 = r2
            r7 = r6
        L1e:
            int r10 = r7 + 1
            r11 = r0[r7]
            int r7 = r7 + 2
            r10 = r0[r10]
            if (r10 == r2) goto L29
            r9 = r10
        L29:
            if (r8 != 0) goto L2c
            goto L5c
        L2c:
            r10 = 0
            if (r11 >= 0) goto L74
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L33:
            int r11 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r0[r7]
            if (r4 == r7) goto L40
            goto L7e
        L40:
            if (r13 != r12) goto L44
            r4 = 1
            goto L45
        L44:
            r4 = r6
        L45:
            if (r11 != r5) goto L64
            defpackage.js3.m(r8)
            vl7 r3 = r8.f
            defpackage.js3.m(r3)
            int r5 = r3.b
            byte[] r7 = r3.a
            int r8 = r3.c
            if (r3 != r1) goto L60
            if (r4 == 0) goto L5c
            r3 = r7
            r7 = r10
            goto L67
        L5c:
            if (r18 == 0) goto L7e
        L5e:
            r0 = -2
            return r0
        L60:
            r15 = r7
            r7 = r3
            r3 = r15
            goto L67
        L64:
            r7 = r8
            r8 = r5
            r5 = r11
        L67:
            if (r4 == 0) goto L6f
            r4 = r0[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto La0
        L6f:
            r4 = r5
            r5 = r8
            r8 = r7
            r7 = r13
            goto L33
        L74:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7c:
            if (r7 != r13) goto L7f
        L7e:
            return r9
        L7f:
            r14 = r0[r7]
            if (r4 != r14) goto Laa
            int r7 = r7 + r11
            r4 = r0[r7]
            if (r12 != r5) goto L9e
            vl7 r8 = r8.f
            defpackage.js3.m(r8)
            int r3 = r8.b
            byte[] r5 = r8.a
            int r7 = r8.c
            if (r8 != r1) goto L9a
            r8 = r5
            r5 = r3
            r3 = r8
            r8 = r10
            goto La0
        L9a:
            r15 = r5
            r5 = r3
            r3 = r15
            goto La0
        L9e:
            r7 = r5
            r5 = r12
        La0:
            if (r4 < 0) goto La3
            return r4
        La3:
            int r4 = -r4
            r15 = r7
            r7 = r4
            r4 = r5
            r5 = r15
            goto L1e
        Laa:
            int r7 = r7 + 1
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(gh0, tv5, boolean):int");
    }
}
