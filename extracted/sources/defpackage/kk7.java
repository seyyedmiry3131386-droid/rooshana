package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.views.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class kk7 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ br2 b;

    public /* synthetic */ kk7(br2 br2Var, int i) {
        this.a = i;
        this.b = br2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                js3.p(animation, "animation");
                ((SearchView) this.b).getBinding().D.setVisibility(8);
                break;
            case 1:
                js3.p(animation, "animation");
                SearchView searchView = (SearchView) this.b;
                searchView.getBinding().C.setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(600L);
                alphaAnimation.setAnimationListener(new kk7(searchView, 0));
                searchView.getBinding().D.startAnimation(alphaAnimation);
                break;
            default:
                km2 km2Var = ((ReelsFragment) this.b).a1;
                js3.m(km2Var);
                km2Var.w.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.a) {
            case 0:
            case 1:
                js3.p(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                js3.p(animation, "animation");
                break;
            case 1:
                js3.p(animation, "animation");
                SearchView.r = true;
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }
}
