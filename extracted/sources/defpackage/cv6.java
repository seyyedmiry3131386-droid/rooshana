package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cv6 extends a79 {
    public final ConstraintLayout v;
    public final MyketRatingBar w;
    public final MyketTextView x;

    public cv6(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketRatingBar myketRatingBar, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketRatingBar;
        this.x = myketTextView;
    }
}
