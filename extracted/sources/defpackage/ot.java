package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ot extends a79 {
    public final ConstraintLayout v;
    public final ImageView w;
    public final MyketTextView x;
    public final MyketTextView y;

    public ot(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = imageView;
        this.x = myketTextView;
        this.y = myketTextView2;
    }
}
