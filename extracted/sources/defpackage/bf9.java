package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class bf9 extends if9 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public no3[] d;
    public no3 e;
    public lf9 f;
    public no3 g;
    public int h;

    public bf9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            t0.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean C(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private no3 w(int i2, boolean z) {
        no3 no3VarA = no3.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                no3VarA = no3.a(no3VarA, x(i3, z));
            }
        }
        return no3VarA;
    }

    private no3 y() {
        lf9 lf9Var = this.f;
        return lf9Var != null ? lf9Var.a.j() : no3.e;
    }

    private no3 z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            B();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    t0.n("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return no3.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                t0.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    public boolean A(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !x(i2, false).equals(no3.e);
    }

    @Override // defpackage.if9
    public void d(View view) {
        no3 no3VarZ = z(view);
        if (no3VarZ == null) {
            no3VarZ = no3.e;
        }
        s(no3VarZ);
    }

    @Override // defpackage.if9
    public void e(lf9 lf9Var) {
        lf9Var.a.t(this.f);
        no3 no3Var = this.g;
        if9 if9Var = lf9Var.a;
        if9Var.s(no3Var);
        if9Var.v(this.h);
    }

    @Override // defpackage.if9
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        bf9 bf9Var = (bf9) obj;
        return Objects.equals(this.g, bf9Var.g) && C(this.h, bf9Var.h);
    }

    @Override // defpackage.if9
    public no3 g(int i2) {
        return w(i2, false);
    }

    @Override // defpackage.if9
    public no3 h(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.if9
    public final no3 l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = no3.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.if9
    public lf9 n(int i2, int i3, int i4, int i5) {
        lf9 lf9VarH = lf9.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        af9 ze9Var = i6 >= 34 ? new ze9(lf9VarH) : i6 >= 31 ? new ye9(lf9VarH) : i6 >= 30 ? new xe9(lf9VarH) : i6 >= 29 ? new we9(lf9VarH) : new ve9(lf9VarH);
        ze9Var.g(lf9.e(l(), i2, i3, i4, i5));
        ze9Var.e(lf9.e(j(), i2, i3, i4, i5));
        return ze9Var.b();
    }

    @Override // defpackage.if9
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.if9
    @SuppressLint({"WrongConstant"})
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !A(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.if9
    public void r(no3[] no3VarArr) {
        this.d = no3VarArr;
    }

    @Override // defpackage.if9
    public void s(no3 no3Var) {
        this.g = no3Var;
    }

    @Override // defpackage.if9
    public void t(lf9 lf9Var) {
        this.f = lf9Var;
    }

    @Override // defpackage.if9
    public void v(int i2) {
        this.h = i2;
    }

    public no3 x(int i2, boolean z) {
        no3 no3VarJ;
        int i3;
        no3 no3Var = no3.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    no3[] no3VarArr = this.d;
                    no3VarJ = no3VarArr != null ? no3VarArr[ia7.f(8)] : null;
                    if (no3VarJ != null) {
                        return no3VarJ;
                    }
                    no3 no3VarL = l();
                    no3 no3VarY = y();
                    int i4 = no3VarL.d;
                    if (i4 > no3VarY.d) {
                        return no3.c(0, 0, 0, i4);
                    }
                    no3 no3Var2 = this.g;
                    if (no3Var2 != null && !no3Var2.equals(no3Var) && (i3 = this.g.d) > no3VarY.d) {
                        return no3.c(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return k();
                    }
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 == 128) {
                        lf9 lf9Var = this.f;
                        vp1 vp1VarF = lf9Var != null ? lf9Var.a.f() : f();
                        if (vp1VarF != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return no3.c(i5 >= 28 ? ul.r(vp1VarF.a) : 0, i5 >= 28 ? ul.t(vp1VarF.a) : 0, i5 >= 28 ? ul.s(vp1VarF.a) : 0, i5 >= 28 ? ul.q(vp1VarF.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    no3 no3VarY2 = y();
                    no3 no3VarJ2 = j();
                    return no3.c(Math.max(no3VarY2.a, no3VarJ2.a), 0, Math.max(no3VarY2.c, no3VarJ2.c), Math.max(no3VarY2.d, no3VarJ2.d));
                }
                if ((this.h & 2) == 0) {
                    no3 no3VarL2 = l();
                    lf9 lf9Var2 = this.f;
                    no3VarJ = lf9Var2 != null ? lf9Var2.a.j() : null;
                    int iMin = no3VarL2.d;
                    if (no3VarJ != null) {
                        iMin = Math.min(iMin, no3VarJ.d);
                    }
                    return no3.c(no3VarL2.a, 0, no3VarL2.c, iMin);
                }
            }
        } else {
            if (z) {
                return no3.c(0, Math.max(y().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return no3.c(0, l().b, 0, 0);
            }
        }
        return no3Var;
    }

    public bf9(lf9 lf9Var, bf9 bf9Var) {
        this(lf9Var, new WindowInsets(bf9Var.c));
    }
}
