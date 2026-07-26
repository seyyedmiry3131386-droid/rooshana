package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ed5 extends a79 {
    public final SmallBoldTextButton v;
    public final ImageView w;
    public final View x;
    public final ConstraintLayout y;
    public final MyketTextView z;

    public ed5(ea1 ea1Var, View view, SmallBoldTextButton smallBoldTextButton, ImageView imageView, View view2, ConstraintLayout constraintLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = smallBoldTextButton;
        this.w = imageView;
        this.x = view2;
        this.y = constraintLayout;
        this.z = myketTextView;
    }
}
