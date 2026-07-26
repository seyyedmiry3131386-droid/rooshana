package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o23 extends a79 {
    public final MyketRatingBar A;
    public final ConstraintLayout B;
    public final View C;
    public final AppIconView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final ConstraintLayout y;
    public final BigTextButton z;

    public o23(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, MyketTextView myketTextView2, ConstraintLayout constraintLayout, BigTextButton bigTextButton, MyketRatingBar myketRatingBar, ConstraintLayout constraintLayout2, View view2) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = constraintLayout;
        this.z = bigTextButton;
        this.A = myketRatingBar;
        this.B = constraintLayout2;
        this.C = view2;
    }
}
