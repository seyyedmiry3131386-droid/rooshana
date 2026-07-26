package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.myMarket.MyMarketRecyclerListFragment;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.securityShield.SecurityShieldViewModel;
import ir.mservices.market.version2.fragments.SplashScreenFragment;
import ir.mservices.market.version2.fragments.base.BaseDraggableFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.CircleClipTapView;
import ir.mservices.market.version2.ui.recycler.holder.a;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class rj implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        String str;
        switch (this.a) {
            case 0:
            case 1:
            case 3:
                return;
            case 2:
            case 7:
                str = "animation";
                break;
            case 4:
            case 5:
            case 8:
                str = "animator";
                break;
            case 6:
                str = "p0";
                break;
            default:
                return;
        }
        js3.p(animator, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DialogDataModel dialogDataModel;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bp2) obj).invoke();
                break;
            case 1:
                break;
            case 2:
                js3.p(animator, "animation");
                CircleClipTapView circleClipTapView = (CircleClipTapView) obj;
                if (!circleClipTapView.m) {
                    circleClipTapView.getPerformAtEnd().invoke();
                }
                break;
            case 3:
                ((LaunchContentActivity) obj).o1.setImageBitmap(null);
                break;
            case 4:
                js3.p(animator, "animator");
                ((a) obj).x.setVisibility(8);
                break;
            case 5:
                js3.p(animator, "animator");
                int i2 = MyMarketRecyclerListFragment.r1;
                ((MyMarketRecyclerListFragment) obj).W1();
                break;
            case 6:
                js3.p(animator, "p0");
                FragmentActivity fragmentActivityF = ((SearchFragment) obj).F();
                LaunchContentActivity launchContentActivity = fragmentActivityF instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivityF : null;
                if (launchContentActivity != null) {
                    launchContentActivity.u1.setVisibility(8);
                }
                break;
            case 7:
                js3.p(animator, "animation");
                SecurityShieldViewModel securityShieldViewModel = (SecurityShieldViewModel) obj;
                securityShieldViewModel.K = null;
                securityShieldViewModel.w();
                break;
            case 8:
                js3.p(animator, "animator");
                SplashScreenFragment splashScreenFragment = (SplashScreenFragment) obj;
                Bundle bundle = splashScreenFragment.g;
                if (bundle != null && (dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class)) != null) {
                    dialogDataModel.d = DialogResult.a;
                    FragmentActivity fragmentActivityF2 = splashScreenFragment.F();
                    am2 am2Var = fragmentActivityF2 instanceof am2 ? (am2) fragmentActivityF2 : null;
                    if (am2Var != null) {
                        am2Var.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
                    }
                    break;
                }
                break;
            default:
                ((View) obj).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        switch (this.a) {
            case 0:
            case 1:
            case 3:
                return;
            case 2:
            case 7:
                str = "animation";
                break;
            case 4:
            case 5:
            case 8:
                str = "animator";
                break;
            case 6:
                str = "p0";
                break;
            default:
                return;
        }
        js3.p(animator, str);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                u60 u60Var = ((BaseDraggableFragment) this.b).V0;
                js3.m(u60Var);
                u60Var.w.setVisibility(0);
                break;
            case 2:
                js3.p(animator, "animation");
                ((CircleClipTapView) this.b).setVisibility(0);
                break;
            case 3:
                ir.mservices.market.core.ext.a.i((LaunchContentActivity) this.b);
                break;
            case 4:
                js3.p(animator, "animator");
                break;
            case 5:
                js3.p(animator, "animator");
                break;
            case 6:
                js3.p(animator, "p0");
                FragmentActivity fragmentActivityF = ((SearchFragment) this.b).F();
                LaunchContentActivity launchContentActivity = fragmentActivityF instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivityF : null;
                if (launchContentActivity != null) {
                    launchContentActivity.u1.setVisibility(0);
                }
                break;
            case 7:
                js3.p(animator, "animation");
                break;
            case 8:
                js3.p(animator, "animator");
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }
}
