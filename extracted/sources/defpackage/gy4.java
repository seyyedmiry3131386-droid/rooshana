package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gy4 extends a79 {
    public final ConstraintLayout v;
    public final SmallBoldTextButton w;
    public final MyketTextView x;
    public final MyketTextView y;

    public gy4(ea1 ea1Var, View view, ConstraintLayout constraintLayout, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = smallBoldTextButton;
        this.x = myketTextView;
        this.y = myketTextView2;
    }
}
