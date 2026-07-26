package ir.mservices.market.social.profile.own;

import android.view.animation.Animation;
import ir.mservices.market.social.profile.own.OwnProfileAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {
    public final /* synthetic */ OwnProfileFragment a;

    public a(OwnProfileFragment ownProfileFragment) {
        this.a = ownProfileFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = OwnProfileFragment.d1;
        OwnProfileFragment ownProfileFragment = this.a;
        OwnProfileViewModel ownProfileViewModelM1 = ownProfileFragment.m1();
        Integer num = (Integer) ownProfileFragment.m1().x.a.getValue();
        ownProfileViewModelM1.r(new OwnProfileAction.TabAction(num != null ? num.intValue() : 0));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
