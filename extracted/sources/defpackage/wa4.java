package defpackage;

import android.animation.ObjectAnimator;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class wa4 {
    public static final mo0 i = new mo0(Float.class, "animationFraction", 19);
    public static final pk1 j = new pk1(1);
    public int a;
    public float b;
    public float c;
    public ObjectAnimator d;
    public l38 e;
    public LoadingIndicatorSpec f;
    public xa4 g;
    public ya4 h;

    public final void a(float f) {
        this.c = f;
        ya4 ya4Var = this.h;
        ya4Var.b = f;
        int i2 = this.a - 1;
        int[] iArr = this.f.d;
        int length = i2 % iArr.length;
        ya4Var.a = zu.a(at2.R(f - i2, 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
        xa4 xa4Var = this.g;
        if (xa4Var != null) {
            xa4Var.invalidateSelf();
        }
    }
}
