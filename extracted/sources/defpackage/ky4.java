package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ky4 implements Interpolator {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy1 b;

    public /* synthetic */ ky4(yy1 yy1Var, int i) {
        this.a = i;
        this.b = yy1Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dA;
        switch (this.a) {
            case 0:
                dA = this.b.a(f);
                break;
            case 1:
                dA = this.b.a(f);
                break;
            default:
                dA = this.b.a(f);
                break;
        }
        return (float) dA;
    }
}
