package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends is3 {
    public final /* synthetic */ int u;

    public /* synthetic */ pk1(int i) {
        this.u = i;
    }

    @Override // defpackage.is3
    public final void L(Object obj, float f) {
        switch (this.u) {
            case 0:
                qk1 qk1Var = (qk1) obj;
                qk1Var.q.b = f / 10000.0f;
                qk1Var.invalidateSelf();
                int i = (int) f;
                if (qk1Var.b.b(true)) {
                    Context context = qk1Var.a;
                    if (qk1Var.u == null) {
                        int i2 = vp6.motionEasingStandardInterpolator;
                        LinearInterpolator linearInterpolator = yk.a;
                        qk1Var.w = ub1.H(context, i2, linearInterpolator);
                        qk1Var.x = ub1.H(context, vp6.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        qk1Var.u = valueAnimator;
                        valueAnimator.setDuration(500L);
                        qk1Var.u.setFloatValues(0.0f, 1.0f);
                        qk1Var.u.setInterpolator(null);
                        qk1Var.u.addUpdateListener(new qj(4, qk1Var));
                    }
                    float f2 = i;
                    float f3 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
                    if (f3 != qk1Var.r) {
                        if (qk1Var.u.isRunning()) {
                            qk1Var.u.cancel();
                        }
                        qk1Var.r = f3;
                        if (f3 != 1.0f) {
                            qk1Var.v = qk1Var.x;
                            qk1Var.u.reverse();
                        } else {
                            qk1Var.v = qk1Var.w;
                            qk1Var.u.start();
                        }
                    } else if (!qk1Var.u.isRunning()) {
                        qk1Var.q.e = f3;
                        qk1Var.invalidateSelf();
                    }
                    break;
                }
                break;
            case 1:
                ((wa4) obj).a(f);
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }

    @Override // defpackage.is3
    public final float v(Object obj) {
        switch (this.u) {
            case 0:
                return ((qk1) obj).q.b * 10000.0f;
            case 1:
                return ((wa4) obj).c;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }
}
