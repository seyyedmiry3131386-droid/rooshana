package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rz8 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final BigTextButton v;
    public final MyketRatingBar w;
    public final ConstraintLayout x;

    public rz8(ea1 ea1Var, View view, BigTextButton bigTextButton, MyketRatingBar myketRatingBar, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = bigTextButton;
        this.w = myketRatingBar;
        this.x = constraintLayout;
    }
}
