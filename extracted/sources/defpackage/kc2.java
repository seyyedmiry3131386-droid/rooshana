package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kc2 extends a79 {
    public final FrameLayout v;
    public final View w;
    public final ConstraintLayout x;
    public final ConstraintLayout y;

    public kc2(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = constraintLayout;
        this.y = constraintLayout2;
    }
}
