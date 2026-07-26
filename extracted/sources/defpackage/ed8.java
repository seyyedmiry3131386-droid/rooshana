package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ed8 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ ed8(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.a) {
            case 0:
                this.b.setAnimationProgress(f);
                break;
            case 1:
                this.b.setAnimationProgress(1.0f - f);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.b;
                int iAbs = !swipeRefreshLayout.J ? swipeRefreshLayout.z - Math.abs(swipeRefreshLayout.y) : swipeRefreshLayout.z;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.w + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.u.getTop());
                wr0 wr0Var = swipeRefreshLayout.B;
                float f2 = 1.0f - f;
                vr0 vr0Var = wr0Var.a;
                if (f2 != vr0Var.p) {
                    vr0Var.p = f2;
                }
                wr0Var.invalidateSelf();
                break;
            case 3:
                this.b.k(f);
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.b;
                float f3 = swipeRefreshLayout2.x;
                swipeRefreshLayout2.setAnimationProgress(((-f3) * f) + f3);
                swipeRefreshLayout2.k(f);
                break;
        }
    }
}
