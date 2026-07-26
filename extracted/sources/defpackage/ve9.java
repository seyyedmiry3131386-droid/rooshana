package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ve9 extends af9 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public no3 d;

    public ve9() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.af9
    public lf9 b() {
        a();
        lf9 lf9VarH = lf9.h(null, this.c);
        no3[] no3VarArr = this.b;
        if9 if9Var = lf9VarH.a;
        if9Var.r(no3VarArr);
        if9Var.u(this.d);
        return lf9VarH;
    }

    @Override // defpackage.af9
    public void e(no3 no3Var) {
        this.d = no3Var;
    }

    @Override // defpackage.af9
    public void g(no3 no3Var) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(no3Var.a, no3Var.b, no3Var.c, no3Var.d);
        }
    }

    public ve9(lf9 lf9Var) {
        super(lf9Var);
        this.c = lf9Var.g();
    }
}
