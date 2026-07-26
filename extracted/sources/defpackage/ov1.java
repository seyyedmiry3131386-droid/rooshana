package defpackage;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ov1 {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int a = sj8.b().c;
    public boolean b = true;
    public final float[] c = new float[8];
    public int i = sj8.b().c;
    public int j = sj8.b().O.c;

    public ov1() {
        b();
    }

    public final GradientDrawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(this.h, this.i);
        gradientDrawable.setCornerRadii(this.c);
        gradientDrawable.setColor(this.b ? this.a : sj8.b().N);
        return gradientDrawable;
    }

    public final void b() {
        float f = this.d;
        float[] fArr = this.c;
        fArr[1] = f;
        fArr[0] = f;
        float f2 = this.e;
        fArr[3] = f2;
        fArr[2] = f2;
        float f3 = this.g;
        fArr[5] = f3;
        fArr[4] = f3;
        float f4 = this.f;
        fArr[7] = f4;
        fArr[6] = f4;
    }

    public final void c(int i) {
        this.d = i;
        this.e = i;
        this.f = i;
        this.g = i;
        b();
    }
}
