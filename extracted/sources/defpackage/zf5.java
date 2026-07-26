package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zf5 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final LinearLayout x;
    public final MyketTextView y;
    public final LottieAnimationView z;

    public zf5(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, LinearLayout linearLayout, MyketTextView myketTextView2, LottieAnimationView lottieAnimationView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = linearLayout;
        this.y = myketTextView2;
        this.z = lottieAnimationView;
    }
}
