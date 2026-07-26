package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.transition.Transition;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 5:
                ((a80) this.b).d();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                hk hkVar = (hk) this.b;
                ArrayList arrayList = new ArrayList(hkVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((s80) arrayList.get(i)).a(hkVar);
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.P(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                mx1 mx1Var = (mx1) this.b;
                mx1Var.p();
                mx1Var.r.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) this.b).b = null;
                break;
            case 5:
                ((a80) this.b).e();
                break;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.b).l = null;
                break;
            case 7:
                ((HideViewOnScrollBehavior) this.b).l = null;
                break;
            case 8:
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                pj4 pj4Var = (pj4) this.b;
                pj4Var.b.setTranslationY(0.0f);
                pj4Var.c(0.0f);
                break;
            case 11:
                View view = (View) this.b;
                if (view != null) {
                    view.setVisibility(0);
                }
                break;
            case 12:
                js3.p(animator, "animation");
                cf5 cf5Var = (cf5) this.b;
                cf5Var.z.setAlpha(1.0f);
                LottieAnimationView lottieAnimationView = cf5Var.y;
                js3.o(lottieAnimationView, "statusChangeAnimation");
                lottieAnimationView.setVisibility(8);
                break;
            case 13:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.z(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 14:
                ((Transition) this.b).m();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 8:
                super.onAnimationRepeat(animator);
                h74 h74Var = (h74) this.b;
                h74Var.f = (h74Var.f + 1) % h74Var.e.e.length;
                h74Var.g = true;
                break;
            case 9:
                super.onAnimationRepeat(animator);
                wa4 wa4Var = (wa4) this.b;
                l38 l38Var = wa4Var.e;
                int i = wa4Var.a + 1;
                wa4Var.a = i;
                l38Var.a(i);
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                hk hkVar = (hk) this.b;
                ArrayList arrayList = new ArrayList(hkVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((s80) arrayList.get(i)).b(hkVar);
                }
                break;
            case 5:
                ((a80) this.b).f(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
