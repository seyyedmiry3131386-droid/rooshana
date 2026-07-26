package defpackage;

import androidx.collection.d;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nb5 extends d {
    public int h;

    public nb5(int i) {
        this.a = ce7.a;
        this.b = bt2.h;
        this.c = ml9.g;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        if (i >= 0) {
            f(ce7.d(i));
        } else {
            lb7.j("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(Object obj) {
        int i = this.g;
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & ((long) iD)) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
        return this.g != i;
    }

    public final void c() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != ce7.a) {
            ew.H0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ew.F0(0, this.f, null, this.b);
        ew.H0(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = ce7.a(this.f) - this.g;
    }

    public final int d(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (js3.i(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i4);
                long j9 = 255;
                if (this.h != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iE2 = e(i24);
                                        int i25 = i24 & i14;
                                        if (((iE2 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
                                            int i26 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (((long) (i23 & 127)) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr2;
                                        } else {
                                            int i27 = i14;
                                            Object[] objArr3 = objArr;
                                            int i28 = iE2 >> 3;
                                            long j14 = jArr4[i28];
                                            int i29 = (iE2 & 7) << 3;
                                            if (((j14 >> i29) & j2) == 128) {
                                                jArr4[i28] = (j14 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iE2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iE2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                int i31 = Integer.MAX_VALUE;
                                                if (i30 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i30] = ((long) iE2) | (jArr6[i30] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                    i31 = Integer.MAX_VALUE;
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr6[iE2] = (((long) i20) << 32) | ((long) i31);
                                            } else {
                                                j4 = j6;
                                                jArr4[i28] = (((long) (i23 & 127)) << i29) | (j14 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i32 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i32 != Integer.MAX_VALUE) {
                                                    long j16 = iE2;
                                                    jArr6[i32] = (jArr6[i32] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iE2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i32 = i20;
                                                }
                                                jArr6[iE2] = (((long) i32) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i27;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.h = ce7.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i33 = 0; i33 < length2; i33++) {
                                    long j18 = jArr7[i33];
                                    int i34 = (int) ((j18 >> 31) & 2147483647L);
                                    int i35 = (int) (j18 & 2147483647L);
                                    jArr7[i33] = (((j18 & (-4611686018427387904L)) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i34] & 4294967295L)))) << 31) | ((long) (i35 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i35] & 4294967295L)));
                                }
                                int i36 = this.d;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i36] & 4294967295L);
                                }
                                int i37 = this.e;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i37] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iB = ce7.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i38 = this.f;
                    int[] iArr = new int[i38];
                    f(iB);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i39 = this.f;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr8[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i41 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i41 & 127;
                            int i42 = iE3 >> 3;
                            int i43 = (iE3 & 7) << 3;
                            long j20 = (jArr[i42] & (~(255 << i43))) | (j19 << i43);
                            jArr[i42] = j20;
                            jArr[(((iE3 - 7) & i39) + (i39 & 7)) >> 3] = j20;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i40];
                            iArr[i40] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i40++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i44 = 0; i44 < length3; i44++) {
                        long j21 = jArr12[i44];
                        int i45 = (int) ((j21 >> c) & 2147483647L);
                        int i46 = (int) (j21 & 2147483647L);
                        jArr12[i44] = (((j21 & (-4611686018427387904L)) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]))) << c) | ((long) (i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i46]));
                    }
                    int i47 = this.d;
                    if (i47 != Integer.MAX_VALUE) {
                        this.d = iArr[i47];
                    }
                    int i48 = this.e;
                    if (i48 != Integer.MAX_VALUE) {
                        this.e = iArr[i48];
                    }
                    iE = e(i4);
                }
                this.g++;
                int i49 = this.h;
                long[] jArr13 = this.a;
                int i50 = iE >> 3;
                long j22 = jArr13[i50];
                int i51 = (iE & 7) << 3;
                if (((j22 >> i51) & j2) == j3) {
                    i = 1;
                }
                this.h = i49 - i;
                int i52 = this.f;
                long j23 = (j22 & (~(j2 << i51))) | (j << i51);
                jArr13[i50] = j23;
                jArr13[(((iE - 7) & i52) + (i52 & 7)) >> 3] = j23;
                return iE;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void f(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ce7.c(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = ce7.a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ew.H0(jArr, -9187201950435737472L);
        }
        this.a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.h = ce7.a(this.f) - this.g;
        this.b = iMax == 0 ? bt2.h : new Object[iMax];
        if (iMax == 0) {
            jArr2 = ml9.g;
        } else {
            jArr2 = new long[iMax];
            ew.H0(jArr2, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.js3.i(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb5.g(java.lang.Object):boolean");
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            defpackage.js3.p(r1, r2)
            java.lang.Object[] r2 = r0.b
            int r3 = r0.g
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.a.h0(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb5.i(java.util.Collection):boolean");
    }
}
