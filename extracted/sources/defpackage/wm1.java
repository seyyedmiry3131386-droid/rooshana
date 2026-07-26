package defpackage;

import android.view.View;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wm1 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final MyketTextView x;
    public final MyketInputLayout y;
    public final MyketEditText z;

    public wm1(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView2, MyketInputLayout myketInputLayout, MyketEditText myketEditText) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = myketTextView2;
        this.y = myketInputLayout;
        this.z = myketEditText;
    }
}
