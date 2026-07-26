package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.FlowLayoutView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i65 extends a79 {
    public final FrameLayout v;
    public final FlowLayoutView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final MyketTextView z;

    public i65(ea1 ea1Var, View view, FrameLayout frameLayout, FlowLayoutView flowLayoutView, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = flowLayoutView;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = myketTextView3;
    }
}
