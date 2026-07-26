package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class co5 {
    public co5 a = null;
    public co5 b = null;
    public co5 c = null;
    public co5 d = null;
    public co5 e = null;

    public abstract void a(vp7 vp7Var);

    public final void b(co5 co5Var) {
        co5Var.f();
        co5Var.d(this);
        co5 co5Var2 = this.c;
        if (co5Var2 == null) {
            this.b = co5Var;
            this.c = co5Var;
        } else {
            co5Var2.e = co5Var;
            co5Var.d = co5Var2;
            this.c = co5Var;
        }
    }

    public co5 c() {
        return this.a;
    }

    public void d(co5 co5Var) {
        this.a = co5Var;
    }

    public String e() {
        return "";
    }

    public final void f() {
        co5 co5Var = this.d;
        if (co5Var != null) {
            co5Var.e = this.e;
        } else {
            co5 co5Var2 = this.a;
            if (co5Var2 != null) {
                co5Var2.b = this.e;
            }
        }
        co5 co5Var3 = this.e;
        if (co5Var3 != null) {
            co5Var3.d = co5Var;
        } else {
            co5 co5Var4 = this.a;
            if (co5Var4 != null) {
                co5Var4.c = co5Var;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
