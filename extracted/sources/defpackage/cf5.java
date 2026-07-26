package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cf5 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final MyketTextView v;
    public final LoadingView w;
    public final AppCompatImageView x;
    public final LottieAnimationView y;
    public final AppCompatImageView z;

    public cf5(ea1 ea1Var, View view, MyketTextView myketTextView, LoadingView loadingView, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView2) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = loadingView;
        this.x = appCompatImageView;
        this.y = lottieAnimationView;
        this.z = appCompatImageView2;
    }
}
