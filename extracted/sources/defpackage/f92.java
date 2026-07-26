package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillBorderOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f92 extends a79 {
    public final ImageView A;
    public final CardView B;
    public final ConstraintLayout C;
    public final LoadingView D;
    public final SmallFillBorderOvalButton v;
    public final ConstraintLayout w;
    public final ImageButton x;
    public final MyketTextView y;
    public final ImageButton z;

    public f92(ea1 ea1Var, View view, SmallFillBorderOvalButton smallFillBorderOvalButton, ConstraintLayout constraintLayout, ImageButton imageButton, MyketTextView myketTextView, ImageButton imageButton2, ImageView imageView, CardView cardView, ConstraintLayout constraintLayout2, LoadingView loadingView) {
        super(0, view, ea1Var);
        this.v = smallFillBorderOvalButton;
        this.w = constraintLayout;
        this.x = imageButton;
        this.y = myketTextView;
        this.z = imageButton2;
        this.A = imageView;
        this.B = cardView;
        this.C = constraintLayout2;
        this.D = loadingView;
    }
}
