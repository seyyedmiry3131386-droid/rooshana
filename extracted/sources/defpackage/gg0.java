package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final h26 f;
    public final h26 g;
    public int h;
    public int i;

    public gg0(h26 h26Var, h26 h26Var2, boolean z) throws ParserException {
        this.g = h26Var;
        this.f = h26Var2;
        this.e = z;
        h26Var2.J(12);
        this.a = h26Var2.B();
        h26Var.J(12);
        this.i = h26Var.B();
        hs9.w("first_chunk must be 1", h26Var.j() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        h26 h26Var = this.f;
        this.d = z ? h26Var.C() : h26Var.z();
        if (this.b == this.h) {
            h26 h26Var2 = this.g;
            this.c = h26Var2.B();
            h26Var2.K(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? h26Var2.B() - 1 : -1;
        }
        return true;
    }
}
