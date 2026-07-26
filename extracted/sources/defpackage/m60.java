package defpackage;

import android.animation.Animator;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.views.MultiSelectTitleView;

/* JADX INFO: loaded from: classes3.dex */
public final class m60 implements Animator.AnimatorListener {
    public final /* synthetic */ MultiSelectTitleView a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BaseContentFragment c;

    public m60(MultiSelectTitleView multiSelectTitleView, boolean z, BaseContentFragment baseContentFragment) {
        this.a = multiSelectTitleView;
        this.b = z;
        this.c = baseContentFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        js3.p(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        js3.p(animator, "animation");
        int i = this.b ? 0 : 8;
        MultiSelectTitleView multiSelectTitleView = this.a;
        multiSelectTitleView.setVisibility(i);
        this.c.h1(multiSelectTitleView.getVisibility() == 0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        js3.p(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        js3.p(animator, "animation");
    }
}
