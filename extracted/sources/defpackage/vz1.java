package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class vz1 {
    public int a;
    public final Object b;
    public final Object c;

    public vz1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public static vz1 b(k kVar, int i) {
        if (i == 0) {
            return new e(kVar);
        }
        if (i == 1) {
            return new f(kVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(mb7 mb7Var);

    public abstract void c(mb7 mb7Var);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(mb7 mb7Var);

    public abstract void s(mb7 mb7Var);

    public abstract void t(mb7 mb7Var);

    public abstract void u(mb7 mb7Var);

    public abstract xe1 v(mb7 mb7Var);

    public vz1(k kVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = kVar;
    }

    public vz1(yz1 yz1Var) {
        this.a = 0;
        this.c = new se1();
        this.b = yz1Var;
    }
}
