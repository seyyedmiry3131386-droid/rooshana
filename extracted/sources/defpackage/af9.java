package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class af9 {
    public final lf9 a;
    public no3[] b;

    public af9() {
        this(new lf9((lf9) null));
    }

    public final void a() {
        no3[] no3VarArr = this.b;
        if (no3VarArr != null) {
            no3 no3VarG = no3VarArr[0];
            no3 no3VarG2 = no3VarArr[1];
            lf9 lf9Var = this.a;
            if (no3VarG2 == null) {
                no3VarG2 = lf9Var.a.g(2);
            }
            if (no3VarG == null) {
                no3VarG = lf9Var.a.g(1);
            }
            g(no3.a(no3VarG, no3VarG2));
            no3 no3Var = this.b[ia7.f(16)];
            if (no3Var != null) {
                f(no3Var);
            }
            no3 no3Var2 = this.b[ia7.f(32)];
            if (no3Var2 != null) {
                d(no3Var2);
            }
            no3 no3Var3 = this.b[ia7.f(64)];
            if (no3Var3 != null) {
                h(no3Var3);
            }
        }
    }

    public abstract lf9 b();

    public void c(int i, no3 no3Var) {
        if (this.b == null) {
            this.b = new no3[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ia7.f(i2)] = no3Var;
            }
        }
    }

    public abstract void e(no3 no3Var);

    public abstract void g(no3 no3Var);

    public af9(lf9 lf9Var) {
        this.a = lf9Var;
    }

    public void d(no3 no3Var) {
    }

    public void f(no3 no3Var) {
    }

    public void h(no3 no3Var) {
    }
}
