package ir.mservices.market.common.base;

import android.view.animation.Animation;
import defpackage.es6;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Animation.AnimationListener {
    public final /* synthetic */ BaseContentFragment a;

    public a(BaseContentFragment baseContentFragment) {
        this.a = baseContentFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        BaseContentFragment baseContentFragment = this.a;
        baseContentFragment.L0 = true;
        ir.mservices.market.version2.core.utils.a.c(baseContentFragment, baseContentFragment.K().getInteger(es6.standard_fast_spatial_duration), new BaseContentFragment$onCreateAnimation$1$onAnimationStart$1(baseContentFragment, null));
    }
}
