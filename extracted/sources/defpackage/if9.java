package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class if9 {
    public static final lf9 b;
    public final lf9 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new ze9() : i >= 31 ? new ye9() : i >= 30 ? new xe9() : i >= 29 ? new we9() : new ve9()).b().a.a().a.b().a.c();
    }

    public if9(lf9 lf9Var) {
        this.a = lf9Var;
    }

    public lf9 a() {
        return this.a;
    }

    public lf9 b() {
        return this.a;
    }

    public lf9 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if9)) {
            return false;
        }
        if9 if9Var = (if9) obj;
        return p() == if9Var.p() && o() == if9Var.o() && Objects.equals(l(), if9Var.l()) && Objects.equals(j(), if9Var.j()) && Objects.equals(f(), if9Var.f());
    }

    public vp1 f() {
        return null;
    }

    public no3 g(int i) {
        return no3.e;
    }

    public no3 h(int i) {
        if ((i & 8) == 0) {
            return no3.e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public no3 i() {
        return l();
    }

    public no3 j() {
        return no3.e;
    }

    public no3 k() {
        return l();
    }

    public no3 l() {
        return no3.e;
    }

    public no3 m() {
        return l();
    }

    public lf9 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(lf9 lf9Var) {
    }

    public void r(no3[] no3VarArr) {
    }

    public void s(no3 no3Var) {
    }

    public void t(lf9 lf9Var) {
    }

    public void u(no3 no3Var) {
    }

    public void v(int i) {
    }
}
