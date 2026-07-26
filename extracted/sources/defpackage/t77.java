package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponentVertical;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t77 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final MyketTextView v;
    public final DialogButtonComponentVertical w;
    public final ImageView x;
    public final ConstraintLayout y;
    public final MyketTextView z;

    public t77(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponentVertical dialogButtonComponentVertical, ImageView imageView, ConstraintLayout constraintLayout, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponentVertical;
        this.x = imageView;
        this.y = constraintLayout;
        this.z = myketTextView2;
    }
}
