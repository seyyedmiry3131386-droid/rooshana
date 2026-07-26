package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s55 extends a79 {
    public final ConstraintLayout v;
    public final SmallBoldTextButton w;
    public final MyketTextView x;

    public s55(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketTextView myketTextView, SmallBoldTextButton smallBoldTextButton) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = smallBoldTextButton;
        this.x = myketTextView;
    }
}
