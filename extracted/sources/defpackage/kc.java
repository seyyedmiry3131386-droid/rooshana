package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kc extends a79 {
    public final MyketTextView A;
    public final SmallFillOvalButton v;
    public final View w;
    public final ConstraintLayout x;
    public final ImageView y;
    public final MyketTextView z;

    public kc(ea1 ea1Var, View view, SmallFillOvalButton smallFillOvalButton, View view2, ConstraintLayout constraintLayout, ImageView imageView, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = smallFillOvalButton;
        this.w = view2;
        this.x = constraintLayout;
        this.y = imageView;
        this.z = myketTextView;
        this.A = myketTextView2;
    }
}
