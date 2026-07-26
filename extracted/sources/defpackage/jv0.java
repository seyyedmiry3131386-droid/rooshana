package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class jv0 {
    public final int a;
    public final zm6 b;
    public no3 c;
    public no3 d;
    public an6 e;
    public final ColorDrawable f;
    public boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public jv0(int i) {
        zm6 zm6Var = new zm6();
        zm6Var.a = -1;
        no3 no3Var = no3.e;
        zm6Var.b = no3Var;
        zm6Var.c = false;
        zm6Var.d = null;
        zm6Var.e = 0.0f;
        zm6Var.f = 0.0f;
        zm6Var.g = 1.0f;
        this.b = zm6Var;
        this.c = no3Var;
        this.d = no3Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw new IllegalArgumentException(rm7.n(i, "Unexpected side: "));
        }
        this.a = i;
        this.f = new ColorDrawable();
        this.h = 0;
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        zm6 zm6Var = this.b;
        if (zm6Var.g != f2) {
            zm6Var.g = f2;
            bn6 bn6Var = zm6Var.h;
            if (bn6Var != null) {
                ((View) bn6Var.c).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        zm6 zm6Var = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * (-1);
            if (zm6Var.e != f3) {
                zm6Var.e = f3;
                bn6 bn6Var = zm6Var.h;
                if (bn6Var != null) {
                    ((View) bn6Var.c).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * zm6Var.a;
            if (zm6Var.f != f4) {
                zm6Var.f = f4;
                bn6 bn6Var2 = zm6Var.h;
                if (bn6Var2 != null) {
                    ((View) bn6Var2.c).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * (-1);
            if (zm6Var.e != f5) {
                zm6Var.e = f5;
                bn6 bn6Var3 = zm6Var.h;
                if (bn6Var3 != null) {
                    ((View) bn6Var3.c).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * zm6Var.a;
        if (zm6Var.f != f6) {
            zm6Var.f = f6;
            bn6 bn6Var4 = zm6Var.h;
            if (bn6Var4 != null) {
                ((View) bn6Var4.c).setTranslationY(f6);
            }
        }
    }
}
