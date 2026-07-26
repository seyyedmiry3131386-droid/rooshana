package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q07 extends a79 {
    public final LoadingView A;
    public final ImageView B;
    public final DefaultTimeBar C;
    public final MyketTextView D;
    public final LoadingView E;
    public final View F;
    public final Group G;
    public final MyketTextView H;
    public final LottieAnimationView I;
    public final MyketTextView J;
    public final PlayerView K;
    public final AvatarImageView L;
    public final Group M;
    public final MyketTextView N;
    public final Group O;
    public final ShimmerFrameLayout P;
    public final w17 Q;
    public final LottieAnimationView R;
    public final View v;
    public final LottieAnimationView w;
    public final View x;
    public final PlayerControlView y;
    public final MyketTextView z;

    public q07(ea1 ea1Var, View view, View view2, LottieAnimationView lottieAnimationView, View view3, PlayerControlView playerControlView, MyketTextView myketTextView, LoadingView loadingView, ImageView imageView, DefaultTimeBar defaultTimeBar, MyketTextView myketTextView2, LoadingView loadingView2, View view4, Group group, MyketTextView myketTextView3, LottieAnimationView lottieAnimationView2, MyketTextView myketTextView4, PlayerView playerView, AvatarImageView avatarImageView, Group group2, MyketTextView myketTextView5, Group group3, ShimmerFrameLayout shimmerFrameLayout, w17 w17Var, LottieAnimationView lottieAnimationView3) {
        super(1, view, ea1Var);
        this.v = view2;
        this.w = lottieAnimationView;
        this.x = view3;
        this.y = playerControlView;
        this.z = myketTextView;
        this.A = loadingView;
        this.B = imageView;
        this.C = defaultTimeBar;
        this.D = myketTextView2;
        this.E = loadingView2;
        this.F = view4;
        this.G = group;
        this.H = myketTextView3;
        this.I = lottieAnimationView2;
        this.J = myketTextView4;
        this.K = playerView;
        this.L = avatarImageView;
        this.M = group2;
        this.N = myketTextView5;
        this.O = group3;
        this.P = shimmerFrameLayout;
        this.Q = w17Var;
        this.R = lottieAnimationView3;
    }
}
