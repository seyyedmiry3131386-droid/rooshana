package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PikaReceiveView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sw6 extends a79 {
    public final AppIconView v;
    public final MyketTextView w;
    public final ConstraintLayout x;
    public final MyketTextView y;
    public final PikaReceiveView z;

    public sw6(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, ConstraintLayout constraintLayout, MyketTextView myketTextView2, PikaReceiveView pikaReceiveView) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = constraintLayout;
        this.y = myketTextView2;
        this.z = pikaReceiveView;
    }
}
