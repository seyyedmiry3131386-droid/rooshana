package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ml2 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final ConstraintLayout A;
    public final MyketTextView v;
    public final MyketInputLayout w;
    public final DialogButtonComponent x;
    public final BindAutoCompleteView y;
    public final MyketTextView z;

    public ml2(ea1 ea1Var, View view, MyketTextView myketTextView, MyketInputLayout myketInputLayout, DialogButtonComponent dialogButtonComponent, BindAutoCompleteView bindAutoCompleteView, MyketTextView myketTextView2, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketInputLayout;
        this.x = dialogButtonComponent;
        this.y = bindAutoCompleteView;
        this.z = myketTextView2;
        this.A = constraintLayout;
    }
}
