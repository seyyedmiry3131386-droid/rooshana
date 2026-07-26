package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mc extends a79 {
    public final BigTextButton v;
    public final View w;
    public final ConstraintLayout x;
    public final ImageView y;
    public final MyketTextView z;

    public mc(ea1 ea1Var, View view, BigTextButton bigTextButton, View view2, ConstraintLayout constraintLayout, ImageView imageView, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = bigTextButton;
        this.w = view2;
        this.x = constraintLayout;
        this.y = imageView;
        this.z = myketTextView;
    }
}
