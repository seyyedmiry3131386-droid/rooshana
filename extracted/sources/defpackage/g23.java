package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g23 extends a79 {
    public final MyketAdInfoView v;
    public final ConstraintLayout w;
    public final SmallBoldTextButton x;
    public final MyketTextView y;

    public g23(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, ConstraintLayout constraintLayout, SmallBoldTextButton smallBoldTextButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = constraintLayout;
        this.x = smallBoldTextButton;
        this.y = myketTextView;
    }
}
