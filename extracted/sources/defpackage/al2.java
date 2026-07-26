package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.mservices.market.views.TryAgainView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class al2 extends a79 {
    public static final /* synthetic */ int I = 0;
    public final MyketTextView A;
    public final View B;
    public final SmallBoldTextButton C;
    public final MyketTextView D;
    public final MyketTextView E;
    public final TryAgainView F;
    public final LottieAnimationView G;
    public final View H;
    public final AppIconView v;
    public final BigFillOvalButton w;
    public final Group x;
    public final ImageView y;
    public final View z;

    public al2(ea1 ea1Var, View view, AppIconView appIconView, BigFillOvalButton bigFillOvalButton, Group group, ImageView imageView, View view2, MyketTextView myketTextView, View view3, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView2, MyketTextView myketTextView3, TryAgainView tryAgainView, LottieAnimationView lottieAnimationView, View view4) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = bigFillOvalButton;
        this.x = group;
        this.y = imageView;
        this.z = view2;
        this.A = myketTextView;
        this.B = view3;
        this.C = smallBoldTextButton;
        this.D = myketTextView2;
        this.E = myketTextView3;
        this.F = tryAgainView;
        this.G = lottieAnimationView;
        this.H = view4;
    }
}
