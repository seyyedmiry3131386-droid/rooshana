package com.airbnb.lottie.parser.moshi;

import defpackage.fv;
import defpackage.gh0;
import defpackage.nc2;
import defpackage.tv5;
import defpackage.tv6;
import defpackage.zp0;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final ByteString l;
    public static final ByteString m;
    public static final ByteString n;
    public final tv6 f;
    public final gh0 g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        ByteString byteString = ByteString.d;
        l = fv.w("'\\");
        m = fv.w("\"\\");
        n = fv.w("{}[]:, \n\t\r\f/\\;#=");
        fv.w("\n\r");
        fv.w("*/");
    }

    public b(tv6 tv6Var) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = tv6Var;
        this.g = tv6Var.b;
        g(6);
    }

    public final void D() throws JsonEncodingException {
        y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (K(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.j = r2;
        r9 = 17;
        r22.h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I() throws com.airbnb.lottie.parser.moshi.JsonEncodingException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.I():int");
    }

    public final int J(String str, nc2 nc2Var) {
        int length = ((String[]) nc2Var.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) nc2Var.b)[i])) {
                this.h = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean K(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        D();
        throw null;
    }

    public final int P(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            tv6 tv6Var = this.f;
            if (!tv6Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            gh0 gh0Var = this.g;
            byte bY = gh0Var.y(j);
            if (bY != 10 && bY != 32 && bY != 13 && bY != 9) {
                gh0Var.skip(j);
                if (bY == 47) {
                    if (tv6Var.request(2L)) {
                        D();
                        throw null;
                    }
                } else if (bY == 35) {
                    D();
                    throw null;
                }
                return bY;
            }
            i = i2;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void P0() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 1) {
            g(3);
            this.h = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + d() + " at path " + m());
        }
    }

    public final String R(ByteString byteString) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jG = this.f.g(byteString);
            if (jG == -1) {
                y("Unterminated string");
                throw null;
            }
            gh0 gh0Var = this.g;
            if (gh0Var.y(jG) != 92) {
                if (sb == null) {
                    String strS0 = gh0Var.s0(jG, zp0.a);
                    gh0Var.readByte();
                    return strS0;
                }
                sb.append(gh0Var.s0(jG, zp0.a));
                gh0Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(gh0Var.s0(jG, zp0.a));
            gh0Var.readByte();
            sb.append(k0());
        }
    }

    public final String U() {
        long jG = this.f.g(n);
        gh0 gh0Var = this.g;
        if (jG == -1) {
            return gh0Var.w0();
        }
        gh0Var.getClass();
        return gh0Var.s0(jG, zp0.a);
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void W0() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + d() + " at path " + m());
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean b() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (I == 6) {
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + d() + " at path " + m());
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void c1() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 3) {
            g(1);
            this.d[this.a - 1] = 0;
            this.h = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + d() + " at path " + m());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.b();
        this.f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final JsonReader$Token d() throws JsonEncodingException, EOFException {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        switch (I) {
            case 1:
                return JsonReader$Token.c;
            case 2:
                return JsonReader$Token.d;
            case 3:
                return JsonReader$Token.a;
            case 4:
                return JsonReader$Token.b;
            case 5:
            case 6:
                return JsonReader$Token.h;
            case 7:
                return JsonReader$Token.i;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader$Token.f;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader$Token.e;
            case 16:
            case 17:
                return JsonReader$Token.g;
            case 18:
                return JsonReader$Token.j;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean hasNext() throws JsonEncodingException, EOFException {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        return (I == 2 || I == 4 || I == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int k(nc2 nc2Var) {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I < 12 || I > 15) {
            return -1;
        }
        if (I == 15) {
            return J(this.k, nc2Var);
        }
        int iA = this.f.A((tv5) nc2Var.c);
        if (iA != -1) {
            this.h = 0;
            this.c[this.a - 1] = ((String[]) nc2Var.b)[iA];
            return iA;
        }
        String str = this.c[this.a - 1];
        String strM0 = m0();
        int iJ = J(strM0, nc2Var);
        if (iJ == -1) {
            this.h = 15;
            this.k = strM0;
            this.c[this.a - 1] = str;
        }
        return iJ;
    }

    public final char k0() throws JsonEncodingException, EOFException {
        int i;
        tv6 tv6Var = this.f;
        if (!tv6Var.request(1L)) {
            y("Unterminated escape sequence");
            throw null;
        }
        gh0 gh0Var = this.g;
        byte b = gh0Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            y("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!tv6Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bY = gh0Var.y(i2);
            char c2 = (char) (c << 4);
            if (bY >= 48 && bY <= 57) {
                i = bY - 48;
            } else if (bY >= 97 && bY <= 102) {
                i = bY - 87;
            } else {
                if (bY < 65 || bY > 70) {
                    y("\\u".concat(gh0Var.s0(4L, zp0.a)));
                    throw null;
                }
                i = bY - 55;
            }
            c = (char) (i + c2);
        }
        gh0Var.skip(4L);
        return c;
    }

    public final void l0(ByteString byteString) throws JsonEncodingException, EOFException {
        while (true) {
            long jG = this.f.g(byteString);
            if (jG == -1) {
                y("Unterminated string");
                throw null;
            }
            gh0 gh0Var = this.g;
            if (gh0Var.y(jG) != 92) {
                gh0Var.skip(jG + 1);
                return;
            } else {
                gh0Var.skip(jG + 1);
                k0();
            }
        }
    }

    public final String m0() {
        String strR;
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 14) {
            strR = U();
        } else if (I == 13) {
            strR = R(m);
        } else if (I == 12) {
            strR = R(l);
        } else {
            if (I != 15) {
                throw new JsonDataException("Expected a name but was " + d() + " at path " + m());
            }
            strR = this.k;
        }
        this.h = 0;
        this.c[this.a - 1] = strR;
        return strR;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final double nextDouble() throws JsonEncodingException, EOFException {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (I == 17) {
            long j = this.j;
            gh0 gh0Var = this.g;
            gh0Var.getClass();
            this.k = gh0Var.s0(j, zp0.a);
        } else if (I == 9) {
            this.k = R(m);
        } else if (I == 8) {
            this.k = R(l);
        } else if (I == 10) {
            this.k = U();
        } else if (I != 11) {
            throw new JsonDataException("Expected a double but was " + d() + " at path " + m());
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + m());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.k + " at path " + m());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int nextInt() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.i + " at path " + m());
        }
        if (I == 17) {
            long j2 = this.j;
            gh0 gh0Var = this.g;
            gh0Var.getClass();
            this.k = gh0Var.s0(j2, zp0.a);
        } else if (I == 9 || I == 8) {
            String strR = I == 9 ? R(m) : R(l);
            this.k = strR;
            try {
                int i3 = Integer.parseInt(strR);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (I != 11) {
            throw new JsonDataException("Expected an int but was " + d() + " at path " + m());
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            int i5 = (int) d;
            if (i5 != d) {
                throw new JsonDataException("Expected an int but was " + this.k + " at path " + m());
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.k + " at path " + m());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final String t() {
        String strS0;
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 10) {
            strS0 = U();
        } else if (I == 9) {
            strS0 = R(m);
        } else if (I == 8) {
            strS0 = R(l);
        } else if (I == 11) {
            strS0 = this.k;
            this.k = null;
        } else if (I == 16) {
            strS0 = Long.toString(this.i);
        } else {
            if (I != 17) {
                throw new JsonDataException("Expected a string but was " + d() + " at path " + m());
            }
            long j = this.j;
            gh0 gh0Var = this.g;
            gh0Var.getClass();
            strS0 = gh0Var.s0(j, zp0.a);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strS0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void t0() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + d() + " at path " + m());
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void u() {
        int I = this.h;
        if (I == 0) {
            I = I();
        }
        if (I == 14) {
            long jG = this.f.g(n);
            gh0 gh0Var = this.g;
            if (jG == -1) {
                jG = gh0Var.b;
            }
            gh0Var.skip(jG);
        } else if (I == 13) {
            l0(m);
        } else if (I == 12) {
            l0(l);
        } else if (I != 15) {
            throw new JsonDataException("Expected a name but was " + d() + " at path " + m());
        }
        this.h = 0;
        this.c[this.a - 1] = Ssh2PublicKeyAlgorithmName.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void z() {
        int i = 0;
        do {
            int I = this.h;
            if (I == 0) {
                I = I();
            }
            if (I == 3) {
                g(1);
            } else if (I == 1) {
                g(3);
            } else {
                if (I == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + d() + " at path " + m());
                    }
                    this.a--;
                } else if (I == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + d() + " at path " + m());
                    }
                    this.a--;
                } else {
                    gh0 gh0Var = this.g;
                    if (I == 14 || I == 10) {
                        long jG = this.f.g(n);
                        if (jG == -1) {
                            jG = gh0Var.b;
                        }
                        gh0Var.skip(jG);
                    } else if (I == 9 || I == 13) {
                        l0(m);
                    } else if (I == 8 || I == 12) {
                        l0(l);
                    } else if (I == 17) {
                        gh0Var.skip(this.j);
                    } else if (I == 18) {
                        throw new JsonDataException("Expected a value but was " + d() + " at path " + m());
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = Ssh2PublicKeyAlgorithmName.NULL;
    }
}
