package ir.mservices.market.social.profile.user;

import android.view.animation.Animation;
import ir.mservices.market.social.profile.user.UserProfileAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {
    public final /* synthetic */ UserProfileFragment a;

    public a(UserProfileFragment userProfileFragment) {
        this.a = userProfileFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = UserProfileFragment.c1;
        UserProfileFragment userProfileFragment = this.a;
        UserProfileViewModel userProfileViewModelM1 = userProfileFragment.m1();
        Integer num = (Integer) userProfileFragment.m1().x.a.getValue();
        userProfileViewModelM1.r(new UserProfileAction.TabAction(num != null ? num.intValue() : 0));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
