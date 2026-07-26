package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.movie.download.MovieDownloadButton;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.FlowLayoutView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j15 extends a79 {
    public final MovieDownloadButton A;
    public final FlowLayoutView B;
    public final MyketTextView C;
    public final MyketTextView D;
    public final AvatarImageView E;
    public final View F;
    public final MyketTextView G;
    public final FlowLayoutView H;
    public final ImageView v;
    public final ImageView w;
    public final BigFillOvalButton x;
    public final FrameLayout y;
    public final ConstraintLayout z;

    public j15(ea1 ea1Var, View view, ImageView imageView, ImageView imageView2, BigFillOvalButton bigFillOvalButton, FrameLayout frameLayout, ConstraintLayout constraintLayout, MovieDownloadButton movieDownloadButton, FlowLayoutView flowLayoutView, MyketTextView myketTextView, MyketTextView myketTextView2, AvatarImageView avatarImageView, View view2, MyketTextView myketTextView3, FlowLayoutView flowLayoutView2) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = imageView2;
        this.x = bigFillOvalButton;
        this.y = frameLayout;
        this.z = constraintLayout;
        this.A = movieDownloadButton;
        this.B = flowLayoutView;
        this.C = myketTextView;
        this.D = myketTextView2;
        this.E = avatarImageView;
        this.F = view2;
        this.G = myketTextView3;
        this.H = flowLayoutView2;
    }
}
