package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g07 extends a79 {
    public final LottieAnimationView A;
    public final MyketTextView B;
    public final LoadingView C;
    public final View D;
    public final Group E;
    public final MyketTextView F;
    public final LottieAnimationView G;
    public final PlayerView H;
    public final MyketTextView I;
    public final ConstraintLayout J;
    public final Group K;
    public final ShimmerFrameLayout L;
    public final w17 M;
    public final MyketTextView N;
    public final MyketTextView O;
    public final MyketTextView v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final MyketTextView z;

    public g07(ea1 ea1Var, View view, MyketTextView myketTextView, View view2, View view3, ImageView imageView, MyketTextView myketTextView2, LottieAnimationView lottieAnimationView, MyketTextView myketTextView3, LoadingView loadingView, View view4, Group group, MyketTextView myketTextView4, LottieAnimationView lottieAnimationView2, PlayerView playerView, MyketTextView myketTextView5, ConstraintLayout constraintLayout, Group group2, ShimmerFrameLayout shimmerFrameLayout, w17 w17Var, MyketTextView myketTextView6, MyketTextView myketTextView7) {
        super(1, view, ea1Var);
        this.v = myketTextView;
        this.w = view2;
        this.x = view3;
        this.y = imageView;
        this.z = myketTextView2;
        this.A = lottieAnimationView;
        this.B = myketTextView3;
        this.C = loadingView;
        this.D = view4;
        this.E = group;
        this.F = myketTextView4;
        this.G = lottieAnimationView2;
        this.H = playerView;
        this.I = myketTextView5;
        this.J = constraintLayout;
        this.K = group2;
        this.L = shimmerFrameLayout;
        this.M = w17Var;
        this.N = myketTextView6;
        this.O = myketTextView7;
    }
}
