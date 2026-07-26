package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyMarketView;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uh7 extends a79 {
    public static final /* synthetic */ int J = 0;
    public final FrameLayout A;
    public final MyketTextView B;
    public final ImageView C;
    public final View D;
    public final MyMarketView E;
    public final MyketRecentDownloadView F;
    public final MyketEditText G;
    public final View H;
    public final ConstraintLayout I;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public final LottieAnimationView y;
    public final ImageView z;

    public uh7(ea1 ea1Var, View view, ImageView imageView, ImageView imageView2, View view2, LottieAnimationView lottieAnimationView, ImageView imageView3, FrameLayout frameLayout, MyketTextView myketTextView, ImageView imageView4, View view3, MyMarketView myMarketView, MyketRecentDownloadView myketRecentDownloadView, MyketEditText myketEditText, View view4, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = imageView2;
        this.x = view2;
        this.y = lottieAnimationView;
        this.z = imageView3;
        this.A = frameLayout;
        this.B = myketTextView;
        this.C = imageView4;
        this.D = view3;
        this.E = myMarketView;
        this.F = myketRecentDownloadView;
        this.G = myketEditText;
        this.H = view4;
        this.I = constraintLayout;
    }
}
