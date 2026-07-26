package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                js3.p(animator, "animation");
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                if (viewPager2.n.b.m) {
                    viewPager2.a();
                }
                ((c17) this.c).invoke(null);
                break;
            case 4:
                ((z89) this.b).a((View) this.c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) this.b;
                drawerLayout.b((NavigationView) this.c, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                ((es0) this.b).setCircularRevealOverlayDrawable(null);
                break;
            case 2:
                ((wv) this.b).remove(animator);
                ((Transition) this.c).p.remove(animator);
                break;
            case 3:
                js3.p(animator, "animation");
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                if (viewPager2.n.b.m) {
                    viewPager2.a();
                }
                ((c17) this.c).invoke(null);
                break;
            case 4:
                ((z89) this.b).b((View) this.c);
                break;
            default:
                ue9 ue9Var = (ue9) this.b;
                ue9Var.a.e(1.0f);
                pe9.f((View) this.c, ue9Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((es0) this.b).setCircularRevealOverlayDrawable((Drawable) this.c);
                break;
            case 2:
                ((Transition) this.c).p.add(animator);
                break;
            case 3:
                js3.p(animator, "animation");
                p82 p82Var = ((ViewPager2) this.b).n;
                jg7 jg7Var = p82Var.b;
                if (jg7Var.f != 1) {
                    p82Var.g = 0;
                    p82Var.f = 0;
                    p82Var.h = SystemClock.uptimeMillis();
                    VelocityTracker velocityTracker = p82Var.d;
                    if (velocityTracker == null) {
                        p82Var.d = VelocityTracker.obtain();
                        p82Var.e = ViewConfiguration.get(p82Var.a.getContext()).getScaledMaximumFlingVelocity();
                    } else {
                        velocityTracker.clear();
                    }
                    jg7Var.e = 4;
                    jg7Var.f(true);
                    if (jg7Var.f != 0) {
                        p82Var.c.s0();
                    }
                    long j = p82Var.h;
                    MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                    p82Var.d.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    break;
                }
                break;
            case 4:
                ((z89) this.b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public jw1(Transition transition, wv wvVar) {
        this.a = 2;
        this.c = transition;
        this.b = wvVar;
    }
}
