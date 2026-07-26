package defpackage;

import android.view.View;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements ig0, ms5 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public /* synthetic */ jg0() {
    }

    public void a(int i, int i2) {
        long jB = uy6.b(i, i2);
        ((aj0) this.f).w("", i, i2);
        long jY = bt2.Y(uy6.b(this.b, this.c), jB);
        k(zi8.g(jY));
        j(zi8.f(jY));
        int i3 = this.d;
        if (i3 != -1) {
            long jY2 = bt2.Y(uy6.b(i3, this.e), jB);
            if (zi8.d(jY2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = zi8.g(jY2);
                this.e = zi8.f(jY2);
            }
        }
    }

    public char b(int i) {
        aj0 aj0Var = (aj0) this.f;
        vl1 vl1Var = (vl1) aj0Var.e;
        if (vl1Var == null) {
            return ((String) aj0Var.d).charAt(i);
        }
        if (i < aj0Var.b) {
            return ((String) aj0Var.d).charAt(i);
        }
        int iC = vl1Var.b - vl1Var.c();
        int i2 = aj0Var.b;
        if (i >= iC + i2) {
            return ((String) aj0Var.d).charAt(i - ((iC - aj0Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = vl1Var.c;
        return i3 < i4 ? ((char[]) vl1Var.e)[i3] : ((char[]) vl1Var.e)[(i3 - i4) + vl1Var.d];
    }

    public zi8 c() {
        int i = this.d;
        if (i != -1) {
            return new zi8(uy6.b(i, this.e));
        }
        return null;
    }

    public long d() {
        int i = this.d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.e & (i2 + 1);
        this.d = i - 1;
        return j;
    }

    @Override // defpackage.ig0
    public int e() {
        return -1;
    }

    public void f(String str, int i, int i2) {
        aj0 aj0Var = (aj0) this.f;
        if (i < 0 || i > aj0Var.i()) {
            StringBuilder sbR = rm7.r(i, "start (", ") offset is outside of text region ");
            sbR.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > aj0Var.i()) {
            StringBuilder sbR2 = rm7.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(dw1.j(i, i2, "Do not set reversed range: ", " > "));
        }
        aj0Var.w(str, i, i2);
        k(str.length() + i);
        j(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public void g(int i, int i2) {
        aj0 aj0Var = (aj0) this.f;
        if (i < 0 || i > aj0Var.i()) {
            StringBuilder sbR = rm7.r(i, "start (", ") offset is outside of text region ");
            sbR.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > aj0Var.i()) {
            StringBuilder sbR2 = rm7.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(dw1.j(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.d = i;
        this.e = i2;
    }

    public void h(int i, int i2) {
        aj0 aj0Var = (aj0) this.f;
        if (i < 0 || i > aj0Var.i()) {
            StringBuilder sbR = rm7.r(i, "start (", ") offset is outside of text region ");
            sbR.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > aj0Var.i()) {
            StringBuilder sbR2 = rm7.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(aj0Var.i());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(dw1.j(i, i2, "Do not set reversed range: ", " > "));
        }
        k(i);
        j(i2);
    }

    @Override // defpackage.ig0
    public int i() {
        return this.b;
    }

    public void j(int i) {
        if (!(i >= 0)) {
            sn3.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void k(int i) {
        if (!(i >= 0)) {
            sn3.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    @Override // defpackage.ig0
    public int l() {
        h26 h26Var = (h26) this.f;
        int i = this.c;
        if (i == 8) {
            return h26Var.x();
        }
        if (i == 16) {
            return h26Var.D();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iX = h26Var.x();
        this.e = iX;
        return (iX & 240) >> 4;
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        View view2 = (View) this.f;
        no3 no3VarG = lf9Var.a.g(519);
        int i = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + no3VarG.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + no3VarG.a, this.d + no3VarG.b, this.e + no3VarG.c, view2.getPaddingBottom());
        return lf9Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((aj0) this.f).toString();
            default:
                return super.toString();
        }
    }

    public jg0(ll llVar, long j) {
        String str = llVar.b;
        aj0 aj0Var = new aj0(5, (byte) 0);
        aj0Var.d = str;
        aj0Var.b = -1;
        aj0Var.c = -1;
        this.f = aj0Var;
        this.b = zi8.g(j);
        this.c = zi8.f(j);
        this.d = -1;
        this.e = -1;
        int iG = zi8.g(j);
        int iF = zi8.f(j);
        if (iG < 0 || iG > str.length()) {
            StringBuilder sbR = rm7.r(iG, "start (", ") offset is outside of text region ");
            sbR.append(str.length());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbR2 = rm7.r(iF, "end (", ") offset is outside of text region ");
            sbR2.append(str.length());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (iG > iF) {
            throw new IllegalArgumentException(dw1.j(iG, iF, "Do not set reversed range: ", " > "));
        }
    }

    public jg0(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }

    public jg0(View view, int i, int i2, int i3, int i4) {
        this.b = i;
        this.f = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public jg0(s85 s85Var) {
        h26 h26Var = s85Var.c;
        this.f = h26Var;
        h26Var.J(12);
        this.c = h26Var.B() & 255;
        this.b = h26Var.B();
    }
}
