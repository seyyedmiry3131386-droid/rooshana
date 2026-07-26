package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigFillRectangleButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PikaReceiveView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rm2 extends a79 {
    public final BigFillRectangleButton A;
    public final AppIconView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final PikaReceiveView y;
    public final ConstraintLayout z;

    public rm2(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, MyketTextView myketTextView2, PikaReceiveView pikaReceiveView, ConstraintLayout constraintLayout, BigFillRectangleButton bigFillRectangleButton) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = pikaReceiveView;
        this.z = constraintLayout;
        this.A = bigFillRectangleButton;
    }
}
