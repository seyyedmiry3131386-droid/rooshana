package androidx.datastore.preferences.protobuf;

import defpackage.b47;
import defpackage.vy8;

/* JADX INFO: loaded from: classes.dex */
public final class p extends b47 {
    public final /* synthetic */ int d;

    public /* synthetic */ p(int i) {
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // defpackage.b47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(byte[] r10, int r11, int r12) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p.c(byte[], int, int):java.lang.String");
    }

    @Override // defpackage.b47
    public final int d(byte[] bArr, String str, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        long j2;
        long j3;
        int i5;
        char cCharAt2;
        switch (this.d) {
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
                        vy8.j(bArr, j4, (byte) cCharAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j4 < j5) {
                            vy8.j(bArr, j4, (byte) cCharAt5);
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
                                        vy8.j(bArr, j4, (byte) ((codePoint2 >>> 18) | 240));
                                        vy8.j(bArr, j4 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = j4 + 3;
                                        vy8.j(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        vy8.j(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new Utf8$UnpairedSurrogateException(i13 - 1, length2);
                            }
                            vy8.j(bArr, j4, (byte) ((cCharAt5 >>> '\f') | 480));
                            j3 = j5;
                            long j7 = j4 + 2;
                            vy8.j(bArr, j4 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j4 += 3;
                            vy8.j(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j2 = j;
                            long j8 = j4 + j2;
                            vy8.j(bArr, j4, (byte) ((cCharAt5 >>> 6) | 960));
                            j4 += 2;
                            vy8.j(bArr, j8, (byte) ((cCharAt5 & '?') | 128));
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
}
