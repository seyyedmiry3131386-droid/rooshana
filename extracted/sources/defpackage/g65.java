package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g65 extends a79 {
    public final ConstraintLayout v;
    public final FrameLayout w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final MyketTextView z;

    public g65(ea1 ea1Var, View view, ConstraintLayout constraintLayout, FrameLayout frameLayout, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = frameLayout;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = myketTextView3;
    }
}
