package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ea9 extends b47 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    public void A(View view, Matrix matrix) {
        if (d) {
            try {
                te.L(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void B(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                te.P(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void C(View view, Matrix matrix) {
        if (e) {
            try {
                te.Z(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void D(View view, Matrix matrix) {
        if (f) {
            try {
                te.a0(view, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // defpackage.b47
    public void t(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.t(i, view);
        } else if (h) {
            try {
                da9.b(i, view);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
