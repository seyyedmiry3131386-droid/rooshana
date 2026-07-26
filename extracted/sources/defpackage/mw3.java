package defpackage;

import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public class mw3 implements Closeable {
    public final StringReader a;
    public long i;
    public int j;
    public String k;
    public int[] l;
    public String[] n;
    public int[] o;
    public Strictness b = Strictness.b;
    public final char[] c = new char[1024];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int m = 1;

    static {
        ql3.a = new ql3();
    }

    public mw3(StringReader stringReader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        this.a = stringReader;
    }

    public final void C0(String str) throws MalformedJsonException {
        StringBuilder sbC = bl4.C(str);
        sbC.append(y());
        sbC.append("\nSee ");
        sbC.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbC.toString());
    }

    public final boolean D() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iD != 6) {
            throw D0("a boolean");
        }
        this.h = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final IllegalStateException D0(String str) {
        String str2 = R() == JsonToken.i ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbN = t61.n("Expected ", str, " but was ");
        sbN.append(R());
        sbN.append(y());
        sbN.append("\nSee ");
        sbN.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbN.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.I(boolean):int");
    }

    public final void J() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw D0(Ssh2PublicKeyAlgorithmName.NULL);
        }
        this.h = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String K(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.d
            int r3 = r11.e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.c
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            com.google.gson.Strictness r9 = r11.b
            com.google.gson.Strictness r10 = com.google.gson.Strictness.c
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.C0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.k0()
            r1.append(r2)
            int r2 = r11.d
            int r3 = r11.e
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f
            int r2 = r2 + r6
            r11.f = r2
            r11.g = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.d = r2
            boolean r2 = r11.g(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.C0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.K(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        b();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.d
            int r4 = r3 + r2
            int r5 = r7.e
            char[] r6 = r7.c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.b()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.g(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.d
            r0.append(r6, r3, r2)
            int r3 = r7.d
            int r3 = r3 + r2
            r7.d = r3
            r2 = 1
            boolean r2 = r7.g(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.d
            int r2 = r2 + r1
            r7.d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.P():java.lang.String");
    }

    public final void P0() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 1) {
            throw D0("BEGIN_OBJECT");
        }
        U(3);
        this.h = 0;
    }

    public final JsonToken R() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case 1:
                return JsonToken.c;
            case 2:
                return JsonToken.d;
            case 3:
                return JsonToken.a;
            case 4:
                return JsonToken.b;
            case 5:
            case 6:
                return JsonToken.h;
            case 7:
                return JsonToken.i;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.f;
            case 12:
            case 13:
            case 14:
                return JsonToken.e;
            case 15:
            case 16:
                return JsonToken.g;
            case 17:
                return JsonToken.j;
            default:
                throw new AssertionError();
        }
    }

    public final void U(int i) throws MalformedJsonException {
        int i2 = this.m;
        if (i2 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + y());
        }
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    public final void W0() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw D0("END_ARRAY");
        }
        int i = this.m;
        this.m = i - 1;
        int[] iArr = this.o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    public final void b() throws MalformedJsonException {
        if (this.b == Strictness.a) {
            return;
        }
        C0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void c1() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 3) {
            throw D0("BEGIN_ARRAY");
        }
        U(1);
        this.o[this.m - 1] = 0;
        this.h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x021c, code lost:
    
        if (u(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.d():int");
    }

    public final boolean g(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        char[] cArr = this.c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i8 = this.e;
            int i9 = this.a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.e + i9;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final boolean hasNext() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final String k(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.l[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.o[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.n[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(rm7.n(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    public final char k0() throws MalformedJsonException {
        int i;
        if (this.d == this.e && !g(1)) {
            C0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        Strictness strictness = Strictness.c;
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            C0("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.e && !g(4)) {
                            C0("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.d;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    C0("Malformed Unicode escape \\u".concat(new String(cArr, this.d, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.d += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.b == strictness) {
            C0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f++;
        this.g = i3;
        if (this.b == strictness) {
            C0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void l0(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.b = strictness;
    }

    public final String m0() throws IOException {
        String strK;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strK = P();
        } else if (iD == 12) {
            strK = K('\'');
        } else {
            if (iD != 13) {
                throw D0("a name");
            }
            strK = K('\"');
        }
        this.h = 0;
        this.n[this.m - 1] = strK;
        return strK;
    }

    public final double nextDouble() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iD == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (iD == 8 || iD == 9) {
            this.k = K(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.k = P();
        } else if (iD != 11) {
            throw D0("a double");
        }
        this.h = 11;
        double d = Double.parseDouble(this.k);
        if (this.b != Strictness.a && (Double.isNaN(d) || Double.isInfinite(d))) {
            C0("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final int nextInt() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j = this.i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.i + y());
            }
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iD == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw D0("an int");
            }
            if (iD == 10) {
                this.k = P();
            } else {
                this.k = K(iD == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.k + y());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final long nextLong() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iD == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw D0("a long");
            }
            if (iD == 10) {
                this.k = P();
            } else {
                this.k = K(iD == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double d = Double.parseDouble(this.k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.k + y());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i3 = this.m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final void r0(char c) throws MalformedJsonException {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    k0();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (g(1));
        C0("Unterminated string");
        throw null;
    }

    public final void s0() {
        char c;
        do {
            if (this.d >= this.e && !g(1)) {
                return;
            }
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = this.c[i];
            if (c == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c != '\r');
    }

    public final String t() throws IOException {
        String str;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = P();
        } else if (iD == 8) {
            str = K('\'');
        } else if (iD == 9) {
            str = K('\"');
        } else if (iD == 11) {
            str = this.k;
            this.k = null;
        } else if (iD == 15) {
            str = Long.toString(this.i);
        } else {
            if (iD != 16) {
                throw D0("a string");
            }
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        }
        this.h = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void t0() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw D0("END_OBJECT");
        }
        int i = this.m;
        int i2 = i - 1;
        this.m = i2;
        this.n[i2] = null;
        int[] iArr = this.o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public final String toString() {
        return mw3.class.getSimpleName() + y();
    }

    public final boolean u(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.d
            int r2 = r1 + r0
            int r3 = r4.e
            if (r2 >= r3) goto L51
            char[] r2 = r4.c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.b()
        L4b:
            int r1 = r4.d
            int r1 = r1 + r0
            r4.d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.d = r1
            r0 = 1
            boolean r0 = r4.g(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw3.w0():void");
    }

    public final String y() {
        StringBuilder sbB = bl4.B(this.f + 1, (this.d - this.g) + 1, " at line ", " column ", " path ");
        sbB.append(k(false));
        return sbB.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void z() throws IOException {
        int i = 0;
        do {
            int iD = this.h;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case 1:
                    U(3);
                    i++;
                    this.h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.n[this.m - 1] = null;
                    }
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 3:
                    U(1);
                    i++;
                    this.h = 0;
                    break;
                case 4:
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    r0('\'');
                    this.h = 0;
                    break;
                case 9:
                    r0('\"');
                    this.h = 0;
                    break;
                case 10:
                    w0();
                    this.h = 0;
                    break;
                case 12:
                    r0('\'');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    r0('\"');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    w0();
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.d += this.j;
                    this.h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
    }
}
