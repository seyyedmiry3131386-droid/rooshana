package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.loadingindicator.LoadingIndicator;
import ir.mservices.market.views.BigEmptyOvalButton;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qn2 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final Group A;
    public final MyketTextView v;
    public final LottieAnimationView w;
    public final LoadingIndicator x;
    public final BigEmptyOvalButton y;
    public final BigFillOvalButton z;

    public qn2(ea1 ea1Var, View view, MyketTextView myketTextView, LottieAnimationView lottieAnimationView, LoadingIndicator loadingIndicator, BigEmptyOvalButton bigEmptyOvalButton, BigFillOvalButton bigFillOvalButton, Group group) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = lottieAnimationView;
        this.x = loadingIndicator;
        this.y = bigEmptyOvalButton;
        this.z = bigFillOvalButton;
        this.A = group;
    }
}
