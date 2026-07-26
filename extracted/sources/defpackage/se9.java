package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class se9 extends te9 {
    public final WindowInsetsAnimation e;

    public se9(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static no3 f(WindowInsetsAnimation.Bounds bounds) {
        return no3.d(bounds.getUpperBound());
    }

    public static no3 g(WindowInsetsAnimation.Bounds bounds) {
        return no3.d(bounds.getLowerBound());
    }

    public static void h(View view, mu0 mu0Var) {
        view.setWindowInsetsAnimationCallback(mu0Var != null ? new re9(mu0Var) : null);
    }

    @Override // defpackage.te9
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.te9
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.te9
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.te9
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.te9
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
