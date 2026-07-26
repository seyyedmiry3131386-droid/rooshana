package defpackage;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.core.analytics.ViewEventBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class tx5 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LottieAnimationView b;

    public /* synthetic */ tx5(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        this.b = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                js3.p(animator, "animation");
                this.b.setVisibility(8);
                break;
            default:
                js3.p(animator, "animation");
                this.b.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                js3.p(animator, "animation");
                ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
                viewEventBuilder.b("social_birthday_finish");
                viewEventBuilder.a();
                this.b.setVisibility(8);
                break;
            default:
                js3.p(animator, "animation");
                ViewEventBuilder viewEventBuilder2 = new ViewEventBuilder();
                viewEventBuilder2.b("social_birthday_finish");
                viewEventBuilder2.a();
                this.b.setVisibility(8);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
        }
        js3.p(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                js3.p(animator, "animation");
                ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
                viewEventBuilder.b("social_birthday_play");
                viewEventBuilder.a();
                break;
            default:
                js3.p(animator, "animation");
                ViewEventBuilder viewEventBuilder2 = new ViewEventBuilder();
                viewEventBuilder2.b("social_birthday_play");
                viewEventBuilder2.a();
                break;
        }
    }
}
