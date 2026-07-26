package com.google.protobuf;

import defpackage.o27;
import defpackage.o37;
import defpackage.sy8;
import defpackage.uy8;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends o37 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i) {
        super(7);
        this.b = i;
    }

    public static int E(int i, int i2, long j) {
        if (i2 == 0) {
            o37 o37Var = z.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return z.e(i, uy8.c.e(j));
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        sy8 sy8Var = uy8.c;
        return z.f(i, sy8Var.e(j), sy8Var.e(j + 1));
    }

    public static int F(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            o37 o37Var = z.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return z.e(i, uy8.g(j, bArr));
        }
        if (i2 == 2) {
            return z.f(i, uy8.g(j, bArr), uy8.g(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.o37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(byte[] r9, int r10, int r11) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y.d(byte[], int, int):java.lang.String");
    }

    @Override // defpackage.o37
    public final String f(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        byte bE;
        byte bE2;
        switch (this.b) {
            case 0:
                return o37.e(byteBuffer, i, i2);
            default:
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long jK = uy8.c.k(uy8.g, byteBuffer) + ((long) i);
                long j = ((long) i2) + jK;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (jK < j && (bE2 = uy8.c.e(jK)) >= 0) {
                    jK++;
                    cArr[i3] = (char) bE2;
                    i3++;
                }
                int i4 = i3;
                while (jK < j) {
                    long j2 = jK + 1;
                    sy8 sy8Var = uy8.c;
                    byte bE3 = sy8Var.e(jK);
                    if (bE3 >= 0) {
                        int i5 = i4 + 1;
                        cArr[i4] = (char) bE3;
                        while (j2 < j && (bE = uy8.c.e(j2)) >= 0) {
                            j2++;
                            cArr[i5] = (char) bE;
                            i5++;
                        }
                        i4 = i5;
                        jK = j2;
                    } else if (bE3 < -32) {
                        if (j2 >= j) {
                            throw InvalidProtocolBufferException.c();
                        }
                        jK += 2;
                        o27.b(bE3, sy8Var.e(j2), cArr, i4);
                        i4++;
                    } else if (bE3 < -16) {
                        if (j2 >= j - 1) {
                            throw InvalidProtocolBufferException.c();
                        }
                        long j3 = 2 + jK;
                        jK += 3;
                        o27.c(bE3, sy8Var.e(j2), sy8Var.e(j3), cArr, i4);
                        i4++;
                    } else {
                        if (j2 >= j - 2) {
                            throw InvalidProtocolBufferException.c();
                        }
                        byte bE4 = sy8Var.e(j2);
                        long j4 = jK + 3;
                        byte bE5 = sy8Var.e(2 + jK);
                        jK += 4;
                        o27.a(bE3, bE4, bE5, sy8Var.e(j4), cArr, i4);
                        i4 += 2;
                    }
                }
                return new String(cArr, 0, i4);
        }
    }

    @Override // defpackage.o37
    public final int j(byte[] bArr, String str, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        long j2;
        long j3;
        int i5;
        char cCharAt2;
        switch (this.b) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (cCharAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char cCharAt3 = str.charAt(i7);
                    if (cCharAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) cCharAt3;
                        i8++;
                    } else if (cCharAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new Utf8$UnpairedSurrogateException(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char cCharAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new Utf8$UnpairedSurrogateException(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j4 = i;
                long j5 = ((long) i2) + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    if (i13 < length2 && (cCharAt2 = str.charAt(i13)) < 128) {
                        uy8.k(bArr, j4, (byte) cCharAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j4 < j5) {
                            uy8.k(bArr, j4, (byte) cCharAt5);
                            j3 = j5;
                            j2 = j;
                            j4 += j;
                        } else if (cCharAt5 >= 2048 || j4 > j5 - 2) {
                            j2 = j;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j4 > j5 - 3) {
                                j3 = j5;
                                if (j4 > j3 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new Utf8$UnpairedSurrogateException(i13, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j4);
                                }
                                int i14 = i13 + 1;
                                if (i14 != length2) {
                                    char cCharAt6 = str.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        uy8.k(bArr, j4, (byte) ((codePoint2 >>> 18) | 240));
                                        uy8.k(bArr, j4 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = j4 + 3;
                                        uy8.k(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        uy8.k(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new Utf8$UnpairedSurrogateException(i13 - 1, length2);
                            }
                            uy8.k(bArr, j4, (byte) ((cCharAt5 >>> '\f') | 480));
                            j3 = j5;
                            long j7 = j4 + 2;
                            uy8.k(bArr, j4 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j4 += 3;
                            uy8.k(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j2 = j;
                            long j8 = j4 + j2;
                            uy8.k(bArr, j4, (byte) ((cCharAt5 >>> 6) | 960));
                            j4 += 2;
                            uy8.k(bArr, j8, (byte) ((cCharAt5 & '?') | 128));
                            j3 = j5;
                        }
                        i13++;
                        j = j2;
                        j5 = j3;
                    }
                }
                return (int) j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (defpackage.uy8.g(r13, r25) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r13 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (defpackage.uy8.g(r13, r25) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (defpackage.uy8.g(r13, r25) > (-65)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026a A[ADDED_TO_REGION, LOOP:6: B:181:0x026a->B:277:0x026a, LOOP_START, PHI: r2
      0x026a: PHI (r2v3 int) = (r2v2 int), (r2v7 int) binds: [B:179:0x0267, B:277:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[PHI: r2
      PHI (r2v1 int) = (r2v0 int), (r2v13 int), (r2v19 int), (r2v22 int) binds: [B:126:0x01cd, B:173:0x025b, B:153:0x0217, B:135:0x01e2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    @Override // defpackage.o37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(byte[] r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y.v(byte[], int, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r3.e(r7) > (-65)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r3.e(r7) > (-65)) goto L114;
     */
    @Override // defpackage.o37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(int r25, int r26, int r27, java.nio.ByteBuffer r28) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y.x(int, int, int, java.nio.ByteBuffer):int");
    }
}
