package defpackage;

import android.view.View;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d5 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final MyketEditText A;
    public final DialogHeaderComponent B;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final View x;
    public final MyketTextView y;
    public final MyketInputLayout z;

    public d5(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, View view2, MyketTextView myketTextView2, MyketInputLayout myketInputLayout, MyketEditText myketEditText, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = view2;
        this.y = myketTextView2;
        this.z = myketInputLayout;
        this.A = myketEditText;
        this.B = dialogHeaderComponent;
    }
}
