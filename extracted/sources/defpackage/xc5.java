package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xc5 extends a79 {
    public final MyketTextView v;
    public final ConstraintLayout w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final ImageView z;

    public xc5(ea1 ea1Var, View view, MyketTextView myketTextView, ConstraintLayout constraintLayout, MyketTextView myketTextView2, MyketTextView myketTextView3, ImageView imageView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = constraintLayout;
        this.x = myketTextView2;
        this.y = myketTextView3;
        this.z = imageView;
    }
}
