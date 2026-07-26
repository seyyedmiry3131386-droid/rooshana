package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lf9 {
    public static final lf9 b;
    public final if9 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = hf9.s;
        } else if (i >= 30) {
            b = ff9.r;
        } else {
            b = if9.b;
        }
    }

    public lf9(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new hf9(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new gf9(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ff9(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new ef9(this, windowInsets);
        } else if (i >= 28) {
            this.a = new df9(this, windowInsets);
        } else {
            this.a = new cf9(this, windowInsets);
        }
    }

    public static no3 e(no3 no3Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, no3Var.a - i);
        int iMax2 = Math.max(0, no3Var.b - i2);
        int iMax3 = Math.max(0, no3Var.c - i3);
        int iMax4 = Math.max(0, no3Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? no3Var : no3.c(iMax, iMax2, iMax3, iMax4);
    }

    public static lf9 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        lf9 lf9Var = new lf9(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = q69.a;
            lf9 lf9VarA = i69.a(view);
            if9 if9Var = lf9Var.a;
            if9Var.t(lf9VarA);
            if9Var.d(view.getRootView());
            if9Var.v(view.getWindowSystemUiVisibility());
        }
        return lf9Var;
    }

    public final int a() {
        return this.a.l().d;
    }

    public final int b() {
        return this.a.l().a;
    }

    public final int c() {
        return this.a.l().c;
    }

    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lf9) {
            return Objects.equals(this.a, ((lf9) obj).a);
        }
        return false;
    }

    public final lf9 f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        af9 ze9Var = i5 >= 34 ? new ze9(this) : i5 >= 31 ? new ye9(this) : i5 >= 30 ? new xe9(this) : i5 >= 29 ? new we9(this) : new ve9(this);
        ze9Var.g(no3.c(i, i2, i3, i4));
        return ze9Var.b();
    }

    public final WindowInsets g() {
        if9 if9Var = this.a;
        if (if9Var instanceof bf9) {
            return ((bf9) if9Var).c;
        }
        return null;
    }

    public final int hashCode() {
        if9 if9Var = this.a;
        if (if9Var == null) {
            return 0;
        }
        return if9Var.hashCode();
    }

    public lf9(lf9 lf9Var) {
        if (lf9Var != null) {
            if9 if9Var = lf9Var.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (if9Var instanceof hf9)) {
                this.a = new hf9(this, (hf9) if9Var);
            } else if (i >= 31 && (if9Var instanceof gf9)) {
                this.a = new gf9(this, (gf9) if9Var);
            } else if (i >= 30 && (if9Var instanceof ff9)) {
                this.a = new ff9(this, (ff9) if9Var);
            } else if (i >= 29 && (if9Var instanceof ef9)) {
                this.a = new ef9(this, (ef9) if9Var);
            } else if (i >= 28 && (if9Var instanceof df9)) {
                this.a = new df9(this, (df9) if9Var);
            } else if (if9Var instanceof cf9) {
                this.a = new cf9(this, (cf9) if9Var);
            } else if (if9Var instanceof bf9) {
                this.a = new bf9(this, (bf9) if9Var);
            } else {
                this.a = new if9(this);
            }
            if9Var.e(this);
            return;
        }
        this.a = new if9(this);
    }
}
