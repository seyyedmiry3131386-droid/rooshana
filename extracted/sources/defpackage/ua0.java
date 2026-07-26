package defpackage;

import androidx.paging.DiffingChangePayload;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes.dex */
public final class ua0 {
    public final xp0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public ua0(xp0 xp0Var) {
        this.a = xp0Var;
    }

    public final void a() {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return;
        }
        xp0 xp0Var = this.a;
        if (i2 == 1) {
            int i3 = this.c;
            int i4 = this.d;
            r79 r79Var = (r79) xp0Var.i;
            if (i3 >= xp0Var.d && xp0Var.f != 2) {
                int iMin = Math.min(i4, xp0Var.c);
                if (iMin > 0) {
                    xp0Var.f = 3;
                    r79Var.t(xp0Var.b + i3, iMin, DiffingChangePayload.b);
                    xp0Var.c -= iMin;
                }
                int i5 = i4 - iMin;
                if (i5 > 0) {
                    r79Var.u(i3 + iMin + xp0Var.b, i5);
                }
            } else if (i3 <= 0 && xp0Var.e != 2) {
                int iMin2 = Math.min(i4, xp0Var.b);
                if (iMin2 > 0) {
                    xp0Var.e = 3;
                    r79Var.t((0 - iMin2) + xp0Var.b, iMin2, DiffingChangePayload.b);
                    xp0Var.b -= iMin2;
                }
                int i6 = i4 - iMin2;
                if (i6 > 0) {
                    r79Var.u(xp0Var.b, i6);
                }
            } else {
                r79Var.u(i3 + xp0Var.b, i4);
            }
            xp0Var.d += i4;
        } else if (i2 == 2) {
            int i7 = this.c;
            int i8 = this.d;
            iz5 iz5Var = (iz5) xp0Var.h;
            r79 r79Var2 = (r79) xp0Var.i;
            if (i7 + i8 >= xp0Var.d && xp0Var.f != 3) {
                int iMin3 = Math.min(iz5Var.d - xp0Var.c, i8);
                i = iMin3 >= 0 ? iMin3 : 0;
                int i9 = i8 - i;
                if (i > 0) {
                    xp0Var.f = 2;
                    r79Var2.t(xp0Var.b + i7, i, DiffingChangePayload.a);
                    xp0Var.c += i;
                }
                if (i9 > 0) {
                    r79Var2.v(i7 + i + xp0Var.b, i9);
                }
            } else if (i7 <= 0 && xp0Var.e != 3) {
                int iMin4 = Math.min(iz5Var.c - xp0Var.b, i8);
                i = iMin4 >= 0 ? iMin4 : 0;
                int i10 = i8 - i;
                if (i10 > 0) {
                    r79Var2.v(xp0Var.b, i10);
                }
                if (i > 0) {
                    xp0Var.e = 2;
                    r79Var2.t(xp0Var.b, i, DiffingChangePayload.a);
                    xp0Var.b += i;
                }
            } else {
                r79Var2.v(i7 + xp0Var.b, i8);
            }
            xp0Var.d -= i8;
        } else if (i2 == 3) {
            ((r79) xp0Var.i).t(this.c + xp0Var.b, this.d, this.e);
        }
        this.e = null;
        this.b = 0;
    }

    public final void b(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    public final void c(int i, int i2) {
        a();
        xp0 xp0Var = this.a;
        r79 r79Var = (r79) xp0Var.i;
        int i3 = xp0Var.b;
        ((a) r79Var.b).g(i + i3, i2 + i3);
    }
}
