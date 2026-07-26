package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cw6 {
    public final xv6 a;
    public final ArrayList b;
    public final int c;
    public final ai0 d;
    public final w47 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public cw6(xv6 xv6Var, ArrayList arrayList, int i, ai0 ai0Var, w47 w47Var, int i2, int i3, int i4) {
        js3.p(w47Var, "request");
        this.a = xv6Var;
        this.b = arrayList;
        this.c = i;
        this.d = ai0Var;
        this.e = w47Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static cw6 a(cw6 cw6Var, int i, ai0 ai0Var, w47 w47Var, int i2) {
        if ((i2 & 1) != 0) {
            i = cw6Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            ai0Var = cw6Var.d;
        }
        ai0 ai0Var2 = ai0Var;
        if ((i2 & 4) != 0) {
            w47Var = cw6Var.e;
        }
        w47 w47Var2 = w47Var;
        int i4 = cw6Var.f;
        int i5 = cw6Var.g;
        int i6 = cw6Var.h;
        js3.p(w47Var2, "request");
        return new cw6(cw6Var.a, cw6Var.b, i3, ai0Var2, w47Var2, i4, i5, i6);
    }

    public final g77 b(w47 w47Var) {
        js3.p(w47Var, "request");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        ai0 ai0Var = this.d;
        if (ai0Var != null) {
            if (!((p42) ai0Var.d).f().f(w47Var.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        cw6 cw6VarA = a(this, i2, null, w47Var, 58);
        hr3 hr3Var = (hr3) arrayList.get(i);
        g77 g77VarA = hr3Var.a(cw6VarA);
        if (g77VarA == null) {
            throw new NullPointerException("interceptor " + hr3Var + " returned null");
        }
        if (ai0Var == null || i2 >= arrayList.size() || cw6VarA.i == 1) {
            return g77VarA;
        }
        throw new IllegalStateException(("network interceptor " + hr3Var + " must call proceed() exactly once").toString());
    }
}
