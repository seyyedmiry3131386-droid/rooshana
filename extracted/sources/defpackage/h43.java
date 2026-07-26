package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h43 extends a79 {
    public final ConstraintLayout v;
    public final MyketTextView w;
    public final SmallBoldTextButton x;

    public h43(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketTextView myketTextView, SmallBoldTextButton smallBoldTextButton) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketTextView;
        this.x = smallBoldTextButton;
    }
}
