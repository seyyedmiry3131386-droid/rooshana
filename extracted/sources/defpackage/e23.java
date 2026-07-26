package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e23 extends a79 {
    public final MyketAdInfoView v;
    public final ConstraintLayout w;
    public final MyketTextView x;

    public e23(ea1 ea1Var, View view, MyketAdInfoView myketAdInfoView, ConstraintLayout constraintLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketAdInfoView;
        this.w = constraintLayout;
        this.x = myketTextView;
    }
}
