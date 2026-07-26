package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class m90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ m90(r90 r90Var, int i) {
        this.a = i;
        this.b = r90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r90 r90Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = r90Var.i;
                if (baseTransientBottomBar$SnackbarBaseLayout != null) {
                    int iHeight = ib7.k(r90Var.h).height();
                    int[] iArr = new int[2];
                    baseTransientBottomBar$SnackbarBaseLayout.getLocationInWindow(iArr);
                    int height = (iHeight - (baseTransientBottomBar$SnackbarBaseLayout.getHeight() + iArr[1])) + ((int) baseTransientBottomBar$SnackbarBaseLayout.getTranslationY());
                    int i4 = r90Var.s;
                    if (height < i4) {
                        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar$SnackbarBaseLayout.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            t0.m(r90.D, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i5 = r90Var.s;
                            r90Var.t = i5;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i5 - height) + marginLayoutParams.bottomMargin;
                            baseTransientBottomBar$SnackbarBaseLayout.requestLayout();
                        }
                    } else {
                        r90Var.t = i4;
                    }
                }
                break;
            case 1:
                r90Var.d(3);
                break;
            default:
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout2 = r90Var.i;
                if (baseTransientBottomBar$SnackbarBaseLayout2 != null) {
                    int i6 = 0;
                    if (baseTransientBottomBar$SnackbarBaseLayout2.getParent() != null) {
                        baseTransientBottomBar$SnackbarBaseLayout2.setVisibility(0);
                    }
                    if (baseTransientBottomBar$SnackbarBaseLayout2.getAnimationMode() != 1) {
                        int height2 = baseTransientBottomBar$SnackbarBaseLayout2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar$SnackbarBaseLayout2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        baseTransientBottomBar$SnackbarBaseLayout2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(r90Var.e);
                        valueAnimator.setDuration(r90Var.c);
                        valueAnimator.addListener(new k90(r90Var, i6));
                        valueAnimator.addUpdateListener(new j90(r90Var, i2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(r90Var.d);
                        valueAnimatorOfFloat.addUpdateListener(new j90(r90Var, i6));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(r90Var.f);
                        valueAnimatorOfFloat2.addUpdateListener(new j90(r90Var, i3));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(r90Var.a);
                        animatorSet.addListener(new k90(r90Var, i3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
