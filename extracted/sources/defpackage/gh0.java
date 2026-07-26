package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class gh0 implements ph0, oh0, Cloneable, ByteChannel {
    public vl7 a;
    public long b;

    @Override // defpackage.ph0
    public final int A(tv5 tv5Var) {
        js3.p(tv5Var, "options");
        int iD = b.d(this, tv5Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(tv5Var.a[iD].e());
        return iD;
    }

    public final int C0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            throw new EOFException();
        }
        byte bY = y(0L);
        if ((bY & 128) == 0) {
            i = bY & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bY & 224) == 192) {
            i = bY & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bY & 240) == 224) {
            i = bY & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bY & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bY & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbR = rm7.r(i2, "size < ", ": ");
            sbR.append(this.b);
            sbR.append(" (to read code point prefixed 0x");
            sbR.append(wq2.V(bY));
            sbR.append(')');
            throw new EOFException(sbR.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bY2 = y(j2);
            if ((bY2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bY2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final long D(byte b, long j, long j2) {
        vl7 vl7Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (vl7Var = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                vl7Var = vl7Var.g;
                js3.m(vl7Var);
                j4 -= (long) (vl7Var.c - vl7Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = vl7Var.a;
                int iMin = (int) Math.min(vl7Var.c, (((long) vl7Var.b) + j2) - j4);
                for (int i = (int) ((((long) vl7Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - vl7Var.b)) + j4;
                    }
                }
                j4 += (long) (vl7Var.c - vl7Var.b);
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (vl7Var.c - vl7Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = vl7Var.a;
            int iMin2 = (int) Math.min(vl7Var.c, (((long) vl7Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) vl7Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - vl7Var.b)) + j3;
                }
            }
            j3 += (long) (vl7Var.c - vl7Var.b);
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j = j3;
        }
        return -1L;
    }

    public final ByteString D0(int i) {
        if (i == 0) {
            return ByteString.d;
        }
        wq2.m(this.b, 0L, i);
        vl7 vl7Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            js3.m(vl7Var);
            int i5 = vl7Var.c;
            int i6 = vl7Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            vl7Var = vl7Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        vl7 vl7Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            js3.m(vl7Var2);
            bArr[i7] = vl7Var2.a;
            i2 += vl7Var2.c - vl7Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vl7Var2.b;
            vl7Var2.d = true;
            i7++;
            vl7Var2 = vl7Var2.f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final vl7 F0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            vl7 vl7VarB = am7.b();
            this.a = vl7VarB;
            vl7VarB.g = vl7VarB;
            vl7VarB.f = vl7VarB;
            return vl7VarB;
        }
        vl7 vl7Var2 = vl7Var.g;
        js3.m(vl7Var2);
        if (vl7Var2.c + i <= 8192 && vl7Var2.e) {
            return vl7Var2;
        }
        vl7 vl7VarB2 = am7.b();
        vl7Var2.b(vl7VarB2);
        return vl7VarB2;
    }

    public final void H0(int i, byte[] bArr) {
        js3.p(bArr, "source");
        int i2 = 0;
        long j = i;
        wq2.m(bArr.length, 0, j);
        while (i2 < i) {
            vl7 vl7VarF0 = F0(1);
            int iMin = Math.min(i - i2, 8192 - vl7VarF0.c);
            int i3 = i2 + iMin;
            ew.w0(vl7VarF0.c, i2, i3, bArr, vl7VarF0.a);
            vl7VarF0.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final long I(ByteString byteString) {
        js3.p(byteString, "targetBytes");
        return J(byteString, 0L);
    }

    public final long J(ByteString byteString, long j) {
        js3.p(byteString, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "fromIndex < 0: ").toString());
        }
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                vl7Var = vl7Var.g;
                js3.m(vl7Var);
                j3 -= (long) (vl7Var.c - vl7Var.b);
            }
            if (byteString.e() == 2) {
                byte bJ = byteString.j(0);
                byte bJ2 = byteString.j(1);
                while (j3 < this.b) {
                    byte[] bArr = vl7Var.a;
                    int i = vl7Var.c;
                    for (int i2 = (int) ((((long) vl7Var.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bJ || b == bJ2) {
                            return ((long) (i2 - vl7Var.b)) + j3;
                        }
                    }
                    j3 += (long) (vl7Var.c - vl7Var.b);
                    vl7Var = vl7Var.f;
                    js3.m(vl7Var);
                    j = j3;
                }
            } else {
                byte[] bArrI = byteString.i();
                while (j3 < this.b) {
                    byte[] bArr2 = vl7Var.a;
                    int i3 = vl7Var.c;
                    for (int i4 = (int) ((((long) vl7Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrI) {
                            if (b2 == b3) {
                                return ((long) (i4 - vl7Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (vl7Var.c - vl7Var.b);
                    vl7Var = vl7Var.f;
                    js3.m(vl7Var);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (vl7Var.c - vl7Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j2 = j4;
        }
        if (byteString.e() == 2) {
            byte bJ3 = byteString.j(0);
            byte bJ4 = byteString.j(1);
            while (j2 < this.b) {
                byte[] bArr3 = vl7Var.a;
                int i5 = vl7Var.c;
                for (int i6 = (int) ((((long) vl7Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bJ3 || b4 == bJ4) {
                        return ((long) (i6 - vl7Var.b)) + j2;
                    }
                }
                j2 += (long) (vl7Var.c - vl7Var.b);
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                j = j2;
            }
        } else {
            byte[] bArrI2 = byteString.i();
            while (j2 < this.b) {
                byte[] bArr4 = vl7Var.a;
                int i7 = vl7Var.c;
                for (int i8 = (int) ((((long) vl7Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrI2) {
                        if (b5 == b6) {
                            return ((long) (i8 - vl7Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (vl7Var.c - vl7Var.b);
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                j = j2;
            }
        }
        return -1L;
    }

    public final boolean K(long j, ByteString byteString, int i) {
        js3.p(byteString, "bytes");
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= byteString.e()) {
            return i == 0 || b.a(this, byteString, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void L0(ByteString byteString) {
        js3.p(byteString, "byteString");
        byteString.t(this, byteString.e());
    }

    public final void N0(t18 t18Var) {
        js3.p(t18Var, "source");
        while (t18Var.f0(this, 8192L) != -1) {
        }
    }

    public final byte[] P(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r1 = new defpackage.gh0();
        r1.U0(r8);
        r1.R0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.w0()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long R() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh0.R():long");
    }

    public final void R0(int i) {
        vl7 vl7VarF0 = F0(1);
        byte[] bArr = vl7VarF0.a;
        int i2 = vl7VarF0.c;
        vl7VarF0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 T0(ByteString byteString) {
        L0(byteString);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long U() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            vl7 r6 = r14.a
            defpackage.js3.m(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            gh0 r0 = new gh0
            r0.<init>()
            r0.Y0(r4)
            r0.R0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.w0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = defpackage.wq2.V(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r8 != r9) goto L85
            vl7 r7 = r6.a()
            r14.a = r7
            defpackage.am7.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            vl7 r6 = r14.a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh0.U():long");
    }

    public final void U0(long j) {
        boolean z;
        if (j == 0) {
            R0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                h1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        vl7 vl7VarF0 = F0(i);
        byte[] bArr2 = vl7VarF0.a;
        int i2 = vl7VarF0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = b.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        vl7VarF0.c += i;
        this.b += (long) i;
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) {
        vl7 vl7VarB;
        js3.p(gh0Var, "source");
        if (gh0Var == this) {
            throw new IllegalArgumentException("source == this");
        }
        wq2.m(gh0Var.b, 0L, j);
        while (j > 0) {
            vl7 vl7Var = gh0Var.a;
            js3.m(vl7Var);
            int i = vl7Var.c;
            vl7 vl7Var2 = gh0Var.a;
            js3.m(vl7Var2);
            long j2 = i - vl7Var2.b;
            int i2 = 0;
            if (j < j2) {
                vl7 vl7Var3 = this.a;
                vl7 vl7Var4 = vl7Var3 != null ? vl7Var3.g : null;
                if (vl7Var4 != null && vl7Var4.e) {
                    if ((((long) vl7Var4.c) + j) - ((long) (vl7Var4.d ? 0 : vl7Var4.b)) <= 8192) {
                        vl7 vl7Var5 = gh0Var.a;
                        js3.m(vl7Var5);
                        vl7Var5.d(vl7Var4, (int) j);
                        gh0Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                vl7 vl7Var6 = gh0Var.a;
                js3.m(vl7Var6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > vl7Var6.c - vl7Var6.b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    vl7VarB = vl7Var6.c();
                } else {
                    vl7VarB = am7.b();
                    byte[] bArr = vl7Var6.a;
                    byte[] bArr2 = vl7VarB.a;
                    int i4 = vl7Var6.b;
                    ew.w0(0, i4, i4 + i3, bArr, bArr2);
                }
                vl7VarB.c = vl7VarB.b + i3;
                vl7Var6.b += i3;
                vl7 vl7Var7 = vl7Var6.g;
                js3.m(vl7Var7);
                vl7Var7.b(vl7VarB);
                gh0Var.a = vl7VarB;
            }
            vl7 vl7Var8 = gh0Var.a;
            js3.m(vl7Var8);
            long j3 = vl7Var8.c - vl7Var8.b;
            gh0Var.a = vl7Var8.a();
            vl7 vl7Var9 = this.a;
            if (vl7Var9 == null) {
                this.a = vl7Var8;
                vl7Var8.g = vl7Var8;
                vl7Var8.f = vl7Var8;
            } else {
                vl7 vl7Var10 = vl7Var9.g;
                js3.m(vl7Var10);
                vl7Var10.b(vl7Var8);
                vl7 vl7Var11 = vl7Var8.g;
                if (vl7Var11 == vl7Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                js3.m(vl7Var11);
                if (vl7Var11.e) {
                    int i5 = vl7Var8.c - vl7Var8.b;
                    vl7 vl7Var12 = vl7Var8.g;
                    js3.m(vl7Var12);
                    int i6 = 8192 - vl7Var12.c;
                    vl7 vl7Var13 = vl7Var8.g;
                    js3.m(vl7Var13);
                    if (!vl7Var13.d) {
                        vl7 vl7Var14 = vl7Var8.g;
                        js3.m(vl7Var14);
                        i2 = vl7Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        vl7 vl7Var15 = vl7Var8.g;
                        js3.m(vl7Var15);
                        vl7Var8.d(vl7Var15, i5);
                        vl7Var8.a();
                        am7.a(vl7Var8);
                    }
                }
            }
            gh0Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.ph0
    public final String Y(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jD = D((byte) 10, 0L, j2);
        if (jD != -1) {
            return b.c(this, jD);
        }
        if (j2 < this.b && y(j2 - 1) == 13 && y(j2) == 10) {
            return b.c(this, j2);
        }
        gh0 gh0Var = new gh0();
        k(gh0Var, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + gh0Var.v(gh0Var.b).f() + (char) 8230);
    }

    public final void Y0(long j) {
        if (j == 0) {
            R0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        vl7 vl7VarF0 = F0(i);
        byte[] bArr = vl7VarF0.a;
        int i2 = vl7VarF0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        vl7VarF0.c += i;
        this.b += (long) i;
    }

    public final void a1(int i) {
        vl7 vl7VarF0 = F0(4);
        byte[] bArr = vl7VarF0.a;
        int i2 = vl7VarF0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        vl7VarF0.c = i2 + 4;
        this.b += 4;
    }

    public final void b() {
        skip(this.b);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final gh0 clone() {
        gh0 gh0Var = new gh0();
        if (this.b == 0) {
            return gh0Var;
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        vl7 vl7VarC = vl7Var.c();
        gh0Var.a = vl7VarC;
        vl7VarC.g = vl7VarC;
        vl7VarC.f = vl7VarC;
        for (vl7 vl7Var2 = vl7Var.f; vl7Var2 != vl7Var; vl7Var2 = vl7Var2.f) {
            vl7 vl7Var3 = vl7VarC.g;
            js3.m(vl7Var3);
            js3.m(vl7Var2);
            vl7Var3.b(vl7Var2.c());
        }
        gh0Var.b = this.b;
        return gh0Var;
    }

    @Override // defpackage.ph0
    public final long e0(oh0 oh0Var) {
        long j = this.b;
        if (j > 0) {
            oh0Var.X0(this, j);
        }
        return j;
    }

    public final void e1(int i) {
        vl7 vl7VarF0 = F0(2);
        byte[] bArr = vl7VarF0.a;
        int i2 = vl7VarF0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        vl7VarF0.c = i2 + 2;
        this.b += 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        long j = this.b;
        gh0 gh0Var = (gh0) obj;
        if (j != gh0Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        vl7 vl7Var2 = gh0Var.a;
        js3.m(vl7Var2);
        int i = vl7Var.b;
        int i2 = vl7Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(vl7Var.c - i, vl7Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (vl7Var.a[i] != vl7Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == vl7Var.c) {
                vl7Var = vl7Var.f;
                js3.m(vl7Var);
                i = vl7Var.b;
            }
            if (i2 == vl7Var2.c) {
                vl7Var2 = vl7Var2.f;
                js3.m(vl7Var2);
                i2 = vl7Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        gh0Var.X0(this, j);
        return j;
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        vl7 vl7Var2 = vl7Var.g;
        js3.m(vl7Var2);
        int i = vl7Var2.c;
        return (i >= 8192 || !vl7Var2.e) ? j : j - ((long) (i - vl7Var2.b));
    }

    @Override // defpackage.ph0
    public final void g1(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final void h1(String str) {
        js3.p(str, "string");
        j1(str, 0, str.length());
    }

    public final int hashCode() {
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vl7Var.c;
            for (int i3 = vl7Var.b; i3 < i2; i3++) {
                i = (i * 31) + vl7Var.a[i3];
            }
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
        } while (vl7Var != this.a);
        return i;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return dm8.d;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 i1(long j) {
        U0(j);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 j0(int i, byte[] bArr) {
        H0(i, bArr);
        return this;
    }

    public final void j1(String str, int i, int i2) {
        char cCharAt;
        js3.p(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(dw1.j(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbR = rm7.r(i2, "endIndex > string.length: ", " > ");
            sbR.append(str.length());
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                vl7 vl7VarF0 = F0(1);
                byte[] bArr = vl7VarF0.a;
                int i3 = vl7VarF0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = vl7VarF0.c;
                int i6 = (i3 + i) - i5;
                vl7VarF0.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    vl7 vl7VarF02 = F0(2);
                    byte[] bArr2 = vl7VarF02.a;
                    int i7 = vl7VarF02.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    vl7VarF02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    vl7 vl7VarF03 = F0(3);
                    byte[] bArr3 = vl7VarF03.a;
                    int i8 = vl7VarF03.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    vl7VarF03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        R0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        vl7 vl7VarF04 = F0(4);
                        byte[] bArr4 = vl7VarF04.a;
                        int i11 = vl7VarF04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        vl7VarF04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void k(gh0 gh0Var, long j, long j2) {
        js3.p(gh0Var, "out");
        long j3 = j;
        wq2.m(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        gh0Var.b += j2;
        vl7 vl7Var = this.a;
        while (true) {
            js3.m(vl7Var);
            long j4 = vl7Var.c - vl7Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            vl7Var = vl7Var.f;
        }
        vl7 vl7Var2 = vl7Var;
        long j5 = j2;
        while (j5 > 0) {
            js3.m(vl7Var2);
            vl7 vl7VarC = vl7Var2.c();
            int i = vl7VarC.b + ((int) j3);
            vl7VarC.b = i;
            vl7VarC.c = Math.min(i + ((int) j5), vl7VarC.c);
            vl7 vl7Var3 = gh0Var.a;
            if (vl7Var3 == null) {
                vl7VarC.g = vl7VarC;
                vl7VarC.f = vl7VarC;
                gh0Var.a = vl7VarC;
            } else {
                vl7 vl7Var4 = vl7Var3.g;
                js3.m(vl7Var4);
                vl7Var4.b(vl7VarC);
            }
            j5 -= (long) (vl7VarC.c - vl7VarC.b);
            vl7Var2 = vl7Var2.f;
            j3 = 0;
        }
    }

    public final short k0() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final void l1(int i) {
        if (i < 128) {
            R0(i);
            return;
        }
        if (i < 2048) {
            vl7 vl7VarF0 = F0(2);
            byte[] bArr = vl7VarF0.a;
            int i2 = vl7VarF0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            vl7VarF0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            R0(63);
            return;
        }
        if (i < 65536) {
            vl7 vl7VarF02 = F0(3);
            byte[] bArr2 = vl7VarF02.a;
            int i3 = vl7VarF02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            vl7VarF02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(wq2.W(i)));
        }
        vl7 vl7VarF03 = F0(4);
        byte[] bArr3 = vl7VarF03.a;
        int i4 = vl7VarF03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        vl7VarF03.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 n0(String str) {
        h1(str);
        return this;
    }

    @Override // defpackage.ph0
    public final InputStream n1() {
        return new fh0(this, 0);
    }

    @Override // defpackage.ph0
    public final tv6 peek() {
        return rf0.j(new n46(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        js3.p(byteBuffer, "sink");
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), vl7Var.c - vl7Var.b);
        byteBuffer.put(vl7Var.a, vl7Var.b, iMin);
        int i = vl7Var.b + iMin;
        vl7Var.b = i;
        this.b -= (long) iMin;
        if (i == vl7Var.c) {
            this.a = vl7Var.a();
            am7.a(vl7Var);
        }
        return iMin;
    }

    @Override // defpackage.ph0
    public final byte readByte() {
        if (this.b == 0) {
            throw new EOFException();
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        int i = vl7Var.b;
        int i2 = vl7Var.c;
        int i3 = i + 1;
        byte b = vl7Var.a[i];
        this.b--;
        if (i3 != i2) {
            vl7Var.b = i3;
            return b;
        }
        this.a = vl7Var.a();
        am7.a(vl7Var);
        return b;
    }

    @Override // defpackage.ph0
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        int i = vl7Var.b;
        int i2 = vl7Var.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = vl7Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            vl7Var.b = i5;
            return i6;
        }
        this.a = vl7Var.a();
        am7.a(vl7Var);
        return i6;
    }

    @Override // defpackage.ph0
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        int i = vl7Var.b;
        int i2 = vl7Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = vl7Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = vl7Var.a();
            am7.a(vl7Var);
        } else {
            vl7Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ph0
    public final boolean request(long j) {
        return this.b >= j;
    }

    public final String s0(long j, Charset charset) throws EOFException {
        js3.p(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        vl7 vl7Var = this.a;
        js3.m(vl7Var);
        int i = vl7Var.b;
        if (((long) i) + j > vl7Var.c) {
            return new String(P(j), charset);
        }
        int i2 = (int) j;
        String str = new String(vl7Var.a, i, i2, charset);
        int i3 = vl7Var.b + i2;
        vl7Var.b = i3;
        this.b -= j;
        if (i3 == vl7Var.c) {
            this.a = vl7Var.a();
            am7.a(vl7Var);
        }
        return str;
    }

    @Override // defpackage.ph0
    public final void skip(long j) {
        while (j > 0) {
            vl7 vl7Var = this.a;
            if (vl7Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, vl7Var.c - vl7Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = vl7Var.b + iMin;
            vl7Var.b = i;
            if (i == vl7Var.c) {
                this.a = vl7Var.a();
                am7.a(vl7Var);
            }
        }
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return D0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final boolean u() {
        return this.b == 0;
    }

    @Override // defpackage.ph0
    public final String u0(Charset charset) {
        js3.p(charset, "charset");
        return s0(this.b, charset);
    }

    @Override // defpackage.ph0
    public final ByteString v(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(P(j));
        }
        ByteString byteStringD0 = D0((int) j);
        skip(j);
        return byteStringD0;
    }

    public final String w0() {
        return s0(this.b, zp0.a);
    }

    @Override // defpackage.oh0
    public final oh0 write(byte[] bArr) {
        js3.p(bArr, "source");
        H0(bArr.length, bArr);
        return this;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 writeByte(int i) {
        R0(i);
        return this;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 writeInt(int i) {
        a1(i);
        return this;
    }

    @Override // defpackage.oh0
    public final /* bridge */ /* synthetic */ oh0 writeShort(int i) {
        e1(i);
        return this;
    }

    public final byte y(long j) {
        wq2.m(this.b, j, 1L);
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            js3.m(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                vl7Var = vl7Var.g;
                js3.m(vl7Var);
                j2 -= (long) (vl7Var.c - vl7Var.b);
            }
            return vl7Var.a[(int) ((((long) vl7Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = vl7Var.c;
            int i2 = vl7Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return vl7Var.a[(int) ((((long) i2) + j) - j3)];
            }
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j3 = j4;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        js3.p(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            vl7 vl7VarF0 = F0(1);
            int iMin = Math.min(i, 8192 - vl7VarF0.c);
            byteBuffer.get(vl7VarF0.a, vl7VarF0.c, iMin);
            i -= iMin;
            vl7VarF0.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i, int i2) {
        wq2.m(bArr.length, i, i2);
        vl7 vl7Var = this.a;
        if (vl7Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, vl7Var.c - vl7Var.b);
        byte[] bArr2 = vl7Var.a;
        int i3 = vl7Var.b;
        ew.w0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = vl7Var.b + iMin;
        vl7Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == vl7Var.c) {
            this.a = vl7Var.a();
            am7.a(vl7Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.by7
    public final void close() {
    }

    @Override // defpackage.oh0, defpackage.by7, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.ph0, defpackage.oh0
    public final gh0 h() {
        return this;
    }
}
