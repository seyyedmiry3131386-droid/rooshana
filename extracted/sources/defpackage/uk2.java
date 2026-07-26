package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uk2 extends a79 {
    public static final /* synthetic */ int E = 0;
    public final MyketTextView A;
    public final TryAgainView B;
    public final LottieAnimationView C;
    public final View D;
    public final ImageView v;
    public final MyketTextView w;
    public final View x;
    public final SmallBoldTextButton y;
    public final MyketTextView z;

    public uk2(ea1 ea1Var, View view, ImageView imageView, MyketTextView myketTextView, View view2, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView2, MyketTextView myketTextView3, TryAgainView tryAgainView, LottieAnimationView lottieAnimationView, View view3) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = myketTextView;
        this.x = view2;
        this.y = smallBoldTextButton;
        this.z = myketTextView2;
        this.A = myketTextView3;
        this.B = tryAgainView;
        this.C = lottieAnimationView;
        this.D = view3;
    }
}
