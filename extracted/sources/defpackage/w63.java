package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w63 extends a79 {
    public final MyketTextView v;
    public final ConstraintLayout w;
    public final ImageView x;
    public final MyketTextView y;

    public w63(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = constraintLayout;
        this.x = imageView;
        this.y = myketTextView2;
    }
}
