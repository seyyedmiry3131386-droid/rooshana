package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wb7 extends zb7 implements Iterator {
    public xb7 a;
    public xb7 b;
    public final /* synthetic */ int c;

    public wb7(xb7 xb7Var, xb7 xb7Var2, int i) {
        this.c = i;
        this.a = xb7Var2;
        this.b = xb7Var;
    }

    @Override // defpackage.zb7
    public final void a(xb7 xb7Var) {
        xb7 xb7Var2;
        xb7 xb7VarB = null;
        if (this.a == xb7Var && xb7Var == this.b) {
            this.b = null;
            this.a = null;
        }
        xb7 xb7Var3 = this.a;
        if (xb7Var3 == xb7Var) {
            switch (this.c) {
                case 0:
                    xb7Var2 = xb7Var3.d;
                    break;
                default:
                    xb7Var2 = xb7Var3.c;
                    break;
            }
            this.a = xb7Var2;
        }
        xb7 xb7Var4 = this.b;
        if (xb7Var4 == xb7Var) {
            xb7 xb7Var5 = this.a;
            if (xb7Var4 != xb7Var5 && xb7Var5 != null) {
                xb7VarB = b(xb7Var4);
            }
            this.b = xb7VarB;
        }
    }

    public final xb7 b(xb7 xb7Var) {
        switch (this.c) {
            case 0:
                return xb7Var.c;
            default:
                return xb7Var.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        xb7 xb7Var = this.b;
        xb7 xb7Var2 = this.a;
        this.b = (xb7Var == xb7Var2 || xb7Var2 == null) ? null : b(xb7Var);
        return xb7Var;
    }
}
