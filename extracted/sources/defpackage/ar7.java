package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketSwitch;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ar7 extends a79 {
    public final MyketSwitch v;
    public final View w;
    public final ConstraintLayout x;
    public final MyketTextView y;
    public final MyketTextView z;

    public ar7(ea1 ea1Var, View view, MyketSwitch myketSwitch, View view2, ConstraintLayout constraintLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = myketSwitch;
        this.w = view2;
        this.x = constraintLayout;
        this.y = myketTextView;
        this.z = myketTextView2;
    }
}
