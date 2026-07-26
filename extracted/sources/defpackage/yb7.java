package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yb7 extends zb7 implements Iterator {
    public xb7 a;
    public boolean b = true;
    public final /* synthetic */ ac7 c;

    public yb7(ac7 ac7Var) {
        this.c = ac7Var;
    }

    @Override // defpackage.zb7
    public final void a(xb7 xb7Var) {
        xb7 xb7Var2 = this.a;
        if (xb7Var == xb7Var2) {
            xb7 xb7Var3 = xb7Var2.d;
            this.a = xb7Var3;
            this.b = xb7Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        xb7 xb7Var = this.a;
        return (xb7Var == null || xb7Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            xb7 xb7Var = this.a;
            this.a = xb7Var != null ? xb7Var.c : null;
        }
        return this.a;
    }
}
