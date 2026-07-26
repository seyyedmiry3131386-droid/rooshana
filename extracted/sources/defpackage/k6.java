package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k6 {
    public Object a;
    public boolean b = true;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, z49] */
    public static void i(k6 k6Var) {
        boolean z = !k6Var.b;
        k6Var.b = z;
        ?? r1 = k6Var.a;
        if (r1 != 0) {
            r1.a(z);
        }
        k6Var.l(k6Var.b);
    }

    public abstract void a();

    public abstract View b();

    public abstract ot4 e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void j();

    public abstract boolean k();

    public abstract void l(boolean z);

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z);

    public abstract void t(boolean z);

    public abstract void v(boolean z);
}
