package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class nv6 extends t0 {
    public final pj9 f;
    public final char[] g;
    public int h;
    public final lv i;

    public nv6(pj9 pj9Var, char[] cArr) {
        super(0);
        this.f = pj9Var;
        this.g = cArr;
        this.h = 128;
        this.i = new lv(cArr);
        K(0);
    }

    @Override // defpackage.t0
    public final int C(int i) {
        lv lvVar = this.i;
        if (i < lvVar.b) {
            return i;
        }
        this.b = i;
        p();
        return (this.b != 0 || lvVar.length() == 0) ? -1 : 0;
    }

    @Override // defpackage.t0
    public int G() {
        int iC;
        char c;
        int i = this.b;
        while (true) {
            iC = C(i);
            if (iC == -1 || !((c = this.i.a[iC]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iC + 1;
        }
        this.b = iC;
        return iC;
    }

    @Override // defpackage.t0
    public final String H(int i, int i2) {
        lv lvVar = this.i;
        return m88.R(lvVar.a, i, Math.min(i2, lvVar.b));
    }

    public final void K(int i) {
        lv lvVar = this.i;
        char[] cArr = lvVar.a;
        if (i != 0) {
            int i2 = this.b;
            ew.z0(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = lvVar.b;
        while (true) {
            if (i == i3) {
                break;
            }
            pj9 pj9Var = this.f;
            pj9Var.getClass();
            int iA = ((yp0) pj9Var.a).a(cArr, i, i3 - i);
            if (iA == -1) {
                lvVar.b = Math.min(lvVar.a.length, i);
                this.h = -1;
                break;
            }
            i += iA;
        }
        this.b = 0;
    }

    public final void L() {
        pp0 pp0Var = pp0.c;
        pp0Var.getClass();
        char[] cArr = this.g;
        js3.p(cArr, "array");
        if (cArr.length == 16384) {
            pp0Var.b(cArr);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
        }
    }

    @Override // defpackage.t0
    public final void b(int i, int i2) {
        ((StringBuilder) this.e).append(this.i.a, i, i2 - i);
    }

    @Override // defpackage.t0
    public boolean c() {
        p();
        int i = this.b;
        while (true) {
            int iC = C(i);
            if (iC == -1) {
                this.b = iC;
                return false;
            }
            char c = this.i.a[iC];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = iC;
                return t0.x(c);
            }
            i = iC + 1;
        }
    }

    @Override // defpackage.t0
    public final String e() {
        h('\"');
        int i = this.b;
        lv lvVar = this.i;
        int i2 = lvVar.b;
        char[] cArr = lvVar.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iC = C(i);
            if (iC != -1) {
                return k(lvVar, this.b, iC);
            }
            int i4 = this.b;
            int i5 = i4 - 1;
            t0.t(this, o40.y("Expected quotation mark '\"', but had '", (i4 == lvVar.b || i5 < 0) ? "EOF" : String.valueOf(lvVar.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return k(lvVar, this.b, i6);
            }
        }
        this.b = i3 + 1;
        return m88.R(cArr, i, Math.min(i3, lvVar.b));
    }

    @Override // defpackage.t0
    public byte f() {
        p();
        int i = this.b;
        while (true) {
            int iC = C(i);
            if (iC == -1) {
                this.b = iC;
                return (byte) 10;
            }
            int i2 = iC + 1;
            byte bE = dt2.e(this.i.a[iC]);
            if (bE != 3) {
                this.b = i2;
                return bE;
            }
            i = i2;
        }
    }

    @Override // defpackage.t0
    public void h(char c) {
        p();
        int i = this.b;
        while (true) {
            int iC = C(i);
            if (iC == -1) {
                this.b = iC;
                J(c);
                throw null;
            }
            int i2 = iC + 1;
            char c2 = this.i.a[iC];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                J(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.t0
    public final void p() {
        int i = this.i.b - this.b;
        if (i > this.h) {
            return;
        }
        K(i);
    }

    @Override // defpackage.t0
    public final CharSequence v() {
        return this.i;
    }

    @Override // defpackage.t0
    public final String y(String str, boolean z) {
        js3.p(str, "keyToMatch");
        return null;
    }
}
