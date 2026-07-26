package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AlphaAnimationView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b53 extends a79 {
    public final LinearLayout v;
    public final ConstraintLayout w;
    public final AlphaAnimationView x;
    public final MyketTextView y;
    public final SmallBoldTextButton z;

    public b53(ea1 ea1Var, View view, LinearLayout linearLayout, ConstraintLayout constraintLayout, AlphaAnimationView alphaAnimationView, MyketTextView myketTextView, SmallBoldTextButton smallBoldTextButton) {
        super(0, view, ea1Var);
        this.v = linearLayout;
        this.w = constraintLayout;
        this.x = alphaAnimationView;
        this.y = myketTextView;
        this.z = smallBoldTextButton;
    }
}
