package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v89 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final LottieAnimationView v;
    public final LinearLayout w;
    public final MyketTextView x;
    public final LoadingView y;
    public final MyketTextView z;

    public v89(ea1 ea1Var, View view, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, MyketTextView myketTextView, LoadingView loadingView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = lottieAnimationView;
        this.w = linearLayout;
        this.x = myketTextView;
        this.y = loadingView;
        this.z = myketTextView2;
    }
}
