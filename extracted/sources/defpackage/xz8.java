package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.MyMarketView;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xz8 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final RelativeLayout A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final ImageView v;
    public final MyMarketView w;
    public final MyketRecentDownloadView x;
    public final LottieAnimationView y;
    public final ImageView z;

    public xz8(ea1 ea1Var, View view, ImageView imageView, MyMarketView myMarketView, MyketRecentDownloadView myketRecentDownloadView, LottieAnimationView lottieAnimationView, ImageView imageView2, RelativeLayout relativeLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = myMarketView;
        this.x = myketRecentDownloadView;
        this.y = lottieAnimationView;
        this.z = imageView2;
        this.A = relativeLayout;
        this.B = myketTextView;
        this.C = myketTextView2;
    }
}
