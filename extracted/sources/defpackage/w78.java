package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class w78 extends t0 {
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w78(String str) {
        super(0);
        js3.p(str, "source");
        this.f = str;
    }

    @Override // defpackage.t0
    public final int C(int i) {
        if (i < this.f.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.t0
    public int G() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.t0
    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return t0.x(cCharAt);
            }
            i++;
        }
    }

    @Override // defpackage.t0
    public final String e() {
        h('\"');
        int i = this.b;
        String str = this.f;
        int iK0 = f88.k0('\"', i, 4, str);
        if (iK0 == -1) {
            l();
            int i2 = this.b;
            t0.t(this, o40.y("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iK0; i3++) {
            if (str.charAt(i3) == '\\') {
                return k(str, this.b, i3);
            }
        }
        this.b = iK0 + 1;
        String strSubstring = str.substring(i, iK0);
        js3.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // defpackage.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.b
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.f
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.b = r1
            byte r0 = defpackage.dt2.e(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w78.f():byte");
    }

    @Override // defpackage.t0
    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            J(c);
            throw null;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = -1;
                J(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                J(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.t0
    public final CharSequence v() {
        return this.f;
    }

    @Override // defpackage.t0
    public final String y(String str, boolean z) {
        js3.p(str, "keyToMatch");
        int i = this.b;
        try {
            if (f() == 6 && js3.i(A(z), str)) {
                this.d = null;
                if (f() == 5) {
                    return A(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }
}
