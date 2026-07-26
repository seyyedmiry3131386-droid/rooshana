package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qh3 extends lb7 {
    public static final vv1 d = new vv1(28);
    public final ph3 c;

    public qh3(ph3 ph3Var) {
        this.c = ph3Var;
    }

    public static ei8 A(int i, h26 h26Var) {
        if (i < 1) {
            return null;
        }
        int iX = h26Var.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        h26Var.h(bArr, 0, i2);
        int iG = G(bArr, 0, iX);
        return new ei8("TXXX", new String(bArr, 0, iG, E(iX)), z(bArr, iX, D(iX) + iG));
    }

    public static r09 B(int i, h26 h26Var, String str) {
        byte[] bArr = new byte[i];
        h26Var.h(bArr, 0, i);
        return new r09(str, null, new String(bArr, 0, H(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static r09 C(int i, h26 h26Var) {
        if (i < 1) {
            return null;
        }
        int iX = h26Var.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        h26Var.h(bArr, 0, i2);
        int iG = G(bArr, 0, iX);
        String str = new String(bArr, 0, iG, E(iX));
        int iD = D(iX) + iG;
        return new r09("WXXX", str, x(bArr, iD, H(iD, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int D(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset E(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String F(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int G(byte[] bArr, int i, int i2) {
        int iH = H(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iH;
        }
        while (iH < bArr.length - 1) {
            if ((iH - i) % 2 == 0 && bArr[iH + 1] == 0) {
                return iH;
            }
            iH = H(iH + 1, bArr);
        }
        return bArr.length;
    }

    public static int H(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int I(int i, h26 h26Var) {
        byte[] bArr = h26Var.a;
        int i2 = h26Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean J(defpackage.h26 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.z()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.D()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.A()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.A()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.J(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.J(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.J(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.J(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.K(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.J(r2)
            return r4
        Lb0:
            r1.J(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh3.J(h26, int, int, boolean):boolean");
    }

    public static dm p(h26 h26Var, int i, int i2) {
        int iH;
        String strConcat;
        int iX = h26Var.x();
        Charset charsetE = E(iX);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        h26Var.h(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + wu8.L(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iH = 2;
        } else {
            iH = H(0, bArr);
            String strL = wu8.L(new String(bArr, 0, iH, StandardCharsets.ISO_8859_1));
            strConcat = strL.indexOf(47) == -1 ? "image/".concat(strL) : strL;
        }
        int i4 = bArr[iH + 1] & 255;
        int i5 = iH + 2;
        int iG = G(bArr, i5, iX);
        String str = new String(bArr, i5, iG - i5, charsetE);
        int iD = D(iX) + iG;
        return new dm(i4, strConcat, str, i3 <= iD ? j29.b : Arrays.copyOfRange(bArr, iD, i3));
    }

    public static lp0 q(h26 h26Var, int i, int i2, boolean z, int i3, ph3 ph3Var) throws Throwable {
        int i4 = h26Var.b;
        int iH = H(i4, h26Var.a);
        String str = new String(h26Var.a, i4, iH - i4, StandardCharsets.ISO_8859_1);
        h26Var.J(iH + 1);
        int iJ = h26Var.j();
        int iJ2 = h26Var.j();
        long jZ = h26Var.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = h26Var.z();
        long j = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (h26Var.b < i5) {
            rh3 rh3VarT = t(i2, h26Var, z, i3, ph3Var);
            if (rh3VarT != null) {
                arrayList.add(rh3VarT);
            }
        }
        return new lp0(str, iJ, iJ2, jZ, j, (rh3[]) arrayList.toArray(new rh3[0]));
    }

    public static mp0 r(h26 h26Var, int i, int i2, boolean z, int i3, ph3 ph3Var) throws Throwable {
        int i4 = h26Var.b;
        int iH = H(i4, h26Var.a);
        String str = new String(h26Var.a, i4, iH - i4, StandardCharsets.ISO_8859_1);
        h26Var.J(iH + 1);
        int iX = h26Var.x();
        boolean z2 = (iX & 2) != 0;
        boolean z3 = (iX & 1) != 0;
        int iX2 = h26Var.x();
        String[] strArr = new String[iX2];
        for (int i5 = 0; i5 < iX2; i5++) {
            int i6 = h26Var.b;
            int iH2 = H(i6, h26Var.a);
            strArr[i5] = new String(h26Var.a, i6, iH2 - i6, StandardCharsets.ISO_8859_1);
            h26Var.J(iH2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (h26Var.b < i7) {
            rh3 rh3VarT = t(i2, h26Var, z, i3, ph3Var);
            if (rh3VarT != null) {
                arrayList.add(rh3VarT);
            }
        }
        return new mp0(str, z2, z3, strArr, (rh3[]) arrayList.toArray(new rh3[0]));
    }

    public static uw0 s(int i, h26 h26Var) {
        if (i < 4) {
            return null;
        }
        int iX = h26Var.x();
        Charset charsetE = E(iX);
        byte[] bArr = new byte[3];
        h26Var.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        h26Var.h(bArr2, 0, i2);
        int iG = G(bArr2, 0, iX);
        String str2 = new String(bArr2, 0, iG, charsetE);
        int iD = D(iX) + iG;
        return new uw0(str, str2, x(bArr2, iD, G(bArr2, iD, iX), charsetE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [rh3] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [h26] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [h26] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [h26] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.rh3 t(int r19, defpackage.h26 r20, boolean r21, int r22, defpackage.ph3 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh3.t(int, h26, boolean, int, ph3):rh3");
    }

    public static or2 u(int i, h26 h26Var) {
        int iX = h26Var.x();
        Charset charsetE = E(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        h26Var.h(bArr, 0, i2);
        int iH = H(0, bArr);
        String strM = tv4.m(new String(bArr, 0, iH, StandardCharsets.ISO_8859_1));
        int i3 = iH + 1;
        int iG = G(bArr, i3, iX);
        String strX = x(bArr, i3, iG, charsetE);
        int iD = D(iX) + iG;
        int iG2 = G(bArr, iD, iX);
        String strX2 = x(bArr, iD, iG2, charsetE);
        int iD2 = D(iX) + iG2;
        return new or2(strM, i2 <= iD2 ? j29.b : Arrays.copyOfRange(bArr, iD2, i2), strX, strX2);
    }

    public static iw4 v(int i, h26 h26Var) {
        int iD = h26Var.D();
        int iA = h26Var.A();
        int iA2 = h26Var.A();
        int iX = h26Var.x();
        int iX2 = h26Var.x();
        ao0 ao0Var = new ao0();
        ao0Var.p(h26Var);
        int i2 = ((i - 10) * 8) / (iX + iX2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = ao0Var.i(iX);
            int i5 = ao0Var.i(iX2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new iw4(iD, iA, iA2, iArr, iArr2);
    }

    public static ik6 w(int i, h26 h26Var) {
        byte[] bArr = new byte[i];
        h26Var.h(bArr, 0, i);
        int iH = H(0, bArr);
        String str = new String(bArr, 0, iH, StandardCharsets.ISO_8859_1);
        int i2 = iH + 1;
        return new ik6(str, i <= i2 ? j29.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String x(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static ei8 y(int i, h26 h26Var, String str) {
        if (i < 1) {
            return null;
        }
        int iX = h26Var.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        h26Var.h(bArr, 0, i2);
        return new ei8(str, null, z(bArr, iX, 0));
    }

    public static ImmutableList z(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.s("");
        }
        lj3 lj3VarM = ImmutableList.m();
        int iG = G(bArr, i2, i);
        while (i2 < iG) {
            lj3VarM.O(new String(bArr, i2, iG - i2, E(i)));
            i2 = D(i) + iG;
            iG = G(bArr, i2, i);
        }
        ImmutableList immutableListS = lj3VarM.S();
        return immutableListS.isEmpty() ? ImmutableList.s("") : immutableListS;
    }

    @Override // defpackage.lb7
    public final jv4 c(mv4 mv4Var, ByteBuffer byteBuffer) {
        return o(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jv4 o(int r13, byte[] r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh3.o(int, byte[]):jv4");
    }
}
