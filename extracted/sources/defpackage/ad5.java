package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ad5 extends a79 {
    public final LottieAnimationView v;
    public final ConstraintLayout w;
    public final MyketTextView x;

    public ad5(ea1 ea1Var, View view, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = lottieAnimationView;
        this.w = constraintLayout;
        this.x = myketTextView;
    }
}
