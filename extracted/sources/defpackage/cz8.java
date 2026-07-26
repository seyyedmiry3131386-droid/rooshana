package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cz8 extends a79 {
    public final MyketTextView A;
    public final ConstraintLayout B;
    public final MyketTextView C;
    public final MyketTextView D;
    public final FrameLayout v;
    public final ImageView w;
    public final MyketTextView x;
    public final FrameLayout y;
    public final MyketTextView z;

    public cz8(ea1 ea1Var, View view, FrameLayout frameLayout, ImageView imageView, MyketTextView myketTextView, FrameLayout frameLayout2, MyketTextView myketTextView2, MyketTextView myketTextView3, ConstraintLayout constraintLayout, MyketTextView myketTextView4, MyketTextView myketTextView5) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = imageView;
        this.x = myketTextView;
        this.y = frameLayout2;
        this.z = myketTextView2;
        this.A = myketTextView3;
        this.B = constraintLayout;
        this.C = myketTextView4;
        this.D = myketTextView5;
    }
}
