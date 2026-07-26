package defpackage;

import android.os.Handler;
import android.os.Looper;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public t0(jb0 jb0Var, lb0 lb0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.a = 1;
        this.d = lb0Var;
        this.b = i;
        this.c = new hb0(jb0Var, j, j2, j3, j4, j5);
    }

    public static int E(w72 w72Var, long j, sd2 sd2Var) {
        if (j == w72Var.getPosition()) {
            return 0;
        }
        sd2Var.a = j;
        return 1;
    }

    public static /* synthetic */ void t(t0 t0Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = t0Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        t0Var.s(i, str, str2);
        throw null;
    }

    public static boolean x(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public String A(boolean z) {
        String strJ;
        byte bZ = z();
        if (z) {
            if (bZ != 1 && bZ != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bZ != 1) {
                return null;
            }
            strJ = j();
        }
        this.d = strJ;
        return strJ;
    }

    public void B(Object[] objArr) {
        Handler handler;
        g6 g6Var = new g6(this, objArr, 20);
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        lw.f(null, null, handler.post(g6Var));
    }

    public abstract int C(int i);

    public void D(Object obj) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        synchronized (this.c) {
            this.d = obj;
            this.b = 2;
            this.c.notify();
        }
    }

    public void F(long j) {
        ib0 ib0Var = (ib0) this.e;
        if (ib0Var == null || ib0Var.a != j) {
            hb0 hb0Var = (hb0) this.c;
            this.e = new ib0(j, hb0Var.a.c(j), hb0Var.c, hb0Var.d, hb0Var.e, hb0Var.f);
        }
    }

    public abstract int G();

    public String H(int i, int i2) {
        return v().subSequence(i, i2).toString();
    }

    public boolean I() {
        int iG = G();
        CharSequence charSequenceV = v();
        if (iG >= charSequenceV.length() || iG == -1 || charSequenceV.charAt(iG) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void J(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strL = l();
                this.b = i;
                if (js3.i(strL, Ssh2PublicKeyAlgorithmName.NULL)) {
                    s(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strG = dt2.G(dt2.e(c));
        int i2 = this.b;
        int i3 = i2 - 1;
        t(this, bl4.w("Expected ", strG, ", but had '", (i2 == v().length() || i3 < 0) ? "EOF" : String.valueOf(v().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (u(i + 3, charSequence) + (u(i, charSequence) << 12) + (u(i + 1, charSequence) << 8) + (u(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        p();
        if (this.b + 4 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        t(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        ((StringBuilder) this.e).append(v(), i, i2);
    }

    public abstract boolean c();

    public void d(int i, String str) {
        if (v().length() - i < str.length()) {
            t(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (v().charAt(i + i2) | ' ')) {
                t(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b) {
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        String strG = dt2.G(b);
        int i = this.b;
        int i2 = i - 1;
        t(this, bl4.w("Expected ", strG, ", but had '", (i == v().length() || i2 < 0) ? "EOF" : String.valueOf(v().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        t(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        t(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        t(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        t(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (v().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        t(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        t(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r21.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        t(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i() {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.i():long");
    }

    public String j() {
        String str = (String) this.d;
        if (str == null) {
            return e();
        }
        js3.m(str);
        this.d = null;
        return str;
    }

    public String k(CharSequence charSequence, int i, int i2) {
        js3.p(charSequence, "source");
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i2);
                int iC = C(i2 + 1);
                if (iC == -1) {
                    t(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iC + 1;
                char cCharAt2 = v().charAt(iC);
                if (cCharAt2 == 'u') {
                    iA = a(iA, v());
                } else {
                    char c = cCharAt2 < 'u' ? rp0.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        t(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    ((StringBuilder) this.e).append(c);
                }
                i = C(iA);
                if (i == -1) {
                    t(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = C(i2);
                    if (i == -1) {
                        t(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        String strH = !z ? H(i, i2) : n(i, i2);
        this.b = i2 + 1;
        return strH;
    }

    public String l() {
        String str = (String) this.d;
        if (str != null) {
            js3.m(str);
            this.d = null;
            return str;
        }
        int iG = G();
        if (iG >= v().length() || iG == -1) {
            t(this, "EOF", iG, null, 4);
            throw null;
        }
        byte bE = dt2.e(v().charAt(iG));
        if (bE == 1) {
            return j();
        }
        if (bE != 0) {
            t(this, "Expected beginning of the string, but got " + v().charAt(iG), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (dt2.e(v().charAt(iG)) == 0) {
            iG++;
            if (iG >= v().length()) {
                b(this.b, iG);
                int iC = C(iG);
                if (iC == -1) {
                    this.b = iG;
                    return n(0, 0);
                }
                iG = iC;
                z = true;
            }
        }
        String strH = !z ? H(this.b, iG) : n(this.b, iG);
        this.b = iG;
        return strH;
    }

    public String m() {
        String strL = l();
        if (!js3.i(strL, Ssh2PublicKeyAlgorithmName.NULL) || v().charAt(this.b - 1) == '\"') {
            return strL;
        }
        t(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String n(int i, int i2) {
        b(i, i2);
        StringBuilder sb = (StringBuilder) this.e;
        String string = sb.toString();
        js3.o(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public abstract void o(t0 t0Var, Object... objArr);

    public Object q(Object... objArr) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        if (Thread.currentThread().getId() == zk8.b) {
            throw new RuntimeException("Method execute() called in main thread");
        }
        System.currentTimeMillis();
        synchronized (this.c) {
            try {
                boolean z = true;
                if (this.b == 0) {
                    B(objArr);
                    this.b = 1;
                }
                if (this.b == 1) {
                    this.c.wait();
                }
                if (this.b != 2) {
                    z = false;
                }
                lw.f(null, null, z);
            } catch (Throwable th) {
                throw th;
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getId();
        threadCurrentThread.getName();
        System.currentTimeMillis();
        Exception exc = (Exception) this.e;
        if (exc == null) {
            return this.d;
        }
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException("Unexpected Exception in doInMainThread()", (Exception) this.e);
    }

    public void r() {
        if (f() == 10) {
            return;
        }
        t(this, "Expected EOF after parsing, but had " + v().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void s(int i, String str, String str2) {
        js3.p(str, "message");
        js3.p(str2, "hint");
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbE = bl4.E(str, " at path: ");
        sbE.append(((pg) this.c).j());
        sbE.append(strConcat);
        throw br9.i(i, v(), sbE.toString());
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) v());
                sb.append("', currentPosition=");
                return dw1.q(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        t(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence v();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return E(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int w(defpackage.w72 r28, defpackage.sd2 r29) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.w(w72, sd2):int");
    }

    public abstract String y(String str, boolean z);

    public byte z() {
        CharSequence charSequenceV = v();
        int i = this.b;
        while (true) {
            int iC = C(i);
            if (iC == -1) {
                this.b = iC;
                return (byte) 10;
            }
            char cCharAt = charSequenceV.charAt(iC);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iC;
                return dt2.e(cCharAt);
            }
            i = iC + 1;
        }
    }

    public t0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = new Object();
                this.b = 0;
                this.e = null;
                break;
            default:
                pg pgVar = new pg(6, false);
                pgVar.c = new Object[8];
                int[] iArr = new int[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    iArr[i2] = -1;
                }
                pgVar.d = iArr;
                pgVar.b = -1;
                this.c = pgVar;
                this.e = new StringBuilder();
                break;
        }
    }

    public void p() {
    }
}
