package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.FlowLayoutView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l05 extends a79 {
    public final FlowLayoutView v;
    public final ConstraintLayout w;
    public final MyketTextView x;

    public l05(ea1 ea1Var, View view, FlowLayoutView flowLayoutView, ConstraintLayout constraintLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = flowLayoutView;
        this.w = constraintLayout;
        this.x = myketTextView;
    }
}
