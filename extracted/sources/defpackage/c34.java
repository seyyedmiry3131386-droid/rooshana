package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class c34 {
    public final Object a;
    public final d34 b;
    public int d;
    public c34 e;
    public boolean f;
    public int c = -1;
    public final wb5 g = g.h(null);

    public c34(Object obj, d34 d34Var) {
        this.a = obj;
        this.b = d34Var;
    }

    public final c34 a() {
        if (this.f) {
            un3.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            c34 c34Var = (c34) ((s08) this.g).getValue();
            if (c34Var != null) {
                c34Var.a();
            } else {
                c34Var = null;
            }
            this.e = c34Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            un3.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            c34 c34Var = this.e;
            if (c34Var != null) {
                c34Var.b();
            }
            this.e = null;
        }
    }
}
