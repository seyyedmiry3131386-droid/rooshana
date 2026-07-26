package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e53 extends a79 {
    public final View A;
    public final RelativeLayout v;
    public final ConstraintLayout w;
    public final MyketTextView x;
    public final ImageView y;
    public final SmallBoldTextButton z;

    public e53(ea1 ea1Var, View view, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, MyketTextView myketTextView, ImageView imageView, SmallBoldTextButton smallBoldTextButton, View view2) {
        super(0, view, ea1Var);
        this.v = relativeLayout;
        this.w = constraintLayout;
        this.x = myketTextView;
        this.y = imageView;
        this.z = smallBoldTextButton;
        this.A = view2;
    }
}
