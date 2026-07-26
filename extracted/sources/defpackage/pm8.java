package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pm8 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final ConstraintLayout v;
    public final LottieAnimationView w;
    public final MyketTextView x;

    public pm8(ea1 ea1Var, View view, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = lottieAnimationView;
        this.x = myketTextView;
    }
}
