package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class t46 {
    public float i;
    public float a = -1.0f;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public final v46 j = new v46(0, 0);

    public final void a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        int i3 = layoutParams.width;
        v46 v46Var = this.j;
        ((ViewGroup.MarginLayoutParams) v46Var).width = i3;
        int i4 = layoutParams.height;
        ((ViewGroup.MarginLayoutParams) v46Var).height = i4;
        boolean z = false;
        boolean z2 = (v46Var.b || i3 == 0) && this.a < 0.0f;
        if ((v46Var.a || i4 == 0) && this.b < 0.0f) {
            z = true;
        }
        float f = this.a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(i * f);
        }
        float f2 = this.b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(i2 * f2);
        }
        float f3 = this.i;
        if (f3 >= 0.0f) {
            if (z2) {
                layoutParams.width = Math.round(layoutParams.height * f3);
                v46Var.b = true;
            }
            if (z) {
                layoutParams.height = Math.round(layoutParams.width / this.i);
                v46Var.a = true;
            }
        }
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
