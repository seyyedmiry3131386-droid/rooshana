package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.social.profile.own.OwnProfileFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class qx5 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OwnProfileFragment b;

    public /* synthetic */ qx5(OwnProfileFragment ownProfileFragment, int i) {
        this.a = i;
        this.b = ownProfileFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        LottieAnimationView lottieAnimationView;
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                View view = this.b.b1;
                if (view != null) {
                    view.setVisibility(zBooleanValue ? 0 : 8);
                }
                break;
            default:
                ((Boolean) obj).getClass();
                vb0 vb0Var = this.b.Z0;
                if (vb0Var != null && (lottieAnimationView = vb0Var.v) != null) {
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.setAnimation(qs6.balloon);
                    lottieAnimationView.f();
                    lottieAnimationView.h.b.addListener(new tx5(lottieAnimationView, 0));
                }
                break;
        }
        return tx8.a;
    }
}
