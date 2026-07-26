package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j5 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final ConstraintLayout A;
    public final MyketTextView B;
    public final MyketEditText C;
    public final DialogButtonComponent v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final ConstraintLayout z;

    public j5(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MyketTextView myketTextView4, MyketEditText myketEditText) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = myketTextView3;
        this.z = constraintLayout;
        this.A = constraintLayout2;
        this.B = myketTextView4;
        this.C = myketEditText;
    }
}
