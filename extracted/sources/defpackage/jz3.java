package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jz3 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final MyketTextView A;
    public final MyketEditText B;
    public final DialogButtonComponent v;
    public final MyketTextView w;
    public final MyketEditText x;
    public final MyketTextView y;
    public final LinearLayout z;

    public jz3(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView, MyketEditText myketEditText, MyketTextView myketTextView2, LinearLayout linearLayout, MyketTextView myketTextView3, MyketEditText myketEditText2) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = myketTextView;
        this.x = myketEditText;
        this.y = myketTextView2;
        this.z = linearLayout;
        this.A = myketTextView3;
        this.B = myketEditText2;
    }
}
