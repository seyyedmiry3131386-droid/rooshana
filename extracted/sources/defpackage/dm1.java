package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dm1 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final DialogHeaderComponent x;
    public final ConstraintLayout y;

    public dm1(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, DialogHeaderComponent dialogHeaderComponent, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = dialogHeaderComponent;
        this.y = constraintLayout;
    }
}
