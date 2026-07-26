package defpackage;

import android.os.Looper;
import androidx.lifecycle.Lifecycle$State;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bb5 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final ac7 b = new ac7();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q6 j;

    public bb5() {
        Object obj = k;
        this.f = obj;
        this.j = new q6(22, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        yu.h().c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(o40.y("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(x94 x94Var) {
        if (x94Var.b) {
            if (!x94Var.d()) {
                x94Var.a(false);
                return;
            }
            int i = x94Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            x94Var.c = i2;
            x94Var.a.a(this.e);
        }
    }

    public final void c(x94 x94Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (x94Var != null) {
                b(x94Var);
                x94Var = null;
            } else {
                ac7 ac7Var = this.b;
                ac7Var.getClass();
                yb7 yb7Var = new yb7(ac7Var);
                ac7Var.c.put(yb7Var, Boolean.FALSE);
                while (yb7Var.hasNext()) {
                    b((x94) ((Map.Entry) yb7Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(g64 g64Var, ir5 ir5Var) {
        Object obj;
        a("observe");
        if (g64Var.D().d == Lifecycle$State.a) {
            return;
        }
        w94 w94Var = new w94(this, g64Var, ir5Var);
        ac7 ac7Var = this.b;
        xb7 xb7VarA = ac7Var.a(ir5Var);
        if (xb7VarA != null) {
            obj = xb7VarA.b;
        } else {
            xb7 xb7Var = new xb7(ir5Var, w94Var);
            ac7Var.d++;
            xb7 xb7Var2 = ac7Var.b;
            if (xb7Var2 == null) {
                ac7Var.a = xb7Var;
                ac7Var.b = xb7Var;
            } else {
                xb7Var2.c = xb7Var;
                xb7Var.d = xb7Var2;
                ac7Var.b = xb7Var;
            }
            obj = null;
        }
        x94 x94Var = (x94) obj;
        if (x94Var != null && !x94Var.c(g64Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (x94Var != null) {
            return;
        }
        g64Var.D().a(w94Var);
    }

    public void g(ir5 ir5Var) {
        a("removeObserver");
        x94 x94Var = (x94) this.b.c(ir5Var);
        if (x94Var == null) {
            return;
        }
        x94Var.b();
        x94Var.a(false);
    }

    public void h(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }
}
