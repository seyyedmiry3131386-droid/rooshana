package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h4 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final DialogHeaderComponent A;
    public final MyketTextView B;
    public final MyketTextView C;
    public final DialogButtonComponent v;
    public final View w;
    public final MyketEditText x;
    public final MyketInputLayout y;
    public final LinearLayout z;

    public h4(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, View view2, MyketEditText myketEditText, MyketInputLayout myketInputLayout, LinearLayout linearLayout, DialogHeaderComponent dialogHeaderComponent, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = view2;
        this.x = myketEditText;
        this.y = myketInputLayout;
        this.z = linearLayout;
        this.A = dialogHeaderComponent;
        this.B = myketTextView;
        this.C = myketTextView2;
    }
}
