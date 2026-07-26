package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j46 extends a79 {
    public final MyketTextView A;
    public final CardView v;
    public final View w;
    public final MyketTextView x;
    public final ImageView y;
    public final ImageView z;

    public j46(ea1 ea1Var, View view, CardView cardView, View view2, MyketTextView myketTextView, ImageView imageView, ImageView imageView2, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = cardView;
        this.w = view2;
        this.x = myketTextView;
        this.y = imageView;
        this.z = imageView2;
        this.A = myketTextView2;
    }
}
