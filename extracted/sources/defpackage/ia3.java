package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ia3 extends a79 {
    public final MyketTextView A;
    public final MyketTextView B;
    public final CardView v;
    public final ImageView w;
    public final MyketTextView x;
    public final CardView y;
    public final ImageView z;

    public ia3(ea1 ea1Var, View view, CardView cardView, ImageView imageView, MyketTextView myketTextView, CardView cardView2, ImageView imageView2, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = cardView;
        this.w = imageView;
        this.x = myketTextView;
        this.y = cardView2;
        this.z = imageView2;
        this.A = myketTextView2;
        this.B = myketTextView3;
    }
}
