package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class un8 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final ImageView v;
    public final ConstraintLayout w;
    public final ImageView x;
    public final SmallFillOvalButton y;
    public final MyketTextView z;

    public un8(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, SmallFillOvalButton smallFillOvalButton, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = constraintLayout;
        this.x = imageView2;
        this.y = smallFillOvalButton;
        this.z = myketTextView;
    }
}
