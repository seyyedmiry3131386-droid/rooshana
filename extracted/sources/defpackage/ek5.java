package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ek5 {
    public ik5 a;
    public List b;
    public List c;
    public ok5 d;
    public boolean e;
    public boolean f;
    public ai0 g;

    public ek5(ik5 ik5Var, boolean z, int i) {
        js3.p(ik5Var, "initialInfo");
        this.a = ik5Var;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = mk5.a;
        this.e = z;
        this.f = false;
    }

    public final boolean a() {
        ai0 ai0Var = this.g;
        if (ai0Var == null || ai0Var.a) {
            return this.e;
        }
        return false;
    }

    public final boolean b() {
        ai0 ai0Var = this.g;
        if (ai0Var == null || ai0Var.a) {
            return this.f;
        }
        return false;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(ck5 ck5Var);

    public abstract void f(ck5 ck5Var);

    public final void h() {
        ai0 ai0Var = this.g;
        if (ai0Var == null || !((LinkedHashSet) ai0Var.d).remove(this)) {
            return;
        }
        kk5 kk5Var = (kk5) ai0Var.c;
        kk5Var.getClass();
        if (equals(kk5Var.f)) {
            int i = kk5Var.g;
            mk5 mk5Var = mk5.a;
            if (i == -1) {
                this.d = mk5Var;
                c();
            } else if (i == 1) {
                this.d = mk5Var;
                g();
            }
            kk5Var.f = null;
            kk5Var.g = 0;
            kk5Var.h = null;
        }
        kk5Var.d.remove(this);
        kk5Var.e.remove(this);
        this.g = null;
        kk5Var.b();
    }

    public final void i(boolean z) {
        kk5 kk5Var;
        if (this.e == z) {
            return;
        }
        this.e = z;
        ai0 ai0Var = this.g;
        if (ai0Var == null || (kk5Var = (kk5) ai0Var.c) == null) {
            return;
        }
        kk5Var.b();
    }

    public void g() {
    }
}
